/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface DirectDebitMandateApiService {

	DirectDebitMandateEvaluateBaseWithIdAndRoot executePostEvaluates(String crReferenceId, DirectDebitMandateEvaluateBase request);
	
	DirectDebitMandateEvaluateBaseWithIdAndRoot executePutEvaluates(String crReferenceId, String bqReferenceId, DirectDebitMandateEvaluateBase request);
	
	DirectDebitMandateRegisterBaseWithIdAndRoot executePostRegisters(String crReferenceId, DirectDebitMandateRegisterBase request);
	
	DirectDebitMandateRegisterBaseWithIdAndRoot executePutRegisters(String crReferenceId, String bqReferenceId, DirectDebitMandateRegisterBase request);
	
	DirectDebitMandateUpdateBaseWithIdAndRoot executePostUpdates(String crReferenceId, DirectDebitMandateUpdateBase request);
	
	DirectDebitMandateUpdateBaseWithIdAndRoot executePutUpdates(String crReferenceId, String bqReferenceId, DirectDebitMandateUpdateBase request);
	
	DirectDebitMandateBaseWithIdAndRoot initiate(DirectDebitMandateBase request);
	
	DirectDebitMandateRecordBaseWithIdAndRoot record(String crReferenceId, DirectDebitMandateRecordBase request);
	
	DirectDebitMandateBaseWithIdAndRoot requestPost(DirectDebitMandateBase request);
	
	DirectDebitMandateBaseWithIdAndRoot requestPut(String crReferenceId, DirectDebitMandateBase request);
	
	DirectDebitMandateBaseWithIdAndRoot retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	DirectDebitMandateEvaluateBaseWithIdAndRoot retrieveEvaluations(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	DirectDebitMandateRegisterBaseWithIdAndRoot retrieveRegistrations(String crReferenceId, String bqReferenceId);
	
	DirectDebitMandateUpdateBaseWithIdAndRoot retrieveUpdates(String crReferenceId, String bqReferenceId);
	
	Void terminate(String crReferenceId);
	
	DirectDebitMandateBaseWithIdAndRoot update(String crReferenceId, DirectDebitMandateBase request);
	
}
