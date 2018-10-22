import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String playerMark = "X";
    public static final String computerMark = "O";
    static int numOfPlays = 0;
    List<Integer> alreadyFilled = new ArrayList<Integer>();

    public static boolean isPlayerTurn = true;
    static boolean playerWon = false;
    static boolean computerWon = false;

    public static tictactoe board = new tictactoe();
    ComputerPlayer cp = new ComputerPlayer();

    public static void main(String [] args) {
        if(!board.isVisible())
            board.setVisible(true);
    }

    public static void verifyEndGame(String mark) {
        numOfPlays ++;

        if(board.button1.getText().equals(mark)){
              if(board.button2.getText().equals(mark) &&
                      board.button3.getText().equals(mark)){
                    board.showWinner(mark);
              }
              if(board.button5.getText().equals(mark) &&
                      board.button9.getText().equals(mark)){
                  board.showWinner(mark);
              }
              if(board.button4.getText().equals(mark) &&
                      board.button7.getText().equals(mark)){
                  board.showWinner(mark);
              }
        }

        if(board.button2.getText().equals(mark) &&
                board.button5.getText().equals(mark) &&
                board.button8.getText().equals(mark)){
            board.showWinner(mark);
        }

        if(board.button3.getText().equals(mark)){
            if(board.button6.getText().equals(mark) &&
                    board.button9.getText().equals(mark)){
                board.showWinner(mark);
            }
            if(board.button5.getText().equals(mark) &&
                    board.button7.getText().equals(mark)){
                board.showWinner(mark);
            }
        }

        if(board.button4.getText().equals(mark) &&
                board.button5.getText().equals(mark) &&
                board.button6.getText().equals(mark)){
            board.showWinner(mark);
        }

        if(board.button7.getText().equals(mark) &&
                board.button8.getText().equals(mark) &&
                board.button9.getText().equals(mark)){
            board.showWinner(mark);
        }

        if(numOfPlays >= 9) {
            board.showWinner("draw");
        }


    }

    public void finishGame() {
        this.board.setVisible(false);
        System.exit(0);
    }

}


