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
public class DescribePrincipalIdFormatResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the ID format settings for the ARN.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PrincipalIdFormat> principals;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the ID format settings for the ARN.
     * </p>
     * 
     * @return Information about the ID format settings for the ARN.
     */

    public java.util.List<PrincipalIdFormat> getPrincipals() {
        if (principals == null) {
            principals = new com.amazonaws.internal.SdkInternalList<PrincipalIdFormat>();
        }
        return principals;
    }

    /**
     * <p>
     * Information about the ID format settings for the ARN.
     * </p>
     * 
     * @param principals
     *        Information about the ID format settings for the ARN.
     */

    public void setPrincipals(java.util.Collection<PrincipalIdFormat> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new com.amazonaws.internal.SdkInternalList<PrincipalIdFormat>(principals);
    }

    /**
     * <p>
     * Information about the ID format settings for the ARN.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        Information about the ID format settings for the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePrincipalIdFormatResult withPrincipals(PrincipalIdFormat... principals) {
        if (this.principals == null) {
            setPrincipals(new com.amazonaws.internal.SdkInternalList<PrincipalIdFormat>(principals.length));
        }
        for (PrincipalIdFormat ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the ID format settings for the ARN.
     * </p>
     * 
     * @param principals
     *        Information about the ID format settings for the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePrincipalIdFormatResult withPrincipals(java.util.Collection<PrincipalIdFormat> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is null when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePrincipalIdFormatResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePrincipalIdFormatResult == false)
            return false;
        DescribePrincipalIdFormatResult other = (DescribePrincipalIdFormatResult) obj;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePrincipalIdFormatResult clone() {
        try {
            return (DescribePrincipalIdFormatResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
