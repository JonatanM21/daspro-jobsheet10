// p = 17
// jumlah item dipesan 2 + (P mod 4) = 3
// indeks menu yang wajib dipesan P mod 7 = 4
import java.util.Scanner;

public class KafeKampus17 {
    public static void main(String[] args) {
        Scanner JONATAN = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
        "TehTarik", "Cappucino", "Chocolate Ice"};
        
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000}; 

        System.out.print("Masukkan Menu yang anda mau :");
        String Pmenu = JONATAN.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(Pmenu)) {
                System.out.println("Menu " + Pmenu + " ditemukan");
                System.out.println("Harga Menu : Rp." + harga[i] );
                ditemukan = true;
                break;
            }
        } 
        if (!ditemukan) {
            System.out.println("Menu " + Pmenu + " Tidak di temukan");
        }
        System.out.print("Masukkan jumlah menu yang anda pesan: ");
        int jumlah = JONATAN.nextInt();
        JONATAN.nextLine();
        
        String[] pesanan = new String[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {

            System.out.print("Masukkan menu pesanan ke-" + (i + 1) + ": ");
            String nama = JONATAN.nextLine();
            ditemukan = false;

            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(nama)) {
                    pesanan[i] = menu[j];
                    total += harga[j];

                    ditemukan = true;
                    break;
                }
            }
        }
        System.out.println("==================================");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i]);
        }
        System.out.println("Total biaya pesanan : Rp." + total);
    }
    
}
