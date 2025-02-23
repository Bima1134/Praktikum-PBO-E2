public class MTitik {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Titik t1 = new Titik(); // membuat variable Titik t1
        Titik t2 = new Titik(6.7,7.8); // membuat variable titik t2
        
        t1.printTitik();
        t2.printTitik();

        Titik t3 = new Titik();

        t3.printCounterTitik();

        int counterTitik= Titik.getCounterTitik(); // menyimpan method class getCounterTitik dengan cara memanggil class titik
        System.out.println("\nJumlah titik ada="+counterTitik);

        System.out.printf("absis dari t1= %.1f Ordinat dari t1 = %.1f",t1.getAbsis(),t1.getOrdinat());
        System.out.println("\nabsis dari t2="+t2.absis+", Ordinat dari t2 ="+t2.ordinat);
        System.out.printf("\nabsis dari t3= %.1f Ordinat dari t3 = %.1f",t3.getAbsis(),t3.getOrdinat());


        System.out.println("\nKuadran t2"+t2.getKuadran());
        System.out.println("\nJarak pusat t1=" +t1.getJarakPusat() );
        System.out.println("\nJrak t1 dan t2 =" + t1.getJarak(t2));

        t2.refleksiX();
        t2.printTitik();
        t2.refleksiY();
        t2.printTitik();

        Titik t5 = t2.getRefleksiX();
        Titik t6 = t2.getRefleksiY();
        t5.printTitik();
        t6.printTitik();
    }

}
