package TicTacToe;

public interface iRules {
    iPlayer checkWinner(iBoard board); //returns Player1 or Player2 or any player (tie) or null (no result)
}
