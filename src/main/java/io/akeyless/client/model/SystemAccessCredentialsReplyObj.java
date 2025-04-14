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
 * SystemAccessCredentialsReplyObj
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class SystemAccessCredentialsReplyObj {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access_id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  @javax.annotation.Nullable
  private String accessId;

  public static final String SERIALIZED_NAME_AUTH_CREDS = "auth_creds";
  @SerializedName(SERIALIZED_NAME_AUTH_CREDS)
  @javax.annotation.Nullable
  private String authCreds;

  public static final String SERIALIZED_NAME_EXPIRY = "expiry";
  @SerializedName(SERIALIZED_NAME_EXPIRY)
  @javax.annotation.Nullable
  private Long expiry;

  public static final String SERIALIZED_NAME_KFM_CREDS = "kfm_creds";
  @SerializedName(SERIALIZED_NAME_KFM_CREDS)
  @javax.annotation.Nullable
  private String kfmCreds;

  public static final String SERIALIZED_NAME_NEED_MFA_APP_FIRST_CONFIG = "need_mfa_app_first_config";
  @SerializedName(SERIALIZED_NAME_NEED_MFA_APP_FIRST_CONFIG)
  @javax.annotation.Nullable
  private Boolean needMfaAppFirstConfig;

  public static final String SERIALIZED_NAME_REQUIRED_MFA = "required_mfa";
  @SerializedName(SERIALIZED_NAME_REQUIRED_MFA)
  @javax.annotation.Nullable
  private String requiredMfa;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UAM_CREDS = "uam_creds";
  @SerializedName(SERIALIZED_NAME_UAM_CREDS)
  @javax.annotation.Nullable
  private String uamCreds;

  public SystemAccessCredentialsReplyObj() {
  }

  public SystemAccessCredentialsReplyObj accessId(@javax.annotation.Nullable String accessId) {
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


  public SystemAccessCredentialsReplyObj authCreds(@javax.annotation.Nullable String authCreds) {
    this.authCreds = authCreds;
    return this;
  }

  /**
   * Temporary credentials for accessing Auth
   * @return authCreds
   */
  @javax.annotation.Nullable
  public String getAuthCreds() {
    return authCreds;
  }

  public void setAuthCreds(@javax.annotation.Nullable String authCreds) {
    this.authCreds = authCreds;
  }


  public SystemAccessCredentialsReplyObj expiry(@javax.annotation.Nullable Long expiry) {
    this.expiry = expiry;
    return this;
  }

  /**
   * Credentials expiration date
   * @return expiry
   */
  @javax.annotation.Nullable
  public Long getExpiry() {
    return expiry;
  }

  public void setExpiry(@javax.annotation.Nullable Long expiry) {
    this.expiry = expiry;
  }


  public SystemAccessCredentialsReplyObj kfmCreds(@javax.annotation.Nullable String kfmCreds) {
    this.kfmCreds = kfmCreds;
    return this;
  }

  /**
   * Temporary credentials for accessing the KFMs instances
   * @return kfmCreds
   */
  @javax.annotation.Nullable
  public String getKfmCreds() {
    return kfmCreds;
  }

  public void setKfmCreds(@javax.annotation.Nullable String kfmCreds) {
    this.kfmCreds = kfmCreds;
  }


  public SystemAccessCredentialsReplyObj needMfaAppFirstConfig(@javax.annotation.Nullable Boolean needMfaAppFirstConfig) {
    this.needMfaAppFirstConfig = needMfaAppFirstConfig;
    return this;
  }

  /**
   * If the user didn&#39;t complete to configure the MFA app
   * @return needMfaAppFirstConfig
   */
  @javax.annotation.Nullable
  public Boolean getNeedMfaAppFirstConfig() {
    return needMfaAppFirstConfig;
  }

  public void setNeedMfaAppFirstConfig(@javax.annotation.Nullable Boolean needMfaAppFirstConfig) {
    this.needMfaAppFirstConfig = needMfaAppFirstConfig;
  }


  public SystemAccessCredentialsReplyObj requiredMfa(@javax.annotation.Nullable String requiredMfa) {
    this.requiredMfa = requiredMfa;
    return this;
  }

  /**
   * Get requiredMfa
   * @return requiredMfa
   */
  @javax.annotation.Nullable
  public String getRequiredMfa() {
    return requiredMfa;
  }

  public void setRequiredMfa(@javax.annotation.Nullable String requiredMfa) {
    this.requiredMfa = requiredMfa;
  }


  public SystemAccessCredentialsReplyObj token(@javax.annotation.Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Credentials tmp token
   * @return token
   */
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = token;
  }


  public SystemAccessCredentialsReplyObj uamCreds(@javax.annotation.Nullable String uamCreds) {
    this.uamCreds = uamCreds;
    return this;
  }

  /**
   * Temporary credentials for accessing the UAM service
   * @return uamCreds
   */
  @javax.annotation.Nullable
  public String getUamCreds() {
    return uamCreds;
  }

  public void setUamCreds(@javax.annotation.Nullable String uamCreds) {
    this.uamCreds = uamCreds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemAccessCredentialsReplyObj systemAccessCredentialsReplyObj = (SystemAccessCredentialsReplyObj) o;
    return Objects.equals(this.accessId, systemAccessCredentialsReplyObj.accessId) &&
        Objects.equals(this.authCreds, systemAccessCredentialsReplyObj.authCreds) &&
        Objects.equals(this.expiry, systemAccessCredentialsReplyObj.expiry) &&
        Objects.equals(this.kfmCreds, systemAccessCredentialsReplyObj.kfmCreds) &&
        Objects.equals(this.needMfaAppFirstConfig, systemAccessCredentialsReplyObj.needMfaAppFirstConfig) &&
        Objects.equals(this.requiredMfa, systemAccessCredentialsReplyObj.requiredMfa) &&
        Objects.equals(this.token, systemAccessCredentialsReplyObj.token) &&
        Objects.equals(this.uamCreds, systemAccessCredentialsReplyObj.uamCreds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, authCreds, expiry, kfmCreds, needMfaAppFirstConfig, requiredMfa, token, uamCreds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemAccessCredentialsReplyObj {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    authCreds: ").append(toIndentedString(authCreds)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    kfmCreds: ").append(toIndentedString(kfmCreds)).append("\n");
    sb.append("    needMfaAppFirstConfig: ").append(toIndentedString(needMfaAppFirstConfig)).append("\n");
    sb.append("    requiredMfa: ").append(toIndentedString(requiredMfa)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uamCreds: ").append(toIndentedString(uamCreds)).append("\n");
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
    openapiFields.add("auth_creds");
    openapiFields.add("expiry");
    openapiFields.add("kfm_creds");
    openapiFields.add("need_mfa_app_first_config");
    openapiFields.add("required_mfa");
    openapiFields.add("token");
    openapiFields.add("uam_creds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SystemAccessCredentialsReplyObj
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SystemAccessCredentialsReplyObj.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SystemAccessCredentialsReplyObj is not found in the empty JSON string", SystemAccessCredentialsReplyObj.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SystemAccessCredentialsReplyObj.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SystemAccessCredentialsReplyObj` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access_id") != null && !jsonObj.get("access_id").isJsonNull()) && !jsonObj.get("access_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_id").toString()));
      }
      if ((jsonObj.get("auth_creds") != null && !jsonObj.get("auth_creds").isJsonNull()) && !jsonObj.get("auth_creds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_creds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_creds").toString()));
      }
      if ((jsonObj.get("kfm_creds") != null && !jsonObj.get("kfm_creds").isJsonNull()) && !jsonObj.get("kfm_creds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kfm_creds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kfm_creds").toString()));
      }
      if ((jsonObj.get("required_mfa") != null && !jsonObj.get("required_mfa").isJsonNull()) && !jsonObj.get("required_mfa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `required_mfa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("required_mfa").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uam_creds") != null && !jsonObj.get("uam_creds").isJsonNull()) && !jsonObj.get("uam_creds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uam_creds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uam_creds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SystemAccessCredentialsReplyObj.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SystemAccessCredentialsReplyObj' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SystemAccessCredentialsReplyObj> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SystemAccessCredentialsReplyObj.class));

       return (TypeAdapter<T>) new TypeAdapter<SystemAccessCredentialsReplyObj>() {
           @Override
           public void write(JsonWriter out, SystemAccessCredentialsReplyObj value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SystemAccessCredentialsReplyObj read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SystemAccessCredentialsReplyObj given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SystemAccessCredentialsReplyObj
   * @throws IOException if the JSON string is invalid with respect to SystemAccessCredentialsReplyObj
   */
  public static SystemAccessCredentialsReplyObj fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SystemAccessCredentialsReplyObj.class);
  }

  /**
   * Convert an instance of SystemAccessCredentialsReplyObj to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

