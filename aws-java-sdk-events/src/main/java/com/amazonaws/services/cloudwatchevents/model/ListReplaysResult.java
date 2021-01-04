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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListReplays" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReplaysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>Replay</code> objects that contain information about the replay.
     * </p>
     */
    private java.util.List<Replay> replays;
    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>Replay</code> objects that contain information about the replay.
     * </p>
     * 
     * @return An array of <code>Replay</code> objects that contain information about the replay.
     */

    public java.util.List<Replay> getReplays() {
        return replays;
    }

    /**
     * <p>
     * An array of <code>Replay</code> objects that contain information about the replay.
     * </p>
     * 
     * @param replays
     *        An array of <code>Replay</code> objects that contain information about the replay.
     */

    public void setReplays(java.util.Collection<Replay> replays) {
        if (replays == null) {
            this.replays = null;
            return;
        }

        this.replays = new java.util.ArrayList<Replay>(replays);
    }

    /**
     * <p>
     * An array of <code>Replay</code> objects that contain information about the replay.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplays(java.util.Collection)} or {@link #withReplays(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param replays
     *        An array of <code>Replay</code> objects that contain information about the replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReplaysResult withReplays(Replay... replays) {
        if (this.replays == null) {
            setReplays(new java.util.ArrayList<Replay>(replays.length));
        }
        for (Replay ele : replays) {
            this.replays.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Replay</code> objects that contain information about the replay.
     * </p>
     * 
     * @param replays
     *        An array of <code>Replay</code> objects that contain information about the replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReplaysResult withReplays(java.util.Collection<Replay> replays) {
        setReplays(replays);
        return this;
    }

    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     * 
     * @return The token returned by a previous call to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReplaysResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getReplays() != null)
            sb.append("Replays: ").append(getReplays()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReplaysResult == false)
            return false;
        ListReplaysResult other = (ListReplaysResult) obj;
        if (other.getReplays() == null ^ this.getReplays() == null)
            return false;
        if (other.getReplays() != null && other.getReplays().equals(this.getReplays()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplays() == null) ? 0 : getReplays().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListReplaysResult clone() {
        try {
            return (ListReplaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
