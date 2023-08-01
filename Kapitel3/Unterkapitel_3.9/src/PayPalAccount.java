public class PayPalAccount implements AccountInterface {

    private final String accountHolder;
    private float balance;

    public PayPalAccount(String Holder) {
        accountHolder = Holder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public float getBalance() {
        return balance;
    }

    public void withdraw(float amount) {
        balance -= amount;
    }

    public void payIn(float amount) {
        balance += amount;
    }
}