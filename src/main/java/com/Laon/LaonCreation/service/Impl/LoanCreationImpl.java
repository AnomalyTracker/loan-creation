package com.Laon.LaonCreation.service.Impl;


import com.Laon.LaonCreation.dto.LoanCreatDto;
import com.Laon.LaonCreation.entity.LoanEntity;
import com.Laon.LaonCreation.repository.LoanCreationRepo;
import com.Laon.LaonCreation.service.interfaces.LoanCreation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanCreationImpl implements LoanCreation {
    @Autowired
    private LoanCreationRepo loanCreationRepo;

    @Override
    public LoanEntity createLoan(LoanCreatDto loanCreatDto) {
        double rateOfInterest = loanCreatDto.getRateOfInterest();
        int years = loanCreatDto.getYears();
        long amount = loanCreatDto.getAmount();
        System.out.println("Received values: ");
        System.out.println("Rate of Interest: " + rateOfInterest);
        System.out.println("Years: " + years);
        System.out.println("Amount: " + amount);

        if (years <= 0 || amount <= 0 || rateOfInterest < 0) {
            throw new IllegalArgumentException("Invalid input values.");
        }

        double total = (rateOfInterest / 100) * amount * years;
        double emi = total / (years * 12);
        LoanEntity loanEntity = new LoanEntity();

        loanEntity.setBankName(loanCreatDto.getBankName());
        loanEntity.setBorrowerName(loanCreatDto.getBorrowerName());
        loanEntity.setYears(years);
        loanEntity.setEmi(emi);
        loanEntity.setTotalAmount(total);

        LoanEntity createdLoan = loanCreationRepo.createLoan(loanEntity);

        return createdLoan;
    }
}
