package com.rafael.chess;

import com.rafael.boardgame.Board;
import com.rafael.boardgame.Piece;

public class ChessPiece extends Piece {
    
    private Color color;
    
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
