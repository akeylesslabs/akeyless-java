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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * eventForwarderCreateWebhook is a command that creates webhook event forwarder
 */
@ApiModel(description = "eventForwarderCreateWebhook is a command that creates webhook event forwarder")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventForwarderCreateWebhook {
  public static final String SERIALIZED_NAME_AUTH_METHODS_EVENT_SOURCE_LOCATIONS = "auth-methods-event-source-locations";
  @SerializedName(SERIALIZED_NAME_AUTH_METHODS_EVENT_SOURCE_LOCATIONS)
  private List<String> authMethodsEventSourceLocations = null;

  public static final String SERIALIZED_NAME_AUTH_TOKEN = "auth-token";
  @SerializedName(SERIALIZED_NAME_AUTH_TOKEN)
  private String authToken;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth-type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private String authType = "user-pass";

  public static final String SERIALIZED_NAME_CLIENT_CERT_DATA = "client-cert-data";
  @SerializedName(SERIALIZED_NAME_CLIENT_CERT_DATA)
  private String clientCertData;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EVENT_TYPES = "event-types";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  private List<String> eventTypes = null;

  public static final String SERIALIZED_NAME_EVERY = "every";
  @SerializedName(SERIALIZED_NAME_EVERY)
  private String every;

  public static final String SERIALIZED_NAME_GATEWAYS_EVENT_SOURCE_LOCATIONS = "gateways-event-source-locations";
  @SerializedName(SERIALIZED_NAME_GATEWAYS_EVENT_SOURCE_LOCATIONS)
  private List<String> gatewaysEventSourceLocations = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ITEMS_EVENT_SOURCE_LOCATIONS = "items-event-source-locations";
  @SerializedName(SERIALIZED_NAME_ITEMS_EVENT_SOURCE_LOCATIONS)
  private List<String> itemsEventSourceLocations = null;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PRIVATE_KEY_DATA = "private-key-data";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY_DATA)
  private String privateKeyData;

  public static final String SERIALIZED_NAME_RUNNER_TYPE = "runner-type";
  @SerializedName(SERIALIZED_NAME_RUNNER_TYPE)
  private String runnerType;

  public static final String SERIALIZED_NAME_SERVER_CERTIFICATES = "server-certificates";
  @SerializedName(SERIALIZED_NAME_SERVER_CERTIFICATES)
  private String serverCertificates;

  public static final String SERIALIZED_NAME_TARGETS_EVENT_SOURCE_LOCATIONS = "targets-event-source-locations";
  @SerializedName(SERIALIZED_NAME_TARGETS_EVENT_SOURCE_LOCATIONS)
  private List<String> targetsEventSourceLocations = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public EventForwarderCreateWebhook() { 
  }

  public EventForwarderCreateWebhook authMethodsEventSourceLocations(List<String> authMethodsEventSourceLocations) {
    
    this.authMethodsEventSourceLocations = authMethodsEventSourceLocations;
    return this;
  }

  public EventForwarderCreateWebhook addAuthMethodsEventSourceLocationsItem(String authMethodsEventSourceLocationsItem) {
    if (this.authMethodsEventSourceLocations == null) {
      this.authMethodsEventSourceLocations = new ArrayList<String>();
    }
    this.authMethodsEventSourceLocations.add(authMethodsEventSourceLocationsItem);
    return this;
  }

   /**
   * Auth Method Event sources
   * @return authMethodsEventSourceLocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Auth Method Event sources")

  public List<String> getAuthMethodsEventSourceLocations() {
    return authMethodsEventSourceLocations;
  }


  public void setAuthMethodsEventSourceLocations(List<String> authMethodsEventSourceLocations) {
    this.authMethodsEventSourceLocations = authMethodsEventSourceLocations;
  }


  public EventForwarderCreateWebhook authToken(String authToken) {
    
    this.authToken = authToken;
    return this;
  }

   /**
   * Base64 encoded Token string for authentication type Token
   * @return authToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded Token string for authentication type Token")

  public String getAuthToken() {
    return authToken;
  }


  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }


  public EventForwarderCreateWebhook authType(String authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * The Webhook authentication type [user-pass, token, certificate]
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Webhook authentication type [user-pass, token, certificate]")

  public String getAuthType() {
    return authType;
  }


  public void setAuthType(String authType) {
    this.authType = authType;
  }


  public EventForwarderCreateWebhook clientCertData(String clientCertData) {
    
    this.clientCertData = clientCertData;
    return this;
  }

   /**
   * Base64 encoded PEM certificate, relevant for certificate auth-type
   * @return clientCertData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded PEM certificate, relevant for certificate auth-type")

  public String getClientCertData() {
    return clientCertData;
  }


  public void setClientCertData(String clientCertData) {
    this.clientCertData = clientCertData;
  }


  public EventForwarderCreateWebhook description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the object
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the object")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public EventForwarderCreateWebhook eventTypes(List<String> eventTypes) {
    
    this.eventTypes = eventTypes;
    return this;
  }

  public EventForwarderCreateWebhook addEventTypesItem(String eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<String>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

   /**
   * List of event types to notify about [request-access, certificate-pending-expiration, certificate-expired, certificate-provisioning-success, certificate-provisioning-failure, auth-method-pending-expiration, auth-method-expired, rotated-secret-success, rotated-secret-failure, dynamic-secret-failure, multi-auth-failure, uid-rotation-failure, apply-justification, email-auth-method-approved, usage, rotation-usage, gateway-inactive, static-secret-updated]
   * @return eventTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of event types to notify about [request-access, certificate-pending-expiration, certificate-expired, certificate-provisioning-success, certificate-provisioning-failure, auth-method-pending-expiration, auth-method-expired, rotated-secret-success, rotated-secret-failure, dynamic-secret-failure, multi-auth-failure, uid-rotation-failure, apply-justification, email-auth-method-approved, usage, rotation-usage, gateway-inactive, static-secret-updated]")

  public List<String> getEventTypes() {
    return eventTypes;
  }


  public void setEventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public EventForwarderCreateWebhook every(String every) {
    
    this.every = every;
    return this;
  }

   /**
   * Rate of periodic runner repetition in hours
   * @return every
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rate of periodic runner repetition in hours")

  public String getEvery() {
    return every;
  }


  public void setEvery(String every) {
    this.every = every;
  }


  public EventForwarderCreateWebhook gatewaysEventSourceLocations(List<String> gatewaysEventSourceLocations) {
    
    this.gatewaysEventSourceLocations = gatewaysEventSourceLocations;
    return this;
  }

  public EventForwarderCreateWebhook addGatewaysEventSourceLocationsItem(String gatewaysEventSourceLocationsItem) {
    this.gatewaysEventSourceLocations.add(gatewaysEventSourceLocationsItem);
    return this;
  }

   /**
   * Event sources
   * @return gatewaysEventSourceLocations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Event sources")

  public List<String> getGatewaysEventSourceLocations() {
    return gatewaysEventSourceLocations;
  }


  public void setGatewaysEventSourceLocations(List<String> gatewaysEventSourceLocations) {
    this.gatewaysEventSourceLocations = gatewaysEventSourceLocations;
  }


  public EventForwarderCreateWebhook itemsEventSourceLocations(List<String> itemsEventSourceLocations) {
    
    this.itemsEventSourceLocations = itemsEventSourceLocations;
    return this;
  }

  public EventForwarderCreateWebhook addItemsEventSourceLocationsItem(String itemsEventSourceLocationsItem) {
    if (this.itemsEventSourceLocations == null) {
      this.itemsEventSourceLocations = new ArrayList<String>();
    }
    this.itemsEventSourceLocations.add(itemsEventSourceLocationsItem);
    return this;
  }

   /**
   * Items Event sources
   * @return itemsEventSourceLocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Items Event sources")

  public List<String> getItemsEventSourceLocations() {
    return itemsEventSourceLocations;
  }


  public void setItemsEventSourceLocations(List<String> itemsEventSourceLocations) {
    this.itemsEventSourceLocations = itemsEventSourceLocations;
  }


  public EventForwarderCreateWebhook json(Boolean json) {
    
    this.json = json;
    return this;
  }

   /**
   * Set output format to JSON
   * @return json
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set output format to JSON")

  public Boolean getJson() {
    return json;
  }


  public void setJson(Boolean json) {
    this.json = json;
  }


  public EventForwarderCreateWebhook key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The name of a key that used to encrypt the EventForwarder secret value (if empty, the account default protectionKey key will be used)
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a key that used to encrypt the EventForwarder secret value (if empty, the account default protectionKey key will be used)")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public EventForwarderCreateWebhook name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * EventForwarder name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "EventForwarder name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public EventForwarderCreateWebhook password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password for authentication relevant for user-pass auth-type
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password for authentication relevant for user-pass auth-type")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public EventForwarderCreateWebhook privateKeyData(String privateKeyData) {
    
    this.privateKeyData = privateKeyData;
    return this;
  }

   /**
   * Base64 encoded PEM RSA Private Key, relevant for certificate auth-type
   * @return privateKeyData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded PEM RSA Private Key, relevant for certificate auth-type")

  public String getPrivateKeyData() {
    return privateKeyData;
  }


  public void setPrivateKeyData(String privateKeyData) {
    this.privateKeyData = privateKeyData;
  }


  public EventForwarderCreateWebhook runnerType(String runnerType) {
    
    this.runnerType = runnerType;
    return this;
  }

   /**
   * Get runnerType
   * @return runnerType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRunnerType() {
    return runnerType;
  }


  public void setRunnerType(String runnerType) {
    this.runnerType = runnerType;
  }


  public EventForwarderCreateWebhook serverCertificates(String serverCertificates) {
    
    this.serverCertificates = serverCertificates;
    return this;
  }

   /**
   * Base64 encoded PEM certificate of the Webhook
   * @return serverCertificates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded PEM certificate of the Webhook")

  public String getServerCertificates() {
    return serverCertificates;
  }


  public void setServerCertificates(String serverCertificates) {
    this.serverCertificates = serverCertificates;
  }


  public EventForwarderCreateWebhook targetsEventSourceLocations(List<String> targetsEventSourceLocations) {
    
    this.targetsEventSourceLocations = targetsEventSourceLocations;
    return this;
  }

  public EventForwarderCreateWebhook addTargetsEventSourceLocationsItem(String targetsEventSourceLocationsItem) {
    if (this.targetsEventSourceLocations == null) {
      this.targetsEventSourceLocations = new ArrayList<String>();
    }
    this.targetsEventSourceLocations.add(targetsEventSourceLocationsItem);
    return this;
  }

   /**
   * Targets Event sources
   * @return targetsEventSourceLocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Targets Event sources")

  public List<String> getTargetsEventSourceLocations() {
    return targetsEventSourceLocations;
  }


  public void setTargetsEventSourceLocations(List<String> targetsEventSourceLocations) {
    this.targetsEventSourceLocations = targetsEventSourceLocations;
  }


  public EventForwarderCreateWebhook token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authentication token (see `/auth` and `/configure`)")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public EventForwarderCreateWebhook uidToken(String uidToken) {
    
    this.uidToken = uidToken;
    return this;
  }

   /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The universal identity token, Required only for universal_identity authentication")

  public String getUidToken() {
    return uidToken;
  }


  public void setUidToken(String uidToken) {
    this.uidToken = uidToken;
  }


  public EventForwarderCreateWebhook url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Webhook URL
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Webhook URL")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public EventForwarderCreateWebhook username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username for authentication relevant for user-pass auth-type
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Username for authentication relevant for user-pass auth-type")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventForwarderCreateWebhook eventForwarderCreateWebhook = (EventForwarderCreateWebhook) o;
    return Objects.equals(this.authMethodsEventSourceLocations, eventForwarderCreateWebhook.authMethodsEventSourceLocations) &&
        Objects.equals(this.authToken, eventForwarderCreateWebhook.authToken) &&
        Objects.equals(this.authType, eventForwarderCreateWebhook.authType) &&
        Objects.equals(this.clientCertData, eventForwarderCreateWebhook.clientCertData) &&
        Objects.equals(this.description, eventForwarderCreateWebhook.description) &&
        Objects.equals(this.eventTypes, eventForwarderCreateWebhook.eventTypes) &&
        Objects.equals(this.every, eventForwarderCreateWebhook.every) &&
        Objects.equals(this.gatewaysEventSourceLocations, eventForwarderCreateWebhook.gatewaysEventSourceLocations) &&
        Objects.equals(this.itemsEventSourceLocations, eventForwarderCreateWebhook.itemsEventSourceLocations) &&
        Objects.equals(this.json, eventForwarderCreateWebhook.json) &&
        Objects.equals(this.key, eventForwarderCreateWebhook.key) &&
        Objects.equals(this.name, eventForwarderCreateWebhook.name) &&
        Objects.equals(this.password, eventForwarderCreateWebhook.password) &&
        Objects.equals(this.privateKeyData, eventForwarderCreateWebhook.privateKeyData) &&
        Objects.equals(this.runnerType, eventForwarderCreateWebhook.runnerType) &&
        Objects.equals(this.serverCertificates, eventForwarderCreateWebhook.serverCertificates) &&
        Objects.equals(this.targetsEventSourceLocations, eventForwarderCreateWebhook.targetsEventSourceLocations) &&
        Objects.equals(this.token, eventForwarderCreateWebhook.token) &&
        Objects.equals(this.uidToken, eventForwarderCreateWebhook.uidToken) &&
        Objects.equals(this.url, eventForwarderCreateWebhook.url) &&
        Objects.equals(this.username, eventForwarderCreateWebhook.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authMethodsEventSourceLocations, authToken, authType, clientCertData, description, eventTypes, every, gatewaysEventSourceLocations, itemsEventSourceLocations, json, key, name, password, privateKeyData, runnerType, serverCertificates, targetsEventSourceLocations, token, uidToken, url, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventForwarderCreateWebhook {\n");
    sb.append("    authMethodsEventSourceLocations: ").append(toIndentedString(authMethodsEventSourceLocations)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    clientCertData: ").append(toIndentedString(clientCertData)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    every: ").append(toIndentedString(every)).append("\n");
    sb.append("    gatewaysEventSourceLocations: ").append(toIndentedString(gatewaysEventSourceLocations)).append("\n");
    sb.append("    itemsEventSourceLocations: ").append(toIndentedString(itemsEventSourceLocations)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    privateKeyData: ").append(toIndentedString(privateKeyData)).append("\n");
    sb.append("    runnerType: ").append(toIndentedString(runnerType)).append("\n");
    sb.append("    serverCertificates: ").append(toIndentedString(serverCertificates)).append("\n");
    sb.append("    targetsEventSourceLocations: ").append(toIndentedString(targetsEventSourceLocations)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

}

