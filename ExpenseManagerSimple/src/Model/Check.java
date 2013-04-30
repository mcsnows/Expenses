/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author mcn
 */
@Entity
@Table(name="CHEQUE")
public class Check extends PaymentMeans {

      private String bank;
      private String accountNumber;
      private String checkNumber;

      public Check() {
      }


      public Check(String bank,String accountNumber, String checkNumber) {
            super("Check", PaymentType.CHECK);
            if (bank == null || accountNumber== null||checkNumber== null) {
                  throw new IllegalArgumentException();
            }
            this.bank = bank;
            this.accountNumber = accountNumber ;
            this.checkNumber = checkNumber ;
      }
      public String getCheckNumber(){
            return this.checkNumber;
      }

      
      @Override
      public String toString(){
            return super.toString()+ ":Bank"+this.bank+ " Account Number"+this.accountNumber+
                    " Check Number"+this.checkNumber;
      }
      
}
