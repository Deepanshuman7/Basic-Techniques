public class javaday1 {
  public static void dectobin ( int n) {
    int myNum = n;
    int pow = 0;
    int binNum = 0;

    while(n>0) {
      int rem = n % 2 ;
      binNum = binNum + (rem * (int)Math.pow(10, pow));
      pow++;
      n = n/10;
    }
    System.out.println("binary of " + myNum + " = " + binNum);
  }
  public static void main (String args []) {
    dectobin(5);
  }
}
      