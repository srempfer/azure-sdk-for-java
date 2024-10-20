// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.ThreatIntelligenceInformationInner;
import org.junit.jupiter.api.Assertions;

public final class ThreatIntelligenceInformationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ThreatIntelligenceInformationInner model = BinaryData.fromString(
            "{\"kind\":\"ThreatIntelligenceInformation\",\"etag\":\"hillce\",\"id\":\"ehuwaoa\",\"name\":\"uhicqllizstacsjv\",\"type\":\"rweft\"}")
            .toObject(ThreatIntelligenceInformationInner.class);
        Assertions.assertEquals("hillce", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ThreatIntelligenceInformationInner model = new ThreatIntelligenceInformationInner().withEtag("hillce");
        model = BinaryData.fromObject(model).toObject(ThreatIntelligenceInformationInner.class);
        Assertions.assertEquals("hillce", model.etag());
    }
}
