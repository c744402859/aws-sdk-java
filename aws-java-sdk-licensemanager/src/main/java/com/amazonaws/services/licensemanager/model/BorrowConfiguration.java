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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a borrow configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/BorrowConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BorrowConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether early check-ins are allowed.
     * </p>
     */
    private Boolean allowEarlyCheckIn;
    /**
     * <p>
     * Maximum time for the borrow configuration, in minutes.
     * </p>
     */
    private Integer maxTimeToLiveInMinutes;

    /**
     * <p>
     * Indicates whether early check-ins are allowed.
     * </p>
     * 
     * @param allowEarlyCheckIn
     *        Indicates whether early check-ins are allowed.
     */

    public void setAllowEarlyCheckIn(Boolean allowEarlyCheckIn) {
        this.allowEarlyCheckIn = allowEarlyCheckIn;
    }

    /**
     * <p>
     * Indicates whether early check-ins are allowed.
     * </p>
     * 
     * @return Indicates whether early check-ins are allowed.
     */

    public Boolean getAllowEarlyCheckIn() {
        return this.allowEarlyCheckIn;
    }

    /**
     * <p>
     * Indicates whether early check-ins are allowed.
     * </p>
     * 
     * @param allowEarlyCheckIn
     *        Indicates whether early check-ins are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BorrowConfiguration withAllowEarlyCheckIn(Boolean allowEarlyCheckIn) {
        setAllowEarlyCheckIn(allowEarlyCheckIn);
        return this;
    }

    /**
     * <p>
     * Indicates whether early check-ins are allowed.
     * </p>
     * 
     * @return Indicates whether early check-ins are allowed.
     */

    public Boolean isAllowEarlyCheckIn() {
        return this.allowEarlyCheckIn;
    }

    /**
     * <p>
     * Maximum time for the borrow configuration, in minutes.
     * </p>
     * 
     * @param maxTimeToLiveInMinutes
     *        Maximum time for the borrow configuration, in minutes.
     */

    public void setMaxTimeToLiveInMinutes(Integer maxTimeToLiveInMinutes) {
        this.maxTimeToLiveInMinutes = maxTimeToLiveInMinutes;
    }

    /**
     * <p>
     * Maximum time for the borrow configuration, in minutes.
     * </p>
     * 
     * @return Maximum time for the borrow configuration, in minutes.
     */

    public Integer getMaxTimeToLiveInMinutes() {
        return this.maxTimeToLiveInMinutes;
    }

    /**
     * <p>
     * Maximum time for the borrow configuration, in minutes.
     * </p>
     * 
     * @param maxTimeToLiveInMinutes
     *        Maximum time for the borrow configuration, in minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BorrowConfiguration withMaxTimeToLiveInMinutes(Integer maxTimeToLiveInMinutes) {
        setMaxTimeToLiveInMinutes(maxTimeToLiveInMinutes);
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
        if (getAllowEarlyCheckIn() != null)
            sb.append("AllowEarlyCheckIn: ").append(getAllowEarlyCheckIn()).append(",");
        if (getMaxTimeToLiveInMinutes() != null)
            sb.append("MaxTimeToLiveInMinutes: ").append(getMaxTimeToLiveInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BorrowConfiguration == false)
            return false;
        BorrowConfiguration other = (BorrowConfiguration) obj;
        if (other.getAllowEarlyCheckIn() == null ^ this.getAllowEarlyCheckIn() == null)
            return false;
        if (other.getAllowEarlyCheckIn() != null && other.getAllowEarlyCheckIn().equals(this.getAllowEarlyCheckIn()) == false)
            return false;
        if (other.getMaxTimeToLiveInMinutes() == null ^ this.getMaxTimeToLiveInMinutes() == null)
            return false;
        if (other.getMaxTimeToLiveInMinutes() != null && other.getMaxTimeToLiveInMinutes().equals(this.getMaxTimeToLiveInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowEarlyCheckIn() == null) ? 0 : getAllowEarlyCheckIn().hashCode());
        hashCode = prime * hashCode + ((getMaxTimeToLiveInMinutes() == null) ? 0 : getMaxTimeToLiveInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public BorrowConfiguration clone() {
        try {
            return (BorrowConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.BorrowConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
