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

            System.out.println("Entrez le contenu du panier du client en spécifiant la quantité de chaque produit dans cet ordre " +
                    "apple orange watermelon");
            int qteApple=0 ;
            int qteOrange=0 ;
            int qteWatermelon =0;
            if(args.length>0) {
                try{
                    qteApple = args[0]!= null ? Integer.parseInt(args[0]) : 0;
                    qteOrange = args[1]!= null ? Integer.parseInt(args[1]) : 0;
                     qteWatermelon = args[2]!= null ? Integer.parseInt(args[2]) : 0;                }
                catch (Exception e){
                    System.out.println("Erreur survenu lors de la saisie des quantités");
                    System.exit(0);
                }
            }
            HashMap<ProductType, HashMap<Integer, Double>> amount;
            amount=OrderService.amount( qteApple, qteOrange, qteWatermelon);
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
