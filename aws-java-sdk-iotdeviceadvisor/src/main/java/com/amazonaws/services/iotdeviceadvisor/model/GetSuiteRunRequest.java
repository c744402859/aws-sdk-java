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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSuiteRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Requests the information about Device Advisor test suite run based on suite definition Id.
     * </p>
     */
    private String suiteDefinitionId;
    /**
     * <p>
     * Requests the information about Device Advisor test suite run based on suite run Id.
     * </p>
     */
    private String suiteRunId;

    /**
     * <p>
     * Requests the information about Device Advisor test suite run based on suite definition Id.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Requests the information about Device Advisor test suite run based on suite definition Id.
     */

    public void setSuiteDefinitionId(String suiteDefinitionId) {
        this.suiteDefinitionId = suiteDefinitionId;
    }

    /**
     * <p>
     * Requests the information about Device Advisor test suite run based on suite definition Id.
     * </p>
     * 
     * @return Requests the information about Device Advisor test suite run based on suite definition Id.
     */

    public String getSuiteDefinitionId() {
        return this.suiteDefinitionId;
    }

    /**
     * <p>
     * Requests the information about Device Advisor test suite run based on suite definition Id.
     * </p>
     * 
     * @param suiteDefinitionId
     *        Requests the information about Device Advisor test suite run based on suite definition Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteRunRequest withSuiteDefinitionId(String suiteDefinitionId) {
        setSuiteDefinitionId(suiteDefinitionId);
        return this;
    }

    /**
     * <p>
     * Requests the information about Device Advisor test suite run based on suite run Id.
     * </p>
     * 
     * @param suiteRunId
     *        Requests the information about Device Advisor test suite run based on suite run Id.
     */

    public void setSuiteRunId(String suiteRunId) {
        this.suiteRunId = suiteRunId;
    }

    /**
     * <p>
     * Requests the information about Device Advisor test suite run based on suite run Id.
     * </p>
     * 
     * @return Requests the information about Device Advisor test suite run based on suite run Id.
     */

    public String getSuiteRunId() {
        return this.suiteRunId;
    }

    /**
     * <p>
     * Requests the information about Device Advisor test suite run based on suite run Id.
     * </p>
     * 
     * @param suiteRunId
     *        Requests the information about Device Advisor test suite run based on suite run Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteRunRequest withSuiteRunId(String suiteRunId) {
        setSuiteRunId(suiteRunId);
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
        if (getSuiteDefinitionId() != null)
            sb.append("SuiteDefinitionId: ").append(getSuiteDefinitionId()).append(",");
        if (getSuiteRunId() != null)
            sb.append("SuiteRunId: ").append(getSuiteRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSuiteRunRequest == false)
            return false;
        GetSuiteRunRequest other = (GetSuiteRunRequest) obj;
        if (other.getSuiteDefinitionId() == null ^ this.getSuiteDefinitionId() == null)
            return false;
        if (other.getSuiteDefinitionId() != null && other.getSuiteDefinitionId().equals(this.getSuiteDefinitionId()) == false)
            return false;
        if (other.getSuiteRunId() == null ^ this.getSuiteRunId() == null)
            return false;
        if (other.getSuiteRunId() != null && other.getSuiteRunId().equals(this.getSuiteRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuiteDefinitionId() == null) ? 0 : getSuiteDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getSuiteRunId() == null) ? 0 : getSuiteRunId().hashCode());
        return hashCode;
    }

    @Override
    public GetSuiteRunRequest clone() {
        return (GetSuiteRunRequest) super.clone();
    }

}
