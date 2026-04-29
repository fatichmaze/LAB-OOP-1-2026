package No2;

class SmartSpeaker extends AbstractPerangkatElektronik
    implements iInteraksiInternet, iKontrolSuara{

    public SmartSpeaker (String merk, int dayaListrik){
        super(merk, dayaListrik);
    }
    @Override
    public void cekFungsi(){
        System.out.println("Speaker pintar ");
    }
    @Override
    public void hubungkanWiFi(){
        System.out.println("Speaker terhubung ke WiFi");
    }
    @Override
    public void prosesPerintah (String perintah){
         if(perintah.equals("Putar Musik")) {
            System.out.println("Speaker Menyala!");
        } else {
            System.out.println("Speaker belum dinyalakan.");
        }
    }
    
}
    

