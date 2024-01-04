package com.rafael.chess;

import com.rafael.boardgame.Board;
import com.rafael.chess.pieces.King;
import com.rafael.chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
        inicialSetup();
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

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    
    private void inicialSetup(){
        placeNewPiece('b', 3, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.BLACK));
    }
}
