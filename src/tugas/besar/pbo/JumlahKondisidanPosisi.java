/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar.pbo;

import java.io.Serializable;

/**
 *
 * @author Alim
 */
public class JumlahKondisidanPosisi extends IdentitasRuangKelas implements Serializable{

    String result;
    
    int IntKontak;
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
    private String pilih;
    
    private int IntCCTV;
    private String KondisiCCTV;
    private String PosisiCCTV;

    
    public int getIntKontak() {
        return IntKontak;
    }
    public void setIntKontak(int IntKontak) {
        this.IntKontak = IntKontak;
    }
    public String getKondisiKontak() {
        return KondisiKontak;
    }
    public void setKondisiKontak(String KondisiKontak) {
        this.KondisiKontak = KondisiKontak;
    }
    public String getPosisiKontak() {
        return PosisiKontak;
    }
    public void setPosisiKontak(String PosisiKontak) {
        this.PosisiKontak = PosisiKontak;
    }
    public int getIntKabelLCD() {
        return IntKabelLCD;
    }
    public void setIntKabelLCD(int IntKabelLCD) {
        this.IntKabelLCD = IntKabelLCD;
    }
    public String getKondisiKabelLCD() {
        return KondisiKabelLCD;
    }
    public void setKondisiKabelLCD(String KondisiKabelLCD) {
        this.KondisiKabelLCD = KondisiKabelLCD;
    }
    public String getPosisiKabelLCD() {
        return PosisiKabelLCD;
    }
    public void setPosisiKabelLCD(String PosisiKabelLCD) {
        this.PosisiKabelLCD = PosisiKabelLCD;
    }
    public int getIntLampu() {
        return IntLampu;
    }
    public void setIntLampu(int IntLampu) {
        this.IntLampu = IntLampu;
    }
    public String getKondisiLampu() {
        return KondisiLampu;
    }
    public void setKondisiLampu(String KondisiLampu) {
        this.KondisiLampu = KondisiLampu;
    }
    public String getPosisiLampu() {
        return PosisiLampu;
    }
    public void setPosisiLampu(String PosisiLampu) {
        this.PosisiLampu = PosisiLampu;
    }
    public int getIntKipas() {
        return IntKipas;
    }
    public void setIntKipas(int IntKipas) {
        this.IntKipas = IntKipas;
    }
    public String getKondisiKipas() {
        return KondisiKipas;
    }
    public void setKondisiKipas(String KondisiKipas) {
        this.KondisiKipas = KondisiKipas;
    }
    public String getPosisiKipas() {
        return PosisiKipas;
    }
    public void setPosisiKipas(String PosisiKipas) {
        this.PosisiKipas = PosisiKipas;
    }
    public int getIntAC() {
        return IntAC;
    }
    public void setIntAC(int IntAC) {
        this.IntAC = IntAC;
    }
    public String getKondisiAC() {
        return KondisiAC;
    }
    public void setKondisiAC(String KondisiAC) {
        this.KondisiAC = KondisiAC;
    }
    public String getPosisiAC() {
        return PosisiAC;
    }
    public void setPosisiAC(String PosisiAC) {
        this.PosisiAC = PosisiAC;
    }
    public int getSSID() {
        return SSID;
    }
    public void setSSID(int SSID) {
        this.SSID = SSID;
    }
    public int getBandwidth() {
        return Bandwidth;
    }
    public void setBandwidth(int Bandwidth) {
        this.Bandwidth = Bandwidth;
    }
    public int getIntCCTV() {
        return IntCCTV;
    }
    public void setIntCCTV(int IntCCTV) {
        this.IntCCTV = IntCCTV;
    }
    public String getKondisiCCTV() {
        return KondisiCCTV;
    }
    public void setKondisiCCTV(String KondisiCCTV) {
        this.KondisiCCTV = KondisiCCTV;
    }
    public String getPosisiCCTV() {
        return PosisiCCTV;
    }
    public void setPosisiCCTV(String PosisiCCTV) {
        this.PosisiCCTV = PosisiCCTV;
    }
    
    public String getPilih() {
        return pilih;
    }
    public void setPilih(String pilih) {
        this.pilih = pilih;
    }
    
    String analisisKelistrikan(){
        if(getIntKontak()>=4&&getKondisiKontak().equals("y")&&getPosisiKontak().equals("y")){
            result = "Stop Kontak Sesuai";
        }else if(getIntKontak()<=4||getKondisiKontak().equals("t")||getPosisiKontak().equals("t")){
            result = "Stop Kontak Tidak Sesuai";
        }else{
            result = "Stop Kontak Tidak Sesuai";
        }
        return result;
    }
    String analisisLCD(){
        if(getIntKabelLCD()>=1&&getKondisiKabelLCD().equals("y")&&getPosisiKabelLCD().equals("y")){
            result = "Kabel LCD Sesuai";
        }else if(getIntKabelLCD()<=1||getKondisiKabelLCD().equals("t")||getPosisiKabelLCD().equals("t")){
            result = "Kabel LCD Tidak Sesuai";
        }else{
            result = "Kabel LCD Tidak Sesuai";
        }
        return result;
    }
    String analisisLampu(){
        if(getIntLampu()>=18&&getKondisiLampu().equals("y")&&getPosisiLampu().equals("y")){
            result = "Lampu Sesuai";
        }else if(getIntLampu()<=18||getKondisiLampu().equals("t")||getPosisiLampu().equals("t")){
            result = "Lampu Tidak Sesuai";
        }else{
            result = "Lampu Tidak Sesuai";
        }
        return result;
    }
    String analisisKipasAngin(){
        if(getIntKipas()>=2&&getKondisiKipas().equals("y")&&getPosisiKipas().equals("y")){
            result = "Kipas Angin Sesuai";
        }else if(getIntKipas()<=2||getKondisiKipas().equals("t")||getPosisiKipas().equals("t")){
            result = "Kipas Angin Tidak Sesuai";
        }else{
            result = "Kipas Angin Tidak Sesuai";
        }
        return result;
    }
    String analisisAC(){
        if(getIntAC()>=1&&getKondisiAC().equals("y")&&getPosisiAC().equals("y")){
            result = "AC Sesuai";
        }else if(getIntAC()<=1||getKondisiAC().equals("t")||getPosisiAC().equals("t")){
            result = "AC Tidak Sesuai";
        }else{
            result = "AC Tidak Sesuai";
        }
        return result;
    }
    String analisisInternet(){
        if(getSSID()==1){
            if(getBandwidth()>0&&getPilih().equals("y")){
                result = "SSID Sesuai dan bisa login";
            }else{
                result = "Tidak Sesuai";
            }
        }else if(getSSID()==2){
            if(getBandwidth()>0){
                result = "SSID Tidak Sesuai";
            }else{
                result = "Tidak Sesuai";
            }
        }
        return result;
    }
    String analisisCCTV(){
        if(getIntCCTV()>=2&&getKondisiCCTV().equals("y")&&getPosisiCCTV().equals("y")){
            result = "CCTV Sesuai";
        }else if(getIntCCTV()<=2||getKondisiCCTV().equals("t")||getPosisiCCTV().equals("t")){
            result = "CCTV Tidak Sesuai";
        }else{
            result = "CCTV Tidak Sesuai";
        }
        return result;
    }
}
