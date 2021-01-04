/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.quicksight.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateIAMPolicyAssignmentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateIAMPolicyAssignmentRequestMarshaller {

    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("AwsAccountId").build();
    private static final MarshallingInfo<String> ASSIGNMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssignmentName").build();
    private static final MarshallingInfo<String> ASSIGNMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssignmentStatus").build();
    private static final MarshallingInfo<String> POLICYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PolicyArn").build();
    private static final MarshallingInfo<Map> IDENTITIES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Identities").build();
    private static final MarshallingInfo<String> NAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("Namespace").build();

    private static final CreateIAMPolicyAssignmentRequestMarshaller instance = new CreateIAMPolicyAssignmentRequestMarshaller();

    public static CreateIAMPolicyAssignmentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateIAMPolicyAssignmentRequest createIAMPolicyAssignmentRequest, ProtocolMarshaller protocolMarshaller) {

        if (createIAMPolicyAssignmentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createIAMPolicyAssignmentRequest.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(createIAMPolicyAssignmentRequest.getAssignmentName(), ASSIGNMENTNAME_BINDING);
            protocolMarshaller.marshall(createIAMPolicyAssignmentRequest.getAssignmentStatus(), ASSIGNMENTSTATUS_BINDING);
            protocolMarshaller.marshall(createIAMPolicyAssignmentRequest.getPolicyArn(), POLICYARN_BINDING);
            protocolMarshaller.marshall(createIAMPolicyAssignmentRequest.getIdentities(), IDENTITIES_BINDING);
            protocolMarshaller.marshall(createIAMPolicyAssignmentRequest.getNamespace(), NAMESPACE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
