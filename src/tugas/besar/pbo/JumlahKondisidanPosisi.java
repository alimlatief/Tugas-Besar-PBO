package tugas.besar.pbo;

abstract public class JumlahKondisidanPosisi {
    
    abstract int analisisKontak();
    abstract int analisisKabelLCD();
    abstract int analisisLampu();
    abstract int analisisKipas();
    abstract int analisisAC();
    abstract int analisisInternet();
    abstract int analisisCCTV();
    
    private int IntKontak;
    private String KondisiKontak;
    private String PosisiKontak;
    
    private int IntKabelLCD;
    private String KondisiKabelLCD;
    private String PosisiKabelLCD;
    
    private int IntLampu;
    private String KondisiLampu;
    private String PosisiLampu;
    
    private int IntKipas;
    private String KondisiKipas;
    private String PosisiKipas;
    
    private int IntAC;
    private String KondisiAC;
    private String PosisiAC;
    
    private int SSID;
    private int Bandwidth;
    
    private int IntCCTV;
    private String KondisiCCTV;
    private String PosisiCCTV;
    
    public void setStopKontakInt(int Kon){
        this.IntKontak = Kon;
    }
    public int getStopKontakInt(){
        return IntKontak;
    }
    public void setStopKontakKondisi(String K){
        this.KondisiKontak = K;
    }
    public String getStopKontakKondisi(){
        return KondisiKontak;
    }
    public void setStopKontakPosisi(String Pos){
        this.PosisiKontak = Pos;
    }
    public String getStopKontakPosisi(){
        return PosisiKontak;
    }
    public void setkabelLCDInt(int lcdint){
        this.IntKabelLCD = lcdint;
    }
    public int getkabelLCDInt(){
        return IntKabelLCD;
    }
    public void setkabelLCDKondisi(String lcdkondisi){
        this.KondisiKabelLCD = lcdkondisi;
    }
    public String getkabelLCDKondisi(){
        return KondisiKabelLCD;
    }
    public void setkabelLCDPosisi(String lcdposisi){
        this.PosisiKabelLCD = lcdposisi;
    }
    public String getkabelLCDPosisi(){
        return PosisiKabelLCD;
    }
    public void setJumlahLampu(int Jlampu){
        this.IntLampu = Jlampu;
    }
    public int getJumlahLampu(){
        return IntLampu;
    }
    public void setKondisiLampu(String Klampu){
        this.KondisiLampu = Klampu;
    }
    public String getKondisiLampu(){
        return KondisiLampu;
    }
    public void setPosisiLampu(String Plampu){
        this.PosisiLampu = Plampu;
    }
    public String getPosisiLampu(){
        return PosisiLampu;
    }
    public void setJumlahKipas(int Jkipas){
        this.IntKipas = Jkipas;
    }
    public int getJumlahKipas(){
        return IntKipas;
    }
    public void setKondisiKipas(String Kkipas){
        this.KondisiKipas = Kkipas;
    }
    public String getKondisiKipas(){
        return KondisiKipas;
    }
    public void setPosisiKipas(String Pkipas){
        this.PosisiKipas = Pkipas;
    }
    public String getPosisiKipas(){
        return PosisiKipas;
    }
    public void setJumlahAC(int JAC){
        this.IntAC = JAC;
    }
    public int getJumlahAC(){
        return IntAC;
    }public void setKondisiAC(String KAC){
        this.KondisiAC = KAC;
    }
    public String getKondisiAC(){
        return KondisiAC;
    }
    public void setPosisiAC(String PAC){
        this.PosisiAC = PAC;
    }
    public String getPosisiAC(){
        return PosisiAC;
    }
    public void setSSID(int ssid){
        this.SSID = ssid;
    }
    public int getSSID(){
        return SSID;
    }
    public void setBandwidth(int bandwith){
        this.Bandwidth = bandwith;
    }
    public int getBandwidth(){
        return Bandwidth;
    }
    public void setJumlahCCTV(int JCCTV){
        this.IntCCTV = JCCTV;
    }
    public int getJumlahCCTV(){
        return IntCCTV;
    }
    public void setKondisiCCTV(String KCCTV){
        this.KondisiCCTV = KCCTV;
    }
    public String getKondisiCCTV(){
        return KondisiCCTV;
    }
    public void setPosisiCCTV(String PCCTV){
        this.PosisiCCTV = PCCTV;
    }
    public String getPosisiCCTV(){
        return PosisiCCTV;
    }
}
