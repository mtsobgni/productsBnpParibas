import ProductService.GetData;
import ProductService.OrderService;
import model.Product;
import model.ProductType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {

        public static void main (String[] args){

            HashMap<ProductType, Integer> amount;
            /*List<Product> products = new ArrayList<Product>();
            Product p1 = new Product(1, ProductType.APPLE, 3, 2);
            Product p2 = new Product(2, ProductType.ORANGE, 6, 5);
            Product p3 = new Product(3, ProductType.WATERMELON, 7, 8);

            products.add(p1);
            products.add(p2);
            products.add(p3);*/
            amount=OrderService.amount( GetData.order());
            amount.forEach((id, name) -> {
                System.out.println("Key : " + id + " value : " + name);
            });
        }

}
