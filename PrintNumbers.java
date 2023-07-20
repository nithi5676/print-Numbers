package printNumbers;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        print(number);
    }

    public static void print(int number) {
        if (number <= 0) {
            return;
        }
        System.out.println(number);
        print(number - 1);

    }
}
