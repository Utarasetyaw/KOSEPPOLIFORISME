package sample;

public class Murid extends Civitas {
    private String nim ;
    private String Kelas;

    public Murid(String nama, String jenis_kelamin, String tanggal_lahir, String tempat_lahir, String nim, String kelas) {
        super(nama, jenis_kelamin, tanggal_lahir, tempat_lahir);
        this.nim = nim;
        Kelas = kelas;
    }

    public Murid() {
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String kelas) {
        Kelas = kelas;
    }
    public Murid tampil(){
        Murid tempTam = new Murid();
        System.out.println("Nim\t\t\t\t : " +getNim());
        super.tampil();
        System.out.println("Kelas\t\t\t : "+getKelas());
        return tempTam;
    }
}
