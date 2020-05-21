import java.util.Scanner;

public class Minesweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 8;
        final double MINE_PROBABILITY = 0.15;
        boolean[][] mines = new boolean[SIZE][SIZE];
        boolean[][] opened = new boolean[SIZE][SIZE];
        int[][] counts = new int[SIZE][SIZE];
        int mineCount = 0;
        int openedCount = 0;
        
        for (int r = 0; r < mines.length; r++) {
            for (int c = 0; c < mines[r].length; c++) {
                if (Math.random() < MINE_PROBABILITY) {
                    mines[r][c] = true;
                    mineCount++;
                }
            }
        }
        
        for (int r = 0; r < mines.length; r++) {
            for (int c = 0; c < mines[r].length; c++) {
                int count = 0;
                for (int rr = r - 1; rr <= r + 1; rr++) {
                    for (int cc = c - 1; cc <= c + 1; cc++) {
                        if (rr >= 0 && rr < mines.length && cc >= 0 && cc < mines[rr].length &&
                                !(rr == r && cc == c) && mines[rr][cc]) {
                            count++;
                        }
                    }
                }
                counts[r][c] = count;
            }
        }
        
        while (true) {
            printBoard(mines, opened, counts);
            System.out.print("Row and column to open: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (row < 0 || row >= mines.length || col < 0 || col >= mines[row].length || opened[row][col]) {
                System.out.println("Invalid move!");
                continue;
            }
            
            opened[row][col] = true;
            openedCount++;
            if (mines[row][col]) {
                System.out.println("Game over!");
                break;
            }
            if (openedCount == SIZE * SIZE - mineCount) {
                System.out.println("You won!");
                break;
            }
        }
        
        printBoard(mines, opened, counts);
    }
    
    private static void printBoard(boolean[][] mines, boolean[][] opened, int[][] counts) {
        for (int r = 0; r < mines.length; r++) {
            for (int c = 0; c < mines[r].length; c++) {
                if (opened[r][c]) {
                    if (mines[r][c]) {
                        System.out.print("*");
                    } else {
                        System.out.print(counts[r][c]);
                    }
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
