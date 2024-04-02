import java.util.*;
public class functions{
    public static int largestElement(int[] arr) {
        int n= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>n){
             n=arr[i];
            }
        }
        return n;
        }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
       largestElement(arr);
        System.out.println(largestElement(arr));
     }
}