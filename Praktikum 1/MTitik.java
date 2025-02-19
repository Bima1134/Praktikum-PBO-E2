public class MTitik {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        titik t1 = new titik(); // membuat variable titik t1
        titik t2 = new titik(); // membuat variable titik t2

        int counterTitik= titik.getCounterTitik(); // menyimpan method class getCounterTitik dengan cara memanggil class titik

        t1.setAbsis(10);
        t2.setOrdinat(6.5);

        titik t3 = new titik(5,6);

        System.out.printf("absis dari t1= %.1f Ordinat dari t1 = %.1f",t1.getAbsis(),t1.getOrdinat());
        System.out.println("\nabsis dari t2="+t2.absis+", Ordinat dari t2 ="+t2.ordinat);
        System.out.printf("absis dari t3= %.1f Ordinat dari t3 = %.1f",t3.getAbsis(),t3.getOrdinat());
        System.out.println("\nJumlah titik ada="+counterTitik);

    }

}
