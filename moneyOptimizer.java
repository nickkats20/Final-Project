public class moneyOptimizer {
    public static void main(String [] args) {
        change(47.20);
    }

    public static void change(double moneyIn) {
        if (moneyIn >= 20) {
            int twenties = (int) (moneyIn / 20);
            System.out.println(twenties);
           System.out.println("Hi");
        }
//split into dollars and cents first then subdivide
    }
}