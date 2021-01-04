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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connector-specific profile properties required when using Slack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SlackConnectorProfileProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlackConnectorProfileProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location of the Slack resource.
     * </p>
     */
    private String instanceUrl;

    /**
     * <p>
     * The location of the Slack resource.
     * </p>
     * 
     * @param instanceUrl
     *        The location of the Slack resource.
     */

    public void setInstanceUrl(String instanceUrl) {
        this.instanceUrl = instanceUrl;
    }

    /**
     * <p>
     * The location of the Slack resource.
     * </p>
     * 
     * @return The location of the Slack resource.
     */

    public String getInstanceUrl() {
        return this.instanceUrl;
    }

    /**
     * <p>
     * The location of the Slack resource.
     * </p>
     * 
     * @param instanceUrl
     *        The location of the Slack resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackConnectorProfileProperties withInstanceUrl(String instanceUrl) {
        setInstanceUrl(instanceUrl);
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
        if (getInstanceUrl() != null)
            sb.append("InstanceUrl: ").append(getInstanceUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlackConnectorProfileProperties == false)
            return false;
        SlackConnectorProfileProperties other = (SlackConnectorProfileProperties) obj;
        if (other.getInstanceUrl() == null ^ this.getInstanceUrl() == null)
            return false;
        if (other.getInstanceUrl() != null && other.getInstanceUrl().equals(this.getInstanceUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceUrl() == null) ? 0 : getInstanceUrl().hashCode());
        return hashCode;
    }

    @Override
    public SlackConnectorProfileProperties clone() {
        try {
            return (SlackConnectorProfileProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.SlackConnectorProfilePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
