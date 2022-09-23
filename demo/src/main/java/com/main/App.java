package com.main;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
       
        boolean condt=false;
        do{
        try {
            System.out.print("type  your input:");
            int n= sc.nextInt();
            if(n<1)
                throw new Exception();
            condt = false;
            System.out.println("the number is "+n);
        } catch (Exception e) {
            System.out.println("The number is invalid");
            condt = true;
        }}while(condt);
    }
}
