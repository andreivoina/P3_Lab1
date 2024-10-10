public class Main {

    public static void main(String[] args) {

        InputDevice device = new InputDevice();

        OutputDevice outputDevice = new OutputDevice();

        Application app = new Application(device, outputDevice);

        app.run();

    }
}