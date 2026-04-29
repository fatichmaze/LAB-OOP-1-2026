package No1;

public class KaryawanKontrak extends Karyawan {
    Double upahPerHari;

    public KaryawanKontrak (String nama, String idKaryawan, Double upahPerHari){
        super(nama, idKaryawan);
        this.upahPerHari = upahPerHari;
    }

    public double hitungGaji(){
      double total = upahPerHari * getKehadiran(); 

      if(getKehadiran()>20){
        total += 500000;
      }

      return total;
    }

}
