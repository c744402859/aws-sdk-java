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
package com.amazonaws.services.networkfirewall.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkfirewall.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateFirewallRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateFirewallRequestMarshaller {

    private static final MarshallingInfo<String> FIREWALLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallName").build();
    private static final MarshallingInfo<String> FIREWALLPOLICYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallPolicyArn").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<List> SUBNETMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetMappings").build();
    private static final MarshallingInfo<Boolean> DELETEPROTECTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteProtection").build();
    private static final MarshallingInfo<Boolean> SUBNETCHANGEPROTECTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetChangeProtection").build();
    private static final MarshallingInfo<Boolean> FIREWALLPOLICYCHANGEPROTECTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallPolicyChangeProtection").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateFirewallRequestMarshaller instance = new CreateFirewallRequestMarshaller();

    public static CreateFirewallRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateFirewallRequest createFirewallRequest, ProtocolMarshaller protocolMarshaller) {

        if (createFirewallRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createFirewallRequest.getFirewallName(), FIREWALLNAME_BINDING);
            protocolMarshaller.marshall(createFirewallRequest.getFirewallPolicyArn(), FIREWALLPOLICYARN_BINDING);
            protocolMarshaller.marshall(createFirewallRequest.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(createFirewallRequest.getSubnetMappings(), SUBNETMAPPINGS_BINDING);
            protocolMarshaller.marshall(createFirewallRequest.getDeleteProtection(), DELETEPROTECTION_BINDING);
            protocolMarshaller.marshall(createFirewallRequest.getSubnetChangeProtection(), SUBNETCHANGEPROTECTION_BINDING);
            protocolMarshaller.marshall(createFirewallRequest.getFirewallPolicyChangeProtection(), FIREWALLPOLICYCHANGEPROTECTION_BINDING);
            protocolMarshaller.marshall(createFirewallRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createFirewallRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
