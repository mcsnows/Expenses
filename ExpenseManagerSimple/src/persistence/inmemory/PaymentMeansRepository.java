/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.inmemory;

import Model.PaymentMeans;
import java.util.List;
import persistence.IPaymentMeansRepository;

/**
 *
 * @author mcn
 */
public class PaymentMeansRepository implements IPaymentMeansRepository{
       @Override
      public  void savePaymentMeans(PaymentMeans pM){
     }
      
      @Override
      public List<PaymentMeans> getAllPaymentMeans(){
            return null;
} 
}
