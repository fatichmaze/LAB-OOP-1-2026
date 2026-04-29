package No2;

class SmartLamp extends AbstractPerangkatElektronik
        implements iKontrolSuara {

    public SmartLamp(String merk, int dayaListrik) {
        super(merk, dayaListrik);
    }
    @Override
    public void cekFungsi() {
        System.out.println("Lampu pintar siap digunakan");
    }
    @Override
    public void prosesPerintah(String perintah) {

        if(perintah.equals("NYALA")) {
            System.out.println("Lampu berpijar!");
        } else {
            System.out.println("Lampu belum dinyalakan.");
        }
    }
}
