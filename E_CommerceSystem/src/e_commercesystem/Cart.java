
package e_commercesystem;

public class Cart {
    int customerId;
    int nProducts;
    private Product[]products;
public Cart(){}
public Cart(int cid,int n){
customerId=cid;
nProducts=n;
products =new Product[nProducts];
}
public void setcustomerId(int cid){
   customerId=Math.abs(cid);
}
public void setnProducts(int n){
nProducts=Math.abs(n);
}
public void setproudcts(Product[]products){
this.products=products;
}
public int getcustomerId(){
return customerId;
}
public int getnProducts(){
return nProducts;
}

public Product[] getProducts(){
return products;
}
public void addproduct(Product product){
for(int i=0;i<products.length;i++){
    if(products[i]==null){
      products[i]=product;
      return;
}
}
}
public int[] removeProduct(int[] a,int pos){
int[]newA=new int[a.length-1];
    int j=0;
    for (int i=0;i<a.length;i++){
        if(i!=pos){
            newA[j]=a[i];
         j++;
        }
    }
         return newA;
    }
public float calculatePrice(){
float totalPrice=0;
 for(int i=0;i<products.length;i++){
        totalPrice+=products[i].getprice();
}
return totalPrice;
}
public void placeOrder(Order order){
order.setcustomerId(customerId);
order.setproudcts(products);
order.setTotalPrice(calculatePrice());
System.out.println("Order placed successfully!");
}
}
 /*static int[] deleteElement(int[]a,int pos){
    int[]newA=new int[a.length-1];
    int j=0;
    for (int i=0;i<a.length;i++){
        if(i!=pos){
            newA[j]=a[i];
         j++;
         
        }
    }
         return newA;
    }
  System.out.println("input the position where to delete:");
          int x=in.nextInt();
           x--;
        if(x<size){
           int[]newA= deleteElement(a,x);
           printArray(newA);}
        else{
         System.out.println("Invalid position! please enter another position");*/