package ProductService;

import model.Constantes;
import model.Product;
import model.ProductType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderService {

    public static HashMap<ProductType, HashMap<Integer, Double>> amount(List<Product> products) {

        HashMap<ProductType,HashMap<Integer, Double> > amount= new HashMap<>();

        for ( Product p: products
                ) {
            HashMap<Integer, Double> billApple = new HashMap<>();
            HashMap<Integer, Double> billOrange = new HashMap<>();
            HashMap<Integer, Double> billWatermelon = new HashMap<>();

            if (p.getName().equals(ProductType.APPLE)){

                billApple.put(p.getQte(),(p.getQte()/2)*Constantes.priceApple + (p.getQte()%2)*Constantes.priceApple);
                amount.put(ProductType.APPLE ,billApple );
            }
            else if (p.getName().equals(ProductType.ORANGE)){
                billOrange.put(p.getQte(),Constantes.priceOrange*p.getQte());
                amount.put(ProductType.ORANGE,billOrange );
            }
            else if (p.getName().equals(ProductType.WATERMELON)){

                billWatermelon.put(p.getQte(), (p.getQte()/3)*Constantes.priceWatermelon*2 + (p.getQte()%3)*Constantes.priceWatermelon );
                amount.put(ProductType.WATERMELON ,billWatermelon);
            }
        }
        return amount;
    }

    public static List<Product> order (int[] tab){

        int taille = tab.length ;
        Product apple = new Product(ProductType.APPLE, tab[0]);
        Product orange = 1<taille ? new Product(ProductType.ORANGE, tab[1]) : null;
        Product watermelon = 2<taille ? new Product(ProductType.WATERMELON, tab[2]) : null;
        List<Product> products = new ArrayList<>();
        products.add(apple);
        if (orange != null){
            products.add(orange);
        }
        if (watermelon != null){
            products.add(watermelon);
        }
        return products;
    }
}
