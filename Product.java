/*
Name:Abdullrahman AL-Saran
id:440016405

Name:Abdalelah AL-howesen
id:440012899

Section: 171
*/

//This class has a composition relation with class Factories

public class Product{
	String productId;
	String productName;
	double productPrice;
	String date;
	
	//Constructor 
		public Product (String productId,String productName, double productPrice , String date){
		    this.productId=productId;
		    this.productName=productName;
		    this.productPrice=productPrice;
		    this.date=date;
	    }
		
		public Product(){
            this.productId=null;
		    this.productName=null;
		    this.productPrice=0;
		    this.date=null;
          }	
			
		//

			//Setters & getters
			
    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
		return  this.productName;
	}

    public void setProductName( String productName ) {
		this.productName = productName;
	}

    public double getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }
	
	//

	//Method fo deleting a product 
	public void deleteProduct(){
		this.productId=null;
		this.productName=null;
		this.productPrice=0;
		this.date=null;
	}
	
	//

	public String toString (){
		
return "\nProuduct Id : "+getProductId()+"\n Product name : "+getProductName()+"\n Product Price : "+getProductPrice()+"\n Date of availability "+getDate()+"\n";
	}





}










