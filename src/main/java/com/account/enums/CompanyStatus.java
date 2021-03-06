package com.account.enums;

public enum CompanyStatus {

    ACTIVE("Active"),IN_ACTIVE("In_Activate"),DELETED("Deleted");

    private final String value;

    CompanyStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
