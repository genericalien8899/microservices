package com.eazybytes.accounts.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AccountsDto {
    private Long accountNumber;
    private Long accountType;
    private String branchAddress;
}
