import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Cart {

    private ArrayList<Product> items;
    private double total;
    private double taxRate = 0.08;
    
    public void addItem(Product p){
        
        items.add(p);
                
    }

    public void showDetails(){
        
        int count = items.size();
        String cart = String.format("--Cart--%nItems Count: %d%nItems:", count);
        System.out.println(cart);
        
        for(Product i : items){
            String name = items.getName();
            double price = items.getPrice();
            String name = items.getName();
            System.out.println(name + ": " + price);
        
        }
        
        
        
    }

    //public boolean checkout(){
    
    
    //}



}
