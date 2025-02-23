public class Titik {
    /* ATRIBUT */
    double absis;
    double ordinat;
    static int counterTitik = 0;
 
    /* METHOD */
    // kontruktor untuk membuat titik

    // Titik() {
    //     absis = 0;
    //     ordinat = 0;
    //     counterTitik++;
    // }
    
    Titik(){
        this (0,0);
    }
    
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //counter titik dengan this untuk objek
    void printCounterTitik(){
        System.out.println(counterTitik);
    }

    // mengembalikan nilai absis
    double getAbsis() {
       return absis;
    }
 
    // mengembalikan nilai ordinat
    double getOrdinat() {
       return ordinat;
    }
    
    // mengeset nilai absis
    void setAbsis(double x) {
       absis = x;
    }
    
    // mengeset nilai ordinat
    void setOrdinat(double y) {
       ordinat = y;
    }
 
    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
       absis += x;
       ordinat += y;
    }
 
    // mencetak koordinat titik
    void printTitik() {
       System.out.println("Titik(" + absis + "," + ordinat + ")");
    }

    // mengembalikan posisi kuadran dari sebuah titik bedasarkan absis dan ordinatnya
    int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        }
        else if (absis < 0 && ordinat > 0){
            return 2;
        }
        else if(absis < 0 && ordinat < 0){
            return 3;
        }
        else if (absis >0 && ordinat < 0){
            return 4;
        }
        else{
            return -1;
        }
    }

    // mengembalikan nilai jarak sebuh titik ke titik pusat
    double getJarakPusat(){
        return (Math.sqrt((absis*absis )+(ordinat*ordinat)));
    } 

    // mengembalikan nilai jarak antara dua buah titik
    double getJarak(Titik T){
        // Titik T = new Titik();
        return (Math.sqrt(((T.getAbsis()-absis)*(T.getAbsis()-absis))+((T.getOrdinat()-ordinat)*(T.getOrdinat()-ordinat))));
    }

    // mmerefleksikan sebuah titik terhadap sumbu x
    void refleksiX(){
        ordinat = ordinat * (-1);
    }

    // merefleksikan sebuah titik terhadap sumbu Y
    void refleksiY(){
        absis = absis * (-1);
    }

    // mengembalikan sebuah titik baru yang merupakan hasil refleksi titik sebelumnya terhadap sumbu x
    Titik getRefleksiX(){
        Titik T = new Titik ();
        T.ordinat = ordinat * (-1);
        T.absis = absis;
        return T;
    }

    // mengembalikan sebuah titik baru yang merupakan hasil refleksi titik sebelumnya terhadap sumbu y
    Titik getRefleksiY(){
        Titik T = new Titik ();
        T.absis = absis * (-1);
        T.ordinat = ordinat;
        return T;
        }    
}