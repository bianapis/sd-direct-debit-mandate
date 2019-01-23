/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class DirectDebitMandateApiController {

	@Autowired
	DirectDebitMandateApiService service;
	
	@BQ("evaluates")
	@Fulfill.ExecutePost
	public BianResponse<DirectDebitMandateEvaluateBaseWithIdAndRoot> executePostEvaluates(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DirectDebitMandateEvaluateBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostEvaluates(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("evaluates")
	@Fulfill.ExecutePut
	public BianResponse<DirectDebitMandateEvaluateBaseWithIdAndRoot> executePutEvaluates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<DirectDebitMandateEvaluateBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutEvaluates(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("registers")
	@Fulfill.ExecutePost
	public BianResponse<DirectDebitMandateRegisterBaseWithIdAndRoot> executePostRegisters(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DirectDebitMandateRegisterBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostRegisters(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("registers")
	@Fulfill.ExecutePut
	public BianResponse<DirectDebitMandateRegisterBaseWithIdAndRoot> executePutRegisters(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<DirectDebitMandateRegisterBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutRegisters(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("updates")
	@Fulfill.ExecutePost
	public BianResponse<DirectDebitMandateUpdateBaseWithIdAndRoot> executePostUpdates(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DirectDebitMandateUpdateBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostUpdates(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("updates")
	@Fulfill.ExecutePut
	public BianResponse<DirectDebitMandateUpdateBaseWithIdAndRoot> executePutUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<DirectDebitMandateUpdateBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutUpdates(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<DirectDebitMandateBaseWithIdAndRoot> initiate(@RequestBody BianRequest<DirectDebitMandateBase> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@Fulfill.Record
	public BianResponse<DirectDebitMandateRecordBaseWithIdAndRoot> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DirectDebitMandateRecordBase> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.RequestPost
	public BianResponse<DirectDebitMandateBaseWithIdAndRoot> requestPost(@RequestBody BianRequest<DirectDebitMandateBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Fulfill.RequestPut
	public BianResponse<DirectDebitMandateBaseWithIdAndRoot> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DirectDebitMandateBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Retrieve
	public BianResponse<DirectDebitMandateBaseWithIdAndRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("evaluations")
	@Fulfill.Retrieve
	public BianResponse<DirectDebitMandateEvaluateBaseWithIdAndRoot> retrieveEvaluations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveEvaluations(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("registrations")
	@Fulfill.Retrieve
	public BianResponse<DirectDebitMandateRegisterBaseWithIdAndRoot> retrieveRegistrations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRegistrations(crReferenceId, bqReferenceId));
	}
	
	@BQ("updates")
	@Fulfill.Retrieve
	public BianResponse<DirectDebitMandateUpdateBaseWithIdAndRoot> retrieveUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdates(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.Terminate
	public BianResponse<Void> terminate(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.terminate(crReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<DirectDebitMandateBaseWithIdAndRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DirectDebitMandateBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
