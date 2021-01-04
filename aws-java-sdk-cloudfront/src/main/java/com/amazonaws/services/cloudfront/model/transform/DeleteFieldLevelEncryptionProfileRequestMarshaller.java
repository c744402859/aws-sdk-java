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
package com.amazonaws.services.cloudfront.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

/**
 * DeleteFieldLevelEncryptionProfileRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFieldLevelEncryptionProfileRequestMarshaller implements
        Marshaller<Request<DeleteFieldLevelEncryptionProfileRequest>, DeleteFieldLevelEncryptionProfileRequest> {

    public Request<DeleteFieldLevelEncryptionProfileRequest> marshall(DeleteFieldLevelEncryptionProfileRequest deleteFieldLevelEncryptionProfileRequest) {

        if (deleteFieldLevelEncryptionProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteFieldLevelEncryptionProfileRequest> request = new DefaultRequest<DeleteFieldLevelEncryptionProfileRequest>(
                deleteFieldLevelEncryptionProfileRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.DELETE);

        if (deleteFieldLevelEncryptionProfileRequest.getIfMatch() != null) {
            request.addHeader("If-Match", StringUtils.fromString(deleteFieldLevelEncryptionProfileRequest.getIfMatch()));
        }

        String uriResourcePath = "/2020-05-31/field-level-encryption-profile/{Id}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "Id", deleteFieldLevelEncryptionProfileRequest.getId());
        request.setResourcePath(uriResourcePath);

        return request;
    }

}
