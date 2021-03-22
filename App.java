import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.print("Введите строку, например... \"3[abc]\" : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String number = name.replaceAll("[^0-9]", "");
        String letter = name.replaceAll("[^a-zA-Z]", "");

        int x = Integer.parseInt(number);
            for (int i = 0; i < x; i++) {
                System.out.print(letter);
            }

    }
}
