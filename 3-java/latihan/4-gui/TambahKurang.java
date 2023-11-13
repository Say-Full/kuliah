
/**
 * Class TambahKurang digunakan untuk menguji event pada Java GUI
 * 
 * @author viska
 * @author SayFull
 * @version 21 Des 20
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TambahKurang implements ActionListener
{
    // instance variables - replace the example below with your own
    private JFrame frame;
    private double x;
    private JButton kaliButton, bagiButton;
    private JLabel nilai;

    /**
     * Constructor for objects of class TambahKurang
     */
    public TambahKurang()
    {
        // initialise instance variables
        x = 300.0;
        makeFrame();
        frame.setVisible(true);
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
        frame = new JFrame("Bagi Kali Event");
        frame.setSize(30,10);
        
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout(new BorderLayout());
        
        JPanel p = new JPanel();
        bagiButton = new JButton("/");
        //Register actionlistener pada button /
        bagiButton.addActionListener(this);
        p.add(bagiButton);
        
        kaliButton = new JButton("*");
        //Register actionlistener pada button *
        kaliButton.addActionListener(this);
        p.add(kaliButton);
                
        panel.add(p, BorderLayout.NORTH);
        
        nilai = new JLabel("300.0", SwingConstants.CENTER);
        panel.add(nilai, BorderLayout.CENTER);
        
        //method pack pada frame berguna utk menampilkan frame dan menset ukuran sesuai preferredSize komponen
        frame.pack();
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
     * terhadap event source yg telah didaftarkan pada listener
     * 
     */
    public void actionPerformed(ActionEvent event)
    {
        //cara ini digunakan dgn menguji teks dari button
        
        String command = event.getActionCommand();
        
        if(command.equals("/"))
            this.bagiX();
        else if(command.equals("*"))
            this.kaliX();
        
        nilai.setText(Double.toString(this.getX()));
       
      
        //Jika objek yg diuji berbeda-beda, sebaiknya menggunakan method getSource
        /*
         Object obj = event.getSource();
       
        if(obj == bagiButton)
            this.bagiX();
        else if(obj == kaliButton)
            this.kaliX();
            
        nilai.setText(Double.toString(this.getX()));
        */
    }
}
