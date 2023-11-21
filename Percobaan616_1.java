package Jobsheet13;

import java.util.Scanner;

public class Percobaan616_1 {
    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int Volume = hitungLuas(a,b)*tinggi;
        return Volume; 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;
        System.out.print("Masukkan Panjang ");
        p = input.nextInt();
        System.out.print("Masukkan Lebar ");
        l = input.nextInt();
        System.out.print("Masukkan Tinggi ");
        t = input.nextInt();

        L = hitungLuas(p,l);
        System.out.println("Luas persegi Panjang adalah " + L);
        vol = hitungVolume(t,p,l);
        System.out.println("Volume Balok adalah " + vol);
    }
}