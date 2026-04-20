public class Main {
    public static void main(String[] args) {

        DompetDigital dompet = new DompetDigital(
                "ID001",
                "Zahrah",
                "123456"
        );

        System.out.println("\n=== INFORMASI AKUN ===");
        
        System.out.println("ID Nasabah   : " + dompet.getIdNasabah());
        System.out.println("Nama Nasabah : " + dompet.getNamaNasabah());
        System.out.println("Saldo Awal   : Rp" + dompet.getSaldo());

        System.out.println("\n=== UJI UBAH PIN (SALAH) ===");
        boolean hasilUbahPinSalah = dompet.setPin("111111", "654321");
        System.out.println("Status Perubahan PIN: " + 
                (hasilUbahPinSalah ? "Berhasil" : "Gagal"));

        
        System.out.println("\n=== UJI UBAH PIN (BENAR) ===");
        boolean hasilUbahPinBenar = dompet.setPin("123456", "654321");
        System.out.println("Status Perubahan PIN: " + 
                (hasilUbahPinBenar ? "Berhasil" : "Gagal"));

        System.out.println("\n=== SETOR TUNAI VALID ===");
        dompet.setorTunai(500000);


        System.out.println("\n=== SETOR TUNAI TIDAK VALID ===");
        dompet.setorTunai(-100000);

        System.out.println("\n=== TARIK TUNAI DENGAN PIN SALAH ===");
        dompet.tarikTunai(100000, "123456"); // PIN lama

        System.out.println("\n=== TARIK TUNAI DENGAN PIN BENAR ===");
        dompet.tarikTunai(100000, "654321"); // PIN baru

        
        System.out.println("\n=== SALDO AKHIR ===");
        System.out.println("Sisa Saldo : Rp" + dompet.getSaldo());
    }
}