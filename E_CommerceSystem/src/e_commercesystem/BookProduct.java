package e_commercesystem;

public class BookProduct extends Product {
    String author;
    String publisher;
public BookProduct(){}
public BookProduct(String nm,int id,float pce,String a,String p){
   super(nm,id,pce);
   author=a;
   publisher=p;
}
public void setauthor(String a){
author=a;
}    
public void setpublisher(String p){
publisher=p;
}
public String getauthor(){
return author;
}
public String getpublisher(){
return publisher;
}
}
