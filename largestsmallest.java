/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexe1;

import java.util.Scanner;

public class largestsmallest 
{
    
public static void main(String[] args) 
{
    int s = 0;
    int l = 0;
    int num;
    System.out.println("Enter the number:");
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    num = obj.nextInt();
    s = num;
    for (int i =1; i < n; i++) 
    {
        num = obj.nextInt();
        if (num > l) {
            l = num;
        }
        if (num < s) {
            s = num;
        }
    }
    System.out.println("Largest no is:" + l);
    System.out.println("Smallest no is : " + s);
}
    
}