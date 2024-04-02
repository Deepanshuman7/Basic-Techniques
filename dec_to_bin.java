import java.util.*;
public class dec_to_bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int ans =0;
        int place_value = 1;
        while(n>0){
            int remainder = n%i;
            ans = ans + remainder*place_value;
            place_value = place_value*10;
            n = n/i;
        }
        System.out.println("the binary form is : " + ans);
   }
}
