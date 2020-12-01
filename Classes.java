public class Classes {
        // instance fields
        String productType;
        int inventoryCount;
        double inventoryPrice;
        
        // constructor method
        public Classes(String product, int count, double price) {
          productType = product; //sets the instance fields???
          inventoryCount = count;
          inventoryPrice = price;
        }
        
        // main method
        public static void main(String[] args) {
        //creates a new Classes object with 3 instances (variables) product, count, and price
          Classes lemonadeStand = new Classes("lemonade", 42, .99);
          Classes cookieShop = new Classes("cookies", 12, 3.75);
          
          //locates the specified variable in the lemonadeStand Classes object
          System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
          
          System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
        }
      
}

public class Car {
    // scope of Car class starts after curly brace
     
      public static void main(String[] args) {
        // scope of main() starts after curly brace
     
        // program tasks
     
      }
      // scope of main() ends after curly brace
     
    }
    // scope of Car class ends after curly brace