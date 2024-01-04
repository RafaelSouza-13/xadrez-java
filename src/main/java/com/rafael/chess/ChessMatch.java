package com.rafael.chess;

import com.rafael.boardgame.Board;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] matrix = new ChessPiece[board.getRows()][board.getRows()];
        for(int i = 0; i < board.getRows(); i++){
            for(int y = 0; y < board.getColumns(); y++){
                matrix[i][y] = (ChessPiece) board.piece(i, y);
            }
        }
        return matrix;
    }
    
}
