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

import java.util.*;
public class gdc{

       String name;

       List <Customer> customer =new ArrayList<>(); 

       //Constructor 
       public gdc(String name , List <Customer> custome){
            this.name=name;
            customer =custome;
         }

        public gdc(){
        this.name=null;
        this.customer=null;
         }
//

//Set and get For a single Customer in the array 

		public void setSingleCustomer(Customer customerModify , int index){
		if(index <this.customer.size())		
		     customer.set(index, customerModify);
       		 else System.out.println("\nWrong index input choose within number of customer entered\n");	  
	}

		public Customer getCustomer(int index){return customer.get(index);}

//

// Delete a single customer in the array  

        public void deleteSingleCustomer(int index){
	        if(index <this.customer.size())
	           customer.remove(index);
            else System.out.println("\nWrong index input choose within number of customer entered\n");		
		    }
		//

	//deleting all customer in the array

	    public void deleteAllCustomers(){
	         customer.clear();
	         System.out.println("\nYou have deleted all your customers Sucessfully :) 101\n");
}
	//
	    public String toString(){
		
			return"\n name = "+name+"\n"+customer.toString()+"\n";
	}
}

