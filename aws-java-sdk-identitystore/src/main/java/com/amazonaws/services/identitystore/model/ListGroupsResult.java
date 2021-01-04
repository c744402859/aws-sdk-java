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

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>Group</code> objects in the identity store.
     * </p>
     */
    private java.util.List<Group> groups;
    /**
     * <p>
     * The pagination token used for the <code>ListUsers</code> and <code>ListGroups</code> APIs. This value is
     * generated by the identity store service and is returned in the API response if the total results are more than
     * the size of one page, and when this token is used in the API request to search for the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>Group</code> objects in the identity store.
     * </p>
     * 
     * @return A list of <code>Group</code> objects in the identity store.
     */

    public java.util.List<Group> getGroups() {
        return groups;
    }

    /**
     * <p>
     * A list of <code>Group</code> objects in the identity store.
     * </p>
     * 
     * @param groups
     *        A list of <code>Group</code> objects in the identity store.
     */

    public void setGroups(java.util.Collection<Group> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<Group>(groups);
    }

    /**
     * <p>
     * A list of <code>Group</code> objects in the identity store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        A list of <code>Group</code> objects in the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsResult withGroups(Group... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<Group>(groups.length));
        }
        for (Group ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Group</code> objects in the identity store.
     * </p>
     * 
     * @param groups
     *        A list of <code>Group</code> objects in the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsResult withGroups(java.util.Collection<Group> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The pagination token used for the <code>ListUsers</code> and <code>ListGroups</code> APIs. This value is
     * generated by the identity store service and is returned in the API response if the total results are more than
     * the size of one page, and when this token is used in the API request to search for the next page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used for the <code>ListUsers</code> and <code>ListGroups</code> APIs. This value is
     *        generated by the identity store service and is returned in the API response if the total results are more
     *        than the size of one page, and when this token is used in the API request to search for the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used for the <code>ListUsers</code> and <code>ListGroups</code> APIs. This value is
     * generated by the identity store service and is returned in the API response if the total results are more than
     * the size of one page, and when this token is used in the API request to search for the next page.
     * </p>
     * 
     * @return The pagination token used for the <code>ListUsers</code> and <code>ListGroups</code> APIs. This value is
     *         generated by the identity store service and is returned in the API response if the total results are more
     *         than the size of one page, and when this token is used in the API request to search for the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used for the <code>ListUsers</code> and <code>ListGroups</code> APIs. This value is
     * generated by the identity store service and is returned in the API response if the total results are more than
     * the size of one page, and when this token is used in the API request to search for the next page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used for the <code>ListUsers</code> and <code>ListGroups</code> APIs. This value is
     *        generated by the identity store service and is returned in the API response if the total results are more
     *        than the size of one page, and when this token is used in the API request to search for the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsResult withNextToken(String nextToken) {
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
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
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

        if (obj instanceof ListGroupsResult == false)
            return false;
        ListGroupsResult other = (ListGroupsResult) obj;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
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

        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupsResult clone() {
        try {
            return (ListGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
