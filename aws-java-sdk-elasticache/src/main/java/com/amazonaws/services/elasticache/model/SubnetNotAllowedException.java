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
package com.amazonaws.services.elasticache.model;

import javax.annotation.Generated;

/**
 * <p>
 * At least one subnet ID does not match the other subnet IDs. This mismatch typically occurs when a user sets one
 * subnet ID to a regional Availability Zone and a different one to an outpost. Or when a user sets the subnet ID to an
 * Outpost when not subscribed on this service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubnetNotAllowedException extends com.amazonaws.services.elasticache.model.AmazonElastiCacheException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new SubnetNotAllowedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public SubnetNotAllowedException(String message) {
        super(message);
    }

}
