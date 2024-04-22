
package e_commercesystem;

public class ElectronicProduct extends Product {
    String brand;
    int warrantyPeriod;
public ElectronicProduct(){}
public ElectronicProduct(String nm,int id,float pce,String brand,int wp){
  super(nm,id,pce);
    this.brand=brand;
    if(wp>0)    
    warrantyPeriod=wp;
else
     warrantyPeriod=Math.abs(wp);
}
public void setbrand(String brand){
    this.brand=brand;
}
public void setwarrantyPeriod(int wp){
if(wp>0)    
    warrantyPeriod=wp;
else
     warrantyPeriod=Math.abs(wp);
}
public String getbrand(){
return brand;
}
public int getwarrantyPeriod(){
return warrantyPeriod;
}
}
