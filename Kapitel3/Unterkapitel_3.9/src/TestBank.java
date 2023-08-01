public class TestBank {
    public static void main(String[] args) {

        Bank bank = new Bank();

        PayPalAccount dagoberts = new PayPalAccount("Dagobert");
        PayPalAccount donalds = new PayPalAccount("Donald");

        dagoberts.payIn(10000.0f);

        bank.transfer(dagoberts, donalds, 150.50f);

    }
}