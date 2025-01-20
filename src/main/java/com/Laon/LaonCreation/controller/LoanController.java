package com.Laon.LaonCreation.controller;

import com.Laon.LaonCreation.dto.LoanCreatDto;
import com.Laon.LaonCreation.entity.LoanEntity;
import com.Laon.LaonCreation.service.interfaces.LoanCreation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; // Import this

@Controller
public class LoanController {

    @Autowired
    private LoanCreation loanCreation;

    @PostMapping("/api/create")
    public ResponseEntity<LoanEntity> createLoan(@RequestBody LoanCreatDto loanCreateDto) { // Add @RequestBody here
        System.out.println("sending request values: ");
        System.out.println("Rate of Interest: " + loanCreateDto.getRateOfInterest());
        System.out.println("Years: " + loanCreateDto.getYears());
        System.out.println("Amount: " + loanCreateDto.getAmount());
        System.out.println("loanCreateDto = " + loanCreateDto);

        LoanEntity createdLoan = loanCreation.createLoan(loanCreateDto);
        return ResponseEntity.ok(createdLoan);
    }
}
