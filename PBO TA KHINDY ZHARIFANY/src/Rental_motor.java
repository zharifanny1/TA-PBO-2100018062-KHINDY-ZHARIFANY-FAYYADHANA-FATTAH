
import java.util.Scanner;
import java.io.*;

public class Rental_motor {



    private int id_rental;
    private int tanggal_rental;
    private int id_motor;
    private int tanggal_pengembalian;
    private int jumlah_rental;
    private int total_biaya;
    private int total_bayar;

    static int add(int a,int b){
        return a - b;
    }



    int tanggal_rental()
    {
        return tanggal_rental;
    }
    public int getJumlah_rental() {
        return jumlah_rental;
    }

    public void setJumlah_rental(int jumlah_rental) {
        this.jumlah_rental = jumlah_rental;
    }

    public int getId_rental() {
        return id_rental;
    }

    public void setId_rental(int id_rental) {
        this.id_rental = id_rental;
    }

    public int getTanggal_rental() {
        return tanggal_rental;
    }

    public void setTanggal_rental(int tanggal_rental) {
        this.tanggal_rental = tanggal_rental;
    }

    public int getId_motor() {
        return id_motor;
    }

    public void setId_motor(int id_motor) {
        this.id_motor = id_motor;
    }

    public int getTanggal_pengembalian() {
        return tanggal_pengembalian;
    }

    public void setTanggal_pengembalian(int tanggal_pengembalian) {
        this.tanggal_pengembalian = tanggal_pengembalian;
    }

    public int getTotal_biaya() {
        return total_biaya;
    }

    public void setTotal_biaya(int total_biaya) {
        this.total_biaya = total_biaya;
    }

    public int getTotal_bayar() {
        return total_bayar;
    }

    public void setTotal_bayar(int total_bayar) {
        this.total_bayar = total_bayar;
    }




    public void output(){
        Scanner userinput = new Scanner(System.in);
        System.out.print("Masukkan ID Rental            : ");
        setId_motor(userinput.nextInt());
        System.out.print("Masukkan Tanggal Rental       : ");
        setTanggal_rental(userinput.nextInt());

        //sini

        Motor motor = new Motor();
        motor.output();
        int id_motor = motor.getId_motor();
        String nama_motor = motor.getNama_motor();
        String pabrikan_motor = motor.getPabrikan_motor();
        String warna_motor = motor.getWarna_motor();

        Penyewa penyewa = new Penyewa();
        penyewa.output();
        int id_penyewa=penyewa.getId_penyewa();
        String nama_penyewa=penyewa.getNama_penyewa();



        System.out.print("Masukkan Tanggal Pengembalian : ");
        setTanggal_pengembalian(userinput.nextInt());
        System.out.print("Masukkan Jumlah Rental        : ");
        setJumlah_rental(userinput.nextInt());


        System.out.println("ID Penyewa           : " + id_penyewa);
        System.out.println("Nama Penyewa         : " + nama_penyewa);
        System.out.println("ID Motor             : " + id_motor);
        System.out.println("Tanggal Rental       : " + tanggal_rental);
        System.out.println("Tanggal Pengembalian : " + tanggal_pengembalian);
        System.out.println("Nama Motor           : " + nama_motor);
        System.out.println("Pabrikan Motor       : " + pabrikan_motor);
        System.out.println("Warna Motor          : " + warna_motor);

        try
        {
            FileWriter fw = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Struk                : " + id_penyewa);
            bw.newLine();
            bw.write("ID Penyewa           : " + id_penyewa);
            bw.newLine();
            bw.write("Nama Penyewa         : " + nama_penyewa);
            bw.newLine();
            bw.write("ID Motor             : " + id_motor);
            bw.newLine();
            bw.write("Tanggal Rental       : " + tanggal_rental);
            bw.newLine();
            bw.write("Tanggal Pengembalian : " + tanggal_pengembalian);
            bw.newLine();
            bw.write("Jumlah Rental        : " + jumlah_rental);
            bw.newLine();
            bw.write("Nama Motor           : " + nama_motor);
            bw.newLine();
            bw.write("Pabrikan Motor       : " + pabrikan_motor);
            bw.newLine();
            bw.write("Warna Motor          : " + warna_motor);

            bw.close();
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }








        //System.out.println("Masukkan Total Biaya : ");
        //setTotal_biaya(userinput.nextInt());

        //System.out.println("Masukkan Uang Yang Anda Bayarkan : ");
        //setTotal_bayar(userinput.nextInt());
        //System.out.println("Tanggal Rental : "+tanggal_rental());//output dari atas tadi

        //System.out.println("Kembalian : ");
        //System.out.println(add(total_bayar, total_biaya));

    }
}

