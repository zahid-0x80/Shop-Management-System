package classes;


import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class AddProductClass {
    private String productName;
    private String productType;
    private String prodcutPrice;

    public AddProductClass(String name,String type,String price) {
        productName=name;
        productType=type;
        prodcutPrice=price;
    }
    
    
 public void saveaddedproductlist(){
        try {
      FileWriter myWriter = new FileWriter("addedproductlist.txt",true);
      myWriter.write("\nProduct Name:"+productName);
       myWriter.write("\r\nProduct type:"+productType);
      myWriter.write("\r\nProduct Price:"+prodcutPrice);
      
      myWriter.close();
     
    } catch (IOException e) {
      System.out.println("A Error found");
    }
   }
}
