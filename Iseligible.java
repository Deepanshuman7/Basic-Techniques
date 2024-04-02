import java.util.*;
public class Iseligible {
    public static boolean ifVote ( int age) {
        if(age>18){
            return true;
        } else {
            return false;
        }
    } 
    public static void main (String [] args) {
     Scanner sc = new Scanner(System.in);
     int age = sc.nextInt();

     System.out.println(ifVote(age));
    }
}
