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
package com.amazonaws.services.location.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.location.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SearchPlaceIndexForTextRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SearchPlaceIndexForTextRequestMarshaller {

    private static final MarshallingInfo<List> BIASPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BiasPosition").build();
    private static final MarshallingInfo<List> FILTERBBOX_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FilterBBox").build();
    private static final MarshallingInfo<List> FILTERCOUNTRIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterCountries").build();
    private static final MarshallingInfo<String> INDEXNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("IndexName").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> TEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Text").build();

    private static final SearchPlaceIndexForTextRequestMarshaller instance = new SearchPlaceIndexForTextRequestMarshaller();

    public static SearchPlaceIndexForTextRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SearchPlaceIndexForTextRequest searchPlaceIndexForTextRequest, ProtocolMarshaller protocolMarshaller) {

        if (searchPlaceIndexForTextRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(searchPlaceIndexForTextRequest.getBiasPosition(), BIASPOSITION_BINDING);
            protocolMarshaller.marshall(searchPlaceIndexForTextRequest.getFilterBBox(), FILTERBBOX_BINDING);
            protocolMarshaller.marshall(searchPlaceIndexForTextRequest.getFilterCountries(), FILTERCOUNTRIES_BINDING);
            protocolMarshaller.marshall(searchPlaceIndexForTextRequest.getIndexName(), INDEXNAME_BINDING);
            protocolMarshaller.marshall(searchPlaceIndexForTextRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(searchPlaceIndexForTextRequest.getText(), TEXT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
