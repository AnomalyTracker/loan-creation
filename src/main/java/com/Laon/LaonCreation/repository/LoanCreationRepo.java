package com.Laon.LaonCreation.repository;

import com.Laon.LaonCreation.entity.LoanEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LoanCreationRepo {
    private final List<LoanEntity> loans = new ArrayList<>();

    public LoanEntity createLoan(LoanEntity loanEntity) {
        loans.add(loanEntity);
        return loanEntity; // Return the added loan entity
    }

    public List<LoanEntity> getLoans() {
        return loans; // Optional: method to retrieve loans if needed
    }
}
