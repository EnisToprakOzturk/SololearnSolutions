import java.util.Scanner;

public class MovieTheater {
    
    public static void main(String[] args) {
        int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int column = sc.nextInt();

        if (seats[row][column] == 1){
            System.out.println("Sold");
        } else if (seats[row][column] == 0){
            System.out.println("Free");
        }
    }
}