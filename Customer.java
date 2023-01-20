/*
Name:Abdullrahman AL-Saran
id:440016405

Name:Abdalelah AL-howesen
id:440012899

Section: 171
*/

public abstract class  Customer{
    protected String customerId;
    protected String name;
    protected String address;

    //Constructor 
    public Customer(String customerId,String name,String address){
        this.customerId=customerId;
        this.name=name;
        this.address=address;
    }
    //


    //Setters & getters

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //


//Abstract Methods (Empty)

    public abstract String getPhoneNumber();
    
    public abstract void setPhoneNumber(String phoneNumber);
        
    public abstract void setSingleProduct(Product productModify , int index);
	
    public abstract Product getSingleProduct(int index);
	
    public abstract void deleteAllProducts();
	
    public abstract void deleteSingleProduct(int index);

	//
    public String toString(){
        return String.format("%nname: %s%naddress: %s%nCustomer ID: %s%n",name,address,customerId);
    }
    
}
