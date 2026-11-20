package com.hemsethu.expensetracker.entity;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.LocalDate;
@Entity @Table(name="expenses") public class Expense {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank @Column(nullable=false) private String title;
 @NotNull @Positive @Column(nullable=false) private Double amount;
 @NotBlank @Column(nullable=false) private String category;
 @NotNull @Column(nullable=false) private LocalDate date;
 public Expense(){}
 public Long getId(){return id;} public void setId(Long id){this.id=id;}
 public String getTitle(){return title;} public void setTitle(String title){this.title=title;}
 public Double getAmount(){return amount;} public void setAmount(Double amount){this.amount=amount;}
 public String getCategory(){return category;} public void setCategory(String category){this.category=category;}
 public LocalDate getDate(){return date;} public void setDate(LocalDate date){this.date=date;}
}
