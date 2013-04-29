/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.jpa;

import Model.Expense;
import java.util.List;
import persistence.IExpenseRepository;

/**
 *
 * @author mcn
 */
public class ExpenseJpa extends JpaGeneric<Expense, Long> implements IExpenseRepository {
      @Override
      public void saveExpense(Expense exp){
            save(exp);
      }

      @Override
      public List<Expense> getAllExpenses(){
            return all();
      }
}
