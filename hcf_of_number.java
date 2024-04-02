import java.util.*; 

public class hcf_of_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int divisior = sc.nextInt();
        int dividend = sc.nextInt();
        int hcf = 0;
        int number1=dividend;
        int number2 = divisior;

       
     while(divisior>0){
        int remainder = dividend%divisior;
          if(remainder==0){
          hcf = divisior; 
          break;
        }
        else{  
             dividend=divisior;
              divisior = remainder;
       }
      
    }
    System.out.println("the common greatest factor is : " + hcf);
    int lcm = (number1*number2)/hcf;
    System.out.println("the lcm of two numbers is : "+ lcm);
    
}

}
