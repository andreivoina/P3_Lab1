public class Application {

    private InputDevice inputDevice;
    private OutputDevice outputDevice;

    public Application(InputDevice inputDevice, OutputDevice outputDevice) {
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
    }

    public void playGame() {

        int player1Wins = 0;
        int player2Wins = 0;

        while (player1Wins < 5 && player2Wins < 5) {
            int player1Number = inputDevice.nextInt();
            int player2Number = inputDevice.nextInt();

            outputDevice.writeMessage("Player 1 picked " + player1Number);
            outputDevice.writeMessage("Player 2 picked " + player2Number);

            if (player1Number == player2Number) {
                outputDevice.writeMessage("Both players picked the same number, each gets 2 points");
                player1Wins += 2;
                player2Wins += 2;
            } else {
                int higherNumber = Math.max(player1Number, player2Number);
                int smallerNumber = Math.min(player1Number, player2Number);

                if (higherNumber % smallerNumber == 0 && smallerNumber >= 10) {
                    outputDevice.writeMessage("Smaller number " + smallerNumber + " wins because it is a factor of the higher number " + higherNumber);
                    if (smallerNumber == player1Number)
                        player1Wins++;
                    else
                        player2Wins++;
                } else {
                    outputDevice.writeMessage("Higher number " + higherNumber + " wins the round.");
                    if (higherNumber == player1Number)
                        player1Wins++;
                    else
                        player2Wins++;
                }
            }
        }
        outputDevice.writeMessage("Current score: Player 1 - " + player1Wins + " | Player 2 - " + player2Wins);
    }

    public void run(){

        outputDevice.writeMessage("Application started");
        playGame();
    }
}