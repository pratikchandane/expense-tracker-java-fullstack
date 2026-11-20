package com.hemsethu.expensetracker.controller;
import com.hemsethu.expensetracker.entity.Expense; import com.hemsethu.expensetracker.service.ExpenseService; import org.springframework.web.bind.annotation.*; import jakarta.validation.Valid; import java.util.List;
@RestController @RequestMapping("/api/expenses") @CrossOrigin(origins="http://localhost:5173") public class ExpenseController {
 private final ExpenseService service; public ExpenseController(ExpenseService service){this.service=service;}
 @GetMapping public List<Expense> list(@RequestParam(required=false) String category){return service.list(category);}
 @PostMapping public Expense create(@Valid @RequestBody Expense e){return service.save(e);}
 @PutMapping("/{id}") public Expense update(@PathVariable Long id,@Valid @RequestBody Expense e){return service.update(id,e);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.delete(id);}
}
