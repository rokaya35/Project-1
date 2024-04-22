
package e_commercesystem;

public class Customer {
    int customerId;
    String name;
    String address;
  public Customer(){}  
public Customer(int cid,String nm,String add){

   customerId=Math.abs(cid);
  name=nm;
  address=add;
    }
public void setcustomerId(int cid){
   customerId=Math.abs(cid);
}    
public void setname(String nm){
name=nm;
}
public void setaddress(String add){
address=add;
}
public int getcustomerId(){
return customerId;
}
public String getname(){
return name;
}
public String getaddress(){
return address;
} 
}
