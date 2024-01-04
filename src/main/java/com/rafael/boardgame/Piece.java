package com.rafael.boardgame;

public abstract class Piece implements IMoviment {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }
    public boolean isThereAnyPossibleMove(){
        boolean[][] matrix = possibleMoves();
        for(int i = 0; i < matrix.length; i++){
            for(int y = 0; y < matrix.length; y++){
                if(matrix[i][y]){
                    return true;
                }
            }
        }
        return false;
    }
}
