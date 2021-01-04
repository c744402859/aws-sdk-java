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
package com.amazonaws.services.eks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.eks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ResourceNotFoundException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private ResourceNotFoundExceptionUnmarshaller() {
        super(com.amazonaws.services.eks.model.ResourceNotFoundException.class, "ResourceNotFoundException");
    }

    @Override
    public com.amazonaws.services.eks.model.ResourceNotFoundException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.eks.model.ResourceNotFoundException resourceNotFoundException = new com.amazonaws.services.eks.model.ResourceNotFoundException(
                null);

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
                if (context.testExpression("clusterName", targetDepth)) {
                    context.nextToken();
                    resourceNotFoundException.setClusterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nodegroupName", targetDepth)) {
                    context.nextToken();
                    resourceNotFoundException.setNodegroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fargateProfileName", targetDepth)) {
                    context.nextToken();
                    resourceNotFoundException.setFargateProfileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("addonName", targetDepth)) {
                    context.nextToken();
                    resourceNotFoundException.setAddonName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }
        return resourceNotFoundException;
    }

    private static ResourceNotFoundExceptionUnmarshaller instance;

    public static ResourceNotFoundExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceNotFoundExceptionUnmarshaller();
        return instance;
    }
}
