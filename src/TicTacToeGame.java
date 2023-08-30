public class TicTacToeGame
{
    // create class variables here....
    private String square1, square2, square3, square4, square5;
    private String square6, square7, square8, square9;

    private String whichPlayer;
    private boolean keepPlaying;

    /**
     * Constructor
     */
    public TicTacToeGame()
    {
        square1 = "1";
        square2 = "2";
        square3 = "3";
        square4 = "4";
        square5 = "5";
        square6 = "6";
        square7 = "7";
        square8 = "8";
        square9 = "9";
        whichPlayer = "X";
        keepPlaying = true;
    }

    /**
     * handles the main game loop.
     */
    public void playGame()
    {
        //print the board
        System.out.println(square1+"|"+square2+"|"+square3);
        System.out.println("-+-+-");
        System.out.println(square4+"|"+square5+"|"+square6);
        System.out.println("-+-+-");
        System.out.println(square7+"|"+square8+"|"+square9);

        //loop until the game is over.
        while (keepPlaying)
        {
            // say which player (X or O) is next.
            System.out.println("Hey, Player "+whichPlayer+", it's your turn!");

            // loop until we get a good answer...
                // ask which square they want
                // check whether it is legal...

            // change the square

            // print the board again
            System.out.println(square1 + "|" + square2 + "|" + square3);
            System.out.println("-+-+-");
            System.out.println(square4 + "|" + square5 + "|" + square6);
            System.out.println("-+-+-");
            System.out.println(square7 + "|" + square8 + "|" + square9);
            // check if somebody won

            // switch players
            if (whichPlayer.equals("X"))
            {
                whichPlayer="O";
            }
            else
            {
                whichPlayer="X";
            }
        }
    }

}
