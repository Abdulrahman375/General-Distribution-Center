
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Gui_Choice extends JFrame implements ActionListener{
   
    
    private JButton ind = new JButton("Individual ");
    private JButton fac = new JButton(" Factory ");
    
    
    
      

      


    public Gui_Choice(){
     
        
        ind.setFont(new Font("Arial", Font.PLAIN, 40));
        fac.setFont(new Font("Arial", Font.PLAIN, 40));
       
        
        ind.setActionCommand("Individual ");
        ind.addActionListener(this);
        fac.setActionCommand(" Factory ");
        fac.addActionListener(this);
       

        setLayout(new GridLayout(1,1,25,25));
         add(ind);  add(fac);
        
        


        ////close window////
        
        setTitle("Kind of Customer to add");
        setSize(900,500);
        setVisible(true);
       

        ///////////////////
    
    
    
    }
    public static void main(String[] args) {
       Gui_Choice ccc= new Gui_Choice();
    }

    public void actionPerformed(ActionEvent e) {
         
       
         
        if("Individual ".equals(e.getActionCommand()))
        {
          Gui_AddCustoIndi a = new Gui_AddCustoIndi();
          a.setVisible(true);
          setVisible(false);
  }
   else if(" Factory ".equals(e.getActionCommand())){
        Gui_AddCustoFac b = new Gui_AddCustoFac();
        b.setVisible(true);
        setVisible(false);
  }
  
  
  
}
}