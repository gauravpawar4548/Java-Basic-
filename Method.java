

public class Methods {
    public static void main(String[] args) {


       // this method access to MethodA class
        System.out.println("Addition of two number");
         System.out.println(MethodA.sum(4,7));

        System.out.println("subtraction of two number");
         System.out.println(MethodA.sub(4,5));

        System.out.println("Multiplication of two number");
         System.out.println(MethodA.multi(3,6));

        System.out.println("Division of two Number");
        System.out.println(MethodA.div(100,10));

          //sum of array
        System.out.println("addition of Array by using one method");
        int  [] a={5,2,3,4,5,8};
        sumOfArrays(a);

        System.out.println("addition of array second");
        int [] b ={3,4,5,6,7};
        sumOfArrays(b);

        //non static method call static method create object
        Methods method = new Methods();
        System.out.println("Division two number ");
        System.out.println(method.div(8,2));


          //this is method overloading same name,same return type but different parameter
        System.out.println("method Overloading");
        System.out.println(add(4,6));
        System.out.println(add(4,5,6));



    }

     //method of sum of array by using any array
    public static  void sumOfArrays(int [] arr){
        int c = 0;
        for(int i:arr)
        {
            c +=1;
        }
       System.out.println(c);
   }

   //non static method
    public int div(int d,int c)
    {
        return d/c;
    }

    private static int add(int a,int b){
        return a+b;
    }
    private  static int add(int a,int b,int c){
        return a+b+c;
    }


}



//MethodA Class




public  class MethodA {


    public static int sum(int a,int b){
        return a+b;
    }

    public static int sub(int c,int d){
        return c-d;
    }

    public static int multi(int a,int b){
        return a*b;
    }

    public static int div(int c,int d){
        return c/d;
    }


}

