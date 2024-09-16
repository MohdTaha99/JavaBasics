//This is a for loop which prints a star triangle with stars increasing from every line

public class PrintAStarTriangle{
    public static void printAStarTriangle(int number){
        for(int i=1;i<=number;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printAStarTriangle(3);
    }
}
