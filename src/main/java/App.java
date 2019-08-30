import ProductService.OrderService;
import model.Order;
import model.Product;

import java.util.*;

import static java.lang.Math.abs;
import static model.ProductFixtures.*;

public class App {

        public static void main (String[] args) {

            boolean stop=false;
            for (Product p: products
                 ) {
                System.out.println("Produit :"+p.getName()+ "  Identifiant du produit :"+ p.getId());
            }
            System.out.println("");
            Set<Order> orders = new HashSet<>();
            int j = 1;
            do {
                System.out.println("Veuillez entrer l'identifiant du produit puis sa quantité");
                Scanner sc = new Scanner(System.in);
                int idProduit;
                int qteProduit;
                System.out.println("");

                System.out.println("id du produit " + j);
                while (!sc.hasNextInt()) {
                    System.out.println("Veuillez entrer un nombre positive!");
                    sc.next();
                }
                idProduit = abs(sc.nextInt());
                stop= true;
                if(idProduit<=MAX && idProduit >0) {
                    System.out.println("Entrez la quantité du produit");
                    while (!sc.hasNextInt()) {
                        System.out.println("La quantité doit etre un nombre positive!");
                        sc.next();
                    }
                    qteProduit = abs(sc.nextInt());
                    for (Product p : products
                            ) {
                        if (idProduit == p.getId()) {
                            Product product = p;
                            orders.add(new Order(p, qteProduit));
                        }
                    }
                    j += 1;
                    System.out.println("Si vous voulez entrer un autre produit taper 1, pour annuler la saisie entrer 2");
                    Scanner s = new Scanner(System.in);
                    String decision = s.nextLine();
                    try{
                        int deci = Integer.parseInt(decision);
                        if (deci == NOK) {
                            stop = false;
                        } else {
                            stop = true;
                        }
                    }catch (Exception e){
                        stop = false;
                    }

                    System.out.println("Nombre de produit saisi " + orders.size());
                }
            }while (stop==true && orders.size()<MAX );

            for (Order o: orders
                 ) {
                System.out.println(o.getProduct().getName());
            }
            HashMap<Order, Double> result = OrderService.calculateAmountOfBasket(orders);

            result.forEach((order, amount) -> {
                System.out.println("Produit : "+order.getProduct().getName()+" Prix : "+order.getProduct().getPrice()+ " Quantité : "+order.getQte()+ " Prix réel : " +amount);
            });

        }
}


