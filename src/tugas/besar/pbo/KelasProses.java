package tugas.besar.pbo;

import java.util.Scanner;
import javax.swing.JFrame;

public class KelasProses extends JFrame{
    Scanner input = new Scanner(System.in);
    JumlahKondisidanPosisi Kontak = new JumlahKondisidanPosisi();
         
        void IdentitasRuangKelas(){
            System.out.println("Masukan nama ruang: ");
            IRK.setNamaRuang(input.next());
            System.out.println("Masukan lokasi ruang: ");
            IRK.setLokasiRuang(input.next());
            System.out.println("Pilih Program Studi/Fakultas");
            IRK.setProgramStudi(input.next());
        }
        
        
        void ProsesKelistrikan(){
            System.out.println("Jumlah stop kontak: ");
            Kontak.setStopKontakInt(input.nextInt());
            System.out.print("Kondisi stop kontak baik (ya/tidak): ");
            Kontak.setStopKontakKondisi(input.next());
            System.out.print("Posisi stop kontak dekat dosen & dipojok (ya/tidak): ");
            Kontak.setStopKontakPosisi(input.next());
        }
        void AnalisisKelistrikan(){
            if(Kontak.getStopKontakInt()>=4&&Kontak.getStopKontakKondisi().equals("ya")&&Kontak.getStopKontakPosisi().equals("ya")){
                System.out.println("Sesuai");  
            }else{
                if(Kontak.getStopKontakInt()<=4||Kontak.getStopKontakKondisi().equals("tidak")||Kontak.getStopKontakPosisi().equals("tidak")){
                    System.out.println("tidak Sesuai");
                }
            }
        }
        void ProsesLCD(){
            System.out.print("Jumlah kabel LCD: ");
            Kontak.setkabelLCDInt(input.nextInt());
            System.out.print("Kondisi kabel LCD berfungsi (ya/tidak): ");
            Kontak.setkabelLCDKondisi(input.next());
            System.out.print("Posisi kabel LCD dekat dosen (ya/tidak): ");
            Kontak.setkabelLCDPosisi(input.next());
        }
        void AnalisisLCD(){
            if(Kontak.getkabelLCDInt()>=1&&Kontak.getkabelLCDKondisi().equals("ya")&&Kontak.getkabelLCDPosisi().equals("ya")){
                System.out.println("Sesuai");
            }else{
                if(Kontak.getkabelLCDInt()<=1||Kontak.getkabelLCDKondisi().equals("tidak")||Kontak.getkabelLCDPosisi().equals("tidak")){
                    System.out.println("tidak Sesuai");
                }
            }
        }
        void ProsesLampu(){
            System.out.print("Jumlah lampu: ");
            Kontak.setJumlahLampu(input.nextInt());
            System.out.print("Kondisi lampu baik (ya/tidak): ");
            Kontak.setKondisiLampu(input.next());
            System.out.print("Posisi lampu dekat dosen (ya/tidak): ");
            Kontak.setPosisiLampu(input.next());
        }
        void AnalisisLampu(){
            if(Kontak.getJumlahLampu()>=18&&Kontak.getKondisiLampu().equals("ya")&&Kontak.getPosisiLampu().equals("ya")){
                System.out.println("Sesuai");
            }else{
                if(Kontak.getJumlahLampu()<=18||Kontak.getKondisiLampu().equals("tidak")||Kontak.getPosisiLampu().equals("tidak")){
                    System.out.println("tidak Sesuai");
                }
            }
        }
        void ProsesKipasAngin(){
            System.out.print("Jumlah kipas angin: ");
            Kontak.setJumlahKipas(input.nextInt());
            System.out.print("Kondisi kipas angin baik (ya/tidak): ");
            Kontak.setKondisiKipas(input.next());
            System.out.print("Posisi kipas angin diatap ruangan (ya/tidak): ");
            Kontak.setPosisiKipas(input.next());
        }
        void AnalisisKipasAngin(){
            if(Kontak.getJumlahKipas()>=2&&Kontak.getKondisiKipas().equals("ya")&&Kontak.getPosisiKipas().equals("ya")){
                System.out.println("Sesuai");
            }else{
                if(Kontak.getJumlahKipas()<=2||Kontak.getKondisiKipas().equals("tidak")||Kontak.getPosisiKipas().equals("tidak")){
                    System.out.println("tidak Sesuai");
                }
            }
        }
        void ProsesAC(){
            System.out.print("Jumlah AC: ");
            Kontak.setJumlahAC(input.nextInt());
            System.out.print("Kondisi AC baik (ya/tidak): ");
            Kontak.setKondisiAC(input.next());
            System.out.print("Posisi AC disamping/ belakang (ya/tidak): ");
            Kontak.setPosisiAC(input.next());
        }
        void AnalisisAC(){
            if(Kontak.getJumlahAC()>=1&&Kontak.getKondisiAC().equals("ya")&&Kontak.getPosisiAC().equals("ya")){
                System.out.println("Sesuai");
            }else{
                if(Kontak.getJumlahAC()<=1||Kontak.getKondisiAC().equals("tidak")||Kontak.getPosisiAC().equals("tidak")){
                    System.out.println("tidak Sesuai");
                }
            }
        }
        void ProsesInternet(){
            System.out.println("1.UMM hotspot\n2.Premium hotspot\nPilih SSID: ");
            Kontak.setSSID(input.nextInt());
            System.out.print("masukan bandwidth: ");
            Kontak.setBandwidth(input.nextInt());
        }
        void AnalisisInternet(){
            if(Kontak.getSSID()==1){
                System.out.println("Sesuai");
            }else{
                if(Kontak.getSSID()!=1){
                    System.out.println("tidak Sesuai");
                }
            }
        }
        void ProsesCCTV(){
            System.out.print("Jumlah CCTV: ");
            Kontak.setJumlahCCTV(input.nextInt());
            System.out.print("Kondisi CCTV baik (ya/tidak): ");
            Kontak.setKondisiCCTV(input.next());
            System.out.print("Posisi CCTV belakang (ya/tidak): ");
            Kontak.setPosisiCCTV(input.next());
        }
        void AnalisisCCTV(){
            if(Kontak.getJumlahCCTV()>=2&&Kontak.getKondisiCCTV().equals("ya")&&Kontak.getPosisiCCTV().equals("ya")){
                System.out.println("Sesuai");
            }else{
                if(Kontak.getJumlahCCTV()<=2||Kontak.getKondisiCCTV().equals("tidak")||Kontak.getPosisiCCTV().equals("tidak")){
                    System.out.println("tidak Sesuai");
                }
            }
        }
}
