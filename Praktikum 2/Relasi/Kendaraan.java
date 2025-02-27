package Relasi;

public class Kendaraan {
    private String noPlat;
    private String Jenis;

    public Kendaraan(){

    }

    public Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis =  Jenis;
    }

    public String getNoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.Jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat =  noPlat;
    }

    public void setJenis( String Jenis ){
        if (Jenis.equalsIgnoreCase("motor") || Jenis.equalsIgnoreCase("mobil")){
            this.Jenis=Jenis;
        }
        else{
            System.out.println("Jenis Kendaraan harus Motor atau Mobil👍🥺");
        }
    }
}
