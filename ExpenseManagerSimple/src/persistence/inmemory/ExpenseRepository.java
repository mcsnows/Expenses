/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.inmemory;

import Model.Expense;
import java.util.List;
import persistence.IExpenseRepository;

/**
 *
 * @author mcn
 */
public class ExpenseRepository implements IExpenseRepository {
      @Override
       public void saveExpense(Expense exp){
            
      }

      @Override
     public  List<Expense> getAllExpenses(){
            return null;
      }
}
