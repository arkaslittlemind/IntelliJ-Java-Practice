package InterfaceTutorial;

class Phone {
    public void call() {
        System.out.println("Phone call");
    }
    public void sms() {
        System.out.println("Phone sending SMS");
    }
}

interface Camera {
    void click();
    void record();
}

interface MusicPlayer {
    void play();
    void stop();
}

class SmartPhone extends Phone implements Camera, MusicPlayer {
    public void videoCall() {
        System.out.println("Video calling from smartphone");
    }
    public void click() {
        System.out.println("Clicking photo from smartphone");
    }
    public void record() {
        System.out.println("Recording video from smartphone");
    }
    public void play() {
        System.out.println("Playing music from smartphone");
    }
    public void stop() {
        System.out.println("Stopped playing music from smartphone");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        MusicPlayer mp = new SmartPhone();
        mp.play();
        mp.stop();
    }
}
