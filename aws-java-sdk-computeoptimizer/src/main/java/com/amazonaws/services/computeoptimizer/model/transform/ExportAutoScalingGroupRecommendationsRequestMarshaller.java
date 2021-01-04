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
package com.amazonaws.services.computeoptimizer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExportAutoScalingGroupRecommendationsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExportAutoScalingGroupRecommendationsRequestMarshaller {

    private static final MarshallingInfo<List> ACCOUNTIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountIds").build();
    private static final MarshallingInfo<List> FILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("filters").build();
    private static final MarshallingInfo<List> FIELDSTOEXPORT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fieldsToExport").build();
    private static final MarshallingInfo<StructuredPojo> S3DESTINATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3DestinationConfig").build();
    private static final MarshallingInfo<String> FILEFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileFormat").build();
    private static final MarshallingInfo<Boolean> INCLUDEMEMBERACCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeMemberAccounts").build();

    private static final ExportAutoScalingGroupRecommendationsRequestMarshaller instance = new ExportAutoScalingGroupRecommendationsRequestMarshaller();

    public static ExportAutoScalingGroupRecommendationsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExportAutoScalingGroupRecommendationsRequest exportAutoScalingGroupRecommendationsRequest, ProtocolMarshaller protocolMarshaller) {

        if (exportAutoScalingGroupRecommendationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(exportAutoScalingGroupRecommendationsRequest.getAccountIds(), ACCOUNTIDS_BINDING);
            protocolMarshaller.marshall(exportAutoScalingGroupRecommendationsRequest.getFilters(), FILTERS_BINDING);
            protocolMarshaller.marshall(exportAutoScalingGroupRecommendationsRequest.getFieldsToExport(), FIELDSTOEXPORT_BINDING);
            protocolMarshaller.marshall(exportAutoScalingGroupRecommendationsRequest.getS3DestinationConfig(), S3DESTINATIONCONFIG_BINDING);
            protocolMarshaller.marshall(exportAutoScalingGroupRecommendationsRequest.getFileFormat(), FILEFORMAT_BINDING);
            protocolMarshaller.marshall(exportAutoScalingGroupRecommendationsRequest.getIncludeMemberAccounts(), INCLUDEMEMBERACCOUNTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
