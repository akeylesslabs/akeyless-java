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
 * gatewayUpdateRemoteAccessDesktopApp is a command that update remote access desktop app config
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GatewayUpdateRemoteAccessDesktopApp {
  public static final String SERIALIZED_NAME_DESKTOP_APP_SECURE_WEB_ACCESS_URL = "desktop-app-secure-web-access-url";
  @SerializedName(SERIALIZED_NAME_DESKTOP_APP_SECURE_WEB_ACCESS_URL)
  @javax.annotation.Nullable
  private String desktopAppSecureWebAccessUrl;

  public static final String SERIALIZED_NAME_DESKTOP_APP_SECURE_WEB_PROXY = "desktop-app-secure-web-proxy";
  @SerializedName(SERIALIZED_NAME_DESKTOP_APP_SECURE_WEB_PROXY)
  @javax.annotation.Nullable
  private String desktopAppSecureWebProxy;

  public static final String SERIALIZED_NAME_DESKTOP_APP_SSH_CERT_ISSUER = "desktop-app-ssh-cert-issuer";
  @SerializedName(SERIALIZED_NAME_DESKTOP_APP_SSH_CERT_ISSUER)
  @javax.annotation.Nullable
  private String desktopAppSshCertIssuer;

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

  public GatewayUpdateRemoteAccessDesktopApp() {
  }

  public GatewayUpdateRemoteAccessDesktopApp desktopAppSecureWebAccessUrl(@javax.annotation.Nullable String desktopAppSecureWebAccessUrl) {
    this.desktopAppSecureWebAccessUrl = desktopAppSecureWebAccessUrl;
    return this;
  }

  /**
   * Get desktopAppSecureWebAccessUrl
   * @return desktopAppSecureWebAccessUrl
   */
  @javax.annotation.Nullable
  public String getDesktopAppSecureWebAccessUrl() {
    return desktopAppSecureWebAccessUrl;
  }

  public void setDesktopAppSecureWebAccessUrl(@javax.annotation.Nullable String desktopAppSecureWebAccessUrl) {
    this.desktopAppSecureWebAccessUrl = desktopAppSecureWebAccessUrl;
  }


  public GatewayUpdateRemoteAccessDesktopApp desktopAppSecureWebProxy(@javax.annotation.Nullable String desktopAppSecureWebProxy) {
    this.desktopAppSecureWebProxy = desktopAppSecureWebProxy;
    return this;
  }

  /**
   * Get desktopAppSecureWebProxy
   * @return desktopAppSecureWebProxy
   */
  @javax.annotation.Nullable
  public String getDesktopAppSecureWebProxy() {
    return desktopAppSecureWebProxy;
  }

  public void setDesktopAppSecureWebProxy(@javax.annotation.Nullable String desktopAppSecureWebProxy) {
    this.desktopAppSecureWebProxy = desktopAppSecureWebProxy;
  }


  public GatewayUpdateRemoteAccessDesktopApp desktopAppSshCertIssuer(@javax.annotation.Nullable String desktopAppSshCertIssuer) {
    this.desktopAppSshCertIssuer = desktopAppSshCertIssuer;
    return this;
  }

  /**
   * Get desktopAppSshCertIssuer
   * @return desktopAppSshCertIssuer
   */
  @javax.annotation.Nullable
  public String getDesktopAppSshCertIssuer() {
    return desktopAppSshCertIssuer;
  }

  public void setDesktopAppSshCertIssuer(@javax.annotation.Nullable String desktopAppSshCertIssuer) {
    this.desktopAppSshCertIssuer = desktopAppSshCertIssuer;
  }


  public GatewayUpdateRemoteAccessDesktopApp json(@javax.annotation.Nullable Boolean json) {
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


  public GatewayUpdateRemoteAccessDesktopApp token(@javax.annotation.Nullable String token) {
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


  public GatewayUpdateRemoteAccessDesktopApp uidToken(@javax.annotation.Nullable String uidToken) {
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
    GatewayUpdateRemoteAccessDesktopApp gatewayUpdateRemoteAccessDesktopApp = (GatewayUpdateRemoteAccessDesktopApp) o;
    return Objects.equals(this.desktopAppSecureWebAccessUrl, gatewayUpdateRemoteAccessDesktopApp.desktopAppSecureWebAccessUrl) &&
        Objects.equals(this.desktopAppSecureWebProxy, gatewayUpdateRemoteAccessDesktopApp.desktopAppSecureWebProxy) &&
        Objects.equals(this.desktopAppSshCertIssuer, gatewayUpdateRemoteAccessDesktopApp.desktopAppSshCertIssuer) &&
        Objects.equals(this.json, gatewayUpdateRemoteAccessDesktopApp.json) &&
        Objects.equals(this.token, gatewayUpdateRemoteAccessDesktopApp.token) &&
        Objects.equals(this.uidToken, gatewayUpdateRemoteAccessDesktopApp.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desktopAppSecureWebAccessUrl, desktopAppSecureWebProxy, desktopAppSshCertIssuer, json, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateRemoteAccessDesktopApp {\n");
    sb.append("    desktopAppSecureWebAccessUrl: ").append(toIndentedString(desktopAppSecureWebAccessUrl)).append("\n");
    sb.append("    desktopAppSecureWebProxy: ").append(toIndentedString(desktopAppSecureWebProxy)).append("\n");
    sb.append("    desktopAppSshCertIssuer: ").append(toIndentedString(desktopAppSshCertIssuer)).append("\n");
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
    openapiFields.add("desktop-app-secure-web-access-url");
    openapiFields.add("desktop-app-secure-web-proxy");
    openapiFields.add("desktop-app-ssh-cert-issuer");
    openapiFields.add("json");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GatewayUpdateRemoteAccessDesktopApp
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GatewayUpdateRemoteAccessDesktopApp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayUpdateRemoteAccessDesktopApp is not found in the empty JSON string", GatewayUpdateRemoteAccessDesktopApp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GatewayUpdateRemoteAccessDesktopApp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayUpdateRemoteAccessDesktopApp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("desktop-app-secure-web-access-url") != null && !jsonObj.get("desktop-app-secure-web-access-url").isJsonNull()) && !jsonObj.get("desktop-app-secure-web-access-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desktop-app-secure-web-access-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desktop-app-secure-web-access-url").toString()));
      }
      if ((jsonObj.get("desktop-app-secure-web-proxy") != null && !jsonObj.get("desktop-app-secure-web-proxy").isJsonNull()) && !jsonObj.get("desktop-app-secure-web-proxy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desktop-app-secure-web-proxy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desktop-app-secure-web-proxy").toString()));
      }
      if ((jsonObj.get("desktop-app-ssh-cert-issuer") != null && !jsonObj.get("desktop-app-ssh-cert-issuer").isJsonNull()) && !jsonObj.get("desktop-app-ssh-cert-issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desktop-app-ssh-cert-issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desktop-app-ssh-cert-issuer").toString()));
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
       if (!GatewayUpdateRemoteAccessDesktopApp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayUpdateRemoteAccessDesktopApp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayUpdateRemoteAccessDesktopApp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayUpdateRemoteAccessDesktopApp.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayUpdateRemoteAccessDesktopApp>() {
           @Override
           public void write(JsonWriter out, GatewayUpdateRemoteAccessDesktopApp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayUpdateRemoteAccessDesktopApp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GatewayUpdateRemoteAccessDesktopApp given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GatewayUpdateRemoteAccessDesktopApp
   * @throws IOException if the JSON string is invalid with respect to GatewayUpdateRemoteAccessDesktopApp
   */
  public static GatewayUpdateRemoteAccessDesktopApp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayUpdateRemoteAccessDesktopApp.class);
  }

  /**
   * Convert an instance of GatewayUpdateRemoteAccessDesktopApp to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

