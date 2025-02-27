/**
 * Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : ASPRAK PBO E2
 * Tanggal      : Kamis, 27 Februari 2025
 */

public class Titik {
    /*************** ATRIBUT ***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /*************** METHOD ***************/
    // Konstruktor untuk membuat Titik(0, 0)
    public Titik() {
        this(0,0);
    }

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    // Mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    // Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik ("+ absis + "," + ordinat + ")");
    }

    // Mencetak nilai counterTitik
    public void printCounterTitik(){
        System.out.println(counterTitik);
    }

    // Mengembalikan kuadran titik (Asumsi: Angka 0 termasuk Bilangan Positif)
    public int getKuadran(){
        if (absis >= 0 && ordinat >= 0) {
            return 1;
        } else if (absis < 0 && ordinat >= 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    // Mengembalikan jarak titik dengan titik pusat (0, 0)
    public double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Mengembalikan jarak titik dengan titik T
    public double getJarak(Titik T){
        double a = this.absis - T.getAbsis();
        double b = this.ordinat - T.getOrdinat();
        return Math.sqrt(a * a + b * b);
    }

    // Merefleksikan titik dengan sumbu X
    public void refleksiX(){
        ordinat = -ordinat;
    }

    // Merefleksikan titik dengan sumbu Y
    public void refleksiY(){
        absis = -absis;
    }

    // Menghasilkan refleksi dari titik terhadap sumbu X
    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    // Menghasilkan refleksi dari titik terhadap sumbu Y
    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }
} // End Class Titik