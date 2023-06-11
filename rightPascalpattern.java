public class RightPascalPattern {
    static void printStar(int star){
        if(star==0){
            return;
        }

        System.out.print("* ");
        printStar(star-1);
    }

    static void printLine(int row, int n){
        if(row>n){
            return;
        }

        if(row<=n/2){
            printStar(row);
            System.out.println();
        }

        else{
            printStar(n-row+1);
            System.out.println();
        }
        printLine(row+1,n);
    }
    public static void main(String args[]){
        printLine(1,6);
    }
}
