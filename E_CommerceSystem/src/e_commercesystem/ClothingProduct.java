
package e_commercesystem;

public class ClothingProduct extends Product {
    String size;
    String fabric;
public ClothingProduct(){}
public ClothingProduct(String nm,int id,float pce,String s,String f){
  super(nm,id,pce);
  size=s;
  fabric=f;
}

public void setsize(String s){
size=s;
}
public void setfabric(String f){
fabric=f;
}
public String getsize(){
return size;
}
public String getfabric(){
return fabric;
} 

}
