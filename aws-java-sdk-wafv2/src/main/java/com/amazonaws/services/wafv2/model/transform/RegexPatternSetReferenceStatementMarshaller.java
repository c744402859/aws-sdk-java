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
package com.amazonaws.services.wafv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wafv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegexPatternSetReferenceStatementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegexPatternSetReferenceStatementMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ARN").build();
    private static final MarshallingInfo<StructuredPojo> FIELDTOMATCH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldToMatch").build();
    private static final MarshallingInfo<List> TEXTTRANSFORMATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TextTransformations").build();

    private static final RegexPatternSetReferenceStatementMarshaller instance = new RegexPatternSetReferenceStatementMarshaller();

    public static RegexPatternSetReferenceStatementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegexPatternSetReferenceStatement regexPatternSetReferenceStatement, ProtocolMarshaller protocolMarshaller) {

        if (regexPatternSetReferenceStatement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(regexPatternSetReferenceStatement.getARN(), ARN_BINDING);
            protocolMarshaller.marshall(regexPatternSetReferenceStatement.getFieldToMatch(), FIELDTOMATCH_BINDING);
            protocolMarshaller.marshall(regexPatternSetReferenceStatement.getTextTransformations(), TEXTTRANSFORMATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
