package tugasuts_pbo;

public class CPU {
    protected String nama;
    protected int kecepatan;
    
    public CPU(String nama, int kecepatan){
        this.nama = nama;
        this.kecepatan = kecepatan;
    }
    
    public String getCPUData(){
        return(this.nama+" "+this.kecepatan);
    }
}
