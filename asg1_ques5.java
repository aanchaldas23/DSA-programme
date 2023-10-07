package Javadsa;
import java.util.*;

public class asg1_ques5 {
    public static void main(String[] args){
        System.out.println("Enter number n:");
        Scanner z=new Scanner(System.in);
        int q=z.nextInt();
        int count=1;
        for(int i=10;q/i!=0;q=q/i)
        {
            count++;
        }
        System.out.println("The number of digits in the number are :" +count);
    }    
}

