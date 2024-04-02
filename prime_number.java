import java.util.*;

public class prime_number {
    public static boolean isprime (int n){
        Boolean isprime = true;
        for(int i=2; i<= n-1;i++){
            if(n%i==0){
              isprime = false;
              break;
    }
}  
return isprime;
  }
  public static void primesinrange(int x){
    for(int i =2; i<= x-1; i++){
        if (isprime(i)) {
            System.out.println(i);
        }
    }
    System.out.println();
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isprime(n));
        primesinrange(n);
        }
    
}
