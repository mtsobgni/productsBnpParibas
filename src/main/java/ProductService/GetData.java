package ProductService;

import model.Product;
import model.ProductType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetData {

    public static List<Product> order(){

        List<Product> products = new ArrayList<>();


        //
        Scanner sc = new Scanner(System.in);
        int qteApple;
        int qteOrange;
        int qteWatermelon;
        int j=0;
        do {
            System.out.println("Entrez la quantité de APPLE!");
            while (!sc.hasNextInt()&& j<10) {
                System.out.println("Veuillez entrer un nombre positive!");
                sc.next();
                j+=1;
            }
            qteApple = sc.nextInt();
        } while (qteApple <= 0);
        System.out.println("La quantité de apple est " + qteApple);
            j=0;
        do {
            System.out.println("Entrez la quantité d'orange!");
            while (!sc.hasNextInt()&& j<10) {
                System.out.println("Veuillez entrer un entier positive!");
                sc.next();
                j+=1;
            }
            qteOrange = sc.nextInt();
        } while (qteOrange <= 0);
        System.out.println("La quantité d'orange " + qteOrange);

        do {
            System.out.println("Entrez la quantité de melon!");
            while (!sc.hasNextInt()&& j<10) {
                System.out.println("Veuillez entrer un entier positive!");
                sc.next();
                j+=1;
            }
            qteWatermelon = sc.nextInt();
        } while (qteWatermelon <= 0);
        System.out.println("La quantité d'orange " + qteWatermelon);


        Product apple = new Product(1,ProductType.APPLE,qteApple,3);
        Product orange = new Product(2,ProductType.ORANGE,qteOrange,3);
        Product watermelon = new Product(3,ProductType.WATERMELON,qteWatermelon,3);

        products.add(apple);
        products.add(orange);
        products.add(watermelon);

        return  products;

    }


}
