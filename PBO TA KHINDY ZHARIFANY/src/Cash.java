public class Cash implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Membayar " + amount + " Dengan Tunai");
    }
}