package ProductService;

import model.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import static model.ProductFixtures.APPLE;
import static model.ProductFixtures.WATERMELON;

public class OrderService {

      public static  HashMap<Order, Double> calculateAmountOfBasket(Set<Order> baskets){

          HashMap<Order, Double> amount = new HashMap<>();

          for (Order o: baskets
               ) {
              if(o.getProduct().getName()==APPLE){
                  double realPriceOfApple = ((o.getQte()/2)*o.getProduct().getPrice() + (o.getQte()%2)*o.getProduct().getPrice());
                  amount.put(o ,realPriceOfApple );
              }
              else if(o.getProduct().getName()==WATERMELON){
                  double realPriceOfWatermelon = ((o.getQte()/3)*o.getProduct().getPrice()*2 + (o.getQte()%3)*o.getProduct().getPrice());
                  amount.put(o,realPriceOfWatermelon );
              }
              else{
                  amount.put(o, o.getQte()*o.getProduct().getPrice());
              }
          }
          return amount;
      }
}
