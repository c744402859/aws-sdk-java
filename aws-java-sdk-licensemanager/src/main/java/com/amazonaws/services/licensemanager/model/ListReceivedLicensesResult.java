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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListReceivedLicenses"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReceivedLicensesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Received license details.
     * </p>
     */
    private java.util.List<GrantedLicense> licenses;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Received license details.
     * </p>
     * 
     * @return Received license details.
     */

    public java.util.List<GrantedLicense> getLicenses() {
        return licenses;
    }

    /**
     * <p>
     * Received license details.
     * </p>
     * 
     * @param licenses
     *        Received license details.
     */

    public void setLicenses(java.util.Collection<GrantedLicense> licenses) {
        if (licenses == null) {
            this.licenses = null;
            return;
        }

        this.licenses = new java.util.ArrayList<GrantedLicense>(licenses);
    }

    /**
     * <p>
     * Received license details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenses(java.util.Collection)} or {@link #withLicenses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param licenses
     *        Received license details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReceivedLicensesResult withLicenses(GrantedLicense... licenses) {
        if (this.licenses == null) {
            setLicenses(new java.util.ArrayList<GrantedLicense>(licenses.length));
        }
        for (GrantedLicense ele : licenses) {
            this.licenses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Received license details.
     * </p>
     * 
     * @param licenses
     *        Received license details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReceivedLicensesResult withLicenses(java.util.Collection<GrantedLicense> licenses) {
        setLicenses(licenses);
        return this;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @return Token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReceivedLicensesResult withNextToken(String nextToken) {
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
        if (getLicenses() != null)
            sb.append("Licenses: ").append(getLicenses()).append(",");
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

        if (obj instanceof ListReceivedLicensesResult == false)
            return false;
        ListReceivedLicensesResult other = (ListReceivedLicensesResult) obj;
        if (other.getLicenses() == null ^ this.getLicenses() == null)
            return false;
        if (other.getLicenses() != null && other.getLicenses().equals(this.getLicenses()) == false)
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

        hashCode = prime * hashCode + ((getLicenses() == null) ? 0 : getLicenses().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListReceivedLicensesResult clone() {
        try {
            return (ListReceivedLicensesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
