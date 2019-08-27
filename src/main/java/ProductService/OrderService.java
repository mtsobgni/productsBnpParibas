package ProductService;

import model.Constantes;
import model.Product;
import model.ProductType;

import java.util.HashMap;
import java.util.List;

public class OrderService {

    public static HashMap<ProductType, HashMap<Integer, Double>> amount (List<Product> products){

        HashMap<ProductType,HashMap<Integer, Double> > amount= new HashMap<>();
        int q =0;
        int r =0;
        for ( Product p: products
             ) {
            HashMap<Integer, Double> bill = new HashMap<>();
            switch (p.getName()){
                case APPLE:
                    q= p.getQte()/2;
                    r = p.getQte()%2;
                    bill.put(p.getQte(),q*Constantes.priceApple + r*Constantes.priceApple);
                    amount.put(ProductType.APPLE ,bill );
                case ORANGE:
                    bill.put(p.getQte(),Constantes.priceOrange*p.getQte());
                    amount.put(ProductType.ORANGE,bill );
                case WATERMELON:
                    q= p.getQte()/3;
                    r = p.getQte()%3;
                    bill.put(p.getQte(), q*Constantes.priceWatermelon*2 + r*Constantes.priceWatermelon );
                    amount.put(ProductType.WATERMELON ,bill);
            }
        }
        return amount;
    }
}
