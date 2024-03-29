package com.rafael.chess;

import com.rafael.boardgame.Board;
import com.rafael.boardgame.Piece;
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

    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition){
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();
        valiateSourcePosition(source);
        Piece captured = makeMove(source, target);
        return (ChessPiece)captured;
    }

    private void valiateSourcePosition(Position position){
        if(!board.thereIsAPiece(position)){
            throw new ChessException("Não há peça na posição selecionada");
        }
        if(!board.piece(position).isThereAnyPossibleMove()){
            throw new ChessException("Não há movimento para a peça selecionada");
        }
    }

    private Piece makeMove(Position source, Position target){
        Piece p = board.removePiece(source);
        Piece captured = board.removePiece(target);
        board.placePiece(p, target);
        return captured;
    }

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    
    private void inicialSetup(){
        placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));
        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
    }
}
