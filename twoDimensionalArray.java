import java.util.Scanner;

public class twoDimensionalArray
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int [][] numbers = new int [5][5];
        
        for (int i=0; i<5; i++)
        {
            int default1 = 0;
            int value = 1;
            
            System.out.println("Enter a positive integer");
            value = sc.nextInt();
            
            if (value < 0) {
             default1 = 0;
            }
            
            numbers[i][i]= value;
            numbers[i][2]= default1;
        }
    }
}
