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
package com.amazonaws.services.dynamodbv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ShardMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShardJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Shard shard, StructuredJsonGenerator jsonGenerator) {

        if (shard == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (shard.getShardId() != null) {
                jsonGenerator.writeFieldName("ShardId").writeValue(shard.getShardId());
            }
            if (shard.getSequenceNumberRange() != null) {
                jsonGenerator.writeFieldName("SequenceNumberRange");
                SequenceNumberRangeJsonMarshaller.getInstance().marshall(shard.getSequenceNumberRange(), jsonGenerator);
            }
            if (shard.getParentShardId() != null) {
                jsonGenerator.writeFieldName("ParentShardId").writeValue(shard.getParentShardId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ShardJsonMarshaller instance;

    public static ShardJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ShardJsonMarshaller();
        return instance;
    }

}
