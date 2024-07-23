import java.util.Scanner;

public class Activity4 {
  static String[][] board = {
      { "R", "N", "B", "Q", "K", "B", "N", "R" },
      { "P", "P", "P", "P", "P", "P", "P", "P" },
      { "-", "-", "-", "-", "-", "-", "-", "-" },
      { "-", "-", "-", "-", "-", "-", "-", "-" },
      { "-", "-", "-", "-", "-", "-", "-", "-" },
      { "-", "-", "-", "-", "-", "-", "-", "-" },
      { "p", "p", "p", "p", "p", "p", "p", "p" },
      { "r", "n", "b", "q", "k", "b", "n", "r" } };

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Activity4.printBoard(board);
    System.out.printf("Vez do jogador %d \n", 1);

    // jogador 1 cima
    // jogador 2 baixo

    int roundPlayer = 1;

    int count = 0;

    while (count < 5) {
      System.out.print("Digite a linha do peão: ");
      int line = scanner.nextInt();

      System.out.print("Digite a coluna do peão: ");
      int col = scanner.nextInt();

      System.out.print("Quantas casas você quer andar (1 ou 2): ");
      int houses = scanner.nextInt();

      boolean isHouseValid = houses <= 2 && houses >= 1;

      if (isHouseValid) {
        boolean wasMoved = makeMove(board, line, col, houses, board[line][col], roundPlayer);

        if (wasMoved) {
          count++;

          if (roundPlayer == 1) {
            roundPlayer = 2;
            System.out.printf("Vez do jogador %d \n", roundPlayer);
          } else {
            roundPlayer = 1;
            System.out.printf("Vez do jogador %d \n", roundPlayer);
          }
        } else {
          System.out.printf("Vez do jogador %d \n", roundPlayer);
        }

      } else {
        System.out.println("Casa(s) a ser(em) movida(s), inválida(s), tente novamente!");
      }
    }

    scanner.close();
  }

  public static void printBoard(String[][] board) {
    System.out.println("0 1 2 3 4 5 6 7");
    for (int i = 0; i < board.length; i++) {
      String[] line = board[i];
      for (int j = 0; j < line.length; j++) {

        if (line[j].equals("-")) {
          System.out.print(line[j] + " ");
        } else {
          System.out.print(line[j] + " ");
        }
      }
      System.out.println(" " + i);
    }
  }

  public static boolean checkValidMove(String[][] board, int line, int col) {

    return board[line][col].equals("-");
  }

  public static boolean makeMove(String[][] board, int line, int col, int moveHouses, String pawn, int roundPlayers) {

    if (roundPlayers == 1) {
      int lineMove = line + moveHouses;

      if (checkValidMove(board, lineMove, col)) {
        board[lineMove][col] = pawn;
        board[line][col] = "-";
        printBoard(board);

        return true;
      } else {
        System.out.println("Posição inválida!");
        return false;
      }
    } else {
      int lineMove = line - moveHouses;

      if (checkValidMove(board, lineMove, col)) {
        board[lineMove][col] = pawn;
        board[line][col] = "-";
        printBoard(board);
        return true;
      } else {
        System.out.println("Posição inválida!");
        return false;
      }
    }
  }

}