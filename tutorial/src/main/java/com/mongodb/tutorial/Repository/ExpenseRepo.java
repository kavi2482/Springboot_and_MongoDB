package com.mongodb.tutorial.Repository;

import com.mongodb.tutorial.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepo extends MongoRepository<Expense,String> {

}
