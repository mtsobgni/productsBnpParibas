import ProductService.GetData;
import ProductService.OrderService;
import model.Product;
import model.ProductType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

        public static void main (String[] args){

            HashMap<ProductType, HashMap<Integer, Double>> amount;
            amount=OrderService.amount( GetData.order());
            for (Map.Entry mapentry : amount.entrySet()) {
                System.out.print("Produit: "+mapentry.getKey()+ " ");
                        HashMap<Integer, Double> bill = amount.get(mapentry.getKey());
                for (Map.Entry entry : bill.entrySet()) {
                    System.out.print("Quantité: "+entry.getKey()+ " ");
                    System.out.println("Montant: "+entry.getValue());
                }
            }
        }

}
