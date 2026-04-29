package No1;

public class Main {
    public static void main(String[] args) {
        KaryawanTetap Tetap = new KaryawanTetap(
            "Taesan",
            "H071",
            5000000,
            500000
        );

        for (int i = 0; i < 7; i++){
            Tetap.absen();
        }
        
        double gajiTetap = Tetap.hitungGaji(1000000);

        System.out.println("=== Karyawan Tetap ===");
        System.out.println("Nama: " + Tetap.getNama());
        System.out.println("Kehadiran: " +Tetap.getKehadiran());
        System.out.println("Total Gaji:Rp" + gajiTetap);

        KaryawanKontrak kontrak = new KaryawanKontrak("Myungjae", "ID1000", 150000.);
        for (int i = 0; i < 24; i++){
            kontrak.absen();
        }

        double gajiKontrak = kontrak.hitungGaji();

        System.out.println("\n=== Karyawan Kontrak ===");
        System.out.println("Nama: " + kontrak.getNama());
        System.out.println("Kehadiran: " + kontrak.getKehadiran());
        System.out.println("Total Gaji: Rp" + gajiKontrak);


    }
    
}
