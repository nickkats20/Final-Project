public class moneyOptimizer {
    public static void main(String[] args) {
        change(47.20);
    }

    public static void change(double moneyIn) {
        int[] ting = { 0, 0, 0, 0, 0, 0, 0, 0 };
        // int twenties = 0;
        // int tens = 0;
        // int fives = 0;
        // int dollars = 0;
        // int quarters = 0;
        // int dimes = 0;
        // int nickes = 0;
        // int pennies = 0;
        while (moneyIn / 20 >= 1) {
            moneyIn -= 20;
            ting[0]++;
        }
        while (moneyIn / 10 >= 1) {
            moneyIn -= 10;
            ting[1]++;
        }
        while (moneyIn / 5 >= 1) {
            moneyIn -= 5;
            ting[2]++;
        }
        while (moneyIn / 1 >= 1) {
            moneyIn -= 1;
            ting[3]++;
        }
        while (moneyIn / .25 >= 1) {
            moneyIn -= .25;
            ting[4]++;
        }
        while (moneyIn / .1 >= 1) {
            moneyIn -= .1;
            ting[5]++;
        }
        while (moneyIn / .05 >= 1) {
            moneyIn -= .05;
            ting[6]++;
        }
        while (moneyIn / .01 >= 1) {
            moneyIn -= .01;
            ting[7]++;
        }
       for(int i = 0; i<=7; i++){
        System.out.println(i);
       }
       System.out.println(moneyIn);
     }
}