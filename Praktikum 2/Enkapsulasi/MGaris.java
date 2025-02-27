/**
 * Nama File    : MGaris.java
 * Deskripsi    : Driver main untuk implementasi kelas Garis
 * Pembuat      : ASPRAK PBO E2
 * Tanggal      : Kamis, 27 Februari 2025
 */

public class MGaris {
    public static void main(String[] args) {
        // Membuat objek Garis G1 dengan titik awal (0, 0) dan titik akhir (1, 1)
        Garis G1 = new Garis();
        System.out.println("Garis G1:");
        G1.printGaris();
        System.out.println("Panjang G1: " + G1.getPanjang());
        System.out.println("Gradien G1: " + G1.getGradien());
        System.out.print("Titik Tengah G1: ");
        G1.getTitikTengah().printTitik();
        G1.printPersamaanGaris();

        // Membuat objek Garis G2 dengan titik awal (2, 3) dan titik akhir (4, 5)
        Titik T1 = new Titik(2, 3);
        Titik T2 = new Titik(4, 5);
        Garis G2 = new Garis(T1, T2);
        System.out.println("\nGaris G2:");
        G2.printGaris();
        System.out.println("Panjang G2: " + G2.getPanjang());
        System.out.println("Gradien G2: " + G2.getGradien());
        System.out.print("Titik Tengah G2: ");
        G2.getTitikTengah().printTitik();
        G2.printPersamaanGaris();

        // Membuat objek Garis G3 dengan titik awal (-2, 0) dan titik akhir (0, 4)
        Titik T3 = new Titik(-2, 0);
        Titik T4 = new Titik(0, 4);
        Garis G3 = new Garis(T3, T4);
        System.out.println("\nGaris G3:");
        G3.printGaris();
        System.out.println("Panjang G3: " + G3.getPanjang());
        System.out.println("Gradien G3: " + G3.getGradien());
        System.out.print("Titik Tengah G3: ");
        G3.getTitikTengah().printTitik();
        G3.printPersamaanGaris();

        // Mengecek apakah G1 sejajar dengan G2
        System.out.println("\nApakah G1 sejajar dengan G2? " + G1.isSejajar(G2));

        // Mengecek apakah G1 tegak lurus dengan G3
        System.out.println("Apakah G1 tegak lurus dengan G3? " + G1.isTegakLurus(G3));

        // Menampilkan jumlah objek Garis yang telah dibuat
        System.out.println("\nJumlah Objek Garis = " + Garis.getCounterGaris());
    }
}