import java.util.Scanner;

public class PemesananKafe13{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine(); 

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = input.nextLine();
            System.out.print("Masukkan harga: ");
            hargaPesanan[i] = input.nextDouble();
            input.nextLine(); 
        }

        double totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\n=== Daftar Pesanan ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%d. %s - Rp%.0f%n", (i + 1), namaPesanan[i], hargaPesanan[i]);
        }

        System.out.printf("\nTotal biaya semua pesanan: Rp%.0f%n", totalBiaya);
    }
}
