import ProductService.GetData;
import ProductService.OrderService;
import model.Product;
import model.ProductType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {

        public static void main (String[] args){

            HashMap<ProductType, Double> amount;
            amount=OrderService.amount( GetData.order());
            amount.forEach((id, name) -> {
                System.out.println("Key : " + id + " value : " + name);
            });
        }

}
