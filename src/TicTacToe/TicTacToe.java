package TicTacToe;

public class TicTacToe implements iTicTacToe {
    iBoard board =null;
    iUI ui=null;
    iRules rules=null;
    iPlayer player1 =null; iPlayer player2=null;

    public TicTacToe() {
        board = new Board(3);
        ui    = new UI();

    }

    @Override
    public void startGame() {
        iPlayer currentPlayer = player1;
        iPlayer result = null;


        while (true) {

            if (currentPlayer == player1) {
                currentPlayer=player2;
            } else {
                currentPlayer=player1;
            }

            ui.showBoard(board);
            currentPlayer.makeMove();

            result = rules.checkWinner(board);
            if (result == null) {
                continue;
            }


            if (result != player1 && result!= player2)  {
                result = null;
            }
            ui.showWinner(result);
            break;
        }



    }
}
