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
 * eventForwarderCreateServiceNow is a command that creates service-now event forwarder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EventForwarderCreateServiceNow {
  public static final String SERIALIZED_NAME_ADMIN_NAME = "admin-name";
  @SerializedName(SERIALIZED_NAME_ADMIN_NAME)
  @javax.annotation.Nullable
  private String adminName;

  public static final String SERIALIZED_NAME_ADMIN_PWD = "admin-pwd";
  @SerializedName(SERIALIZED_NAME_ADMIN_PWD)
  @javax.annotation.Nullable
  private String adminPwd;

  public static final String SERIALIZED_NAME_APP_PRIVATE_KEY_BASE64 = "app-private-key-base64";
  @SerializedName(SERIALIZED_NAME_APP_PRIVATE_KEY_BASE64)
  @javax.annotation.Nullable
  private String appPrivateKeyBase64;

  public static final String SERIALIZED_NAME_AUTH_METHODS_EVENT_SOURCE_LOCATIONS = "auth-methods-event-source-locations";
  @SerializedName(SERIALIZED_NAME_AUTH_METHODS_EVENT_SOURCE_LOCATIONS)
  @javax.annotation.Nullable
  private List<String> authMethodsEventSourceLocations = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth-type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  @javax.annotation.Nullable
  private String authType = "user-pass";

  public static final String SERIALIZED_NAME_CLIENT_ID = "client-id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  @javax.annotation.Nullable
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client-secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  @javax.annotation.Nullable
  private String clientSecret;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_EVENT_TYPES = "event-types";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  @javax.annotation.Nullable
  private List<String> eventTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_EVERY = "every";
  @SerializedName(SERIALIZED_NAME_EVERY)
  @javax.annotation.Nullable
  private String every;

  public static final String SERIALIZED_NAME_GATEWAYS_EVENT_SOURCE_LOCATIONS = "gateways-event-source-locations";
  @SerializedName(SERIALIZED_NAME_GATEWAYS_EVENT_SOURCE_LOCATIONS)
  @javax.annotation.Nonnull
  private List<String> gatewaysEventSourceLocations = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  @javax.annotation.Nullable
  private String host;

  public static final String SERIALIZED_NAME_ITEMS_EVENT_SOURCE_LOCATIONS = "items-event-source-locations";
  @SerializedName(SERIALIZED_NAME_ITEMS_EVENT_SOURCE_LOCATIONS)
  @javax.annotation.Nullable
  private List<String> itemsEventSourceLocations = new ArrayList<>();

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nullable
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_RUNNER_TYPE = "runner-type";
  @SerializedName(SERIALIZED_NAME_RUNNER_TYPE)
  @javax.annotation.Nonnull
  private String runnerType;

  public static final String SERIALIZED_NAME_TARGETS_EVENT_SOURCE_LOCATIONS = "targets-event-source-locations";
  @SerializedName(SERIALIZED_NAME_TARGETS_EVENT_SOURCE_LOCATIONS)
  @javax.annotation.Nullable
  private List<String> targetsEventSourceLocations = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_EMAIL = "user-email";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL)
  @javax.annotation.Nullable
  private String userEmail;

  public EventForwarderCreateServiceNow() {
  }

  public EventForwarderCreateServiceNow adminName(@javax.annotation.Nullable String adminName) {
    this.adminName = adminName;
    return this;
  }

  /**
   * Workstation Admin Name
   * @return adminName
   */
  @javax.annotation.Nullable
  public String getAdminName() {
    return adminName;
  }

  public void setAdminName(@javax.annotation.Nullable String adminName) {
    this.adminName = adminName;
  }


  public EventForwarderCreateServiceNow adminPwd(@javax.annotation.Nullable String adminPwd) {
    this.adminPwd = adminPwd;
    return this;
  }

  /**
   * Workstation Admin Password
   * @return adminPwd
   */
  @javax.annotation.Nullable
  public String getAdminPwd() {
    return adminPwd;
  }

  public void setAdminPwd(@javax.annotation.Nullable String adminPwd) {
    this.adminPwd = adminPwd;
  }


  public EventForwarderCreateServiceNow appPrivateKeyBase64(@javax.annotation.Nullable String appPrivateKeyBase64) {
    this.appPrivateKeyBase64 = appPrivateKeyBase64;
    return this;
  }

  /**
   * The RSA Private Key to use when connecting with jwt authentication
   * @return appPrivateKeyBase64
   */
  @javax.annotation.Nullable
  public String getAppPrivateKeyBase64() {
    return appPrivateKeyBase64;
  }

  public void setAppPrivateKeyBase64(@javax.annotation.Nullable String appPrivateKeyBase64) {
    this.appPrivateKeyBase64 = appPrivateKeyBase64;
  }


  public EventForwarderCreateServiceNow authMethodsEventSourceLocations(@javax.annotation.Nullable List<String> authMethodsEventSourceLocations) {
    this.authMethodsEventSourceLocations = authMethodsEventSourceLocations;
    return this;
  }

  public EventForwarderCreateServiceNow addAuthMethodsEventSourceLocationsItem(String authMethodsEventSourceLocationsItem) {
    if (this.authMethodsEventSourceLocations == null) {
      this.authMethodsEventSourceLocations = new ArrayList<>();
    }
    this.authMethodsEventSourceLocations.add(authMethodsEventSourceLocationsItem);
    return this;
  }

  /**
   * Auth Method Event sources
   * @return authMethodsEventSourceLocations
   */
  @javax.annotation.Nullable
  public List<String> getAuthMethodsEventSourceLocations() {
    return authMethodsEventSourceLocations;
  }

  public void setAuthMethodsEventSourceLocations(@javax.annotation.Nullable List<String> authMethodsEventSourceLocations) {
    this.authMethodsEventSourceLocations = authMethodsEventSourceLocations;
  }


  public EventForwarderCreateServiceNow authType(@javax.annotation.Nullable String authType) {
    this.authType = authType;
    return this;
  }

  /**
   * The authentication type to use [user-pass/jwt]
   * @return authType
   */
  @javax.annotation.Nullable
  public String getAuthType() {
    return authType;
  }

  public void setAuthType(@javax.annotation.Nullable String authType) {
    this.authType = authType;
  }


  public EventForwarderCreateServiceNow clientId(@javax.annotation.Nullable String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The client ID to use when connecting with jwt authentication
   * @return clientId
   */
  @javax.annotation.Nullable
  public String getClientId() {
    return clientId;
  }

  public void setClientId(@javax.annotation.Nullable String clientId) {
    this.clientId = clientId;
  }


  public EventForwarderCreateServiceNow clientSecret(@javax.annotation.Nullable String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * The client secret to use when connecting with jwt authentication
   * @return clientSecret
   */
  @javax.annotation.Nullable
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(@javax.annotation.Nullable String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public EventForwarderCreateServiceNow description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the object
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public EventForwarderCreateServiceNow eventTypes(@javax.annotation.Nullable List<String> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public EventForwarderCreateServiceNow addEventTypesItem(String eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

  /**
   * List of event types to notify about [request-access, certificate-pending-expiration, certificate-expired, certificate-provisioning-success, certificate-provisioning-failure, auth-method-pending-expiration, auth-method-expired, next-automatic-rotation, rotated-secret-success, rotated-secret-failure, dynamic-secret-failure, multi-auth-failure, uid-rotation-failure, apply-justification, email-auth-method-approved, usage, rotation-usage, gateway-inactive, static-secret-updated, rate-limiting, usage-report, secret-sync]
   * @return eventTypes
   */
  @javax.annotation.Nullable
  public List<String> getEventTypes() {
    return eventTypes;
  }

  public void setEventTypes(@javax.annotation.Nullable List<String> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public EventForwarderCreateServiceNow every(@javax.annotation.Nullable String every) {
    this.every = every;
    return this;
  }

  /**
   * Rate of periodic runner repetition in hours
   * @return every
   */
  @javax.annotation.Nullable
  public String getEvery() {
    return every;
  }

  public void setEvery(@javax.annotation.Nullable String every) {
    this.every = every;
  }


  public EventForwarderCreateServiceNow gatewaysEventSourceLocations(@javax.annotation.Nonnull List<String> gatewaysEventSourceLocations) {
    this.gatewaysEventSourceLocations = gatewaysEventSourceLocations;
    return this;
  }

  public EventForwarderCreateServiceNow addGatewaysEventSourceLocationsItem(String gatewaysEventSourceLocationsItem) {
    if (this.gatewaysEventSourceLocations == null) {
      this.gatewaysEventSourceLocations = new ArrayList<>();
    }
    this.gatewaysEventSourceLocations.add(gatewaysEventSourceLocationsItem);
    return this;
  }

  /**
   * Event sources
   * @return gatewaysEventSourceLocations
   */
  @javax.annotation.Nonnull
  public List<String> getGatewaysEventSourceLocations() {
    return gatewaysEventSourceLocations;
  }

  public void setGatewaysEventSourceLocations(@javax.annotation.Nonnull List<String> gatewaysEventSourceLocations) {
    this.gatewaysEventSourceLocations = gatewaysEventSourceLocations;
  }


  public EventForwarderCreateServiceNow host(@javax.annotation.Nullable String host) {
    this.host = host;
    return this;
  }

  /**
   * Workstation Host
   * @return host
   */
  @javax.annotation.Nullable
  public String getHost() {
    return host;
  }

  public void setHost(@javax.annotation.Nullable String host) {
    this.host = host;
  }


  public EventForwarderCreateServiceNow itemsEventSourceLocations(@javax.annotation.Nullable List<String> itemsEventSourceLocations) {
    this.itemsEventSourceLocations = itemsEventSourceLocations;
    return this;
  }

  public EventForwarderCreateServiceNow addItemsEventSourceLocationsItem(String itemsEventSourceLocationsItem) {
    if (this.itemsEventSourceLocations == null) {
      this.itemsEventSourceLocations = new ArrayList<>();
    }
    this.itemsEventSourceLocations.add(itemsEventSourceLocationsItem);
    return this;
  }

  /**
   * Items Event sources
   * @return itemsEventSourceLocations
   */
  @javax.annotation.Nullable
  public List<String> getItemsEventSourceLocations() {
    return itemsEventSourceLocations;
  }

  public void setItemsEventSourceLocations(@javax.annotation.Nullable List<String> itemsEventSourceLocations) {
    this.itemsEventSourceLocations = itemsEventSourceLocations;
  }


  public EventForwarderCreateServiceNow json(@javax.annotation.Nullable Boolean json) {
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


  public EventForwarderCreateServiceNow key(@javax.annotation.Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * The name of a key that used to encrypt the EventForwarder secret value (if empty, the account default protectionKey key will be used)
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = key;
  }


  public EventForwarderCreateServiceNow name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * EventForwarder name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public EventForwarderCreateServiceNow runnerType(@javax.annotation.Nonnull String runnerType) {
    this.runnerType = runnerType;
    return this;
  }

  /**
   * Get runnerType
   * @return runnerType
   */
  @javax.annotation.Nonnull
  public String getRunnerType() {
    return runnerType;
  }

  public void setRunnerType(@javax.annotation.Nonnull String runnerType) {
    this.runnerType = runnerType;
  }


  public EventForwarderCreateServiceNow targetsEventSourceLocations(@javax.annotation.Nullable List<String> targetsEventSourceLocations) {
    this.targetsEventSourceLocations = targetsEventSourceLocations;
    return this;
  }

  public EventForwarderCreateServiceNow addTargetsEventSourceLocationsItem(String targetsEventSourceLocationsItem) {
    if (this.targetsEventSourceLocations == null) {
      this.targetsEventSourceLocations = new ArrayList<>();
    }
    this.targetsEventSourceLocations.add(targetsEventSourceLocationsItem);
    return this;
  }

  /**
   * Targets Event sources
   * @return targetsEventSourceLocations
   */
  @javax.annotation.Nullable
  public List<String> getTargetsEventSourceLocations() {
    return targetsEventSourceLocations;
  }

  public void setTargetsEventSourceLocations(@javax.annotation.Nullable List<String> targetsEventSourceLocations) {
    this.targetsEventSourceLocations = targetsEventSourceLocations;
  }


  public EventForwarderCreateServiceNow token(@javax.annotation.Nullable String token) {
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


  public EventForwarderCreateServiceNow uidToken(@javax.annotation.Nullable String uidToken) {
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


  public EventForwarderCreateServiceNow userEmail(@javax.annotation.Nullable String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * The user email to identify with when connecting with jwt authentication
   * @return userEmail
   */
  @javax.annotation.Nullable
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(@javax.annotation.Nullable String userEmail) {
    this.userEmail = userEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventForwarderCreateServiceNow eventForwarderCreateServiceNow = (EventForwarderCreateServiceNow) o;
    return Objects.equals(this.adminName, eventForwarderCreateServiceNow.adminName) &&
        Objects.equals(this.adminPwd, eventForwarderCreateServiceNow.adminPwd) &&
        Objects.equals(this.appPrivateKeyBase64, eventForwarderCreateServiceNow.appPrivateKeyBase64) &&
        Objects.equals(this.authMethodsEventSourceLocations, eventForwarderCreateServiceNow.authMethodsEventSourceLocations) &&
        Objects.equals(this.authType, eventForwarderCreateServiceNow.authType) &&
        Objects.equals(this.clientId, eventForwarderCreateServiceNow.clientId) &&
        Objects.equals(this.clientSecret, eventForwarderCreateServiceNow.clientSecret) &&
        Objects.equals(this.description, eventForwarderCreateServiceNow.description) &&
        Objects.equals(this.eventTypes, eventForwarderCreateServiceNow.eventTypes) &&
        Objects.equals(this.every, eventForwarderCreateServiceNow.every) &&
        Objects.equals(this.gatewaysEventSourceLocations, eventForwarderCreateServiceNow.gatewaysEventSourceLocations) &&
        Objects.equals(this.host, eventForwarderCreateServiceNow.host) &&
        Objects.equals(this.itemsEventSourceLocations, eventForwarderCreateServiceNow.itemsEventSourceLocations) &&
        Objects.equals(this.json, eventForwarderCreateServiceNow.json) &&
        Objects.equals(this.key, eventForwarderCreateServiceNow.key) &&
        Objects.equals(this.name, eventForwarderCreateServiceNow.name) &&
        Objects.equals(this.runnerType, eventForwarderCreateServiceNow.runnerType) &&
        Objects.equals(this.targetsEventSourceLocations, eventForwarderCreateServiceNow.targetsEventSourceLocations) &&
        Objects.equals(this.token, eventForwarderCreateServiceNow.token) &&
        Objects.equals(this.uidToken, eventForwarderCreateServiceNow.uidToken) &&
        Objects.equals(this.userEmail, eventForwarderCreateServiceNow.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminName, adminPwd, appPrivateKeyBase64, authMethodsEventSourceLocations, authType, clientId, clientSecret, description, eventTypes, every, gatewaysEventSourceLocations, host, itemsEventSourceLocations, json, key, name, runnerType, targetsEventSourceLocations, token, uidToken, userEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventForwarderCreateServiceNow {\n");
    sb.append("    adminName: ").append(toIndentedString(adminName)).append("\n");
    sb.append("    adminPwd: ").append(toIndentedString(adminPwd)).append("\n");
    sb.append("    appPrivateKeyBase64: ").append(toIndentedString(appPrivateKeyBase64)).append("\n");
    sb.append("    authMethodsEventSourceLocations: ").append(toIndentedString(authMethodsEventSourceLocations)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    every: ").append(toIndentedString(every)).append("\n");
    sb.append("    gatewaysEventSourceLocations: ").append(toIndentedString(gatewaysEventSourceLocations)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    itemsEventSourceLocations: ").append(toIndentedString(itemsEventSourceLocations)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    runnerType: ").append(toIndentedString(runnerType)).append("\n");
    sb.append("    targetsEventSourceLocations: ").append(toIndentedString(targetsEventSourceLocations)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
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
    openapiFields.add("admin-name");
    openapiFields.add("admin-pwd");
    openapiFields.add("app-private-key-base64");
    openapiFields.add("auth-methods-event-source-locations");
    openapiFields.add("auth-type");
    openapiFields.add("client-id");
    openapiFields.add("client-secret");
    openapiFields.add("description");
    openapiFields.add("event-types");
    openapiFields.add("every");
    openapiFields.add("gateways-event-source-locations");
    openapiFields.add("host");
    openapiFields.add("items-event-source-locations");
    openapiFields.add("json");
    openapiFields.add("key");
    openapiFields.add("name");
    openapiFields.add("runner-type");
    openapiFields.add("targets-event-source-locations");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("user-email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("gateways-event-source-locations");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("runner-type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EventForwarderCreateServiceNow
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventForwarderCreateServiceNow.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventForwarderCreateServiceNow is not found in the empty JSON string", EventForwarderCreateServiceNow.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventForwarderCreateServiceNow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventForwarderCreateServiceNow` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventForwarderCreateServiceNow.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("admin-name") != null && !jsonObj.get("admin-name").isJsonNull()) && !jsonObj.get("admin-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `admin-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("admin-name").toString()));
      }
      if ((jsonObj.get("admin-pwd") != null && !jsonObj.get("admin-pwd").isJsonNull()) && !jsonObj.get("admin-pwd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `admin-pwd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("admin-pwd").toString()));
      }
      if ((jsonObj.get("app-private-key-base64") != null && !jsonObj.get("app-private-key-base64").isJsonNull()) && !jsonObj.get("app-private-key-base64").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app-private-key-base64` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app-private-key-base64").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("auth-methods-event-source-locations") != null && !jsonObj.get("auth-methods-event-source-locations").isJsonNull() && !jsonObj.get("auth-methods-event-source-locations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth-methods-event-source-locations` to be an array in the JSON string but got `%s`", jsonObj.get("auth-methods-event-source-locations").toString()));
      }
      if ((jsonObj.get("auth-type") != null && !jsonObj.get("auth-type").isJsonNull()) && !jsonObj.get("auth-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth-type").toString()));
      }
      if ((jsonObj.get("client-id") != null && !jsonObj.get("client-id").isJsonNull()) && !jsonObj.get("client-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client-id").toString()));
      }
      if ((jsonObj.get("client-secret") != null && !jsonObj.get("client-secret").isJsonNull()) && !jsonObj.get("client-secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client-secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client-secret").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("event-types") != null && !jsonObj.get("event-types").isJsonNull() && !jsonObj.get("event-types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `event-types` to be an array in the JSON string but got `%s`", jsonObj.get("event-types").toString()));
      }
      if ((jsonObj.get("every") != null && !jsonObj.get("every").isJsonNull()) && !jsonObj.get("every").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `every` to be a primitive type in the JSON string but got `%s`", jsonObj.get("every").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("gateways-event-source-locations") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("gateways-event-source-locations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateways-event-source-locations` to be an array in the JSON string but got `%s`", jsonObj.get("gateways-event-source-locations").toString()));
      }
      if ((jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("items-event-source-locations") != null && !jsonObj.get("items-event-source-locations").isJsonNull() && !jsonObj.get("items-event-source-locations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items-event-source-locations` to be an array in the JSON string but got `%s`", jsonObj.get("items-event-source-locations").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("runner-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runner-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runner-type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("targets-event-source-locations") != null && !jsonObj.get("targets-event-source-locations").isJsonNull() && !jsonObj.get("targets-event-source-locations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `targets-event-source-locations` to be an array in the JSON string but got `%s`", jsonObj.get("targets-event-source-locations").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if ((jsonObj.get("user-email") != null && !jsonObj.get("user-email").isJsonNull()) && !jsonObj.get("user-email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user-email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user-email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventForwarderCreateServiceNow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventForwarderCreateServiceNow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventForwarderCreateServiceNow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventForwarderCreateServiceNow.class));

       return (TypeAdapter<T>) new TypeAdapter<EventForwarderCreateServiceNow>() {
           @Override
           public void write(JsonWriter out, EventForwarderCreateServiceNow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventForwarderCreateServiceNow read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EventForwarderCreateServiceNow given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EventForwarderCreateServiceNow
   * @throws IOException if the JSON string is invalid with respect to EventForwarderCreateServiceNow
   */
  public static EventForwarderCreateServiceNow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventForwarderCreateServiceNow.class);
  }

  /**
   * Convert an instance of EventForwarderCreateServiceNow to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

