import java.util.Scanner;

public class Bot {
    
    static void bot(){
        Scanner sc = new Scanner(System.in);

        int order = sc.nextInt();

        switch(order){
            case 1:
                System.out.println("Order confirmed");
                break;
            case 2:
                System.out.println("info@sololearn.com");
                break;
            default:
                System.out.println("Try again");
        }
    }
    
    
    public static void main(String[] args) {
        bot();
    }
}
