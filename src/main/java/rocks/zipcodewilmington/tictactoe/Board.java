package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        int favorX = 0;

        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            favorX = 1;
        } else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
            favorX = 1;
        } else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
            favorX = 1;
        } else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            favorX = 1;
        } else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            favorX = 1;
        } else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
            favorX = 1;
        } else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
            favorX = 1;
        } else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            favorX = 1;
        } else {
            favorX = 0;
        }
        return favorX == 1;
    }

    public Boolean isInFavorOfO() {
        int favorO = 0;

        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
            favorO = 1;
        } else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
            favorO = 1;
        } else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
            favorO = 1;
        } else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            favorO = 1;
        } else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            favorO = 1;
        } else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
            favorO = 1;
        } else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
            favorO = 1;
        } else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
            favorO = 1;
        } else {
            favorO = 0;
        }
        return favorO == 1;
    }

    public Boolean isTie() {
   //tie = no one wins
    //isInFavorX wins
    //isInFavorO wins

        if (!isInFavorOfX() && !isInFavorOfO()) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        return null;
    }

}
