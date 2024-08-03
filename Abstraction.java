
//Abstract

public class Test {
    public static void main(String[] args) {
        AbtractionJava dog = new Dog();
        dog.sayHello();
        Cat cat = new Cat();

        cat.sayHello();
        cat.getprint();


        Dog dog1 = new Dog();
        dog1.readSentence();

        dog.sleep();
        dog1.Dog("sharvil",1);
    }
}



//

public abstract class AbtractionJava {


    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sayHello();

    public void sleep() {
        System.out.println("ZZZZZZZ.....");
    }


}


//

public  class Dog extends AbtractionJava {



    public void sayHello() {
        System.out.println("WOOf");

    }

    public void readSentence(){
        System.out.println("this is dog");
    }

public  Dog(){
    System.out.println(" dog sleep now ");
    }
    public  void Dog(String name,int id){

    }


}



//
public class Cat extends AbtractionJava {


    @Override
    public void sayHello() {
        System.out.println("Mavvvvv");
    }
    public void getprint(){
        System.out.println("Cat ");
    }
}

