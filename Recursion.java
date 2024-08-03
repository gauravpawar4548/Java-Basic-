package com.example.myFirstProject;



public class Recursion {

    public static void main(String[] args) {

        System.out.println("The value of factorial : " +factorial(5));

        System.out.println("The value of factorial by using iterator : "+factorial_iterator(5));


        System.out.println("sum of natural number :"+sumOfNaturalNumber(4));

        System.out.println("The sum of natural number :" +sumOfNatural(5));

    }



    public static int factorial_iterator(int n)
    {
        int fact =1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
       return fact;

    }


    public static int factorial (int n){

        if(n == 0 || n==1)
        {
            return 1;

        }
        return n * factorial(n-1);
    }

   public static int sumOfNaturalNumber(int n){
       int nature = 0;
       for(int i=0;i<=n;i++)
       {
           nature += i;

        }
       return nature;
   }

   public static int sumOfNatural(int c){
        if(c == 1){
            return 1;
        }
        return c+ sumOfNaturalNumber(c-1);
   }


}
