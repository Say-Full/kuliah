
/**
 * Class CalcInterface hanya menampilkan interface
 * dari kalkulator sederhana
 * 
 * @author viska 
 * @version 5 Des 2011
 */

import javax.swing.*;
import java.awt.*;

public class CalcInterface
{
    // instance variables - replace the example below with your own
    private JFrame frame;

    /**
     * Constructor for objects of class CalcInterface
     */
    public CalcInterface()
    {
        // initialise instance variables
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
        frame = new JFrame("Calculator Interface");
        frame.setSize(300, 200);
        
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout(new BorderLayout());
        
        JTextField teks = new JTextField();
        panel.add(teks, BorderLayout.NORTH);       
        
        //panel.add(new JTextField(), BorderLayout.NORTH);
        
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4,4));
        p.add(new JButton("7"));
        p.add(new JButton("8"));
        p.add(new JButton("9"));
        p.add(new JButton("/"));
        p.add(new JButton("4"));
        p.add(new JButton("5"));
        p.add(new JButton("6"));
        p.add(new JButton("*"));
        p.add(new JButton("1"));
        p.add(new JButton("2"));
        p.add(new JButton("3"));
        p.add(new JButton("-"));
        p.add(new JButton("0"));
        p.add(new JButton("."));
        p.add(new JButton("+"));
        p.add(new JButton("="));
        panel.add(p, BorderLayout.CENTER);
        
        //method pack pada frame berguna utk menampilkan frame dan menset ukuran sesuai preferredSize komponen
        frame.pack();
    }
}
