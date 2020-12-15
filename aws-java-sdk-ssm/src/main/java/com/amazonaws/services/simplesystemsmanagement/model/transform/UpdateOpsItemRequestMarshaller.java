/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateOpsItemRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateOpsItemRequestMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Map> OPERATIONALDATA_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OperationalData").build();
    private static final MarshallingInfo<List> OPERATIONALDATATODELETE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperationalDataToDelete").build();
    private static final MarshallingInfo<List> NOTIFICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Notifications").build();
    private static final MarshallingInfo<Integer> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Priority").build();
    private static final MarshallingInfo<List> RELATEDOPSITEMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelatedOpsItems").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> OPSITEMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OpsItemId").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> CATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Category").build();
    private static final MarshallingInfo<String> SEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Severity").build();
    private static final MarshallingInfo<java.util.Date> ACTUALSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActualStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ACTUALENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActualEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> PLANNEDSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlannedStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> PLANNEDENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlannedEndTime").timestampFormat("unixTimestamp").build();

    private static final UpdateOpsItemRequestMarshaller instance = new UpdateOpsItemRequestMarshaller();

    public static UpdateOpsItemRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateOpsItemRequest updateOpsItemRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateOpsItemRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateOpsItemRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateOpsItemRequest.getOperationalData(), OPERATIONALDATA_BINDING);
            protocolMarshaller.marshall(updateOpsItemRequest.getOperationalDataToDelete(), OPERATIONALDATATODELETE_BINDING);
            protocolMarshaller.marshall(updateOpsItemRequest.getNotifications(), NOTIFICATIONS_BINDING);
            protocolMarshaller.marshall(updateOpsItemRequest.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(updateOpsItemRequest.getRelatedOpsItems(), RELATEDOPSITEMS_BINDING);
            protocolMarshaller.marshall(updateOpsItemRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(updateOpsItemRequest.getOpsItemId(), OPSITEMID_BINDING);
            protocolMarshaller.marshall(updateOpsItemRequest.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(updateOpsItemRequest.getCategory(), CATEGORY_BINDING);
            protocolMarshaller.marshall(updateOpsItemRequest.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(updateOpsItemRequest.getActualStartTime(), ACTUALSTARTTIME_BINDING);
            protocolMarshaller.marshall(updateOpsItemRequest.getActualEndTime(), ACTUALENDTIME_BINDING);
            protocolMarshaller.marshall(updateOpsItemRequest.getPlannedStartTime(), PLANNEDSTARTTIME_BINDING);
            protocolMarshaller.marshall(updateOpsItemRequest.getPlannedEndTime(), PLANNEDENDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
