public class DompetDigital {
    private String pin;
    private double saldo;

    protected String idNasabah;
    protected String namaNasabah;

    float biayaAdmin = 2500;

    public DompetDigital(String idNasabah, String namaNasabah, String pin) {
        this.idNasabah = idNasabah;
        this.namaNasabah = namaNasabah;

        if (pin.length() == 6) {
            this.pin = pin;
        } else {
            System.out.println("PIN harus terdiri dari 6 karakter");
            this.pin = "000000";
        }

        this.saldo = 0;
        log("Akun e-wallet dibuat untuk nasabah: " + this.namaNasabah);
    }

    public String getIdNasabah() {
        return idNasabah;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean setPin(String pinLama, String pinBaru) {
        if (!this.pin.equals(pinLama)) {
            System.out.println("Gagal: PIN lama tidak sesuai.");
            log("  Gagal mengubah PIN - PIN lama tidak sesuai");
            return false;
        }
        if (pinBaru == null || pinBaru.length() != 6) {
            System.out.println("Perubahan PIN ditolak: PIN baru harus terdiri dari 6 karakter.");
            log("Gagal mengubah PIN - panjang karakter tidak sesuai syarat.");
            return false;
        }
        this.pin = pinBaru;
        System.out.println("PIN Berhasil diubah");
        log("Ubah PIN berhasil.");
        return true;
    }

    public void setorTunai(double nominal) {
        if (nominal <= 0) {
            System.out.println("Setor tunai ditolak: Nominal harus lebih dari 0.");
            log("Setor tunai gagal - nominal tidak valid.");
            return;
        }
        saldo += nominal;
        System.out.println("Setor tunai berhasil sebesar Rp" + nominal);
        log("Setor tunai berhasil sebesar Rp" + nominal);
    }

    public void tarikTunai(double nominal, String inputPin) {
        if (!this.pin.equals(inputPin)) {
            System.out.println("Tarik tunai ditolak: PIN salah.");
            log("Tarik tunai gagal - PIN salah");
            return;
        }

        if (nominal <= 0) {
            System.out.println("Tarik tunai ditolak: Nominal tidak valid.");
            log("Tarik tunai gagal - nominal tidak valid");
            return;
        }
        double totalPenarikan = nominal + biayaAdmin;

        if (totalPenarikan > saldo) {
            System.out.println("Tarik tunai ditolak: Saldo tidak cukup. ");
            log("Tarik tunai gagal - saldo tidak mencukupi");
            return;
        }

        saldo -= totalPenarikan;
        System.out.println("Tarik tunai berhasil sebesar Rp" + nominal + "dengan biaya admin Rp" + biayaAdmin);
        log("Tarik tunai berhasil sebesar Rp" + nominal);
    }

    private void log(String pesan) {
        System.out.println("[LOG] " + pesan);
    }

}
