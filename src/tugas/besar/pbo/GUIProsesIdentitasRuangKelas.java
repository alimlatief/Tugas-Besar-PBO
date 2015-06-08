/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar.pbo;

import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Alim
 */
public class GUIProsesIdentitasRuangKelas extends JFrame{
    IdentitasRuangKelas identitas = new IdentitasRuangKelas();
    
    Label hasil;
    JTextField namaRuang;
    JTextField lokasiRuang;
    JTextField programStudi;
    JButton tombolSave;
    JButton tombolLanjut;
    JButton tombolLoad;
    CardLayout tumptombolEditukan = new CardLayout();
    
    public static void main(String[] args) {
        GUIProsesIdentitasRuangKelas tampil = new GUIProsesIdentitasRuangKelas();
        tampil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tampil.setVisible(true);
    }
    
    public GUIProsesIdentitasRuangKelas(){
        super("Identitas Ruang Kelas");
        setSize(350, 250);
        
        JLabel labelNama = new JLabel("masukan nama ruang");
        namaRuang = new JTextField(null, 5);
        JLabel labelLokasi = new JLabel("masukan lokasi ruang");
        lokasiRuang = new JTextField(null, 5);
        JLabel labelProgramStudi = new JLabel("masukan program studi");
        programStudi = new JTextField(null, 10);
        
        tombolLoad = new JButton("Load");
        tombolSave = new JButton("Save");
        tombolLanjut = new JButton("Selanjutnya");
        
        JPanel layar = new JPanel();
        layar.setLayout(new GridLayout(3, 2, 0, 10));
        layar.add(labelNama);
        layar.add(namaRuang);
        layar.add(labelLokasi);
        layar.add(lokasiRuang);
        layar.add(labelProgramStudi);
        layar.add(programStudi);
        
        GridBagConstraints posisi = new GridBagConstraints();
        posisi.weightx = 0.1;
        
        GridBagLayout layout = new GridBagLayout();
        layout.setConstraints(tombolLoad, posisi);
        layout.setConstraints(tombolSave, posisi);
        layout.setConstraints(tombolLanjut, posisi);
        
        JPanel tampilanTombol = new JPanel();
        tampilanTombol.setLayout(layout);
        tampilanTombol.add(tombolLoad);
        tampilanTombol.add(tombolSave);
        tampilanTombol.add(tombolLanjut);
        
        getContentPane().add("North" ,layar);
        getContentPane().add(tampilanTombol);
        
        tombolLoad.addActionListener(new GUIProsesIdentitasRuangKelas.eksekusiLoad());
        tombolSave.addActionListener(new GUIProsesIdentitasRuangKelas.eksekusiSave());
        tombolLanjut.addActionListener(new GUIProsesIdentitasRuangKelas.eksekusiLanjut());
    }
    
    class eksekusiLoad implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            
        }
    }
    
    class eksekusiSave implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String simpan = e.getActionCommand();
            if(simpan.equals("Save")){
                String namaruang = namaRuang.getText();
                String lokasiruang = lokasiRuang.getText();
                String programstudi = programStudi.getText();
                try {
                    FileWriter tulis = new FileWriter(new File("DATA SIMPAN.dat"));
                    tulis.write(namaruang);
                    tulis.write(lokasiruang);
                    tulis.write(programstudi);
                    tulis.flush();
                    tulis.close();
                    hasil.setText("berhasilsimpan");
                } catch (IOException ex) {
                    hasil.setText("gagal simpan");
                }
            }
        }
    }

    class eksekusiLanjut implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String lanjut = e.getActionCommand();
            if(lanjut.equals("Selanjutnya")){
                
            }
        }
    }

}
