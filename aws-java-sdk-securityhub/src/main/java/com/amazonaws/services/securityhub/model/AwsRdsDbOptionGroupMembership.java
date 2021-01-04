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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbOptionGroupMembership"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbOptionGroupMembership implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String optionGroupName;
    /** <p/> */
    private String status;

    /**
     * <p/>
     * 
     * @param optionGroupName
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p/>
     * 
     * @param optionGroupName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbOptionGroupMembership withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p/>
     * 
     * @param status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p/>
     * 
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbOptionGroupMembership withStatus(String status) {
        setStatus(status);
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
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbOptionGroupMembership == false)
            return false;
        AwsRdsDbOptionGroupMembership other = (AwsRdsDbOptionGroupMembership) obj;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbOptionGroupMembership clone() {
        try {
            return (AwsRdsDbOptionGroupMembership) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbOptionGroupMembershipMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
