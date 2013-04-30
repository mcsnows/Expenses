/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;


/**
 *
 * @author mcn
 */
@Entity
public class DebitCard extends PaymentMeans {

      private String bank;
      private String number;

      public DebitCard() {
      }


      public DebitCard(String bank, String number) {
            super("DebitCard",PaymentType.DEBITCARD);
            if (bank == null || number== null) {
                  throw new IllegalArgumentException();
            }
            this.bank = bank;
            this.number = number;
            
      }
  
      
      @Override
      public String toString(){
            return super.toString()+ ":Bank"+this.bank+ " Number"+this.number;
      }
}
