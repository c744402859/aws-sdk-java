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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribeOrganizationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the detector to retrieve information about the delegated administrator from.
     * </p>
     */
    private String detectorId;

    /**
     * <p>
     * The ID of the detector to retrieve information about the delegated administrator from.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector to retrieve information about the delegated administrator from.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector to retrieve information about the delegated administrator from.
     * </p>
     * 
     * @return The ID of the detector to retrieve information about the delegated administrator from.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The ID of the detector to retrieve information about the delegated administrator from.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector to retrieve information about the delegated administrator from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigurationRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrganizationConfigurationRequest == false)
            return false;
        DescribeOrganizationConfigurationRequest other = (DescribeOrganizationConfigurationRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationConfigurationRequest clone() {
        return (DescribeOrganizationConfigurationRequest) super.clone();
    }

}
