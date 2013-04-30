/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author mcn
 */
@Entity
public class Expense implements Serializable {
        @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
       private Long id;
      private String description;
      private BigDecimal amount;
       @ManyToOne(cascade = CascadeType.ALL)
      private ExpenseType expenseType;
       
      private PaymentMeans paymentMeans;
      @Temporal(javax.persistence.TemporalType.DATE)
      private Date dateOccurred;

    
    protected Expense() {}

    public Expense( String description, Date dateOccurred, BigDecimal amount) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException("description or date or amount null");
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() ==  0) {
            throw new IllegalArgumentException("amount less or equal 0");
        }
        this.description = description;
        this.amount = amount;
    }
    
    public Expense(String description,int year,int month, int day, BigDecimal amount){
          this(description,DateTime.newDate(year, month, day),amount);
    }
    
     public Expense(String description,Date dateOccurred, BigDecimal amount,ExpenseType expenseType,
             PaymentMeans paymentMeans){
          if (description == null || dateOccurred == null || amount == null||
                  expenseType==null|| paymentMeans==null|| dateOccurred==null){
            throw new IllegalArgumentException("null attribute");
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() ==  0) {
            throw new IllegalArgumentException("amount less or equal 0");
        }  
          this.description=description;
          this.amount=amount;
          this.expenseType=expenseType;
          this.paymentMeans=paymentMeans;
          this.dateOccurred=dateOccurred;
                  
    }
   
    public Expense( Expense exp){
          this.description=exp.description;
          this.amount=exp.amount;
          this.expenseType=exp.expenseType;
          this.paymentMeans=exp.paymentMeans;
          this.dateOccurred=exp.dateOccurred;
    }
   
    
    public Expense(String description,Date dateOccurred, BigDecimal amount,ExpenseType expenseType
            // ,PaymentMeans paymentMeans
            ){
          if (description == null || dateOccurred == null || amount == null||
                  expenseType==null|| //paymentMeans==null//
                  dateOccurred==null ){
            throw new IllegalArgumentException("null attribute");
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() ==  0) {
            throw new IllegalArgumentException("amount less or equal 0");
        }  
          this.description=description;
          this.amount=amount;
          this.expenseType=expenseType;
          //this.paymentMeans=paymentMeans;
          this.dateOccurred=dateOccurred;
                  
    }
    
    public BigDecimal getAmount() {
        return amount;
    }

      public Date getDateOccurred() {
            return dateOccurred;
      }

      public Long getId() {
            return id;
      }

      public String getDescription() {
            return description;
      }

      public void setDescription(String description) {
            this.description = description;
      }

    
    
    @Override
      public String toString() {
            NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            double doubleAmount = this.amount.doubleValue();
            String s ="ID:"+this.id+ "Description:" + this.description + "Date:"+ this.dateOccurred+
                     "\nAmount:" + n.format(doubleAmount)+ "Expense Type:"+this.expenseType
                  // +"PaymentMeans:"+this.paymentMeans 
                    ;
            return s;

      }
}
