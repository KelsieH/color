public class LunchAccount 
{
    private int id = 1000;
    int i = 0;
    private double balance = 0;
    private double price;
    private int moneyAdders = 0;

    public LunchAccount(String student, double startBalance) {
        this.balance = startBalance;
        this.student = student;
    }

    public addMoney(money) {
        this.balance = balance + money;
        if (moneyAdders <= 100) {
            this.balance += 20;
            moneyAdders += 1;
        }
    }

    public order (String item1, String item2, String item3) {

    }
}   
