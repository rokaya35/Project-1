package e_commercesystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EcommerceGUI extends JFrame 
        implements ActionListener {
  private JTextField productNameField, productPriceField;
  private JButton addButton, placeOrderButton;
  private JTextArea cartTextArea;
  private double totalPrice;
  public EcommerceGUI() {
     setTitle("E-commerce System");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLayout(new GridLayout(4, 2));
     add(new JLabel("Product Name:"));
     productNameField = new JTextField();
     add(productNameField);
     add(new JLabel("Product Price:"));
     productPriceField = new JTextField();
     add(productPriceField);
     addButton = new JButton("Add to Cart");
     addButton.addActionListener(this);
     add(addButton);
     placeOrderButton = new JButton("Place Order");
     placeOrderButton.addActionListener(this);
     add(placeOrderButton);
     cartTextArea = new JTextArea();
     add(new JScrollPane(cartTextArea));
     totalPrice = 0;
     pack();
     setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == addButton) {
        String productName =
          productNameField.getText();
        double productPrice =
          Double.parseDouble(productPriceField.getText());
         cartTextArea.append
        (productName + " - $" + productPrice + "\n");
            totalPrice += productPrice;
            productNameField.setText("");
            productPriceField.setText("");
        } else if (e.getSource() == placeOrderButton) {
            JOptionPane.showMessageDialog
        (this, "Total Price: $" + totalPrice);
            cartTextArea.setText("");
            totalPrice = 0;
        }
    }
}

