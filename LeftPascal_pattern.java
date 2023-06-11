public class LeftPascalPattern {
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

        System.out.print("  ");
        printBlank(blank-1);
    }

    static void printLine(int row, int n){
        if(row>n){
            return;
        }

        if(row<=n/2+1){
            printBlank(n/2 - row+1);
            printStar(row);
        }

        
        else{
            printBlank(row-5);
            printStar(n-row+1);
        }

        System.out.println();
        printLine(row+1,n);

    }

    public static void main(String[] args) {
        printLine(1,9)
;    }
}
