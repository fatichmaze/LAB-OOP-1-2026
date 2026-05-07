package no1;

class Book extends LibraryItem {
      String author;

      public Book(String title, int itemId, String author) {
            super(title, itemId);
            this.author = author;
      }

      @Override
      public String getDescription() {
            return "Buku " + title + " oleh " + author + ", ID: " + itemId;
      }

      @Override
      public String borrowItem(int days) {
            if (days > 14) {
                  throw new IllegalArgumentException("Maksimal 14 hari");
            }
            if (isBorrowed) {
                  throw new IllegalArgumentException("Item sudah dipinjam");
            }
            isBorrowed = true;
            return "Item " + title + " berhasil dipinjam selama " + days + " hari";
      }

      @Override
      public double calculateFine(int daysLate) {
            return daysLate * 10000;
      }
}
