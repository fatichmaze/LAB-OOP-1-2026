package no1;
class DVD extends LibraryItem{
    int duration;

    public DVD (String title, int itemId, int duration){
        super(title, itemId);
        this.duration = duration;
    }
    @Override
    public String getDescription(){
        return "DVD: " +title+ ", durasi " +duration + " menit, ID: " +itemId; 
    }
    @Override
    public String borrowItem (int days){
        if (days > 7){
            throw new IllegalArgumentException ("Peminjaman sudah melebih 7 hari!");
        }
        if (isBorrowed){
            throw new IllegalArgumentException ("Item sudah dipinjam");
        }
        isBorrowed = true;
        return "Item " + title + " berhasil dipinjam selama " + days + " hari";
    }
     @Override
    public double calculateFine(int daysLate) {
        return daysLate * 25000;
    }
}
    