public class LeftArrowAndRightArrow {
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

    public static void printleftarrow(int rows) {
        //Termination case
        if(rows==2){
            printstar(rows-1);
            return;
        }
        //Business logic
        printspace((rows/2)-1);
        printstar((rows/2));
        System.out.println();
        //Recursive call
        printleftarrow(rows-2);
        
        //Business logic
        System.out.println();
        printspace((rows/2)-1);
        printstar((rows/2));
        
    }

    public static void printrightarrow(int rows,int count) {
        if(rows==2){
            printspace(count);
            printstar(rows-1);
            return;
        }

        printspace(count);
        printstar((rows/2));
        System.out.println();
        
        printrightarrow(rows-2,count+2);
        
        System.out.println();
        printspace(count);
        printstar((rows/2));
        
    }
    public static void main(String[] args) {
        System.out.println("Left Arrow\n");
        printleftarrow(10);
        System.out.println();
        System.out.println("\nRight Arrow\n");
        printrightarrow(10,0);
    }
}
