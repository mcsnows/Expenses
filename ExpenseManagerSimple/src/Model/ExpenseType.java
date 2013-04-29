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

/**
 *
 * @author mcn
 */
@Entity
public class ExpenseType implements Serializable{
      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
       private Long id;
      private String description;

      public Long getId() {
            return id;
      }

      public ExpenseType() {
      }

      public ExpenseType(String description) {
            if (description.equals("")) {
                  throw new IllegalArgumentException("Error: description empty");
            }
            //  this.id=++cont;
            this.description = description;
      }
      public String getDescription(){
            return description;
      }
public void setDescription(String description){
            this.description=description;
      }
      @Override
      public String toString() {
            return "id:"+id+" description:"+description;
            //return "Description:" + description;
      }
}
