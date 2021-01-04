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
package com.amazonaws.services.servermigration.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servermigration.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ValidationOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ValidationOutputMarshaller {

    private static final MarshallingInfo<String> VALIDATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("validationId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<java.util.Date> LATESTVALIDATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("latestValidationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> APPVALIDATIONOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("appValidationOutput").build();
    private static final MarshallingInfo<StructuredPojo> SERVERVALIDATIONOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serverValidationOutput").build();

    private static final ValidationOutputMarshaller instance = new ValidationOutputMarshaller();

    public static ValidationOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ValidationOutput validationOutput, ProtocolMarshaller protocolMarshaller) {

        if (validationOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(validationOutput.getValidationId(), VALIDATIONID_BINDING);
            protocolMarshaller.marshall(validationOutput.getName(), NAME_BINDING);
            protocolMarshaller.marshall(validationOutput.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(validationOutput.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(validationOutput.getLatestValidationTime(), LATESTVALIDATIONTIME_BINDING);
            protocolMarshaller.marshall(validationOutput.getAppValidationOutput(), APPVALIDATIONOUTPUT_BINDING);
            protocolMarshaller.marshall(validationOutput.getServerValidationOutput(), SERVERVALIDATIONOUTPUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
