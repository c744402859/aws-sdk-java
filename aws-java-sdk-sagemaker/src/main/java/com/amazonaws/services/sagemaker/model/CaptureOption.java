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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CaptureOption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptureOption implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String captureMode;

    /**
     * <p/>
     * 
     * @param captureMode
     * @see CaptureMode
     */

    public void setCaptureMode(String captureMode) {
        this.captureMode = captureMode;
    }

    /**
     * <p/>
     * 
     * @return
     * @see CaptureMode
     */

    public String getCaptureMode() {
        return this.captureMode;
    }

    /**
     * <p/>
     * 
     * @param captureMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaptureMode
     */

    public CaptureOption withCaptureMode(String captureMode) {
        setCaptureMode(captureMode);
        return this;
    }

    /**
     * <p/>
     * 
     * @param captureMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaptureMode
     */

    public CaptureOption withCaptureMode(CaptureMode captureMode) {
        this.captureMode = captureMode.toString();
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
        if (getCaptureMode() != null)
            sb.append("CaptureMode: ").append(getCaptureMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptureOption == false)
            return false;
        CaptureOption other = (CaptureOption) obj;
        if (other.getCaptureMode() == null ^ this.getCaptureMode() == null)
            return false;
        if (other.getCaptureMode() != null && other.getCaptureMode().equals(this.getCaptureMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaptureMode() == null) ? 0 : getCaptureMode().hashCode());
        return hashCode;
    }

    @Override
    public CaptureOption clone() {
        try {
            return (CaptureOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CaptureOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
