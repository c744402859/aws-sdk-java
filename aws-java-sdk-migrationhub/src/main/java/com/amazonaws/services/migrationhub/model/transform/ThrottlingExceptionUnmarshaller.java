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
package com.amazonaws.services.migrationhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ThrottlingException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private ThrottlingExceptionUnmarshaller() {
        super(com.amazonaws.services.migrationhub.model.ThrottlingException.class, "ThrottlingException");
    }

    @Override
    public com.amazonaws.services.migrationhub.model.ThrottlingException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.migrationhub.model.ThrottlingException throttlingException = new com.amazonaws.services.migrationhub.model.ThrottlingException(
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
                if (context.testExpression("RetryAfterSeconds", targetDepth)) {
                    context.nextToken();
                    throttlingException.setRetryAfterSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }
        return throttlingException;
    }

    private static ThrottlingExceptionUnmarshaller instance;

    public static ThrottlingExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new ThrottlingExceptionUnmarshaller();
        return instance;
    }
}
