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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * The request to update some combination of the Input Security Group name and the IPv4 CIDRs the Input Security Group
 * should allow.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInputSecurityGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInputSecurityGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The id of the Input Security Group to update. */
    private String inputSecurityGroupId;
    /** A collection of key-value pairs. */
    private java.util.Map<String, String> tags;
    /** List of IPv4 CIDR addresses to whitelist */
    private java.util.List<InputWhitelistRuleCidr> whitelistRules;

    /**
     * The id of the Input Security Group to update.
     * 
     * @param inputSecurityGroupId
     *        The id of the Input Security Group to update.
     */

    public void setInputSecurityGroupId(String inputSecurityGroupId) {
        this.inputSecurityGroupId = inputSecurityGroupId;
    }

    /**
     * The id of the Input Security Group to update.
     * 
     * @return The id of the Input Security Group to update.
     */

    public String getInputSecurityGroupId() {
        return this.inputSecurityGroupId;
    }

    /**
     * The id of the Input Security Group to update.
     * 
     * @param inputSecurityGroupId
     *        The id of the Input Security Group to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInputSecurityGroupRequest withInputSecurityGroupId(String inputSecurityGroupId) {
        setInputSecurityGroupId(inputSecurityGroupId);
        return this;
    }

    /**
     * A collection of key-value pairs.
     * 
     * @return A collection of key-value pairs.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * A collection of key-value pairs.
     * 
     * @param tags
     *        A collection of key-value pairs.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * A collection of key-value pairs.
     * 
     * @param tags
     *        A collection of key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInputSecurityGroupRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see UpdateInputSecurityGroupRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInputSecurityGroupRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInputSecurityGroupRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * List of IPv4 CIDR addresses to whitelist
     * 
     * @return List of IPv4 CIDR addresses to whitelist
     */

    public java.util.List<InputWhitelistRuleCidr> getWhitelistRules() {
        return whitelistRules;
    }

    /**
     * List of IPv4 CIDR addresses to whitelist
     * 
     * @param whitelistRules
     *        List of IPv4 CIDR addresses to whitelist
     */

    public void setWhitelistRules(java.util.Collection<InputWhitelistRuleCidr> whitelistRules) {
        if (whitelistRules == null) {
            this.whitelistRules = null;
            return;
        }

        this.whitelistRules = new java.util.ArrayList<InputWhitelistRuleCidr>(whitelistRules);
    }

    /**
     * List of IPv4 CIDR addresses to whitelist
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWhitelistRules(java.util.Collection)} or {@link #withWhitelistRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param whitelistRules
     *        List of IPv4 CIDR addresses to whitelist
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInputSecurityGroupRequest withWhitelistRules(InputWhitelistRuleCidr... whitelistRules) {
        if (this.whitelistRules == null) {
            setWhitelistRules(new java.util.ArrayList<InputWhitelistRuleCidr>(whitelistRules.length));
        }
        for (InputWhitelistRuleCidr ele : whitelistRules) {
            this.whitelistRules.add(ele);
        }
        return this;
    }

    /**
     * List of IPv4 CIDR addresses to whitelist
     * 
     * @param whitelistRules
     *        List of IPv4 CIDR addresses to whitelist
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInputSecurityGroupRequest withWhitelistRules(java.util.Collection<InputWhitelistRuleCidr> whitelistRules) {
        setWhitelistRules(whitelistRules);
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
        if (getInputSecurityGroupId() != null)
            sb.append("InputSecurityGroupId: ").append(getInputSecurityGroupId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getWhitelistRules() != null)
            sb.append("WhitelistRules: ").append(getWhitelistRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInputSecurityGroupRequest == false)
            return false;
        UpdateInputSecurityGroupRequest other = (UpdateInputSecurityGroupRequest) obj;
        if (other.getInputSecurityGroupId() == null ^ this.getInputSecurityGroupId() == null)
            return false;
        if (other.getInputSecurityGroupId() != null && other.getInputSecurityGroupId().equals(this.getInputSecurityGroupId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getWhitelistRules() == null ^ this.getWhitelistRules() == null)
            return false;
        if (other.getWhitelistRules() != null && other.getWhitelistRules().equals(this.getWhitelistRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputSecurityGroupId() == null) ? 0 : getInputSecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWhitelistRules() == null) ? 0 : getWhitelistRules().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInputSecurityGroupRequest clone() {
        return (UpdateInputSecurityGroupRequest) super.clone();
    }

}
