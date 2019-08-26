package ProductService;

import model.Constantes;
import model.Product;
import model.ProductType;

import java.util.HashMap;
import java.util.List;

public class OrderService {

    public static HashMap<ProductType, Double> amount (List<Product> products){

        HashMap<ProductType, Double> bill= new HashMap<ProductType, Double>();
        int q =0;
        int r =0;
        for ( Product p: products
             ) {
            switch (p.getName()){
                case APPLE:
                    q= p.getQte()/2;
                    r = p.getQte()%2;
                    bill.put(ProductType.APPLE , q*Constantes.priceApple + r*Constantes.priceApple);
                case ORANGE:
                    bill.put(ProductType.ORANGE, Constantes.priceOrange*p.getQte());
                case WATERMELON:
                    q= p.getQte()/3;
                    r = p.getQte()%3;
                    bill.put(ProductType.WATERMELON , q*Constantes.priceWatermelon*2 + r*Constantes.priceWatermelon);
            }
        }
        return bill;
    }
}
