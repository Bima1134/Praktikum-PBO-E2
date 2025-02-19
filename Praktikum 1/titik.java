public class titik {
    // atribut

    // objek
    double absis;
    double ordinat;

    //class
    static int counterTitik;
    // method

    //konstruktor
    titik(double absis, double ordinat){  // konstruktor mendefine absis dan ordinat
        counterTitik++;
        this.absis=absis;
        this.ordinat=ordinat;
    }

    titik(){ // konstruktor di titik 90,0)
        counterTitik++;
        absis=0;
        ordinat=0;
    }
    // mutator / setter objek
    void setAbsis(double a){ // set absis dengan input
        absis=a;
    }

    void setOrdinat(double a){ // set ordinat dengan input
        ordinat=a;
    }

    // selektor/getter objek
    double getAbsis(){ // mendapatkan nilai absis dan dikembalikan dengan nilai real
        return absis;
    }

    double getOrdinat(){ // mendapatkan nilai ordinat dan dikembalikan dengan nilai real
        return ordinat;
    }

    // selektor class 

    static int getCounterTitik(){ // method class mendapatkan jumlah titik
        return counterTitik;
    }
}
