// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/**
 * Log analytics workspace id and primary key.
 */
@Fluent
public final class LogAnalyticsWorkspaceConfig implements JsonSerializable<LogAnalyticsWorkspaceConfig> {
    /*
     * Azure Log Analytics workspace ID
     */
    private UUID workspaceId;

    /*
     * Primary key of the workspace
     */
    private String primaryKey;

    /**
     * Creates an instance of LogAnalyticsWorkspaceConfig class.
     */
    public LogAnalyticsWorkspaceConfig() {
    }

    /**
     * Get the workspaceId property: Azure Log Analytics workspace ID.
     * 
     * @return the workspaceId value.
     */
    public UUID workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: Azure Log Analytics workspace ID.
     * 
     * @param workspaceId the workspaceId value to set.
     * @return the LogAnalyticsWorkspaceConfig object itself.
     */
    public LogAnalyticsWorkspaceConfig withWorkspaceId(UUID workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the primaryKey property: Primary key of the workspace.
     * 
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey property: Primary key of the workspace.
     * 
     * @param primaryKey the primaryKey value to set.
     * @return the LogAnalyticsWorkspaceConfig object itself.
     */
    public LogAnalyticsWorkspaceConfig withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("workspaceId", Objects.toString(this.workspaceId, null));
        jsonWriter.writeStringField("primaryKey", this.primaryKey);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LogAnalyticsWorkspaceConfig from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LogAnalyticsWorkspaceConfig if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LogAnalyticsWorkspaceConfig.
     */
    public static LogAnalyticsWorkspaceConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LogAnalyticsWorkspaceConfig deserializedLogAnalyticsWorkspaceConfig = new LogAnalyticsWorkspaceConfig();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("workspaceId".equals(fieldName)) {
                    deserializedLogAnalyticsWorkspaceConfig.workspaceId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("primaryKey".equals(fieldName)) {
                    deserializedLogAnalyticsWorkspaceConfig.primaryKey = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogAnalyticsWorkspaceConfig;
        });
    }
}
