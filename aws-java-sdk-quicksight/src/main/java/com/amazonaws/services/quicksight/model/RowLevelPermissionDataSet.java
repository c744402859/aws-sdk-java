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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The row-level security configuration for the dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RowLevelPermissionDataSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RowLevelPermissionDataSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The namespace associated with the row-level permissions dataset.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the permission dataset.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Permission policy.
     * </p>
     */
    private String permissionPolicy;

    /**
     * <p>
     * The namespace associated with the row-level permissions dataset.
     * </p>
     * 
     * @param namespace
     *        The namespace associated with the row-level permissions dataset.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace associated with the row-level permissions dataset.
     * </p>
     * 
     * @return The namespace associated with the row-level permissions dataset.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace associated with the row-level permissions dataset.
     * </p>
     * 
     * @param namespace
     *        The namespace associated with the row-level permissions dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowLevelPermissionDataSet withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the permission dataset.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the permission dataset.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the permission dataset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the permission dataset.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the permission dataset.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the permission dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowLevelPermissionDataSet withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Permission policy.
     * </p>
     * 
     * @param permissionPolicy
     *        Permission policy.
     * @see RowLevelPermissionPolicy
     */

    public void setPermissionPolicy(String permissionPolicy) {
        this.permissionPolicy = permissionPolicy;
    }

    /**
     * <p>
     * Permission policy.
     * </p>
     * 
     * @return Permission policy.
     * @see RowLevelPermissionPolicy
     */

    public String getPermissionPolicy() {
        return this.permissionPolicy;
    }

    /**
     * <p>
     * Permission policy.
     * </p>
     * 
     * @param permissionPolicy
     *        Permission policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RowLevelPermissionPolicy
     */

    public RowLevelPermissionDataSet withPermissionPolicy(String permissionPolicy) {
        setPermissionPolicy(permissionPolicy);
        return this;
    }

    /**
     * <p>
     * Permission policy.
     * </p>
     * 
     * @param permissionPolicy
     *        Permission policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RowLevelPermissionPolicy
     */

    public RowLevelPermissionDataSet withPermissionPolicy(RowLevelPermissionPolicy permissionPolicy) {
        this.permissionPolicy = permissionPolicy.toString();
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getPermissionPolicy() != null)
            sb.append("PermissionPolicy: ").append(getPermissionPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RowLevelPermissionDataSet == false)
            return false;
        RowLevelPermissionDataSet other = (RowLevelPermissionDataSet) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPermissionPolicy() == null ^ this.getPermissionPolicy() == null)
            return false;
        if (other.getPermissionPolicy() != null && other.getPermissionPolicy().equals(this.getPermissionPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPermissionPolicy() == null) ? 0 : getPermissionPolicy().hashCode());
        return hashCode;
    }

    @Override
    public RowLevelPermissionDataSet clone() {
        try {
            return (RowLevelPermissionDataSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RowLevelPermissionDataSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
