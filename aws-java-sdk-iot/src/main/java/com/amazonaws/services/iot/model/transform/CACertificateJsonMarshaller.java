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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.json.*;

/**
 * CACertificateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CACertificateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CACertificate cACertificate, StructuredJsonGenerator jsonGenerator) {

        if (cACertificate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (cACertificate.getCertificateArn() != null) {
                jsonGenerator.writeFieldName("certificateArn").writeValue(cACertificate.getCertificateArn());
            }
            if (cACertificate.getCertificateId() != null) {
                jsonGenerator.writeFieldName("certificateId").writeValue(cACertificate.getCertificateId());
            }
            if (cACertificate.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(cACertificate.getStatus());
            }
            if (cACertificate.getCreationDate() != null) {
                jsonGenerator.writeFieldName("creationDate").writeValue(cACertificate.getCreationDate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CACertificateJsonMarshaller instance;

    public static CACertificateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CACertificateJsonMarshaller();
        return instance;
    }

}
