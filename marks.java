/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexe1;

import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class marks {
      public static void main(String[] args)
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter your total marks");
    int a =obj.nextInt();
    
    if(a>=90)
        System.out.println("Congrats!Keep it up!");
    else if(a>80 && a<=89)
        System.out.println("Good!Keep trying....");
    else if(a>50 && a<=79)
        System.out.println("Work hard!Try your level best!");
    else
        System.out.println("Work hard and improve your score");
    }
}

    

