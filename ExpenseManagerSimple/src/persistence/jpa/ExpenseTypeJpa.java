/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.jpa;

import Model.ExpenseType;
import java.util.List;
import persistence.IExpenseTypeRepository;

/**
 *
 * @author mcn
 */
public class ExpenseTypeJpa extends JpaGeneric<ExpenseType, Long> implements IExpenseTypeRepository{
      @Override
      public void saveExpenseType(ExpenseType eT){
            save(eT);
      }

      @Override
     public  List<ExpenseType> getAllExpenseTypes(){
            return all();
      }
}
