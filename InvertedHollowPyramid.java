package recursion_Star_Pattern;
public class InvertedHollowPyramid {
    public static void printspace(int space) {
        //Termination case
        if(space==0){
            return;
        }
        System.out.print(" ");
        //Recursive call
        printspace(space-1);
    }

    public static void printstar(int star) {
        //Termination case
        if(star==0){
            return;
        }
        System.out.print("*");
        //Recursive call
        printstar(star-1);
    }

    public static void printrows(int rows, int star, int count) {
        //Termination case
        if(rows==0){
            return;
        }
        //Business Logic + Recursive call
        if(count==1){
            //Business logic
            printstar(rows+star);
            System.out.println();
            //Recursive call
            printrows(rows-1, star-1, count+1);
        }
        else{
            if(((rows+star)-2)>0){
                //business logic
                printspace(count-1);
                System.out.print("*");
                printspace((rows+star)-2);
                System.out.print("*");
                System.out.println();
                //Recursive call
                printrows(rows-1, star-1, count+1);
            }
            else{
                //Business logic
                printspace(count-1);
                System.out.println("*");
                //Recursive call
                printrows(rows-1, star-1, count+1);
            }
            
        }
    }
    public static void main(String[] args) {
        int rows=6;
        printrows(rows, rows-1, 1);
    }
}
