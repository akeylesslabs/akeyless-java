/*
 * Akeyless API
 * The purpose of this application is to provide access to Akeyless API.
 *
 * The version of the OpenAPI document: 3.0
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
import java.util.List;
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
 * AccessPermissionAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class AccessPermissionAssignment {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access_id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  @javax.annotation.Nullable
  private String accessId;

  public static final String SERIALIZED_NAME_ACCESS_TYPE = "access_type";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  @javax.annotation.Nullable
  private String accessType;

  public static final String SERIALIZED_NAME_SUB_CLAIMS = "sub_claims";
  @SerializedName(SERIALIZED_NAME_SUB_CLAIMS)
  @javax.annotation.Nullable
  private Map<String, List<String>> subClaims = new HashMap<>();

  public AccessPermissionAssignment() {
  }

  public AccessPermissionAssignment accessId(@javax.annotation.Nullable String accessId) {
    this.accessId = accessId;
    return this;
  }

  /**
   * Get accessId
   * @return accessId
   */
  @javax.annotation.Nullable
  public String getAccessId() {
    return accessId;
  }

  public void setAccessId(@javax.annotation.Nullable String accessId) {
    this.accessId = accessId;
  }


  public AccessPermissionAssignment accessType(@javax.annotation.Nullable String accessType) {
    this.accessType = accessType;
    return this;
  }

  /**
   * Get accessType
   * @return accessType
   */
  @javax.annotation.Nullable
  public String getAccessType() {
    return accessType;
  }

  public void setAccessType(@javax.annotation.Nullable String accessType) {
    this.accessType = accessType;
  }


  public AccessPermissionAssignment subClaims(@javax.annotation.Nullable Map<String, List<String>> subClaims) {
    this.subClaims = subClaims;
    return this;
  }

  public AccessPermissionAssignment putSubClaimsItem(String key, List<String> subClaimsItem) {
    if (this.subClaims == null) {
      this.subClaims = new HashMap<>();
    }
    this.subClaims.put(key, subClaimsItem);
    return this;
  }

  /**
   * Get subClaims
   * @return subClaims
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getSubClaims() {
    return subClaims;
  }

  public void setSubClaims(@javax.annotation.Nullable Map<String, List<String>> subClaims) {
    this.subClaims = subClaims;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessPermissionAssignment accessPermissionAssignment = (AccessPermissionAssignment) o;
    return Objects.equals(this.accessId, accessPermissionAssignment.accessId) &&
        Objects.equals(this.accessType, accessPermissionAssignment.accessType) &&
        Objects.equals(this.subClaims, accessPermissionAssignment.subClaims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, accessType, subClaims);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessPermissionAssignment {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    subClaims: ").append(toIndentedString(subClaims)).append("\n");
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
    openapiFields.add("access_id");
    openapiFields.add("access_type");
    openapiFields.add("sub_claims");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccessPermissionAssignment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessPermissionAssignment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessPermissionAssignment is not found in the empty JSON string", AccessPermissionAssignment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessPermissionAssignment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessPermissionAssignment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access_id") != null && !jsonObj.get("access_id").isJsonNull()) && !jsonObj.get("access_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_id").toString()));
      }
      if ((jsonObj.get("access_type") != null && !jsonObj.get("access_type").isJsonNull()) && !jsonObj.get("access_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessPermissionAssignment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessPermissionAssignment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessPermissionAssignment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessPermissionAssignment.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessPermissionAssignment>() {
           @Override
           public void write(JsonWriter out, AccessPermissionAssignment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessPermissionAssignment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccessPermissionAssignment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccessPermissionAssignment
   * @throws IOException if the JSON string is invalid with respect to AccessPermissionAssignment
   */
  public static AccessPermissionAssignment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessPermissionAssignment.class);
  }

  /**
   * Convert an instance of AccessPermissionAssignment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

