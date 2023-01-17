public class CreditCard implements Payment {
    private String cardNumber;
    private String expirationDate;
    private String securityCode;
    private String nameOnCard;

    public CreditCard(String cardNumber, String expirationDate, String securityCode, String nameOnCard) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.nameOnCard = nameOnCard;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Membayar " + amount + " Dengan Kartu Kredit: " + cardNumber);
    }
}