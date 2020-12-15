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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListViolationEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The start time for the alerts to be listed.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time for the alerts to be listed.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * A filter to limit results to those alerts caused by the specified thing.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * A filter to limit results to those alerts generated by the specified security profile.
     * </p>
     */
    private String securityProfileName;
    /**
     * <p>
     * The criteria for a behavior.
     * </p>
     */
    private String behaviorCriteriaType;
    /**
     * <p>
     * A list of all suppressed alerts.
     * </p>
     */
    private Boolean listSuppressedAlerts;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The start time for the alerts to be listed.
     * </p>
     * 
     * @param startTime
     *        The start time for the alerts to be listed.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time for the alerts to be listed.
     * </p>
     * 
     * @return The start time for the alerts to be listed.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time for the alerts to be listed.
     * </p>
     * 
     * @param startTime
     *        The start time for the alerts to be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListViolationEventsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time for the alerts to be listed.
     * </p>
     * 
     * @param endTime
     *        The end time for the alerts to be listed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time for the alerts to be listed.
     * </p>
     * 
     * @return The end time for the alerts to be listed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time for the alerts to be listed.
     * </p>
     * 
     * @param endTime
     *        The end time for the alerts to be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListViolationEventsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * A filter to limit results to those alerts caused by the specified thing.
     * </p>
     * 
     * @param thingName
     *        A filter to limit results to those alerts caused by the specified thing.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * A filter to limit results to those alerts caused by the specified thing.
     * </p>
     * 
     * @return A filter to limit results to those alerts caused by the specified thing.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * A filter to limit results to those alerts caused by the specified thing.
     * </p>
     * 
     * @param thingName
     *        A filter to limit results to those alerts caused by the specified thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListViolationEventsRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * A filter to limit results to those alerts generated by the specified security profile.
     * </p>
     * 
     * @param securityProfileName
     *        A filter to limit results to those alerts generated by the specified security profile.
     */

    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * A filter to limit results to those alerts generated by the specified security profile.
     * </p>
     * 
     * @return A filter to limit results to those alerts generated by the specified security profile.
     */

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    /**
     * <p>
     * A filter to limit results to those alerts generated by the specified security profile.
     * </p>
     * 
     * @param securityProfileName
     *        A filter to limit results to those alerts generated by the specified security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListViolationEventsRequest withSecurityProfileName(String securityProfileName) {
        setSecurityProfileName(securityProfileName);
        return this;
    }

    /**
     * <p>
     * The criteria for a behavior.
     * </p>
     * 
     * @param behaviorCriteriaType
     *        The criteria for a behavior.
     * @see BehaviorCriteriaType
     */

    public void setBehaviorCriteriaType(String behaviorCriteriaType) {
        this.behaviorCriteriaType = behaviorCriteriaType;
    }

    /**
     * <p>
     * The criteria for a behavior.
     * </p>
     * 
     * @return The criteria for a behavior.
     * @see BehaviorCriteriaType
     */

    public String getBehaviorCriteriaType() {
        return this.behaviorCriteriaType;
    }

    /**
     * <p>
     * The criteria for a behavior.
     * </p>
     * 
     * @param behaviorCriteriaType
     *        The criteria for a behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BehaviorCriteriaType
     */

    public ListViolationEventsRequest withBehaviorCriteriaType(String behaviorCriteriaType) {
        setBehaviorCriteriaType(behaviorCriteriaType);
        return this;
    }

    /**
     * <p>
     * The criteria for a behavior.
     * </p>
     * 
     * @param behaviorCriteriaType
     *        The criteria for a behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BehaviorCriteriaType
     */

    public ListViolationEventsRequest withBehaviorCriteriaType(BehaviorCriteriaType behaviorCriteriaType) {
        this.behaviorCriteriaType = behaviorCriteriaType.toString();
        return this;
    }

    /**
     * <p>
     * A list of all suppressed alerts.
     * </p>
     * 
     * @param listSuppressedAlerts
     *        A list of all suppressed alerts.
     */

    public void setListSuppressedAlerts(Boolean listSuppressedAlerts) {
        this.listSuppressedAlerts = listSuppressedAlerts;
    }

    /**
     * <p>
     * A list of all suppressed alerts.
     * </p>
     * 
     * @return A list of all suppressed alerts.
     */

    public Boolean getListSuppressedAlerts() {
        return this.listSuppressedAlerts;
    }

    /**
     * <p>
     * A list of all suppressed alerts.
     * </p>
     * 
     * @param listSuppressedAlerts
     *        A list of all suppressed alerts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListViolationEventsRequest withListSuppressedAlerts(Boolean listSuppressedAlerts) {
        setListSuppressedAlerts(listSuppressedAlerts);
        return this;
    }

    /**
     * <p>
     * A list of all suppressed alerts.
     * </p>
     * 
     * @return A list of all suppressed alerts.
     */

    public Boolean isListSuppressedAlerts() {
        return this.listSuppressedAlerts;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListViolationEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @return The maximum number of results to return at one time.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListViolationEventsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getSecurityProfileName() != null)
            sb.append("SecurityProfileName: ").append(getSecurityProfileName()).append(",");
        if (getBehaviorCriteriaType() != null)
            sb.append("BehaviorCriteriaType: ").append(getBehaviorCriteriaType()).append(",");
        if (getListSuppressedAlerts() != null)
            sb.append("ListSuppressedAlerts: ").append(getListSuppressedAlerts()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListViolationEventsRequest == false)
            return false;
        ListViolationEventsRequest other = (ListViolationEventsRequest) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getBehaviorCriteriaType() == null ^ this.getBehaviorCriteriaType() == null)
            return false;
        if (other.getBehaviorCriteriaType() != null && other.getBehaviorCriteriaType().equals(this.getBehaviorCriteriaType()) == false)
            return false;
        if (other.getListSuppressedAlerts() == null ^ this.getListSuppressedAlerts() == null)
            return false;
        if (other.getListSuppressedAlerts() != null && other.getListSuppressedAlerts().equals(this.getListSuppressedAlerts()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode + ((getBehaviorCriteriaType() == null) ? 0 : getBehaviorCriteriaType().hashCode());
        hashCode = prime * hashCode + ((getListSuppressedAlerts() == null) ? 0 : getListSuppressedAlerts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListViolationEventsRequest clone() {
        return (ListViolationEventsRequest) super.clone();
    }

}
