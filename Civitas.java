package sample;

public class Civitas {
    private String nama;
    private String jenis_kelamin;
    private String Tanggal_lahir;
    private String Tempat_lahir;

    public Civitas(String nama, String jenis_kelamin, String tanggal_lahir, String tempat_lahir) {
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        Tanggal_lahir = tanggal_lahir;
        Tempat_lahir = tempat_lahir;
    }

    public Civitas() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getTanggal_lahir() {
        return Tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        Tanggal_lahir = tanggal_lahir;
    }

    public String getTempat_lahir() {
        return Tempat_lahir;
    }

    public void setTempat_lahir(String tempat_lahir) {
        Tempat_lahir = tempat_lahir;
    }

    public Civitas tampil(){
        Civitas tempciv = new Civitas();
        System.out.println("Nama\t\t\t : " + getNama());
        System.out.println("Jenis kelamin\t : " + getJenis_kelamin());
        System.out.println("Tanggal Lahir\t : " + getTanggal_lahir());
        System.out.println("Tempat lahir\t : " + getTempat_lahir());
        return tempciv;
    }

}
