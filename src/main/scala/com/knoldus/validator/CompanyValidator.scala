package com.knoldus.validator

import com.knoldus.models.Company

class CompanyValidator {

  def companyIsValid(company: Company): Boolean= {
    if (companyName.getCompanyByName(company.name).isEmpty && validateEmail.emailIsValid(company.emailId)) {
    true
  }
    else
    false
  }
}
