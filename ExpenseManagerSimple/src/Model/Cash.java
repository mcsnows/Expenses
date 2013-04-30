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
public class Cash extends PaymentMeans{
      public Cash(){
            super("Cash", PaymentType.CASH);          
      }
      @Override
     public String toString(){
           return super.toString();
     } 
}
