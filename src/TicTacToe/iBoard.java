package TicTacToe;

public interface iBoard {
    void setPiece(Coord coord,iPlayer player);
    iPlayer getPiece(Coord coord);
    boolean isFull();
    int getXSize();
    int getYSize();
}
