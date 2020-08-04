
package labexe1;

import java.util.Scanner;


public class prime {
    public static void main (String[] args) 
    {
        int i, n, flag=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter n");
        n=obj.nextInt();
        for(i=2; i<n; i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
            else
                flag=0;
            
                
        }    
        
        if(flag==0)
            System.out.println("prime number");
        else
            System.out.println("Not a prime number");
        
        
    }
    
    
}


    
