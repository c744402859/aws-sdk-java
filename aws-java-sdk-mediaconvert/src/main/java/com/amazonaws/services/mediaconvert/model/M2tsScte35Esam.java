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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for SCTE-35 signals from ESAM. Include this in your job settings to put SCTE-35 markers in your HLS and
 * transport stream outputs at the insertion points that you specify in an ESAM XML document. Provide the document in
 * the setting SCC XML (sccXml).
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/M2tsScte35Esam" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M2tsScte35Esam implements Serializable, Cloneable, StructuredPojo {

    /** Packet Identifier (PID) of the SCTE-35 stream in the transport stream generated by ESAM. */
    private Integer scte35EsamPid;

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream generated by ESAM.
     * 
     * @param scte35EsamPid
     *        Packet Identifier (PID) of the SCTE-35 stream in the transport stream generated by ESAM.
     */

    public void setScte35EsamPid(Integer scte35EsamPid) {
        this.scte35EsamPid = scte35EsamPid;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream generated by ESAM.
     * 
     * @return Packet Identifier (PID) of the SCTE-35 stream in the transport stream generated by ESAM.
     */

    public Integer getScte35EsamPid() {
        return this.scte35EsamPid;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream generated by ESAM.
     * 
     * @param scte35EsamPid
     *        Packet Identifier (PID) of the SCTE-35 stream in the transport stream generated by ESAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsScte35Esam withScte35EsamPid(Integer scte35EsamPid) {
        setScte35EsamPid(scte35EsamPid);
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
        if (getScte35EsamPid() != null)
            sb.append("Scte35EsamPid: ").append(getScte35EsamPid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof M2tsScte35Esam == false)
            return false;
        M2tsScte35Esam other = (M2tsScte35Esam) obj;
        if (other.getScte35EsamPid() == null ^ this.getScte35EsamPid() == null)
            return false;
        if (other.getScte35EsamPid() != null && other.getScte35EsamPid().equals(this.getScte35EsamPid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScte35EsamPid() == null) ? 0 : getScte35EsamPid().hashCode());
        return hashCode;
    }

    @Override
    public M2tsScte35Esam clone() {
        try {
            return (M2tsScte35Esam) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.M2tsScte35EsamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
