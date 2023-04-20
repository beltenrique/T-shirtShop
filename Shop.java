import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Shop {
    
    private String name;
    private ArrayList<Product> products;
    private Cart cart;
    
        
    public Shop (){
       
    }
    
    

    public Shop (String name, ArrayList<Product> products){
                        
        this.products = (ArrayList<Product>)products.clone();
        
        this.name = "T-Shirt Mart";
        
            
    }
    
    public String getName(){
        return name;
    }
    

    public void printProducts(){
               
        System.out.println("--Products--");
        
         for(Product i : products){
            System.out.println(i);
            
            
        }
    }
    
    
    public int findProduct(String searchText){
        
        int found = 0;
               
        for(Product i : products){
            
            if (searchText.equals(i.getName())){
                found = i.getID();
            break;
            }
                                            
            else{
                found = -1;
            }
                       
        }
        
        
        return found;
    }
    
    
    public Product getItembyID(int id){
        Product nameItem = null;
                
        for(Product i : products){
                
            if (id == i.getID()){
                
                nameItem = i;
                //cart.addItem(nameItem);               
            break;
                      
            }
                                            
            else{
                nameItem = null;
            }
            if(nameItem != null){
                cart.addItem(nameItem);
            }
                       
        }
                                   
        return nameItem;
               
    }
    
}
