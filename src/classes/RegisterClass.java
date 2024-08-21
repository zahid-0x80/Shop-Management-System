package classes;


import java.io.FileWriter;
import java.io.IOException;


public class RegisterClass {
    
   private String name;
   private String phoneNo;
  
   
   
   //constructor
   public RegisterClass(String name,String phoneNo){
        this.name=name;
        this.phoneNo=phoneNo;
        
   }

  
    
 //user data save in file mehtod
 public void userinformaitonsave(){
        try {
      FileWriter myWriter = new FileWriter("userinformaiton.txt",true);
      myWriter.write("\nName:"+name);
      myWriter.write("\r\nPhone:"+phoneNo);
      myWriter.close();
     
    } catch (IOException e) {
      System.out.println("A Error found");
    }
   }
    
    
}
