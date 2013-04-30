/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.jpa;

import Model.PaymentMeans;
import java.util.List;
import persistence.IPaymentMeansRepository;

/**
 *
 * @author mcn
 */
public class PaymentMeansJpa  extends JpaGeneric<PaymentMeans, Long> implements IPaymentMeansRepository{
       @Override
      public void savePaymentMeans(PaymentMeans pM){
            save(pM);
      }

      @Override
     public  List<PaymentMeans> getAllPaymentMeans(){
            return all();
      }
}
