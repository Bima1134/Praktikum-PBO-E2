package Relasi;

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(){
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama =  nama;
        this.prodi =  prodi;
        this.listMatkul = new ArrayList<>();
    }

    public String getNim(){
        return this.nim;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    public Dosen getDosenWali(){
        return this.dosenWali;
    }

    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }
    // Setter
    public void setNim(String nim){
        this.nim =  nim;
    }

    public void setNama(String nama){
        this.nama =  nama;
    }

    public void setProdi(String prodi){
        this.prodi =  prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }
    // Menambahkan Matkul
    public void addMatkul(MataKuliah mataKuliah){
        if (this.listMatkul.size() < 50){
            this.listMatkul.add(mataKuliah);
        }
        else{
            System.out.println("List Mata Kuliah Sudah Penuh 🥺");
        }
    }
    // Mendapatkan jumlah SKS
    public int getJumlahSKS(){
        int jumlah =0;
        for (MataKuliah matkul : this.listMatkul){
            jumlah += matkul.getSKS();
        }
        return jumlah;
    }
    // Mendapatkan Jumalh Matkul
    public int getJumlahMatkul(){
        return this.listMatkul.size();
    }
    public void printMhs(){
        System.out.println("NIM \t\t:" + nim);
        System.out.println("Nama \t\t:" + nama);
        System.out.println("Prodi \t\t:" + prodi);
    }
    public void printDetailMhs(){
        printMhs();
        System.out.println("Daftar Mata Kuliah");
        int i;
        for (i=0; i< listMatkul.size() ; i++){
            System.out.println((i+1) + ". " +listMatkul.get(i).getNama());
        }
        System.out.println("Dosen Wali\t:" + dosenWali.getNama());
        System.out.println("Kendaraan\t:" + kendaraan.getJenis());
    }
}
