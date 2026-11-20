package com.hemsethu.expensetracker.service;
import com.hemsethu.expensetracker.entity.Expense; import com.hemsethu.expensetracker.repository.ExpenseRepository; import org.springframework.stereotype.Service; import java.util.*;
@Service public class ExpenseService {
 private final ExpenseRepository repo; private static final Set<String> CATEGORIES=Set.of("Food","Travel","Shopping","Bills","Other");
 public ExpenseService(ExpenseRepository repo){this.repo=repo;}
 public List<Expense> list(String category){return category==null||category.isBlank()||category.equalsIgnoreCase("All")?repo.findAll():repo.findByCategoryIgnoreCase(category);}
 public Expense save(Expense e){validate(e); return repo.save(e);}
 public Expense update(Long id,Expense e){Expense old=repo.findById(id).orElseThrow(()->new NoSuchElementException("Expense not found"));validate(e);old.setTitle(e.getTitle());old.setAmount(e.getAmount());old.setCategory(e.getCategory());old.setDate(e.getDate());return repo.save(old);}
 public void delete(Long id){if(!repo.existsById(id))throw new NoSuchElementException("Expense not found");repo.deleteById(id);}
 private void validate(Expense e){if(e.getTitle()==null||e.getTitle().isBlank()||e.getAmount()==null||e.getAmount()<=0||e.getCategory()==null||!CATEGORIES.contains(e.getCategory())||e.getDate()==null)throw new IllegalArgumentException("Please provide valid title, positive amount, category and date.");}
}
