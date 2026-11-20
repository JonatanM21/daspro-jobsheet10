//p = 17
//elemen dasar array (B) 20 + (P mod 60) = 37  
import java.util.Arrays;

public class SortNilai17 {
    public static void main(String[] args) { 
        
        int[] nilai = {37, 52, 29, 67, 17, 42};
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nilai));
    }
}
