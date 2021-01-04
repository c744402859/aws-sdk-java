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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessmentFramework"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssessmentFrameworkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new custom framework.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional description for the new custom framework.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The compliance type that the new custom framework supports, such as CIS or HIPAA.
     * </p>
     */
    private String complianceType;
    /**
     * <p>
     * The control sets to be associated with the framework.
     * </p>
     */
    private java.util.List<CreateAssessmentFrameworkControlSet> controlSets;

    /**
     * <p>
     * The name of the new custom framework.
     * </p>
     * 
     * @param name
     *        The name of the new custom framework.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new custom framework.
     * </p>
     * 
     * @return The name of the new custom framework.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new custom framework.
     * </p>
     * 
     * @param name
     *        The name of the new custom framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentFrameworkRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional description for the new custom framework.
     * </p>
     * 
     * @param description
     *        An optional description for the new custom framework.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the new custom framework.
     * </p>
     * 
     * @return An optional description for the new custom framework.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for the new custom framework.
     * </p>
     * 
     * @param description
     *        An optional description for the new custom framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentFrameworkRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The compliance type that the new custom framework supports, such as CIS or HIPAA.
     * </p>
     * 
     * @param complianceType
     *        The compliance type that the new custom framework supports, such as CIS or HIPAA.
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * The compliance type that the new custom framework supports, such as CIS or HIPAA.
     * </p>
     * 
     * @return The compliance type that the new custom framework supports, such as CIS or HIPAA.
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * The compliance type that the new custom framework supports, such as CIS or HIPAA.
     * </p>
     * 
     * @param complianceType
     *        The compliance type that the new custom framework supports, such as CIS or HIPAA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentFrameworkRequest withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * The control sets to be associated with the framework.
     * </p>
     * 
     * @return The control sets to be associated with the framework.
     */

    public java.util.List<CreateAssessmentFrameworkControlSet> getControlSets() {
        return controlSets;
    }

    /**
     * <p>
     * The control sets to be associated with the framework.
     * </p>
     * 
     * @param controlSets
     *        The control sets to be associated with the framework.
     */

    public void setControlSets(java.util.Collection<CreateAssessmentFrameworkControlSet> controlSets) {
        if (controlSets == null) {
            this.controlSets = null;
            return;
        }

        this.controlSets = new java.util.ArrayList<CreateAssessmentFrameworkControlSet>(controlSets);
    }

    /**
     * <p>
     * The control sets to be associated with the framework.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setControlSets(java.util.Collection)} or {@link #withControlSets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param controlSets
     *        The control sets to be associated with the framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentFrameworkRequest withControlSets(CreateAssessmentFrameworkControlSet... controlSets) {
        if (this.controlSets == null) {
            setControlSets(new java.util.ArrayList<CreateAssessmentFrameworkControlSet>(controlSets.length));
        }
        for (CreateAssessmentFrameworkControlSet ele : controlSets) {
            this.controlSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The control sets to be associated with the framework.
     * </p>
     * 
     * @param controlSets
     *        The control sets to be associated with the framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentFrameworkRequest withControlSets(java.util.Collection<CreateAssessmentFrameworkControlSet> controlSets) {
        setControlSets(controlSets);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getControlSets() != null)
            sb.append("ControlSets: ").append(getControlSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssessmentFrameworkRequest == false)
            return false;
        CreateAssessmentFrameworkRequest other = (CreateAssessmentFrameworkRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getControlSets() == null ^ this.getControlSets() == null)
            return false;
        if (other.getControlSets() != null && other.getControlSets().equals(this.getControlSets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getControlSets() == null) ? 0 : getControlSets().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssessmentFrameworkRequest clone() {
        return (CreateAssessmentFrameworkRequest) super.clone();
    }

}
