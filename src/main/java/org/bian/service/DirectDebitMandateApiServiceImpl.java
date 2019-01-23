/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class DirectDebitMandateApiServiceImpl implements DirectDebitMandateApiService {

	public DirectDebitMandateEvaluateBaseWithIdAndRoot executePostEvaluates(String crReferenceId, DirectDebitMandateEvaluateBase request){
		return JsonReader.read("executePost-DirectDebitMandateEvaluateBaseWithIdAndRoot.json",new TypeReference<DirectDebitMandateEvaluateBaseWithIdAndRoot>(){});
	}
	
	public DirectDebitMandateEvaluateBaseWithIdAndRoot executePutEvaluates(String crReferenceId, String bqReferenceId, DirectDebitMandateEvaluateBase request){
		return JsonReader.read("executePut-DirectDebitMandateEvaluateBaseWithIdAndRoot.json",new TypeReference<DirectDebitMandateEvaluateBaseWithIdAndRoot>(){});
	}
	
	public DirectDebitMandateRegisterBaseWithIdAndRoot executePostRegisters(String crReferenceId, DirectDebitMandateRegisterBase request){
		return JsonReader.read("executePost-DirectDebitMandateRegisterBaseWithIdAndRoot.json",new TypeReference<DirectDebitMandateRegisterBaseWithIdAndRoot>(){});
	}
	
	public DirectDebitMandateRegisterBaseWithIdAndRoot executePutRegisters(String crReferenceId, String bqReferenceId, DirectDebitMandateRegisterBase request){
		return JsonReader.read("executePut-DirectDebitMandateRegisterBaseWithIdAndRoot.json",new TypeReference<DirectDebitMandateRegisterBaseWithIdAndRoot>(){});
	}
	
	public DirectDebitMandateUpdateBaseWithIdAndRoot executePostUpdates(String crReferenceId, DirectDebitMandateUpdateBase request){
		return JsonReader.read("executePost-DirectDebitMandateUpdateBaseWithIdAndRoot.json",new TypeReference<DirectDebitMandateUpdateBaseWithIdAndRoot>(){});
	}
	
	public DirectDebitMandateUpdateBaseWithIdAndRoot executePutUpdates(String crReferenceId, String bqReferenceId, DirectDebitMandateUpdateBase request){
		return JsonReader.read("executePut-DirectDebitMandateUpdateBaseWithIdAndRoot.json",new TypeReference<DirectDebitMandateUpdateBaseWithIdAndRoot>(){});
	}
	
	public DirectDebitMandateBaseWithIdAndRoot initiate(DirectDebitMandateBase request){
		return JsonReader.read("initiate-DirectDebitMandateBaseWithIdAndRoot.json",new TypeReference<DirectDebitMandateBaseWithIdAndRoot>(){});
	}
	
	public DirectDebitMandateRecordBaseWithIdAndRoot record(String crReferenceId, DirectDebitMandateRecordBase request){
		return JsonReader.read("record-DirectDebitMandateRecordBaseWithIdAndRoot.json",new TypeReference<DirectDebitMandateRecordBaseWithIdAndRoot>(){});
	}
	
	public DirectDebitMandateBaseWithIdAndRoot requestPost(DirectDebitMandateBase request){
		return JsonReader.read("requestPost-DirectDebitMandateBaseWithIdAndRoot.json",new TypeReference<DirectDebitMandateBaseWithIdAndRoot>(){});
	}
	
	public DirectDebitMandateBaseWithIdAndRoot requestPut(String crReferenceId, DirectDebitMandateBase request){
		return JsonReader.read("requestPut-DirectDebitMandateBaseWithIdAndRoot.json",new TypeReference<DirectDebitMandateBaseWithIdAndRoot>(){});
	}
	
	public DirectDebitMandateBaseWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-DirectDebitMandateBaseWithIdAndRoot.json",new TypeReference<DirectDebitMandateBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public DirectDebitMandateEvaluateBaseWithIdAndRoot retrieveEvaluations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DirectDebitMandateEvaluateBaseWithIdAndRoot.json",new TypeReference<DirectDebitMandateEvaluateBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public DirectDebitMandateRegisterBaseWithIdAndRoot retrieveRegistrations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DirectDebitMandateRegisterBaseWithIdAndRoot.json",new TypeReference<DirectDebitMandateRegisterBaseWithIdAndRoot>(){});
	}
	
	public DirectDebitMandateUpdateBaseWithIdAndRoot retrieveUpdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DirectDebitMandateUpdateBaseWithIdAndRoot.json",new TypeReference<DirectDebitMandateUpdateBaseWithIdAndRoot>(){});
	}
	
	public Void terminate(String crReferenceId){
		return null;
	}
	
	public DirectDebitMandateBaseWithIdAndRoot update(String crReferenceId, DirectDebitMandateBase request){
		return JsonReader.read("update-DirectDebitMandateBaseWithIdAndRoot.json",new TypeReference<DirectDebitMandateBaseWithIdAndRoot>(){});
	}
	
}
