public class CashRegister{
    // fields
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;
    private int dollars;
    private int fives;
    private int tens;
    private int twenties;
    private static int nextId = 1;
    private int registerId;

    // constructors
    public CashRegister() {
        replenish();
        registerId = nextId;
        nextId++;
    }

    public CashRegister(int pennies, int nickels, int dimes, int quarters, int dollars, int fives, int tens,
            int twenties) {
        this.pennies = pennies;
        this.nickels = nickels;
        this.dimes = dimes;
        this.quarters = quarters;
        this.dollars = dollars;
        this.fives = fives;
        this.tens = tens;
        this.twenties = twenties;
        registerId = nextId;
        nextId++;
    }

    public CashRegister(int pennies) {
        this.pennies = pennies;
        twenties = (int) ((Math.random() * 5) + 1);
        tens = (int) ((Math.random() * 12) + 1);
        fives = (int) ((Math.random() * 15) + 1);
        dollars = (int) ((Math.random() * 36) + 10);
        quarters = (int) ((Math.random() * 15) + 10);
        dimes = (int) ((Math.random() * 16) + 5);
        nickels = (int) ((Math.random() * 16) + 5);
        registerId = nextId;
        nextId++;
    }

    // methods
    private double calculateTotalMoney() {
        return .01 * pennies + .05 * nickels + .1 * dimes + .25 * quarters + dollars + 5 * fives + 10 * tens
                + 20 * twenties;
    }

    private void replenish() {
        pennies = 100;
        nickels = 20;
        dimes = 20;
        quarters = 24;
        dollars = 45;
        fives = 15;
        tens = 12;
        twenties = 5;
    }

    public void addMoney(int addPennies, int addNickels, int addDimes, int addQuarters, int addDollars, int addFives,
            int addTens, int addTwenties) {
        pennies += addPennies;
        nickels += addNickels;
        dimes += addDimes;
        quarters += addQuarters;
        dollars += addDollars;
        fives += addFives;
        tens += addTens;
        twenties += addTwenties;
    }

    public void printRegisterStatus() {
        System.out.println("Register " + registerId + " has:");
        System.out.println("Twenties:" + twenties);
        System.out.println("Tens:" + tens);
        System.out.println("Fives:" + fives);
        System.out.println("Dollars:" + dollars);
        System.out.println("Quarters:" + quarters);
        System.out.println("Dimes:" + dimes);
        System.out.println("Nickels:" + nickels);
        System.out.println("Pennies:" + pennies);
    }

    public void removeOptimumMoney(double amount) {
        if (amount <= this.calculateTotalMoney()) {
            int penniesRemoved = 0;
            int nickelsRemoved = 0;
            int dimesRemoved = 0;
            int quartersRemoved = 0;
            int dollarsRemoved = 0;
            int fivesRemoved = 0;
            int tensRemoved = 0;
            int twentiesRemoved = 0;
            if (twenties > 0) {
                while (amount / 20 >= 1 && twenties > 0) {
                    amount -= 20;
                    twenties--;
                    twentiesRemoved++;
                }
                while (amount / 10 >= 1 && tens > 0) {
                    amount -= 10;
                    tens--;
                    tensRemoved++;
                }
                while (amount / 5 >= 1 && fives > 0) {
                    amount -= 5;
                    fives--;
                    fivesRemoved++;
                }
                while (amount / 1 >= 1 && dollars > 0) {
                    amount -= 1;
                    dollars--;
                    dollarsRemoved++;
                }
                while (amount / .25 >= 1 && quarters > 0) {
                    amount -= .25;
                    quarters--;
                    quartersRemoved++;
                }
                while (amount / .1 >= 1 && dimes > 0) {
                    amount -= .1;
                    dimes--;
                    dimesRemoved++;
                }
                while (amount / .05 >= 1 && nickels > 0) {
                    amount -= .05;
                    nickels--;
                    nickelsRemoved++;
                }
                while (amount / .01 >= 1 && pennies > 0) {
                    amount -= .01;
                    pennies--;
                    penniesRemoved++;
                }

                if (Math.abs(amount-.01) < .001 && pennies > 0) { 
                    pennies--;
                    penniesRemoved++;
                }
            }
            System.out.println("The following bills and coins have been removed:");
            System.out.println("Twenties:" + twentiesRemoved);
            System.out.println("Tens:" + tensRemoved);
            System.out.println("Fives:" + fivesRemoved);
            System.out.println("Dollars:" + dollarsRemoved);
            System.out.println("Quarters:" + quartersRemoved);
            System.out.println("Dimes:" + dimesRemoved);
            System.out.println("Nickels:" + nickelsRemoved);
            System.out.println("Pennies:" + penniesRemoved);
        } else {
            System.out.println("Not enough in Cash Register.");
        }

    }
}