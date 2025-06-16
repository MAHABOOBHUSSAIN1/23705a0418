import java.util.Scanner;

public class SimpleEightPuzzle {

    static int[][] goal = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 0}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial puzzle
        int[][] puzzle = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 0}
        };

        while (true) {
            printPuzzle(puzzle);

            if (isSolved(puzzle)) {
                System.out.println("🎉 You solved the puzzle!");
                break;
            }

            System.out.print("Move (up/down/left/right): ");
            String move = sc.nextLine();

            if (!makeMove(puzzle, move)) {
                System.out.println("Invalid move!");
            }
        }

        sc.close();
    }