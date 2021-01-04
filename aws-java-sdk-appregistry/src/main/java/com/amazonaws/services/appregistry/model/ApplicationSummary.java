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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary of a Service Catalog AppRegistry application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ApplicationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the application.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the application across services.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the application. The name must be unique in the region in which you are creating the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment when the application was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment when the application was last updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The identifier of the application.
     * </p>
     * 
     * @param id
     *        The identifier of the application.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the application.
     * </p>
     * 
     * @return The identifier of the application.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the application.
     * </p>
     * 
     * @param id
     *        The identifier of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the application across services.
     * </p>
     * 
     * @param arn
     *        The Amazon resource name (ARN) that specifies the application across services.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the application across services.
     * </p>
     * 
     * @return The Amazon resource name (ARN) that specifies the application across services.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the application across services.
     * </p>
     * 
     * @param arn
     *        The Amazon resource name (ARN) that specifies the application across services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the application. The name must be unique in the region in which you are creating the application.
     * </p>
     * 
     * @param name
     *        The name of the application. The name must be unique in the region in which you are creating the
     *        application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application. The name must be unique in the region in which you are creating the application.
     * </p>
     * 
     * @return The name of the application. The name must be unique in the region in which you are creating the
     *         application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application. The name must be unique in the region in which you are creating the application.
     * </p>
     * 
     * @param name
     *        The name of the application. The name must be unique in the region in which you are creating the
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @return The description of the application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment when the application was created.
     * </p>
     * 
     * @param creationTime
     *        The ISO-8601 formatted timestamp of the moment when the application was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment when the application was created.
     * </p>
     * 
     * @return The ISO-8601 formatted timestamp of the moment when the application was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment when the application was created.
     * </p>
     * 
     * @param creationTime
     *        The ISO-8601 formatted timestamp of the moment when the application was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment when the application was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The ISO-8601 formatted timestamp of the moment when the application was last updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment when the application was last updated.
     * </p>
     * 
     * @return The ISO-8601 formatted timestamp of the moment when the application was last updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The ISO-8601 formatted timestamp of the moment when the application was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The ISO-8601 formatted timestamp of the moment when the application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationSummary == false)
            return false;
        ApplicationSummary other = (ApplicationSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationSummary clone() {
        try {
            return (ApplicationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appregistry.model.transform.ApplicationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
