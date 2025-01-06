package com.mongodb.tutorial.Controller;


import com.mongodb.tutorial.Service.ExpenseService;
import com.mongodb.tutorial.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @GetMapping("/all")
    public ResponseEntity<List<Expense>> getAllExpense(){
        return ResponseEntity.ok(service.getExpense());

    }
    @PostMapping("/add")
    public ResponseEntity<?> addExpense(@RequestBody Expense exp) {
        try {
            service.addExpense(exp);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            // Log the exception to provide more context in the logs
            e.printStackTrace(); // or use a logger to log this exception
            return ResponseEntity.internalServerError().build();
        }
    }
    @GetMapping("/find/{id}")
    public Optional<Expense> getExpenseById(@PathVariable String id){
        return ResponseEntity.ok(service.getExpenseById(id)).getBody();

    }
    @PutMapping("/update")
    public ResponseEntity updateExpense(@RequestBody Expense exp){
        try{
            service.updateExpense(exp);
            return ResponseEntity.ok().build();
        }
        catch (Exception e){
            e.printStackTrace(); // or use a logger to log this exception
            return ResponseEntity.internalServerError().build();
        }

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteExpense(@PathVariable String id){
        try{
            service.deleteExpense(id);
            return (ResponseEntity) ResponseEntity.status(HttpStatus.OK);
        }
        catch (Exception e){
            return (ResponseEntity) ResponseEntity.internalServerError();
        }

    }
}
