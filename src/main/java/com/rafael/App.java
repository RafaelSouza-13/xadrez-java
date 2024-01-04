package com.rafael;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.rafael.application.UI;
import com.rafael.chess.ChessException;
import com.rafael.chess.ChessMatch;
import com.rafael.chess.ChessPiece;
import com.rafael.chess.ChessPosition;

public class App 
{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while(true){
            try{
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Origem: ");
                ChessPosition source = UI.readChessPosition(sc);
    
                System.out.println();
                System.out.print("Destino: ");
                ChessPosition target = UI.readChessPosition(sc);
    
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }catch(ChessException e){
                System.out.println(e.getMessage());
                System.out.println("Aperte enter para continuar...");
                sc.nextLine();
            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
                System.out.println("Aperte enter para continuar...");
                sc.nextLine();
            }
        }
    }
}
