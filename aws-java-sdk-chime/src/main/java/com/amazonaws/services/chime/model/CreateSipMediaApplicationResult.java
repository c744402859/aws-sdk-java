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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateSipMediaApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSipMediaApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Sip media application details.
     * </p>
     */
    private SipMediaApplication sipMediaApplication;

    /**
     * <p>
     * The Sip media application details.
     * </p>
     * 
     * @param sipMediaApplication
     *        The Sip media application details.
     */

    public void setSipMediaApplication(SipMediaApplication sipMediaApplication) {
        this.sipMediaApplication = sipMediaApplication;
    }

    /**
     * <p>
     * The Sip media application details.
     * </p>
     * 
     * @return The Sip media application details.
     */

    public SipMediaApplication getSipMediaApplication() {
        return this.sipMediaApplication;
    }

    /**
     * <p>
     * The Sip media application details.
     * </p>
     * 
     * @param sipMediaApplication
     *        The Sip media application details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationResult withSipMediaApplication(SipMediaApplication sipMediaApplication) {
        setSipMediaApplication(sipMediaApplication);
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
        if (getSipMediaApplication() != null)
            sb.append("SipMediaApplication: ").append(getSipMediaApplication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSipMediaApplicationResult == false)
            return false;
        CreateSipMediaApplicationResult other = (CreateSipMediaApplicationResult) obj;
        if (other.getSipMediaApplication() == null ^ this.getSipMediaApplication() == null)
            return false;
        if (other.getSipMediaApplication() != null && other.getSipMediaApplication().equals(this.getSipMediaApplication()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSipMediaApplication() == null) ? 0 : getSipMediaApplication().hashCode());
        return hashCode;
    }

    @Override
    public CreateSipMediaApplicationResult clone() {
        try {
            return (CreateSipMediaApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
