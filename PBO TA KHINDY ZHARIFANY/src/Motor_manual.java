public abstract class Motor_manual {private int id_motor;
    private String nama_motor;
    private String pabrikan_motor;
    private String warna_motor;

    public int getId_motor() {
        return id_motor;
    }

    public void setId_motor(int id_motor) {
        this.id_motor = id_motor;
    }

    public String getNama_motor() {
        return nama_motor;
    }

    public void setNama_motor(String nama_motor) {
        this.nama_motor = nama_motor;
    }

    public String getPabrikan_motor() {
        return pabrikan_motor;
    }

    public void setPabrikan_motor(String pabrikan_motor) {
        this.pabrikan_motor = pabrikan_motor;
    }

    public String getWarna_motor() {
        return warna_motor;
    }

    public void setWarna_motor(String warna_motor) {
        this.warna_motor = warna_motor;
    }

    public abstract void rental();
}
