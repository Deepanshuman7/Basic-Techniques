import java.util.*;
public class bin_to_dec {
    public static void bintodec(int binnum){
        int mynum = binnum;
        int pow = 0;
        int decnum = 0;
        
        while(binnum > 0){
            int lastdigit = binnum % 10;
           decnum = decnum + (lastdigit * (int)Math.pow(2, pow));
        
        pow++;
        binnum = binnum / 10;
        }
        System.out.println("decimal value of mynum is :" + decnum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bintodec(n);
        
    }    
}
