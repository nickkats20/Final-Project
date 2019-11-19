public class CashRegister {
    //fields
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;
    private int dollars;
    private int fives;
    private int tens;
    private int twenties;
    private static int nextId = 1;
    private int registerNum;

    //constructors
    public CashRegister(){
        pennies = 100;
        nickels = 20;
        dimes = 20;
        quarters = 24;
        dollars = 45;
        fives = 15;
        tens = 12;
        twenties = 5;
        registerNum = nextId;
        nextId++;
    }
    public CashRegister(int pennies, int nickels, int dimes, int quarters, int dollars, int fives, int tens, int twenties){
        this.pennies = pennies;
        this.nickels = nickels;
        this.dimes = dimes;
        this.quarters = quarters;
        this.dollars = dollars;
        this.fives = fives;
        this.tens = tens;
        this.twenties = twenties;
        registerNum = nextId;
        nextId++;
    }
    public CashRegister(int pennies){
        this.pennies = pennies;
        twenties = (int) ((Math.random()*5) + 1);
        tens = (int) ((Math.random()*12) + 1);
        fives = (int)((Math.random()*15)+1);
        dollars = (int)((Math.random()*36)+10);
        quarters = (int)((Math.random()*15)+10);
        dimes = (int)((Math.random()*16)+5);
        nickels = (int)((Math.random()*16)+5);
        registerNum = nextId;
        nextId++;
    }

    //methods
    public int addMoney(
}