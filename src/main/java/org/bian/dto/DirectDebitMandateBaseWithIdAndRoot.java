package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DirectDebitMandateBaseWithIdAndRoot
 */
public class DirectDebitMandateBaseWithIdAndRoot   {
  private String directDebitMandateFacilityReference = null;

  private String customerReference = null;

  private String directDebitMandateFacilityConfigurationSetUp = null;

  private String directDebitMandateFacilityServiceStatus = null;

  private String directDebitMandateDirectoryReference = null;

  private String directDebitMandateDirectoryEntry = null;

  private String directDebitMandateCustomerReference = null;

  private String directDebitMandateBankReference = null;

  private String directDebitMandateAccountReference = null;

  private String directDebitMandateValidtofromDates = null;

  private String directDebitMandateTerms = null;

  private String directDebitMandateStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: corporate direct debit mandate facility unique identifier 
   * @return directDebitMandateFacilityReference
  **/

  public String getDirectDebitMandateFacilityReference() {
    return directDebitMandateFacilityReference;
  }

  public void setDirectDebitMandateFacilityReference(String directDebitMandateFacilityReference) {
    this.directDebitMandateFacilityReference = directDebitMandateFacilityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the corporate entity owning the direct debit facility 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Direct Debit Mandate Facility Configuration/Set 
   * @return directDebitMandateFacilityConfigurationSetUp
  **/

  public String getDirectDebitMandateFacilityConfigurationSetUp() {
    return directDebitMandateFacilityConfigurationSetUp;
  }

  public void setDirectDebitMandateFacilityConfigurationSetUp(String directDebitMandateFacilityConfigurationSetUp) {
    this.directDebitMandateFacilityConfigurationSetUp = directDebitMandateFacilityConfigurationSetUp;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines the operational status of the facility 
   * @return directDebitMandateFacilityServiceStatus
  **/

  public String getDirectDebitMandateFacilityServiceStatus() {
    return directDebitMandateFacilityServiceStatus;
  }

  public void setDirectDebitMandateFacilityServiceStatus(String directDebitMandateFacilityServiceStatus) {
    this.directDebitMandateFacilityServiceStatus = directDebitMandateFacilityServiceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the directory facility maintaining all active customer mandates 
   * @return directDebitMandateDirectoryReference
  **/

  public String getDirectDebitMandateDirectoryReference() {
    return directDebitMandateDirectoryReference;
  }

  public void setDirectDebitMandateDirectoryReference(String directDebitMandateDirectoryReference) {
    this.directDebitMandateDirectoryReference = directDebitMandateDirectoryReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: a record of the direct debit details maintained for a customer mandate 
   * @return directDebitMandateDirectoryEntry
  **/

  public String getDirectDebitMandateDirectoryEntry() {
    return directDebitMandateDirectoryEntry;
  }

  public void setDirectDebitMandateDirectoryEntry(String directDebitMandateDirectoryEntry) {
    this.directDebitMandateDirectoryEntry = directDebitMandateDirectoryEntry;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: the customer/payer reference for the mandate 
   * @return directDebitMandateCustomerReference
  **/

  public String getDirectDebitMandateCustomerReference() {
    return directDebitMandateCustomerReference;
  }

  public void setDirectDebitMandateCustomerReference(String directDebitMandateCustomerReference) {
    this.directDebitMandateCustomerReference = directDebitMandateCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: the bank holdings the payer's account 
   * @return directDebitMandateBankReference
  **/

  public String getDirectDebitMandateBankReference() {
    return directDebitMandateBankReference;
  }

  public void setDirectDebitMandateBankReference(String directDebitMandateBankReference) {
    this.directDebitMandateBankReference = directDebitMandateBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the payer's account 
   * @return directDebitMandateAccountReference
  **/

  public String getDirectDebitMandateAccountReference() {
    return directDebitMandateAccountReference;
  }

  public void setDirectDebitMandateAccountReference(String directDebitMandateAccountReference) {
    this.directDebitMandateAccountReference = directDebitMandateAccountReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: the period for which the mandate is in force 
   * @return directDebitMandateValidtofromDates
  **/

  public String getDirectDebitMandateValidtofromDates() {
    return directDebitMandateValidtofromDates;
  }

  public void setDirectDebitMandateValidtofromDates(String directDebitMandateValidtofromDates) {
    this.directDebitMandateValidtofromDates = directDebitMandateValidtofromDates;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: and usage details/restrictions that apply to use of the mandate 
   * @return directDebitMandateTerms
  **/

  public String getDirectDebitMandateTerms() {
    return directDebitMandateTerms;
  }

  public void setDirectDebitMandateTerms(String directDebitMandateTerms) {
    this.directDebitMandateTerms = directDebitMandateTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: current processing status for the mandate  
   * @return directDebitMandateStatus
  **/

  public String getDirectDebitMandateStatus() {
    return directDebitMandateStatus;
  }

  public void setDirectDebitMandateStatus(String directDebitMandateStatus) {
    this.directDebitMandateStatus = directDebitMandateStatus;
  }


}

