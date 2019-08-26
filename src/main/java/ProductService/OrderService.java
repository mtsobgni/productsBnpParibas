package ProductService;

import model.Constantes;
import model.Product;
import model.ProductType;

import java.util.HashMap;
import java.util.List;

public class OrderService {

    public static HashMap<ProductType, HashMap<Integer, Double>> amount (int a, int b, int c){
        
        HashMap<ProductType,HashMap<Integer, Double> > amount= new HashMap<>();
        int q =0;
        int r =0;
             HashMap<Integer, Double> bill = new HashMap<>();
             HashMap<Integer, Double> bill1 = new HashMap<>();
             HashMap<Integer, Double> bill2 = new HashMap<>();
                    q= a/2;
                    r = a%2;
                    bill.put(a,q*Constantes.priceApple + r*Constantes.priceApple);
                    amount.put(ProductType.APPLE ,bill);
                    bill1.put(b,Constantes.priceOrange*b);
                    amount.put(ProductType.ORANGE,bill1 );
                    q= c/3;
                    r = c%3;
                    bill2.put(c, q*Constantes.priceWatermelon*2 + r*Constantes.priceWatermelon );
                    amount.put(ProductType.WATERMELON ,bill2);
        return amount;
    }
}
