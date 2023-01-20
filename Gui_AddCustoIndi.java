import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class Gui_AddCustoIndi extends JFrame implements ActionListener{
    
   
    public static List <Customer> b = new ArrayList<>();
    private JLabel l1 = new JLabel("Enter Name of individual (Text\"String\")  : ");
    private JLabel l2 = new JLabel("Enter id (Text\"String\") ");
    private JLabel l3 = new JLabel("Enter address (Text\"String\") ");
    private JLabel l4 = new JLabel("Enter phone Number (Text\"String\") ");
    

    private JTextField tname = new JTextField(10);
    private JTextField tid = new JTextField(10);
    private JTextField taddr = new JTextField(10);
    private JTextField tpho = new JTextField(10);
    
    

   
    
    static JTextArea tt = new JTextArea(5,20);
    static JScrollPane scroll = new JScrollPane(tt); 
    static  JDialog dialog = new JDialog();
   
    private  JButton b1 = new JButton("Add");

    public Gui_AddCustoIndi()
    {
        setLayout(new GridLayout(5, 2,3,3));
        b1.setActionCommand("Add");
        b1.addActionListener(this);
      
        tt.setEditable(false);
        
        add(l1); add(tname);
        add(l2); add(tid);
	    add(l3); add(taddr);
        add(l4); add(tpho);
        add(b1);

        
       

         //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" Add an Individual Customer ");
        setSize(900,900);
        setVisible(true);
    }
    
    public static void main(String []args)
    {
        new Gui_AddCustoIndi();
    }
   
     public void actionPerformed(ActionEvent e) {
         
       
        
          
    
         if("Add".equals(e.getActionCommand()))
         {
            
            gdc bagala;
            
           
            

            



         
             b.add(new Individual(tname.getText(),tid.getText(),taddr.getText(),tpho.getText()));
             

        bagala = new gdc("bagala",b);
    
    
        JFrame vs = new JFrame();
        JOptionPane.showMessageDialog(vs, "You have successfully added an Individual  Customer");

         setVisible(false);
         } 
    

}

}

