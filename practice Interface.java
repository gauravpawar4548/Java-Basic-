 // practice interface 
public class Hospital {
    public static void main(String[] args) {
        Sedoctor obj = new Sedoctor();
        obj.work();
        obj.name();
        obj.performance();
        obj.disease();
        obj.message();


    }
}

  
// Sedoctor class 

public class Sedoctor extends  Judoctor implements Nurse,Patient,PatientC{

    public void work(){
        System.out.println("senior doctor are work very good");
    }
    public void patient(){
        System.out.println("paitient is happy");
    }

    @Override
    public void performance() {
        System.out.println("very good performance for patient");
    }

    @Override
    public void name() {
        System.out.println("vruta Dhurgule");

    }

    @Override
    public void disease() {
        System.out.println("injured patientC");

    }

}



//Judoctor class

public class Judoctor {

    public void work(){
        System.out.println("junior doctor are not work good");
    }

    public void patient(){
        System.out.println("patient is not happy for junior");
    }

}



//Nurse Interface


public interface Nurse {

     void work();

     void patient();

     private void payment(){
          System.out.println("payment is done patient");
     }
     default void message(){
          System.out.println("patient is clear");
          payment();
     }

}


//Patient Interface

public interface Patient {

    void performance();

    void name();
}


//PatientC Interface

public interface PatientC {

    void name();
    void disease();

}



