package com.rafael;

import com.rafael.application.UI;
import com.rafael.chess.ChessMatch;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
