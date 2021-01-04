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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateImageVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateImageVersionRequestMarshaller {

    private static final MarshallingInfo<String> BASEIMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BaseImage").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> IMAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageName").build();

    private static final CreateImageVersionRequestMarshaller instance = new CreateImageVersionRequestMarshaller();

    public static CreateImageVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateImageVersionRequest createImageVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createImageVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createImageVersionRequest.getBaseImage(), BASEIMAGE_BINDING);
            protocolMarshaller.marshall(createImageVersionRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createImageVersionRequest.getImageName(), IMAGENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
