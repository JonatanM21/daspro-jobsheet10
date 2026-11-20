
import java.util.Scanner;

public class percontohan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array daftar menu dan harga
        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate Ice"
        };

        int[] harga = {
            15000, 13000, 10000, 12000, 8000, 18000, 20000
        };

        // Menampilkan daftar menu
        System.out.println("==================================");
        System.out.println("       KAFE KAMPUS");
        System.out.println("==================================");

        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i] + " - Rp" + harga[i]);
        }

        System.out.println("==================================");

        // Fitur pencarian menu
        System.out.print("Masukkan nama menu yang dicari: ");
        String cari = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("Menu ditemukan!");
                System.out.println("Nama menu : " + menu[i]);
                System.out.println("Harga     : Rp" + harga[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Menu tidak tersedia.");
        }

        System.out.println("----------------------------------");

        // Fitur pemesanan
        System.out.print("Masukkan jumlah item yang dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] pesanan = new String[jumlah];

        int total = 0;

        for (int i = 0; i < jumlah; i++) {

            System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
            String nama = input.nextLine();

            ditemukan = false;

            // Linear Search untuk validasi pesanan
            for (int j = 0; j < menu.length; j++) {

                if (menu[j].equalsIgnoreCase(nama)) {

                    pesanan[i] = menu[j];
                    total += harga[j];

                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Menu tidak tersedia, silakan ulangi.");

                i--;
            }
        }

        // Menampilkan daftar pesanan
        System.out.println();
        System.out.println("==================================");
        System.out.println("          STRUK PESANAN");
        System.out.println("==================================");

        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i]);
        }

        System.out.println("----------------------------------");
        System.out.println("Total biaya : Rp" + total);
        System.out.println("==================================");
        System.out.println("Terima kasih telah memesan!");

        input.close();
    }
}
