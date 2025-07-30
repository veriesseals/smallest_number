import java.util.Scanner;

public class LabProgram {
    
    public static void main(String[] args) {
        try(Scanner scnr = new Scanner(System.in)) {   

        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();

        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        System.out.println(smallest);
        }
    }
}
