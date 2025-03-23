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
 * Update
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class Update {
  public static final String SERIALIZED_NAME_ARTIFACT_REPOSITORY = "artifact-repository";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_REPOSITORY)
  @javax.annotation.Nullable
  private String artifactRepository;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_SHOW_CHANGELOG = "show-changelog";
  @SerializedName(SERIALIZED_NAME_SHOW_CHANGELOG)
  @javax.annotation.Nullable
  private Boolean showChangelog;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @javax.annotation.Nullable
  private String version = "latest";

  public Update() {
  }

  public Update artifactRepository(@javax.annotation.Nullable String artifactRepository) {
    this.artifactRepository = artifactRepository;
    return this;
  }

  /**
   * Alternative CLI repository url. e.g. https://artifacts.site2.akeyless.io
   * @return artifactRepository
   */
  @javax.annotation.Nullable
  public String getArtifactRepository() {
    return artifactRepository;
  }

  public void setArtifactRepository(@javax.annotation.Nullable String artifactRepository) {
    this.artifactRepository = artifactRepository;
  }


  public Update json(@javax.annotation.Nullable Boolean json) {
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


  public Update showChangelog(@javax.annotation.Nullable Boolean showChangelog) {
    this.showChangelog = showChangelog;
    return this;
  }

  /**
   * Show the changelog between the current version and the latest one and exit (update will not be performed)
   * @return showChangelog
   */
  @javax.annotation.Nullable
  public Boolean getShowChangelog() {
    return showChangelog;
  }

  public void setShowChangelog(@javax.annotation.Nullable Boolean showChangelog) {
    this.showChangelog = showChangelog;
  }


  public Update version(@javax.annotation.Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * The CLI version
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(@javax.annotation.Nullable String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Update update = (Update) o;
    return Objects.equals(this.artifactRepository, update.artifactRepository) &&
        Objects.equals(this.json, update.json) &&
        Objects.equals(this.showChangelog, update.showChangelog) &&
        Objects.equals(this.version, update.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactRepository, json, showChangelog, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Update {\n");
    sb.append("    artifactRepository: ").append(toIndentedString(artifactRepository)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    showChangelog: ").append(toIndentedString(showChangelog)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("artifact-repository");
    openapiFields.add("json");
    openapiFields.add("show-changelog");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Update
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Update.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Update is not found in the empty JSON string", Update.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Update.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Update` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("artifact-repository") != null && !jsonObj.get("artifact-repository").isJsonNull()) && !jsonObj.get("artifact-repository").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artifact-repository` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artifact-repository").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Update.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Update' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Update> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Update.class));

       return (TypeAdapter<T>) new TypeAdapter<Update>() {
           @Override
           public void write(JsonWriter out, Update value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Update read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Update given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Update
   * @throws IOException if the JSON string is invalid with respect to Update
   */
  public static Update fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Update.class);
  }

  /**
   * Convert an instance of Update to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

