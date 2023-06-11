package recursion_Star_Pattern;
public class HollowDiamod {
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

    public static void printpatterneven(int constrow,int count) {
        if(constrow%2==0){    
            printstar((constrow-count)/2);
            printspace(count);
            printstar((constrow-count)/2);
            System.out.println();
        }
        else{
            printstar((constrow-(count-1))/2);
            printspace(count-1);
            printstar((constrow-(count-1))/2);
            System.out.println();
        }

    }
    public static void printrows(int rows,int constrow,int count) {
        if(constrow%2==0){              //For even rows
            //Termination case
            if(rows==constrow/2){
                return;
            }
            //Business logic
            printpatterneven(constrow,count);
            //Recursive call
            printrows(rows-1, constrow, count+2);
            //Business logic
            printpatterneven(constrow,count);
        }

        else{           //For odd rows

            //Termination case
            if(rows==(int)Math.round(constrow/2.0)){
                printpatterneven(constrow,count);
                return;
            }
            
            if(rows==constrow){
                //Business Logic
                printstar(constrow);
                System.out.println();
                //Recursive call
                printrows(rows-1, constrow, count+2);
            }
            else{
                //Business Logic
                printpatterneven(constrow,count);
                //Recursive call
                printrows(rows-1, constrow, count+2);
                //Business Logic
                printpatterneven(constrow,count);

                if(count == 2){
                    printstar(constrow);
                    System.out.println(); 
                }
            }
            
        }
    }
    public static void main(String[] args) {
        printrows(12, 12, 0);
    }
}
