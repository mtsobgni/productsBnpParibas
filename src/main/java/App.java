import ProductService.OrderService;
import model.ProductType;
import java.util.*;

public class App {

        public static void main (String[] args) {
            boolean IsGoodFormat;
            do {
                IsGoodFormat=true;
                System.out.println("Entrez la quantité des différents produits dans cet ordre apple-orange-watermelon, séparé par un tiret de 6 ");
                Scanner sc = new Scanner(System.in);
                String basket = sc.nextLine();
                final String SEPARATEUR = "-";
                String baskets[] = basket.split(SEPARATEUR);
                int taille = baskets.length;
                int[] panier = new int[taille];

                    try{
                        for (int i=0; i< taille; i++) {
                            panier[i] = Integer.parseInt(baskets[i]);
                        }
                        HashMap<ProductType, HashMap<Integer, Double>> invoice = new HashMap<>();
                       invoice= OrderService.amount(OrderService.order(panier));
                        for (Map.Entry mapentry : invoice.entrySet()) {
                            System.out.print("Produit: " + mapentry.getKey() + " ");
                            HashMap<Integer, Double> billF = invoice.get(mapentry.getKey());
                            for (Map.Entry entry : billF.entrySet()) {
                                System.out.print("Quantité: " + entry.getKey() + " ");
                                System.out.println("Montant: " + entry.getValue());
                            }
                        }
                    }
                    catch (Exception e){

                        System.out.println("Une quantité a été donné au mauvais format"  );
                        IsGoodFormat= false;
                    }
            }while (IsGoodFormat== false);
        }

}
