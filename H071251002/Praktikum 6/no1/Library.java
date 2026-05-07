package no1;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Library  {

    private ArrayList<LibraryItem> items;
    private ArrayList<Member> members;
    private LibraryLogger logger;

    public Library() {
        items = new ArrayList<>();
        members = new ArrayList<>();
        logger = new LibraryLogger();
    }

    public String addItem(LibraryItem item) {

        items.add(item);

        return item.title + " berhasil ditambahkan";
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public LibraryItem findItemById(int itemId) {

        for (LibraryItem item : items) {

            if (item.itemId == itemId) {
                return item;
            }
        }

        throw new NoSuchElementException("Item tidak ditemukan");
    }

    public Member findMemberById(int memberId) {

        for (Member member : members) {

            if (member.memberId == memberId) {
                return member;
            }
        }

        throw new NoSuchElementException("Member tidak ditemukan");
    }

    public String getLibraryStatus() {

        String result = "\n=== STATUS PERPUSTAKAAN ===\n";

        for (LibraryItem item : items) {

            String status;

            if (item.isBorrowed()) {
                status = "Dipinjam";
            } else {
                status = "Tersedia";
            }

            result += item.getDescription()
                    + " | Status: "
                    + status + "\n";
        }

        return result;
    }

    public String getAllLogs() {
        return logger.getLogs();
    }

    public LibraryLogger getLogger() {
        return logger;
    }
}
