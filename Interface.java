//Interface 

public class TestS {

    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();
        smartphone.makeCall("212323325");
        smartphone.endCall();
        smartphone.call();

        System.out.println();

        System.out.println("camera instruction");
        smartphone.takePhoto();
        smartphone.recordVideo();
        Camera.camera();

        System.out.println("Music instruction");
        smartphone.PlayMusic();
        smartphone.StopMusic();
        smartphone.music();



    }
}






//SmartPhone class implement interface

public class SmartPhone implements Camera,MusicPlayer,Phone {
    @Override
    public void takePhoto() {
        System.out.println("Taking photo with smart phone");
    }

    @Override
    public void recordVideo() {
        System.out.println("record video with smart phone");
    }

    @Override
    public void PlayMusic() {
        System.out.println("Plyaing music on smartphone");
    }

    @Override
    public void StopMusic() {
        System.out.println("Stopping music on smartphone");

    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number+ " from smartphone ");
    }

    @Override
    public void endCall() {
        System.out.println("end calls with smartphone");

    }


}



//
public interface Phone {

   void makeCall(String number);

   void endCall();

      default void call(){
          System.out.println("Great and best smartPhone");

      }


}


//
public interface MusicPlayer {

     void PlayMusic();

     void StopMusic();

   default void music(){
        System.out.println("music enjoy");

   }

   }



//
public interface Camera {

void takePhoto();

void recordVideo();

  public static void camera(){

      System.out.println(" camera is ok done ");
  }
}

