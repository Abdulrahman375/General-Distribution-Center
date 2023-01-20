import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Gui_ModCustIndi extends JFrame implements ActionListener{
  private JLabel indexI= new JLabel("Enter Index of the customer you wish to Modify (int) ");
    private JLabel l1 = new JLabel("Enter Name of individual (Text\"String\")  : ");
    private JLabel l2 = new JLabel("Enter id (Text\"String\") ");
    private JLabel l3 = new JLabel("Enter address (Text\"String\") ");
    private JLabel l4 = new JLabel("Enter phone (Text\"String\") ");
    
    private JTextField indexe = new JTextField(10);
    private JTextField tname = new JTextField(10);
    private JTextField tid = new JTextField(10);
    private JTextField taddr = new JTextField(10);
    private JTextField tpho = new JTextField(10);
    
    
   
    JTextArea tt = new JTextArea(5,20);
    JScrollPane scroll = new JScrollPane(tt); 
    JDialog dialog = new JDialog();
     
    private  JButton b1 = new JButton("Modify");
     
    
    public Gui_ModCustIndi()
    {
        setLayout(new GridLayout(6, 2,3,3));
        b1.setActionCommand("Modify");
        b1.addActionListener(this);
      
      
        tt.setEditable(false);
        
        
        add(indexI); add(indexe);
        add(l1);     add(tname);
        add(l2);     add(tid);
	    add(l3);     add(taddr);
        add(l4);     add(tpho);
        add(b1); 

              

        setTitle(" Modify  individual customer ");
        setSize(900,900);
        setVisible(true);
    }
    
    public static void main(String []args)
    {
        new Gui_ModCustIndi();
    }
   
     public void actionPerformed(ActionEvent e) {
      
    
         if("Modify".equals(e.getActionCommand()))
         {
            
            int yoyo =Integer.parseInt(indexe.getText()) ;
            
            Gui_AddCustoIndi.b.set( yoyo , new Individual(tname.getText(),tid.getText(),taddr.getText(),tpho.getText()) );
            
            JFrame vs = new JFrame();
            JOptionPane.showMessageDialog(vs, "You have successfully Modified The Individual customer of index "+indexe.getText());
            
            setVisible(false);
       
        
         } 
    

}

}

