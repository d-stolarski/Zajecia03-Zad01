public class Televisor {
    boolean isOnOrOff;

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