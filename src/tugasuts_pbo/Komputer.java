package tugasuts_pbo;

public class Komputer {
    private CPU cpu;
    
    public Komputer(CPU cpu){
        this.cpu = cpu;
    }
    
    public void memasang(CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU "+this.cpu.getCPUData()+" GHz dipasang");
    }
    public void mencabut(CPU cpu){
    this.cpu = cpu;
    System.out.println("CPU "+this.cpu.getCPUData()+" GHz dicabut");
    }
    
    public void cetakInfo(){
        System.out.println("Spesifikasi : "+this.cpu.getCPUData()+" GHz");
    }
}
