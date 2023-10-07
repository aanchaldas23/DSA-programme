package Javadsa;
import java.util.*;

public class asg1_ques6 {
public static void main(String[]args){
    System.out.println("Enter the number:");
        Scanner z=new Scanner(System.in);
        int n =z.nextInt();
        for(int i=10;n%i!=0;n=n/i){
            System.out.print(n%i);
        }
        if(n!=0) 
        {
            System.out.print(n);
        }
    }
}
