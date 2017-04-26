package Latihan;
public class main {
    public static void main(String[] args) {
        Employee e = new Employee("Andi", 3);
        Employee e1 = new Employee("Budi", 7);
        softwareEngineer s = new softwareEngineer("Caca",2);
        softwareEngineer s1 = new softwareEngineer("Dodi",11);
        projectManager p = new projectManager("Endo",4);
        projectManager p1 = new projectManager("Furq",20);
        
        System.out.println("Total Gaji "+e.getNama()+" : " + e.getGajiPokok());
        System.out.println("Total Gaji "+e1.getNama()+" : " + e1.getGajiPokok());
        System.out.println("Total Gaji "+s.getNama()+" : " + s.getGajiPokok());
        System.out.println("Total Gaji "+s1.getNama()+" : " + s1.getGajiPokok());
        System.out.println("Total Gaji "+p.getNama()+" : " + p.getGajiPokok());
        System.out.println("Total Gaji "+p1.getNama()+" : " + p1.getGajiPokok());
    }
}
