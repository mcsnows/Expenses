/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

/**
 *
 * @author mcn
 */
public class JpaRepositoryFactory  implements IRepositoryFactory{
      
      @Override
    public IExpenseRepository getExpenseRepository(){
            return new persistence.jpa.ExpenseJpa();
      }
      
      @Override
      public IExpenseTypeRepository getExpenseTypeRepository(){
            return new persistence.jpa.ExpenseTypeJpa();
      }
  
 
}
