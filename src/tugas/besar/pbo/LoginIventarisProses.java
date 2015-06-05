/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar.pbo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.Serializable;
import javax.swing.*;

/**
 *
 * @author Alim
 */
public class LoginIventarisProses extends JFrame implements Serializable{
    
    Scanner input = new Scanner(System.in);
    
    JLabel label;
    JTextField pengguna;
    JPasswordField keyword;
    JButton tombolLogin;
    
    public LoginIventarisProses(){
        super("Login Iventaris");
        setSize(300, 200);
        
        JLabel user = new JLabel("masukan username: ");
        pengguna = new JTextField(null, 10);
        JLabel pass = new JLabel("masukan password: ");
        keyword = new JPasswordField(null, 10);
        keyword.setEchoChar('*');
        
        tombolLogin = new JButton("Login");
        label = new JLabel("masukan username dan Password");
        
        JPanel background = new JPanel();
        background.setLayout(new GridLayout(2, 2, 5, 5));
        background.add(user);
        background.add(pengguna);
        background.add(pass);
        background.add(keyword);
        
        GridBagLayout bag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JPanel backgroun2 = new JPanel();
        backgroun2.setLayout(bag);
        gbc.gridx=0;
        bag.setConstraints(tombolLogin, gbc);
        bag.setConstraints(label, gbc);
        backgroun2.add(tombolLogin);
        backgroun2.add(label);
        getContentPane().add("North", background);
        getContentPane().add("South", backgroun2);
        
        tombolLogin.addActionListener(new LoginIventarisProses.penangananTombol());
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        show();
    }

    class penangananTombol implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            if(s.equals("Login")){
                String namapemakai = pengguna.getText();
                String kode = new String(keyword.getPassword());
                if(namapemakai.compareTo("informatika")==0&&kode.compareTo("kelasc")==0){
                    label.setText("Berhasil Login");
                }else{
                    label.setText("Username atau Password salah!!");
                }
            }
        }
    }
}
