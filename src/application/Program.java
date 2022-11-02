package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessExption;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source:  ");
				ChessPosition source = UI.readChessPosition(sc);

				System.out.println();
				System.out.print("Tagert: ");
				ChessPosition tagert = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, tagert);

			} catch (ChessExption e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}

		}

	}

}
