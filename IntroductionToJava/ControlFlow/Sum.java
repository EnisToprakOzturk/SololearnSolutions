import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int sum = 0;

        while (number > 0){
            sum += number;
            number--;
        }

        System.out.println(sum);
    }
}
