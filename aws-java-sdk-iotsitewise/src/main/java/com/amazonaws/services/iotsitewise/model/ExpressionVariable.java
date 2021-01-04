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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains expression variable information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ExpressionVariable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExpressionVariable implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The friendly name of the variable to be used in the expression.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The variable that identifies an asset property from which to use values.
     * </p>
     */
    private VariableValue value;

    /**
     * <p>
     * The friendly name of the variable to be used in the expression.
     * </p>
     * 
     * @param name
     *        The friendly name of the variable to be used in the expression.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the variable to be used in the expression.
     * </p>
     * 
     * @return The friendly name of the variable to be used in the expression.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the variable to be used in the expression.
     * </p>
     * 
     * @param name
     *        The friendly name of the variable to be used in the expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpressionVariable withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The variable that identifies an asset property from which to use values.
     * </p>
     * 
     * @param value
     *        The variable that identifies an asset property from which to use values.
     */

    public void setValue(VariableValue value) {
        this.value = value;
    }

    /**
     * <p>
     * The variable that identifies an asset property from which to use values.
     * </p>
     * 
     * @return The variable that identifies an asset property from which to use values.
     */

    public VariableValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * The variable that identifies an asset property from which to use values.
     * </p>
     * 
     * @param value
     *        The variable that identifies an asset property from which to use values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpressionVariable withValue(VariableValue value) {
        setValue(value);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpressionVariable == false)
            return false;
        ExpressionVariable other = (ExpressionVariable) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ExpressionVariable clone() {
        try {
            return (ExpressionVariable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.ExpressionVariableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
