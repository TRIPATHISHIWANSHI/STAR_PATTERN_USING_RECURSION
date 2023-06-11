public class HeartPattern {
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
    public static void printuppar(int star,int index,int rowstar) {
        //Termination case
        if(index<0){
            return;
        }
        //Business logic
        printspace(index);
        printstar(star);
        printspace(rowstar-((star*2)+index)-2);
        printstar(star);
        System.out.println();        
        //Recursive call
        printuppar(star+2, index-1,rowstar);
    }

    public static void printlower(int rows,int star) {
        //Termination case
        if(rows==0){
            printuppar(5,2,star);
            return;
        }
    
        //Recursive call
        printlower(rows-1,star+2);
        
        //Business logic
        printspace(rows-1);
        printstar(star);
        System.out.println();

    }
    public static void main(String[] args) {
        printlower(10, 1);
    }
}
