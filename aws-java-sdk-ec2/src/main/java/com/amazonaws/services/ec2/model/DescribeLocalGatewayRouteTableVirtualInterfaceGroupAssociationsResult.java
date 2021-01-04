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
public class DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the associations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LocalGatewayRouteTableVirtualInterfaceGroupAssociation> localGatewayRouteTableVirtualInterfaceGroupAssociations;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the associations.
     * </p>
     * 
     * @return Information about the associations.
     */

    public java.util.List<LocalGatewayRouteTableVirtualInterfaceGroupAssociation> getLocalGatewayRouteTableVirtualInterfaceGroupAssociations() {
        if (localGatewayRouteTableVirtualInterfaceGroupAssociations == null) {
            localGatewayRouteTableVirtualInterfaceGroupAssociations = new com.amazonaws.internal.SdkInternalList<LocalGatewayRouteTableVirtualInterfaceGroupAssociation>();
        }
        return localGatewayRouteTableVirtualInterfaceGroupAssociations;
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     * 
     * @param localGatewayRouteTableVirtualInterfaceGroupAssociations
     *        Information about the associations.
     */

    public void setLocalGatewayRouteTableVirtualInterfaceGroupAssociations(
            java.util.Collection<LocalGatewayRouteTableVirtualInterfaceGroupAssociation> localGatewayRouteTableVirtualInterfaceGroupAssociations) {
        if (localGatewayRouteTableVirtualInterfaceGroupAssociations == null) {
            this.localGatewayRouteTableVirtualInterfaceGroupAssociations = null;
            return;
        }

        this.localGatewayRouteTableVirtualInterfaceGroupAssociations = new com.amazonaws.internal.SdkInternalList<LocalGatewayRouteTableVirtualInterfaceGroupAssociation>(
                localGatewayRouteTableVirtualInterfaceGroupAssociations);
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocalGatewayRouteTableVirtualInterfaceGroupAssociations(java.util.Collection)} or
     * {@link #withLocalGatewayRouteTableVirtualInterfaceGroupAssociations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param localGatewayRouteTableVirtualInterfaceGroupAssociations
     *        Information about the associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult withLocalGatewayRouteTableVirtualInterfaceGroupAssociations(
            LocalGatewayRouteTableVirtualInterfaceGroupAssociation... localGatewayRouteTableVirtualInterfaceGroupAssociations) {
        if (this.localGatewayRouteTableVirtualInterfaceGroupAssociations == null) {
            setLocalGatewayRouteTableVirtualInterfaceGroupAssociations(new com.amazonaws.internal.SdkInternalList<LocalGatewayRouteTableVirtualInterfaceGroupAssociation>(
                    localGatewayRouteTableVirtualInterfaceGroupAssociations.length));
        }
        for (LocalGatewayRouteTableVirtualInterfaceGroupAssociation ele : localGatewayRouteTableVirtualInterfaceGroupAssociations) {
            this.localGatewayRouteTableVirtualInterfaceGroupAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     * 
     * @param localGatewayRouteTableVirtualInterfaceGroupAssociations
     *        Information about the associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult withLocalGatewayRouteTableVirtualInterfaceGroupAssociations(
            java.util.Collection<LocalGatewayRouteTableVirtualInterfaceGroupAssociation> localGatewayRouteTableVirtualInterfaceGroupAssociations) {
        setLocalGatewayRouteTableVirtualInterfaceGroupAssociations(localGatewayRouteTableVirtualInterfaceGroupAssociations);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult withNextToken(String nextToken) {
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
        if (getLocalGatewayRouteTableVirtualInterfaceGroupAssociations() != null)
            sb.append("LocalGatewayRouteTableVirtualInterfaceGroupAssociations: ").append(getLocalGatewayRouteTableVirtualInterfaceGroupAssociations())
                    .append(",");
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

        if (obj instanceof DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult == false)
            return false;
        DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult other = (DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult) obj;
        if (other.getLocalGatewayRouteTableVirtualInterfaceGroupAssociations() == null
                ^ this.getLocalGatewayRouteTableVirtualInterfaceGroupAssociations() == null)
            return false;
        if (other.getLocalGatewayRouteTableVirtualInterfaceGroupAssociations() != null
                && other.getLocalGatewayRouteTableVirtualInterfaceGroupAssociations().equals(this.getLocalGatewayRouteTableVirtualInterfaceGroupAssociations()) == false)
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

        hashCode = prime
                * hashCode
                + ((getLocalGatewayRouteTableVirtualInterfaceGroupAssociations() == null) ? 0 : getLocalGatewayRouteTableVirtualInterfaceGroupAssociations()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult clone() {
        try {
            return (DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
