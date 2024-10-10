import java.util.Random;

public class InputDevice {

    public String getType() {
        return "random";
    }

    public int nextInt() {
        Random random = new Random();
        return random.nextInt(100) + 1; // nextInt(100) generates a number from 0 to 99, so add 1 to make it 1 to 100
    }
}