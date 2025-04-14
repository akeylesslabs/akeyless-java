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
 * eventForwarderUpdateEmail is a command that updates email event forwarder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EventForwarderUpdateEmail {
  public static final String SERIALIZED_NAME_AUTH_METHODS_EVENT_SOURCE_LOCATIONS = "auth-methods-event-source-locations";
  @SerializedName(SERIALIZED_NAME_AUTH_METHODS_EVENT_SOURCE_LOCATIONS)
  @javax.annotation.Nullable
  private List<String> authMethodsEventSourceLocations = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_EMAIL_TO = "email-to";
  @SerializedName(SERIALIZED_NAME_EMAIL_TO)
  @javax.annotation.Nullable
  private String emailTo;

  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  @javax.annotation.Nullable
  private String enable = "true";

  public static final String SERIALIZED_NAME_EVENT_TYPES = "event-types";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  @javax.annotation.Nullable
  private List<String> eventTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_GATEWAYS_EVENT_SOURCE_LOCATIONS = "gateways-event-source-locations";
  @SerializedName(SERIALIZED_NAME_GATEWAYS_EVENT_SOURCE_LOCATIONS)
  @javax.annotation.Nonnull
  private List<String> gatewaysEventSourceLocations = new ArrayList<>();

  public static final String SERIALIZED_NAME_INCLUDE_ERROR = "include-error";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ERROR)
  @javax.annotation.Nullable
  private String includeError;

  public static final String SERIALIZED_NAME_ITEMS_EVENT_SOURCE_LOCATIONS = "items-event-source-locations";
  @SerializedName(SERIALIZED_NAME_ITEMS_EVENT_SOURCE_LOCATIONS)
  @javax.annotation.Nullable
  private List<String> itemsEventSourceLocations = new ArrayList<>();

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEEP_PREV_VERSION = "keep-prev-version";
  @SerializedName(SERIALIZED_NAME_KEEP_PREV_VERSION)
  @javax.annotation.Nullable
  private String keepPrevVersion;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nullable
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  @javax.annotation.Nullable
  private String newName;

  public static final String SERIALIZED_NAME_OVERRIDE_URL = "override-url";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_URL)
  @javax.annotation.Nullable
  private String overrideUrl;

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

  public EventForwarderUpdateEmail() {
  }

  public EventForwarderUpdateEmail authMethodsEventSourceLocations(@javax.annotation.Nullable List<String> authMethodsEventSourceLocations) {
    this.authMethodsEventSourceLocations = authMethodsEventSourceLocations;
    return this;
  }

  public EventForwarderUpdateEmail addAuthMethodsEventSourceLocationsItem(String authMethodsEventSourceLocationsItem) {
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


  public EventForwarderUpdateEmail description(@javax.annotation.Nullable String description) {
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


  public EventForwarderUpdateEmail emailTo(@javax.annotation.Nullable String emailTo) {
    this.emailTo = emailTo;
    return this;
  }

  /**
   * A comma seperated list of email addresses to send event to
   * @return emailTo
   */
  @javax.annotation.Nullable
  public String getEmailTo() {
    return emailTo;
  }

  public void setEmailTo(@javax.annotation.Nullable String emailTo) {
    this.emailTo = emailTo;
  }


  public EventForwarderUpdateEmail enable(@javax.annotation.Nullable String enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Enable/Disable Event Forwarder [true/false]
   * @return enable
   */
  @javax.annotation.Nullable
  public String getEnable() {
    return enable;
  }

  public void setEnable(@javax.annotation.Nullable String enable) {
    this.enable = enable;
  }


  public EventForwarderUpdateEmail eventTypes(@javax.annotation.Nullable List<String> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public EventForwarderUpdateEmail addEventTypesItem(String eventTypesItem) {
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


  public EventForwarderUpdateEmail gatewaysEventSourceLocations(@javax.annotation.Nonnull List<String> gatewaysEventSourceLocations) {
    this.gatewaysEventSourceLocations = gatewaysEventSourceLocations;
    return this;
  }

  public EventForwarderUpdateEmail addGatewaysEventSourceLocationsItem(String gatewaysEventSourceLocationsItem) {
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


  public EventForwarderUpdateEmail includeError(@javax.annotation.Nullable String includeError) {
    this.includeError = includeError;
    return this;
  }

  /**
   * Set this option to include event errors details [true/false]
   * @return includeError
   */
  @javax.annotation.Nullable
  public String getIncludeError() {
    return includeError;
  }

  public void setIncludeError(@javax.annotation.Nullable String includeError) {
    this.includeError = includeError;
  }


  public EventForwarderUpdateEmail itemsEventSourceLocations(@javax.annotation.Nullable List<String> itemsEventSourceLocations) {
    this.itemsEventSourceLocations = itemsEventSourceLocations;
    return this;
  }

  public EventForwarderUpdateEmail addItemsEventSourceLocationsItem(String itemsEventSourceLocationsItem) {
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


  public EventForwarderUpdateEmail json(@javax.annotation.Nullable Boolean json) {
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


  public EventForwarderUpdateEmail keepPrevVersion(@javax.annotation.Nullable String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
    return this;
  }

  /**
   * Whether to keep previous version [true/false]. If not set, use default according to account settings
   * @return keepPrevVersion
   */
  @javax.annotation.Nullable
  public String getKeepPrevVersion() {
    return keepPrevVersion;
  }

  public void setKeepPrevVersion(@javax.annotation.Nullable String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
  }


  public EventForwarderUpdateEmail key(@javax.annotation.Nullable String key) {
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


  public EventForwarderUpdateEmail name(@javax.annotation.Nonnull String name) {
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


  public EventForwarderUpdateEmail newName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * New EventForwarder name
   * @return newName
   */
  @javax.annotation.Nullable
  public String getNewName() {
    return newName;
  }

  public void setNewName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
  }


  public EventForwarderUpdateEmail overrideUrl(@javax.annotation.Nullable String overrideUrl) {
    this.overrideUrl = overrideUrl;
    return this;
  }

  /**
   * Override Akeyless default URL with your Gateway url (port 18888)
   * @return overrideUrl
   */
  @javax.annotation.Nullable
  public String getOverrideUrl() {
    return overrideUrl;
  }

  public void setOverrideUrl(@javax.annotation.Nullable String overrideUrl) {
    this.overrideUrl = overrideUrl;
  }


  public EventForwarderUpdateEmail targetsEventSourceLocations(@javax.annotation.Nullable List<String> targetsEventSourceLocations) {
    this.targetsEventSourceLocations = targetsEventSourceLocations;
    return this;
  }

  public EventForwarderUpdateEmail addTargetsEventSourceLocationsItem(String targetsEventSourceLocationsItem) {
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


  public EventForwarderUpdateEmail token(@javax.annotation.Nullable String token) {
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


  public EventForwarderUpdateEmail uidToken(@javax.annotation.Nullable String uidToken) {
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
    EventForwarderUpdateEmail eventForwarderUpdateEmail = (EventForwarderUpdateEmail) o;
    return Objects.equals(this.authMethodsEventSourceLocations, eventForwarderUpdateEmail.authMethodsEventSourceLocations) &&
        Objects.equals(this.description, eventForwarderUpdateEmail.description) &&
        Objects.equals(this.emailTo, eventForwarderUpdateEmail.emailTo) &&
        Objects.equals(this.enable, eventForwarderUpdateEmail.enable) &&
        Objects.equals(this.eventTypes, eventForwarderUpdateEmail.eventTypes) &&
        Objects.equals(this.gatewaysEventSourceLocations, eventForwarderUpdateEmail.gatewaysEventSourceLocations) &&
        Objects.equals(this.includeError, eventForwarderUpdateEmail.includeError) &&
        Objects.equals(this.itemsEventSourceLocations, eventForwarderUpdateEmail.itemsEventSourceLocations) &&
        Objects.equals(this.json, eventForwarderUpdateEmail.json) &&
        Objects.equals(this.keepPrevVersion, eventForwarderUpdateEmail.keepPrevVersion) &&
        Objects.equals(this.key, eventForwarderUpdateEmail.key) &&
        Objects.equals(this.name, eventForwarderUpdateEmail.name) &&
        Objects.equals(this.newName, eventForwarderUpdateEmail.newName) &&
        Objects.equals(this.overrideUrl, eventForwarderUpdateEmail.overrideUrl) &&
        Objects.equals(this.targetsEventSourceLocations, eventForwarderUpdateEmail.targetsEventSourceLocations) &&
        Objects.equals(this.token, eventForwarderUpdateEmail.token) &&
        Objects.equals(this.uidToken, eventForwarderUpdateEmail.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authMethodsEventSourceLocations, description, emailTo, enable, eventTypes, gatewaysEventSourceLocations, includeError, itemsEventSourceLocations, json, keepPrevVersion, key, name, newName, overrideUrl, targetsEventSourceLocations, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventForwarderUpdateEmail {\n");
    sb.append("    authMethodsEventSourceLocations: ").append(toIndentedString(authMethodsEventSourceLocations)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    emailTo: ").append(toIndentedString(emailTo)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    gatewaysEventSourceLocations: ").append(toIndentedString(gatewaysEventSourceLocations)).append("\n");
    sb.append("    includeError: ").append(toIndentedString(includeError)).append("\n");
    sb.append("    itemsEventSourceLocations: ").append(toIndentedString(itemsEventSourceLocations)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    overrideUrl: ").append(toIndentedString(overrideUrl)).append("\n");
    sb.append("    targetsEventSourceLocations: ").append(toIndentedString(targetsEventSourceLocations)).append("\n");
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
    openapiFields.add("auth-methods-event-source-locations");
    openapiFields.add("description");
    openapiFields.add("email-to");
    openapiFields.add("enable");
    openapiFields.add("event-types");
    openapiFields.add("gateways-event-source-locations");
    openapiFields.add("include-error");
    openapiFields.add("items-event-source-locations");
    openapiFields.add("json");
    openapiFields.add("keep-prev-version");
    openapiFields.add("key");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("override-url");
    openapiFields.add("targets-event-source-locations");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("gateways-event-source-locations");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EventForwarderUpdateEmail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventForwarderUpdateEmail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventForwarderUpdateEmail is not found in the empty JSON string", EventForwarderUpdateEmail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventForwarderUpdateEmail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventForwarderUpdateEmail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventForwarderUpdateEmail.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("auth-methods-event-source-locations") != null && !jsonObj.get("auth-methods-event-source-locations").isJsonNull() && !jsonObj.get("auth-methods-event-source-locations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth-methods-event-source-locations` to be an array in the JSON string but got `%s`", jsonObj.get("auth-methods-event-source-locations").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("email-to") != null && !jsonObj.get("email-to").isJsonNull()) && !jsonObj.get("email-to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email-to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email-to").toString()));
      }
      if ((jsonObj.get("enable") != null && !jsonObj.get("enable").isJsonNull()) && !jsonObj.get("enable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enable").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("event-types") != null && !jsonObj.get("event-types").isJsonNull() && !jsonObj.get("event-types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `event-types` to be an array in the JSON string but got `%s`", jsonObj.get("event-types").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("gateways-event-source-locations") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("gateways-event-source-locations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateways-event-source-locations` to be an array in the JSON string but got `%s`", jsonObj.get("gateways-event-source-locations").toString()));
      }
      if ((jsonObj.get("include-error") != null && !jsonObj.get("include-error").isJsonNull()) && !jsonObj.get("include-error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `include-error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("include-error").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("items-event-source-locations") != null && !jsonObj.get("items-event-source-locations").isJsonNull() && !jsonObj.get("items-event-source-locations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items-event-source-locations` to be an array in the JSON string but got `%s`", jsonObj.get("items-event-source-locations").toString()));
      }
      if ((jsonObj.get("keep-prev-version") != null && !jsonObj.get("keep-prev-version").isJsonNull()) && !jsonObj.get("keep-prev-version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keep-prev-version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keep-prev-version").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("new-name") != null && !jsonObj.get("new-name").isJsonNull()) && !jsonObj.get("new-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new-name").toString()));
      }
      if ((jsonObj.get("override-url") != null && !jsonObj.get("override-url").isJsonNull()) && !jsonObj.get("override-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `override-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("override-url").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventForwarderUpdateEmail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventForwarderUpdateEmail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventForwarderUpdateEmail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventForwarderUpdateEmail.class));

       return (TypeAdapter<T>) new TypeAdapter<EventForwarderUpdateEmail>() {
           @Override
           public void write(JsonWriter out, EventForwarderUpdateEmail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventForwarderUpdateEmail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EventForwarderUpdateEmail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EventForwarderUpdateEmail
   * @throws IOException if the JSON string is invalid with respect to EventForwarderUpdateEmail
   */
  public static EventForwarderUpdateEmail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventForwarderUpdateEmail.class);
  }

  /**
   * Convert an instance of EventForwarderUpdateEmail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

