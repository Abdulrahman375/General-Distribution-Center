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
import java.util.ArrayList;
import java.util.List;

public class testCodes{
public static void main(String[]args){

List <Product> gogo =new ArrayList<>();
gogo.add(new Product("ID 1","saad",100,"12/12/12"));
gogo.add(new Product("ID 2","khaled",100,"12/12/12"));
gogo.add(new Product("ID 3","rashed",100,"12/12/12"));

Factories a = new Factories("111","Abdo", "Al ysamin",gogo);

Individual b = new Individual("ID 4","fahad","Al hodihah ","+966555");

// Defineng an object of customer polymorphismly
Customer  facto  = new Factories("ID 7","odbo", "Al wardah",gogo); 
Customer indiv = new Individual("ID 8","koko","Al saad ","0342");

// then create an array of customers 
List <Customer> cus = new ArrayList<>();
cus.add(indiv);
cus.add(facto);


//Adding that Array to the (GDC)
gdc d  = new gdc("Bagala",cus);






//----------------------------------------------------------------------------------------------------------------------------------------------------------

//Tests For Factories class
//Before changing
System.out.println("\n\n\n\n --------------------------------------------------------------------------------------------------------------------\n Before changing"+a+"\n");
//After changing

a.setCustomerId("ID 998");
a.setName("oror");
a.setAddress("AL hamas");
a.setSingleProduct(new Product("Id 997","odod",100,"12/3/18"), 1);
a.deleteSingleProduct(0);


//a.getAllProducts();
System.out.println(" \n\n\n\n --------------------------------------------------------------------------------------------------------------------\n After changing"+a+"\n\n");


//------------------------------------------------------------------------------------------------------------------------------------------------------------





//Test for indivisual class 
// before any change
System.out.println("Before changing"+b); 

//After changing 
b.setName("opop");
b.setAddress("yarmok");
b.setPhoneNumber("050");
b.setCustomerId("id 990");
System.out.println(" \n\n\n\n --------------------------------------------------------------------------------------------------------------------\n After changing"+b+"\n");






//----------------------------------------------------------------------------------------------------------------------------------------------------------------

//Tests for gdc class & also Customer class by using the array of Customers
//Before Changing
System.out.println("\n\n\n\n --------------------------------------------------------------------------------------------------------------------\n Before changing"+d+"\n");

// After changing
//class customer 
d.customer.get(0).setCustomerId("ID 75");
d.customer.get(0).setName("New name");
d.customer.get(0).setAddress("Al Imam");

//class gdc

d.setSingleCustomer(new Individual("id 5","saad","Yarmok","0555"), 1);
d.deleteSingleCustomer(1);

System.out.println(" \n\n\n\n --------------------------------------------------------------------------------------------------------------------\n After changing "+d+"\n");






}

}
