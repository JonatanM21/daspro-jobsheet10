// p=17
//P ; P+8 ; −(1+(P mod 7)) ; 20+(P mod 15)
// 17 ; 25 ; - 4 ; 22
import java.util.Arrays;

public class ArrayBilangan17 {
    public static void main(String[] args) {

        int[] bil = new int [4];

        bil[0]=17;
        bil[1]=25;
        bil[2]=-4;
        bil[3]=22;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "]=" + bil [i]);        
        }
          for (int nilai : bil) {
                System.out.println(nilai);
            }  
         System.out.println(Arrays.toString(bil));
    }
}