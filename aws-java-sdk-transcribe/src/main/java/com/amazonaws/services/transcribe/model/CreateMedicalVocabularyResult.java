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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateMedicalVocabulary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMedicalVocabularyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the vocabulary. The name must be unique within an AWS account and is case sensitive.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The language code for the entries in your custom vocabulary. US English (en-US) is the only valid language code
     * for Amazon Transcribe Medical.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The processing state of your custom vocabulary in Amazon Transcribe Medical. If the state is <code>READY</code>,
     * you can use the vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     */
    private String vocabularyState;
    /**
     * <p>
     * The date and time that you created the vocabulary.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * If the <code>VocabularyState</code> field is <code>FAILED</code>, this field contains information about why the
     * job failed.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the vocabulary. The name must be unique within an AWS account and is case sensitive.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary. The name must be unique within an AWS account and is case sensitive.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary. The name must be unique within an AWS account and is case sensitive.
     * </p>
     * 
     * @return The name of the vocabulary. The name must be unique within an AWS account and is case sensitive.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary. The name must be unique within an AWS account and is case sensitive.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary. The name must be unique within an AWS account and is case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMedicalVocabularyResult withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The language code for the entries in your custom vocabulary. US English (en-US) is the only valid language code
     * for Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code for the entries in your custom vocabulary. US English (en-US) is the only valid language
     *        code for Amazon Transcribe Medical.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the entries in your custom vocabulary. US English (en-US) is the only valid language code
     * for Amazon Transcribe Medical.
     * </p>
     * 
     * @return The language code for the entries in your custom vocabulary. US English (en-US) is the only valid
     *         language code for Amazon Transcribe Medical.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code for the entries in your custom vocabulary. US English (en-US) is the only valid language code
     * for Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code for the entries in your custom vocabulary. US English (en-US) is the only valid language
     *        code for Amazon Transcribe Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateMedicalVocabularyResult withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code for the entries in your custom vocabulary. US English (en-US) is the only valid language code
     * for Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code for the entries in your custom vocabulary. US English (en-US) is the only valid language
     *        code for Amazon Transcribe Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateMedicalVocabularyResult withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The processing state of your custom vocabulary in Amazon Transcribe Medical. If the state is <code>READY</code>,
     * you can use the vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     * 
     * @param vocabularyState
     *        The processing state of your custom vocabulary in Amazon Transcribe Medical. If the state is
     *        <code>READY</code>, you can use the vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * @see VocabularyState
     */

    public void setVocabularyState(String vocabularyState) {
        this.vocabularyState = vocabularyState;
    }

    /**
     * <p>
     * The processing state of your custom vocabulary in Amazon Transcribe Medical. If the state is <code>READY</code>,
     * you can use the vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     * 
     * @return The processing state of your custom vocabulary in Amazon Transcribe Medical. If the state is
     *         <code>READY</code>, you can use the vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * @see VocabularyState
     */

    public String getVocabularyState() {
        return this.vocabularyState;
    }

    /**
     * <p>
     * The processing state of your custom vocabulary in Amazon Transcribe Medical. If the state is <code>READY</code>,
     * you can use the vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     * 
     * @param vocabularyState
     *        The processing state of your custom vocabulary in Amazon Transcribe Medical. If the state is
     *        <code>READY</code>, you can use the vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public CreateMedicalVocabularyResult withVocabularyState(String vocabularyState) {
        setVocabularyState(vocabularyState);
        return this;
    }

    /**
     * <p>
     * The processing state of your custom vocabulary in Amazon Transcribe Medical. If the state is <code>READY</code>,
     * you can use the vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     * 
     * @param vocabularyState
     *        The processing state of your custom vocabulary in Amazon Transcribe Medical. If the state is
     *        <code>READY</code>, you can use the vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public CreateMedicalVocabularyResult withVocabularyState(VocabularyState vocabularyState) {
        this.vocabularyState = vocabularyState.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that you created the vocabulary.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that you created the vocabulary.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that you created the vocabulary.
     * </p>
     * 
     * @return The date and time that you created the vocabulary.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that you created the vocabulary.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that you created the vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMedicalVocabularyResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * If the <code>VocabularyState</code> field is <code>FAILED</code>, this field contains information about why the
     * job failed.
     * </p>
     * 
     * @param failureReason
     *        If the <code>VocabularyState</code> field is <code>FAILED</code>, this field contains information about
     *        why the job failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the <code>VocabularyState</code> field is <code>FAILED</code>, this field contains information about why the
     * job failed.
     * </p>
     * 
     * @return If the <code>VocabularyState</code> field is <code>FAILED</code>, this field contains information about
     *         why the job failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the <code>VocabularyState</code> field is <code>FAILED</code>, this field contains information about why the
     * job failed.
     * </p>
     * 
     * @param failureReason
     *        If the <code>VocabularyState</code> field is <code>FAILED</code>, this field contains information about
     *        why the job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMedicalVocabularyResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getVocabularyName() != null)
            sb.append("VocabularyName: ").append(getVocabularyName()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getVocabularyState() != null)
            sb.append("VocabularyState: ").append(getVocabularyState()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMedicalVocabularyResult == false)
            return false;
        CreateMedicalVocabularyResult other = (CreateMedicalVocabularyResult) obj;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getVocabularyState() == null ^ this.getVocabularyState() == null)
            return false;
        if (other.getVocabularyState() != null && other.getVocabularyState().equals(this.getVocabularyState()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getVocabularyState() == null) ? 0 : getVocabularyState().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public CreateMedicalVocabularyResult clone() {
        try {
            return (CreateMedicalVocabularyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
