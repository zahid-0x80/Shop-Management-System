package classes;


import java.io.FileWriter;
import java.io.IOException;


public class BuyProductClass {
    private String productName;
    private String productCode;
    private String prodcutPrice;

    public BuyProductClass(String name,String code,String price) {
        productName=name;
        productCode=code;
        prodcutPrice=price;
    }
    
    
 public void savebuyproductdata(){
        try {
      FileWriter myWriter = new FileWriter("buyproductdata.txt",true);
      myWriter.write("\nProduct Name:"+productName);
      myWriter.write("\r\nProduct Price:"+prodcutPrice);
       myWriter.write("\r\nProduct Code:"+productCode);
      myWriter.close();
     
    } catch (IOException e) {
      System.out.println("A Error found");
    }
   }
    
    
    
}
