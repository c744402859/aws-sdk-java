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
package com.amazonaws.services.polly.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/StartSpeechSynthesisTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSpeechSynthesisTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * SynthesisTask object that provides information and attributes about a newly submitted speech synthesis task.
     * </p>
     */
    private SynthesisTask synthesisTask;

    /**
     * <p>
     * SynthesisTask object that provides information and attributes about a newly submitted speech synthesis task.
     * </p>
     * 
     * @param synthesisTask
     *        SynthesisTask object that provides information and attributes about a newly submitted speech synthesis
     *        task.
     */

    public void setSynthesisTask(SynthesisTask synthesisTask) {
        this.synthesisTask = synthesisTask;
    }

    /**
     * <p>
     * SynthesisTask object that provides information and attributes about a newly submitted speech synthesis task.
     * </p>
     * 
     * @return SynthesisTask object that provides information and attributes about a newly submitted speech synthesis
     *         task.
     */

    public SynthesisTask getSynthesisTask() {
        return this.synthesisTask;
    }

    /**
     * <p>
     * SynthesisTask object that provides information and attributes about a newly submitted speech synthesis task.
     * </p>
     * 
     * @param synthesisTask
     *        SynthesisTask object that provides information and attributes about a newly submitted speech synthesis
     *        task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeechSynthesisTaskResult withSynthesisTask(SynthesisTask synthesisTask) {
        setSynthesisTask(synthesisTask);
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
        if (getSynthesisTask() != null)
            sb.append("SynthesisTask: ").append(getSynthesisTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSpeechSynthesisTaskResult == false)
            return false;
        StartSpeechSynthesisTaskResult other = (StartSpeechSynthesisTaskResult) obj;
        if (other.getSynthesisTask() == null ^ this.getSynthesisTask() == null)
            return false;
        if (other.getSynthesisTask() != null && other.getSynthesisTask().equals(this.getSynthesisTask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSynthesisTask() == null) ? 0 : getSynthesisTask().hashCode());
        return hashCode;
    }

    @Override
    public StartSpeechSynthesisTaskResult clone() {
        try {
            return (StartSpeechSynthesisTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
