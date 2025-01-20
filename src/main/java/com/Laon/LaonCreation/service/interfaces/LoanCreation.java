package com.Laon.LaonCreation.service.interfaces;

import com.Laon.LaonCreation.dto.LoanCreatDto;
import com.Laon.LaonCreation.entity.LoanEntity;
import org.springframework.stereotype.Service;

@Service
public interface LoanCreation {
    LoanEntity createLoan(LoanCreatDto loanCreatDto);
}
