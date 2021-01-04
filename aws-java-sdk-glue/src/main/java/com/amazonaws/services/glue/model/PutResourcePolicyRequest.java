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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the policy document to set, in JSON format.
     * </p>
     */
    private String policyInJson;
    /**
     * <p>
     * The ARN of the AWS Glue resource for the resource policy to be set. For more information about AWS Glue resource
     * ARNs, see the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id">AWS
     * Glue ARN string pattern</a>
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The hash value returned when the previous policy was set using <code>PutResourcePolicy</code>. Its purpose is to
     * prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has been set.
     * </p>
     */
    private String policyHashCondition;
    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used to
     * create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend on the
     * existence of a policy.
     * </p>
     */
    private String policyExistsCondition;
    /**
     * <p>
     * Allows you to specify if you want to use both resource-level and account/catalog-level resource policies. A
     * resource-level policy is a policy attached to an individual resource such as a database or a table.
     * </p>
     * <p>
     * The default value of <code>NO</code> indicates that resource-level policies cannot co-exist with an account-level
     * policy. A value of <code>YES</code> means the use of both resource-level and account/catalog-level resource
     * policies is allowed.
     * </p>
     */
    private String enableHybrid;

    /**
     * <p>
     * Contains the policy document to set, in JSON format.
     * </p>
     * 
     * @param policyInJson
     *        Contains the policy document to set, in JSON format.
     */

    public void setPolicyInJson(String policyInJson) {
        this.policyInJson = policyInJson;
    }

    /**
     * <p>
     * Contains the policy document to set, in JSON format.
     * </p>
     * 
     * @return Contains the policy document to set, in JSON format.
     */

    public String getPolicyInJson() {
        return this.policyInJson;
    }

    /**
     * <p>
     * Contains the policy document to set, in JSON format.
     * </p>
     * 
     * @param policyInJson
     *        Contains the policy document to set, in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicyInJson(String policyInJson) {
        setPolicyInJson(policyInJson);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Glue resource for the resource policy to be set. For more information about AWS Glue resource
     * ARNs, see the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id">AWS
     * Glue ARN string pattern</a>
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the AWS Glue resource for the resource policy to be set. For more information about AWS Glue
     *        resource ARNs, see the <a href=
     *        "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id"
     *        >AWS Glue ARN string pattern</a>
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the AWS Glue resource for the resource policy to be set. For more information about AWS Glue resource
     * ARNs, see the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id">AWS
     * Glue ARN string pattern</a>
     * </p>
     * 
     * @return The ARN of the AWS Glue resource for the resource policy to be set. For more information about AWS Glue
     *         resource ARNs, see the <a href=
     *         "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id"
     *         >AWS Glue ARN string pattern</a>
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the AWS Glue resource for the resource policy to be set. For more information about AWS Glue resource
     * ARNs, see the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id">AWS
     * Glue ARN string pattern</a>
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the AWS Glue resource for the resource policy to be set. For more information about AWS Glue
     *        resource ARNs, see the <a href=
     *        "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html#aws-glue-api-regex-aws-glue-arn-id"
     *        >AWS Glue ARN string pattern</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The hash value returned when the previous policy was set using <code>PutResourcePolicy</code>. Its purpose is to
     * prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has been set.
     * </p>
     * 
     * @param policyHashCondition
     *        The hash value returned when the previous policy was set using <code>PutResourcePolicy</code>. Its purpose
     *        is to prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has
     *        been set.
     */

    public void setPolicyHashCondition(String policyHashCondition) {
        this.policyHashCondition = policyHashCondition;
    }

    /**
     * <p>
     * The hash value returned when the previous policy was set using <code>PutResourcePolicy</code>. Its purpose is to
     * prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has been set.
     * </p>
     * 
     * @return The hash value returned when the previous policy was set using <code>PutResourcePolicy</code>. Its
     *         purpose is to prevent concurrent modifications of a policy. Do not use this parameter if no previous
     *         policy has been set.
     */

    public String getPolicyHashCondition() {
        return this.policyHashCondition;
    }

    /**
     * <p>
     * The hash value returned when the previous policy was set using <code>PutResourcePolicy</code>. Its purpose is to
     * prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has been set.
     * </p>
     * 
     * @param policyHashCondition
     *        The hash value returned when the previous policy was set using <code>PutResourcePolicy</code>. Its purpose
     *        is to prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has
     *        been set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicyHashCondition(String policyHashCondition) {
        setPolicyHashCondition(policyHashCondition);
        return this;
    }

    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used to
     * create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend on the
     * existence of a policy.
     * </p>
     * 
     * @param policyExistsCondition
     *        A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used
     *        to create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend
     *        on the existence of a policy.
     * @see ExistCondition
     */

    public void setPolicyExistsCondition(String policyExistsCondition) {
        this.policyExistsCondition = policyExistsCondition;
    }

    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used to
     * create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend on the
     * existence of a policy.
     * </p>
     * 
     * @return A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used
     *         to create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend
     *         on the existence of a policy.
     * @see ExistCondition
     */

    public String getPolicyExistsCondition() {
        return this.policyExistsCondition;
    }

    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used to
     * create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend on the
     * existence of a policy.
     * </p>
     * 
     * @param policyExistsCondition
     *        A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used
     *        to create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend
     *        on the existence of a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExistCondition
     */

    public PutResourcePolicyRequest withPolicyExistsCondition(String policyExistsCondition) {
        setPolicyExistsCondition(policyExistsCondition);
        return this;
    }

    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used to
     * create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend on the
     * existence of a policy.
     * </p>
     * 
     * @param policyExistsCondition
     *        A value of <code>MUST_EXIST</code> is used to update a policy. A value of <code>NOT_EXIST</code> is used
     *        to create a new policy. If a value of <code>NONE</code> or a null value is used, the call will not depend
     *        on the existence of a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExistCondition
     */

    public PutResourcePolicyRequest withPolicyExistsCondition(ExistCondition policyExistsCondition) {
        this.policyExistsCondition = policyExistsCondition.toString();
        return this;
    }

    /**
     * <p>
     * Allows you to specify if you want to use both resource-level and account/catalog-level resource policies. A
     * resource-level policy is a policy attached to an individual resource such as a database or a table.
     * </p>
     * <p>
     * The default value of <code>NO</code> indicates that resource-level policies cannot co-exist with an account-level
     * policy. A value of <code>YES</code> means the use of both resource-level and account/catalog-level resource
     * policies is allowed.
     * </p>
     * 
     * @param enableHybrid
     *        Allows you to specify if you want to use both resource-level and account/catalog-level resource policies.
     *        A resource-level policy is a policy attached to an individual resource such as a database or a table.</p>
     *        <p>
     *        The default value of <code>NO</code> indicates that resource-level policies cannot co-exist with an
     *        account-level policy. A value of <code>YES</code> means the use of both resource-level and
     *        account/catalog-level resource policies is allowed.
     * @see EnableHybridValues
     */

    public void setEnableHybrid(String enableHybrid) {
        this.enableHybrid = enableHybrid;
    }

    /**
     * <p>
     * Allows you to specify if you want to use both resource-level and account/catalog-level resource policies. A
     * resource-level policy is a policy attached to an individual resource such as a database or a table.
     * </p>
     * <p>
     * The default value of <code>NO</code> indicates that resource-level policies cannot co-exist with an account-level
     * policy. A value of <code>YES</code> means the use of both resource-level and account/catalog-level resource
     * policies is allowed.
     * </p>
     * 
     * @return Allows you to specify if you want to use both resource-level and account/catalog-level resource policies.
     *         A resource-level policy is a policy attached to an individual resource such as a database or a table.</p>
     *         <p>
     *         The default value of <code>NO</code> indicates that resource-level policies cannot co-exist with an
     *         account-level policy. A value of <code>YES</code> means the use of both resource-level and
     *         account/catalog-level resource policies is allowed.
     * @see EnableHybridValues
     */

    public String getEnableHybrid() {
        return this.enableHybrid;
    }

    /**
     * <p>
     * Allows you to specify if you want to use both resource-level and account/catalog-level resource policies. A
     * resource-level policy is a policy attached to an individual resource such as a database or a table.
     * </p>
     * <p>
     * The default value of <code>NO</code> indicates that resource-level policies cannot co-exist with an account-level
     * policy. A value of <code>YES</code> means the use of both resource-level and account/catalog-level resource
     * policies is allowed.
     * </p>
     * 
     * @param enableHybrid
     *        Allows you to specify if you want to use both resource-level and account/catalog-level resource policies.
     *        A resource-level policy is a policy attached to an individual resource such as a database or a table.</p>
     *        <p>
     *        The default value of <code>NO</code> indicates that resource-level policies cannot co-exist with an
     *        account-level policy. A value of <code>YES</code> means the use of both resource-level and
     *        account/catalog-level resource policies is allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnableHybridValues
     */

    public PutResourcePolicyRequest withEnableHybrid(String enableHybrid) {
        setEnableHybrid(enableHybrid);
        return this;
    }

    /**
     * <p>
     * Allows you to specify if you want to use both resource-level and account/catalog-level resource policies. A
     * resource-level policy is a policy attached to an individual resource such as a database or a table.
     * </p>
     * <p>
     * The default value of <code>NO</code> indicates that resource-level policies cannot co-exist with an account-level
     * policy. A value of <code>YES</code> means the use of both resource-level and account/catalog-level resource
     * policies is allowed.
     * </p>
     * 
     * @param enableHybrid
     *        Allows you to specify if you want to use both resource-level and account/catalog-level resource policies.
     *        A resource-level policy is a policy attached to an individual resource such as a database or a table.</p>
     *        <p>
     *        The default value of <code>NO</code> indicates that resource-level policies cannot co-exist with an
     *        account-level policy. A value of <code>YES</code> means the use of both resource-level and
     *        account/catalog-level resource policies is allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnableHybridValues
     */

    public PutResourcePolicyRequest withEnableHybrid(EnableHybridValues enableHybrid) {
        this.enableHybrid = enableHybrid.toString();
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
        if (getPolicyInJson() != null)
            sb.append("PolicyInJson: ").append(getPolicyInJson()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getPolicyHashCondition() != null)
            sb.append("PolicyHashCondition: ").append(getPolicyHashCondition()).append(",");
        if (getPolicyExistsCondition() != null)
            sb.append("PolicyExistsCondition: ").append(getPolicyExistsCondition()).append(",");
        if (getEnableHybrid() != null)
            sb.append("EnableHybrid: ").append(getEnableHybrid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyRequest == false)
            return false;
        PutResourcePolicyRequest other = (PutResourcePolicyRequest) obj;
        if (other.getPolicyInJson() == null ^ this.getPolicyInJson() == null)
            return false;
        if (other.getPolicyInJson() != null && other.getPolicyInJson().equals(this.getPolicyInJson()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPolicyHashCondition() == null ^ this.getPolicyHashCondition() == null)
            return false;
        if (other.getPolicyHashCondition() != null && other.getPolicyHashCondition().equals(this.getPolicyHashCondition()) == false)
            return false;
        if (other.getPolicyExistsCondition() == null ^ this.getPolicyExistsCondition() == null)
            return false;
        if (other.getPolicyExistsCondition() != null && other.getPolicyExistsCondition().equals(this.getPolicyExistsCondition()) == false)
            return false;
        if (other.getEnableHybrid() == null ^ this.getEnableHybrid() == null)
            return false;
        if (other.getEnableHybrid() != null && other.getEnableHybrid().equals(this.getEnableHybrid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyInJson() == null) ? 0 : getPolicyInJson().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPolicyHashCondition() == null) ? 0 : getPolicyHashCondition().hashCode());
        hashCode = prime * hashCode + ((getPolicyExistsCondition() == null) ? 0 : getPolicyExistsCondition().hashCode());
        hashCode = prime * hashCode + ((getEnableHybrid() == null) ? 0 : getEnableHybrid().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePolicyRequest clone() {
        return (PutResourcePolicyRequest) super.clone();
    }

}
