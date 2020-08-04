package labexe1;

import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class concatenate {
    
    public static void main(String[] args) 
    {
        int n;
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter the value of n");
        n=obj.nextInt();
        String result="";
        
        for(int i=1;i<=n;i++)
        {
            result=result+i+"";
        }
        System.out.println(result);
    }
    
}

    
