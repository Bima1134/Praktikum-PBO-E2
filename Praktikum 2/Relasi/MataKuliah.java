package Relasi;

public class MataKuliah {
    private String IDMatkul;
    private String nama_MK;
    private int SKS;

    public MataKuliah(){

    }

    public MataKuliah(String IDMatkul, String nama_MK, int SKS){
        this.IDMatkul = IDMatkul;
        this.nama_MK = nama_MK;
        this.SKS = SKS;
    }

    public String getID(){
        return this.IDMatkul;
    }

    public String getNama(){
        return this.nama_MK;
    }

    public int getSKS(){
        return this.SKS;
    }

    public void setID(String IDMatkul){
        this.IDMatkul = IDMatkul;
    }

    public void setNama(String nama_mk){
        this.nama_MK= nama_mk;
    }

    public void setSKS(int SKS){
        this.SKS= SKS;
    }
}
