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
 * updateEventForwarder is a command that updates an event forwarder [Deprecated - please use event-forwarder-update-* command]
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class UpdateEventForwarder {
  public static final String SERIALIZED_NAME_ADMIN_NAME = "admin-name";
  @SerializedName(SERIALIZED_NAME_ADMIN_NAME)
  @javax.annotation.Nullable
  private String adminName;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth-type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  @javax.annotation.Nullable
  private String authType = "user-pass";

  public static final String SERIALIZED_NAME_CLIENT_ID = "client-id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  @javax.annotation.Nullable
  private String clientId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description = "default_comment";

  public static final String SERIALIZED_NAME_EMAIL_TO = "email-to";
  @SerializedName(SERIALIZED_NAME_EMAIL_TO)
  @javax.annotation.Nullable
  private String emailTo;

  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  @javax.annotation.Nullable
  private String enable = "true";

  public static final String SERIALIZED_NAME_EVENT_SOURCE_LOCATIONS = "event-source-locations";
  @SerializedName(SERIALIZED_NAME_EVENT_SOURCE_LOCATIONS)
  @javax.annotation.Nullable
  private List<String> eventSourceLocations = new ArrayList<>();

  public static final String SERIALIZED_NAME_EVENT_TYPES = "event-types";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  @javax.annotation.Nullable
  private List<String> eventTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  @javax.annotation.Nullable
  private String host;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NEW_COMMENT = "new-comment";
  @SerializedName(SERIALIZED_NAME_NEW_COMMENT)
  @javax.annotation.Nullable
  private String newComment = "default_comment";

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  @javax.annotation.Nullable
  private String newName;

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

  public UpdateEventForwarder() {
  }

  public UpdateEventForwarder adminName(@javax.annotation.Nullable String adminName) {
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


  public UpdateEventForwarder authType(@javax.annotation.Nullable String authType) {
    this.authType = authType;
    return this;
  }

  /**
   * The authentication type to use when connecting to ServiceNow (user-pass / jwt)
   * @return authType
   */
  @javax.annotation.Nullable
  public String getAuthType() {
    return authType;
  }

  public void setAuthType(@javax.annotation.Nullable String authType) {
    this.authType = authType;
  }


  public UpdateEventForwarder clientId(@javax.annotation.Nullable String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The client ID to use when connecting to ServiceNow with jwt authentication
   * @return clientId
   */
  @javax.annotation.Nullable
  public String getClientId() {
    return clientId;
  }

  public void setClientId(@javax.annotation.Nullable String clientId) {
    this.clientId = clientId;
  }


  public UpdateEventForwarder description(@javax.annotation.Nullable String description) {
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


  public UpdateEventForwarder emailTo(@javax.annotation.Nullable String emailTo) {
    this.emailTo = emailTo;
    return this;
  }

  /**
   * A comma seperated list of email addresses to send event to (relevant only for \&quot;email\&quot; Event Forwarder)
   * @return emailTo
   */
  @javax.annotation.Nullable
  public String getEmailTo() {
    return emailTo;
  }

  public void setEmailTo(@javax.annotation.Nullable String emailTo) {
    this.emailTo = emailTo;
  }


  public UpdateEventForwarder enable(@javax.annotation.Nullable String enable) {
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


  public UpdateEventForwarder eventSourceLocations(@javax.annotation.Nullable List<String> eventSourceLocations) {
    this.eventSourceLocations = eventSourceLocations;
    return this;
  }

  public UpdateEventForwarder addEventSourceLocationsItem(String eventSourceLocationsItem) {
    if (this.eventSourceLocations == null) {
      this.eventSourceLocations = new ArrayList<>();
    }
    this.eventSourceLocations.add(eventSourceLocationsItem);
    return this;
  }

  /**
   * Event sources
   * @return eventSourceLocations
   */
  @javax.annotation.Nullable
  public List<String> getEventSourceLocations() {
    return eventSourceLocations;
  }

  public void setEventSourceLocations(@javax.annotation.Nullable List<String> eventSourceLocations) {
    this.eventSourceLocations = eventSourceLocations;
  }


  public UpdateEventForwarder eventTypes(@javax.annotation.Nullable List<String> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public UpdateEventForwarder addEventTypesItem(String eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

  /**
   * Event types
   * @return eventTypes
   */
  @javax.annotation.Nullable
  public List<String> getEventTypes() {
    return eventTypes;
  }

  public void setEventTypes(@javax.annotation.Nullable List<String> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public UpdateEventForwarder host(@javax.annotation.Nullable String host) {
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


  public UpdateEventForwarder json(@javax.annotation.Nullable Boolean json) {
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


  public UpdateEventForwarder name(@javax.annotation.Nonnull String name) {
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


  public UpdateEventForwarder newComment(@javax.annotation.Nullable String newComment) {
    this.newComment = newComment;
    return this;
  }

  /**
   * Deprecated - use description
   * @return newComment
   */
  @javax.annotation.Nullable
  public String getNewComment() {
    return newComment;
  }

  public void setNewComment(@javax.annotation.Nullable String newComment) {
    this.newComment = newComment;
  }


  public UpdateEventForwarder newName(@javax.annotation.Nullable String newName) {
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


  public UpdateEventForwarder token(@javax.annotation.Nullable String token) {
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


  public UpdateEventForwarder uidToken(@javax.annotation.Nullable String uidToken) {
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


  public UpdateEventForwarder userEmail(@javax.annotation.Nullable String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * The user email to use when connecting to ServiceNow with jwt authentication
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
    UpdateEventForwarder updateEventForwarder = (UpdateEventForwarder) o;
    return Objects.equals(this.adminName, updateEventForwarder.adminName) &&
        Objects.equals(this.authType, updateEventForwarder.authType) &&
        Objects.equals(this.clientId, updateEventForwarder.clientId) &&
        Objects.equals(this.description, updateEventForwarder.description) &&
        Objects.equals(this.emailTo, updateEventForwarder.emailTo) &&
        Objects.equals(this.enable, updateEventForwarder.enable) &&
        Objects.equals(this.eventSourceLocations, updateEventForwarder.eventSourceLocations) &&
        Objects.equals(this.eventTypes, updateEventForwarder.eventTypes) &&
        Objects.equals(this.host, updateEventForwarder.host) &&
        Objects.equals(this.json, updateEventForwarder.json) &&
        Objects.equals(this.name, updateEventForwarder.name) &&
        Objects.equals(this.newComment, updateEventForwarder.newComment) &&
        Objects.equals(this.newName, updateEventForwarder.newName) &&
        Objects.equals(this.token, updateEventForwarder.token) &&
        Objects.equals(this.uidToken, updateEventForwarder.uidToken) &&
        Objects.equals(this.userEmail, updateEventForwarder.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminName, authType, clientId, description, emailTo, enable, eventSourceLocations, eventTypes, host, json, name, newComment, newName, token, uidToken, userEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEventForwarder {\n");
    sb.append("    adminName: ").append(toIndentedString(adminName)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    emailTo: ").append(toIndentedString(emailTo)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    eventSourceLocations: ").append(toIndentedString(eventSourceLocations)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newComment: ").append(toIndentedString(newComment)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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
    openapiFields.add("auth-type");
    openapiFields.add("client-id");
    openapiFields.add("description");
    openapiFields.add("email-to");
    openapiFields.add("enable");
    openapiFields.add("event-source-locations");
    openapiFields.add("event-types");
    openapiFields.add("host");
    openapiFields.add("json");
    openapiFields.add("name");
    openapiFields.add("new-comment");
    openapiFields.add("new-name");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("user-email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateEventForwarder
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateEventForwarder.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateEventForwarder is not found in the empty JSON string", UpdateEventForwarder.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateEventForwarder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateEventForwarder` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateEventForwarder.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("admin-name") != null && !jsonObj.get("admin-name").isJsonNull()) && !jsonObj.get("admin-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `admin-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("admin-name").toString()));
      }
      if ((jsonObj.get("auth-type") != null && !jsonObj.get("auth-type").isJsonNull()) && !jsonObj.get("auth-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth-type").toString()));
      }
      if ((jsonObj.get("client-id") != null && !jsonObj.get("client-id").isJsonNull()) && !jsonObj.get("client-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client-id").toString()));
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
      if (jsonObj.get("event-source-locations") != null && !jsonObj.get("event-source-locations").isJsonNull() && !jsonObj.get("event-source-locations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `event-source-locations` to be an array in the JSON string but got `%s`", jsonObj.get("event-source-locations").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("event-types") != null && !jsonObj.get("event-types").isJsonNull() && !jsonObj.get("event-types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `event-types` to be an array in the JSON string but got `%s`", jsonObj.get("event-types").toString()));
      }
      if ((jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("new-comment") != null && !jsonObj.get("new-comment").isJsonNull()) && !jsonObj.get("new-comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new-comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new-comment").toString()));
      }
      if ((jsonObj.get("new-name") != null && !jsonObj.get("new-name").isJsonNull()) && !jsonObj.get("new-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new-name").toString()));
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
       if (!UpdateEventForwarder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateEventForwarder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateEventForwarder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateEventForwarder.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateEventForwarder>() {
           @Override
           public void write(JsonWriter out, UpdateEventForwarder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateEventForwarder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateEventForwarder given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateEventForwarder
   * @throws IOException if the JSON string is invalid with respect to UpdateEventForwarder
   */
  public static UpdateEventForwarder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateEventForwarder.class);
  }

  /**
   * Convert an instance of UpdateEventForwarder to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

