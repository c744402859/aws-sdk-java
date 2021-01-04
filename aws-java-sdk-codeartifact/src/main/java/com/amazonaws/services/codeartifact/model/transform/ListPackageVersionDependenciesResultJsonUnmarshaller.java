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
package com.amazonaws.services.codeartifact.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codeartifact.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListPackageVersionDependenciesResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPackageVersionDependenciesResultJsonUnmarshaller implements Unmarshaller<ListPackageVersionDependenciesResult, JsonUnmarshallerContext> {

    public ListPackageVersionDependenciesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListPackageVersionDependenciesResult listPackageVersionDependenciesResult = new ListPackageVersionDependenciesResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listPackageVersionDependenciesResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("format", targetDepth)) {
                    context.nextToken();
                    listPackageVersionDependenciesResult.setFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("namespace", targetDepth)) {
                    context.nextToken();
                    listPackageVersionDependenciesResult.setNamespace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("package", targetDepth)) {
                    context.nextToken();
                    listPackageVersionDependenciesResult.setPackage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    listPackageVersionDependenciesResult.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("versionRevision", targetDepth)) {
                    context.nextToken();
                    listPackageVersionDependenciesResult.setVersionRevision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nextToken", targetDepth)) {
                    context.nextToken();
                    listPackageVersionDependenciesResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dependencies", targetDepth)) {
                    context.nextToken();
                    listPackageVersionDependenciesResult.setDependencies(new ListUnmarshaller<PackageDependency>(PackageDependencyJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listPackageVersionDependenciesResult;
    }

    private static ListPackageVersionDependenciesResultJsonUnmarshaller instance;

    public static ListPackageVersionDependenciesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListPackageVersionDependenciesResultJsonUnmarshaller();
        return instance;
    }
}
