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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request structure for the generate access logs request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GenerateAccessLogs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateAccessLogsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The time at which the logs should start. The time range specified is inclusive of the start time.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time at which the logs should end. The time range specified is inclusive of the end time.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     */
    private String appId;

    /**
     * <p>
     * The time at which the logs should start. The time range specified is inclusive of the start time.
     * </p>
     * 
     * @param startTime
     *        The time at which the logs should start. The time range specified is inclusive of the start time.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time at which the logs should start. The time range specified is inclusive of the start time.
     * </p>
     * 
     * @return The time at which the logs should start. The time range specified is inclusive of the start time.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time at which the logs should start. The time range specified is inclusive of the start time.
     * </p>
     * 
     * @param startTime
     *        The time at which the logs should start. The time range specified is inclusive of the start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateAccessLogsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time at which the logs should end. The time range specified is inclusive of the end time.
     * </p>
     * 
     * @param endTime
     *        The time at which the logs should end. The time range specified is inclusive of the end time.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time at which the logs should end. The time range specified is inclusive of the end time.
     * </p>
     * 
     * @return The time at which the logs should end. The time range specified is inclusive of the end time.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time at which the logs should end. The time range specified is inclusive of the end time.
     * </p>
     * 
     * @param endTime
     *        The time at which the logs should end. The time range specified is inclusive of the end time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateAccessLogsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateAccessLogsRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID for an Amplify app.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * 
     * @return The unique ID for an Amplify app.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID for an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateAccessLogsRequest withAppId(String appId) {
        setAppId(appId);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateAccessLogsRequest == false)
            return false;
        GenerateAccessLogsRequest other = (GenerateAccessLogsRequest) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        return hashCode;
    }

    @Override
    public GenerateAccessLogsRequest clone() {
        return (GenerateAccessLogsRequest) super.clone();
    }

}
