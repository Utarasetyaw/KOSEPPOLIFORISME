package sample;

public class Guru extends Civitas {
    private String nip ;

    public Guru(String nama, String jenis_kelamin, String tanggal_lahir, String tempat_lahir, String nip) {
        super(nama, jenis_kelamin, tanggal_lahir, tempat_lahir);
        this.nip = nip;
    }
    public Guru() {
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    public Guru tampil(){
        Guru tempGur = new Guru();
        System.out.println("NIP\t\t\t\t : "+ getNip());
        super.tampil();
        return tempGur;
    }
}
