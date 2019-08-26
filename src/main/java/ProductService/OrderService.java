package ProductService;

import model.Product;
import model.ProductType;

import java.util.HashMap;
import java.util.List;

public class OrderService {

    public static HashMap<ProductType, Integer> amount (List<Product> products){

        HashMap<ProductType, Integer> bill= new HashMap<ProductType, Integer>();
        int q =0;
        int r =0;
        for ( Product p: products
             ) {
            switch (p.getName()){
                case APPLE:
                    q= p.getQte()/2;
                    r = p.getQte()%2;
                    bill.put(ProductType.APPLE , q*p.getPrice() + r*p.getPrice());
                case ORANGE:
                    bill.put(ProductType.ORANGE, p.getPrice()*p.getQte());
                case WATERMELON:
                    q= p.getQte()/3;
                    r = p.getQte()%3;
                    bill.put(ProductType.WATERMELON , q*p.getPrice()*2 + r*p.getPrice());
            }
        }
        return bill;
    }
}
