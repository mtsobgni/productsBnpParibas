package ProductService;

import model.Product;
import model.ProductType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetData {

    public static List<Product> order() {

        List<Product> products = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int qteApple;
        int qteOrange;
        int qteWatermelon;
        int j = 0;

        System.out.println("Entrez le contenu du panier du client en spécifiant la quantité de chaque produit dans cet ordre " +
                "apple orange watermelon");
        try {
            qteApple = sc.nextInt();
            System.out.println(qteApple);
        } catch (Exception e) {
        }
           /*
        qteApple = sc.nextInt();
    } while (qteApple <= 0);
        System.out.println("La quantité de apple est " + qteApple);
    j=0;

        Product apple = new Product(ProductType.APPLE,qteApple,3);
        Product orange = new Product(ProductType.ORANGE,qteOrange,3);
        Product watermelon = new Product(ProductType.WATERMELON,qteWatermelon,3);*/

            //products.add(apple);
            //products.add(orange);
            //products.add(watermelon);

            return null;

        }

    }

