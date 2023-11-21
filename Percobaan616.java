package Jobsheet13;

import java.util.Scanner;

public class Percobaan616 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang ");
        p = input.nextInt();
        System.out.print("Masukkan Lebar ");
        l = input.nextInt();
        System.out.print("Masukkan Tinggi ");
        t = input.nextInt();

        L = p*l;
        System.out.print("Luas Persegi Panjang adalah " + L);
        System.out.println();
        vol = p*l*t;
        System.out.print("Volume Balok adalah " + vol);
    }
}
