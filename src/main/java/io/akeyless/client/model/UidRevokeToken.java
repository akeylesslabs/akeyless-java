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
 * UidRevokeToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class UidRevokeToken {
  public static final String SERIALIZED_NAME_AUTH_METHOD_NAME = "auth-method-name";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_NAME)
  @javax.annotation.Nullable
  private String authMethodName;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_REVOKE_TOKEN = "revoke-token";
  @SerializedName(SERIALIZED_NAME_REVOKE_TOKEN)
  @javax.annotation.Nonnull
  private String revokeToken;

  public static final String SERIALIZED_NAME_REVOKE_TYPE = "revoke-type";
  @SerializedName(SERIALIZED_NAME_REVOKE_TYPE)
  @javax.annotation.Nonnull
  private String revokeType;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public UidRevokeToken() {
  }

  public UidRevokeToken authMethodName(@javax.annotation.Nullable String authMethodName) {
    this.authMethodName = authMethodName;
    return this;
  }

  /**
   * The universal identity auth method name
   * @return authMethodName
   */
  @javax.annotation.Nullable
  public String getAuthMethodName() {
    return authMethodName;
  }

  public void setAuthMethodName(@javax.annotation.Nullable String authMethodName) {
    this.authMethodName = authMethodName;
  }


  public UidRevokeToken json(@javax.annotation.Nullable Boolean json) {
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


  public UidRevokeToken revokeToken(@javax.annotation.Nonnull String revokeToken) {
    this.revokeToken = revokeToken;
    return this;
  }

  /**
   * the universal identity token/token-id to revoke
   * @return revokeToken
   */
  @javax.annotation.Nonnull
  public String getRevokeToken() {
    return revokeToken;
  }

  public void setRevokeToken(@javax.annotation.Nonnull String revokeToken) {
    this.revokeToken = revokeToken;
  }


  public UidRevokeToken revokeType(@javax.annotation.Nonnull String revokeType) {
    this.revokeType = revokeType;
    return this;
  }

  /**
   * revokeSelf/revokeAll (delete only this token/this token and his children)
   * @return revokeType
   */
  @javax.annotation.Nonnull
  public String getRevokeType() {
    return revokeType;
  }

  public void setRevokeType(@javax.annotation.Nonnull String revokeType) {
    this.revokeType = revokeType;
  }


  public UidRevokeToken token(@javax.annotation.Nullable String token) {
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


  public UidRevokeToken uidToken(@javax.annotation.Nullable String uidToken) {
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
    UidRevokeToken uidRevokeToken = (UidRevokeToken) o;
    return Objects.equals(this.authMethodName, uidRevokeToken.authMethodName) &&
        Objects.equals(this.json, uidRevokeToken.json) &&
        Objects.equals(this.revokeToken, uidRevokeToken.revokeToken) &&
        Objects.equals(this.revokeType, uidRevokeToken.revokeType) &&
        Objects.equals(this.token, uidRevokeToken.token) &&
        Objects.equals(this.uidToken, uidRevokeToken.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authMethodName, json, revokeToken, revokeType, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UidRevokeToken {\n");
    sb.append("    authMethodName: ").append(toIndentedString(authMethodName)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    revokeToken: ").append(toIndentedString(revokeToken)).append("\n");
    sb.append("    revokeType: ").append(toIndentedString(revokeType)).append("\n");
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
    openapiFields.add("auth-method-name");
    openapiFields.add("json");
    openapiFields.add("revoke-token");
    openapiFields.add("revoke-type");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("revoke-token");
    openapiRequiredFields.add("revoke-type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UidRevokeToken
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UidRevokeToken.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UidRevokeToken is not found in the empty JSON string", UidRevokeToken.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UidRevokeToken.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UidRevokeToken` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UidRevokeToken.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("auth-method-name") != null && !jsonObj.get("auth-method-name").isJsonNull()) && !jsonObj.get("auth-method-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth-method-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth-method-name").toString()));
      }
      if (!jsonObj.get("revoke-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revoke-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revoke-token").toString()));
      }
      if (!jsonObj.get("revoke-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revoke-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revoke-type").toString()));
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
       if (!UidRevokeToken.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UidRevokeToken' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UidRevokeToken> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UidRevokeToken.class));

       return (TypeAdapter<T>) new TypeAdapter<UidRevokeToken>() {
           @Override
           public void write(JsonWriter out, UidRevokeToken value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UidRevokeToken read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UidRevokeToken given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UidRevokeToken
   * @throws IOException if the JSON string is invalid with respect to UidRevokeToken
   */
  public static UidRevokeToken fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UidRevokeToken.class);
  }

  /**
   * Convert an instance of UidRevokeToken to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

