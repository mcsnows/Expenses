/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import Model.PaymentMeans;
import java.util.List;

/**
 *
 * @author mcn
 */
public interface IPaymentMeansRepository {
      void savePaymentMeans(PaymentMeans pM);
      List<PaymentMeans> getAllPaymentMeans();
}
