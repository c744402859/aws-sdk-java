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
package com.amazonaws.services.wellarchitected.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetLensReviewRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetLensReviewRequestMarshaller {

    private static final MarshallingInfo<String> WORKLOADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("WorkloadId").build();
    private static final MarshallingInfo<String> LENSALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("LensAlias").build();
    private static final MarshallingInfo<Integer> MILESTONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("MilestoneNumber").build();

    private static final GetLensReviewRequestMarshaller instance = new GetLensReviewRequestMarshaller();

    public static GetLensReviewRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetLensReviewRequest getLensReviewRequest, ProtocolMarshaller protocolMarshaller) {

        if (getLensReviewRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getLensReviewRequest.getWorkloadId(), WORKLOADID_BINDING);
            protocolMarshaller.marshall(getLensReviewRequest.getLensAlias(), LENSALIAS_BINDING);
            protocolMarshaller.marshall(getLensReviewRequest.getMilestoneNumber(), MILESTONENUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
