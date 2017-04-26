package Latihan;
public class projectManager extends Employee {
    
    private double tunjangan = 6000000;
    private  double bonus = 450000;
    public projectManager(String nama, int masaKerja) {
        super(nama, masaKerja);
    }

    @Override
    public double getBonus() {
        return super.getBonus()+this.bonus; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getGajiPokok() {
        if(masaKerja>=10){
            return super.getGajiPokok()+this.tunjangan+700000;
        }else{
            return super.getGajiPokok()+this.tunjangan+225000;
        }
    }
    
    
    
    
    
    
}
