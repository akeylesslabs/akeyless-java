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
 * eventForwarderCreateSlack is a command that creates slack event forwarder
 */
@ApiModel(description = "eventForwarderCreateSlack is a command that creates slack event forwarder")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventForwarderCreateSlack {
  public static final String SERIALIZED_NAME_AUTH_METHODS_EVENT_SOURCE_LOCATIONS = "auth-methods-event-source-locations";
  @SerializedName(SERIALIZED_NAME_AUTH_METHODS_EVENT_SOURCE_LOCATIONS)
  private List<String> authMethodsEventSourceLocations = null;

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

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public EventForwarderCreateSlack() { 
  }

  public EventForwarderCreateSlack authMethodsEventSourceLocations(List<String> authMethodsEventSourceLocations) {
    
    this.authMethodsEventSourceLocations = authMethodsEventSourceLocations;
    return this;
  }

  public EventForwarderCreateSlack addAuthMethodsEventSourceLocationsItem(String authMethodsEventSourceLocationsItem) {
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


  public EventForwarderCreateSlack description(String description) {
    
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


  public EventForwarderCreateSlack eventTypes(List<String> eventTypes) {
    
    this.eventTypes = eventTypes;
    return this;
  }

  public EventForwarderCreateSlack addEventTypesItem(String eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<String>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

   /**
   * List of event types to notify about [request-access, certificate-pending-expiration, certificate-expired, certificate-provisioning-success, certificate-provisioning-failure, auth-method-pending-expiration, auth-method-expired, next-automatic-rotation, rotated-secret-success, rotated-secret-failure, dynamic-secret-failure, multi-auth-failure, uid-rotation-failure, apply-justification, email-auth-method-approved, usage, rotation-usage, gateway-inactive, static-secret-updated]
   * @return eventTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of event types to notify about [request-access, certificate-pending-expiration, certificate-expired, certificate-provisioning-success, certificate-provisioning-failure, auth-method-pending-expiration, auth-method-expired, next-automatic-rotation, rotated-secret-success, rotated-secret-failure, dynamic-secret-failure, multi-auth-failure, uid-rotation-failure, apply-justification, email-auth-method-approved, usage, rotation-usage, gateway-inactive, static-secret-updated]")

  public List<String> getEventTypes() {
    return eventTypes;
  }


  public void setEventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public EventForwarderCreateSlack every(String every) {
    
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


  public EventForwarderCreateSlack gatewaysEventSourceLocations(List<String> gatewaysEventSourceLocations) {
    
    this.gatewaysEventSourceLocations = gatewaysEventSourceLocations;
    return this;
  }

  public EventForwarderCreateSlack addGatewaysEventSourceLocationsItem(String gatewaysEventSourceLocationsItem) {
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


  public EventForwarderCreateSlack itemsEventSourceLocations(List<String> itemsEventSourceLocations) {
    
    this.itemsEventSourceLocations = itemsEventSourceLocations;
    return this;
  }

  public EventForwarderCreateSlack addItemsEventSourceLocationsItem(String itemsEventSourceLocationsItem) {
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


  public EventForwarderCreateSlack json(Boolean json) {
    
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


  public EventForwarderCreateSlack key(String key) {
    
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


  public EventForwarderCreateSlack name(String name) {
    
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


  public EventForwarderCreateSlack runnerType(String runnerType) {
    
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


  public EventForwarderCreateSlack targetsEventSourceLocations(List<String> targetsEventSourceLocations) {
    
    this.targetsEventSourceLocations = targetsEventSourceLocations;
    return this;
  }

  public EventForwarderCreateSlack addTargetsEventSourceLocationsItem(String targetsEventSourceLocationsItem) {
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


  public EventForwarderCreateSlack token(String token) {
    
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


  public EventForwarderCreateSlack uidToken(String uidToken) {
    
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


  public EventForwarderCreateSlack url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Slack Webhook URL
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Slack Webhook URL")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventForwarderCreateSlack eventForwarderCreateSlack = (EventForwarderCreateSlack) o;
    return Objects.equals(this.authMethodsEventSourceLocations, eventForwarderCreateSlack.authMethodsEventSourceLocations) &&
        Objects.equals(this.description, eventForwarderCreateSlack.description) &&
        Objects.equals(this.eventTypes, eventForwarderCreateSlack.eventTypes) &&
        Objects.equals(this.every, eventForwarderCreateSlack.every) &&
        Objects.equals(this.gatewaysEventSourceLocations, eventForwarderCreateSlack.gatewaysEventSourceLocations) &&
        Objects.equals(this.itemsEventSourceLocations, eventForwarderCreateSlack.itemsEventSourceLocations) &&
        Objects.equals(this.json, eventForwarderCreateSlack.json) &&
        Objects.equals(this.key, eventForwarderCreateSlack.key) &&
        Objects.equals(this.name, eventForwarderCreateSlack.name) &&
        Objects.equals(this.runnerType, eventForwarderCreateSlack.runnerType) &&
        Objects.equals(this.targetsEventSourceLocations, eventForwarderCreateSlack.targetsEventSourceLocations) &&
        Objects.equals(this.token, eventForwarderCreateSlack.token) &&
        Objects.equals(this.uidToken, eventForwarderCreateSlack.uidToken) &&
        Objects.equals(this.url, eventForwarderCreateSlack.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authMethodsEventSourceLocations, description, eventTypes, every, gatewaysEventSourceLocations, itemsEventSourceLocations, json, key, name, runnerType, targetsEventSourceLocations, token, uidToken, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventForwarderCreateSlack {\n");
    sb.append("    authMethodsEventSourceLocations: ").append(toIndentedString(authMethodsEventSourceLocations)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    every: ").append(toIndentedString(every)).append("\n");
    sb.append("    gatewaysEventSourceLocations: ").append(toIndentedString(gatewaysEventSourceLocations)).append("\n");
    sb.append("    itemsEventSourceLocations: ").append(toIndentedString(itemsEventSourceLocations)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    runnerType: ").append(toIndentedString(runnerType)).append("\n");
    sb.append("    targetsEventSourceLocations: ").append(toIndentedString(targetsEventSourceLocations)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
