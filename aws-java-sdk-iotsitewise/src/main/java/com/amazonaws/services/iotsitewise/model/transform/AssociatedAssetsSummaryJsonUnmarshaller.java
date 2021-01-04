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
package com.amazonaws.services.iotsitewise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AssociatedAssetsSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociatedAssetsSummaryJsonUnmarshaller implements Unmarshaller<AssociatedAssetsSummary, JsonUnmarshallerContext> {

    public AssociatedAssetsSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssociatedAssetsSummary associatedAssetsSummary = new AssociatedAssetsSummary();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    associatedAssetsSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    associatedAssetsSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    associatedAssetsSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetModelId", targetDepth)) {
                    context.nextToken();
                    associatedAssetsSummary.setAssetModelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    associatedAssetsSummary.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdateDate", targetDepth)) {
                    context.nextToken();
                    associatedAssetsSummary.setLastUpdateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    associatedAssetsSummary.setStatus(AssetStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("hierarchies", targetDepth)) {
                    context.nextToken();
                    associatedAssetsSummary.setHierarchies(new ListUnmarshaller<AssetHierarchy>(AssetHierarchyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return associatedAssetsSummary;
    }

    private static AssociatedAssetsSummaryJsonUnmarshaller instance;

    public static AssociatedAssetsSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociatedAssetsSummaryJsonUnmarshaller();
        return instance;
    }
}
