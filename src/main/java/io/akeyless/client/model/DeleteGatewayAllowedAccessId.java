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
 * deleteGatewayAllowedAccessId is a command that deletes access-id
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class DeleteGatewayAllowedAccessId {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  @javax.annotation.Nonnull
  private String accessId;

  public static final String SERIALIZED_NAME_CLUSTER_NAME = "cluster-name";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NAME)
  @javax.annotation.Nonnull
  private String clusterName;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public DeleteGatewayAllowedAccessId() {
  }

  public DeleteGatewayAllowedAccessId accessId(@javax.annotation.Nonnull String accessId) {
    this.accessId = accessId;
    return this;
  }

  /**
   * The access id to be stripped of access to gateway
   * @return accessId
   */
  @javax.annotation.Nonnull
  public String getAccessId() {
    return accessId;
  }

  public void setAccessId(@javax.annotation.Nonnull String accessId) {
    this.accessId = accessId;
  }


  public DeleteGatewayAllowedAccessId clusterName(@javax.annotation.Nonnull String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * The name of the updated cluster, e.g. acc-abcd12345678/p-123456789012/defaultCluster
   * @return clusterName
   */
  @javax.annotation.Nonnull
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(@javax.annotation.Nonnull String clusterName) {
    this.clusterName = clusterName;
  }


  public DeleteGatewayAllowedAccessId json(@javax.annotation.Nullable Boolean json) {
    this.json = json;
    return this;
  }

  /**
   * Set output format to JSON
   * @return json
   */
  @javax.annotation.Nullable
  public Boolean getJson() {
    return json;
  }

  public void setJson(@javax.annotation.Nullable Boolean json) {
    this.json = json;
  }


  public DeleteGatewayAllowedAccessId token(@javax.annotation.Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
   */
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = token;
  }


  public DeleteGatewayAllowedAccessId uidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
    return this;
  }

  /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
   */
  @javax.annotation.Nullable
  public String getUidToken() {
    return uidToken;
  }

  public void setUidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteGatewayAllowedAccessId deleteGatewayAllowedAccessId = (DeleteGatewayAllowedAccessId) o;
    return Objects.equals(this.accessId, deleteGatewayAllowedAccessId.accessId) &&
        Objects.equals(this.clusterName, deleteGatewayAllowedAccessId.clusterName) &&
        Objects.equals(this.json, deleteGatewayAllowedAccessId.json) &&
        Objects.equals(this.token, deleteGatewayAllowedAccessId.token) &&
        Objects.equals(this.uidToken, deleteGatewayAllowedAccessId.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, clusterName, json, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteGatewayAllowedAccessId {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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
    openapiFields.add("access-id");
    openapiFields.add("cluster-name");
    openapiFields.add("json");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("access-id");
    openapiRequiredFields.add("cluster-name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeleteGatewayAllowedAccessId
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteGatewayAllowedAccessId.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteGatewayAllowedAccessId is not found in the empty JSON string", DeleteGatewayAllowedAccessId.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteGatewayAllowedAccessId.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteGatewayAllowedAccessId` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeleteGatewayAllowedAccessId.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("access-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access-id").toString()));
      }
      if (!jsonObj.get("cluster-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cluster-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cluster-name").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteGatewayAllowedAccessId.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteGatewayAllowedAccessId' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteGatewayAllowedAccessId> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteGatewayAllowedAccessId.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteGatewayAllowedAccessId>() {
           @Override
           public void write(JsonWriter out, DeleteGatewayAllowedAccessId value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteGatewayAllowedAccessId read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeleteGatewayAllowedAccessId given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteGatewayAllowedAccessId
   * @throws IOException if the JSON string is invalid with respect to DeleteGatewayAllowedAccessId
   */
  public static DeleteGatewayAllowedAccessId fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteGatewayAllowedAccessId.class);
  }

  /**
   * Convert an instance of DeleteGatewayAllowedAccessId to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

