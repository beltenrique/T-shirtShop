import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Product {

    private int id;
    private String name;
    private double price;
    
   
    
    public Product (int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
        
    }
    @Override
    public String toString(){
        return("ID " + id + ": " + name + " - $" + price);
        //return String.format("ID %d : %s - $%s", id, name, price);
    
    }
    
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }

}
