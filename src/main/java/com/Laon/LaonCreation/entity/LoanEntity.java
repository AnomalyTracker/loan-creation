package com.Laon.LaonCreation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanEntity {

    private String bankName;
    private String borrowerName;
    private double emi;
    private double totalAmount;
    private int years;
}
