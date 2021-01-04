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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResolverRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the <code>CreateResolverRule</code> request, including the status of the request.
     * </p>
     */
    private ResolverRule resolverRule;

    /**
     * <p>
     * Information about the <code>CreateResolverRule</code> request, including the status of the request.
     * </p>
     * 
     * @param resolverRule
     *        Information about the <code>CreateResolverRule</code> request, including the status of the request.
     */

    public void setResolverRule(ResolverRule resolverRule) {
        this.resolverRule = resolverRule;
    }

    /**
     * <p>
     * Information about the <code>CreateResolverRule</code> request, including the status of the request.
     * </p>
     * 
     * @return Information about the <code>CreateResolverRule</code> request, including the status of the request.
     */

    public ResolverRule getResolverRule() {
        return this.resolverRule;
    }

    /**
     * <p>
     * Information about the <code>CreateResolverRule</code> request, including the status of the request.
     * </p>
     * 
     * @param resolverRule
     *        Information about the <code>CreateResolverRule</code> request, including the status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRuleResult withResolverRule(ResolverRule resolverRule) {
        setResolverRule(resolverRule);
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
        if (getResolverRule() != null)
            sb.append("ResolverRule: ").append(getResolverRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResolverRuleResult == false)
            return false;
        CreateResolverRuleResult other = (CreateResolverRuleResult) obj;
        if (other.getResolverRule() == null ^ this.getResolverRule() == null)
            return false;
        if (other.getResolverRule() != null && other.getResolverRule().equals(this.getResolverRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolverRule() == null) ? 0 : getResolverRule().hashCode());
        return hashCode;
    }

    @Override
    public CreateResolverRuleResult clone() {
        try {
            return (CreateResolverRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
