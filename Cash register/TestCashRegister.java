import java.util.Scanner;
public class TestCashRegister {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CashRegister c1 = new CashRegister();
        c1.printRegisterStatus();
        double i = s.nextDouble();
        c1.removeOptimumMoney(i);
        c1.printRegisterStatus();
        System.out.println("********************");

        CashRegister c2 = new CashRegister(100, 20, 20, 5, 10, 10, 0, 1);
        c2.printRegisterStatus();
        i = s.nextDouble();
        c2.removeOptimumMoney(i);
        c2.printRegisterStatus();
        System.out.println("********************");

        CashRegister c3 = new CashRegister(150);
        c3.printRegisterStatus();
        i = s.nextDouble();
        c3.removeOptimumMoney(i);
        c3.printRegisterStatus();
        System.out.println("********************");
    }

}