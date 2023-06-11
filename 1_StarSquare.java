package recursion_Star_Pattern;
public class StarSquare {
    //Using stack builder void
    public static void printstar(int star){
        //Termination case
        if(star==0){
            return;
        }
        //Business Logic
        System.out.print("*");
        //Recursive call
        printstar(star-1);
    }
    public static void printline(int rows, int star) {
        //Termination case
        if(rows==0){
            return;
        }
        //Business Logic
        printstar(star);
        System.out.println();
        //Recursive call
        printline(rows-1,star);
    }
    
    public static void main(String[] args) {
        printline(5, 5);
    }
}
