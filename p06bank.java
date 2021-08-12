class Bank {
    String DepositorName, AccountType;
    float balance;
    int accountNumber;

    void getValue(String userName, String types, float bal, int accNum) {
        DepositorName = userName;
        AccountType = types;
        balance = bal;
        accountNumber = accNum;
    }

    void Display() {
        System.out.println(DepositorName);
        System.out.println("Rs. " + balance);
    }

    void Deposit(float value) {
        balance = balance + value;
    }

    void Withdraw(float val) {
        if (balance > val) {
            balance = balance - val;
        } else {
            System.out.println("Insufficient amount!");
        }
    }

}

public class p06bank {
    public static void main(String args[]) {
        Bank user = new Bank();
        user.getValue("ABC", "Recursive", 40000.60f, 123);
        user.Display();
        user.Deposit(4700);
        user.Display();

        user.Withdraw(999999999);
        user.Display();
        user.Withdraw(999);
        user.Display();

    }
}
