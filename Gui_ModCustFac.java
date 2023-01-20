import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Gui_ModCustFac extends JFrame implements ActionListener{

    
    private JLabel indexf= new JLabel("Enter Index of the customer you wish to Modify (int) ");
    private JLabel l11 = new JLabel("Enter Name of factory (Text\"String\") : ");
    private JLabel l22 = new JLabel("Enter id (Text\"String\")");
    private JLabel l33 = new JLabel("Enter address (Text\"String\") ");
    private JLabel l41 = new JLabel("product name (Text\"String\") ");
    private JLabel l42 = new JLabel("product id (Text\"String\") ");
    private JLabel l43 = new JLabel("product price (Number \"double\" ) Ex -> 9.00 ");
    private JLabel l44 = new JLabel("product date (Text\"String\") ");
    
    
    private JTextField indexo = new JTextField(10);
    private JTextField tname1 = new JTextField(10);
    private JTextField tid1 = new JTextField(10);
    private JTextField taddr1 = new JTextField(10);
    private JTextField tpho1 = new JTextField(10);
    private JTextField tpho2 = new JTextField(10);
    private JTextField tpho3 = new JTextField(10);
    private JTextField tpho4 = new JTextField(10);
   
    JTextArea tt = new JTextArea(5,20);
    JScrollPane scroll = new JScrollPane(tt); 
    JDialog dialog = new JDialog();
     
    private  JButton b1 = new JButton("Modify");
     
    
    public Gui_ModCustFac()
    {
        setLayout(new GridLayout(15, 2,3,3));
        b1.setActionCommand("Modify");
        b1.addActionListener(this);
      
      
        tt.setEditable(false);
        
        
        

        add(indexf); add(indexo);
        add(l11);    add(tname1);
        add(l22);    add(tid1);
	    add(l33);    add(taddr1);
        add(l41);    add(tpho1);
        add(l42);    add(tpho2);
        add(l43);    add(tpho3);
        add(l44);    add(tpho4);
        add(b1); 

             

        setTitle(" Modify Factory Customer ");
        setSize(900,900);
        setVisible(true);
    }
    
    public static void main(String []args)
    {
        new Gui_ModCustFac();
    }
   
     public void actionPerformed(ActionEvent e) {
      
    
         if("Modify".equals(e.getActionCommand()))
         {
            int ioio = Integer.parseInt(indexo.getText()) ;
          
            double a = Double.parseDouble(tpho3.getText());
            List <Product>  bb= new ArrayList<>();
      
            bb.add(new Product(tpho1.getText(),tpho2.getText(),a,tpho4.getText()));
            Gui_AddCustoFac.b.set( ioio , new Factories(tname1.getText(),tid1.getText(),taddr1.getText(),bb) );
           
            JFrame vs = new JFrame();
            JOptionPane.showMessageDialog(vs, "You have successfully Modified The Individual customer of index "+indexo.getText());
            
            setVisible(false);
            
         } 
    

}

}

