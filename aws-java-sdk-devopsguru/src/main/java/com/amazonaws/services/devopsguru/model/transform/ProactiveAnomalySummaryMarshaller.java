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
package com.amazonaws.services.devopsguru.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devopsguru.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProactiveAnomalySummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProactiveAnomalySummaryMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> SEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Severity").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> ANOMALYTIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyTimeRange").build();
    private static final MarshallingInfo<StructuredPojo> PREDICTIONTIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PredictionTimeRange").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceDetails").build();
    private static final MarshallingInfo<String> ASSOCIATEDINSIGHTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociatedInsightId").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCECOLLECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceCollection").build();
    private static final MarshallingInfo<Double> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Limit").build();

    private static final ProactiveAnomalySummaryMarshaller instance = new ProactiveAnomalySummaryMarshaller();

    public static ProactiveAnomalySummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProactiveAnomalySummary proactiveAnomalySummary, ProtocolMarshaller protocolMarshaller) {

        if (proactiveAnomalySummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(proactiveAnomalySummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(proactiveAnomalySummary.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(proactiveAnomalySummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(proactiveAnomalySummary.getUpdateTime(), UPDATETIME_BINDING);
            protocolMarshaller.marshall(proactiveAnomalySummary.getAnomalyTimeRange(), ANOMALYTIMERANGE_BINDING);
            protocolMarshaller.marshall(proactiveAnomalySummary.getPredictionTimeRange(), PREDICTIONTIMERANGE_BINDING);
            protocolMarshaller.marshall(proactiveAnomalySummary.getSourceDetails(), SOURCEDETAILS_BINDING);
            protocolMarshaller.marshall(proactiveAnomalySummary.getAssociatedInsightId(), ASSOCIATEDINSIGHTID_BINDING);
            protocolMarshaller.marshall(proactiveAnomalySummary.getResourceCollection(), RESOURCECOLLECTION_BINDING);
            protocolMarshaller.marshall(proactiveAnomalySummary.getLimit(), LIMIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
