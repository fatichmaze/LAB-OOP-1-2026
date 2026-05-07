package no1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LibraryLogger {

    private List<String[]> logs = new ArrayList<>();

    DateTimeFormatter format =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // log peminjaman
    public void logBorrow(String title, String member) {

        String borrowTime =
                LocalDateTime.now().format(format);

        String[] data = {
            borrowTime,
            title,
            member,
            "-"
        };

        logs.add(data);
    }

    // log pengembalian
    public void logReturn(String title, String member) {

        String returnTime =
                LocalDateTime.now().format(format);

        for (String[] log : logs) {

            if (log[1].equals(title)
                    && log[2].equals(member)
                    && log[3].equals("-")) {

                log[3] = returnTime;
                break;
            }
        }
    }

    public String getLogs() {

        String result = "";

        result += "+---------------------+------------------------------+---------------+---------------------+\n";
        result += "| Dipinjam pada      | Judul                       | Member       | Dikembalikan pada |\n";
        result += "+---------------------+------------------------------+---------------+---------------------+\n";

        for (String[] log : logs) {

            result += String.format(
                    "| %-19s | %-28s | %-12s | %-19s |\n",
                    log[0],
                    log[1],
                    log[2],
                    log[3]
            );
        }

        result += "+---------------------+------------------------------+---------------+---------------------+\n";

        return result;
    }

    public void clearLogs() {
        logs.clear();
    }
}