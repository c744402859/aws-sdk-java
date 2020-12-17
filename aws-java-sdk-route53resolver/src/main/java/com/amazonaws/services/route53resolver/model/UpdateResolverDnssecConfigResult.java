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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverDnssecConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResolverDnssecConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains settings for the specified DNSSEC configuration.
     * </p>
     */
    private ResolverDnssecConfig resolverDNSSECConfig;

    /**
     * <p>
     * A complex type that contains settings for the specified DNSSEC configuration.
     * </p>
     * 
     * @param resolverDNSSECConfig
     *        A complex type that contains settings for the specified DNSSEC configuration.
     */

    public void setResolverDNSSECConfig(ResolverDnssecConfig resolverDNSSECConfig) {
        this.resolverDNSSECConfig = resolverDNSSECConfig;
    }

    /**
     * <p>
     * A complex type that contains settings for the specified DNSSEC configuration.
     * </p>
     * 
     * @return A complex type that contains settings for the specified DNSSEC configuration.
     */

    public ResolverDnssecConfig getResolverDNSSECConfig() {
        return this.resolverDNSSECConfig;
    }

    /**
     * <p>
     * A complex type that contains settings for the specified DNSSEC configuration.
     * </p>
     * 
     * @param resolverDNSSECConfig
     *        A complex type that contains settings for the specified DNSSEC configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResolverDnssecConfigResult withResolverDNSSECConfig(ResolverDnssecConfig resolverDNSSECConfig) {
        setResolverDNSSECConfig(resolverDNSSECConfig);
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
        if (getResolverDNSSECConfig() != null)
            sb.append("ResolverDNSSECConfig: ").append(getResolverDNSSECConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResolverDnssecConfigResult == false)
            return false;
        UpdateResolverDnssecConfigResult other = (UpdateResolverDnssecConfigResult) obj;
        if (other.getResolverDNSSECConfig() == null ^ this.getResolverDNSSECConfig() == null)
            return false;
        if (other.getResolverDNSSECConfig() != null && other.getResolverDNSSECConfig().equals(this.getResolverDNSSECConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverDNSSECConfig() == null) ? 0 : getResolverDNSSECConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResolverDnssecConfigResult clone() {
        try {
            return (UpdateResolverDnssecConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
