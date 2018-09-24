package Scanner;

import java.util.Scanner;

public class WLeungScanner {
    public static void main(String[] args)
    {
        System.out.println("What is your name?");
        Scanner name = new Scanner(System.in);
        String name2 = name.nextLine();
        System.out.println("Hello. Nice to meet you, " + name2);
        System.out.println("How old are you?");
        int age2 = name.nextInt();
        System.out.println("You are " + age2);
    }
}
