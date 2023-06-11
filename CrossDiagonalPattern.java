package recursion_Star_Pattern;
public class CrossDiagonalPattern {
    public static void printCrossDiagonalPattern(int n) {
        if (n <= 0) {
            return;
        }

        printPattern(n, 1);
    }

    private static void printPattern(int n, int row) {
        if (row > n) {
            return;
        }

        printRow(n, row, 1);
        System.out.println();
        printPattern(n, row + 1);
    }

    private static void printRow(int n, int row, int col) {
        if (col > n) {
            return;
        }

        if (col == row || col == (n - row + 1)) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }

        printRow(n, row, col + 1);
    }

    public static void main(String[] args) {
        printCrossDiagonalPattern(5);
    }
}
