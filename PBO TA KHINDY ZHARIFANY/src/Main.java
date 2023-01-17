import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Motor m=new Motor();
        Penyewa penyewa = new Penyewa();
        Motor motor = new Motor();
        Rental_motor rentalmotor = new Rental_motor();

        System.out.println("== PERSEWAAN MOTOR ==");


        penyewa.output();
        //motor.output();

        int id_motor = motor.getId_motor();
        //System.out.println("ID Motor Dari Main : " + id_motor);

        rentalmotor.output();







        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilihan Pembayaran (1.Credit card or 2.Cash):");

        String paymentMethod = scanner.nextLine();

        System.out.println("Masukkan Jumlah Pembayaran:");
        double paymentAmount = scanner.nextDouble();


        Payment payment;
        if (paymentMethod.equalsIgnoreCase("1"))
        {
            System.out.println("Enter Nomor Kartu Kredit :");
            String cardNumber = scanner.nextLine();

            System.out.println("Enter Expiration Date (mm/yy):");
            String expirationDate = scanner.nextLine();

            System.out.println("Enter Security Code:");
            String securityCode = scanner.nextLine();

            System.out.println("Enter Nama Pada Kartu:");
            String nameOnCard = scanner.nextLine();

            CreditCard creditCard = new CreditCard(cardNumber, expirationDate, securityCode, nameOnCard);
            double amount = paymentAmount;
            creditCard.pay(amount);

        }
        else
        {

            //payment = new Cash();
            Cash cash = new Cash();
            double amount = paymentAmount;
            cash.pay(amount);
        }





    }
}