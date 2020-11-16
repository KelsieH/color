public class LunchAccountTester
{
    public static void main(String [] args)
    {
        LunchAccount one = new LunchAccount("John", 50);

        System.out.println(one.getBalance());
        System.out.println(one.getLunches());
        System.out.println(one.getSpent());
        System.out.println(one.order(25));
        one.addMoney(5.0);
        System.out.println(one.getBalance());
        System.out.println(one.getLunches());
        System.out.println(one.getSpent());
    }
}