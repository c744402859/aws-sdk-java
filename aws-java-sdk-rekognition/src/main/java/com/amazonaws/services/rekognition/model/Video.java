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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Video file stored in an Amazon S3 bucket. Amazon Rekognition video start operations such as
 * <a>StartLabelDetection</a> use <code>Video</code> to specify a video for analysis. The supported file formats are
 * .mp4, .mov and .avi.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Video implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket name and file name for the video.
     * </p>
     */
    private S3Object s3Object;

    /**
     * <p>
     * The Amazon S3 bucket name and file name for the video.
     * </p>
     * 
     * @param s3Object
     *        The Amazon S3 bucket name and file name for the video.
     */

    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    /**
     * <p>
     * The Amazon S3 bucket name and file name for the video.
     * </p>
     * 
     * @return The Amazon S3 bucket name and file name for the video.
     */

    public S3Object getS3Object() {
        return this.s3Object;
    }

    /**
     * <p>
     * The Amazon S3 bucket name and file name for the video.
     * </p>
     * 
     * @param s3Object
     *        The Amazon S3 bucket name and file name for the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Video withS3Object(S3Object s3Object) {
        setS3Object(s3Object);
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
        if (getS3Object() != null)
            sb.append("S3Object: ").append(getS3Object());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Video == false)
            return false;
        Video other = (Video) obj;
        if (other.getS3Object() == null ^ this.getS3Object() == null)
            return false;
        if (other.getS3Object() != null && other.getS3Object().equals(this.getS3Object()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Object() == null) ? 0 : getS3Object().hashCode());
        return hashCode;
    }

    @Override
    public Video clone() {
        try {
            return (Video) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.VideoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
