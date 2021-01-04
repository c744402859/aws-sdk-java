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
package com.amazonaws.services.comprehend.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TopicsDetectionJobFilter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicsDetectionJobFilterJsonUnmarshaller implements Unmarshaller<TopicsDetectionJobFilter, JsonUnmarshallerContext> {

    public TopicsDetectionJobFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        TopicsDetectionJobFilter topicsDetectionJobFilter = new TopicsDetectionJobFilter();

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
                if (context.testExpression("JobName", targetDepth)) {
                    context.nextToken();
                    topicsDetectionJobFilter.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobStatus", targetDepth)) {
                    context.nextToken();
                    topicsDetectionJobFilter.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubmitTimeBefore", targetDepth)) {
                    context.nextToken();
                    topicsDetectionJobFilter.setSubmitTimeBefore(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SubmitTimeAfter", targetDepth)) {
                    context.nextToken();
                    topicsDetectionJobFilter.setSubmitTimeAfter(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return topicsDetectionJobFilter;
    }

    private static TopicsDetectionJobFilterJsonUnmarshaller instance;

    public static TopicsDetectionJobFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TopicsDetectionJobFilterJsonUnmarshaller();
        return instance;
    }
}
