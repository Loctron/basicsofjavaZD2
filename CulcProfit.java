public class CulcProfit {
    public static void main(String[] args) {
        int income = 543212;
        int spending = 300000;

        int res = profit(income, spending);
        System.out.println("На счету осталось " + res + " рублей");
    }

    public static int profit(int income, int spending) {
        return (income - spending);
    }
}
