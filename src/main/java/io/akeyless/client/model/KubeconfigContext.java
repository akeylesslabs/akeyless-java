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
 * KubeconfigContext
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class KubeconfigContext {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  @javax.annotation.Nullable
  private String cluster;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  @javax.annotation.Nullable
  private String namespace;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  @javax.annotation.Nullable
  private String user;

  public KubeconfigContext() {
  }

  public KubeconfigContext cluster(@javax.annotation.Nullable String cluster) {
    this.cluster = cluster;
    return this;
  }

  /**
   * Get cluster
   * @return cluster
   */
  @javax.annotation.Nullable
  public String getCluster() {
    return cluster;
  }

  public void setCluster(@javax.annotation.Nullable String cluster) {
    this.cluster = cluster;
  }


  public KubeconfigContext namespace(@javax.annotation.Nullable String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
   */
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(@javax.annotation.Nullable String namespace) {
    this.namespace = namespace;
  }


  public KubeconfigContext user(@javax.annotation.Nullable String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nullable
  public String getUser() {
    return user;
  }

  public void setUser(@javax.annotation.Nullable String user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubeconfigContext kubeconfigContext = (KubeconfigContext) o;
    return Objects.equals(this.cluster, kubeconfigContext.cluster) &&
        Objects.equals(this.namespace, kubeconfigContext.namespace) &&
        Objects.equals(this.user, kubeconfigContext.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, namespace, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubeconfigContext {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("cluster");
    openapiFields.add("namespace");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KubeconfigContext
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KubeconfigContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KubeconfigContext is not found in the empty JSON string", KubeconfigContext.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!KubeconfigContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KubeconfigContext` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cluster") != null && !jsonObj.get("cluster").isJsonNull()) && !jsonObj.get("cluster").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cluster` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cluster").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KubeconfigContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KubeconfigContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KubeconfigContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KubeconfigContext.class));

       return (TypeAdapter<T>) new TypeAdapter<KubeconfigContext>() {
           @Override
           public void write(JsonWriter out, KubeconfigContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KubeconfigContext read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of KubeconfigContext given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of KubeconfigContext
   * @throws IOException if the JSON string is invalid with respect to KubeconfigContext
   */
  public static KubeconfigContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KubeconfigContext.class);
  }

  /**
   * Convert an instance of KubeconfigContext to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

