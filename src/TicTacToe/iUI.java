package TicTacToe;

public interface iUI {
    void showBoard(iBoard board);
    void getInput();
    void showDraw();
    void showWinner(iPlayer player);
}
