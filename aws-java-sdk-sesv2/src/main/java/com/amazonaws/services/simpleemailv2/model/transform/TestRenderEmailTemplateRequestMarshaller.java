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
package com.amazonaws.services.simpleemailv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleemailv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TestRenderEmailTemplateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TestRenderEmailTemplateRequestMarshaller {

    private static final MarshallingInfo<String> TEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("TemplateName").build();
    private static final MarshallingInfo<String> TEMPLATEDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateData").build();

    private static final TestRenderEmailTemplateRequestMarshaller instance = new TestRenderEmailTemplateRequestMarshaller();

    public static TestRenderEmailTemplateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TestRenderEmailTemplateRequest testRenderEmailTemplateRequest, ProtocolMarshaller protocolMarshaller) {

        if (testRenderEmailTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(testRenderEmailTemplateRequest.getTemplateName(), TEMPLATENAME_BINDING);
            protocolMarshaller.marshall(testRenderEmailTemplateRequest.getTemplateData(), TEMPLATEDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
