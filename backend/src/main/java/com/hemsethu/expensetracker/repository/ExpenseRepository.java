package com.hemsethu.expensetracker.repository;
import com.hemsethu.expensetracker.entity.Expense; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface ExpenseRepository extends JpaRepository<Expense,Long> { List<Expense> findByCategoryIgnoreCase(String category); }
