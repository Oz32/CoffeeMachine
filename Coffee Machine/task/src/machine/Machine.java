package machine;

import java.util.Scanner;

public class Machine {
    Scanner scanner = new Scanner(System.in);
    private int water = 400;
    private int milk = 540;
    private int coffee = 120;
    private int cups = 9;
    private int money = 550;

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void buy() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String successfulOutput = "I have enough resources, making you a coffee!\n";
        String coffeeChoice = scanner.nextLine();
        switch (coffeeChoice) {
            case "1":
                if (getWater() < 250) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (getCups() < 1) {
                    System.out.println("Sorry, not enough cups!\n");
                } else if (getCoffee() < 16) {
                    System.out.println("Sorry, not enough coffee!\n");
                } else {
                    setWater(getWater() - 250);
                    setCoffee(getCoffee() - 16);
                    setCups(getCups() - 1);
                    setMoney(getMoney() + 4);
                    System.out.println(successfulOutput);
                }
                break;
            case "2":
                if (getWater() < 350) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (getCups() < 1) {
                    System.out.println("Sorry, not enough cups!\n");
                } else if (getCoffee() < 20) {
                    System.out.println("Sorry, not enough coffee!\n");
                } else if (getMilk() < 75) {
                    System.out.println("Sorry, not enough milk!\n");
                } else {
                    setWater(getWater() - 350);
                    setMilk(getMilk() - 75);
                    setCoffee(getCoffee() - 20);
                    setCups(getCups() - 1);
                    setMoney(getMoney() + 7);
                    System.out.println(successfulOutput);
                }
                break;
            case "3":
                if (getWater() < 200) {
                    System.out.println("Sorry, not enough water!\n");
                } else if (getCups() < 1) {
                    System.out.println("Sorry, not enough cups!\n");
                } else if (getCoffee() < 12) {
                    System.out.println("Sorry, not enough coffee!\n");
                } else if (getMilk() < 100) {
                    System.out.println("Sorry, not enough milk!\n");
                } else {
                    setWater(getWater() - 200);
                    setMilk(getMilk() - 100);
                    setCoffee(getCoffee() - 12);
                    setCups(getCups() - 1);
                    setMoney(getMoney() + 6);
                    System.out.println(successfulOutput);
                }
                break;
            case "back":
                break;
        }
    }

    public void fill() {
        System.out.println("\nWrite how many ml of water you want to add:");
        setWater(getWater() + Integer.parseInt(scanner.nextLine()));
        System.out.println("Write how many ml of milk you want to add:");
        setMilk(getMilk() + Integer.parseInt(scanner.nextLine()));
        System.out.println("Write how many grams of coffee beans you want to add:");
        setCoffee(getCoffee() + Integer.parseInt(scanner.nextLine()));
        System.out.println("Write how many disposable cups you want to add:");
        setCups(getCups() + Integer.parseInt(scanner.nextLine()));
        System.out.println(" ");
    }

    public void take() {
        System.out.printf("I gave you $%d\n\n", getMoney());
        setMoney(0);
    }

    @Override
    public String toString() {
        return "\nThe coffee machine has:\n" +
                getWater() + " ml of water\n" +
                getMilk() + " ml of milk\n" +
                getCoffee() + " g of coffee beans\n" +
                getCups() + " disposable cups\n" +
                "$" + getMoney() + " of money\n";
    }
}