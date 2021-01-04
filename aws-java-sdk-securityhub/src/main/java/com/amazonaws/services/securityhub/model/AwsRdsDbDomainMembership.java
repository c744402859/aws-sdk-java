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
 * Information about an Active Directory domain membership record associated with the DB instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbDomainMembership"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbDomainMembership implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the Active Directory domain.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The status of the Active Directory Domain membership for the DB instance.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The fully qualified domain name of the Active Directory domain.
     * </p>
     */
    private String fqdn;
    /**
     * <p>
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     */
    private String iamRoleName;

    /**
     * <p>
     * The identifier of the Active Directory domain.
     * </p>
     * 
     * @param domain
     *        The identifier of the Active Directory domain.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The identifier of the Active Directory domain.
     * </p>
     * 
     * @return The identifier of the Active Directory domain.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The identifier of the Active Directory domain.
     * </p>
     * 
     * @param domain
     *        The identifier of the Active Directory domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbDomainMembership withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The status of the Active Directory Domain membership for the DB instance.
     * </p>
     * 
     * @param status
     *        The status of the Active Directory Domain membership for the DB instance.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Active Directory Domain membership for the DB instance.
     * </p>
     * 
     * @return The status of the Active Directory Domain membership for the DB instance.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Active Directory Domain membership for the DB instance.
     * </p>
     * 
     * @param status
     *        The status of the Active Directory Domain membership for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbDomainMembership withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The fully qualified domain name of the Active Directory domain.
     * </p>
     * 
     * @param fqdn
     *        The fully qualified domain name of the Active Directory domain.
     */

    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
    }

    /**
     * <p>
     * The fully qualified domain name of the Active Directory domain.
     * </p>
     * 
     * @return The fully qualified domain name of the Active Directory domain.
     */

    public String getFqdn() {
        return this.fqdn;
    }

    /**
     * <p>
     * The fully qualified domain name of the Active Directory domain.
     * </p>
     * 
     * @param fqdn
     *        The fully qualified domain name of the Active Directory domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbDomainMembership withFqdn(String fqdn) {
        setFqdn(fqdn);
        return this;
    }

    /**
     * <p>
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     * 
     * @param iamRoleName
     *        The name of the IAM role to use when making API calls to the Directory Service.
     */

    public void setIamRoleName(String iamRoleName) {
        this.iamRoleName = iamRoleName;
    }

    /**
     * <p>
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     * 
     * @return The name of the IAM role to use when making API calls to the Directory Service.
     */

    public String getIamRoleName() {
        return this.iamRoleName;
    }

    /**
     * <p>
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     * 
     * @param iamRoleName
     *        The name of the IAM role to use when making API calls to the Directory Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbDomainMembership withIamRoleName(String iamRoleName) {
        setIamRoleName(iamRoleName);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFqdn() != null)
            sb.append("Fqdn: ").append(getFqdn()).append(",");
        if (getIamRoleName() != null)
            sb.append("IamRoleName: ").append(getIamRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbDomainMembership == false)
            return false;
        AwsRdsDbDomainMembership other = (AwsRdsDbDomainMembership) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFqdn() == null ^ this.getFqdn() == null)
            return false;
        if (other.getFqdn() != null && other.getFqdn().equals(this.getFqdn()) == false)
            return false;
        if (other.getIamRoleName() == null ^ this.getIamRoleName() == null)
            return false;
        if (other.getIamRoleName() != null && other.getIamRoleName().equals(this.getIamRoleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFqdn() == null) ? 0 : getFqdn().hashCode());
        hashCode = prime * hashCode + ((getIamRoleName() == null) ? 0 : getIamRoleName().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbDomainMembership clone() {
        try {
            return (AwsRdsDbDomainMembership) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbDomainMembershipMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
