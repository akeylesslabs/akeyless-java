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
import io.akeyless.client.model.K8SAuth;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * K8SAuthsConfigPart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class K8SAuthsConfigPart {
  public static final String SERIALIZED_NAME_K8S_AUTHS = "k8s_auths";
  @SerializedName(SERIALIZED_NAME_K8S_AUTHS)
  @javax.annotation.Nullable
  private List<K8SAuth> k8sAuths = new ArrayList<>();

  public K8SAuthsConfigPart() {
  }

  public K8SAuthsConfigPart k8sAuths(@javax.annotation.Nullable List<K8SAuth> k8sAuths) {
    this.k8sAuths = k8sAuths;
    return this;
  }

  public K8SAuthsConfigPart addK8sAuthsItem(K8SAuth k8sAuthsItem) {
    if (this.k8sAuths == null) {
      this.k8sAuths = new ArrayList<>();
    }
    this.k8sAuths.add(k8sAuthsItem);
    return this;
  }

  /**
   * Get k8sAuths
   * @return k8sAuths
   */
  @javax.annotation.Nullable
  public List<K8SAuth> getK8sAuths() {
    return k8sAuths;
  }

  public void setK8sAuths(@javax.annotation.Nullable List<K8SAuth> k8sAuths) {
    this.k8sAuths = k8sAuths;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    K8SAuthsConfigPart k8SAuthsConfigPart = (K8SAuthsConfigPart) o;
    return Objects.equals(this.k8sAuths, k8SAuthsConfigPart.k8sAuths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(k8sAuths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class K8SAuthsConfigPart {\n");
    sb.append("    k8sAuths: ").append(toIndentedString(k8sAuths)).append("\n");
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
    openapiFields.add("k8s_auths");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to K8SAuthsConfigPart
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!K8SAuthsConfigPart.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in K8SAuthsConfigPart is not found in the empty JSON string", K8SAuthsConfigPart.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!K8SAuthsConfigPart.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `K8SAuthsConfigPart` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("k8s_auths") != null && !jsonObj.get("k8s_auths").isJsonNull()) {
        JsonArray jsonArrayk8sAuths = jsonObj.getAsJsonArray("k8s_auths");
        if (jsonArrayk8sAuths != null) {
          // ensure the json data is an array
          if (!jsonObj.get("k8s_auths").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `k8s_auths` to be an array in the JSON string but got `%s`", jsonObj.get("k8s_auths").toString()));
          }

          // validate the optional field `k8s_auths` (array)
          for (int i = 0; i < jsonArrayk8sAuths.size(); i++) {
            K8SAuth.validateJsonElement(jsonArrayk8sAuths.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!K8SAuthsConfigPart.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'K8SAuthsConfigPart' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<K8SAuthsConfigPart> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(K8SAuthsConfigPart.class));

       return (TypeAdapter<T>) new TypeAdapter<K8SAuthsConfigPart>() {
           @Override
           public void write(JsonWriter out, K8SAuthsConfigPart value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public K8SAuthsConfigPart read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of K8SAuthsConfigPart given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of K8SAuthsConfigPart
   * @throws IOException if the JSON string is invalid with respect to K8SAuthsConfigPart
   */
  public static K8SAuthsConfigPart fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, K8SAuthsConfigPart.class);
  }

  /**
   * Convert an instance of K8SAuthsConfigPart to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

