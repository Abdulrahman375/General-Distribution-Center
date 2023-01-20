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
import java.util.*;
public  class Factories extends Customer {
	
     List <Product> product =new ArrayList<>();
     final double WholeSaleOffer= 12.5;
	

	//Constructor

	public Factories(String customerId , String name , String address, List <Product> prodo ){
		
	super(customerId,name,address);

	product=prodo;
	if(product.size()>=3){
	   System.out.println("Congrats You have 3 or more products so well give you a 25 % discount on each product");

	   for(int i =0; i<product.size();i++)
	   this.product.get(i).setProductPrice(this.product.get(i).getProductPrice() - (this.product.get(i).getProductPrice() * WholeSaleOffer)/100);
					  				   			
    }else{product=prodo;}
		
	}

	public Factories(){
	super(null,null,null);
	product=null;

	}
	
	//

		// Set & get for a  single product in  an array

		public void setSingleProduct(Product productModify , int index){
		   if(index <product.size()){
		      product.set(index, productModify);}
	
		    else{ System.out.println("\nWrong index input choose within number of products entered\n");}
		
		if(product.size()>=3)
		    product.get(index).setProductPrice(product.get(index).getProductPrice() - (product.get(index).getProductPrice() * WholeSaleOffer) / 100);
				}
								  
				
		public Product getSingleProduct(int index){return product.get(index);}
	
	//

	//method for deleting a single product in an array
		public void deleteSingleProduct(int index){
		if(index <product.size())		
		product.remove(index);
		else System.out.println("\nWrong index input choose within number of products entered\n");	
			}
//

		//Method for deleting All Products in the array
	public void deleteAllProducts(){
	product.clear();
	System.out.println("\nYou have deleted all your products Sucessfully :) 101\n");
	
			}

	// Abstract methods (Empty)

		public  String getPhoneNumber(){return null;}
 
    	public  void setPhoneNumber(String g){}

	//
	public String toString(){
	 
	return "\n Factory customer id : "+customerId+"\n Factory name : "+name+"\n Factory address : "+address+"\n"+"\n"+product.toString();
		
									}
	
}
