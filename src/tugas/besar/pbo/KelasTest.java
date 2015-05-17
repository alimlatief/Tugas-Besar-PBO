package tugas.besar.pbo;

public class KelasTest {
    public static void main(String[] args){
        KelasProses manggil = new KelasProses();
        manggil.IdentitasRuangKelas();
        
        manggil.ProsesKontak();
        manggil.analisisKontak();
        manggil.ProsesLCD();
        manggil.analisisKabelLCD();
        manggil.ProsesLampu();
        manggil.analisisLampu();
        manggil.ProsesKipasAngin();
        manggil.analisisKipas();
        manggil.ProsesAC();
        manggil.analisisAC();
        manggil.ProsesInternet();
        manggil.analisisInternet();
        manggil.ProsesCCTV();
        manggil.analisisCCTV();
    }
}
