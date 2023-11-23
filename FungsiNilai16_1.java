package Jobsheet13;
import java.util.Scanner;

public class FungsiNilai16_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jum_mahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jum_tugas = scanner.nextInt();

        int[][] nilaiMahasiswa = new int[jum_mahasiswa][jum_tugas];
        String[] namaMahasiswa = new String[jum_mahasiswa];

        inputDataMahasiswa(scanner, jum_mahasiswa, jum_tugas, namaMahasiswa, nilaiMahasiswa);

        tampilkanNilaiMahasiswa(jum_mahasiswa, jum_tugas, namaMahasiswa, nilaiMahasiswa);

        scanner.close();
    }

    static void inputDataMahasiswa(Scanner scanner, int jum_mahasiswa, int jum_tugas, String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        for (int i = 0; i < jum_mahasiswa; i++) {
            scanner.nextLine(); 
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();
            for (int j = 0; j < jum_tugas; j++) {
                System.out.print("Masukkan nilai tugas ke-" + (j + 1) + " untuk " + namaMahasiswa[i] + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
    }

    static void tampilkanNilaiMahasiswa(int jum_mahasiswa, int jum_tugas, String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        System.out.println("\n=========================================================================================");
        System.out.println("|                                      Data Nilai Mahasiswa                             |");
        System.out.println("=========================================================================================");
        System.out.printf("| %-15s |", "Nama Mahasiswa");
        for (int j = 0; j < jum_tugas; j++) {
            System.out.printf(" Tugas %d |", j + 1);
        }
        System.out.println("\n=========================================================================================");

        for (int i = 0; i < jum_mahasiswa; i++) {
            System.out.printf("| %-15s |", namaMahasiswa[i]);
            for (int j = 0; j < jum_tugas; j++) {
                System.out.printf(" %-7d |", nilaiMahasiswa[i][j]);
            }
            System.out.println();
        }

        System.out.println("=========================================================================================");
    }
}