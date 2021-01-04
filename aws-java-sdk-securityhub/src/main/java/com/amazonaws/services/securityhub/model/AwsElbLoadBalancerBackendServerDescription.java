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
 * Provides information about the configuration of an EC2 instance for the load balancer.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElbLoadBalancerBackendServerDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElbLoadBalancerBackendServerDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The port on which the EC2 instance is listening.
     * </p>
     */
    private Integer instancePort;
    /**
     * <p>
     * The names of the policies that are enabled for the EC2 instance.
     * </p>
     */
    private java.util.List<String> policyNames;

    /**
     * <p>
     * The port on which the EC2 instance is listening.
     * </p>
     * 
     * @param instancePort
     *        The port on which the EC2 instance is listening.
     */

    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }

    /**
     * <p>
     * The port on which the EC2 instance is listening.
     * </p>
     * 
     * @return The port on which the EC2 instance is listening.
     */

    public Integer getInstancePort() {
        return this.instancePort;
    }

    /**
     * <p>
     * The port on which the EC2 instance is listening.
     * </p>
     * 
     * @param instancePort
     *        The port on which the EC2 instance is listening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerBackendServerDescription withInstancePort(Integer instancePort) {
        setInstancePort(instancePort);
        return this;
    }

    /**
     * <p>
     * The names of the policies that are enabled for the EC2 instance.
     * </p>
     * 
     * @return The names of the policies that are enabled for the EC2 instance.
     */

    public java.util.List<String> getPolicyNames() {
        return policyNames;
    }

    /**
     * <p>
     * The names of the policies that are enabled for the EC2 instance.
     * </p>
     * 
     * @param policyNames
     *        The names of the policies that are enabled for the EC2 instance.
     */

    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }

        this.policyNames = new java.util.ArrayList<String>(policyNames);
    }

    /**
     * <p>
     * The names of the policies that are enabled for the EC2 instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyNames(java.util.Collection)} or {@link #withPolicyNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyNames
     *        The names of the policies that are enabled for the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerBackendServerDescription withPolicyNames(String... policyNames) {
        if (this.policyNames == null) {
            setPolicyNames(new java.util.ArrayList<String>(policyNames.length));
        }
        for (String ele : policyNames) {
            this.policyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the policies that are enabled for the EC2 instance.
     * </p>
     * 
     * @param policyNames
     *        The names of the policies that are enabled for the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerBackendServerDescription withPolicyNames(java.util.Collection<String> policyNames) {
        setPolicyNames(policyNames);
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
        if (getInstancePort() != null)
            sb.append("InstancePort: ").append(getInstancePort()).append(",");
        if (getPolicyNames() != null)
            sb.append("PolicyNames: ").append(getPolicyNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElbLoadBalancerBackendServerDescription == false)
            return false;
        AwsElbLoadBalancerBackendServerDescription other = (AwsElbLoadBalancerBackendServerDescription) obj;
        if (other.getInstancePort() == null ^ this.getInstancePort() == null)
            return false;
        if (other.getInstancePort() != null && other.getInstancePort().equals(this.getInstancePort()) == false)
            return false;
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null)
            return false;
        if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstancePort() == null) ? 0 : getInstancePort().hashCode());
        hashCode = prime * hashCode + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode());
        return hashCode;
    }

    @Override
    public AwsElbLoadBalancerBackendServerDescription clone() {
        try {
            return (AwsElbLoadBalancerBackendServerDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElbLoadBalancerBackendServerDescriptionMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
