package chess;

import boardgame.Board;
import boardgame.Position;
import chess.piece.Bishop;
import chess.piece.King;
import chess.piece.Knight;
import chess.piece.Queen;
import chess.piece.Rook;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	public void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 0));
		board.placePiece(new Knight(board, Color.WHITE), new Position(0, 1));
		board.placePiece(new Bishop(board, Color.WHITE), new Position(0, 2));
		board.placePiece(new Queen(board, Color.WHITE), new Position(0, 3));
		board.placePiece(new King(board, Color.WHITE), new Position(0, 4));
		board.placePiece(new Bishop(board, Color.WHITE), new Position(0, 5));
		board.placePiece(new Knight(board, Color.WHITE), new Position(0, 6));
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 7));
	}
}
