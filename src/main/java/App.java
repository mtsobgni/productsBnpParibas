import model.Constantes;
import model.ProductType;

import java.util.*;

import static java.lang.Math.abs;

public class App {

        public static void main (String[] args) {
                boolean bol;
            do {
                bol=true;
                System.out.println("Entrez la quantité des différents produits dans cet ordre apple, orange, watermelon, séparé par un espace");
                Scanner sc = new Scanner(System.in);
                String basket = sc.nextLine();
                final String SEPARATEUR = " ";
                String baskets[] = basket.split(SEPARATEUR);
                int taille = baskets.length;

                if (baskets.length > 0) {
                    int q = 0;
                    int r = 0;
                    HashMap<Integer, Double> bill1 = new HashMap<>();
                    HashMap<Integer, Double> bill2 = new HashMap<>();
                    HashMap<Integer, Double> bill3 = new HashMap<>();
                    HashMap<ProductType, HashMap<Integer, Double>> amount = new HashMap<>();
                    int panier[] = new int[taille];
                    try {
                        int apple = abs(Integer.parseInt(baskets[0]));
                        int orange = 2 <= taille ? abs(Integer.parseInt(baskets[1])) : 0;
                        int watermelon = 3 <= taille ? abs(Integer.parseInt(baskets[2])) : 0;

                        q = apple / 2;
                        r = apple % 2;
                        bill1.put(apple, q * Constantes.priceApple + r * Constantes.priceApple);
                        amount.put(ProductType.APPLE, bill1);

                        bill2.put(orange, Constantes.priceOrange * orange);
                        amount.put(ProductType.ORANGE, bill2);

                        q = watermelon / 3;
                        r = watermelon % 3;
                        bill3.put(watermelon, q * Constantes.priceWatermelon * 2 + r * Constantes.priceWatermelon);
                        amount.put(ProductType.WATERMELON, bill3);

                        for (Map.Entry mapentry : amount.entrySet()) {
                            System.out.print("Produit: " + mapentry.getKey() + " ");
                            HashMap<Integer, Double> billF = amount.get(mapentry.getKey());
                            for (Map.Entry entry : billF.entrySet()) {
                                System.out.print("Quantité: " + entry.getKey() + " ");
                                System.out.println("Montant: " + entry.getValue());
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Les données saisies ne sont pas au bon format");
                        bol= false;
                    }
                }
            }while (bol== false);
        }

}
