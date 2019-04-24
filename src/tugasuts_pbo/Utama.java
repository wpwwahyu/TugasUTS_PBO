package tugasuts_pbo;

public class Utama {
    public static void main(String[] args) {
    Intel intel1 = new Intel(2);
    AMD amd1 = new AMD(3);
    Komputer komputer1 = new Komputer(intel1);
    
    komputer1.cetakInfo();
    komputer1.mencabut(intel1);
    komputer1.memasang(amd1);
    komputer1.cetakInfo(); 

    }
 }
