import java.util.*;

public class reverse_of_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        int reverse =0;
        int lastdigit = 0;
        while(n>0){
            lastdigit = n%10;
            reverse = (reverse*10) + lastdigit;
            n=n/10;
        }

        System.out.println("the reversed number is : " + reverse);

    }    
}