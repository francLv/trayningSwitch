import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                printShape("square");
                break;
            case 2:
                printShape("circle");
                break;
            case 3:
                printShape("triangle");
                break;
            case 4:
                printShape("rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
        }
        scanner.close();
    }
    
    public static void printShape(String shape) {
        System.out.println("You have chosen a " + shape);
    }
}
