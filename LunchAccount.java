public class LunchAccount 
{
    private static int id = 1000;
    int i = 0;
    private double balance = 0;
    private int moneyAdders = 0;
    private int boughtLunches = 0;
    private double moneySpent = 0;
    private String student = "";
    private boolean hasAdded = false;

    public LunchAccount(String student, double startBalance) {
        this.balance = startBalance;
        this.student = student;
        this.id = id;
        id++;
    }

    public void addMoney(double money) {
        if (!hasAdded) {
            moneyAdders ++;
            this.hasAdded = true;
            if (moneyAdders <= 100) {
                this.balance += 20;
            }
        }
        this.balance = balance + money;
    }

    public boolean order(double price) {
        if (price <= balance) 
        {
            balance -= price;
            moneySpent += price;
            boughtLunches++;
            return true;
        }
        return false;
    }

    public double getBalance(){
        return balance;
    }

    public int getLunches(){
        return boughtLunches;
    }

    public double getSpent() {
        return moneySpent;
    }

    public int getID() {
        return id;
    }

}   
