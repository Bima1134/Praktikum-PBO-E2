package Relasi;

public class Dosen {
    // Atribut
    private String nip;
    private String nama;
    private String prodi;
    
    // method
    // konstruktor

    public Dosen(){
        
    }

    public Dosen( String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }
    // Selektor (getter)
    public String getNip(){
        return this.nip;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }
    // Mutator (setter)
    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

}

