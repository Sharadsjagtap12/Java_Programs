import java.sql.SQLOutput;
import java.util.Scanner;

public class switch1Demo {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter value a:");
        int a=s.nextInt();
        System.out.println(" Enter value b:");
        int b=s.nextInt();
        int c;
        System.out.println("1. Addition 2. Subtraction 3. Multiplication 4. Division");
        int operation= s.nextInt();

         switch(operation)
        {
            case 1: c= a+b;
                System.out.println("Addition is:" +c);
                break;
            case 2: c= a-b;
                System.out.println("Subtraction is:" +c);
                break;

            case 3: c= a*b;
                System.out.println("Multiplication is:" +c);
                break;
            case 4: c= a/b;
                System.out.println("Division is:" +c);
                break;
        }
    }
}
