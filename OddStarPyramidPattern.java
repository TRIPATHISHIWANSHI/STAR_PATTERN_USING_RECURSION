package recursion_Star_Pattern;

import java.util.Scanner;

public class OddStarPyramidPattern {
    static void printStar(int star){
        if(star==0){
            return;
        }
        System.out.print("* ");
        printStar(star-1);
    }
    static void printBlank(int blank){
        if(blank==0){
            return;
        }
        System.out.print(" ");
        printBlank(blank-1);
    }

    static void printLine(int row, int n){
        if(row>n){
            return;
        }

        if(row%2!=0){
            printBlank(n-row);
            printStar(row);
            System.out.println();
        }
        
        printLine(row+1, n);
    }

    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for the pattern : ");
		int rows = sc.nextInt();
		printLine(1,rows);
		sc.close();
       // printLine(1, 8);
    }
}
