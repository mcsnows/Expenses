/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import Model.ExpenseType;
import java.util.List;

/**
 *
 * @author mcn
 */
public interface IExpenseTypeRepository {
       void saveExpenseType(ExpenseType eT);
      List<ExpenseType> getAllExpenseTypes();
}
