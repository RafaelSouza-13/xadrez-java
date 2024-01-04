package com.rafael.chess;

import com.rafael.boardgame.BoardException;

public class ChessException extends BoardException {
    public ChessException(String mensage){
        super(mensage);
    }
}
