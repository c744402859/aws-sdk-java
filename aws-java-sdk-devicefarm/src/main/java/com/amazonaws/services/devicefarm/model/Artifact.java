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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of a test. Examples of artifacts include logs and screenshots.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/Artifact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Artifact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The artifact's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The artifact's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The artifact's type.
     * </p>
     * <p>
     * Allowed values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNKNOWN
     * </p>
     * </li>
     * <li>
     * <p>
     * SCREENSHOT
     * </p>
     * </li>
     * <li>
     * <p>
     * DEVICE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * MESSAGE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * RESULT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * WEBKIT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * EXERCISER_MONKEY_OUTPUT: the artifact (log) generated by an Android fuzz test.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_JSON_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_PRETTY_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_STANDARD_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_JAVA_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * AUTOMATION_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_SERVER_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * EXPLORER_EVENT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * EXPLORER_SUMMARY_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * APPLICATION_CRASH_REPORT
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOMER_ARTIFACT
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOMER_ARTIFACT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * TESTSPEC_OUTPUT
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The artifact's file extension.
     * </p>
     */
    private String extension;
    /**
     * <p>
     * The presigned Amazon S3 URL that can be used with a GET request to download the artifact's file.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The artifact's ARN.
     * </p>
     * 
     * @param arn
     *        The artifact's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The artifact's ARN.
     * </p>
     * 
     * @return The artifact's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The artifact's ARN.
     * </p>
     * 
     * @param arn
     *        The artifact's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artifact withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The artifact's name.
     * </p>
     * 
     * @param name
     *        The artifact's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The artifact's name.
     * </p>
     * 
     * @return The artifact's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The artifact's name.
     * </p>
     * 
     * @param name
     *        The artifact's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artifact withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The artifact's type.
     * </p>
     * <p>
     * Allowed values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNKNOWN
     * </p>
     * </li>
     * <li>
     * <p>
     * SCREENSHOT
     * </p>
     * </li>
     * <li>
     * <p>
     * DEVICE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * MESSAGE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * RESULT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * WEBKIT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * EXERCISER_MONKEY_OUTPUT: the artifact (log) generated by an Android fuzz test.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_JSON_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_PRETTY_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_STANDARD_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_JAVA_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * AUTOMATION_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_SERVER_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * EXPLORER_EVENT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * EXPLORER_SUMMARY_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * APPLICATION_CRASH_REPORT
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOMER_ARTIFACT
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOMER_ARTIFACT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * TESTSPEC_OUTPUT
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The artifact's type.</p>
     *        <p>
     *        Allowed values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        UNKNOWN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCREENSHOT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DEVICE_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MESSAGE_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VIDEO_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RESULT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SERVICE_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WEBKIT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXERCISER_MONKEY_OUTPUT: the artifact (log) generated by an Android fuzz test.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_JSON_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_PRETTY_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_STANDARD_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_JAVA_XML_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AUTOMATION_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_SERVER_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_XML_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_XML_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXPLORER_EVENT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXPLORER_SUMMARY_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPLICATION_CRASH_REPORT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VIDEO
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CUSTOMER_ARTIFACT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CUSTOMER_ARTIFACT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TESTSPEC_OUTPUT
     *        </p>
     *        </li>
     * @see ArtifactType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The artifact's type.
     * </p>
     * <p>
     * Allowed values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNKNOWN
     * </p>
     * </li>
     * <li>
     * <p>
     * SCREENSHOT
     * </p>
     * </li>
     * <li>
     * <p>
     * DEVICE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * MESSAGE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * RESULT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * WEBKIT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * EXERCISER_MONKEY_OUTPUT: the artifact (log) generated by an Android fuzz test.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_JSON_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_PRETTY_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_STANDARD_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_JAVA_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * AUTOMATION_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_SERVER_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * EXPLORER_EVENT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * EXPLORER_SUMMARY_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * APPLICATION_CRASH_REPORT
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOMER_ARTIFACT
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOMER_ARTIFACT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * TESTSPEC_OUTPUT
     * </p>
     * </li>
     * </ul>
     * 
     * @return The artifact's type.</p>
     *         <p>
     *         Allowed values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         UNKNOWN
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SCREENSHOT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DEVICE_LOG
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MESSAGE_LOG
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VIDEO_LOG
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RESULT_LOG
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SERVICE_LOG
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         WEBKIT_LOG
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTRUMENTATION_OUTPUT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EXERCISER_MONKEY_OUTPUT: the artifact (log) generated by an Android fuzz test.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CALABASH_JSON_OUTPUT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CALABASH_PRETTY_OUTPUT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CALABASH_STANDARD_OUTPUT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CALABASH_JAVA_XML_OUTPUT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AUTOMATION_OUTPUT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_SERVER_OUTPUT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_JAVA_OUTPUT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_JAVA_XML_OUTPUT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_PYTHON_OUTPUT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPIUM_PYTHON_XML_OUTPUT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EXPLORER_EVENT_LOG
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EXPLORER_SUMMARY_LOG
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         APPLICATION_CRASH_REPORT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         XCTEST_LOG
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VIDEO
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CUSTOMER_ARTIFACT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CUSTOMER_ARTIFACT_LOG
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TESTSPEC_OUTPUT
     *         </p>
     *         </li>
     * @see ArtifactType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The artifact's type.
     * </p>
     * <p>
     * Allowed values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNKNOWN
     * </p>
     * </li>
     * <li>
     * <p>
     * SCREENSHOT
     * </p>
     * </li>
     * <li>
     * <p>
     * DEVICE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * MESSAGE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * RESULT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * WEBKIT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * EXERCISER_MONKEY_OUTPUT: the artifact (log) generated by an Android fuzz test.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_JSON_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_PRETTY_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_STANDARD_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_JAVA_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * AUTOMATION_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_SERVER_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * EXPLORER_EVENT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * EXPLORER_SUMMARY_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * APPLICATION_CRASH_REPORT
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOMER_ARTIFACT
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOMER_ARTIFACT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * TESTSPEC_OUTPUT
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The artifact's type.</p>
     *        <p>
     *        Allowed values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        UNKNOWN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCREENSHOT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DEVICE_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MESSAGE_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VIDEO_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RESULT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SERVICE_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WEBKIT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXERCISER_MONKEY_OUTPUT: the artifact (log) generated by an Android fuzz test.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_JSON_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_PRETTY_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_STANDARD_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_JAVA_XML_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AUTOMATION_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_SERVER_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_XML_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_XML_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXPLORER_EVENT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXPLORER_SUMMARY_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPLICATION_CRASH_REPORT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VIDEO
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CUSTOMER_ARTIFACT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CUSTOMER_ARTIFACT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TESTSPEC_OUTPUT
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactType
     */

    public Artifact withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The artifact's type.
     * </p>
     * <p>
     * Allowed values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNKNOWN
     * </p>
     * </li>
     * <li>
     * <p>
     * SCREENSHOT
     * </p>
     * </li>
     * <li>
     * <p>
     * DEVICE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * MESSAGE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * RESULT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * WEBKIT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * EXERCISER_MONKEY_OUTPUT: the artifact (log) generated by an Android fuzz test.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_JSON_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_PRETTY_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_STANDARD_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_JAVA_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * AUTOMATION_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_SERVER_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * EXPLORER_EVENT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * EXPLORER_SUMMARY_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * APPLICATION_CRASH_REPORT
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOMER_ARTIFACT
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOMER_ARTIFACT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * TESTSPEC_OUTPUT
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The artifact's type.</p>
     *        <p>
     *        Allowed values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        UNKNOWN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCREENSHOT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DEVICE_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MESSAGE_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VIDEO_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RESULT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SERVICE_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WEBKIT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXERCISER_MONKEY_OUTPUT: the artifact (log) generated by an Android fuzz test.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_JSON_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_PRETTY_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_STANDARD_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_JAVA_XML_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AUTOMATION_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_SERVER_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_XML_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_XML_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXPLORER_EVENT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXPLORER_SUMMARY_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPLICATION_CRASH_REPORT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VIDEO
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CUSTOMER_ARTIFACT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CUSTOMER_ARTIFACT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TESTSPEC_OUTPUT
     *        </p>
     *        </li>
     * @see ArtifactType
     */

    public void setType(ArtifactType type) {
        withType(type);
    }

    /**
     * <p>
     * The artifact's type.
     * </p>
     * <p>
     * Allowed values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNKNOWN
     * </p>
     * </li>
     * <li>
     * <p>
     * SCREENSHOT
     * </p>
     * </li>
     * <li>
     * <p>
     * DEVICE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * MESSAGE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * RESULT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * WEBKIT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTRUMENTATION_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * EXERCISER_MONKEY_OUTPUT: the artifact (log) generated by an Android fuzz test.
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_JSON_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_PRETTY_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_STANDARD_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * CALABASH_JAVA_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * AUTOMATION_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_SERVER_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_JAVA_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * APPIUM_PYTHON_XML_OUTPUT
     * </p>
     * </li>
     * <li>
     * <p>
     * EXPLORER_EVENT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * EXPLORER_SUMMARY_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * APPLICATION_CRASH_REPORT
     * </p>
     * </li>
     * <li>
     * <p>
     * XCTEST_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOMER_ARTIFACT
     * </p>
     * </li>
     * <li>
     * <p>
     * CUSTOMER_ARTIFACT_LOG
     * </p>
     * </li>
     * <li>
     * <p>
     * TESTSPEC_OUTPUT
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The artifact's type.</p>
     *        <p>
     *        Allowed values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        UNKNOWN
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCREENSHOT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DEVICE_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MESSAGE_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VIDEO_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RESULT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SERVICE_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WEBKIT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTRUMENTATION_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXERCISER_MONKEY_OUTPUT: the artifact (log) generated by an Android fuzz test.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_JSON_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_PRETTY_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_STANDARD_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CALABASH_JAVA_XML_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AUTOMATION_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_SERVER_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_JAVA_XML_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPIUM_PYTHON_XML_OUTPUT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXPLORER_EVENT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EXPLORER_SUMMARY_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        APPLICATION_CRASH_REPORT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        XCTEST_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VIDEO
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CUSTOMER_ARTIFACT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CUSTOMER_ARTIFACT_LOG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TESTSPEC_OUTPUT
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactType
     */

    public Artifact withType(ArtifactType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The artifact's file extension.
     * </p>
     * 
     * @param extension
     *        The artifact's file extension.
     */

    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * <p>
     * The artifact's file extension.
     * </p>
     * 
     * @return The artifact's file extension.
     */

    public String getExtension() {
        return this.extension;
    }

    /**
     * <p>
     * The artifact's file extension.
     * </p>
     * 
     * @param extension
     *        The artifact's file extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artifact withExtension(String extension) {
        setExtension(extension);
        return this;
    }

    /**
     * <p>
     * The presigned Amazon S3 URL that can be used with a GET request to download the artifact's file.
     * </p>
     * 
     * @param url
     *        The presigned Amazon S3 URL that can be used with a GET request to download the artifact's file.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The presigned Amazon S3 URL that can be used with a GET request to download the artifact's file.
     * </p>
     * 
     * @return The presigned Amazon S3 URL that can be used with a GET request to download the artifact's file.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The presigned Amazon S3 URL that can be used with a GET request to download the artifact's file.
     * </p>
     * 
     * @param url
     *        The presigned Amazon S3 URL that can be used with a GET request to download the artifact's file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artifact withUrl(String url) {
        setUrl(url);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getExtension() != null)
            sb.append("Extension: ").append(getExtension()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Artifact == false)
            return false;
        Artifact other = (Artifact) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getExtension() == null ^ this.getExtension() == null)
            return false;
        if (other.getExtension() != null && other.getExtension().equals(this.getExtension()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getExtension() == null) ? 0 : getExtension().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public Artifact clone() {
        try {
            return (Artifact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.ArtifactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
