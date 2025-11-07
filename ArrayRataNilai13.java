import java.util.Scanner;
public class ArrayRataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0, totalTidakLulus = 0;
        int jmlLulus = 0, jmlTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] >= 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }

        if (jmlLulus > 0) {
            System.out.println("Rata-rata nilai lulus = " + (totalLulus / jmlLulus));
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus.");
        }

        if (jmlTidakLulus > 0) {
            System.out.println("Rata-rata nilai tidak lulus = " + (totalTidakLulus / jmlTidakLulus));
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus.");
        }
    }
}
