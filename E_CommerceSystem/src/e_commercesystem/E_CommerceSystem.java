package e_commercesystem;
import java.util.Scanner;
import javax.swing.SwingUtilities;
public class E_CommerceSystem {
public static void main(String[] args) {
 Scanner in=new Scanner(System.in);
 SwingUtilities.invokeLater(EcommerceGUI::new);
 ElectronicProduct electronic=new ElectronicProduct
   ("Smartphone",1,599.99f,"Samsung",1);
 ClothingProduct   C1=new ClothingProduct
   ("T-shirt",2,19.99f,"Medium","Cotton");
 BookProduct       b1=new BookProduct
  ("OOP",3,39.99f,"O’Reilly","X Publications");
 System.out.println("Welcome to the E-Commerce System!");
 System.out.println("Please enter your ID ");
 int id =Math.abs(in.nextInt());
 System.out.println("Please enter your name ");
 String name=in.next();
 System.out.println("Please enter your address");
 String add=in.next();
 Customer customer=new Customer(id,name,add);
 System.out.println("How many prouducts you want to add to your cart");
 int num=in.nextInt();
 Cart cart=new Cart( id, num);
 for(int i=0;i<num;i++){
 System.out.println("Enter details for product"+(i+1));
 System.out.println
 ("Which product would you like to add \n 1-Smartphone \n 2-T-shirt\n 3-OOP");
 int producttype=in.nextInt();
 switch(producttype){
   case 1:
     cart.addproduct(electronic);
     break;
   case 2:
     cart.addproduct(C1);
     break;
   case 3:
     cart.addproduct(b1);
     break;
     default:
     System.out.println("invalid !"); 
   }
 }
 System.out.println("your total is $"+cart.calculatePrice()+
         ". would you like to place order? (1-yes 2-no)");
 int ans=in.nextInt();
 if(ans==1){
 Order order=new Order(1);
 cart.placeOrder(order);
 System.out.println("Order placed successfully!");
 System.out.println("Here’s your order’s summary");
 order.printOrderInfo();
 }else{
 System.out.println("Order not placed.");
   }      
  }
 }   

    