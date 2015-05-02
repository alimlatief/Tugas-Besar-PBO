package tugas.besar.pbo;

import javax.swing.JFrame;

public class KelasTest {
    public static void main(String[] args){
        KelasProses manggil = new KelasProses();
        manggil.IdentitasRuangKelas();
        manggil.ProsesKelistrikan();
        manggil.AnalisisKelistrikan();
        manggil.ProsesLCD();
        manggil.AnalisisLCD();
        manggil.ProsesLampu();
        manggil.AnalisisLampu();
        manggil.ProsesKipasAngin();
        manggil.AnalisisKipasAngin();
        manggil.ProsesAC();
        manggil.AnalisisAC();
        manggil.ProsesInternet();
        manggil.AnalisisInternet();
        manggil.ProsesCCTV();
        manggil.AnalisisCCTV();
    }
}
