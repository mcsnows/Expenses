/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expensemanagersimple;

import Model.Expense;
import Model.ExpenseType;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import persistence.IExpenseRepository;
import persistence.IExpenseTypeRepository;
import persistence.PersistenceFactory;

/**
 *
 * @author mcn
 */
public class ExpenseManagerSimple {

      /**
       * @param args the command line arguments
       */
      
      
      public static void main(String[] args){
              IExpenseTypeRepository ExpTRepo=PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseTypeRepository();
              ExpenseType eT=new ExpenseType("TesteJPA2");
              ExpTRepo.saveExpenseType(eT);
              List<ExpenseType> list=ExpTRepo.getAllExpenseTypes();
              for(ExpenseType e: list){
                    System.out.println("ET:"+e);
              }
              System.out.println("Size"+list.size());
              
              
                   IExpenseRepository ExpRepo=PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
              Expense e=new Expense("mesa", DateTime.newDate(2013, 4, 30), new BigDecimal(33), new ExpenseType("outranova"));
              ExpRepo.saveExpense(e);
              List<Expense> list1=ExpRepo.getAllExpenses();
              for(Expense exp: list1){
                    System.out.println("Expense:"+exp);
              }
              System.out.println("Size"+list1.size());
            }
      
      
    /*  
      
      public static void main1(String[] args) {
            //Testar EXPENSETYPE
             ExpenseTypeJpaController eTDAO = new ExpenseTypeJpaController();
            
            //ListAll ExpenseType
             System.out.println("List All Expense Types");
             List<ExpenseType>list= eTDAO.findExpenseTypeEntities();
             for(ExpenseType e:list){
             System.out.println("ExpenseType:"+e);
             }
             //-------------
             // Save ExpenseType
            String desc = Console.readLine("Novo Tipo de Despesa: Descrição");
            ExpenseType expenseType = null;
            if (!desc.equalsIgnoreCase("end")) {
                  expenseType = new ExpenseType(desc);
            }
            //Persist 
            eTDAO.create(expenseType);
            //----------------
            //ListAll ExpenseType
             System.out.println("List All Expense Types");
             list= eTDAO.findExpenseTypeEntities();
             for(ExpenseType e:list){
             System.out.println("ExpenseType:"+e);
             }
             
             //FIND TO UPDATE
             // Find ExpenseType by ID
             long id1=Console.readInteger("Digite id da ExpenseType a procurar");
             ExpenseType ep1= eTDAO.findExpenseType(id1);
             System.out.println("ExpenseType:"+ep1);         
             // Update (edit) ExpenseType by ID
             System.out.println("Atualização da Expense Type encontrada ");
             try {
             String novaDesc=Console.readLine("Nova Descrição");
             // Edit
             ep1.setDescription(novaDesc);
             eTDAO.edit(ep1);
             } catch (Exception ex) {
             Logger.getLogger(ExpenseManagerSimple.class.getName()).log(Level.SEVERE, null, ex);
             }
             //ListAll ExpenseType
             System.out.println("List All Expense Types");
             list= eTDAO.findExpenseTypeEntities();
             for(ExpenseType e:list){
             System.out.println("ExpenseType:"+e);
             }
             //-------------------------
             // REMOVE EXPENSETYPE
             
            try {
                  long id2 = Console.readInteger("Mostrar a ExpenseType de id=");
                  ExpenseType ep2 = eTDAO.findExpenseType(id2);
                  System.out.println("ExpenseType:" + ep2);
                  if (Console.readBoolean("Apagar s/n")) {
                        // Remove
                        eTDAO.destroy(id2);
                  }
            } catch (NonexistentEntityException ex) {
                  Logger.getLogger(ExpenseManagerSimple.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         //ListAll ExpenseType
             System.out.println("List All Expense Types");
             list= eTDAO.findExpenseTypeEntities();
             for(ExpenseType e:list){
             System.out.println("ExpenseType:"+e);
             }   
        
            
            

            
            
           //Testar EXPENSE      
             ExpenseJpaController eDAO = new ExpenseJpaController();
             
             //ListAllExpenses
            System.out.println("List  All Expenses");
            List<Expense>listExpenses = eDAO.findExpenseEntities();
            for (Expense e : listExpenses) {
                  System.out.println("Expense:" + e);
            }
            
            // Find ExpenseType by ID
            try {
                  long idexp = Console.readInteger("Mostrar Expense de id=");
                  Expense exp = eDAO.findExpense(idexp);
                  System.out.println("Expense:" + exp);
                  if (Console.readBoolean("Apagar s/n")) {
                        // Remove
                        eDAO.destroy(idexp);
                  }
            } catch (NonexistentEntityException ex) {
                  Logger.getLogger(ExpenseManagerSimple.class.getName()).log(Level.SEVERE, null, ex);
            }     

      }
      
      
      public static void main2(String [] args){
                       EntityManagerFactory factory=Persistence.createEntityManagerFactory("ExpenseManagerSimplePU");
            EntityManager em=factory.createEntityManager();
           
             //Read the existing entries and write to console
            Query q1=em.createQuery("select t from ExpenseType as t");
            List <ExpenseType> etList=q1.getResultList();
            for(ExpenseType  e:etList){
                  System.out.println(e);
            } 
             System.out.println("Size:"+ etList.size());
             
           // Create new ExpenseType
            em.getTransaction().begin();
            ExpenseType expT=new ExpenseType("testetype");
            em.persist(expT);
            em.getTransaction().commit();

            //Find
        long id=Console.readInteger("Digite id da ExpenseType a procurar");
            expT=em.find(ExpenseType.class, id);
            System.out.println("Encontrada:"+expT);
            //Delete
            if (Console.readBoolean("Apagar s/n")) {
            em.getTransaction().begin();
            em.remove(expT);
            em.getTransaction().commit();
            }
           // em.close();   
            
            
            
            //List All Expenses
            Query q=em.createQuery("select t from Expense as t");
            List <Expense> eList=q.getResultList();
            for(Expense e:eList){
                  System.out.println(e);
            } 
             System.out.println("Size:"+ eList.size());
             
           // Create new Expense
            em.getTransaction().begin();
            Expense exp=new Expense("mesa", new Date(), new BigDecimal(33), new ExpenseType("outras"));
            em.persist(exp);
            em.getTransaction().commit();
 //List All Expenses
            Query q2=em.createQuery("select t from Expense as t");
             eList=q2.getResultList();
            for(Expense e:eList){
                  System.out.println(e);
            }
            //Find
            long id1=Console.readInteger("Digite id da Expense a procurar");
            Expense exp1=em.find(Expense.class, id1);
            System.out.println("Encontrada:"+exp1);
            //Delete
            em.getTransaction().begin();
            em.remove(exp1);
            em.getTransaction().commit();
     
            em.close();   
             
      }
*/
      }

