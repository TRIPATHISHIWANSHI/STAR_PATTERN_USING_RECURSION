public class NumberRightandLeft {
    public static void printspace(int space) {
        //Termination case
        if(space==0){
            return;
        }
        //Business logic
        System.out.print(" ");
        //Recursive call
        printspace(space-1);
    }

    public static void printnum(int index,int num,int count) {
        //Termination case
        if(index==0){
            return;
        }
        //Business logic
        num=num+1;
        System.out.print(num);
        //Recursive call
        printnum(index-1, num,count);
        //Business logic
        if(index==1){
            printspace(count);
        }        
        System.out.print(num);
    }

    private static void printrow(int row,int count,int constrow) {
        //Termination case
        if(row==0){
            return;
        }
        //Business logic
        printnum(constrow-(count/2), 0, count);
        System.out.println();
        //Recursive call
        printrow(row-1, count-2,constrow);
    }
    public static void main(String[] args) {
        printrow(5, 8, 5);  //count = row*2-2
    }
}
