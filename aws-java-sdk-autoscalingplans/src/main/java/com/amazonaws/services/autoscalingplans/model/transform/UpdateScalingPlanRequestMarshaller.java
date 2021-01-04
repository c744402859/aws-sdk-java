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
package com.amazonaws.services.autoscalingplans.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.autoscalingplans.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateScalingPlanRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateScalingPlanRequestMarshaller {

    private static final MarshallingInfo<String> SCALINGPLANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingPlanName").build();
    private static final MarshallingInfo<Long> SCALINGPLANVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingPlanVersion").build();
    private static final MarshallingInfo<StructuredPojo> APPLICATIONSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationSource").build();
    private static final MarshallingInfo<List> SCALINGINSTRUCTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingInstructions").build();

    private static final UpdateScalingPlanRequestMarshaller instance = new UpdateScalingPlanRequestMarshaller();

    public static UpdateScalingPlanRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateScalingPlanRequest updateScalingPlanRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateScalingPlanRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateScalingPlanRequest.getScalingPlanName(), SCALINGPLANNAME_BINDING);
            protocolMarshaller.marshall(updateScalingPlanRequest.getScalingPlanVersion(), SCALINGPLANVERSION_BINDING);
            protocolMarshaller.marshall(updateScalingPlanRequest.getApplicationSource(), APPLICATIONSOURCE_BINDING);
            protocolMarshaller.marshall(updateScalingPlanRequest.getScalingInstructions(), SCALINGINSTRUCTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
