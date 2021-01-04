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
 * <p>
 * Used to update information about the investigation into the finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/WorkflowUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the investigation into the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - The initial state of a finding, before it is reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFIED</code> - Indicates that you notified the resource owner about the security issue. Used when the
     * initial reviewer is not the resource owner, and needs intervention from the resource owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOLVED</code> - The finding was reviewed and remediated and is now considered resolved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPPRESSED</code> - The finding will not be reviewed again and will not be acted upon.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The status of the investigation into the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - The initial state of a finding, before it is reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFIED</code> - Indicates that you notified the resource owner about the security issue. Used when the
     * initial reviewer is not the resource owner, and needs intervention from the resource owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOLVED</code> - The finding was reviewed and remediated and is now considered resolved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPPRESSED</code> - The finding will not be reviewed again and will not be acted upon.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the investigation into the finding. The allowed values are the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code> - The initial state of a finding, before it is reviewed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOTIFIED</code> - Indicates that you notified the resource owner about the security issue. Used when
     *        the initial reviewer is not the resource owner, and needs intervention from the resource owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESOLVED</code> - The finding was reviewed and remediated and is now considered resolved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUPPRESSED</code> - The finding will not be reviewed again and will not be acted upon.
     *        </p>
     *        </li>
     * @see WorkflowStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the investigation into the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - The initial state of a finding, before it is reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFIED</code> - Indicates that you notified the resource owner about the security issue. Used when the
     * initial reviewer is not the resource owner, and needs intervention from the resource owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOLVED</code> - The finding was reviewed and remediated and is now considered resolved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPPRESSED</code> - The finding will not be reviewed again and will not be acted upon.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the investigation into the finding. The allowed values are the following.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NEW</code> - The initial state of a finding, before it is reviewed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOTIFIED</code> - Indicates that you notified the resource owner about the security issue. Used
     *         when the initial reviewer is not the resource owner, and needs intervention from the resource owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESOLVED</code> - The finding was reviewed and remediated and is now considered resolved.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUPPRESSED</code> - The finding will not be reviewed again and will not be acted upon.
     *         </p>
     *         </li>
     * @see WorkflowStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the investigation into the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - The initial state of a finding, before it is reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFIED</code> - Indicates that you notified the resource owner about the security issue. Used when the
     * initial reviewer is not the resource owner, and needs intervention from the resource owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOLVED</code> - The finding was reviewed and remediated and is now considered resolved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPPRESSED</code> - The finding will not be reviewed again and will not be acted upon.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the investigation into the finding. The allowed values are the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code> - The initial state of a finding, before it is reviewed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOTIFIED</code> - Indicates that you notified the resource owner about the security issue. Used when
     *        the initial reviewer is not the resource owner, and needs intervention from the resource owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESOLVED</code> - The finding was reviewed and remediated and is now considered resolved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUPPRESSED</code> - The finding will not be reviewed again and will not be acted upon.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStatus
     */

    public WorkflowUpdate withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the investigation into the finding. The allowed values are the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - The initial state of a finding, before it is reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFIED</code> - Indicates that you notified the resource owner about the security issue. Used when the
     * initial reviewer is not the resource owner, and needs intervention from the resource owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOLVED</code> - The finding was reviewed and remediated and is now considered resolved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPPRESSED</code> - The finding will not be reviewed again and will not be acted upon.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the investigation into the finding. The allowed values are the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code> - The initial state of a finding, before it is reviewed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOTIFIED</code> - Indicates that you notified the resource owner about the security issue. Used when
     *        the initial reviewer is not the resource owner, and needs intervention from the resource owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESOLVED</code> - The finding was reviewed and remediated and is now considered resolved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUPPRESSED</code> - The finding will not be reviewed again and will not be acted upon.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStatus
     */

    public WorkflowUpdate withStatus(WorkflowStatus status) {
        this.status = status.toString();
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

        if (obj instanceof WorkflowUpdate == false)
            return false;
        WorkflowUpdate other = (WorkflowUpdate) obj;
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

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowUpdate clone() {
        try {
            return (WorkflowUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.WorkflowUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
