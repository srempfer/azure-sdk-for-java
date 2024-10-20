// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration;
import org.junit.jupiter.api.Assertions;

public final class DaprComponentResiliencyPolicyHttpRetryPolicyConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration model = BinaryData.fromString(
            "{\"maxRetries\":5260255,\"retryBackOff\":{\"initialDelayInMilliseconds\":1999284303,\"maxIntervalInMilliseconds\":196507131}}")
            .toObject(DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration.class);
        Assertions.assertEquals(5260255, model.maxRetries());
        Assertions.assertEquals(1999284303, model.retryBackOff().initialDelayInMilliseconds());
        Assertions.assertEquals(196507131, model.retryBackOff().maxIntervalInMilliseconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration model
            = new DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration().withMaxRetries(5260255)
                .withRetryBackOff(new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()
                    .withInitialDelayInMilliseconds(1999284303)
                    .withMaxIntervalInMilliseconds(196507131));
        model = BinaryData.fromObject(model).toObject(DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration.class);
        Assertions.assertEquals(5260255, model.maxRetries());
        Assertions.assertEquals(1999284303, model.retryBackOff().initialDelayInMilliseconds());
        Assertions.assertEquals(196507131, model.retryBackOff().maxIntervalInMilliseconds());
    }
}
