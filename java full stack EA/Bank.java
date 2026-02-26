public class Bank {
    private int balance ;
    public int getBalance()
    {
        return balance;
    }
    public void setBalance(int balance)
    {
        this.balance=balance;
    }
}
class Main{
    public static void main(String[] args)
    {
        Bank b1 = new Bank();
        b1.setBalance(100);
        Bank b2 = new Bank();
        b2.setBalance(1000);
       System.out.println("b2.getBalance()");
       System.out.println("b1.getBalance()");
    }
}
