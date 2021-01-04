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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata associated with the specified assessment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/AssessmentMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the assessment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier for the assessment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The description of the assessment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of a compliance standard related to the assessment, such as PCI-DSS.
     * </p>
     */
    private String complianceType;
    /**
     * <p>
     * The overall status of the assessment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The destination in which evidence reports are stored for the specified assessment.
     * </p>
     */
    private AssessmentReportsDestination assessmentReportsDestination;
    /**
     * <p>
     * The wrapper of AWS accounts and services in scope for the assessment.
     * </p>
     */
    private Scope scope;
    /**
     * <p>
     * The roles associated with the assessment.
     * </p>
     */
    private java.util.List<Role> roles;
    /**
     * <p>
     * The delegations associated with the assessment.
     * </p>
     */
    private java.util.List<Delegation> delegations;
    /**
     * <p>
     * Specifies when the assessment was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time of the most recent update.
     * </p>
     */
    private java.util.Date lastUpdated;

    /**
     * <p>
     * The name of the assessment.
     * </p>
     * 
     * @param name
     *        The name of the assessment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the assessment.
     * </p>
     * 
     * @return The name of the assessment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the assessment.
     * </p>
     * 
     * @param name
     *        The name of the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the assessment.
     * </p>
     * 
     * @param id
     *        The unique identifier for the assessment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the assessment.
     * </p>
     * 
     * @return The unique identifier for the assessment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the assessment.
     * </p>
     * 
     * @param id
     *        The unique identifier for the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentMetadata withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The description of the assessment.
     * </p>
     * 
     * @param description
     *        The description of the assessment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the assessment.
     * </p>
     * 
     * @return The description of the assessment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the assessment.
     * </p>
     * 
     * @param description
     *        The description of the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of a compliance standard related to the assessment, such as PCI-DSS.
     * </p>
     * 
     * @param complianceType
     *        The name of a compliance standard related to the assessment, such as PCI-DSS.
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * The name of a compliance standard related to the assessment, such as PCI-DSS.
     * </p>
     * 
     * @return The name of a compliance standard related to the assessment, such as PCI-DSS.
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * The name of a compliance standard related to the assessment, such as PCI-DSS.
     * </p>
     * 
     * @param complianceType
     *        The name of a compliance standard related to the assessment, such as PCI-DSS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentMetadata withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * The overall status of the assessment.
     * </p>
     * 
     * @param status
     *        The overall status of the assessment.
     * @see AssessmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The overall status of the assessment.
     * </p>
     * 
     * @return The overall status of the assessment.
     * @see AssessmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The overall status of the assessment.
     * </p>
     * 
     * @param status
     *        The overall status of the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentStatus
     */

    public AssessmentMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The overall status of the assessment.
     * </p>
     * 
     * @param status
     *        The overall status of the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentStatus
     */

    public AssessmentMetadata withStatus(AssessmentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The destination in which evidence reports are stored for the specified assessment.
     * </p>
     * 
     * @param assessmentReportsDestination
     *        The destination in which evidence reports are stored for the specified assessment.
     */

    public void setAssessmentReportsDestination(AssessmentReportsDestination assessmentReportsDestination) {
        this.assessmentReportsDestination = assessmentReportsDestination;
    }

    /**
     * <p>
     * The destination in which evidence reports are stored for the specified assessment.
     * </p>
     * 
     * @return The destination in which evidence reports are stored for the specified assessment.
     */

    public AssessmentReportsDestination getAssessmentReportsDestination() {
        return this.assessmentReportsDestination;
    }

    /**
     * <p>
     * The destination in which evidence reports are stored for the specified assessment.
     * </p>
     * 
     * @param assessmentReportsDestination
     *        The destination in which evidence reports are stored for the specified assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentMetadata withAssessmentReportsDestination(AssessmentReportsDestination assessmentReportsDestination) {
        setAssessmentReportsDestination(assessmentReportsDestination);
        return this;
    }

    /**
     * <p>
     * The wrapper of AWS accounts and services in scope for the assessment.
     * </p>
     * 
     * @param scope
     *        The wrapper of AWS accounts and services in scope for the assessment.
     */

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The wrapper of AWS accounts and services in scope for the assessment.
     * </p>
     * 
     * @return The wrapper of AWS accounts and services in scope for the assessment.
     */

    public Scope getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The wrapper of AWS accounts and services in scope for the assessment.
     * </p>
     * 
     * @param scope
     *        The wrapper of AWS accounts and services in scope for the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentMetadata withScope(Scope scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The roles associated with the assessment.
     * </p>
     * 
     * @return The roles associated with the assessment.
     */

    public java.util.List<Role> getRoles() {
        return roles;
    }

    /**
     * <p>
     * The roles associated with the assessment.
     * </p>
     * 
     * @param roles
     *        The roles associated with the assessment.
     */

    public void setRoles(java.util.Collection<Role> roles) {
        if (roles == null) {
            this.roles = null;
            return;
        }

        this.roles = new java.util.ArrayList<Role>(roles);
    }

    /**
     * <p>
     * The roles associated with the assessment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoles(java.util.Collection)} or {@link #withRoles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param roles
     *        The roles associated with the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentMetadata withRoles(Role... roles) {
        if (this.roles == null) {
            setRoles(new java.util.ArrayList<Role>(roles.length));
        }
        for (Role ele : roles) {
            this.roles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The roles associated with the assessment.
     * </p>
     * 
     * @param roles
     *        The roles associated with the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentMetadata withRoles(java.util.Collection<Role> roles) {
        setRoles(roles);
        return this;
    }

    /**
     * <p>
     * The delegations associated with the assessment.
     * </p>
     * 
     * @return The delegations associated with the assessment.
     */

    public java.util.List<Delegation> getDelegations() {
        return delegations;
    }

    /**
     * <p>
     * The delegations associated with the assessment.
     * </p>
     * 
     * @param delegations
     *        The delegations associated with the assessment.
     */

    public void setDelegations(java.util.Collection<Delegation> delegations) {
        if (delegations == null) {
            this.delegations = null;
            return;
        }

        this.delegations = new java.util.ArrayList<Delegation>(delegations);
    }

    /**
     * <p>
     * The delegations associated with the assessment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDelegations(java.util.Collection)} or {@link #withDelegations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param delegations
     *        The delegations associated with the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentMetadata withDelegations(Delegation... delegations) {
        if (this.delegations == null) {
            setDelegations(new java.util.ArrayList<Delegation>(delegations.length));
        }
        for (Delegation ele : delegations) {
            this.delegations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The delegations associated with the assessment.
     * </p>
     * 
     * @param delegations
     *        The delegations associated with the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentMetadata withDelegations(java.util.Collection<Delegation> delegations) {
        setDelegations(delegations);
        return this;
    }

    /**
     * <p>
     * Specifies when the assessment was created.
     * </p>
     * 
     * @param creationTime
     *        Specifies when the assessment was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Specifies when the assessment was created.
     * </p>
     * 
     * @return Specifies when the assessment was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Specifies when the assessment was created.
     * </p>
     * 
     * @param creationTime
     *        Specifies when the assessment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentMetadata withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time of the most recent update.
     * </p>
     * 
     * @param lastUpdated
     *        The time of the most recent update.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The time of the most recent update.
     * </p>
     * 
     * @return The time of the most recent update.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The time of the most recent update.
     * </p>
     * 
     * @param lastUpdated
     *        The time of the most recent update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentMetadata withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAssessmentReportsDestination() != null)
            sb.append("AssessmentReportsDestination: ").append(getAssessmentReportsDestination()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getRoles() != null)
            sb.append("Roles: ").append(getRoles()).append(",");
        if (getDelegations() != null)
            sb.append("Delegations: ").append(getDelegations()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentMetadata == false)
            return false;
        AssessmentMetadata other = (AssessmentMetadata) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAssessmentReportsDestination() == null ^ this.getAssessmentReportsDestination() == null)
            return false;
        if (other.getAssessmentReportsDestination() != null && other.getAssessmentReportsDestination().equals(this.getAssessmentReportsDestination()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getRoles() == null ^ this.getRoles() == null)
            return false;
        if (other.getRoles() != null && other.getRoles().equals(this.getRoles()) == false)
            return false;
        if (other.getDelegations() == null ^ this.getDelegations() == null)
            return false;
        if (other.getDelegations() != null && other.getDelegations().equals(this.getDelegations()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAssessmentReportsDestination() == null) ? 0 : getAssessmentReportsDestination().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getRoles() == null) ? 0 : getRoles().hashCode());
        hashCode = prime * hashCode + ((getDelegations() == null) ? 0 : getDelegations().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentMetadata clone() {
        try {
            return (AssessmentMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.AssessmentMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
