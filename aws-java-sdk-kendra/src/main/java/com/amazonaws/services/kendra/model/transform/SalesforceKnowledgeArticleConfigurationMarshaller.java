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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SalesforceKnowledgeArticleConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SalesforceKnowledgeArticleConfigurationMarshaller {

    private static final MarshallingInfo<List> INCLUDEDSTATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludedStates").build();
    private static final MarshallingInfo<StructuredPojo> STANDARDKNOWLEDGEARTICLETYPECONFIGURATION_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StandardKnowledgeArticleTypeConfiguration")
            .build();
    private static final MarshallingInfo<List> CUSTOMKNOWLEDGEARTICLETYPECONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomKnowledgeArticleTypeConfigurations").build();

    private static final SalesforceKnowledgeArticleConfigurationMarshaller instance = new SalesforceKnowledgeArticleConfigurationMarshaller();

    public static SalesforceKnowledgeArticleConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SalesforceKnowledgeArticleConfiguration salesforceKnowledgeArticleConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (salesforceKnowledgeArticleConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(salesforceKnowledgeArticleConfiguration.getIncludedStates(), INCLUDEDSTATES_BINDING);
            protocolMarshaller.marshall(salesforceKnowledgeArticleConfiguration.getStandardKnowledgeArticleTypeConfiguration(),
                    STANDARDKNOWLEDGEARTICLETYPECONFIGURATION_BINDING);
            protocolMarshaller.marshall(salesforceKnowledgeArticleConfiguration.getCustomKnowledgeArticleTypeConfigurations(),
                    CUSTOMKNOWLEDGEARTICLETYPECONFIGURATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
