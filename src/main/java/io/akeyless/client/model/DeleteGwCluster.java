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
 * DeleteGwCluster
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class DeleteGwCluster {
  public static final String SERIALIZED_NAME_CLUSTER_NAME = "cluster-name";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NAME)
  @javax.annotation.Nonnull
  private String clusterName;

  public static final String SERIALIZED_NAME_FORCE_DELETION = "force-deletion";
  @SerializedName(SERIALIZED_NAME_FORCE_DELETION)
  @javax.annotation.Nullable
  private Boolean forceDeletion;

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

  public DeleteGwCluster() {
  }

  public DeleteGwCluster clusterName(@javax.annotation.Nonnull String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * Gateway Cluster, e.g. acc-abcd12345678/p-123456789012/defaultCluster
   * @return clusterName
   */
  @javax.annotation.Nonnull
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(@javax.annotation.Nonnull String clusterName) {
    this.clusterName = clusterName;
  }


  public DeleteGwCluster forceDeletion(@javax.annotation.Nullable Boolean forceDeletion) {
    this.forceDeletion = forceDeletion;
    return this;
  }

  /**
   * Enforce deletion
   * @return forceDeletion
   */
  @javax.annotation.Nullable
  public Boolean getForceDeletion() {
    return forceDeletion;
  }

  public void setForceDeletion(@javax.annotation.Nullable Boolean forceDeletion) {
    this.forceDeletion = forceDeletion;
  }


  public DeleteGwCluster json(@javax.annotation.Nullable Boolean json) {
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


  public DeleteGwCluster token(@javax.annotation.Nullable String token) {
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


  public DeleteGwCluster uidToken(@javax.annotation.Nullable String uidToken) {
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
    DeleteGwCluster deleteGwCluster = (DeleteGwCluster) o;
    return Objects.equals(this.clusterName, deleteGwCluster.clusterName) &&
        Objects.equals(this.forceDeletion, deleteGwCluster.forceDeletion) &&
        Objects.equals(this.json, deleteGwCluster.json) &&
        Objects.equals(this.token, deleteGwCluster.token) &&
        Objects.equals(this.uidToken, deleteGwCluster.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, forceDeletion, json, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteGwCluster {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    forceDeletion: ").append(toIndentedString(forceDeletion)).append("\n");
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
    openapiFields.add("cluster-name");
    openapiFields.add("force-deletion");
    openapiFields.add("json");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cluster-name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeleteGwCluster
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteGwCluster.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteGwCluster is not found in the empty JSON string", DeleteGwCluster.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteGwCluster.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteGwCluster` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeleteGwCluster.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
       if (!DeleteGwCluster.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteGwCluster' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteGwCluster> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteGwCluster.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteGwCluster>() {
           @Override
           public void write(JsonWriter out, DeleteGwCluster value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteGwCluster read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeleteGwCluster given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteGwCluster
   * @throws IOException if the JSON string is invalid with respect to DeleteGwCluster
   */
  public static DeleteGwCluster fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteGwCluster.class);
  }

  /**
   * Convert an instance of DeleteGwCluster to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

