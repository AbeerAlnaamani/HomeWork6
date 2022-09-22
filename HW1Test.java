public class HW1Test {
    public static void main(String[] args) {
        HW1 abeer = new HW1(1000,10);
        abeer.waitForBalance(1000000);
        System.out.println("your balance will be million after " +abeer.getYear());
    }
}