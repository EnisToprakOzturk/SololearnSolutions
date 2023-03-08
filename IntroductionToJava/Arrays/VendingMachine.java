import  java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        
        int choice = sc.nextInt();

        if ( choice > 4){
            System.out.println("Invalid");
        } else {
            System.out.println(menu[choice]);
        }
    }
}
