package Jobsheet13;

public class TerimaKasih_16_P2 {
    public static void UcapanTerimaKasih() {
        System.out.println("Thank you for being the best teacher in the world.\n" + 
        "You inspired in me a love for learning and made me fell like I could ask yaou anything ");
    }
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapan = "Terima Kasih Pak... Bu... Semoga Sehat Selalu";
        UcapanTambahan(ucapan);
    }
}