import java.util.Scanner;

public class Pemesanan2Kafe13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                         "Teh Tarik", "Cappucino", "Chocolate Ice"};
        double[] hargaMenu = {15000, 13000, 12000, 10000, 8000, 12000, 10000};

        System.out.println("=== Daftar Menu Kafe ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-15s Rp%.0f%n", (i + 1), menu[i], hargaMenu[i]);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cari = input.nextLine();

        boolean ditemukan = false;
        int indeksDitemukan = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                indeksDitemukan = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("✅ " + menu[indeksDitemukan] + " tersedia di menu dengan harga Rp" + hargaMenu[indeksDitemukan]);
        } else {
            System.out.println("❌ Maaf, " + cari + " tidak tersedia di menu.");
        }

        if (ditemukan) {
            System.out.print("\nMasukkan jumlah porsi yang ingin dipesan: ");
            int jumlah = input.nextInt();
            double total = hargaMenu[indeksDitemukan] * jumlah;

            System.out.println("\n=== Rincian Pesanan ===");
            System.out.println("Menu     : " + menu[indeksDitemukan]);
            System.out.println("Jumlah   : " + jumlah);
            System.out.println("Total    : Rp" + total);
        }
    }
}
