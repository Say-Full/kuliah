
/**
 * class kalibagi2 digunakan untuk membuat event listener 
 * dengan menggunakan inner class
 * 
 * @author viska
 * @author SayFull
 * @version 21 Des 2020
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TambahKurang2
{
    // instance variables - replace the example below with your own
    private JFrame frame;
    private double x;
    private JButton kaliButton, bagiButton;
    private JLabel nilai;

    /**
     * Constructor for objects of class kalibagi
     */
    public TambahKurang2()
    {
        // initialise instance variables
        x = 2112.0;
        makeFrame();
        frame.setVisible(true);
        AksiReaksi();
    }

    /**
     * Method untuk menampilkan dan menutup frame
     * 
     * @param  visible
     */
    public void setVisible(boolean visible)
    {
        // put your code here
        frame.setVisible(visible);
    }
    
    /**
     * Method untuk membuat frame
     */
    private void makeFrame()
    {
        frame = new JFrame("kali bagi Event");
        frame.setSize(300,100);
        
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout(new BorderLayout());
        
        JPanel p = new JPanel();
        bagiButton = new JButton("/");       
        p.add(bagiButton);
        
        kaliButton = new JButton("*");
        p.add(kaliButton);
                
        panel.add(p, BorderLayout.NORTH);
        
        nilai = new JLabel("2112.0", SwingConstants.CENTER);
        panel.add(nilai, BorderLayout.CENTER);
        
        //method pack pada frame berguna utk menampilkan frame dan menset ukuran sesuai preferredSize komponen
        //frame.pack();
    }
    
    /**
     * Method utk mengembalikan nilai x sekarang
     * 
     * @return     nilai x sekarang 
     */
    public double getX()
    {
        // put your code here
        return x;
    }
    
    /**
     * Method utk menambah nilai x dengan 1
     * 
     */
    public void kaliX()
    {
        // put your code here
        x = x * 2;
    }
    
    /**
     * Method utk mengurang nilai x dengan 1
     * 
     */
    public void bagiX()
    {
        // put your code here
        x = x / 2;
    }
    
    /**
     * Method utk melakukan tindakan jika ada event dari pengguna
     * terhadap event source
     * 
     */
    public void AksiReaksi()
    {
        kaliButton.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    kaliX();
                    nilai.setText(Double.toString(getX()));
                }
            }
        );
        
        bagiButton.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    bagiX();
                    nilai.setText(Double.toString(getX()));
                }
            }
        );
    }
}
