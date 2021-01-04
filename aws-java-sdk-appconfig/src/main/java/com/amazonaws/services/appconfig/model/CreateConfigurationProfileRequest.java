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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateConfigurationProfile"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfigurationProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application ID.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * A name for the configuration profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the configuration profile.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A URI to locate the configuration. You can specify a Systems Manager (SSM) document, an SSM Parameter Store
     * parameter, or an Amazon S3 object. For an SSM document, specify either the document name in the format
     * <code>ssm-document://&lt;Document_name&gt;</code> or the Amazon Resource Name (ARN). For a parameter, specify
     * either the parameter name in the format <code>ssm-parameter://&lt;Parameter_name&gt;</code> or the ARN. For an
     * Amazon S3 object, specify the URI in the following format: <code>s3://&lt;bucket&gt;/&lt;objectKey&gt; </code>.
     * Here is an example: s3://my-bucket/my-app/us-east-1/my-config.json
     * </p>
     */
    private String locationUri;
    /**
     * <p>
     * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
     * </p>
     */
    private String retrievalRoleArn;
    /**
     * <p>
     * A list of methods for validating the configuration.
     * </p>
     */
    private java.util.List<Validator> validators;
    /**
     * <p>
     * Metadata to assign to the configuration profile. Tags help organize and categorize your AppConfig resources. Each
     * tag consists of a key and an optional value, both of which you define.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @return The application ID.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationProfileRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * A name for the configuration profile.
     * </p>
     * 
     * @param name
     *        A name for the configuration profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the configuration profile.
     * </p>
     * 
     * @return A name for the configuration profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the configuration profile.
     * </p>
     * 
     * @param name
     *        A name for the configuration profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationProfileRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the configuration profile.
     * </p>
     * 
     * @param description
     *        A description of the configuration profile.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the configuration profile.
     * </p>
     * 
     * @return A description of the configuration profile.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the configuration profile.
     * </p>
     * 
     * @param description
     *        A description of the configuration profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationProfileRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A URI to locate the configuration. You can specify a Systems Manager (SSM) document, an SSM Parameter Store
     * parameter, or an Amazon S3 object. For an SSM document, specify either the document name in the format
     * <code>ssm-document://&lt;Document_name&gt;</code> or the Amazon Resource Name (ARN). For a parameter, specify
     * either the parameter name in the format <code>ssm-parameter://&lt;Parameter_name&gt;</code> or the ARN. For an
     * Amazon S3 object, specify the URI in the following format: <code>s3://&lt;bucket&gt;/&lt;objectKey&gt; </code>.
     * Here is an example: s3://my-bucket/my-app/us-east-1/my-config.json
     * </p>
     * 
     * @param locationUri
     *        A URI to locate the configuration. You can specify a Systems Manager (SSM) document, an SSM Parameter
     *        Store parameter, or an Amazon S3 object. For an SSM document, specify either the document name in the
     *        format <code>ssm-document://&lt;Document_name&gt;</code> or the Amazon Resource Name (ARN). For a
     *        parameter, specify either the parameter name in the format
     *        <code>ssm-parameter://&lt;Parameter_name&gt;</code> or the ARN. For an Amazon S3 object, specify the URI
     *        in the following format: <code>s3://&lt;bucket&gt;/&lt;objectKey&gt; </code>. Here is an example:
     *        s3://my-bucket/my-app/us-east-1/my-config.json
     */

    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * A URI to locate the configuration. You can specify a Systems Manager (SSM) document, an SSM Parameter Store
     * parameter, or an Amazon S3 object. For an SSM document, specify either the document name in the format
     * <code>ssm-document://&lt;Document_name&gt;</code> or the Amazon Resource Name (ARN). For a parameter, specify
     * either the parameter name in the format <code>ssm-parameter://&lt;Parameter_name&gt;</code> or the ARN. For an
     * Amazon S3 object, specify the URI in the following format: <code>s3://&lt;bucket&gt;/&lt;objectKey&gt; </code>.
     * Here is an example: s3://my-bucket/my-app/us-east-1/my-config.json
     * </p>
     * 
     * @return A URI to locate the configuration. You can specify a Systems Manager (SSM) document, an SSM Parameter
     *         Store parameter, or an Amazon S3 object. For an SSM document, specify either the document name in the
     *         format <code>ssm-document://&lt;Document_name&gt;</code> or the Amazon Resource Name (ARN). For a
     *         parameter, specify either the parameter name in the format
     *         <code>ssm-parameter://&lt;Parameter_name&gt;</code> or the ARN. For an Amazon S3 object, specify the URI
     *         in the following format: <code>s3://&lt;bucket&gt;/&lt;objectKey&gt; </code>. Here is an example:
     *         s3://my-bucket/my-app/us-east-1/my-config.json
     */

    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * <p>
     * A URI to locate the configuration. You can specify a Systems Manager (SSM) document, an SSM Parameter Store
     * parameter, or an Amazon S3 object. For an SSM document, specify either the document name in the format
     * <code>ssm-document://&lt;Document_name&gt;</code> or the Amazon Resource Name (ARN). For a parameter, specify
     * either the parameter name in the format <code>ssm-parameter://&lt;Parameter_name&gt;</code> or the ARN. For an
     * Amazon S3 object, specify the URI in the following format: <code>s3://&lt;bucket&gt;/&lt;objectKey&gt; </code>.
     * Here is an example: s3://my-bucket/my-app/us-east-1/my-config.json
     * </p>
     * 
     * @param locationUri
     *        A URI to locate the configuration. You can specify a Systems Manager (SSM) document, an SSM Parameter
     *        Store parameter, or an Amazon S3 object. For an SSM document, specify either the document name in the
     *        format <code>ssm-document://&lt;Document_name&gt;</code> or the Amazon Resource Name (ARN). For a
     *        parameter, specify either the parameter name in the format
     *        <code>ssm-parameter://&lt;Parameter_name&gt;</code> or the ARN. For an Amazon S3 object, specify the URI
     *        in the following format: <code>s3://&lt;bucket&gt;/&lt;objectKey&gt; </code>. Here is an example:
     *        s3://my-bucket/my-app/us-east-1/my-config.json
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationProfileRequest withLocationUri(String locationUri) {
        setLocationUri(locationUri);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
     * </p>
     * 
     * @param retrievalRoleArn
     *        The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
     */

    public void setRetrievalRoleArn(String retrievalRoleArn) {
        this.retrievalRoleArn = retrievalRoleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
     * </p>
     * 
     * @return The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
     */

    public String getRetrievalRoleArn() {
        return this.retrievalRoleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
     * </p>
     * 
     * @param retrievalRoleArn
     *        The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationProfileRequest withRetrievalRoleArn(String retrievalRoleArn) {
        setRetrievalRoleArn(retrievalRoleArn);
        return this;
    }

    /**
     * <p>
     * A list of methods for validating the configuration.
     * </p>
     * 
     * @return A list of methods for validating the configuration.
     */

    public java.util.List<Validator> getValidators() {
        return validators;
    }

    /**
     * <p>
     * A list of methods for validating the configuration.
     * </p>
     * 
     * @param validators
     *        A list of methods for validating the configuration.
     */

    public void setValidators(java.util.Collection<Validator> validators) {
        if (validators == null) {
            this.validators = null;
            return;
        }

        this.validators = new java.util.ArrayList<Validator>(validators);
    }

    /**
     * <p>
     * A list of methods for validating the configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidators(java.util.Collection)} or {@link #withValidators(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param validators
     *        A list of methods for validating the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationProfileRequest withValidators(Validator... validators) {
        if (this.validators == null) {
            setValidators(new java.util.ArrayList<Validator>(validators.length));
        }
        for (Validator ele : validators) {
            this.validators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of methods for validating the configuration.
     * </p>
     * 
     * @param validators
     *        A list of methods for validating the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationProfileRequest withValidators(java.util.Collection<Validator> validators) {
        setValidators(validators);
        return this;
    }

    /**
     * <p>
     * Metadata to assign to the configuration profile. Tags help organize and categorize your AppConfig resources. Each
     * tag consists of a key and an optional value, both of which you define.
     * </p>
     * 
     * @return Metadata to assign to the configuration profile. Tags help organize and categorize your AppConfig
     *         resources. Each tag consists of a key and an optional value, both of which you define.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata to assign to the configuration profile. Tags help organize and categorize your AppConfig resources. Each
     * tag consists of a key and an optional value, both of which you define.
     * </p>
     * 
     * @param tags
     *        Metadata to assign to the configuration profile. Tags help organize and categorize your AppConfig
     *        resources. Each tag consists of a key and an optional value, both of which you define.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata to assign to the configuration profile. Tags help organize and categorize your AppConfig resources. Each
     * tag consists of a key and an optional value, both of which you define.
     * </p>
     * 
     * @param tags
     *        Metadata to assign to the configuration profile. Tags help organize and categorize your AppConfig
     *        resources. Each tag consists of a key and an optional value, both of which you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationProfileRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateConfigurationProfileRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationProfileRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationProfileRequest clearTagsEntries() {
        this.tags = null;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLocationUri() != null)
            sb.append("LocationUri: ").append(getLocationUri()).append(",");
        if (getRetrievalRoleArn() != null)
            sb.append("RetrievalRoleArn: ").append(getRetrievalRoleArn()).append(",");
        if (getValidators() != null)
            sb.append("Validators: ").append(getValidators()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfigurationProfileRequest == false)
            return false;
        CreateConfigurationProfileRequest other = (CreateConfigurationProfileRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getRetrievalRoleArn() == null ^ this.getRetrievalRoleArn() == null)
            return false;
        if (other.getRetrievalRoleArn() != null && other.getRetrievalRoleArn().equals(this.getRetrievalRoleArn()) == false)
            return false;
        if (other.getValidators() == null ^ this.getValidators() == null)
            return false;
        if (other.getValidators() != null && other.getValidators().equals(this.getValidators()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode + ((getRetrievalRoleArn() == null) ? 0 : getRetrievalRoleArn().hashCode());
        hashCode = prime * hashCode + ((getValidators() == null) ? 0 : getValidators().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateConfigurationProfileRequest clone() {
        return (CreateConfigurationProfileRequest) super.clone();
    }

}
