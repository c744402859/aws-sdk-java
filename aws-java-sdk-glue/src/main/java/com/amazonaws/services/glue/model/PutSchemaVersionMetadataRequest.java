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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutSchemaVersionMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSchemaVersionMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID for the schema.
     * </p>
     */
    private SchemaId schemaId;
    /**
     * <p>
     * The version number of the schema.
     * </p>
     */
    private SchemaVersionNumber schemaVersionNumber;
    /**
     * <p>
     * The unique version ID of the schema version.
     * </p>
     */
    private String schemaVersionId;
    /**
     * <p>
     * The metadata key's corresponding value.
     * </p>
     */
    private MetadataKeyValuePair metadataKeyValue;

    /**
     * <p>
     * The unique ID for the schema.
     * </p>
     * 
     * @param schemaId
     *        The unique ID for the schema.
     */

    public void setSchemaId(SchemaId schemaId) {
        this.schemaId = schemaId;
    }

    /**
     * <p>
     * The unique ID for the schema.
     * </p>
     * 
     * @return The unique ID for the schema.
     */

    public SchemaId getSchemaId() {
        return this.schemaId;
    }

    /**
     * <p>
     * The unique ID for the schema.
     * </p>
     * 
     * @param schemaId
     *        The unique ID for the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaVersionMetadataRequest withSchemaId(SchemaId schemaId) {
        setSchemaId(schemaId);
        return this;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @param schemaVersionNumber
     *        The version number of the schema.
     */

    public void setSchemaVersionNumber(SchemaVersionNumber schemaVersionNumber) {
        this.schemaVersionNumber = schemaVersionNumber;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @return The version number of the schema.
     */

    public SchemaVersionNumber getSchemaVersionNumber() {
        return this.schemaVersionNumber;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @param schemaVersionNumber
     *        The version number of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaVersionMetadataRequest withSchemaVersionNumber(SchemaVersionNumber schemaVersionNumber) {
        setSchemaVersionNumber(schemaVersionNumber);
        return this;
    }

    /**
     * <p>
     * The unique version ID of the schema version.
     * </p>
     * 
     * @param schemaVersionId
     *        The unique version ID of the schema version.
     */

    public void setSchemaVersionId(String schemaVersionId) {
        this.schemaVersionId = schemaVersionId;
    }

    /**
     * <p>
     * The unique version ID of the schema version.
     * </p>
     * 
     * @return The unique version ID of the schema version.
     */

    public String getSchemaVersionId() {
        return this.schemaVersionId;
    }

    /**
     * <p>
     * The unique version ID of the schema version.
     * </p>
     * 
     * @param schemaVersionId
     *        The unique version ID of the schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaVersionMetadataRequest withSchemaVersionId(String schemaVersionId) {
        setSchemaVersionId(schemaVersionId);
        return this;
    }

    /**
     * <p>
     * The metadata key's corresponding value.
     * </p>
     * 
     * @param metadataKeyValue
     *        The metadata key's corresponding value.
     */

    public void setMetadataKeyValue(MetadataKeyValuePair metadataKeyValue) {
        this.metadataKeyValue = metadataKeyValue;
    }

    /**
     * <p>
     * The metadata key's corresponding value.
     * </p>
     * 
     * @return The metadata key's corresponding value.
     */

    public MetadataKeyValuePair getMetadataKeyValue() {
        return this.metadataKeyValue;
    }

    /**
     * <p>
     * The metadata key's corresponding value.
     * </p>
     * 
     * @param metadataKeyValue
     *        The metadata key's corresponding value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaVersionMetadataRequest withMetadataKeyValue(MetadataKeyValuePair metadataKeyValue) {
        setMetadataKeyValue(metadataKeyValue);
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
        if (getSchemaId() != null)
            sb.append("SchemaId: ").append(getSchemaId()).append(",");
        if (getSchemaVersionNumber() != null)
            sb.append("SchemaVersionNumber: ").append(getSchemaVersionNumber()).append(",");
        if (getSchemaVersionId() != null)
            sb.append("SchemaVersionId: ").append(getSchemaVersionId()).append(",");
        if (getMetadataKeyValue() != null)
            sb.append("MetadataKeyValue: ").append(getMetadataKeyValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSchemaVersionMetadataRequest == false)
            return false;
        PutSchemaVersionMetadataRequest other = (PutSchemaVersionMetadataRequest) obj;
        if (other.getSchemaId() == null ^ this.getSchemaId() == null)
            return false;
        if (other.getSchemaId() != null && other.getSchemaId().equals(this.getSchemaId()) == false)
            return false;
        if (other.getSchemaVersionNumber() == null ^ this.getSchemaVersionNumber() == null)
            return false;
        if (other.getSchemaVersionNumber() != null && other.getSchemaVersionNumber().equals(this.getSchemaVersionNumber()) == false)
            return false;
        if (other.getSchemaVersionId() == null ^ this.getSchemaVersionId() == null)
            return false;
        if (other.getSchemaVersionId() != null && other.getSchemaVersionId().equals(this.getSchemaVersionId()) == false)
            return false;
        if (other.getMetadataKeyValue() == null ^ this.getMetadataKeyValue() == null)
            return false;
        if (other.getMetadataKeyValue() != null && other.getMetadataKeyValue().equals(this.getMetadataKeyValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaId() == null) ? 0 : getSchemaId().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersionNumber() == null) ? 0 : getSchemaVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersionId() == null) ? 0 : getSchemaVersionId().hashCode());
        hashCode = prime * hashCode + ((getMetadataKeyValue() == null) ? 0 : getMetadataKeyValue().hashCode());
        return hashCode;
    }

    @Override
    public PutSchemaVersionMetadataRequest clone() {
        return (PutSchemaVersionMetadataRequest) super.clone();
    }

}
