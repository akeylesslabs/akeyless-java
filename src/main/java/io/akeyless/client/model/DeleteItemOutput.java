/*
 * Akeyless API
 * The purpose of this application is to provide access to Akeyless API.
 *
 * The version of the OpenAPI document: 2.0
 * Contact: support@akeyless.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.akeyless.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.akeyless.client.JSON;

/**
 * DeleteItemOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class DeleteItemOutput {
  public static final String SERIALIZED_NAME_DELETION_DATE = "deletion_date";
  @SerializedName(SERIALIZED_NAME_DELETION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime deletionDate;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  @javax.annotation.Nullable
  private Long itemId;

  public static final String SERIALIZED_NAME_ITEM_NAME = "item_name";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  @javax.annotation.Nullable
  private String itemName;

  public static final String SERIALIZED_NAME_VERSION_DELETED = "version_deleted";
  @SerializedName(SERIALIZED_NAME_VERSION_DELETED)
  @javax.annotation.Nullable
  private Integer versionDeleted;

  public DeleteItemOutput() {
  }

  public DeleteItemOutput deletionDate(@javax.annotation.Nullable OffsetDateTime deletionDate) {
    this.deletionDate = deletionDate;
    return this;
  }

  /**
   * Get deletionDate
   * @return deletionDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDeletionDate() {
    return deletionDate;
  }

  public void setDeletionDate(@javax.annotation.Nullable OffsetDateTime deletionDate) {
    this.deletionDate = deletionDate;
  }


  public DeleteItemOutput itemId(@javax.annotation.Nullable Long itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Get itemId
   * @return itemId
   */
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }

  public void setItemId(@javax.annotation.Nullable Long itemId) {
    this.itemId = itemId;
  }


  public DeleteItemOutput itemName(@javax.annotation.Nullable String itemName) {
    this.itemName = itemName;
    return this;
  }

  /**
   * Get itemName
   * @return itemName
   */
  @javax.annotation.Nullable
  public String getItemName() {
    return itemName;
  }

  public void setItemName(@javax.annotation.Nullable String itemName) {
    this.itemName = itemName;
  }


  public DeleteItemOutput versionDeleted(@javax.annotation.Nullable Integer versionDeleted) {
    this.versionDeleted = versionDeleted;
    return this;
  }

  /**
   * Get versionDeleted
   * @return versionDeleted
   */
  @javax.annotation.Nullable
  public Integer getVersionDeleted() {
    return versionDeleted;
  }

  public void setVersionDeleted(@javax.annotation.Nullable Integer versionDeleted) {
    this.versionDeleted = versionDeleted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteItemOutput deleteItemOutput = (DeleteItemOutput) o;
    return Objects.equals(this.deletionDate, deleteItemOutput.deletionDate) &&
        Objects.equals(this.itemId, deleteItemOutput.itemId) &&
        Objects.equals(this.itemName, deleteItemOutput.itemName) &&
        Objects.equals(this.versionDeleted, deleteItemOutput.versionDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletionDate, itemId, itemName, versionDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteItemOutput {\n");
    sb.append("    deletionDate: ").append(toIndentedString(deletionDate)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    versionDeleted: ").append(toIndentedString(versionDeleted)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("deletion_date");
    openapiFields.add("item_id");
    openapiFields.add("item_name");
    openapiFields.add("version_deleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeleteItemOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteItemOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteItemOutput is not found in the empty JSON string", DeleteItemOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteItemOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteItemOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("item_name") != null && !jsonObj.get("item_name").isJsonNull()) && !jsonObj.get("item_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteItemOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteItemOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteItemOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteItemOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteItemOutput>() {
           @Override
           public void write(JsonWriter out, DeleteItemOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteItemOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeleteItemOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteItemOutput
   * @throws IOException if the JSON string is invalid with respect to DeleteItemOutput
   */
  public static DeleteItemOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteItemOutput.class);
  }

  /**
   * Convert an instance of DeleteItemOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

