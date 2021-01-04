/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model.ownership;

import java.io.Serializable;

/**
 * <p>The container element for an ownership control rule.</p>
 */
public class OwnershipControlsRule implements Serializable {

    private String objectOwnership;

    public String getOwnership() {
        return objectOwnership;
    }

    public void setOwnership(String objectOwnership) {
        this.objectOwnership = objectOwnership;
    }

    public void setOwnership(ObjectOwnership objectOwnership) {
        this.objectOwnership = objectOwnership.toString();
    }

    public OwnershipControlsRule withOwnership(String objectOwnership) {
        setOwnership(objectOwnership);
        return this;
    }

    public OwnershipControlsRule withOwnership(ObjectOwnership objectOwnership) {
        setOwnership(objectOwnership);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OwnershipControlsRule that = (OwnershipControlsRule) o;

        return objectOwnership != null ? objectOwnership.equals(that.objectOwnership) : that.objectOwnership == null;
    }

    @Override
    public int hashCode() {
        return objectOwnership != null ? objectOwnership.hashCode() : 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOwnership() != null) {
            sb.append("Ownership: ").append(getOwnership()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }
}
