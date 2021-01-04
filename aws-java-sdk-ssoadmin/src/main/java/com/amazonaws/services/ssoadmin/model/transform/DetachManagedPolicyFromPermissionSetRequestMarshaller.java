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
package com.amazonaws.services.ssoadmin.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssoadmin.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DetachManagedPolicyFromPermissionSetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DetachManagedPolicyFromPermissionSetRequestMarshaller {

    private static final MarshallingInfo<String> INSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceArn").build();
    private static final MarshallingInfo<String> PERMISSIONSETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PermissionSetArn").build();
    private static final MarshallingInfo<String> MANAGEDPOLICYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManagedPolicyArn").build();

    private static final DetachManagedPolicyFromPermissionSetRequestMarshaller instance = new DetachManagedPolicyFromPermissionSetRequestMarshaller();

    public static DetachManagedPolicyFromPermissionSetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DetachManagedPolicyFromPermissionSetRequest detachManagedPolicyFromPermissionSetRequest, ProtocolMarshaller protocolMarshaller) {

        if (detachManagedPolicyFromPermissionSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(detachManagedPolicyFromPermissionSetRequest.getInstanceArn(), INSTANCEARN_BINDING);
            protocolMarshaller.marshall(detachManagedPolicyFromPermissionSetRequest.getPermissionSetArn(), PERMISSIONSETARN_BINDING);
            protocolMarshaller.marshall(detachManagedPolicyFromPermissionSetRequest.getManagedPolicyArn(), MANAGEDPOLICYARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
