package ProductService;

import model.Constantes;
import model.Product;
import model.ProductType;

import java.util.HashMap;
import java.util.List;

public class OrderService {

    public static HashMap<ProductType, HashMap<Integer, Double>> amount (int[] tab){

        HashMap<ProductType,HashMap<Integer, Double> > amount= new HashMap<>();
        int q =0;
        int r =0;
        int apple = tab[0], orange= tab[1], watermelon= tab[2];

            HashMap<Integer, Double> bill = new HashMap<>();
            HashMap<Integer, Double> bill2 = new HashMap<>();
            HashMap<Integer, Double> bill3 = new HashMap<>();

                    q= apple/2;
                    r = apple%2;
                    bill.put(apple,q*Constantes.priceApple + r*Constantes.priceApple);
                    amount.put(ProductType.APPLE ,bill );

                    bill.put(orange,Constantes.priceOrange*orange);
                    amount.put(ProductType.ORANGE,bill );

                    q= watermelon/3;
                    r = watermelon%3;
                    bill.put(watermelon, q*Constantes.priceWatermelon*2 + r*Constantes.priceWatermelon );
                    amount.put(ProductType.WATERMELON ,bill);

        return amount;
    }
}
