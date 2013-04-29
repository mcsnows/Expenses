/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import persistence.inmemory.ExpenseTypeRepository;

/**
 *
 * @author mcn
 */
public class InMemoryRepositoryFactory implements IRepositoryFactory{
      
      @Override
    public IExpenseRepository getExpenseRepository(){
            return new persistence.inmemory.ExpenseRepository();
      }
      
      @Override
      public IExpenseTypeRepository getExpenseTypeRepository(){
            return new persistence.inmemory.ExpenseTypeRepository();
      }
     

      
}
