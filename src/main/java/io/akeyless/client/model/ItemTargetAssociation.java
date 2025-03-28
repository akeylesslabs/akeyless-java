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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * and a target.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ItemTargetAssociation {
  public static final String SERIALIZED_NAME_ASSOC_ID = "assoc_id";
  @SerializedName(SERIALIZED_NAME_ASSOC_ID)
  @javax.annotation.Nullable
  private String assocId;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  @javax.annotation.Nullable
  private Map<String, String> attributes = new HashMap<>();

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  @javax.annotation.Nullable
  private Long targetId;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target_name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  @javax.annotation.Nullable
  private String targetName;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  @javax.annotation.Nullable
  private String targetType;

  public ItemTargetAssociation() {
  }

  public ItemTargetAssociation assocId(@javax.annotation.Nullable String assocId) {
    this.assocId = assocId;
    return this;
  }

  /**
   * Get assocId
   * @return assocId
   */
  @javax.annotation.Nullable
  public String getAssocId() {
    return assocId;
  }

  public void setAssocId(@javax.annotation.Nullable String assocId) {
    this.assocId = assocId;
  }


  public ItemTargetAssociation attributes(@javax.annotation.Nullable Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ItemTargetAssociation putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @javax.annotation.Nullable
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(@javax.annotation.Nullable Map<String, String> attributes) {
    this.attributes = attributes;
  }


  public ItemTargetAssociation targetId(@javax.annotation.Nullable Long targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * Get targetId
   * @return targetId
   */
  @javax.annotation.Nullable
  public Long getTargetId() {
    return targetId;
  }

  public void setTargetId(@javax.annotation.Nullable Long targetId) {
    this.targetId = targetId;
  }


  public ItemTargetAssociation targetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
    return this;
  }

  /**
   * Get targetName
   * @return targetName
   */
  @javax.annotation.Nullable
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
  }


  public ItemTargetAssociation targetType(@javax.annotation.Nullable String targetType) {
    this.targetType = targetType;
    return this;
  }

  /**
   * Get targetType
   * @return targetType
   */
  @javax.annotation.Nullable
  public String getTargetType() {
    return targetType;
  }

  public void setTargetType(@javax.annotation.Nullable String targetType) {
    this.targetType = targetType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemTargetAssociation itemTargetAssociation = (ItemTargetAssociation) o;
    return Objects.equals(this.assocId, itemTargetAssociation.assocId) &&
        Objects.equals(this.attributes, itemTargetAssociation.attributes) &&
        Objects.equals(this.targetId, itemTargetAssociation.targetId) &&
        Objects.equals(this.targetName, itemTargetAssociation.targetName) &&
        Objects.equals(this.targetType, itemTargetAssociation.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assocId, attributes, targetId, targetName, targetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemTargetAssociation {\n");
    sb.append("    assocId: ").append(toIndentedString(assocId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
    openapiFields.add("assoc_id");
    openapiFields.add("attributes");
    openapiFields.add("target_id");
    openapiFields.add("target_name");
    openapiFields.add("target_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ItemTargetAssociation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ItemTargetAssociation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemTargetAssociation is not found in the empty JSON string", ItemTargetAssociation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ItemTargetAssociation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemTargetAssociation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("assoc_id") != null && !jsonObj.get("assoc_id").isJsonNull()) && !jsonObj.get("assoc_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assoc_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assoc_id").toString()));
      }
      if ((jsonObj.get("target_name") != null && !jsonObj.get("target_name").isJsonNull()) && !jsonObj.get("target_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_name").toString()));
      }
      if ((jsonObj.get("target_type") != null && !jsonObj.get("target_type").isJsonNull()) && !jsonObj.get("target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemTargetAssociation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemTargetAssociation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemTargetAssociation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemTargetAssociation.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemTargetAssociation>() {
           @Override
           public void write(JsonWriter out, ItemTargetAssociation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemTargetAssociation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ItemTargetAssociation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ItemTargetAssociation
   * @throws IOException if the JSON string is invalid with respect to ItemTargetAssociation
   */
  public static ItemTargetAssociation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemTargetAssociation.class);
  }

  /**
   * Convert an instance of ItemTargetAssociation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

