package recursion_Star_Pattern;
import java.util.Scanner;

public class MirrorInvertedLeftPyramid {
    public static void printspace(int space) {
        //Termination case
        if(space==0){
            return;
        }else{
            //Business logic
            System.out.print(" ");
        }
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
    public static void printline(int row,int space) {
        //Termination case
        if(row==0){
            return;
        }
        //Business logic
        printspace(space);
        printstar(row);
        System.out.println();
        //Recursive call
        printline(row-1, space+1);
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for the pattern : ");
		int rows = sc.nextInt();
		printline(rows,0);
		sc.close();
    	
    }
}
