/*
Name:Abdullrahman AL-Saran
id:440016405

Name:Abdalelah AL-howesen
id:440012899

Section: 171
*/

/*
We used Class   ArrayList With All  of our Arrays and most of our methods

*/

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Gui_Main extends JFrame implements ActionListener{
   
    
    private JButton add = new JButton("  Add a new customer ");
    private JButton del = new JButton(" Delete all customers");
    private JButton mod = new JButton(" Modify a customer’s information ");
    private JButton pri = new JButton(" Print All  the customers information ");
    private JButton ex = new JButton(" Exit ");
    
    
      static JDialog dialog = new JDialog();
     
      static gdc bagal;
    
      static JTextArea ff = new JTextArea();
     


      static JTextArea nemo = new JTextArea(5,20);


    public Gui_Main(){
     
        
        add.setFont(new Font("Arial", Font.PLAIN, 30));
        del.setFont(new Font("Arial", Font.PLAIN, 30));
        mod.setFont(new Font("Arial", Font.PLAIN, 30));
        pri.setFont(new Font("Arial", Font.PLAIN, 30));
        ex.setFont(new Font("Arial", Font.PLAIN, 100));
        
        add.setActionCommand("  Add a new customer ");
        add.addActionListener(this);
        pri.setActionCommand(" Print All  the customers information ");
        pri.addActionListener(this);
        del.setActionCommand(" Delete all customers");
        del.addActionListener(this);
        ex.setActionCommand(" Exit ");
        ex.addActionListener(this);
        mod.setActionCommand(" Modify a customer’s information ");
        mod.addActionListener(this);

        ff.setEditable(false);;

        setLayout(new GridLayout(3,2,10,10));
         add(add); 
        add(del); add(mod); 
        add(pri); add(ex);
        


        ////close window////
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("The General Distribution Center");
        setSize(1600,1000);
        setVisible(true);
       

        ///////////////////
    
    
    
    }
    public static void main (String[] args) {
        Gui_Main bbb = new Gui_Main();
        bbb.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
         
       
         
        if("  Add a new customer ".equals(e.getActionCommand()))
        {
          Gui_Choice a = new Gui_Choice();
          a.setVisible(true);
  }
   else if(" Print All  the customers information ".equals(e.getActionCommand())){
    ff.setText("Indiviual Customers : \n "+Gui_AddCustoIndi.b.toString()+ "\n\n\n\n Factory Customers: \n"+Gui_AddCustoFac.b.toString() );
    dialog.add(ff);
    dialog.setSize(900,900);
    dialog.setModal(true);
  dialog.setVisible(true);

  }
  
  else if(" Delete all customers".equals(e.getActionCommand())){
  
    Gui_AddCustoFac.b.clear();
    Gui_AddCustoIndi.b.clear();
    JFrame vs = new JFrame();
    JOptionPane.showMessageDialog(vs, "You have deleted All The Customers successfully");
    
  }

  else if(" Modify a customer’s information ".equals(e.getActionCommand())){

  Gui_ChoiceMod j=new Gui_ChoiceMod();
  j.setVisible(true);
  }
  
  else if(" Exit ".equals(e.getActionCommand())){

    System.exit(0);

  }
  
}
}
