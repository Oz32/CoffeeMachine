package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Machine machine = new Machine();
        label:
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String choice = scanner.nextLine();
            switch (choice) {
                case "buy":
                    machine.buy();
                    break;
                case "fill":
                    machine.fill();
                    break;
                case "take":
                    machine.take();
                    break;
                case "remaining":
                    System.out.println(machine);
                    break;
                case "exit":
                    break label;
            }
        }
    }
}
