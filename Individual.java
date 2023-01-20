/*
Name:Abdullrahman AL-Saran
id:440016405

Name:Abdalelah AL-howesen
id:440012899

Section: 171
*/ 

public class Individual extends Customer{
    private String phoneNumber;
    //Constructor
    public Individual(){
        super(null, null, null);
        this.phoneNumber=null;
    }

    public Individual(String customerId,String name,String address, String phoneNumber){
        super(customerId,name,address);
        this.phoneNumber=phoneNumber;
    }
    //

    //setters & getters
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

//

 //Abstract Methods (Empty)
    public void setSingleProduct(Product productModify , int index){}
	
	public Product getSingleProduct(int index){return null;}
    
    public void deleteAllProducts(){}	

    public void deleteSingleProduct(int index ){}
//

     public String toString(){
        return String.format("%n Individual Customer name: %s%n Individual Customer address: %s%n Individual Customer ID:%s%n Individual Customer Phone Number: %s%n",name,address,customerId,phoneNumber);
    }
}
