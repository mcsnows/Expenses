/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

/**
 *
 * @author mcn
 */
public interface IRepositoryFactory {
      IExpenseTypeRepository getExpenseTypeRepository();
      IExpenseRepository getExpenseRepository();
}
