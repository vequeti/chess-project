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
	
	private void placeNewPiece (char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	public void initialSetup() {
		placeNewPiece('a', 8, new Rook(board, Color.WHITE));
		placeNewPiece('b', 8, new Knight(board, Color.WHITE));
		placeNewPiece('c', 8, new Bishop(board, Color.WHITE));
		placeNewPiece('d', 8, new Queen(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.WHITE));
		placeNewPiece('f', 8, new Bishop(board, Color.WHITE));
		placeNewPiece('g', 8, new Knight(board, Color.WHITE));
		placeNewPiece('h', 8, new Rook(board, Color.WHITE));
	}
}
