/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar.pbo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Alim
 */
public class KelasProses extends JumlahKondisidanPosisi implements Serializable{
    
    Scanner input = new Scanner(System.in);
    JumlahKondisidanPosisi file = new JumlahKondisidanPosisi();

    @Override
    public void setNamaRuang(String namaRuang) {
        System.out.println("masukan nama ruangan ");
        file.setNamaRuang(input.nextLine()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLokasiRuang(String lokasiRuang) {
        System.out.println("masukan lokasi ruang ");
        file.setLokasiRuang(input.nextLine()); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void setProgramStudi(String programStudi) {
        System.out.println("masukan program studi ");
        file.setProgramStudi(input.nextLine()); 
    }
    
    void inputKontak(){
        System.out.println("masukan jumlah stop kontak: ");
        file.setIntKontak(input.nextInt());
        System.out.println("masukan kondisi stop kontak baik [y/t]");
        file.setKondisiKontak(input.next());
        System.out.println("masukan posisi stop kontak dipojok ruangan dan dekat dosen [y/t]");
        file.setPosisiKontak(input.next());
    }
    @Override
    String analisisKelistrikan() {
        if(file.getIntKontak()>=4&&file.getKondisiKontak().equals("y")&&file.getPosisiKontak().equals("y")){
            System.out.println("Sesuai");
        }else if(file.getIntKontak()<=4||file.getKondisiKontak().equals("t")||file.getPosisiKontak().equals("t")){
            System.out.println("Tidak Sesuai"); 
        }else{
            System.out.println("Tidak Sesuai");
        }
        return "Sesuai";
    }
    
    void inputLCD(){
        System.out.println("masukan jumlah kabel LCD: ");
        file.setIntKabelLCD(input.nextInt());
        System.out.println("masukan kondisi kabel LCD baik[y/t]");
        file.setKondisiKabelLCD(input.next());
        System.out.println("masukan posisi kabel LCD dekat dosen [y/t]");
        file.setPosisiKabelLCD(input.next());
    }

    @Override
    String analisisLCD() {
        if(file.getIntKabelLCD()>=1&&file.getKondisiKabelLCD().equals("y")&&file.getPosisiKabelLCD().equals("y")){
            System.out.println("Sesuai");
        }else if(file.getIntKabelLCD()<=1||file.getKondisiKabelLCD().equals("t")||file.getPosisiKabelLCD().equals("t")){
            System.out.println("Tidak Sesuai");
        }else{
            System.out.println("Tidak Sesuai");
        }
        return "Sesuai";
    }
    
    void inputLampu(){
        System.out.println("masukan jumlah lampu: ");
        file.setIntLampu(input.nextInt());
        System.out.println("masukan kondisi lampu baik [y/t]");
        file.setKondisiLampu(input.next());
        System.out.println("masukan posisi lampu atap ruangan [y/t]");
        file.setPosisiLampu(input.next());
    }
    @Override
    String analisisLampu() {
        if(file.getIntLampu()>=18&&file.getKondisiLampu().equals("y")&&file.getPosisiLampu().equals("y")){
            System.out.println("Sesuai");
        }else if(file.getIntLampu()<=18||file.getKondisiLampu().equals("t")||file.getPosisiLampu().equals("t")){
            System.out.println("Tidak Sesuai");
        }else{
            System.out.println("Tidak Sesuai");
        }
        return "Sesuai";
    }
    
    
    void inputKipasAngin(){
        System.out.println("masukan jumlah kipas angin: ");
        file.setIntKipas(input.nextInt());
        System.out.println("masukan kondisi kipas angin baik[y/t]");
        file.setKondisiKipas(input.next());
        System.out.println("masukan posisi kipas angin atap ruangan[y/t]");
        file.setPosisiKipas(input.next());
    }
    @Override
    String analisisKipasAngin() {
        if(file.getIntKipas()>=2&&file.getKondisiKipas().equals("y")&&file.getPosisiKipas().equals("y")){
            System.out.println("Sesuai");
        }else if(file.getIntKipas()<=2||file.getKondisiKipas().equals("t")||file.getPosisiKipas().equals("t")){
            System.out.println("Tidak Sesuai");
        }else{
            System.out.println("Tidak Sesuai");
        }
        return "Sesuai";
    }
    
    void inputAC(){
        System.out.println("masukan jumlah AC: ");
        file.setIntAC(input.nextInt());
        System.out.println("masukan kondisi AC baik[y/t]");
        file.setKondisiAC(input.next());
        System.out.println("masukan posisi AC dibelakang samping [y/t]");
        file.setPosisiAC(input.next());
    }
    @Override
    String analisisAC() {
        if(file.getIntAC()>=1&&file.getKondisiAC().equals("y")&&file.getPosisiAC().equals("y")){
            System.out.println("Sesuai");
        }else if(file.getIntAC()<=1||file.getKondisiAC().equals("t")||file.getPosisiAC().equals("t")){
            System.out.println("Tidak Sesuai");
        }else{
            System.out.println("Tidak Sesuai");
        }
        return "Sesuai";
    }
    
    
    void inputInternet(){
        System.out.println("1. UMM Hotspot\n2. UMM Premium\npilih SSID ");
        file.setSSID(input.nextInt());
        System.out.println("masukan Bandwidth: ");
        file.setBandwidth(input.nextInt());
        System.out.println("bisa login [y/t] ");
        file.setPilih(input.next());
    }
    @Override
    String analisisInternet(){
        if(file.getSSID()==1){
            if(file.getBandwidth()>0&&file.getPilih().equals("y")){
                System.out.println("SSID Sesuai dan bisa login");
            }else{
                System.out.println("Tidak Sesuai");
            }
        }else if(file.getSSID()==2){
            if(file.getBandwidth()>0){
                System.out.println("SSID Tidak Sesuai");
            }else{
                System.out.println("Tidak Sesuai");
            }
        }
        return "Sesuai";
    }
    
    void inputCCTV(){
        System.out.println("masukan jumlah CCTV: ");
        file.setIntCCTV(input.nextInt());
        System.out.println("masukan kondisi CCTV baik [y/t]");
        file.setKondisiCCTV(input.next());
        System.out.println("masukan posisi CCTV depan&belakang[y/t]");
        file.setPosisiCCTV(input.next());
    }

    @Override
    String analisisCCTV() {
        if(file.getIntCCTV()>=2&&file.getKondisiCCTV().equals("y")&&file.getPosisiCCTV().equals("y")){
            System.out.println("Sesuai");
        }else if(file.getIntCCTV()<=2||file.getKondisiCCTV().equals("t")||file.getPosisiCCTV().equals("t")){
            System.out.println("Tidak Sesuai");
        }else{
            System.out.println("Tidak Sesuai");
        }
        return "Sesuai";
    }
    
    void Delete(){
        try {
            FileOutputStream data = new FileOutputStream("DATA TB.dat");
            data.close();
        } catch(IOException ad){
            System.out.println("gagal delete");
        }
        
        File database = new File("DATA TB.dat");
        database.delete(); 
        if(database.exists()){
            System.out.println("File DATA TB.dat ada");
        }
        else{
            System.out.println("File DATA TB.dat sudah dihapus");
        }
    }
    void Save(){
        try {
            ObjectOutputStream simpan = new ObjectOutputStream(new FileOutputStream("DATA TB.dat"));
            simpan.writeObject(file);
            simpan.close();
        } catch (FileNotFoundException ex) {
            System.out.println("file tidak bisa");
        } catch (IOException ex){
            System.out.println("gagal simpan");
        }
        
        File database = new File("DATA TB.dat");
        database.canWrite();
        if(database.exists()){
            System.out.println("File Inputan berhasil disimpan");
        }
        else{
            System.out.println("File Inputan gagal simpan");
        }
    }
    void Load(){
        try {
            ObjectInputStream buka = new ObjectInputStream(new FileInputStream("DATA TB.dat"));
            JumlahKondisidanPosisi jkp = (JumlahKondisidanPosisi) buka.readObject();
            System.out.println("\n========== DATA TERSIMPAN ==========");
            System.out.println("nama ruang "+jkp.getNamaRuang());
            System.out.println("lokasi ruang "+jkp.getLokasiRuang());
            System.out.println("program studi "+jkp.getProgramStudi());
            System.out.println("\njumlah kontak "+jkp.getIntKontak());
            System.out.println("kondisi kontak baik "+jkp.getKondisiKontak());
            System.out.println("posisi kontak dekat dosen "+jkp.getPosisiKontak());
            System.out.println(jkp.analisisKelistrikan());
            System.out.println("\njumlah LCD "+jkp.getIntKabelLCD());
            System.out.println("kondisi LCD baik "+jkp.getKondisiKabelLCD());
            System.out.println("posisi LCD dekat dosen "+jkp.getPosisiKabelLCD());
            System.out.println(jkp.analisisLCD());
            System.out.println("\njumlah lampu "+jkp.getIntLampu());
            System.out.println("kondisi lampu baik "+jkp.getKondisiLampu());
            System.out.println("posisi lampu atap ruang "+jkp.getPosisiLampu());
            System.out.println(jkp.analisisLampu());
            System.out.println("\njumlah kipas angin "+jkp.getIntKipas());
            System.out.println("kondisi kipas baik "+jkp.getKondisiKipas());
            System.out.println("posisi kipas atap ruang "+jkp.getPosisiKipas());
            System.out.println(jkp.analisisKipasAngin());
            System.out.println("\nSSID "+jkp.getSSID());
            System.out.println("Bandwidth "+jkp.getBandwidth());
            System.out.println(jkp.analisisInternet());
            System.out.println("\njumlah AC "+jkp.getIntAC());
            System.out.println("kondisi AC baik "+jkp.getKondisiAC());
            System.out.println("posisi AC dibelakang samping "+jkp.getPosisiAC());
            System.out.println(jkp.analisisAC());
            System.out.println("\njumlah CCTV "+jkp.getIntCCTV());
            System.out.println("kondisi CCTV baik "+jkp.getKondisiCCTV());
            System.out.println("posisi CCTV dibelakang dan didepan "+jkp.getPosisiCCTV());
            System.out.println(jkp.analisisCCTV());
            System.out.println("=====================================\n");
            buka.close();
        } catch (FileNotFoundException ex) {
            System.out.println("file telah terhapus");
        } catch (ClassNotFoundException ex){
            System.out.println("kelas tidak bisa dibuka");
        }catch (IOException ex){
            System.out.println("gagal buka");
        }
        
        File database = new File("DATA TB.dat");
        database.canRead();
        if(database.exists()){
            System.out.println("File Load berhasil dibuka");
        }
        else{
            System.out.println("File Load gagal dibuka");
        }
    }
}
