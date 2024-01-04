package com.rafael.chess.pieces;

import com.rafael.boardgame.Board;
import com.rafael.chess.ChessPiece;
import com.rafael.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
