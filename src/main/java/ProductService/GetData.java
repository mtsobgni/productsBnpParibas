package ProductService;

import model.Product;
import model.ProductType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetData {

    public static List<Product> order(){

        List<Product> products = new ArrayList<>();
        //System.out.println("Entrez le nombre de APPLE");
        System.out.println("Entrez le nombre de APPLE :");
        Scanner lectureClavier = new Scanner(System.in);
        int qteApple = lectureClavier.nextInt();
        System.out.println("Entrez le nombre d' ORANGE :");
        int qteOrange = lectureClavier.nextInt();
        System.out.println("Entrez le nombre de WATERMELON:");
        int qteWatermelon = lectureClavier.nextInt();

        Product apple = new Product(1,ProductType.APPLE,qteApple,3);
        Product orange = new Product(2,ProductType.ORANGE,qteOrange,3);
        Product watermelon = new Product(3,ProductType.WATERMELON,qteWatermelon,3);

        products.add(apple);
        products.add(orange);
        products.add(watermelon);

        return  products;

    }
    Scanner lectureClavier = new Scanner(System.in);

}
