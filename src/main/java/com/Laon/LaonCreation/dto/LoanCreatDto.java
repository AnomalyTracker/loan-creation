package com.Laon.LaonCreation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanCreatDto {
    private String bankName;
    private String borrowerName;
    private long amount;
    private int years;
    private int rateOfInterest;  // Corrected spelling
}
