/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class
 * Pembuat : Bima Aditya Aryono
 * Tanggal : 20-02-2025
 */
import java.lang.Math; 

 public class Titik {
    /* Atribut */
    private double absis;
    private double ordinat;
    static int counterTitik=0;

    /* method */
    // Konstruktor untuk membuat titik (absis,ordinat)
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    // Konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
    }

    // Mengembalikan nilai counterTitik()
    static int getCounterTitik(){
        return counterTitik;
    }

    // Getter
    // Mengembalikan Nilai Absis
    double getAbsis(){
        return absis;
    }

    // Mengembalikan nilai Ordinat
    double getOrdinat(){
        return ordinat;
    }

    // Setter
    // Mengset absis titik dengan nilai baru x
    void setAbsis(double x){
        this.absis = x;
    }

    // Mengset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        this.ordinat= y;
    }

    void geser(double x, double y){
        this.absis = absis + x;
        this.ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + this.absis + "," + this.ordinat + ")");
    }

    void printCounterTitik(){
        System.out.println(counterTitik);
    }

    int getKuadran(){
        if (this.absis == 0  && this.ordinat == 0){
            return 0;
        }
        else if (this.absis > 0 && this.ordinat >0){
            return 1;
        } 
        else if(this.absis < 0 && this.ordinat > 0){
            return 2;
        }
        else if(this.absis <0 && this.ordinat < 0){
            return 3;
        }
        else{
            return 4;
        }
    }

    double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    double getJarak(Titik T){
        return Math.sqrt(((this.absis-T.absis)* (this.absis-T.absis))+((this.ordinat-T.ordinat)*(this.ordinat-T.ordinat)));
    }

    void refleksiX(){
        ordinat = -ordinat;
    }

    void refleksiY(){
        absis = -absis;
    }

    Titik getRefleksiX(){
        return new Titik(this.absis, - this.ordinat);
    }

    Titik getRefleksiY(){
        return new Titik(- this.absis, this.ordinat);
    }
} 