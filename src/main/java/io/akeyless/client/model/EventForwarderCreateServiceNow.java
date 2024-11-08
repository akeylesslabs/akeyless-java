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
 * eventForwarderCreateServiceNow is a command that creates service-now event forwarder
 */
@ApiModel(description = "eventForwarderCreateServiceNow is a command that creates service-now event forwarder")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventForwarderCreateServiceNow {
  public static final String SERIALIZED_NAME_ADMIN_NAME = "admin-name";
  @SerializedName(SERIALIZED_NAME_ADMIN_NAME)
  private String adminName;

  public static final String SERIALIZED_NAME_ADMIN_PWD = "admin-pwd";
  @SerializedName(SERIALIZED_NAME_ADMIN_PWD)
  private String adminPwd;

  public static final String SERIALIZED_NAME_APP_PRIVATE_KEY_BASE64 = "app-private-key-base64";
  @SerializedName(SERIALIZED_NAME_APP_PRIVATE_KEY_BASE64)
  private String appPrivateKeyBase64;

  public static final String SERIALIZED_NAME_AUTH_METHODS_EVENT_SOURCE_LOCATIONS = "auth-methods-event-source-locations";
  @SerializedName(SERIALIZED_NAME_AUTH_METHODS_EVENT_SOURCE_LOCATIONS)
  private List<String> authMethodsEventSourceLocations = null;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth-type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private String authType = "user-pass";

  public static final String SERIALIZED_NAME_CLIENT_ID = "client-id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client-secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

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

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

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

  public static final String SERIALIZED_NAME_RUNNER_TYPE = "runner-type";
  @SerializedName(SERIALIZED_NAME_RUNNER_TYPE)
  private String runnerType;

  public static final String SERIALIZED_NAME_TARGETS_EVENT_SOURCE_LOCATIONS = "targets-event-source-locations";
  @SerializedName(SERIALIZED_NAME_TARGETS_EVENT_SOURCE_LOCATIONS)
  private List<String> targetsEventSourceLocations = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_EMAIL = "user-email";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL)
  private String userEmail;

  public EventForwarderCreateServiceNow() { 
  }

  public EventForwarderCreateServiceNow adminName(String adminName) {
    
    this.adminName = adminName;
    return this;
  }

   /**
   * Workstation Admin Name
   * @return adminName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Workstation Admin Name")

  public String getAdminName() {
    return adminName;
  }


  public void setAdminName(String adminName) {
    this.adminName = adminName;
  }


  public EventForwarderCreateServiceNow adminPwd(String adminPwd) {
    
    this.adminPwd = adminPwd;
    return this;
  }

   /**
   * Workstation Admin Password
   * @return adminPwd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Workstation Admin Password")

  public String getAdminPwd() {
    return adminPwd;
  }


  public void setAdminPwd(String adminPwd) {
    this.adminPwd = adminPwd;
  }


  public EventForwarderCreateServiceNow appPrivateKeyBase64(String appPrivateKeyBase64) {
    
    this.appPrivateKeyBase64 = appPrivateKeyBase64;
    return this;
  }

   /**
   * The RSA Private Key to use when connecting with jwt authentication
   * @return appPrivateKeyBase64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The RSA Private Key to use when connecting with jwt authentication")

  public String getAppPrivateKeyBase64() {
    return appPrivateKeyBase64;
  }


  public void setAppPrivateKeyBase64(String appPrivateKeyBase64) {
    this.appPrivateKeyBase64 = appPrivateKeyBase64;
  }


  public EventForwarderCreateServiceNow authMethodsEventSourceLocations(List<String> authMethodsEventSourceLocations) {
    
    this.authMethodsEventSourceLocations = authMethodsEventSourceLocations;
    return this;
  }

  public EventForwarderCreateServiceNow addAuthMethodsEventSourceLocationsItem(String authMethodsEventSourceLocationsItem) {
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


  public EventForwarderCreateServiceNow authType(String authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * The authentication type to use [user-pass/jwt]
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The authentication type to use [user-pass/jwt]")

  public String getAuthType() {
    return authType;
  }


  public void setAuthType(String authType) {
    this.authType = authType;
  }


  public EventForwarderCreateServiceNow clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The client ID to use when connecting with jwt authentication
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The client ID to use when connecting with jwt authentication")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public EventForwarderCreateServiceNow clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * The client secret to use when connecting with jwt authentication
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The client secret to use when connecting with jwt authentication")

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public EventForwarderCreateServiceNow description(String description) {
    
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


  public EventForwarderCreateServiceNow eventTypes(List<String> eventTypes) {
    
    this.eventTypes = eventTypes;
    return this;
  }

  public EventForwarderCreateServiceNow addEventTypesItem(String eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<String>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

   /**
   * List of event types to notify about [request-access, certificate-pending-expiration, certificate-expired, certificate-provisioning-success, certificate-provisioning-failure, auth-method-pending-expiration, auth-method-expired, next-automatic-rotation, rotated-secret-success, rotated-secret-failure, dynamic-secret-failure, multi-auth-failure, uid-rotation-failure, apply-justification, email-auth-method-approved, usage, rotation-usage, gateway-inactive, static-secret-updated, rate-limiting, usage-report]
   * @return eventTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of event types to notify about [request-access, certificate-pending-expiration, certificate-expired, certificate-provisioning-success, certificate-provisioning-failure, auth-method-pending-expiration, auth-method-expired, next-automatic-rotation, rotated-secret-success, rotated-secret-failure, dynamic-secret-failure, multi-auth-failure, uid-rotation-failure, apply-justification, email-auth-method-approved, usage, rotation-usage, gateway-inactive, static-secret-updated, rate-limiting, usage-report]")

  public List<String> getEventTypes() {
    return eventTypes;
  }


  public void setEventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public EventForwarderCreateServiceNow every(String every) {
    
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


  public EventForwarderCreateServiceNow gatewaysEventSourceLocations(List<String> gatewaysEventSourceLocations) {
    
    this.gatewaysEventSourceLocations = gatewaysEventSourceLocations;
    return this;
  }

  public EventForwarderCreateServiceNow addGatewaysEventSourceLocationsItem(String gatewaysEventSourceLocationsItem) {
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


  public EventForwarderCreateServiceNow host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Workstation Host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Workstation Host")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public EventForwarderCreateServiceNow itemsEventSourceLocations(List<String> itemsEventSourceLocations) {
    
    this.itemsEventSourceLocations = itemsEventSourceLocations;
    return this;
  }

  public EventForwarderCreateServiceNow addItemsEventSourceLocationsItem(String itemsEventSourceLocationsItem) {
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


  public EventForwarderCreateServiceNow json(Boolean json) {
    
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


  public EventForwarderCreateServiceNow key(String key) {
    
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


  public EventForwarderCreateServiceNow name(String name) {
    
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


  public EventForwarderCreateServiceNow runnerType(String runnerType) {
    
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


  public EventForwarderCreateServiceNow targetsEventSourceLocations(List<String> targetsEventSourceLocations) {
    
    this.targetsEventSourceLocations = targetsEventSourceLocations;
    return this;
  }

  public EventForwarderCreateServiceNow addTargetsEventSourceLocationsItem(String targetsEventSourceLocationsItem) {
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


  public EventForwarderCreateServiceNow token(String token) {
    
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


  public EventForwarderCreateServiceNow uidToken(String uidToken) {
    
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


  public EventForwarderCreateServiceNow userEmail(String userEmail) {
    
    this.userEmail = userEmail;
    return this;
  }

   /**
   * The user email to identify with when connecting with jwt authentication
   * @return userEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user email to identify with when connecting with jwt authentication")

  public String getUserEmail() {
    return userEmail;
  }


  public void setUserEmail(String userEmail) {
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

}

