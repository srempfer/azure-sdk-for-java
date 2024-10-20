// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.Diagnostics;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class JobsGetDetectorWithResponseMockTests {
    @Test
    public void testGetDetectorWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"metadata\":{\"id\":\"lbkl\",\"name\":\"mnnkkwayqshw\",\"description\":\"xrid\",\"author\":\"bsaqjm\",\"category\":\"xqwqueu\",\"supportTopicList\":[{\"id\":\"tpziizevjy\",\"pesId\":\"fvezefk\"},{\"id\":\"qt\",\"pesId\":\"lepjjzkcasf\"},{\"id\":\"c\",\"pesId\":\"o\"},{\"id\":\"fjwajnrt\",\"pesId\":\"vaqkifmxawost\"}],\"analysisTypes\":[\"nhrkmjqncfvdsc\",\"hemvwfnqqwypvnd\",\"wbgodtggrssg\"],\"type\":\"fk\",\"score\":12.798208},\"dataset\":[{\"table\":{\"tableName\":\"mvecvztscbgmusai\",\"columns\":[{},{}],\"rows\":[\"datankzzohnrddclz\"]},\"renderingProperties\":{\"type\":1312159373,\"title\":\"ehlbzqixbnjrqvzy\",\"description\":\"xozony\",\"isVisible\":true}},{\"table\":{\"tableName\":\"udpabcreuwzos\",\"columns\":[{},{}],\"rows\":[\"datacvasormrexzvdu\"]},\"renderingProperties\":{\"type\":842951636,\"title\":\"ygbadu\",\"description\":\"covsdqhzrtd\",\"isVisible\":false}}],\"status\":{\"message\":\"imzfvpp\",\"statusId\":414377585},\"dataProviderMetadata\":{\"providerName\":\"fjmclngygnhrkomb\",\"propertyBag\":[{\"name\":\"jdopggorwjo\",\"value\":\"rotpvclpof\"},{\"name\":\"lmwkptskwxjg\",\"value\":\"xccb\"},{\"name\":\"akmkookbput\",\"value\":\"vmuyak\"},{\"name\":\"wk\",\"value\":\"ow\"}]}},\"id\":\"royrdurxf\",\"name\":\"zqjim\",\"type\":\"jtgzj\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerAppsApiManager manager = ContainerAppsApiManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Diagnostics response = manager.jobs()
            .getDetectorWithResponse("cjdk", "otcsu", "mzoonsvobchkxfpw", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("nhrkmjqncfvdsc", response.properties().metadata().analysisTypes().get(0));
        Assertions.assertEquals("mvecvztscbgmusai", response.properties().dataset().get(0).table().tableName());
        Assertions.assertEquals(1312159373, response.properties().dataset().get(0).renderingProperties().type());
        Assertions.assertEquals("ehlbzqixbnjrqvzy",
            response.properties().dataset().get(0).renderingProperties().title());
        Assertions.assertEquals("xozony", response.properties().dataset().get(0).renderingProperties().description());
        Assertions.assertEquals(true, response.properties().dataset().get(0).renderingProperties().isVisible());
        Assertions.assertEquals("imzfvpp", response.properties().status().message());
        Assertions.assertEquals(414377585, response.properties().status().statusId());
        Assertions.assertEquals("fjmclngygnhrkomb", response.properties().dataProviderMetadata().providerName());
        Assertions.assertEquals("jdopggorwjo",
            response.properties().dataProviderMetadata().propertyBag().get(0).name());
        Assertions.assertEquals("rotpvclpof",
            response.properties().dataProviderMetadata().propertyBag().get(0).value());
    }
}
