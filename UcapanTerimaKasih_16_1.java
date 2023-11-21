package Jobsheet13;
import java.util.Scanner;
public class UcapanTerimaKasih_16_1 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" + 
        "You inspired in me a love for learning and made me fell like I could ask yaou anything. ");
    }
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapan = "Thank you for guiding me, I wish you good health.";
        UcapanTambahan(ucapan);
    }
}