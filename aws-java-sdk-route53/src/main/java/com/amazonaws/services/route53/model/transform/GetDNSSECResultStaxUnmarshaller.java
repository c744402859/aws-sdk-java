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
package com.amazonaws.services.route53.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetDNSSECResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDNSSECResultStaxUnmarshaller implements Unmarshaller<GetDNSSECResult, StaxUnmarshallerContext> {

    public GetDNSSECResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetDNSSECResult getDNSSECResult = new GetDNSSECResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getDNSSECResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Status", targetDepth)) {
                    getDNSSECResult.setStatus(DNSSECStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KeySigningKeys", targetDepth)) {
                    getDNSSECResult.withKeySigningKeys(new ArrayList<KeySigningKey>());
                    continue;
                }

                if (context.testExpression("KeySigningKeys/member", targetDepth)) {
                    getDNSSECResult.withKeySigningKeys(KeySigningKeyStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getDNSSECResult;
                }
            }
        }
    }

    private static GetDNSSECResultStaxUnmarshaller instance;

    public static GetDNSSECResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDNSSECResultStaxUnmarshaller();
        return instance;
    }
}
