public class NumberCharPattern {
    static void printNum(int start, int end){
        if(start>end){
            return;
        }
        System.out.print(start+" ");
        printNum(start+1, end);
    }

    static void printLine(int row, int n, int start){
        if(row>n){
            return;
        }

        printNum(start, start+row-1);
        System.out.println();
        printLine(row+1, n, start+row);
    }
    public static void main(String args[]){
        printLine(1, 4, 1);
    }
}
