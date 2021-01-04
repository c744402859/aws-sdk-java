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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstanceSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceSummaryJsonUnmarshaller implements Unmarshaller<InstanceSummary, JsonUnmarshallerContext> {

    public InstanceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceSummary instanceSummary = new InstanceSummary();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    instanceSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    instanceSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentityManagementType", targetDepth)) {
                    context.nextToken();
                    instanceSummary.setIdentityManagementType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceAlias", targetDepth)) {
                    context.nextToken();
                    instanceSummary.setInstanceAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    instanceSummary.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ServiceRole", targetDepth)) {
                    context.nextToken();
                    instanceSummary.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceStatus", targetDepth)) {
                    context.nextToken();
                    instanceSummary.setInstanceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InboundCallsEnabled", targetDepth)) {
                    context.nextToken();
                    instanceSummary.setInboundCallsEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OutboundCallsEnabled", targetDepth)) {
                    context.nextToken();
                    instanceSummary.setOutboundCallsEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instanceSummary;
    }

    private static InstanceSummaryJsonUnmarshaller instance;

    public static InstanceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceSummaryJsonUnmarshaller();
        return instance;
    }
}
