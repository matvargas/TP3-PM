public class Main {

    public static final String playerMark = "X";
    public static final String computerMark = "O";

    public static boolean isPlayerTurn = true;
    static boolean playerWon = false;
    static boolean computerWon = false;

    public static tictactoe board = new tictactoe();

    public static void main(String [] args) {
        if(!board.isVisible())
            board.setVisible(true);
    }

    public static void verifyEndGame(String mark) {
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

    }

}


