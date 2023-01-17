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
 * UpdateEventForwarder
 */

public class UpdateEventForwarder {
  public static final String SERIALIZED_NAME_ADMIN_NAME = "admin-name";
  @SerializedName(SERIALIZED_NAME_ADMIN_NAME)
  private String adminName;

  public static final String SERIALIZED_NAME_EMAIL_TO = "email-to";
  @SerializedName(SERIALIZED_NAME_EMAIL_TO)
  private String emailTo;

  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private String enable;

  public static final String SERIALIZED_NAME_EVENT_SOURCE_LOCATIONS = "event-source-locations";
  @SerializedName(SERIALIZED_NAME_EVENT_SOURCE_LOCATIONS)
  private List<String> eventSourceLocations = null;

  public static final String SERIALIZED_NAME_EVENT_TYPES = "event-types";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  private List<String> eventTypes = null;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_COMMENT = "new-comment";
  @SerializedName(SERIALIZED_NAME_NEW_COMMENT)
  private String newComment = "default_comment";

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public UpdateEventForwarder adminName(String adminName) {
    
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


  public UpdateEventForwarder emailTo(String emailTo) {
    
    this.emailTo = emailTo;
    return this;
  }

   /**
   * A comma seperated list of email addresses to send event to (relevant only for \\\&quot;email\\\&quot; Event Forwarder)
   * @return emailTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma seperated list of email addresses to send event to (relevant only for \\\"email\\\" Event Forwarder)")

  public String getEmailTo() {
    return emailTo;
  }


  public void setEmailTo(String emailTo) {
    this.emailTo = emailTo;
  }


  public UpdateEventForwarder enable(String enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * Enable
   * @return enable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable")

  public String getEnable() {
    return enable;
  }


  public void setEnable(String enable) {
    this.enable = enable;
  }


  public UpdateEventForwarder eventSourceLocations(List<String> eventSourceLocations) {
    
    this.eventSourceLocations = eventSourceLocations;
    return this;
  }

  public UpdateEventForwarder addEventSourceLocationsItem(String eventSourceLocationsItem) {
    if (this.eventSourceLocations == null) {
      this.eventSourceLocations = new ArrayList<String>();
    }
    this.eventSourceLocations.add(eventSourceLocationsItem);
    return this;
  }

   /**
   * Event sources
   * @return eventSourceLocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Event sources")

  public List<String> getEventSourceLocations() {
    return eventSourceLocations;
  }


  public void setEventSourceLocations(List<String> eventSourceLocations) {
    this.eventSourceLocations = eventSourceLocations;
  }


  public UpdateEventForwarder eventTypes(List<String> eventTypes) {
    
    this.eventTypes = eventTypes;
    return this;
  }

  public UpdateEventForwarder addEventTypesItem(String eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<String>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

   /**
   * Event types
   * @return eventTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Event types")

  public List<String> getEventTypes() {
    return eventTypes;
  }


  public void setEventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public UpdateEventForwarder host(String host) {
    
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


  public UpdateEventForwarder json(Boolean json) {
    
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


  public UpdateEventForwarder name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * EventForwarder name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "EventForwarder name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateEventForwarder newComment(String newComment) {
    
    this.newComment = newComment;
    return this;
  }

   /**
   * New comment about the Event Forwarder
   * @return newComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New comment about the Event Forwarder")

  public String getNewComment() {
    return newComment;
  }


  public void setNewComment(String newComment) {
    this.newComment = newComment;
  }


  public UpdateEventForwarder newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * New EventForwarder name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New EventForwarder name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public UpdateEventForwarder token(String token) {
    
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


  public UpdateEventForwarder uidToken(String uidToken) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEventForwarder updateEventForwarder = (UpdateEventForwarder) o;
    return Objects.equals(this.adminName, updateEventForwarder.adminName) &&
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
        Objects.equals(this.uidToken, updateEventForwarder.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminName, emailTo, enable, eventSourceLocations, eventTypes, host, json, name, newComment, newName, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEventForwarder {\n");
    sb.append("    adminName: ").append(toIndentedString(adminName)).append("\n");
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
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
