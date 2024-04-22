package e_commercesystem;
public class Product {
     int productId;
     String name;
     float price;
public Product(){}
public Product(String nm,int id,float pce){
if(id>0)
    productId=id;
else
    productId=Math.abs(id);
name=nm;
if(pce>0)
    price=pce;
else
    price=Math.abs(pce);
}
public void setproductId(int id){
if(id>0)
    productId=id;
else
    productId=Math.abs(id);
}
public void setname(String nm){
name=nm;
}
public void setprice(float pce){
if(pce>0)
    price=pce;
else
    price=Math.abs(pce);
}
public int getproductId(){
return productId;
}
public String getname(){
return name;
}
public float getprice(){
return price;
}
}
