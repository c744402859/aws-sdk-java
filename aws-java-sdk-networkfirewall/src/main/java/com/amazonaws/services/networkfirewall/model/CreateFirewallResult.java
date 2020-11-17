/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/CreateFirewall" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFirewallResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration settings for the firewall. These settings include the firewall policy and the subnets in your
     * VPC to use for the firewall endpoints.
     * </p>
     */
    private Firewall firewall;
    /**
     * <p>
     * Detailed information about the current status of a <a>Firewall</a>. You can retrieve this for a firewall by
     * calling <a>DescribeFirewall</a> and providing the firewall name and ARN.
     * </p>
     */
    private FirewallStatus firewallStatus;

    /**
     * <p>
     * The configuration settings for the firewall. These settings include the firewall policy and the subnets in your
     * VPC to use for the firewall endpoints.
     * </p>
     * 
     * @param firewall
     *        The configuration settings for the firewall. These settings include the firewall policy and the subnets in
     *        your VPC to use for the firewall endpoints.
     */

    public void setFirewall(Firewall firewall) {
        this.firewall = firewall;
    }

    /**
     * <p>
     * The configuration settings for the firewall. These settings include the firewall policy and the subnets in your
     * VPC to use for the firewall endpoints.
     * </p>
     * 
     * @return The configuration settings for the firewall. These settings include the firewall policy and the subnets
     *         in your VPC to use for the firewall endpoints.
     */

    public Firewall getFirewall() {
        return this.firewall;
    }

    /**
     * <p>
     * The configuration settings for the firewall. These settings include the firewall policy and the subnets in your
     * VPC to use for the firewall endpoints.
     * </p>
     * 
     * @param firewall
     *        The configuration settings for the firewall. These settings include the firewall policy and the subnets in
     *        your VPC to use for the firewall endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallResult withFirewall(Firewall firewall) {
        setFirewall(firewall);
        return this;
    }

    /**
     * <p>
     * Detailed information about the current status of a <a>Firewall</a>. You can retrieve this for a firewall by
     * calling <a>DescribeFirewall</a> and providing the firewall name and ARN.
     * </p>
     * 
     * @param firewallStatus
     *        Detailed information about the current status of a <a>Firewall</a>. You can retrieve this for a firewall
     *        by calling <a>DescribeFirewall</a> and providing the firewall name and ARN.
     */

    public void setFirewallStatus(FirewallStatus firewallStatus) {
        this.firewallStatus = firewallStatus;
    }

    /**
     * <p>
     * Detailed information about the current status of a <a>Firewall</a>. You can retrieve this for a firewall by
     * calling <a>DescribeFirewall</a> and providing the firewall name and ARN.
     * </p>
     * 
     * @return Detailed information about the current status of a <a>Firewall</a>. You can retrieve this for a firewall
     *         by calling <a>DescribeFirewall</a> and providing the firewall name and ARN.
     */

    public FirewallStatus getFirewallStatus() {
        return this.firewallStatus;
    }

    /**
     * <p>
     * Detailed information about the current status of a <a>Firewall</a>. You can retrieve this for a firewall by
     * calling <a>DescribeFirewall</a> and providing the firewall name and ARN.
     * </p>
     * 
     * @param firewallStatus
     *        Detailed information about the current status of a <a>Firewall</a>. You can retrieve this for a firewall
     *        by calling <a>DescribeFirewall</a> and providing the firewall name and ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallResult withFirewallStatus(FirewallStatus firewallStatus) {
        setFirewallStatus(firewallStatus);
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
        if (getFirewall() != null)
            sb.append("Firewall: ").append(getFirewall()).append(",");
        if (getFirewallStatus() != null)
            sb.append("FirewallStatus: ").append(getFirewallStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFirewallResult == false)
            return false;
        CreateFirewallResult other = (CreateFirewallResult) obj;
        if (other.getFirewall() == null ^ this.getFirewall() == null)
            return false;
        if (other.getFirewall() != null && other.getFirewall().equals(this.getFirewall()) == false)
            return false;
        if (other.getFirewallStatus() == null ^ this.getFirewallStatus() == null)
            return false;
        if (other.getFirewallStatus() != null && other.getFirewallStatus().equals(this.getFirewallStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewall() == null) ? 0 : getFirewall().hashCode());
        hashCode = prime * hashCode + ((getFirewallStatus() == null) ? 0 : getFirewallStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateFirewallResult clone() {
        try {
            return (CreateFirewallResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
