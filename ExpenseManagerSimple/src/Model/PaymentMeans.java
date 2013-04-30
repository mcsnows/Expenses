/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author mcn
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class PaymentMeans implements Serializable {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      protected String description;
      protected PaymentType paymentType;

            public PaymentMeans() {
      }

      public PaymentMeans(String description, PaymentType paymentType) {
            this.description = description;
            this.paymentType = paymentType;
      }


      public String getDescription() {
            return this.description;
      }

      @Override
      public String toString() {
            return "Payment Mean: " + this.description;
      }
}
