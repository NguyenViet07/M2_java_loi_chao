import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print( "hello " + name );
    }
}
