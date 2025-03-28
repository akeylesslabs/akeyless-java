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
 * ArtifactoryTargetDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ArtifactoryTargetDetails {
  public static final String SERIALIZED_NAME_ARTIFACTORY_ADMIN_APIKEY = "artifactory_admin_apikey";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY_ADMIN_APIKEY)
  @javax.annotation.Nullable
  private String artifactoryAdminApikey;

  public static final String SERIALIZED_NAME_ARTIFACTORY_ADMIN_USERNAME = "artifactory_admin_username";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY_ADMIN_USERNAME)
  @javax.annotation.Nullable
  private String artifactoryAdminUsername;

  public static final String SERIALIZED_NAME_ARTIFACTORY_BASE_URL = "artifactory_base_url";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY_BASE_URL)
  @javax.annotation.Nullable
  private String artifactoryBaseUrl;

  public ArtifactoryTargetDetails() {
  }

  public ArtifactoryTargetDetails artifactoryAdminApikey(@javax.annotation.Nullable String artifactoryAdminApikey) {
    this.artifactoryAdminApikey = artifactoryAdminApikey;
    return this;
  }

  /**
   * Get artifactoryAdminApikey
   * @return artifactoryAdminApikey
   */
  @javax.annotation.Nullable
  public String getArtifactoryAdminApikey() {
    return artifactoryAdminApikey;
  }

  public void setArtifactoryAdminApikey(@javax.annotation.Nullable String artifactoryAdminApikey) {
    this.artifactoryAdminApikey = artifactoryAdminApikey;
  }


  public ArtifactoryTargetDetails artifactoryAdminUsername(@javax.annotation.Nullable String artifactoryAdminUsername) {
    this.artifactoryAdminUsername = artifactoryAdminUsername;
    return this;
  }

  /**
   * Get artifactoryAdminUsername
   * @return artifactoryAdminUsername
   */
  @javax.annotation.Nullable
  public String getArtifactoryAdminUsername() {
    return artifactoryAdminUsername;
  }

  public void setArtifactoryAdminUsername(@javax.annotation.Nullable String artifactoryAdminUsername) {
    this.artifactoryAdminUsername = artifactoryAdminUsername;
  }


  public ArtifactoryTargetDetails artifactoryBaseUrl(@javax.annotation.Nullable String artifactoryBaseUrl) {
    this.artifactoryBaseUrl = artifactoryBaseUrl;
    return this;
  }

  /**
   * Get artifactoryBaseUrl
   * @return artifactoryBaseUrl
   */
  @javax.annotation.Nullable
  public String getArtifactoryBaseUrl() {
    return artifactoryBaseUrl;
  }

  public void setArtifactoryBaseUrl(@javax.annotation.Nullable String artifactoryBaseUrl) {
    this.artifactoryBaseUrl = artifactoryBaseUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactoryTargetDetails artifactoryTargetDetails = (ArtifactoryTargetDetails) o;
    return Objects.equals(this.artifactoryAdminApikey, artifactoryTargetDetails.artifactoryAdminApikey) &&
        Objects.equals(this.artifactoryAdminUsername, artifactoryTargetDetails.artifactoryAdminUsername) &&
        Objects.equals(this.artifactoryBaseUrl, artifactoryTargetDetails.artifactoryBaseUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactoryAdminApikey, artifactoryAdminUsername, artifactoryBaseUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactoryTargetDetails {\n");
    sb.append("    artifactoryAdminApikey: ").append(toIndentedString(artifactoryAdminApikey)).append("\n");
    sb.append("    artifactoryAdminUsername: ").append(toIndentedString(artifactoryAdminUsername)).append("\n");
    sb.append("    artifactoryBaseUrl: ").append(toIndentedString(artifactoryBaseUrl)).append("\n");
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
    openapiFields.add("artifactory_admin_apikey");
    openapiFields.add("artifactory_admin_username");
    openapiFields.add("artifactory_base_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ArtifactoryTargetDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ArtifactoryTargetDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArtifactoryTargetDetails is not found in the empty JSON string", ArtifactoryTargetDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ArtifactoryTargetDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ArtifactoryTargetDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("artifactory_admin_apikey") != null && !jsonObj.get("artifactory_admin_apikey").isJsonNull()) && !jsonObj.get("artifactory_admin_apikey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artifactory_admin_apikey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artifactory_admin_apikey").toString()));
      }
      if ((jsonObj.get("artifactory_admin_username") != null && !jsonObj.get("artifactory_admin_username").isJsonNull()) && !jsonObj.get("artifactory_admin_username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artifactory_admin_username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artifactory_admin_username").toString()));
      }
      if ((jsonObj.get("artifactory_base_url") != null && !jsonObj.get("artifactory_base_url").isJsonNull()) && !jsonObj.get("artifactory_base_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artifactory_base_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artifactory_base_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArtifactoryTargetDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArtifactoryTargetDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArtifactoryTargetDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArtifactoryTargetDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ArtifactoryTargetDetails>() {
           @Override
           public void write(JsonWriter out, ArtifactoryTargetDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ArtifactoryTargetDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ArtifactoryTargetDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ArtifactoryTargetDetails
   * @throws IOException if the JSON string is invalid with respect to ArtifactoryTargetDetails
   */
  public static ArtifactoryTargetDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArtifactoryTargetDetails.class);
  }

  /**
   * Convert an instance of ArtifactoryTargetDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

