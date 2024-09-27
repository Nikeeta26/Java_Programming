package nikeeta;

import java.util.*;


class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000));  
        productsList.add(new Product(2,"Dell Laptop",30000));  
        productsList.add(new Product(3,"Lenevo Laptop",28000));  
        productsList.add(new Product(4,"Sony Laptop",28000));  
        productsList.add(new Product(5,"Apple Laptop",90000));  
        
        
        List<Float> productPriceList = new ArrayList<Float>();  
        
        for(Product product: productsList){  
              
            // filtering data of list  
            if(product.price<30000){  
            	
                productPriceList.add(product.price);    // adding price to a productPriceList  
            }  
        }  
        System.out.println(productPriceList);   // displaying data  
    }  
}  