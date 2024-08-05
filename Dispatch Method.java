
//refference Phone Class And obj SmartPhone

public class PhoneC {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();      //refference phone and obj smartphone
        obj.start();
        obj.system();
        obj.camera();
        obj.music();
       obj.phone();


       SmartPhone obj2 = new SmartPhone();

       obj2.start();
       obj2.camera();


    }
}


// Phone Class

public class Phone {


    public void phone(){
        System.out.println("phone is good ");
    }
    public void start(){
        System.out.println("phone are start on 1 mi");
    }
    public void system(){
        System.out.println("phone system is good");
    }
    public void camera(){
        System.out.println("camera quality is 34 mp");
    }
    public void music(){
        System.out.println("music quality is good phone");
    }

}


//SmartPhone Class

public class SmartPhone extends Phone {

    public void start(){
        System.out.println("smartphone start on 8 second");
    }
    public void system(){
        System.out.println("smartphone System is better");
    }
    public void camera (){
        System.out.println("camera quality is 48mp");
    }
    public void music(){
        System.out.println("music quality is good smartphone");
    }

}


