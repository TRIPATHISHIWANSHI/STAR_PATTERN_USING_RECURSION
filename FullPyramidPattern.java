package recursion_Star_Pattern;
public class FullPyramidPattern {
    static void printStar(int star){
        if(star==0){
            return;
        }

        System.out.print("* ");
        printStar(star-1);
    }

    static void printBlank(int blank){
        if(blank==0){
            return;
        }

        System.out.print(" ");
        printBlank(blank-1);
    }

    static void printLineFirstHalf(int row, int n){
        if(row>n){
            return;
        }

        System.out.print(" ");
        printBlank(n-row);
        printStar(row);
        System.out.println();
        printLineFirstHalf(row+1, n);
    }

    static void printLineSecondHalf(int row, int n){
        if(row==0){
            return;
        }

        printBlank(n-row);
        printStar(row);
        System.out.println();
        printLineSecondHalf(row-1, n);

    }

    public static void main(String args[]){
        final int n = 5;
        printLineFirstHalf(1,n-1);
        printLineSecondHalf(n,n);
    }
}
