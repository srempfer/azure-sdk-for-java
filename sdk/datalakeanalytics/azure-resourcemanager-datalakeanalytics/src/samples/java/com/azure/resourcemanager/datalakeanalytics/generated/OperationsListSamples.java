// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/datalake-analytics/resource-manager/Microsoft.DataLakeAnalytics/stable/2016-11-01/examples/
     * Operations_List.json
     */
    /**
     * Sample code: Lists all of the available Data Lake Analytics REST API operations.
     * 
     * @param manager Entry point to DataLakeAnalyticsManager.
     */
    public static void listsAllOfTheAvailableDataLakeAnalyticsRESTAPIOperations(
        com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager) {
        manager.operations().listWithResponse(com.azure.core.util.Context.NONE);
    }
}
