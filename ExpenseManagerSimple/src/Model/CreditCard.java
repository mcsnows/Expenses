/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;

/**
 *
 * @author mcn
 */
@Entity
public class CreditCard extends PaymentMeans {

      private String bank;
      private String number;
      private BigDecimal creditLimit;
      @Temporal(javax.persistence.TemporalType.DATE)
      private Date expirationDate;

      public CreditCard() {
      }

      public CreditCard(String bank, String number, double creditLimit, Date date) {
            super("CreditCard", PaymentType.CREDITCARD);
            if (bank == null || number == null || creditLimit == 0 || date == null) {
                  throw new IllegalArgumentException();
            }
            this.bank = bank;
            this.number = number;
            this.creditLimit = new BigDecimal(creditLimit);
            this.expirationDate = date;
      }

      public Date getExpirationDate() {
            return this.expirationDate;
      }

      public BigDecimal getCreditLimit() {
            return this.creditLimit;
      }

      @Override
      public String toString() {
            return super.toString() + ":Bank" + this.bank + " Number" + this.number
                    + "Expiration Date" + expirationDate + "Credit Limit" + this.creditLimit;
      }
}
