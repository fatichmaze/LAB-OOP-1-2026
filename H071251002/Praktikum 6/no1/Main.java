package no1;
import java.util.Scanner;
public class Main {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Library library = new Library();

        while (true) {

            System.out.println("\n=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Item");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Item");
            System.out.println("4. Kembalikan Item");
            System.out.println("5. Lihat Status Perpustakaan");
            System.out.println("6. Lihat Log Aktivitas");
            System.out.println("7. Lihat Item yang Dipinjam Anggota");
            System.out.println("8. Keluar");

            
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();

            input.nextLine();

            try {

                switch (pilih) {

                    case 1:

                        System.out.println("1. Buku");
                        System.out.println("2. DVD");


                        System.out.print("Pilih: ");
                        int jenis = input.nextInt();
                        input.nextLine();

                        System.out.print("Judul: ");
                        String title = input.nextLine();

                        System.out.print("ID: ");
                        int id = input.nextInt();

                        input.nextLine();

                        if (jenis == 1) {

                            System.out.print("Author: ");
                            String author = input.nextLine();

                            Book book =
                                    new Book(title, id, author);

                            System.out.println(
                                    library.addItem(book));

                        } else {

                            System.out.print("Durasi: ");
                            int duration = input.nextInt();

                            DVD dvd =
                                    new DVD(title, id, duration);

                            System.out.println(
                                    library.addItem(dvd));
                        }

                        break;

                    case 2:

                        System.out.print("Nama member: ");
                        String name = input.nextLine();

                        System.out.print("ID member: ");
                        int memberId = input.nextInt();

                        Member member =
                                new Member(name, memberId);

                        library.addMember(member);

                        System.out.println("Member berhasil ditambahkan");

                        break;

                    case 3:

                        System.out.print("ID member: ");
                        int mId = input.nextInt();

                        System.out.print("ID item: ");
                        int itemId = input.nextInt();

                        System.out.print("Jumlah hari: ");
                        int days = input.nextInt();

                        Member m =
                                library.findMemberById(mId);

                        LibraryItem item =
                                library.findItemById(itemId);

                        String result =
                                m.borrow(item, days);

                        System.out.println(result);

                        library.getLogger().logBorrow(
                                item.getTitle(),
                                m.name);

                        break;

                case 4:

                        System.out.print("ID member: ");
                        int memberReturn = input.nextInt();

                        System.out.print("ID item: ");
                        int itemReturn = input.nextInt();

                        System.out.print("Terlambat berapa hari: ");
                        int late = input.nextInt();

                        Member mem =
                                library.findMemberById(memberReturn);

                        LibraryItem returnItem =
                                library.findItemById(itemReturn);

                        String kembali =
                                mem.returnItem(returnItem, late);

                        System.out.println(kembali);

                        library.getLogger().logReturn(
                                returnItem.getTitle(),
                                mem.name);

                        break;

                    case 5:

                        System.out.println(
                                library.getLibraryStatus());

                        break;

                    case 6:

                        System.out.println(
                                library.getAllLogs());

                        break;


                    case 7:

                        System.out.print("ID Member: ");
                        int memberBorrow = input.nextInt();

                        Member memberPinjam = library.findMemberById(memberBorrow);
                        memberPinjam.getBorrowedItems();
                        break;

                    case 8:

                        System.out.println("Program selesai");
                        System.exit(0);

                    default:
                        System.out.println("Menu tidak valid");
                }

            } catch (Exception e) {
                  System.out.println("Error: "
                        + e.getMessage());
            }
        }
    }
}

