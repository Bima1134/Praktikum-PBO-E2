/**
 * Nama File    : Garis.java
 * Deskripsi    : Berisi atribut dan method dalam class Garis
 * Pembuat      : ASPRAK PBO E2
 * Tanggal      : Kamis, 27 Februari 2025
 */

public class Garis {
    /*************** ATRIBUT ***************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /*************** METHOD ***************/
    // Konstruktor tanpa parameter
    public Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    // Konstruktor dengan parameter titik awal dan titik akhir
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Selektor (getter) untuk titik awal
    public Titik getTitikAwal() {
        return titikAwal;
    }

    // Mutator (setter) untuk titik awal
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    // Selektor (getter) untuk titik akhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Mutator (setter) untuk titik akhir
    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Selektor untuk counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    // Method untuk mendapatkan panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Method untuk mendapatkan gradien garis
    public double getGradien() {
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        return deltaY / deltaX;
    }

    // Method untuk mendapatkan titik tengah garis
    public Titik getTitikTengah() {
        double midX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double midY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(midX, midY);
    }

    // Method untuk mengecek apakah garis sejajar dengan garis lain
    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // Method untuk mengecek apakah garis tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // Method untuk menampilkan titik awal dan titik akhir garis
    public void printGaris() {
        System.out.print("Garis dari ");
        titikAwal.printTitik();
        System.out.print(" ke ");
        titikAkhir.printTitik();
    }

    // Method untuk menampilkan persamaan garis dalam bentuk y = mx + c
    public void printPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
} // End Class Garis