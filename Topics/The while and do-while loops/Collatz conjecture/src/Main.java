import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        
        int value = scanner.nextInt();
        while (value != 1) {
            
            System.out.print(value + " ");
            if (value % 2 == 0) {
                value /= 2;
            } else {
                value = (value * 3) + 1;
            }
        }
        System.out.print(value);
    }
}