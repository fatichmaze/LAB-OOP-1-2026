package No2;

public class Main {

    public static void main(String[] args) {
        SmartLamp lampu =
                new SmartLamp("Philips", 20);

        SmartCCTV cctv =
                new SmartCCTV("Xiaomi", 50);

        SmartSpeaker speaker =
                new SmartSpeaker("JBL", 40);


        System.out.println("=== Smart Lamp ===");
        lampu.cekFungsi();
        lampu.infoPower();
        lampu.prosesPerintah("tes");

        System.out.println("\n=== Smart CCTV ===");
        cctv.cekFungsi();
        cctv.infoPower();
        cctv.hubungkanWiFi();

        System.out.println("\n=== Smart Speaker ===");
        speaker.cekFungsi();
        speaker.infoPower();
        speaker.hubungkanWiFi();
        speaker.prosesPerintah("Putar Musik");
    }
}