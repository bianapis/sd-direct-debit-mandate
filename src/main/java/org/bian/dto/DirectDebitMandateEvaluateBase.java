package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DirectDebitMandateEvaluateBase
 */
public class DirectDebitMandateEvaluateBase   {
  private String directDebitMandateDirectoryReference = null;

  private String directDebitMandateDirectoryEntry = null;

  private Object directDebitTransactionRecord = null;

  private Object directDebitEvaluationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: details of the proposed direct debit transaction 
   * @return directDebitTransactionRecord
  **/

  public Object getDirectDebitTransactionRecord() {
    return directDebitTransactionRecord;
  }

  public void setDirectDebitTransactionRecord(Object directDebitTransactionRecord) {
    this.directDebitTransactionRecord = directDebitTransactionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: processing record for the customer mandate evaluation task 
   * @return directDebitEvaluationRecord
  **/

  public Object getDirectDebitEvaluationRecord() {
    return directDebitEvaluationRecord;
  }

  public void setDirectDebitEvaluationRecord(Object directDebitEvaluationRecord) {
    this.directDebitEvaluationRecord = directDebitEvaluationRecord;
  }


}

