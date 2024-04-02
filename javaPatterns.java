public class javaPatterns {
    public static void palindrome(int n){
      //outer loop
      for(int i=1; i<=n; i++){
      //inner loop
      //for spaces = n-i
      for(int j =1; j<= (n-i); j++) {
        System.out.print(" ");
      }
      //for numbers 
      //for descending
      for(int j =i; j>=1; j--) {
        System.out.print(j);
      }
      //for ascending
      for(int j =2; j<=i; j++) {
        System.out.print(j);
      } 
      System.out.println();
      }
    }
  public static void main (String args[]) {
    palindrome(3);
  }
}