// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.fluent.models.DscCompilationJobCreateProperties;
import com.azure.resourcemanager.automation.models.DscConfigurationAssociationProperty;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DscCompilationJobCreatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DscCompilationJobCreateProperties model = BinaryData.fromString(
            "{\"configuration\":{\"name\":\"pvecxgodeb\"},\"parameters\":{\"ukgri\":\"krbm\"},\"incrementNodeConfigurationBuild\":true}")
            .toObject(DscCompilationJobCreateProperties.class);
        Assertions.assertEquals("pvecxgodeb", model.configuration().name());
        Assertions.assertEquals("krbm", model.parameters().get("ukgri"));
        Assertions.assertEquals(true, model.incrementNodeConfigurationBuild());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DscCompilationJobCreateProperties model = new DscCompilationJobCreateProperties()
            .withConfiguration(new DscConfigurationAssociationProperty().withName("pvecxgodeb"))
            .withParameters(mapOf("ukgri", "krbm"))
            .withIncrementNodeConfigurationBuild(true);
        model = BinaryData.fromObject(model).toObject(DscCompilationJobCreateProperties.class);
        Assertions.assertEquals("pvecxgodeb", model.configuration().name());
        Assertions.assertEquals("krbm", model.parameters().get("ukgri"));
        Assertions.assertEquals(true, model.incrementNodeConfigurationBuild());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
