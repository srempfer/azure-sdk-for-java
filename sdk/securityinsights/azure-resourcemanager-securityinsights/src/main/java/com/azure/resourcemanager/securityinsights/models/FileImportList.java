// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.securityinsights.fluent.models.FileImportInner;
import java.io.IOException;
import java.util.List;

/**
 * List all the file imports.
 */
@Fluent
public final class FileImportList implements JsonSerializable<FileImportList> {
    /*
     * URL to fetch the next set of file imports.
     */
    private String nextLink;

    /*
     * Array of file imports.
     */
    private List<FileImportInner> value;

    /**
     * Creates an instance of FileImportList class.
     */
    public FileImportList() {
    }

    /**
     * Get the nextLink property: URL to fetch the next set of file imports.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: Array of file imports.
     * 
     * @return the value value.
     */
    public List<FileImportInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of file imports.
     * 
     * @param value the value value to set.
     * @return the FileImportList object itself.
     */
    public FileImportList withValue(List<FileImportInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model FileImportList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FileImportList.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FileImportList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FileImportList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FileImportList.
     */
    public static FileImportList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FileImportList deserializedFileImportList = new FileImportList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<FileImportInner> value = reader.readArray(reader1 -> FileImportInner.fromJson(reader1));
                    deserializedFileImportList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedFileImportList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFileImportList;
        });
    }
}
