package no1;
import java.util.ArrayList;
import java.util.List;

public class Member {
    String name;
    int memberId;
    List<LibraryItem> borrowedItems;

    public Member (String name, int memberId){
        this.name = name;
        this.memberId = memberId;
        borrowedItems = new ArrayList<>();
    }
 
    public String borrow (LibraryItem item, int days){
        if(item.isBorrowed()){
            throw new IllegalStateException("Item sudah dipinjam");
        }
        String result = item.borrowItem(days);
        borrowedItems.add(item);
        return result;
    }

    public String returnItem(LibraryItem item, int daysLate){
        borrowedItems.remove(item);
        double denda = item.calculateFine(daysLate);
        String result = item.returnItem();
        return result + " dengan denda: Rp" + denda;
    }

    public void getBorrowedItems(){
        if(borrowedItems.isEmpty()){
            System.out.println("Tidak ada item yang dipinjam");
        } else {
            
            for(LibraryItem item : borrowedItems){
                System.out.println(item.getDescription());
            }
        }
    }
}
