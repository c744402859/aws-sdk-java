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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/GetProvisionedProductOutputs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProvisionedProductOutputsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The identifier of the provisioned product that you want the outputs from.
     * </p>
     */
    private String provisionedProductId;
    /**
     * <p>
     * The name of the provisioned product that you want the outputs from.
     * </p>
     */
    private String provisionedProductName;
    /**
     * <p>
     * The list of keys that the API should return with their values. If none are provided, the API will return all
     * outputs of the provisioned product.
     * </p>
     */
    private java.util.List<String> outputKeys;
    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedProductOutputsRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioned product that you want the outputs from.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the provisioned product that you want the outputs from.
     */

    public void setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product that you want the outputs from.
     * </p>
     * 
     * @return The identifier of the provisioned product that you want the outputs from.
     */

    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product that you want the outputs from.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the provisioned product that you want the outputs from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedProductOutputsRequest withProvisionedProductId(String provisionedProductId) {
        setProvisionedProductId(provisionedProductId);
        return this;
    }

    /**
     * <p>
     * The name of the provisioned product that you want the outputs from.
     * </p>
     * 
     * @param provisionedProductName
     *        The name of the provisioned product that you want the outputs from.
     */

    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * The name of the provisioned product that you want the outputs from.
     * </p>
     * 
     * @return The name of the provisioned product that you want the outputs from.
     */

    public String getProvisionedProductName() {
        return this.provisionedProductName;
    }

    /**
     * <p>
     * The name of the provisioned product that you want the outputs from.
     * </p>
     * 
     * @param provisionedProductName
     *        The name of the provisioned product that you want the outputs from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedProductOutputsRequest withProvisionedProductName(String provisionedProductName) {
        setProvisionedProductName(provisionedProductName);
        return this;
    }

    /**
     * <p>
     * The list of keys that the API should return with their values. If none are provided, the API will return all
     * outputs of the provisioned product.
     * </p>
     * 
     * @return The list of keys that the API should return with their values. If none are provided, the API will return
     *         all outputs of the provisioned product.
     */

    public java.util.List<String> getOutputKeys() {
        return outputKeys;
    }

    /**
     * <p>
     * The list of keys that the API should return with their values. If none are provided, the API will return all
     * outputs of the provisioned product.
     * </p>
     * 
     * @param outputKeys
     *        The list of keys that the API should return with their values. If none are provided, the API will return
     *        all outputs of the provisioned product.
     */

    public void setOutputKeys(java.util.Collection<String> outputKeys) {
        if (outputKeys == null) {
            this.outputKeys = null;
            return;
        }

        this.outputKeys = new java.util.ArrayList<String>(outputKeys);
    }

    /**
     * <p>
     * The list of keys that the API should return with their values. If none are provided, the API will return all
     * outputs of the provisioned product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputKeys(java.util.Collection)} or {@link #withOutputKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param outputKeys
     *        The list of keys that the API should return with their values. If none are provided, the API will return
     *        all outputs of the provisioned product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedProductOutputsRequest withOutputKeys(String... outputKeys) {
        if (this.outputKeys == null) {
            setOutputKeys(new java.util.ArrayList<String>(outputKeys.length));
        }
        for (String ele : outputKeys) {
            this.outputKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of keys that the API should return with their values. If none are provided, the API will return all
     * outputs of the provisioned product.
     * </p>
     * 
     * @param outputKeys
     *        The list of keys that the API should return with their values. If none are provided, the API will return
     *        all outputs of the provisioned product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedProductOutputsRequest withOutputKeys(java.util.Collection<String> outputKeys) {
        setOutputKeys(outputKeys);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to return with this call.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @return The maximum number of items to return with this call.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to return with this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedProductOutputsRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     * 
     * @param pageToken
     *        The page token for the next set of results. To retrieve the first set of results, use null.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     * 
     * @return The page token for the next set of results. To retrieve the first set of results, use null.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     * 
     * @param pageToken
     *        The page token for the next set of results. To retrieve the first set of results, use null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedProductOutputsRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: ").append(getProvisionedProductId()).append(",");
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: ").append(getProvisionedProductName()).append(",");
        if (getOutputKeys() != null)
            sb.append("OutputKeys: ").append(getOutputKeys()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProvisionedProductOutputsRequest == false)
            return false;
        GetProvisionedProductOutputsRequest other = (GetProvisionedProductOutputsRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getProvisionedProductId() == null ^ this.getProvisionedProductId() == null)
            return false;
        if (other.getProvisionedProductId() != null && other.getProvisionedProductId().equals(this.getProvisionedProductId()) == false)
            return false;
        if (other.getProvisionedProductName() == null ^ this.getProvisionedProductName() == null)
            return false;
        if (other.getProvisionedProductName() != null && other.getProvisionedProductName().equals(this.getProvisionedProductName()) == false)
            return false;
        if (other.getOutputKeys() == null ^ this.getOutputKeys() == null)
            return false;
        if (other.getOutputKeys() != null && other.getOutputKeys().equals(this.getOutputKeys()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductId() == null) ? 0 : getProvisionedProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductName() == null) ? 0 : getProvisionedProductName().hashCode());
        hashCode = prime * hashCode + ((getOutputKeys() == null) ? 0 : getOutputKeys().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetProvisionedProductOutputsRequest clone() {
        return (GetProvisionedProductOutputsRequest) super.clone();
    }

}
