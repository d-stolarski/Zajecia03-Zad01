public class TelevisorTest {
    public static void main(String[] args) {

        Televisor tel = new Televisor();

        tel.showStatus();
        tel.turnOn();
        tel.showStatus();
        tel.turnoff();
        tel.showStatus();
    }
}
