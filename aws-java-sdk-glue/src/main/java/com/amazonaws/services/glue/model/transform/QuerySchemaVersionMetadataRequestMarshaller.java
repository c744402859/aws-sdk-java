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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QuerySchemaVersionMetadataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QuerySchemaVersionMetadataRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> SCHEMAID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaId").build();
    private static final MarshallingInfo<StructuredPojo> SCHEMAVERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaVersionNumber").build();
    private static final MarshallingInfo<String> SCHEMAVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaVersionId").build();
    private static final MarshallingInfo<List> METADATALIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MetadataList").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final QuerySchemaVersionMetadataRequestMarshaller instance = new QuerySchemaVersionMetadataRequestMarshaller();

    public static QuerySchemaVersionMetadataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QuerySchemaVersionMetadataRequest querySchemaVersionMetadataRequest, ProtocolMarshaller protocolMarshaller) {

        if (querySchemaVersionMetadataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(querySchemaVersionMetadataRequest.getSchemaId(), SCHEMAID_BINDING);
            protocolMarshaller.marshall(querySchemaVersionMetadataRequest.getSchemaVersionNumber(), SCHEMAVERSIONNUMBER_BINDING);
            protocolMarshaller.marshall(querySchemaVersionMetadataRequest.getSchemaVersionId(), SCHEMAVERSIONID_BINDING);
            protocolMarshaller.marshall(querySchemaVersionMetadataRequest.getMetadataList(), METADATALIST_BINDING);
            protocolMarshaller.marshall(querySchemaVersionMetadataRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(querySchemaVersionMetadataRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
