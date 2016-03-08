package com.practise;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.print("Enter factorial no:");

        int n =Integer.parseInt(s.next());
        try {
            System.out.println("Factorial is:" + new Factorial().fact(n));
           }
        catch(Exception e)
        {

            System.out.println("Enter positive number number");
        }

    }
}


class Factorial{
    int fact=1;
    public int fact(int n)throws Exception
    {
        if(n>=0) {
            int fact = 1;
            if (n == 0)
                return fact;
            else {
                fact = n * fact(n - 1);
                return fact;
            }
        }
        else
        {
           throw new Exception();

        }



    }
}