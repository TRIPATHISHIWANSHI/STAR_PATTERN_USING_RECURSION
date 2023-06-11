package recursion_Star_Pattern;
public class DiagonalLinePattern {
    static void printStar(){
        System.out.print("* ");
    }

    static void printBlank(int blank){
        if(blank==0){
            return;
        }
        System.out.print("  ");
        printBlank(blank-1);
    }

    static void printLine(int row, int n){
        if(row>n){
            return;
        }

        printBlank(n-row);
        printStar();
        System.out.println();
        printLine(row+1, n);
    }

    public static void main(String args[]){
        printLine(1, 5);
    }
}
