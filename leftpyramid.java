package recursion_Star_Pattern;
public class LeftPyramid{
    //Using Stack Builder
    public static void printstar(int star) {
        //Termination case
        if(star==0){
            return;
        }
        //Business logic
        System.out.print("*");
        //Recursive call
        printstar(star-1);
    }
    public static void printline(int row,int index) {
        //Termination case
        if(row==0){
            return;
        }
        //Business logic
        printstar(index);
        System.out.println();
        //Recursive call
        printline(row-1,index+1);
    }

    //Using Stack Falling
    public static int printline(int row) {
        //Termination case
        if(row==0){
            return row;
        }
        //Recursive call
        printstar(printline(row-1));
        //Business logic
        if(row==5){
            System.out.println();
            printstar(5);
        }
        System.out.println();
        return row;
    }
    public static void main(String[] args) {
        printline(5);
    }
}
