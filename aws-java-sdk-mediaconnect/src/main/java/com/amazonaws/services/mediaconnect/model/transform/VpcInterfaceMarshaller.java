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
package com.amazonaws.services.mediaconnect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VpcInterfaceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VpcInterfaceMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<List> NETWORKINTERFACEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkInterfaceIds").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityGroupIds").build();
    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnetId").build();

    private static final VpcInterfaceMarshaller instance = new VpcInterfaceMarshaller();

    public static VpcInterfaceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VpcInterface vpcInterface, ProtocolMarshaller protocolMarshaller) {

        if (vpcInterface == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vpcInterface.getName(), NAME_BINDING);
            protocolMarshaller.marshall(vpcInterface.getNetworkInterfaceIds(), NETWORKINTERFACEIDS_BINDING);
            protocolMarshaller.marshall(vpcInterface.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(vpcInterface.getSecurityGroupIds(), SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(vpcInterface.getSubnetId(), SUBNETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
