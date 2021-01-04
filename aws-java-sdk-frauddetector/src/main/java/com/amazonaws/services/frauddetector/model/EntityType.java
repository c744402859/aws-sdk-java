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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The entity type details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/EntityType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The entity type name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The entity type description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Timestamp of when the entity type was last updated.
     * </p>
     */
    private String lastUpdatedTime;
    /**
     * <p>
     * Timestamp of when the entity type was created.
     * </p>
     */
    private String createdTime;
    /**
     * <p>
     * The entity type ARN.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The entity type name.
     * </p>
     * 
     * @param name
     *        The entity type name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The entity type name.
     * </p>
     * 
     * @return The entity type name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The entity type name.
     * </p>
     * 
     * @param name
     *        The entity type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityType withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The entity type description.
     * </p>
     * 
     * @param description
     *        The entity type description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The entity type description.
     * </p>
     * 
     * @return The entity type description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The entity type description.
     * </p>
     * 
     * @param description
     *        The entity type description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityType withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Timestamp of when the entity type was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Timestamp of when the entity type was last updated.
     */

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of when the entity type was last updated.
     * </p>
     * 
     * @return Timestamp of when the entity type was last updated.
     */

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of when the entity type was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Timestamp of when the entity type was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityType withLastUpdatedTime(String lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * Timestamp of when the entity type was created.
     * </p>
     * 
     * @param createdTime
     *        Timestamp of when the entity type was created.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * Timestamp of when the entity type was created.
     * </p>
     * 
     * @return Timestamp of when the entity type was created.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * Timestamp of when the entity type was created.
     * </p>
     * 
     * @param createdTime
     *        Timestamp of when the entity type was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityType withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The entity type ARN.
     * </p>
     * 
     * @param arn
     *        The entity type ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The entity type ARN.
     * </p>
     * 
     * @return The entity type ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The entity type ARN.
     * </p>
     * 
     * @param arn
     *        The entity type ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityType withArn(String arn) {
        setArn(arn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityType == false)
            return false;
        EntityType other = (EntityType) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public EntityType clone() {
        try {
            return (EntityType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.EntityTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
