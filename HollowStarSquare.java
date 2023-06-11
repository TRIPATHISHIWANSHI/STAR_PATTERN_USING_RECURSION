package recursion_Star_Pattern;
public class HollowStarSquare {
    public static void printstar(int star,int row,int label) {
        
        if(row==1 || row == label){
            //Termination case
            if(star==0){
                return;
            }
            //Business logic
            System.out.print("*");
            //Recursive call
            printstar(star-1, row, label);
        }
        else{
            //Termination case
            if(star==0){
                return;
            }
            //Business logic
            if(star==label || star==1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            //Recursive call
            printstar(star-1, row, label);
            }
        }
        
    
    public static void printline(int row, int star) {
        //Termination case
        if(row==0){
            return;
        }
        //Business logic
        printstar(star,row,star);
        System.out.println();
        //Recursive call
        printline(row-1, star);
    }
    public static void main(String[] args) {
        printline(5, 5);
    }
}
