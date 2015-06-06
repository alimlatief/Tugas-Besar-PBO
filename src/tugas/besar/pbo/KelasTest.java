/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar.pbo;

import java.io.Serializable;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Alim
 */
public class KelasTest implements Serializable {
    public static void main(String[] args){
    
    Scanner inputan = new Scanner(System.in);
    KelasProses manggil = new KelasProses();
    
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
        
        System.out.print("1. Save\n2. Load\n3. Delete\nmasukan opsi pilihan: ");
        int pilih = inputan.nextInt();
        if(pilih==1){
            manggil.Save();
        }
        if(pilih==2){
            manggil.Load();
        }
        if(pilih==3){
            manggil.Delete();
        }
        //bisa konek ke lenovo
    }
}
