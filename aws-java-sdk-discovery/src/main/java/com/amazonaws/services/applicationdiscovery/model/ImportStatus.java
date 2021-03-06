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
package com.amazonaws.services.applicationdiscovery.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ImportStatus {

    IMPORT_IN_PROGRESS("IMPORT_IN_PROGRESS"),
    IMPORT_COMPLETE("IMPORT_COMPLETE"),
    IMPORT_COMPLETE_WITH_ERRORS("IMPORT_COMPLETE_WITH_ERRORS"),
    IMPORT_FAILED("IMPORT_FAILED"),
    IMPORT_FAILED_SERVER_LIMIT_EXCEEDED("IMPORT_FAILED_SERVER_LIMIT_EXCEEDED"),
    IMPORT_FAILED_RECORD_LIMIT_EXCEEDED("IMPORT_FAILED_RECORD_LIMIT_EXCEEDED"),
    DELETE_IN_PROGRESS("DELETE_IN_PROGRESS"),
    DELETE_COMPLETE("DELETE_COMPLETE"),
    DELETE_FAILED("DELETE_FAILED"),
    DELETE_FAILED_LIMIT_EXCEEDED("DELETE_FAILED_LIMIT_EXCEEDED"),
    INTERNAL_ERROR("INTERNAL_ERROR");

    private String value;

    private ImportStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ImportStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ImportStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ImportStatus enumEntry : ImportStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
