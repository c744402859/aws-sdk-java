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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBClusterEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBClusterEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase
     * string.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     * </p>
     */
    private String dBClusterEndpointIdentifier;
    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>, <code>WRITER</code>, <code>ANY</code>.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * List of DB instance identifiers that are part of the custom endpoint group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> staticMembers;
    /**
     * <p>
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are
     * reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> excludedMembers;
    /**
     * <p>
     * The tags to be assigned to the Amazon RDS resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase
     * string.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a
     *        lowercase string.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase
     * string.
     * </p>
     * 
     * @return The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a
     *         lowercase string.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase
     * string.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a
     *        lowercase string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterEndpointRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param dBClusterEndpointIdentifier
     *        The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     */

    public void setDBClusterEndpointIdentifier(String dBClusterEndpointIdentifier) {
        this.dBClusterEndpointIdentifier = dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @return The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     */

    public String getDBClusterEndpointIdentifier() {
        return this.dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param dBClusterEndpointIdentifier
     *        The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterEndpointRequest withDBClusterEndpointIdentifier(String dBClusterEndpointIdentifier) {
        setDBClusterEndpointIdentifier(dBClusterEndpointIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>, <code>WRITER</code>, <code>ANY</code>.
     * </p>
     * 
     * @param endpointType
     *        The type of the endpoint. One of: <code>READER</code>, <code>WRITER</code>, <code>ANY</code>.
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>, <code>WRITER</code>, <code>ANY</code>.
     * </p>
     * 
     * @return The type of the endpoint. One of: <code>READER</code>, <code>WRITER</code>, <code>ANY</code>.
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>, <code>WRITER</code>, <code>ANY</code>.
     * </p>
     * 
     * @param endpointType
     *        The type of the endpoint. One of: <code>READER</code>, <code>WRITER</code>, <code>ANY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterEndpointRequest withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * List of DB instance identifiers that are part of the custom endpoint group.
     * </p>
     * 
     * @return List of DB instance identifiers that are part of the custom endpoint group.
     */

    public java.util.List<String> getStaticMembers() {
        if (staticMembers == null) {
            staticMembers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return staticMembers;
    }

    /**
     * <p>
     * List of DB instance identifiers that are part of the custom endpoint group.
     * </p>
     * 
     * @param staticMembers
     *        List of DB instance identifiers that are part of the custom endpoint group.
     */

    public void setStaticMembers(java.util.Collection<String> staticMembers) {
        if (staticMembers == null) {
            this.staticMembers = null;
            return;
        }

        this.staticMembers = new com.amazonaws.internal.SdkInternalList<String>(staticMembers);
    }

    /**
     * <p>
     * List of DB instance identifiers that are part of the custom endpoint group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStaticMembers(java.util.Collection)} or {@link #withStaticMembers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param staticMembers
     *        List of DB instance identifiers that are part of the custom endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterEndpointRequest withStaticMembers(String... staticMembers) {
        if (this.staticMembers == null) {
            setStaticMembers(new com.amazonaws.internal.SdkInternalList<String>(staticMembers.length));
        }
        for (String ele : staticMembers) {
            this.staticMembers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of DB instance identifiers that are part of the custom endpoint group.
     * </p>
     * 
     * @param staticMembers
     *        List of DB instance identifiers that are part of the custom endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterEndpointRequest withStaticMembers(java.util.Collection<String> staticMembers) {
        setStaticMembers(staticMembers);
        return this;
    }

    /**
     * <p>
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are
     * reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * </p>
     * 
     * @return List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible
     *         instances are reachable through the custom endpoint. Only relevant if the list of static members is
     *         empty.
     */

    public java.util.List<String> getExcludedMembers() {
        if (excludedMembers == null) {
            excludedMembers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return excludedMembers;
    }

    /**
     * <p>
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are
     * reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * </p>
     * 
     * @param excludedMembers
     *        List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible
     *        instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
     */

    public void setExcludedMembers(java.util.Collection<String> excludedMembers) {
        if (excludedMembers == null) {
            this.excludedMembers = null;
            return;
        }

        this.excludedMembers = new com.amazonaws.internal.SdkInternalList<String>(excludedMembers);
    }

    /**
     * <p>
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are
     * reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedMembers(java.util.Collection)} or {@link #withExcludedMembers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param excludedMembers
     *        List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible
     *        instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterEndpointRequest withExcludedMembers(String... excludedMembers) {
        if (this.excludedMembers == null) {
            setExcludedMembers(new com.amazonaws.internal.SdkInternalList<String>(excludedMembers.length));
        }
        for (String ele : excludedMembers) {
            this.excludedMembers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are
     * reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * </p>
     * 
     * @param excludedMembers
     *        List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible
     *        instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterEndpointRequest withExcludedMembers(java.util.Collection<String> excludedMembers) {
        setExcludedMembers(excludedMembers);
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the Amazon RDS resource.
     * </p>
     * 
     * @return The tags to be assigned to the Amazon RDS resource.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags to be assigned to the Amazon RDS resource.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the Amazon RDS resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to be assigned to the Amazon RDS resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the Amazon RDS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterEndpointRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the Amazon RDS resource.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the Amazon RDS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterEndpointRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getDBClusterEndpointIdentifier() != null)
            sb.append("DBClusterEndpointIdentifier: ").append(getDBClusterEndpointIdentifier()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getStaticMembers() != null)
            sb.append("StaticMembers: ").append(getStaticMembers()).append(",");
        if (getExcludedMembers() != null)
            sb.append("ExcludedMembers: ").append(getExcludedMembers()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBClusterEndpointRequest == false)
            return false;
        CreateDBClusterEndpointRequest other = (CreateDBClusterEndpointRequest) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBClusterEndpointIdentifier() == null ^ this.getDBClusterEndpointIdentifier() == null)
            return false;
        if (other.getDBClusterEndpointIdentifier() != null && other.getDBClusterEndpointIdentifier().equals(this.getDBClusterEndpointIdentifier()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getStaticMembers() == null ^ this.getStaticMembers() == null)
            return false;
        if (other.getStaticMembers() != null && other.getStaticMembers().equals(this.getStaticMembers()) == false)
            return false;
        if (other.getExcludedMembers() == null ^ this.getExcludedMembers() == null)
            return false;
        if (other.getExcludedMembers() != null && other.getExcludedMembers().equals(this.getExcludedMembers()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBClusterEndpointIdentifier() == null) ? 0 : getDBClusterEndpointIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getStaticMembers() == null) ? 0 : getStaticMembers().hashCode());
        hashCode = prime * hashCode + ((getExcludedMembers() == null) ? 0 : getExcludedMembers().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBClusterEndpointRequest clone() {
        return (CreateDBClusterEndpointRequest) super.clone();
    }

}
