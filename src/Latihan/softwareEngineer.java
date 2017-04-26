package Latihan;
public class softwareEngineer extends Employee {
    private double tunjangan = 5500000;
    private double bonus = 300000;
    public softwareEngineer(String nama, int masaKerja) {
        super(nama, masaKerja);
    }

    @Override
    public double getGajiPokok() {
        return super.getGajiPokok() + this.tunjangan; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getBonus() {
        return super.getBonus() + this.bonus; //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
    
    
}
