package sample;

public class DataBase {
    Guru Wahyu = new Guru("Wahyu hidayat","Laki - Laki","19 November 1986","Madiun","84574709556");
    Murid Utara = new Murid("Utara setya","Laki - Laki","20 Desember 2000","Ponorogo","1987837434","PTI A");

    public DataBase tampil(){
        DataBase tempDat = new DataBase();
        System.out.println();
        System.out.println("DATA GURU");
        System.out.println("---------------------------------------------");
        Wahyu.tampil();
        System.out.println("---------------------------------------------");
        System.out.println();
        System.out.println("DATA MURID");
        System.out.println("---------------------------------------------");
        Utara.tampil();
        System.out.println("---------------------------------------------");
        return tempDat;
    }
}
