/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mcn
 */
public enum PaymentType {

      /**
       * Cash Payment
       */
      CASH(1, "Cash"),
      /**
       * Debit card
       */
      DEBITCARD(2, "DebitCard"),
      /**
       * Credit Card Payment
       */
      CREDITCARD(3, "CreditCard"),
      /**
       * Check Payment
       */
      CHECK(4, "Check");
      /**
       * instance attributes.
       */
      private int code;
      private String description;

      /**
       * New instance - Constructor must be private
       */
      private PaymentType(int code, String description) {
            this.description = description;
            this.code = code;
      }

      /**
       * Returns PaymentType code.
       */
      public int getCode() {
            return this.code;
      }

      /**
       * Returns the description .
       */
      public String getDescription() {
            return description;
      }

      /**
       * Returns equality between two Payment Types.
       */
      public boolean equals(PaymentType ac) {
            if ((this.code == ac.getCode())
                    && (this.description.equals(ac.getDescription()))) {
                  return true;
            } else {
                  return false;
            }
      }
}
