public class Televisor {
    boolean isOnOrOff;


    Televisor() {
        isOnOrOff = false;
    }

    void turnOn() {
        isOnOrOff = true;
    }

    void turnoff() {
        isOnOrOff = false;
    }

    void showStatus() {
        System.out.println("Telewizor włączony?: " + isOnOrOff);
    }
}