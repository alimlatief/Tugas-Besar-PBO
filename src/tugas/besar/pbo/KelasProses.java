package tugas.besar.pbo;

import java.util.Scanner;

public class KelasProses extends JumlahKondisidanPosisi{
    Scanner input = new Scanner(System.in);
    JumlahKondisidanPosisi Kontak = new JumlahKondisidanPosisi(){

        @Override
        int analisisKontak(){
            return 0;
        }
        @Override
        int analisisKabelLCD(){
            return 0;
        }
        @Override
        int analisisLampu(){
            return 0;
        }
        @Override
        int analisisKipas(){
            return 0;
        }
        @Override
        int analisisAC(){
            return 0;
        }
        @Override
        int analisisInternet(){
            return 0;
        }
        @Override
        int analisisCCTV(){
            return 0;
        }
    };
    IdentitasRuangKelas IRK = new IdentitasRuangKelas();
         
        void IdentitasRuangKelas(){
            System.out.println("Masukan nama ruang: ");
            IRK.setNamaRuang(input.next());
            System.out.println("Masukan lokasi ruang: ");
            IRK.setLokasiRuang(input.next());
            System.out.println("Pilih Program Studi/Fakultas");
            IRK.setProgramStudi(input.next());
        }
        
        
        void ProsesKontak(){
            System.out.println("Jumlah stop kontak: ");
            Kontak.setStopKontakInt(input.nextInt());
            System.out.print("Kondisi stop kontak baik (ya/tidak): ");
            Kontak.setStopKontakKondisi(input.next());
            System.out.print("Posisi stop kontak dekat dosen & dipojok (ya/tidak): ");
            Kontak.setStopKontakPosisi(input.next());
        }
        @Override
        int analisisKontak() {
            if(Kontak.getStopKontakInt()>=4&&Kontak.getStopKontakKondisi().equals("ya")&&Kontak.getStopKontakPosisi().equals("ya")){
                System.out.println("Sesuai");
            }else if(Kontak.getStopKontakInt()<=4||Kontak.getStopKontakKondisi().equals("tidak")||Kontak.getStopKontakPosisi().equals("tidak")){
                System.out.println("tidak Sesuai");
            }
            return 0;
        }
        void ProsesLCD(){
            System.out.print("Jumlah kabel LCD: ");
            Kontak.setkabelLCDInt(input.nextInt());
            System.out.print("Kondisi kabel LCD berfungsi (ya/tidak): ");
            Kontak.setkabelLCDKondisi(input.next());
            System.out.print("Posisi kabel LCD dekat dosen (ya/tidak): ");
            Kontak.setkabelLCDPosisi(input.next());
        }
        @Override
        int analisisKabelLCD() {
            if(Kontak.getkabelLCDInt()>=1&&Kontak.getkabelLCDKondisi().equals("ya")&&Kontak.getkabelLCDPosisi().equals("ya")){
                System.out.println("Sesuai");
            }else if(Kontak.getkabelLCDInt()<=1||Kontak.getkabelLCDKondisi().equals("tidak")||Kontak.getkabelLCDPosisi().equals("tidak")){
                System.out.println("tidak Sesuai");
            }
            return 0;
        }
        void ProsesLampu(){
            System.out.print("Jumlah lampu: ");
            Kontak.setJumlahLampu(input.nextInt());
            System.out.print("Kondisi lampu baik (ya/tidak): ");
            Kontak.setKondisiLampu(input.next());
            System.out.print("Posisi lampu dekat dosen (ya/tidak): ");
            Kontak.setPosisiLampu(input.next());
        }
        @Override
        int analisisLampu() {
            if(Kontak.getJumlahLampu()>=18&&Kontak.getKondisiLampu().equals("ya")&&Kontak.getPosisiLampu().equals("ya")){
                System.out.println("Sesuai");
            }else if(Kontak.getJumlahLampu()<=18||Kontak.getKondisiLampu().equals("tidak")||Kontak.getPosisiLampu().equals("tidak")){
                System.out.println("tidak Sesuai");
            }
            return 0;
        }
        void ProsesKipasAngin(){
            System.out.print("Jumlah kipas angin: ");
            Kontak.setJumlahKipas(input.nextInt());
            System.out.print("Kondisi kipas angin baik (ya/tidak): ");
            Kontak.setKondisiKipas(input.next());
            System.out.print("Posisi kipas angin diatap ruangan (ya/tidak): ");
            Kontak.setPosisiKipas(input.next());
        }
        @Override
        int analisisKipas() {
            if(Kontak.getJumlahKipas()>=2&&Kontak.getKondisiKipas().equals("ya")&&Kontak.getPosisiKipas().equals("ya")){
                System.out.println("Sesuai");
            }else if(Kontak.getJumlahKipas()<=2||Kontak.getKondisiKipas().equals("tidak")||Kontak.getPosisiKipas().equals("tidak")){
                System.out.println("tidak Sesuai");
            }
            return 0;
        }
        void ProsesAC(){
            System.out.print("Jumlah AC: ");
            Kontak.setJumlahAC(input.nextInt());
            System.out.print("Kondisi AC baik (ya/tidak): ");
            Kontak.setKondisiAC(input.next());
            System.out.print("Posisi AC disamping/ belakang (ya/tidak): ");
            Kontak.setPosisiAC(input.next());
        }
        @Override
        int analisisAC() {
            if(Kontak.getJumlahAC()>=1&&Kontak.getKondisiAC().equals("ya")&&Kontak.getPosisiAC().equals("ya")){
                System.out.println("Sesuai");
            }else if(Kontak.getJumlahAC()<=1||Kontak.getKondisiAC().equals("tidak")||Kontak.getPosisiAC().equals("tidak")){
                System.out.println("tidak Sesuai");
            }
            return 0;
        }
        void ProsesInternet(){
            System.out.println("1.UMM hotspot\n2.Premium hotspot\nPilih SSID: ");
            Kontak.setSSID(input.nextInt());
            System.out.print("masukan bandwidth: ");
            Kontak.setBandwidth(input.nextInt());
        }
        @Override
        int analisisInternet() {
            if(Kontak.getSSID()==1){
                System.out.println("Sesuai");
            }else if(Kontak.getSSID()!=1){
                System.out.println("tidak Sesuai");
            }
            return 0;
        }
        void ProsesCCTV(){
            System.out.print("Jumlah CCTV: ");
            Kontak.setJumlahCCTV(input.nextInt());
            System.out.print("Kondisi CCTV baik (ya/tidak): ");
            Kontak.setKondisiCCTV(input.next());
            System.out.print("Posisi CCTV belakang (ya/tidak): ");
            Kontak.setPosisiCCTV(input.next());
        }
        @Override
        int analisisCCTV() {
            if(Kontak.getJumlahCCTV()>=2&&Kontak.getKondisiCCTV().equals("ya")&&Kontak.getPosisiCCTV().equals("ya")){
                System.out.println("Sesuai");
            }else if(Kontak.getJumlahCCTV()<=2||Kontak.getKondisiCCTV().equals("tidak")||Kontak.getPosisiCCTV().equals("tidak")){
                System.out.println("tidak Sesuai");
            }
            return 0;
        }
}
