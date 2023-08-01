public interface AccountInterface {

    /**
     * Liefert den Besitzer des Bankkontos
     */
    String getAccountHolder();

    /**
     * Liefert den aktuellen Kontostand
     */
    float getBalance();

    /**
     * Abheben eines Betrages "amount" (in Euro)
     */
    void withdraw(float amount);

    /**
     * Einzahlen eines Betrages "amount" (in Euro)
     */
    void payIn(float amount);
}