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
package com.amazonaws.services.rekognition.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EyeOpenMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EyeOpenMarshaller {

    private static final MarshallingInfo<Boolean> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Value").build();
    private static final MarshallingInfo<Float> CONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Confidence").build();

    private static final EyeOpenMarshaller instance = new EyeOpenMarshaller();

    public static EyeOpenMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EyeOpen eyeOpen, ProtocolMarshaller protocolMarshaller) {

        if (eyeOpen == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eyeOpen.getValue(), VALUE_BINDING);
            protocolMarshaller.marshall(eyeOpen.getConfidence(), CONFIDENCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
