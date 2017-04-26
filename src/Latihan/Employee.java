package Latihan;
public class Employee {
    private String nama;
    public int masaKerja;
    private double gajiPokok = 2500000, bonus;

    public Employee(String nama, int masaKerja) {
        this.nama = nama;
        this.masaKerja = masaKerja;
    }

    public String getNama() {
        return nama;
    }
    
    public int getMasaKerja() {
        return masaKerja;
    }

    public double getGajiPokok() {
        return gajiPokok+getBonus();
    }

    public double getBonus() {
        if(this.masaKerja>5){
            return bonus=250000;
        }else{
            return bonus=0;
        }
    }
}
