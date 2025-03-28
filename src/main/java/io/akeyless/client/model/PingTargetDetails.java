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
 * PingTargetDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class PingTargetDetails {
  public static final String SERIALIZED_NAME_ADMINISTRATIVE_PORT = "administrative_port";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATIVE_PORT)
  @javax.annotation.Nullable
  private String administrativePort;

  public static final String SERIALIZED_NAME_AUTHORIZATION_PORT = "authorization_port";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_PORT)
  @javax.annotation.Nullable
  private String authorizationPort;

  public static final String SERIALIZED_NAME_PING_URL = "ping_url";
  @SerializedName(SERIALIZED_NAME_PING_URL)
  @javax.annotation.Nullable
  private String pingUrl;

  public static final String SERIALIZED_NAME_PRIVILEGED_USER = "privileged_user";
  @SerializedName(SERIALIZED_NAME_PRIVILEGED_USER)
  @javax.annotation.Nullable
  private String privilegedUser;

  public static final String SERIALIZED_NAME_USER_PASSWORD = "user_password";
  @SerializedName(SERIALIZED_NAME_USER_PASSWORD)
  @javax.annotation.Nullable
  private String userPassword;

  public PingTargetDetails() {
  }

  public PingTargetDetails administrativePort(@javax.annotation.Nullable String administrativePort) {
    this.administrativePort = administrativePort;
    return this;
  }

  /**
   * Get administrativePort
   * @return administrativePort
   */
  @javax.annotation.Nullable
  public String getAdministrativePort() {
    return administrativePort;
  }

  public void setAdministrativePort(@javax.annotation.Nullable String administrativePort) {
    this.administrativePort = administrativePort;
  }


  public PingTargetDetails authorizationPort(@javax.annotation.Nullable String authorizationPort) {
    this.authorizationPort = authorizationPort;
    return this;
  }

  /**
   * Get authorizationPort
   * @return authorizationPort
   */
  @javax.annotation.Nullable
  public String getAuthorizationPort() {
    return authorizationPort;
  }

  public void setAuthorizationPort(@javax.annotation.Nullable String authorizationPort) {
    this.authorizationPort = authorizationPort;
  }


  public PingTargetDetails pingUrl(@javax.annotation.Nullable String pingUrl) {
    this.pingUrl = pingUrl;
    return this;
  }

  /**
   * Get pingUrl
   * @return pingUrl
   */
  @javax.annotation.Nullable
  public String getPingUrl() {
    return pingUrl;
  }

  public void setPingUrl(@javax.annotation.Nullable String pingUrl) {
    this.pingUrl = pingUrl;
  }


  public PingTargetDetails privilegedUser(@javax.annotation.Nullable String privilegedUser) {
    this.privilegedUser = privilegedUser;
    return this;
  }

  /**
   * Get privilegedUser
   * @return privilegedUser
   */
  @javax.annotation.Nullable
  public String getPrivilegedUser() {
    return privilegedUser;
  }

  public void setPrivilegedUser(@javax.annotation.Nullable String privilegedUser) {
    this.privilegedUser = privilegedUser;
  }


  public PingTargetDetails userPassword(@javax.annotation.Nullable String userPassword) {
    this.userPassword = userPassword;
    return this;
  }

  /**
   * Get userPassword
   * @return userPassword
   */
  @javax.annotation.Nullable
  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(@javax.annotation.Nullable String userPassword) {
    this.userPassword = userPassword;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PingTargetDetails pingTargetDetails = (PingTargetDetails) o;
    return Objects.equals(this.administrativePort, pingTargetDetails.administrativePort) &&
        Objects.equals(this.authorizationPort, pingTargetDetails.authorizationPort) &&
        Objects.equals(this.pingUrl, pingTargetDetails.pingUrl) &&
        Objects.equals(this.privilegedUser, pingTargetDetails.privilegedUser) &&
        Objects.equals(this.userPassword, pingTargetDetails.userPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrativePort, authorizationPort, pingUrl, privilegedUser, userPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PingTargetDetails {\n");
    sb.append("    administrativePort: ").append(toIndentedString(administrativePort)).append("\n");
    sb.append("    authorizationPort: ").append(toIndentedString(authorizationPort)).append("\n");
    sb.append("    pingUrl: ").append(toIndentedString(pingUrl)).append("\n");
    sb.append("    privilegedUser: ").append(toIndentedString(privilegedUser)).append("\n");
    sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
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
    openapiFields.add("administrative_port");
    openapiFields.add("authorization_port");
    openapiFields.add("ping_url");
    openapiFields.add("privileged_user");
    openapiFields.add("user_password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PingTargetDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PingTargetDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PingTargetDetails is not found in the empty JSON string", PingTargetDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PingTargetDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PingTargetDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("administrative_port") != null && !jsonObj.get("administrative_port").isJsonNull()) && !jsonObj.get("administrative_port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `administrative_port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("administrative_port").toString()));
      }
      if ((jsonObj.get("authorization_port") != null && !jsonObj.get("authorization_port").isJsonNull()) && !jsonObj.get("authorization_port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization_port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorization_port").toString()));
      }
      if ((jsonObj.get("ping_url") != null && !jsonObj.get("ping_url").isJsonNull()) && !jsonObj.get("ping_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ping_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ping_url").toString()));
      }
      if ((jsonObj.get("privileged_user") != null && !jsonObj.get("privileged_user").isJsonNull()) && !jsonObj.get("privileged_user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privileged_user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privileged_user").toString()));
      }
      if ((jsonObj.get("user_password") != null && !jsonObj.get("user_password").isJsonNull()) && !jsonObj.get("user_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PingTargetDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PingTargetDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PingTargetDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PingTargetDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<PingTargetDetails>() {
           @Override
           public void write(JsonWriter out, PingTargetDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PingTargetDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PingTargetDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PingTargetDetails
   * @throws IOException if the JSON string is invalid with respect to PingTargetDetails
   */
  public static PingTargetDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PingTargetDetails.class);
  }

  /**
   * Convert an instance of PingTargetDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

