public class moneyOptimizer {
    public static void main(String[] args) {
        change(.99);
    }

    public static void change(double moneyIn) {
        int[] denomination = { 0, 0, 0, 0, 0, 0, 0, 0 };
        String[] s = { "twenties", "tens", "fives", "singles", "quarters", "dimes", "nickels", "pennies" };
       
        while (moneyIn / 20 >= 1) {
            moneyIn -= 20;
            denomination[0]++;
        }
        while (moneyIn / 10 >= 1) {
            moneyIn -= 10;
            denomination[1]++;
        }
        while (moneyIn / 5 >= 1) {
            moneyIn -= 5;
            denomination[2]++;
        }
        while (moneyIn / 1 >= 1) {
            moneyIn -= 1;
            denomination[3]++;
        }
        while (moneyIn / .25 >= 1) {
            moneyIn -= .25;
            denomination[4]++;
        }
        while (moneyIn / .1 >= 1) {
            moneyIn -= .1;
            denomination[5]++;
        }
        while (moneyIn / .05 >= 1) {
            moneyIn -= .05;
            denomination[6]++;
        }
        while (moneyIn / .01 >= 1) {
            moneyIn -= .01;
            denomination[7]++;
        }
        for (int i = 0; i <= 7; i++) {
            System.out.println(s[i] + " " + denomination[i]);
        }
    }
}