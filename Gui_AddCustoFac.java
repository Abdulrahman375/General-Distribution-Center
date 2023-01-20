import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class Gui_AddCustoFac extends JFrame implements ActionListener{
    
   
    public static  List < Product>  aa= new ArrayList<>();
    public static List <Customer> b = new ArrayList<>();
    
    
    

    private JLabel l11 = new JLabel("Enter Name of factory (Text\"String\") : ");
    private JLabel l22 = new JLabel("Enter id (Text\"String\")");
    private JLabel l33 = new JLabel("Enter address (Text\"String\") ");
    private JLabel l41 = new JLabel("product name (Text\"String\") ");
    private JLabel l42 = new JLabel("product id (Text\"String\") ");
    private JLabel l43 = new JLabel("product price (Number \"double\")  Ex -> 9.00  ");
    private JLabel l44 = new JLabel("product date (Text\"String\") ");
    private JLabel l71 = new JLabel("Add");

    private JTextField tname1 = new JTextField(10);
    private JTextField tid1 = new JTextField(10);
    private JTextField taddr1 = new JTextField(10);
    private JTextField tpho1 = new JTextField(10);
    private JTextField tpho2 = new JTextField(10);
    private JTextField tpho3 = new JTextField(10);
    private JTextField tpho4 = new JTextField(10);
    
   
    
    static JTextArea tt = new JTextArea(5,20);
    static JScrollPane scroll = new JScrollPane(tt); 
    static  JDialog dialog = new JDialog();
   
    private  JButton b1 = new JButton("Add");

    public Gui_AddCustoFac()
    {
        setLayout(new GridLayout(9, 2,3,3));
        b1.setActionCommand("Add");
        b1.addActionListener(this);
      
        tt.setEditable(false);

        
        add(l11); add(tname1);
        add(l22); add(tid1);
	    add(l33); add(taddr1);
        add(l41); add(tpho1);
        add(l42); add(tpho2);
        add(l43); add(tpho3);
        add(l44); add(tpho4);
        add(l71); 
        add(b1); 

         //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" Add a Factory Customer ");
        setSize(900,900);
        setVisible(true);
    }
    
    public static void main(String []args)
    {
        new Gui_AddCustoFac();
    }
   
     public void actionPerformed(ActionEvent e) {
         
       
        
          
    
         if("Add".equals(e.getActionCommand()))
         {
            
            gdc bagala;
            
           
            

             double a = Double.parseDouble(tpho3.getText());



         
             aa.add(new Product(tpho1.getText(),tpho2.getText(),a,tpho4.getText()));
             b.add(new Factories(tname1.getText(),tid1.getText(),taddr1.getText(),aa));
             
         

        bagala = new gdc("bagala",b);
    
        JFrame vs = new JFrame();
    JOptionPane.showMessageDialog(vs, "You have successfully added a Factory  Customer");
setVisible(false);
         } 
    

}

}

