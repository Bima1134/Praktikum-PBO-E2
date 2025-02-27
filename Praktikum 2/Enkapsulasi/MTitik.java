/**
 * Nama File    : MTitik.java
 * Deskripsi    : Driver main untuk implementasi kelas Titik
 * Pembuat      : ASPRAK PBO E2
 * Tanggal      : Kamis, 27 Februari 2025
 */

public class MTitik{
    public static void main(String[] args){
        Titik T1 = new Titik(); // Membuat objek Titik T1(0,0)
        T1.setAbsis(3);         // Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);       // Mengubah ordinat T1 dengan nilai 4
        T1.printTitik();        // Mencetak koordinat T1 ke layar
        T1.geser(3, 4);         // Menggeser T1 sejauh (3, 4)
        T1.printTitik();        // Menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(3);
        T1.setOrdinat(10); 
        T2.printTitik();

        Titik T3 = new Titik();     // Membuat objek titik T1 (0, 0)
        Titik T4 = new Titik(3, 4); // Membuat objek titik T2 (3, 5)

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T4.getCounterTitik());
        T1.printCounterTitik();

        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println("Jarak T4 ke pusat: " + T4.getJarakPusat());
        System.out.println("Jarak T1 ke T4: " + T1.getJarak(T4));

        T1.refleksiX();
        System.out.print("T1 setelah refleksi X: ");
        T1.printTitik();

        T1.refleksiY();
        System.out.print("T1 setelah refleksi Y: ");
        T1.printTitik();

        Titik T5 = T1.getRefleksiX();
        System.out.print("Refleksi X dari T1: ");
        T5.printTitik();

        Titik T6 = T1.getRefleksiY();
        System.out.print("Refleksi Y dari T1: ");
        T6.printTitik();
    }
}