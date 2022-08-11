import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to 2 Player Tic Tac Toe.");
    
    String[][] board = createBoard();
    printBoard(board);
    complete();
  }
  
  public static String[][] createBoard() {
    String[][] bigBoard = new String[3][3];
    return bigBoard;
  }
  public static void printBoard(String[][] board) {
    System.out.println("[" + board[0][0] + "][" + board[0][1] + "][" + board[0][2] + "]");
    System.out.println("[" + board[1][0] + "][" + board[1][1] + "][" + board[1][2] + "]");
    System.out.println("[" + board[2][0] + "][" + board[2][1] + "][" + board[2][2] + "]");

    System.out.println("-- -- -- -- -- -- -- -- -- -- -- --");
  }
  
  public static void complete() {
    Scanner input = new Scanner(System.in);
    String currentPlayerMark = "o";
    String[][] currentBoard = new String[3][3];
    System.out.println("New Game: X goes first.");

    while (true) {
      // Alternates between X and O
      if (currentPlayerMark == "x") {
            currentPlayerMark = "o";
        }
        else {
            currentPlayerMark = "x";
        }

      System.out.println("Which row?");
      int a = Integer.parseInt(input.nextLine());
      // Displaying Out-Bounds-Message
      if (a > 3 || a < 1) {
        System.out.println("Please select a number between 1 and 3");

        // Flips the symbol for it to be flipped again when it passes continue
        if (currentPlayerMark == "x") {
            currentPlayerMark = "o";
        }
        else {
            currentPlayerMark = "x";
        }
        continue;
      }

      System.out.println("Which column?");
      int b = Integer.parseInt(input.nextLine());
      // Displaying Out-Bounds-Message
      if (b > 3 || b < 1) {
        System.out.println("Please select a number between 1 and 3");

        // Flips the symbol for it to be flipped again when it passes continue
        if (currentPlayerMark == "x") {
            currentPlayerMark = "o";
        }
        else {
            currentPlayerMark = "x";
        }
        continue;
      }

      // Checks Moves
      if (currentBoard[a - 1][b - 1] == null) {
      System.out.println("true");
      System.out.println(currentPlayerMark.toUpperCase() + " Player's Board");
    }
      else {
        System.out.println(currentPlayerMark.toUpperCase() + " Player's Board");
        System.out.println("false-->BOARD SPOT HAS ALREADY BEEN TAKEN!\nPlease reselect...");

        // Flips the symbol for it to be flipped again when it passes continue
        if (currentPlayerMark == "x") {
            currentPlayerMark = "o";
        }
        else {
            currentPlayerMark = "x";
        }

        continue;
      }

      currentBoard[a - 1][b - 1] = currentPlayerMark;
      printBoard(currentBoard);
      System.out.println();

      // CHECK FOR 3 IN A ROW 
            // Checks first row horizontal
      if (currentBoard[0][0] == "x" && currentBoard[0][1] == "x" && currentBoard[0][2] == "x") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      }
      if (currentBoard[0][0] == "o" && currentBoard[0][1] == "o" && currentBoard[0][2] == "o") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      }

            // Checks second row horizontal
      if (currentBoard[1][0] == "x" && currentBoard[1][1] == "x" && currentBoard[1][2] == "x") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      }
      if (currentBoard[1][0] == "o" && currentBoard[1][1] == "o" && currentBoard[1][2] == "o") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      }

            // Checks third row horizontal
      if (currentBoard[2][0] == "x" && currentBoard[2][1] == "x" && currentBoard[2][2] == "x") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      }
      if (currentBoard[2][0] == "o" && currentBoard[2][1] == "o" && currentBoard[2][2] == "o") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      }

            // Checks first column vertical
      if (currentBoard[0][0] == "x" && currentBoard[1][0] == "x" && currentBoard[2][0] == "x") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      } 
      if (currentBoard[0][0] == "o" && currentBoard[1][0] == "o" && currentBoard[2][0] == "o") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      } 

      // Checks second column vertical
      if (currentBoard[0][1] == "x" && currentBoard[1][1] == "x" && currentBoard[2][1] == "x") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      }
      if (currentBoard[0][1] == "o" && currentBoard[1][1] == "o" && currentBoard[2][1] == "o") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      }

      // Checks third column vertical
      if (currentBoard[0][2] == "x" && currentBoard[1][2] == "x" && currentBoard[2][2] == "x") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      } 
      if (currentBoard[0][2] == "o" && currentBoard[1][2] == "o" && currentBoard[2][2] == "o") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      } 

      // Checks backslash diagonal
      if (currentBoard[0][0] == "x" && currentBoard[1][1] == "x" && currentBoard[2][2] == "x") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      } 
      if (currentBoard[0][0] == "o" && currentBoard[1][1] == "o" && currentBoard[2][2] == "o") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      } 

      // Checks forwardslash diagonal
      if (currentBoard[2][0] == "x" && currentBoard[1][1] == "x" && currentBoard[0][2] == "x") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      }
      if (currentBoard[2][0] == "o" && currentBoard[1][1] == "o" && currentBoard[0][2] == "o") {
      System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + currentPlayerMark.toUpperCase() + " Player wins!");
      System.exit(0);
      }

      // Checks for draw
      if (currentBoard[0][0] != null && currentBoard[0][1] != null && currentBoard[0][2] != null && currentBoard[1][0] != null && currentBoard[1][1] != null && currentBoard[1][2] != null && currentBoard[2][0] != null && currentBoard[2][1] != null && currentBoard[2][2] != null) {
        System.out.println("<<<<<<<<<<----------GG---------->>>>>>>>>>\n" + "DRAW!");
        System.exit(0);
      }
  }
}
}
