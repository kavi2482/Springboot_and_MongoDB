package com.mongodb.tutorial.Service;

import com.mongodb.tutorial.Repository.ExpenseRepo;
import com.mongodb.tutorial.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepo repo;

    public List<Expense> getExpense(){
        return repo.findAll();
    }

    public Optional<Expense> getExpenseById(String id){
        return repo.findById(id);
    }

    public void addExpense(Expense exp){
        repo.save(exp) ;
    }

    public void updateExpense(Expense exp){

        repo.insert(exp);
    }

    public void deleteExpense(String id){
        repo.deleteById(id);
    }

}
