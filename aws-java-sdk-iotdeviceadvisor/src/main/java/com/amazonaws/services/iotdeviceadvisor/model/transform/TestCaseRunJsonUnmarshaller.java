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
package com.amazonaws.services.iotdeviceadvisor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotdeviceadvisor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TestCaseRun JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestCaseRunJsonUnmarshaller implements Unmarshaller<TestCaseRun, JsonUnmarshallerContext> {

    public TestCaseRun unmarshall(JsonUnmarshallerContext context) throws Exception {
        TestCaseRun testCaseRun = new TestCaseRun();

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
                if (context.testExpression("testCaseRunId", targetDepth)) {
                    context.nextToken();
                    testCaseRun.setTestCaseRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testCaseDefinitionId", targetDepth)) {
                    context.nextToken();
                    testCaseRun.setTestCaseDefinitionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testCaseDefinitionName", targetDepth)) {
                    context.nextToken();
                    testCaseRun.setTestCaseDefinitionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    testCaseRun.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    testCaseRun.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    testCaseRun.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("logUrl", targetDepth)) {
                    context.nextToken();
                    testCaseRun.setLogUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("warnings", targetDepth)) {
                    context.nextToken();
                    testCaseRun.setWarnings(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failure", targetDepth)) {
                    context.nextToken();
                    testCaseRun.setFailure(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return testCaseRun;
    }

    private static TestCaseRunJsonUnmarshaller instance;

    public static TestCaseRunJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TestCaseRunJsonUnmarshaller();
        return instance;
    }
}
