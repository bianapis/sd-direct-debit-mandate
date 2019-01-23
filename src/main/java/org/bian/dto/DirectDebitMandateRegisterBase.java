package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DirectDebitMandateRegisterBase
 */
public class DirectDebitMandateRegisterBase   {
  private String directDebitMandateDirectoryReference = null;

  private String directDebitMandateDirectoryEntry = null;

  private String directDebitMandateCustomerReference = null;

  private String directDebitMandateBankReference = null;

  private String directDebitMandateAccountReference = null;

  private String directDebitMandateValidtofromDates = null;

  private String directDebitMandateTerms = null;

  private String directDebitMandateStatus = null;

  private String correspondenceReference = null;

  private String correspondenceContent = null;

  private String documentReference = null;

  private String documentContent = null;

  private Object directDebitMandateRegistrationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the directory facility maintaining all active mandates 
   * @return directDebitMandateDirectoryReference
  **/

  public String getDirectDebitMandateDirectoryReference() {
    return directDebitMandateDirectoryReference;
  }

  public void setDirectDebitMandateDirectoryReference(String directDebitMandateDirectoryReference) {
    this.directDebitMandateDirectoryReference = directDebitMandateDirectoryReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: a record of the direct debit details maintained for an individual's mandate 
   * @return directDebitMandateDirectoryEntry
  **/

  public String getDirectDebitMandateDirectoryEntry() {
    return directDebitMandateDirectoryEntry;
  }

  public void setDirectDebitMandateDirectoryEntry(String directDebitMandateDirectoryEntry) {
    this.directDebitMandateDirectoryEntry = directDebitMandateDirectoryEntry;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: the individual/payer reference for the mandate 
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: exchanges with the individual providing the mandate 
   * @return correspondenceReference
  **/

  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: correspondence content 
   * @return correspondenceContent
  **/

  public String getCorrespondenceContent() {
    return correspondenceContent;
  }

  public void setCorrespondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to the mandate forms and other legal documents created & referenced 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: document copy/content 
   * @return documentContent
  **/

  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: processing record for the customer mandate registration task 
   * @return directDebitMandateRegistrationRecord
  **/

  public Object getDirectDebitMandateRegistrationRecord() {
    return directDebitMandateRegistrationRecord;
  }

  public void setDirectDebitMandateRegistrationRecord(Object directDebitMandateRegistrationRecord) {
    this.directDebitMandateRegistrationRecord = directDebitMandateRegistrationRecord;
  }


}

