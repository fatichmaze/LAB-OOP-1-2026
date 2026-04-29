package No2;

class SmartCCTV extends AbstractPerangkatElektronik
    implements iInteraksiInternet{
        public SmartCCTV (String merk, int dayaListrik){
            super(merk, dayaListrik);
        }
    @Override
    public void cekFungsi(){
        System.out.println("CCTV sedang memantau ");
    }
    @Override
    public void hubungkanWiFi(){
        System.out.println("Mengirim data ke server...");
    }
    }
    
