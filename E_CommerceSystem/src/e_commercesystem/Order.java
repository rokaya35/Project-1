
package e_commercesystem;

public class Order{
  int customerId; 
  int  orderId ;
  Product[]products;
  float totalPrice;
public Order(int oid){
orderId=oid;
}
public void setcustomerId(int cid){
  customerId=cid; 
}
public void setOrderId(int oid){
  if(oid>0) 
  orderId=oid;
else
  orderId=Math.abs(oid);
}
public void setTotalPrice(float totalp){
totalPrice=Math.abs(totalp);
}
public void setproudcts(Product[]products){
this.products=products;
}
public int getCustomerId(){
return customerId;
}
public int getOrderId(){
return orderId;
}
public float getTotalPrice(){
return totalPrice;
}
public Product[]products(){
return products;
}
public void printOrderInfo(){
System.out.println("Order ID: " + orderId);
System.out.println("Customer ID: " + customerId);
System.out.println("Products:");
if (products != null) {
for(int i=0;i<products.length;i++){
    if(products[i]!=null){
     System.out.println("-"+products[i].getname()+":$"+products[i].getprice());
}
}
 System.out.println("Total Price:$"+totalPrice);
} else {
      System.out.println("No products in the order.");
System.out.println("Total Price:$"+totalPrice);
}
}
}
