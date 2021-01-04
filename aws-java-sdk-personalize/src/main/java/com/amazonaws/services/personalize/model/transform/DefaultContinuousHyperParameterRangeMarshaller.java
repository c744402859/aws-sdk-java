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
package com.amazonaws.services.personalize.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.personalize.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DefaultContinuousHyperParameterRangeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DefaultContinuousHyperParameterRangeMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Double> MINVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("minValue").build();
    private static final MarshallingInfo<Double> MAXVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("maxValue").build();
    private static final MarshallingInfo<Boolean> ISTUNABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isTunable").build();

    private static final DefaultContinuousHyperParameterRangeMarshaller instance = new DefaultContinuousHyperParameterRangeMarshaller();

    public static DefaultContinuousHyperParameterRangeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DefaultContinuousHyperParameterRange defaultContinuousHyperParameterRange, ProtocolMarshaller protocolMarshaller) {

        if (defaultContinuousHyperParameterRange == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(defaultContinuousHyperParameterRange.getName(), NAME_BINDING);
            protocolMarshaller.marshall(defaultContinuousHyperParameterRange.getMinValue(), MINVALUE_BINDING);
            protocolMarshaller.marshall(defaultContinuousHyperParameterRange.getMaxValue(), MAXVALUE_BINDING);
            protocolMarshaller.marshall(defaultContinuousHyperParameterRange.getIsTunable(), ISTUNABLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
