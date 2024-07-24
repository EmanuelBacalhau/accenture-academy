package activity6;

import javax.swing.JOptionPane;

public class GameOfOld {

  public static void main(String[] args) {

    String[][] board = {
        { " ", " ", " " },
        { " ", " ", " " },
        { " ", " ", " " } };

    int roundPlayer = 1;

    do {
      printBoard(board);

      boolean isOld = GameOfOld.checkIsOld(board);

      if (!isOld) {
        int line = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a linha"));
        int col = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a coluna"));

        if (GameOfOld.isValidMove(board, line, col)) {
          GameOfOld.makeMove(board, line, col, roundPlayer);

          boolean isWinner = GameOfOld.checkColWinner(board) || GameOfOld.checkLineWinner(board)
              || GameOfOld.checkDiagonalWinner(board);

          if (isWinner) {
            GameOfOld.printBoard(board);
            System.out.printf("Jogador %d é o ganhador!", roundPlayer);
            break;
          }

          if (roundPlayer == 1) {
            roundPlayer = 2;
          } else {
            roundPlayer = 1;
          }
        } else {

          System.out.println("Posição inválida, tente novamente!");
        }
      } else {
        System.out.println("Fim de jogo, deu velha :(");
        break;
      }

    } while (true);

  }

  public static void printBoard(String[][] board) {
    System.out.print("\n\n 0   1    2\n\n");

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(" " + board[i][j]);

        if (j < 2) {
          System.out.print(" | ");
        }

        if (j == 2) {
          System.out.print("  " + i);
        }

      }

      if (i < 2) {
        System.out.print("\n------------");
      }

      System.out.println("\n");
    }
  }

  public static boolean isValidMove(String[][] board, int line, int col) {
    return board[line][col].equals(" ");
  }

  public static void makeMove(String[][] board, int line, int col, int roundPlayer) {
    board[line][col] = roundPlayer == 1 ? "X" : "O";
  }

  public static boolean checkLineWinner(String[][] board) {

    for (int i = 0; i < board.length; i++) {
      if (board[i][0].equals("X") && board[i][1].equals("X") && board[i][2].equals("X")) {
        return true;
      }

      if (board[i][0].equals("O") && board[i][1].equals("O") && board[i][2].equals("O")) {
        return true;
      }
    }

    return false;
  }

  public static boolean checkColWinner(String[][] board) {

    for (int i = 0; i < board.length; i++) {
      if (board[0][i].equals("X") && board[1][i].equals("X") && board[2][i].equals("X")) {
        return true;
      }

      if (board[0][i].equals("O") && board[1][i].equals("O") && board[2][i].equals("O")) {
        return true;
      }
    }

    return false;
  }

  public static boolean checkDiagonalWinner(String[][] board) {

    boolean innerDiagonalOneX = board[0][0].equals("X") && board[1][1].equals("X")
        && board[2][2].equals("X");
    boolean innerDiagonalOneO = board[0][0].equals("O") && board[1][1].equals("O")
        && board[2][2].equals("O");

    if (innerDiagonalOneX || innerDiagonalOneO) {
      return true;
    }

    boolean innerDiagonalTwoX = board[0][2].equals("X") && board[1][1].equals("X")
        && board[2][0].equals("X");
    boolean innerDiagonalTwoO = board[0][2].equals("O") && board[1][1].equals("O")
        && board[2][0].equals("O");

    if (innerDiagonalTwoO && innerDiagonalTwoX) {
      return true;
    }

    return false;
  }

  public static boolean checkIsOld(String[][] board) {

    int count = 0;

    for (int i = 0; i < board.length; i++) {
      String[] line = board[i];

      for (int j = 0; j < line.length; j++) {
        if (!line[i].equals(" ")) {
          count++;
        }
      }
    }

    return count == 9;
  }
}
