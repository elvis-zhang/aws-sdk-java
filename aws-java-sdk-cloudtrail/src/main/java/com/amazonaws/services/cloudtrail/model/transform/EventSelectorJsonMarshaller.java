/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudtrail.model.*;

import com.amazonaws.protocol.json.*;

/**
 * EventSelectorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventSelectorJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EventSelector eventSelector, StructuredJsonGenerator jsonGenerator) {

        if (eventSelector == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (eventSelector.getReadWriteType() != null) {
                jsonGenerator.writeFieldName("ReadWriteType").writeValue(eventSelector.getReadWriteType());
            }
            if (eventSelector.getIncludeManagementEvents() != null) {
                jsonGenerator.writeFieldName("IncludeManagementEvents").writeValue(eventSelector.getIncludeManagementEvents());
            }

            com.amazonaws.internal.SdkInternalList<DataResource> dataResourcesList = (com.amazonaws.internal.SdkInternalList<DataResource>) eventSelector
                    .getDataResources();
            if (!dataResourcesList.isEmpty() || !dataResourcesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("DataResources");
                jsonGenerator.writeStartArray();
                for (DataResource dataResourcesListValue : dataResourcesList) {
                    if (dataResourcesListValue != null) {

                        DataResourceJsonMarshaller.getInstance().marshall(dataResourcesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EventSelectorJsonMarshaller instance;

    public static EventSelectorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventSelectorJsonMarshaller();
        return instance;
    }

}
