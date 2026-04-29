package No2;

abstract class AbstractPerangkatElektronik {
    String merk;
    int dayaListrik;

    AbstractPerangkatElektronik (String merk, int dayaListrik){
        this.merk = merk;
        this.dayaListrik = dayaListrik;
    }
    public abstract void cekFungsi();
    public void infoPower(){
        System.out.println("Perangkat sedang menyedor daya sebesar " + dayaListrik + " Watt" );
    }
    
}
