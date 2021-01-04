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
package com.amazonaws.services.identitystore.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request processing has failed because of an unknown error, exception or failure with an internal server.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServerException extends com.amazonaws.services.identitystore.model.AWSIdentityStoreException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The identifier for each request. This value is a globally unique ID that is generated by the Identity Store
     * service for each sent request, and is then returned inside the exception if the request fails.
     * </p>
     */
    private String requestId;

    /**
     * Constructs a new InternalServerException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InternalServerException(String message) {
        super(message);
    }

    /**
     * <p>
     * The identifier for each request. This value is a globally unique ID that is generated by the Identity Store
     * service for each sent request, and is then returned inside the exception if the request fails.
     * </p>
     * 
     * @param requestId
     *        The identifier for each request. This value is a globally unique ID that is generated by the Identity
     *        Store service for each sent request, and is then returned inside the exception if the request fails.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The identifier for each request. This value is a globally unique ID that is generated by the Identity Store
     * service for each sent request, and is then returned inside the exception if the request fails.
     * </p>
     * 
     * @return The identifier for each request. This value is a globally unique ID that is generated by the Identity
     *         Store service for each sent request, and is then returned inside the exception if the request fails.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The identifier for each request. This value is a globally unique ID that is generated by the Identity Store
     * service for each sent request, and is then returned inside the exception if the request fails.
     * </p>
     * 
     * @param requestId
     *        The identifier for each request. This value is a globally unique ID that is generated by the Identity
     *        Store service for each sent request, and is then returned inside the exception if the request fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternalServerException withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

}
