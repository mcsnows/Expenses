/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.inmemory;

import Model.ExpenseType;
import java.util.List;
import persistence.IExpenseTypeRepository;

/**
 *
 * @author mcn
 */
public class ExpenseTypeRepository implements IExpenseTypeRepository{
    
      @Override
      public  void saveExpenseType(ExpenseType eT){
     }
      
      @Override
      public List<ExpenseType> getAllExpenseTypes(){
            return null;
} 
}
