package chess.pieces;

import boardGame.Board;
import boardGame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		
		// above-left(northwest)
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		while (getBoard().positionExists(p) && !getBoard().HasPiece(p)) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() - 1);
		}
		if (getBoard().positionExists(p) && hasOpponentPiece(p)) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		// above-right(northeast)
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().HasPiece(p)) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() + 1);
		}
		if (getBoard().positionExists(p) && hasOpponentPiece(p)) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		// below-right(southeast)
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().HasPiece(p)) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() + 1);
		}
		if (getBoard().positionExists(p) && hasOpponentPiece(p)) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		// below-left(southwest)
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		while (getBoard().positionExists(p) && !getBoard().HasPiece(p)) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() - 1);
		}
		if (getBoard().positionExists(p) && hasOpponentPiece(p)) {
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		return possibleMoves;
	}

	@Override
	public String toString() {
		return "B";
	}

}
