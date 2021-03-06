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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsDynamoDbTableSseDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsDynamoDbTableSseDescriptionMarshaller {

    private static final MarshallingInfo<String> INACCESSIBLEENCRYPTIONDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InaccessibleEncryptionDateTime").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> SSETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SseType").build();
    private static final MarshallingInfo<String> KMSMASTERKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KmsMasterKeyArn").build();

    private static final AwsDynamoDbTableSseDescriptionMarshaller instance = new AwsDynamoDbTableSseDescriptionMarshaller();

    public static AwsDynamoDbTableSseDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsDynamoDbTableSseDescription awsDynamoDbTableSseDescription, ProtocolMarshaller protocolMarshaller) {

        if (awsDynamoDbTableSseDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsDynamoDbTableSseDescription.getInaccessibleEncryptionDateTime(), INACCESSIBLEENCRYPTIONDATETIME_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableSseDescription.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableSseDescription.getSseType(), SSETYPE_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableSseDescription.getKmsMasterKeyArn(), KMSMASTERKEYARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
