import java.util.Scanner;

public class Penyewa extends Rental_motor{
    private int id_penyewa;
    private String nama_penyewa;



    public int getId_penyewa() {
        return id_penyewa;
    }

    public void setId_penyewa(int id_penyewa) {
        this.id_penyewa = id_penyewa;
    }

    public String getNama_penyewa() {
        return nama_penyewa;
    }

    public void setNama_penyewa(String nama_penyewa) {
        this.nama_penyewa = nama_penyewa;
    }

    public void output() {

        Scanner userinput = new Scanner(System.in);
        System.out.print("Masukkan ID Penyewa           : ");
        setId_penyewa(userinput.nextInt());

        System.out.print("Masukkan Nama Penyewa         : ");
        setNama_penyewa(userinput.next());

        //System.out.println("ID Penyewa " + this.id_penyewa);
        //System.out.println("Nama Penyewa " + this.nama_penyewa);
    }
}
