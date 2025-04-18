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
 * gatewayMigratePersonalItems is a command that migrate personal items from external vault
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GatewayMigratePersonalItems {
  public static final String SERIALIZED_NAME_1PASSWORD_EMAIL = "1password-email";
  @SerializedName(SERIALIZED_NAME_1PASSWORD_EMAIL)
  @javax.annotation.Nullable
  private String _1passwordEmail;

  public static final String SERIALIZED_NAME_1PASSWORD_PASSWORD = "1password-password";
  @SerializedName(SERIALIZED_NAME_1PASSWORD_PASSWORD)
  @javax.annotation.Nullable
  private String _1passwordPassword;

  public static final String SERIALIZED_NAME_1PASSWORD_SECRET_KEY = "1password-secret-key";
  @SerializedName(SERIALIZED_NAME_1PASSWORD_SECRET_KEY)
  @javax.annotation.Nullable
  private String _1passwordSecretKey;

  public static final String SERIALIZED_NAME_1PASSWORD_URL = "1password-url";
  @SerializedName(SERIALIZED_NAME_1PASSWORD_URL)
  @javax.annotation.Nullable
  private String _1passwordUrl;

  public static final String SERIALIZED_NAME_1PASSWORD_VAULTS = "1password-vaults";
  @SerializedName(SERIALIZED_NAME_1PASSWORD_VAULTS)
  @javax.annotation.Nullable
  private List<String> _1passwordVaults = new ArrayList<>();

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_PROTECTION_KEY = "protection-key";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY)
  @javax.annotation.Nullable
  private String protectionKey;

  public static final String SERIALIZED_NAME_TARGET_LOCATION = "target-location";
  @SerializedName(SERIALIZED_NAME_TARGET_LOCATION)
  @javax.annotation.Nullable
  private String targetLocation;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type = "1password";

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public GatewayMigratePersonalItems() {
  }

  public GatewayMigratePersonalItems _1passwordEmail(@javax.annotation.Nullable String _1passwordEmail) {
    this._1passwordEmail = _1passwordEmail;
    return this;
  }

  /**
   * 1Password user email to connect to the API
   * @return _1passwordEmail
   */
  @javax.annotation.Nullable
  public String get1passwordEmail() {
    return _1passwordEmail;
  }

  public void set1passwordEmail(@javax.annotation.Nullable String _1passwordEmail) {
    this._1passwordEmail = _1passwordEmail;
  }


  public GatewayMigratePersonalItems _1passwordPassword(@javax.annotation.Nullable String _1passwordPassword) {
    this._1passwordPassword = _1passwordPassword;
    return this;
  }

  /**
   * 1Password user password to connect to the API
   * @return _1passwordPassword
   */
  @javax.annotation.Nullable
  public String get1passwordPassword() {
    return _1passwordPassword;
  }

  public void set1passwordPassword(@javax.annotation.Nullable String _1passwordPassword) {
    this._1passwordPassword = _1passwordPassword;
  }


  public GatewayMigratePersonalItems _1passwordSecretKey(@javax.annotation.Nullable String _1passwordSecretKey) {
    this._1passwordSecretKey = _1passwordSecretKey;
    return this;
  }

  /**
   * 1Password user secret key to connect to the API
   * @return _1passwordSecretKey
   */
  @javax.annotation.Nullable
  public String get1passwordSecretKey() {
    return _1passwordSecretKey;
  }

  public void set1passwordSecretKey(@javax.annotation.Nullable String _1passwordSecretKey) {
    this._1passwordSecretKey = _1passwordSecretKey;
  }


  public GatewayMigratePersonalItems _1passwordUrl(@javax.annotation.Nullable String _1passwordUrl) {
    this._1passwordUrl = _1passwordUrl;
    return this;
  }

  /**
   * 1Password api container url
   * @return _1passwordUrl
   */
  @javax.annotation.Nullable
  public String get1passwordUrl() {
    return _1passwordUrl;
  }

  public void set1passwordUrl(@javax.annotation.Nullable String _1passwordUrl) {
    this._1passwordUrl = _1passwordUrl;
  }


  public GatewayMigratePersonalItems _1passwordVaults(@javax.annotation.Nullable List<String> _1passwordVaults) {
    this._1passwordVaults = _1passwordVaults;
    return this;
  }

  public GatewayMigratePersonalItems add1passwordVaultsItem(String _1passwordVaultsItem) {
    if (this._1passwordVaults == null) {
      this._1passwordVaults = new ArrayList<>();
    }
    this._1passwordVaults.add(_1passwordVaultsItem);
    return this;
  }

  /**
   * 1Password list of vault to get the items from
   * @return _1passwordVaults
   */
  @javax.annotation.Nullable
  public List<String> get1passwordVaults() {
    return _1passwordVaults;
  }

  public void set1passwordVaults(@javax.annotation.Nullable List<String> _1passwordVaults) {
    this._1passwordVaults = _1passwordVaults;
  }


  public GatewayMigratePersonalItems json(@javax.annotation.Nullable Boolean json) {
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


  public GatewayMigratePersonalItems protectionKey(@javax.annotation.Nullable String protectionKey) {
    this.protectionKey = protectionKey;
    return this;
  }

  /**
   * The name of a key that used to encrypt the secret value
   * @return protectionKey
   */
  @javax.annotation.Nullable
  public String getProtectionKey() {
    return protectionKey;
  }

  public void setProtectionKey(@javax.annotation.Nullable String protectionKey) {
    this.protectionKey = protectionKey;
  }


  public GatewayMigratePersonalItems targetLocation(@javax.annotation.Nullable String targetLocation) {
    this.targetLocation = targetLocation;
    return this;
  }

  /**
   * Target location in your Akeyless personal folder for migrated secrets
   * @return targetLocation
   */
  @javax.annotation.Nullable
  public String getTargetLocation() {
    return targetLocation;
  }

  public void setTargetLocation(@javax.annotation.Nullable String targetLocation) {
    this.targetLocation = targetLocation;
  }


  public GatewayMigratePersonalItems token(@javax.annotation.Nullable String token) {
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


  public GatewayMigratePersonalItems type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Migration type for now only 1password.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public GatewayMigratePersonalItems uidToken(@javax.annotation.Nullable String uidToken) {
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
    GatewayMigratePersonalItems gatewayMigratePersonalItems = (GatewayMigratePersonalItems) o;
    return Objects.equals(this._1passwordEmail, gatewayMigratePersonalItems._1passwordEmail) &&
        Objects.equals(this._1passwordPassword, gatewayMigratePersonalItems._1passwordPassword) &&
        Objects.equals(this._1passwordSecretKey, gatewayMigratePersonalItems._1passwordSecretKey) &&
        Objects.equals(this._1passwordUrl, gatewayMigratePersonalItems._1passwordUrl) &&
        Objects.equals(this._1passwordVaults, gatewayMigratePersonalItems._1passwordVaults) &&
        Objects.equals(this.json, gatewayMigratePersonalItems.json) &&
        Objects.equals(this.protectionKey, gatewayMigratePersonalItems.protectionKey) &&
        Objects.equals(this.targetLocation, gatewayMigratePersonalItems.targetLocation) &&
        Objects.equals(this.token, gatewayMigratePersonalItems.token) &&
        Objects.equals(this.type, gatewayMigratePersonalItems.type) &&
        Objects.equals(this.uidToken, gatewayMigratePersonalItems.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1passwordEmail, _1passwordPassword, _1passwordSecretKey, _1passwordUrl, _1passwordVaults, json, protectionKey, targetLocation, token, type, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayMigratePersonalItems {\n");
    sb.append("    _1passwordEmail: ").append(toIndentedString(_1passwordEmail)).append("\n");
    sb.append("    _1passwordPassword: ").append(toIndentedString(_1passwordPassword)).append("\n");
    sb.append("    _1passwordSecretKey: ").append(toIndentedString(_1passwordSecretKey)).append("\n");
    sb.append("    _1passwordUrl: ").append(toIndentedString(_1passwordUrl)).append("\n");
    sb.append("    _1passwordVaults: ").append(toIndentedString(_1passwordVaults)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    protectionKey: ").append(toIndentedString(protectionKey)).append("\n");
    sb.append("    targetLocation: ").append(toIndentedString(targetLocation)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("1password-email");
    openapiFields.add("1password-password");
    openapiFields.add("1password-secret-key");
    openapiFields.add("1password-url");
    openapiFields.add("1password-vaults");
    openapiFields.add("json");
    openapiFields.add("protection-key");
    openapiFields.add("target-location");
    openapiFields.add("token");
    openapiFields.add("type");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GatewayMigratePersonalItems
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GatewayMigratePersonalItems.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayMigratePersonalItems is not found in the empty JSON string", GatewayMigratePersonalItems.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GatewayMigratePersonalItems.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayMigratePersonalItems` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("1password-email") != null && !jsonObj.get("1password-email").isJsonNull()) && !jsonObj.get("1password-email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `1password-email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("1password-email").toString()));
      }
      if ((jsonObj.get("1password-password") != null && !jsonObj.get("1password-password").isJsonNull()) && !jsonObj.get("1password-password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `1password-password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("1password-password").toString()));
      }
      if ((jsonObj.get("1password-secret-key") != null && !jsonObj.get("1password-secret-key").isJsonNull()) && !jsonObj.get("1password-secret-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `1password-secret-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("1password-secret-key").toString()));
      }
      if ((jsonObj.get("1password-url") != null && !jsonObj.get("1password-url").isJsonNull()) && !jsonObj.get("1password-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `1password-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("1password-url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("1password-vaults") != null && !jsonObj.get("1password-vaults").isJsonNull() && !jsonObj.get("1password-vaults").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `1password-vaults` to be an array in the JSON string but got `%s`", jsonObj.get("1password-vaults").toString()));
      }
      if ((jsonObj.get("protection-key") != null && !jsonObj.get("protection-key").isJsonNull()) && !jsonObj.get("protection-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protection-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protection-key").toString()));
      }
      if ((jsonObj.get("target-location") != null && !jsonObj.get("target-location").isJsonNull()) && !jsonObj.get("target-location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target-location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target-location").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayMigratePersonalItems.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayMigratePersonalItems' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayMigratePersonalItems> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayMigratePersonalItems.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayMigratePersonalItems>() {
           @Override
           public void write(JsonWriter out, GatewayMigratePersonalItems value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayMigratePersonalItems read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GatewayMigratePersonalItems given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GatewayMigratePersonalItems
   * @throws IOException if the JSON string is invalid with respect to GatewayMigratePersonalItems
   */
  public static GatewayMigratePersonalItems fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayMigratePersonalItems.class);
  }

  /**
   * Convert an instance of GatewayMigratePersonalItems to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

