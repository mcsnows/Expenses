/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import Model.Expense;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mcn
 */
public interface IExpenseRepository {

      void saveExpense(Expense exp);

      List<Expense> getAllExpenses();

//      Expense getLastExpense();
//
//      List<Expense> listAllBetween(Date start, Date end);
//
//      BigDecimal expenditureOfMonth(int year, int month);
}
