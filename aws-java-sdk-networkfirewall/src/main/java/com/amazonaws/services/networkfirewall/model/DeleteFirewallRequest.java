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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DeleteFirewall" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFirewallRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     */
    private String firewallName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     */
    private String firewallArn;

    /**
     * <p>
     * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param firewallName
     *        The descriptive name of the firewall. You can't change the name of a firewall after you create it.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     */

    public void setFirewallName(String firewallName) {
        this.firewallName = firewallName;
    }

    /**
     * <p>
     * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @return The descriptive name of the firewall. You can't change the name of a firewall after you create it.</p>
     *         <p>
     *         You must specify the ARN or the name, and you can specify both.
     */

    public String getFirewallName() {
        return this.firewallName;
    }

    /**
     * <p>
     * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param firewallName
     *        The descriptive name of the firewall. You can't change the name of a firewall after you create it.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFirewallRequest withFirewallName(String firewallName) {
        setFirewallName(firewallName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param firewallArn
     *        The Amazon Resource Name (ARN) of the firewall.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     */

    public void setFirewallArn(String firewallArn) {
        this.firewallArn = firewallArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the firewall.</p>
     *         <p>
     *         You must specify the ARN or the name, and you can specify both.
     */

    public String getFirewallArn() {
        return this.firewallArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param firewallArn
     *        The Amazon Resource Name (ARN) of the firewall.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFirewallRequest withFirewallArn(String firewallArn) {
        setFirewallArn(firewallArn);
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
        if (getFirewallName() != null)
            sb.append("FirewallName: ").append(getFirewallName()).append(",");
        if (getFirewallArn() != null)
            sb.append("FirewallArn: ").append(getFirewallArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFirewallRequest == false)
            return false;
        DeleteFirewallRequest other = (DeleteFirewallRequest) obj;
        if (other.getFirewallName() == null ^ this.getFirewallName() == null)
            return false;
        if (other.getFirewallName() != null && other.getFirewallName().equals(this.getFirewallName()) == false)
            return false;
        if (other.getFirewallArn() == null ^ this.getFirewallArn() == null)
            return false;
        if (other.getFirewallArn() != null && other.getFirewallArn().equals(this.getFirewallArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallName() == null) ? 0 : getFirewallName().hashCode());
        hashCode = prime * hashCode + ((getFirewallArn() == null) ? 0 : getFirewallArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFirewallRequest clone() {
        return (DeleteFirewallRequest) super.clone();
    }

}
