package com.rafael.application;

import com.rafael.chess.ChessPiece;

public class UI {
    
    public static void printBoard(ChessPiece[][] pieces){
        for(int i = 0; i < pieces.length; i++){
            System.out.print(8 - i+" ");
            for(int y = 0; y < pieces.length; y++){
                printPiece(pieces[i][y]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void printPiece(ChessPiece pieces){
        if(pieces == null){
            System.out.print("-");
        }else{
            System.out.println(pieces);
        }
        System.out.print(" ");
    }
}
