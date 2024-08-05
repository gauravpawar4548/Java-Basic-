
//Method Overriding
public class Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.Metho2();

        B b = new B();
        b.Metho3();

    }

}

  //
    class A {

        public int a;
        public int meth(){
            return 4;
        }

        public void Metho2(){
            System.out.println("This is class A and method 1");
        }

    }



//

    class B extends A{
        @Override
        public void Metho2(){
            System.out.println("This is class A and method 1");
        }
        public void Metho3(){
            System.out.println("This is class B method 3");
        }
    }

