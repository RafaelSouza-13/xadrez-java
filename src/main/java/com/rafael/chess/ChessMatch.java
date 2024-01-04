package com.rafael.chess;

import com.rafael.boardgame.Board;
import com.rafael.boardgame.Position;
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
    
    private void inicialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 3));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 5));
    }
}
