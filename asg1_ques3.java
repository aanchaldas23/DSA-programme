package Javadsa;
import java.util.*;

public class asg_ques3 {
    
    public static void main(String[] args){

        Scanner z=new Scanner(System.in);
        System.out.println("Enter the count of input numbers to be tested: ");
        int a=z.nextInt();
        if(a<10000)
        {
            
            for(int j=1;j<=a;j++)
        {
            System.out.println("Enter number" +j+ " to check prime or not:");
            int q=z.nextInt();
            int count=0;
            for(int d=1;d<=q;d++)
            {
                if(q%d==0)
                {
                    count++;
                }
            }
                if (count==2)
            {
                System.out.println(q+" is a prime number");
            }
                else
            {
                System.out.println(q+ " is not a prime number");
            }
        } 
        }        

    }
    
}
