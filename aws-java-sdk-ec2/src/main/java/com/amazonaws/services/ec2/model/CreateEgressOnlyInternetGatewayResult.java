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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEgressOnlyInternetGatewayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Information about the egress-only internet gateway.
     * </p>
     */
    private EgressOnlyInternetGateway egressOnlyInternetGateway;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEgressOnlyInternetGatewayResult withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Information about the egress-only internet gateway.
     * </p>
     * 
     * @param egressOnlyInternetGateway
     *        Information about the egress-only internet gateway.
     */

    public void setEgressOnlyInternetGateway(EgressOnlyInternetGateway egressOnlyInternetGateway) {
        this.egressOnlyInternetGateway = egressOnlyInternetGateway;
    }

    /**
     * <p>
     * Information about the egress-only internet gateway.
     * </p>
     * 
     * @return Information about the egress-only internet gateway.
     */

    public EgressOnlyInternetGateway getEgressOnlyInternetGateway() {
        return this.egressOnlyInternetGateway;
    }

    /**
     * <p>
     * Information about the egress-only internet gateway.
     * </p>
     * 
     * @param egressOnlyInternetGateway
     *        Information about the egress-only internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEgressOnlyInternetGatewayResult withEgressOnlyInternetGateway(EgressOnlyInternetGateway egressOnlyInternetGateway) {
        setEgressOnlyInternetGateway(egressOnlyInternetGateway);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getEgressOnlyInternetGateway() != null)
            sb.append("EgressOnlyInternetGateway: ").append(getEgressOnlyInternetGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEgressOnlyInternetGatewayResult == false)
            return false;
        CreateEgressOnlyInternetGatewayResult other = (CreateEgressOnlyInternetGatewayResult) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getEgressOnlyInternetGateway() == null ^ this.getEgressOnlyInternetGateway() == null)
            return false;
        if (other.getEgressOnlyInternetGateway() != null && other.getEgressOnlyInternetGateway().equals(this.getEgressOnlyInternetGateway()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getEgressOnlyInternetGateway() == null) ? 0 : getEgressOnlyInternetGateway().hashCode());
        return hashCode;
    }

    @Override
    public CreateEgressOnlyInternetGatewayResult clone() {
        try {
            return (CreateEgressOnlyInternetGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
