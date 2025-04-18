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
import io.akeyless.client.model.PasswordSecurityInfo;
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
 * StaticSecretDetailsInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class StaticSecretDetailsInfo {
  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  @javax.annotation.Nullable
  private String format;

  public static final String SERIALIZED_NAME_MAX_VERSIONS = "max_versions";
  @SerializedName(SERIALIZED_NAME_MAX_VERSIONS)
  @javax.annotation.Nullable
  private Long maxVersions;

  public static final String SERIALIZED_NAME_NOTIFY_ON_CHANGE_EVENT = "notify_on_change_event";
  @SerializedName(SERIALIZED_NAME_NOTIFY_ON_CHANGE_EVENT)
  @javax.annotation.Nullable
  private Boolean notifyOnChangeEvent;

  public static final String SERIALIZED_NAME_PASSWORD_SECURITY_INFO = "password_security_info";
  @SerializedName(SERIALIZED_NAME_PASSWORD_SECURITY_INFO)
  @javax.annotation.Nullable
  private PasswordSecurityInfo passwordSecurityInfo;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  @javax.annotation.Nullable
  private String username;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  @javax.annotation.Nullable
  private String website;

  public static final String SERIALIZED_NAME_WEBSITES = "websites";
  @SerializedName(SERIALIZED_NAME_WEBSITES)
  @javax.annotation.Nullable
  private List<String> websites = new ArrayList<>();

  public StaticSecretDetailsInfo() {
  }

  public StaticSecretDetailsInfo format(@javax.annotation.Nullable String format) {
    this.format = format;
    return this;
  }

  /**
   * StaticSecretFormat defines the format of static secret (e.g. Text)
   * @return format
   */
  @javax.annotation.Nullable
  public String getFormat() {
    return format;
  }

  public void setFormat(@javax.annotation.Nullable String format) {
    this.format = format;
  }


  public StaticSecretDetailsInfo maxVersions(@javax.annotation.Nullable Long maxVersions) {
    this.maxVersions = maxVersions;
    return this;
  }

  /**
   * Get maxVersions
   * @return maxVersions
   */
  @javax.annotation.Nullable
  public Long getMaxVersions() {
    return maxVersions;
  }

  public void setMaxVersions(@javax.annotation.Nullable Long maxVersions) {
    this.maxVersions = maxVersions;
  }


  public StaticSecretDetailsInfo notifyOnChangeEvent(@javax.annotation.Nullable Boolean notifyOnChangeEvent) {
    this.notifyOnChangeEvent = notifyOnChangeEvent;
    return this;
  }

  /**
   * Get notifyOnChangeEvent
   * @return notifyOnChangeEvent
   */
  @javax.annotation.Nullable
  public Boolean getNotifyOnChangeEvent() {
    return notifyOnChangeEvent;
  }

  public void setNotifyOnChangeEvent(@javax.annotation.Nullable Boolean notifyOnChangeEvent) {
    this.notifyOnChangeEvent = notifyOnChangeEvent;
  }


  public StaticSecretDetailsInfo passwordSecurityInfo(@javax.annotation.Nullable PasswordSecurityInfo passwordSecurityInfo) {
    this.passwordSecurityInfo = passwordSecurityInfo;
    return this;
  }

  /**
   * Get passwordSecurityInfo
   * @return passwordSecurityInfo
   */
  @javax.annotation.Nullable
  public PasswordSecurityInfo getPasswordSecurityInfo() {
    return passwordSecurityInfo;
  }

  public void setPasswordSecurityInfo(@javax.annotation.Nullable PasswordSecurityInfo passwordSecurityInfo) {
    this.passwordSecurityInfo = passwordSecurityInfo;
  }


  public StaticSecretDetailsInfo username(@javax.annotation.Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(@javax.annotation.Nullable String username) {
    this.username = username;
  }


  public StaticSecretDetailsInfo website(@javax.annotation.Nullable String website) {
    this.website = website;
    return this;
  }

  /**
   * deprecated
   * @return website
   */
  @javax.annotation.Nullable
  public String getWebsite() {
    return website;
  }

  public void setWebsite(@javax.annotation.Nullable String website) {
    this.website = website;
  }


  public StaticSecretDetailsInfo websites(@javax.annotation.Nullable List<String> websites) {
    this.websites = websites;
    return this;
  }

  public StaticSecretDetailsInfo addWebsitesItem(String websitesItem) {
    if (this.websites == null) {
      this.websites = new ArrayList<>();
    }
    this.websites.add(websitesItem);
    return this;
  }

  /**
   * Get websites
   * @return websites
   */
  @javax.annotation.Nullable
  public List<String> getWebsites() {
    return websites;
  }

  public void setWebsites(@javax.annotation.Nullable List<String> websites) {
    this.websites = websites;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticSecretDetailsInfo staticSecretDetailsInfo = (StaticSecretDetailsInfo) o;
    return Objects.equals(this.format, staticSecretDetailsInfo.format) &&
        Objects.equals(this.maxVersions, staticSecretDetailsInfo.maxVersions) &&
        Objects.equals(this.notifyOnChangeEvent, staticSecretDetailsInfo.notifyOnChangeEvent) &&
        Objects.equals(this.passwordSecurityInfo, staticSecretDetailsInfo.passwordSecurityInfo) &&
        Objects.equals(this.username, staticSecretDetailsInfo.username) &&
        Objects.equals(this.website, staticSecretDetailsInfo.website) &&
        Objects.equals(this.websites, staticSecretDetailsInfo.websites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, maxVersions, notifyOnChangeEvent, passwordSecurityInfo, username, website, websites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticSecretDetailsInfo {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    notifyOnChangeEvent: ").append(toIndentedString(notifyOnChangeEvent)).append("\n");
    sb.append("    passwordSecurityInfo: ").append(toIndentedString(passwordSecurityInfo)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    websites: ").append(toIndentedString(websites)).append("\n");
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
    openapiFields.add("format");
    openapiFields.add("max_versions");
    openapiFields.add("notify_on_change_event");
    openapiFields.add("password_security_info");
    openapiFields.add("username");
    openapiFields.add("website");
    openapiFields.add("websites");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StaticSecretDetailsInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StaticSecretDetailsInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StaticSecretDetailsInfo is not found in the empty JSON string", StaticSecretDetailsInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StaticSecretDetailsInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StaticSecretDetailsInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      // validate the optional field `password_security_info`
      if (jsonObj.get("password_security_info") != null && !jsonObj.get("password_security_info").isJsonNull()) {
        PasswordSecurityInfo.validateJsonElement(jsonObj.get("password_security_info"));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("website") != null && !jsonObj.get("website").isJsonNull()) && !jsonObj.get("website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("websites") != null && !jsonObj.get("websites").isJsonNull() && !jsonObj.get("websites").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `websites` to be an array in the JSON string but got `%s`", jsonObj.get("websites").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StaticSecretDetailsInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StaticSecretDetailsInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StaticSecretDetailsInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StaticSecretDetailsInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StaticSecretDetailsInfo>() {
           @Override
           public void write(JsonWriter out, StaticSecretDetailsInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StaticSecretDetailsInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StaticSecretDetailsInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StaticSecretDetailsInfo
   * @throws IOException if the JSON string is invalid with respect to StaticSecretDetailsInfo
   */
  public static StaticSecretDetailsInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StaticSecretDetailsInfo.class);
  }

  /**
   * Convert an instance of StaticSecretDetailsInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

