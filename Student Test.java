

public class StudentTest {
    public static void main(String[] args) {
        int id;
        String name;
        int age;

         Student student1 = new Student();

         ///This method are utilit class
//        System.out.println(utilit.state);
//        System.out.println(utilit.value);

        // find  max or min number by ultilit class
//        System.out.println("max number");
//        System.out.println(utilit.max(3,5));

//        System.out.println("min number");
//        System.out.println(utilit.min(4,6));


//       ///this method are Student class
//        System.out.println(Student.getName("gaurav"));
//        System.out.println(Student.schoolName);
           // count
//         System.out.println(Student.count);
//            Student.getCount();
         // addition
//        System.out.println(Student.sum(3,6));   // this call from Student class by using static
          // subtraction
//        System.out.println(Student.subAnInt(8,6));
//

//  // school class object
//        School instance = School.getInstance();
//          System.out.println(School.multiply(3,5));
//
//


        // addition two number for not static method call
  //      StudentTest adding=new StudentTest();
  //       adding.sum(5,5);                          // this  call from this class

        // addition two number static method
         int c=sum(1,2);
         System.out.println(c);           // this  call from this class


        // find square by using static method
             int d=square(2);                    // this is call from this class
           System.out.println(d);




    }
    public static int sum(int a, int b){

        System.out.println(a+b);
        return a+b;


    }
    public static int square(int a){

        return 2*2;
    }

}




