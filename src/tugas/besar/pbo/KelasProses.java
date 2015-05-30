package tugas.besar.pbo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class KelasProses extends JumlahKondisidanPosisi implements Serializable{
    Scanner input = new Scanner(System.in);
    JumlahKondisidanPosisi file = new JumlahKondisidanPosisi() {

        @Override
        String analisisKontak() {
            if(file.getStopKontakInt()>=4&&file.getStopKontakKondisi().equals("ya")&&file.getStopKontakPosisi().equals("ya")){
                result = "sesuai";
            }else if(file.getStopKontakInt()<=4||file.getStopKontakKondisi().equals("tidak")||file.getStopKontakPosisi().equals("tidak")){
                result = "tidak sesuai";
            }
            return result;
        }

        @Override
        String analisisKabelLCD() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        String analisisLampu() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        String analisisKipas() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        String analisisAC() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        String analisisInternet() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        String analisisCCTV() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    IdentitasRuangKelas IRK = new IdentitasRuangKelas();
         
        void IdentitasRuangKelas(){
            
        try {
            ObjectInputStream load = new ObjectInputStream(new FileInputStream("Tugas Besar PBO.txt"));
        }catch(FileNotFoundException ex) {
            System.out.println("tidak ada data");
        }catch(IOException ex){
            System.out.println("gagal buka");
        }
            
            System.out.println("Masukan nama ruang: ");
            IRK.setNamaRuang(input.next());
            System.out.println("Masukan lokasi ruang: ");
            IRK.setLokasiRuang(input.next());
            System.out.println("Pilih Program Studi/Fakultas");
            IRK.setProgramStudi(input.next());
            
            try {
                ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream("Tugas Besar PBO.txt"));
                save.writeObject(IRK);
                save.close();
            }catch (FileNotFoundException ex) {
                System.out.println("file tidak ada");
            }catch(IOException ex){
                System.out.println("gagal simmpan");
            }
        }
        
        
        void InputanUser(){
            System.out.println("Jumlah stop kontak: ");
            file.setStopKontakInt(input.nextInt());
            System.out.print("Kondisi stop kontak baik (ya/tidak): ");
            file.setStopKontakKondisi(input.next());
            System.out.print("Posisi stop kontak dekat dosen & dipojok (ya/tidak): ");
            file.setStopKontakPosisi(input.next());
            
            System.out.print("Jumlah kabel LCD: ");
            file.setkabelLCDInt(input.nextInt());
            System.out.print("Kondisi kabel LCD berfungsi (ya/tidak): ");
            file.setkabelLCDKondisi(input.next());
            System.out.print("Posisi kabel LCD dekat dosen (ya/tidak): ");
            file.setkabelLCDPosisi(input.next());
            
            System.out.print("Jumlah lampu: ");
            file.setJumlahLampu(input.nextInt());
            System.out.print("Kondisi lampu baik (ya/tidak): ");
            file.setKondisiLampu(input.next());
            System.out.print("Posisi lampu dekat dosen (ya/tidak): ");
            file.setPosisiLampu(input.next());
            
            System.out.print("Jumlah kipas angin: ");
            file.setJumlahKipas(input.nextInt());
            System.out.print("Kondisi kipas angin baik (ya/tidak): ");
            file.setKondisiKipas(input.next());
            System.out.print("Posisi kipas angin diatap ruangan (ya/tidak): ");
            file.setPosisiKipas(input.next());
            
            System.out.print("Jumlah AC: ");
            file.setJumlahAC(input.nextInt());
            System.out.print("Kondisi AC baik (ya/tidak): ");
            file.setKondisiAC(input.next());
            System.out.print("Posisi AC disamping/ belakang (ya/tidak): ");
            file.setPosisiAC(input.next());
            
            System.out.println("1.UMM hotspot\n2.Premium hotspot\nPilih SSID: ");
            file.setSSID(input.nextInt());
            System.out.print("masukan bandwidth: ");
            file.setBandwidth(input.nextInt());
            
            System.out.print("Jumlah CCTV: ");
            file.setJumlahCCTV(input.nextInt());
            System.out.print("Kondisi CCTV baik (ya/tidak): ");
            file.setKondisiCCTV(input.next());
            System.out.print("Posisi CCTV belakang (ya/tidak): ");
            file.setPosisiCCTV(input.next());
            
            
            
        }
        void SaveUser(){
            try{
                ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream("Tugas Besar PBO.txt"));
                save.writeObject(IRK);
                save.close();
            }catch(FileNotFoundException a) {
                System.out.println("file gagal");
            }catch(IOException b){
                System.out.println("tidak tersimpan");
            }
        }
        void LoadUser(){
            try{
                ObjectInputStream load = new ObjectInputStream(new FileInputStream("Tugas Besar PBO.txt"));
                IdentitasRuangKelas JKP = (IdentitasRuangKelas) load.readObject();
                System.out.println("nama ruang "+JKP.getNamaRuang());
                System.out.println("lokasi ruang "+JKP.getLokasiRuang());
                System.out.println("program studi "+JKP.getProgramStudi());
                load.close();
            }catch(FileNotFoundException c) {
                System.out.println("file tidak ditemukan");
            }catch(ClassNotFoundException e){
                System.out.println("kelas tidak ditemukan");
            }catch(IOException e){
                System.out.println("tidak terbuka");
            }
        }
        
        
        @Override
        String analisisKabelLCD() {
            if(file.getkabelLCDInt()>=1&&file.getkabelLCDKondisi().equals("ya")&&file.getkabelLCDPosisi().equals("ya")){
                result = "sesuai";
            }else if(file.getkabelLCDInt()<=1||file.getkabelLCDKondisi().equals("tidak")||file.getkabelLCDPosisi().equals("tidak")){
                result = "tidak sesuai";
            }
            return result;
        }
        @Override
        String analisisLampu() {
            if(file.getJumlahLampu()>=18&&file.getKondisiLampu().equals("ya")&&file.getPosisiLampu().equals("ya")){
                result = "sesuai";
            }else if(file.getJumlahLampu()<=18||file.getKondisiLampu().equals("tidak")||file.getPosisiLampu().equals("tidak")){
                result = "tidak sesuai";
            }
            return result;
        }
        @Override
        String analisisKipas() {
            if(file.getJumlahKipas()>=2&&file.getKondisiKipas().equals("ya")&&file.getPosisiKipas().equals("ya")){
                result = "sesuai";
            }else if(file.getJumlahKipas()<=2||file.getKondisiKipas().equals("tidak")||file.getPosisiKipas().equals("tidak")){
                result = "tidak sesuai";
            }
            return result;
        }
        @Override
        String analisisAC() {
            if(file.getJumlahAC()>=1&&file.getKondisiAC().equals("ya")&&file.getPosisiAC().equals("ya")){
                result = "sesuai";
            }else if(file.getJumlahAC()<=1||file.getKondisiAC().equals("tidak")||file.getPosisiAC().equals("tidak")){
                result = "tidak sesuai";
            }
            return result;
        }
        @Override
        String analisisInternet() {
            if(file.getSSID()==1){
                result = "sesuai";
            }else if(file.getSSID()!=1){
                result = "tidak sesuai";
            }
            return result;
        }
        @Override
        String analisisCCTV() {
            if(file.getJumlahCCTV()>=2&&file.getKondisiCCTV().equals("ya")&&file.getPosisiCCTV().equals("ya")){
                result = "sesuai";
            }else if(file.getJumlahCCTV()<=2||file.getKondisiCCTV().equals("tidak")||file.getPosisiCCTV().equals("tidak")){
                result = "tidak sesuai";
            }
            return result;
        }

    @Override
    String analisisKontak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
