package Jobsheet13;
import java.util.Scanner;

public class FungsiNilai16 {
    static final int jum_mahasiswa = 5;
    static final int jum_minggu = 7;

    static int[][] nilaiMahasiswa = new int[jum_mahasiswa][jum_minggu];
    static String[] namaMahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

    public static void main(String[] args) {
        inputDataNilai();
        tampilkanNilai();
        cariHariNilaiTertinggi();
        tampilkanMahasiswaNilaiTertinggi();
    }

    static void inputDataNilai() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < jum_mahasiswa; i++) {
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < jum_minggu; j++) {
                System.out.print("Minggu ke " + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilkanNilai() {
        System.out.println("\n================================================================================================");
        System.out.println("|                                      Data Nilai Mahasiswa                                    |");
        System.out.println("================================================================================================");
        System.out.printf("| %-15s |", "Nama Mahasiswa");
        for (int j = 0; j < jum_minggu; j++) {
            System.out.printf(" Minggu %d |", j + 1);
        }
        System.out.println("\n================================================================================================");

        for (int i = 0; i < jum_mahasiswa; i++) {
            System.out.printf("| %-15s |", namaMahasiswa[i]);
            for (int j = 0; j < jum_minggu; j++) {
                System.out.printf(" %-8d |", nilaiMahasiswa[i][j]);
            }
            System.out.println();
        }

        System.out.println("================================================================================================");
    }

    static void cariHariNilaiTertinggi() {
        int hariTertinggi = 0;
        int nilaiTertinggi = nilaiMahasiswa[0][0];

        for (int j = 1; j < jum_minggu; j++) {
            for (int i = 0; i < jum_mahasiswa; i++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    hariTertinggi = j;
                }
            }
        }

        System.out.println("\nNilai tertinggi terdapat pada minggu ke-" + (hariTertinggi + 1));
    }

    static void tampilkanMahasiswaNilaiTertinggi() {
        int mahasiswaTertinggi = 0;
        int nilaiTertinggi = nilaiMahasiswa[0][0];

        for (int i = 1; i < jum_mahasiswa; i++) {
            if (nilaiMahasiswa[i][0] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i][0];
                mahasiswaTertinggi = i;
            }
        }

        System.out.println("\nMahasiswa dengan nilai tertinggi: " + namaMahasiswa[mahasiswaTertinggi]);
        System.out.println("Detail nilai:");

        System.out.println("\n================================================================================================");
        System.out.printf("| %-15s |", "Nama Mahasiswa");
        for (int j = 0; j < jum_minggu; j++) {
            System.out.printf(" Minggu %d |", j + 1);
        }
        System.out.println("\n================================================================================================");

        System.out.printf("| %-15s |", namaMahasiswa[mahasiswaTertinggi]);
        for (int j = 0; j < jum_minggu; j++) {
            System.out.printf(" %-8d |", nilaiMahasiswa[mahasiswaTertinggi][j]);
        }
        System.out.println("\n================================================================================================");
    }
}