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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListUpdates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUpdatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of all the updates for the specified cluster and Region.
     * </p>
     */
    private java.util.List<String> updateIds;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListUpdates</code> request. When the results of a
     * <code>ListUpdates</code> request exceed <code>maxResults</code>, you can use this value to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of all the updates for the specified cluster and Region.
     * </p>
     * 
     * @return A list of all the updates for the specified cluster and Region.
     */

    public java.util.List<String> getUpdateIds() {
        return updateIds;
    }

    /**
     * <p>
     * A list of all the updates for the specified cluster and Region.
     * </p>
     * 
     * @param updateIds
     *        A list of all the updates for the specified cluster and Region.
     */

    public void setUpdateIds(java.util.Collection<String> updateIds) {
        if (updateIds == null) {
            this.updateIds = null;
            return;
        }

        this.updateIds = new java.util.ArrayList<String>(updateIds);
    }

    /**
     * <p>
     * A list of all the updates for the specified cluster and Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdateIds(java.util.Collection)} or {@link #withUpdateIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param updateIds
     *        A list of all the updates for the specified cluster and Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUpdatesResult withUpdateIds(String... updateIds) {
        if (this.updateIds == null) {
            setUpdateIds(new java.util.ArrayList<String>(updateIds.length));
        }
        for (String ele : updateIds) {
            this.updateIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all the updates for the specified cluster and Region.
     * </p>
     * 
     * @param updateIds
     *        A list of all the updates for the specified cluster and Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUpdatesResult withUpdateIds(java.util.Collection<String> updateIds) {
        setUpdateIds(updateIds);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListUpdates</code> request. When the results of a
     * <code>ListUpdates</code> request exceed <code>maxResults</code>, you can use this value to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListUpdates</code> request. When the results
     *        of a <code>ListUpdates</code> request exceed <code>maxResults</code>, you can use this value to retrieve
     *        the next page of results. This value is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListUpdates</code> request. When the results of a
     * <code>ListUpdates</code> request exceed <code>maxResults</code>, you can use this value to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListUpdates</code> request. When the
     *         results of a <code>ListUpdates</code> request exceed <code>maxResults</code>, you can use this value to
     *         retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *         return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListUpdates</code> request. When the results of a
     * <code>ListUpdates</code> request exceed <code>maxResults</code>, you can use this value to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListUpdates</code> request. When the results
     *        of a <code>ListUpdates</code> request exceed <code>maxResults</code>, you can use this value to retrieve
     *        the next page of results. This value is <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUpdatesResult withNextToken(String nextToken) {
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
        if (getUpdateIds() != null)
            sb.append("UpdateIds: ").append(getUpdateIds()).append(",");
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

        if (obj instanceof ListUpdatesResult == false)
            return false;
        ListUpdatesResult other = (ListUpdatesResult) obj;
        if (other.getUpdateIds() == null ^ this.getUpdateIds() == null)
            return false;
        if (other.getUpdateIds() != null && other.getUpdateIds().equals(this.getUpdateIds()) == false)
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

        hashCode = prime * hashCode + ((getUpdateIds() == null) ? 0 : getUpdateIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUpdatesResult clone() {
        try {
            return (ListUpdatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
