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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The settings that determine how Amazon AppFlow handles an error when placing data in the destination. For example,
 * this setting would determine if the flow should fail after one insertion error, or continue and attempt to insert
 * every record regardless of the initial failure. <code>ErrorHandlingConfig</code> is a part of the destination
 * connector details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ErrorHandlingConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorHandlingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies if the flow should fail after the first instance of a failure when attempting to place data in the
     * destination.
     * </p>
     */
    private Boolean failOnFirstDestinationError;
    /**
     * <p>
     * Specifies the Amazon S3 bucket prefix.
     * </p>
     */
    private String bucketPrefix;
    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket.
     * </p>
     */
    private String bucketName;

    /**
     * <p>
     * Specifies if the flow should fail after the first instance of a failure when attempting to place data in the
     * destination.
     * </p>
     * 
     * @param failOnFirstDestinationError
     *        Specifies if the flow should fail after the first instance of a failure when attempting to place data in
     *        the destination.
     */

    public void setFailOnFirstDestinationError(Boolean failOnFirstDestinationError) {
        this.failOnFirstDestinationError = failOnFirstDestinationError;
    }

    /**
     * <p>
     * Specifies if the flow should fail after the first instance of a failure when attempting to place data in the
     * destination.
     * </p>
     * 
     * @return Specifies if the flow should fail after the first instance of a failure when attempting to place data in
     *         the destination.
     */

    public Boolean getFailOnFirstDestinationError() {
        return this.failOnFirstDestinationError;
    }

    /**
     * <p>
     * Specifies if the flow should fail after the first instance of a failure when attempting to place data in the
     * destination.
     * </p>
     * 
     * @param failOnFirstDestinationError
     *        Specifies if the flow should fail after the first instance of a failure when attempting to place data in
     *        the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorHandlingConfig withFailOnFirstDestinationError(Boolean failOnFirstDestinationError) {
        setFailOnFirstDestinationError(failOnFirstDestinationError);
        return this;
    }

    /**
     * <p>
     * Specifies if the flow should fail after the first instance of a failure when attempting to place data in the
     * destination.
     * </p>
     * 
     * @return Specifies if the flow should fail after the first instance of a failure when attempting to place data in
     *         the destination.
     */

    public Boolean isFailOnFirstDestinationError() {
        return this.failOnFirstDestinationError;
    }

    /**
     * <p>
     * Specifies the Amazon S3 bucket prefix.
     * </p>
     * 
     * @param bucketPrefix
     *        Specifies the Amazon S3 bucket prefix.
     */

    public void setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
    }

    /**
     * <p>
     * Specifies the Amazon S3 bucket prefix.
     * </p>
     * 
     * @return Specifies the Amazon S3 bucket prefix.
     */

    public String getBucketPrefix() {
        return this.bucketPrefix;
    }

    /**
     * <p>
     * Specifies the Amazon S3 bucket prefix.
     * </p>
     * 
     * @param bucketPrefix
     *        Specifies the Amazon S3 bucket prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorHandlingConfig withBucketPrefix(String bucketPrefix) {
        setBucketPrefix(bucketPrefix);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        Specifies the name of the Amazon S3 bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket.
     * </p>
     * 
     * @return Specifies the name of the Amazon S3 bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        Specifies the name of the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorHandlingConfig withBucketName(String bucketName) {
        setBucketName(bucketName);
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
        if (getFailOnFirstDestinationError() != null)
            sb.append("FailOnFirstDestinationError: ").append(getFailOnFirstDestinationError()).append(",");
        if (getBucketPrefix() != null)
            sb.append("BucketPrefix: ").append(getBucketPrefix()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorHandlingConfig == false)
            return false;
        ErrorHandlingConfig other = (ErrorHandlingConfig) obj;
        if (other.getFailOnFirstDestinationError() == null ^ this.getFailOnFirstDestinationError() == null)
            return false;
        if (other.getFailOnFirstDestinationError() != null && other.getFailOnFirstDestinationError().equals(this.getFailOnFirstDestinationError()) == false)
            return false;
        if (other.getBucketPrefix() == null ^ this.getBucketPrefix() == null)
            return false;
        if (other.getBucketPrefix() != null && other.getBucketPrefix().equals(this.getBucketPrefix()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailOnFirstDestinationError() == null) ? 0 : getFailOnFirstDestinationError().hashCode());
        hashCode = prime * hashCode + ((getBucketPrefix() == null) ? 0 : getBucketPrefix().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        return hashCode;
    }

    @Override
    public ErrorHandlingConfig clone() {
        try {
            return (ErrorHandlingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ErrorHandlingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
