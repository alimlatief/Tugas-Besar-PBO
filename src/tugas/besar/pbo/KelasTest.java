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
public class KelasTest implements Serializable {
    public static void main(String[] args){
        
    KelasProses manggil = new KelasProses();
    
        manggil.Load();
        manggil.setNamaRuang(null);
        manggil.setLokasiRuang(null);
        manggil.setProgramStudi(null);
        manggil.inputKontak();
        manggil.analisisKelistrikan();
        manggil.inputLCD();
        manggil.analisisLCD();
        manggil.inputLampu();
        manggil.analisisLampu();
        manggil.inputKipasAngin();
        manggil.analisisKipasAngin();
        manggil.inputAC();
        manggil.analisisAC();
        manggil.inputInternet();
        manggil.inputCCTV();
        manggil.analisisCCTV();
        manggil.Save();
        //bisa konek ke lenovo
    }
}
