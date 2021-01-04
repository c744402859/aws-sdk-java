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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the <a>AccountAssignment</a> creation request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/AccountAssignmentOperationStatusMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountAssignmentOperationStatusMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the permission set provisioning process.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The identifier for tracking the request operation that is generated by the universally unique identifier (UUID)
     * workflow.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The date that the permission set was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The status of the permission set provisioning process.
     * </p>
     * 
     * @param status
     *        The status of the permission set provisioning process.
     * @see StatusValues
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the permission set provisioning process.
     * </p>
     * 
     * @return The status of the permission set provisioning process.
     * @see StatusValues
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the permission set provisioning process.
     * </p>
     * 
     * @param status
     *        The status of the permission set provisioning process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusValues
     */

    public AccountAssignmentOperationStatusMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the permission set provisioning process.
     * </p>
     * 
     * @param status
     *        The status of the permission set provisioning process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusValues
     */

    public AccountAssignmentOperationStatusMetadata withStatus(StatusValues status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The identifier for tracking the request operation that is generated by the universally unique identifier (UUID)
     * workflow.
     * </p>
     * 
     * @param requestId
     *        The identifier for tracking the request operation that is generated by the universally unique identifier
     *        (UUID) workflow.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The identifier for tracking the request operation that is generated by the universally unique identifier (UUID)
     * workflow.
     * </p>
     * 
     * @return The identifier for tracking the request operation that is generated by the universally unique identifier
     *         (UUID) workflow.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The identifier for tracking the request operation that is generated by the universally unique identifier (UUID)
     * workflow.
     * </p>
     * 
     * @param requestId
     *        The identifier for tracking the request operation that is generated by the universally unique identifier
     *        (UUID) workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAssignmentOperationStatusMetadata withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The date that the permission set was created.
     * </p>
     * 
     * @param createdDate
     *        The date that the permission set was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date that the permission set was created.
     * </p>
     * 
     * @return The date that the permission set was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date that the permission set was created.
     * </p>
     * 
     * @param createdDate
     *        The date that the permission set was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAssignmentOperationStatusMetadata withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
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
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountAssignmentOperationStatusMetadata == false)
            return false;
        AccountAssignmentOperationStatusMetadata other = (AccountAssignmentOperationStatusMetadata) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        return hashCode;
    }

    @Override
    public AccountAssignmentOperationStatusMetadata clone() {
        try {
            return (AccountAssignmentOperationStatusMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.AccountAssignmentOperationStatusMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
