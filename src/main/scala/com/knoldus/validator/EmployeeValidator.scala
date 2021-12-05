package com.knoldus.validator

import com.knoldus.models.Employee

class EmployeeValidator {

  def employeeIsValid(employee: Employee): Boolean = {
    if(companyName.getCompanyByName(employee.companyName).isDefined && validateEmail.emailIsValid(employee.emailId))
      true
    else
      false
  }
}
