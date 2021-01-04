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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Placeholder documentation for RejectInputDeviceTransferRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/RejectInputDeviceTransfer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RejectInputDeviceTransferRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The unique ID of the input device to reject. For example, hd-123456789abcdef. */
    private String inputDeviceId;

    /**
     * The unique ID of the input device to reject. For example, hd-123456789abcdef.
     * 
     * @param inputDeviceId
     *        The unique ID of the input device to reject. For example, hd-123456789abcdef.
     */

    public void setInputDeviceId(String inputDeviceId) {
        this.inputDeviceId = inputDeviceId;
    }

    /**
     * The unique ID of the input device to reject. For example, hd-123456789abcdef.
     * 
     * @return The unique ID of the input device to reject. For example, hd-123456789abcdef.
     */

    public String getInputDeviceId() {
        return this.inputDeviceId;
    }

    /**
     * The unique ID of the input device to reject. For example, hd-123456789abcdef.
     * 
     * @param inputDeviceId
     *        The unique ID of the input device to reject. For example, hd-123456789abcdef.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectInputDeviceTransferRequest withInputDeviceId(String inputDeviceId) {
        setInputDeviceId(inputDeviceId);
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
        if (getInputDeviceId() != null)
            sb.append("InputDeviceId: ").append(getInputDeviceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RejectInputDeviceTransferRequest == false)
            return false;
        RejectInputDeviceTransferRequest other = (RejectInputDeviceTransferRequest) obj;
        if (other.getInputDeviceId() == null ^ this.getInputDeviceId() == null)
            return false;
        if (other.getInputDeviceId() != null && other.getInputDeviceId().equals(this.getInputDeviceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputDeviceId() == null) ? 0 : getInputDeviceId().hashCode());
        return hashCode;
    }

    @Override
    public RejectInputDeviceTransferRequest clone() {
        return (RejectInputDeviceTransferRequest) super.clone();
    }

}
