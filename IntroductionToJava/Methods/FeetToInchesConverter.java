import java.util.Scanner;

public class FeetToInchesConverter {

    static void convert(double foot){
        System.out.println(foot*12);
    }

    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        double num = sc.nextDouble();

        convert(num);
    }    
}
