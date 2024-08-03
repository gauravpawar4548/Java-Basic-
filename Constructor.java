public class Constructor {
    
    
    public static void main(String[] args) {
        
        
        Constructor1 yonstructor = new Constructor1();
        Constructor1 donstructor = new Constructor1("vruta ");

        System.out.println(donstructor.getName());
        System.out.println(yonstructor.getName());
        System.out.println(yonstructor.getSalary());

    }
}
 class Constructor1 {

     private int salary;
     private String name;

     public Constructor1() {
         salary = 35000;
         name = "sharvil";
     }

     public Constructor1(String myname, int mysalary) {
         name = myname;
         salary = mysalary;

     }

     public Constructor1(String mname) {
         salary = 4762875;
         name = mname;

     }


     public int getSalary() {
         return salary;
     }

     public void setSalary(int salary) {
         this.salary = salary;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }
