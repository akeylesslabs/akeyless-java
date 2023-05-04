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
import io.akeyless.client.model.EmailEntry;
import io.akeyless.client.model.ItemVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * NotiForwarder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotiForwarder {
  public static final String SERIALIZED_NAME_CLIENT_PERMISSIONS = "client_permissions";
  @SerializedName(SERIALIZED_NAME_CLIENT_PERMISSIONS)
  private List<String> clientPermissions = null;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_EVENT_TYPES = "event_types";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  private List<String> eventTypes = null;

  public static final String SERIALIZED_NAME_GATEWAY_CLUSTER_ID = "gateway_cluster_id";
  @SerializedName(SERIALIZED_NAME_GATEWAY_CLUSTER_ID)
  private Long gatewayClusterId;

  public static final String SERIALIZED_NAME_IS_ENABLED = "is_enabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_LAST_VERSION = "last_version";
  @SerializedName(SERIALIZED_NAME_LAST_VERSION)
  private Integer lastVersion;

  public static final String SERIALIZED_NAME_MODIFICATION_DATE = "modification_date";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_DATE)
  private OffsetDateTime modificationDate;

  public static final String SERIALIZED_NAME_NOTI_FORWARDER_ID = "noti_forwarder_id";
  @SerializedName(SERIALIZED_NAME_NOTI_FORWARDER_ID)
  private Long notiForwarderId;

  public static final String SERIALIZED_NAME_NOTI_FORWARDER_NAME = "noti_forwarder_name";
  @SerializedName(SERIALIZED_NAME_NOTI_FORWARDER_NAME)
  private String notiForwarderName;

  public static final String SERIALIZED_NAME_NOTI_FORWARDER_TYPE = "noti_forwarder_type";
  @SerializedName(SERIALIZED_NAME_NOTI_FORWARDER_TYPE)
  private String notiForwarderType;

  public static final String SERIALIZED_NAME_NOTI_FORWARDER_VERSIONS = "noti_forwarder_versions";
  @SerializedName(SERIALIZED_NAME_NOTI_FORWARDER_VERSIONS)
  private List<ItemVersion> notiForwarderVersions = null;

  public static final String SERIALIZED_NAME_PATHS = "paths";
  @SerializedName(SERIALIZED_NAME_PATHS)
  private List<String> paths = null;

  public static final String SERIALIZED_NAME_PROTECTION_KEY = "protection_key";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY)
  private String protectionKey;

  public static final String SERIALIZED_NAME_RUNNER_TYPE = "runner_type";
  @SerializedName(SERIALIZED_NAME_RUNNER_TYPE)
  private String runnerType;

  public static final String SERIALIZED_NAME_TIMESPAN_IN_SECONDS = "timespan_in_seconds";
  @SerializedName(SERIALIZED_NAME_TIMESPAN_IN_SECONDS)
  private Long timespanInSeconds;

  public static final String SERIALIZED_NAME_TO_EMAILS = "to_emails";
  @SerializedName(SERIALIZED_NAME_TO_EMAILS)
  private List<EmailEntry> toEmails = null;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_WITH_CUSTOMER_FRAGMENT = "with_customer_fragment";
  @SerializedName(SERIALIZED_NAME_WITH_CUSTOMER_FRAGMENT)
  private Boolean withCustomerFragment;

  public NotiForwarder() { 
  }

  public NotiForwarder clientPermissions(List<String> clientPermissions) {
    
    this.clientPermissions = clientPermissions;
    return this;
  }

  public NotiForwarder addClientPermissionsItem(String clientPermissionsItem) {
    if (this.clientPermissions == null) {
      this.clientPermissions = new ArrayList<String>();
    }
    this.clientPermissions.add(clientPermissionsItem);
    return this;
  }

   /**
   * Get clientPermissions
   * @return clientPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getClientPermissions() {
    return clientPermissions;
  }


  public void setClientPermissions(List<String> clientPermissions) {
    this.clientPermissions = clientPermissions;
  }


  public NotiForwarder comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public NotiForwarder creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public NotiForwarder endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public NotiForwarder eventTypes(List<String> eventTypes) {
    
    this.eventTypes = eventTypes;
    return this;
  }

  public NotiForwarder addEventTypesItem(String eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<String>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

   /**
   * Get eventTypes
   * @return eventTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEventTypes() {
    return eventTypes;
  }


  public void setEventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public NotiForwarder gatewayClusterId(Long gatewayClusterId) {
    
    this.gatewayClusterId = gatewayClusterId;
    return this;
  }

   /**
   * Get gatewayClusterId
   * @return gatewayClusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGatewayClusterId() {
    return gatewayClusterId;
  }


  public void setGatewayClusterId(Long gatewayClusterId) {
    this.gatewayClusterId = gatewayClusterId;
  }


  public NotiForwarder isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public NotiForwarder lastVersion(Integer lastVersion) {
    
    this.lastVersion = lastVersion;
    return this;
  }

   /**
   * Get lastVersion
   * @return lastVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastVersion() {
    return lastVersion;
  }


  public void setLastVersion(Integer lastVersion) {
    this.lastVersion = lastVersion;
  }


  public NotiForwarder modificationDate(OffsetDateTime modificationDate) {
    
    this.modificationDate = modificationDate;
    return this;
  }

   /**
   * Get modificationDate
   * @return modificationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModificationDate() {
    return modificationDate;
  }


  public void setModificationDate(OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
  }


  public NotiForwarder notiForwarderId(Long notiForwarderId) {
    
    this.notiForwarderId = notiForwarderId;
    return this;
  }

   /**
   * Get notiForwarderId
   * @return notiForwarderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getNotiForwarderId() {
    return notiForwarderId;
  }


  public void setNotiForwarderId(Long notiForwarderId) {
    this.notiForwarderId = notiForwarderId;
  }


  public NotiForwarder notiForwarderName(String notiForwarderName) {
    
    this.notiForwarderName = notiForwarderName;
    return this;
  }

   /**
   * Get notiForwarderName
   * @return notiForwarderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNotiForwarderName() {
    return notiForwarderName;
  }


  public void setNotiForwarderName(String notiForwarderName) {
    this.notiForwarderName = notiForwarderName;
  }


  public NotiForwarder notiForwarderType(String notiForwarderType) {
    
    this.notiForwarderType = notiForwarderType;
    return this;
  }

   /**
   * Get notiForwarderType
   * @return notiForwarderType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNotiForwarderType() {
    return notiForwarderType;
  }


  public void setNotiForwarderType(String notiForwarderType) {
    this.notiForwarderType = notiForwarderType;
  }


  public NotiForwarder notiForwarderVersions(List<ItemVersion> notiForwarderVersions) {
    
    this.notiForwarderVersions = notiForwarderVersions;
    return this;
  }

  public NotiForwarder addNotiForwarderVersionsItem(ItemVersion notiForwarderVersionsItem) {
    if (this.notiForwarderVersions == null) {
      this.notiForwarderVersions = new ArrayList<ItemVersion>();
    }
    this.notiForwarderVersions.add(notiForwarderVersionsItem);
    return this;
  }

   /**
   * Get notiForwarderVersions
   * @return notiForwarderVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ItemVersion> getNotiForwarderVersions() {
    return notiForwarderVersions;
  }


  public void setNotiForwarderVersions(List<ItemVersion> notiForwarderVersions) {
    this.notiForwarderVersions = notiForwarderVersions;
  }


  public NotiForwarder paths(List<String> paths) {
    
    this.paths = paths;
    return this;
  }

  public NotiForwarder addPathsItem(String pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<String>();
    }
    this.paths.add(pathsItem);
    return this;
  }

   /**
   * Get paths
   * @return paths
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPaths() {
    return paths;
  }


  public void setPaths(List<String> paths) {
    this.paths = paths;
  }


  public NotiForwarder protectionKey(String protectionKey) {
    
    this.protectionKey = protectionKey;
    return this;
  }

   /**
   * Get protectionKey
   * @return protectionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProtectionKey() {
    return protectionKey;
  }


  public void setProtectionKey(String protectionKey) {
    this.protectionKey = protectionKey;
  }


  public NotiForwarder runnerType(String runnerType) {
    
    this.runnerType = runnerType;
    return this;
  }

   /**
   * Get runnerType
   * @return runnerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunnerType() {
    return runnerType;
  }


  public void setRunnerType(String runnerType) {
    this.runnerType = runnerType;
  }


  public NotiForwarder timespanInSeconds(Long timespanInSeconds) {
    
    this.timespanInSeconds = timespanInSeconds;
    return this;
  }

   /**
   * Get timespanInSeconds
   * @return timespanInSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTimespanInSeconds() {
    return timespanInSeconds;
  }


  public void setTimespanInSeconds(Long timespanInSeconds) {
    this.timespanInSeconds = timespanInSeconds;
  }


  public NotiForwarder toEmails(List<EmailEntry> toEmails) {
    
    this.toEmails = toEmails;
    return this;
  }

  public NotiForwarder addToEmailsItem(EmailEntry toEmailsItem) {
    if (this.toEmails == null) {
      this.toEmails = new ArrayList<EmailEntry>();
    }
    this.toEmails.add(toEmailsItem);
    return this;
  }

   /**
   * Get toEmails
   * @return toEmails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EmailEntry> getToEmails() {
    return toEmails;
  }


  public void setToEmails(List<EmailEntry> toEmails) {
    this.toEmails = toEmails;
  }


  public NotiForwarder username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public NotiForwarder withCustomerFragment(Boolean withCustomerFragment) {
    
    this.withCustomerFragment = withCustomerFragment;
    return this;
  }

   /**
   * Get withCustomerFragment
   * @return withCustomerFragment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWithCustomerFragment() {
    return withCustomerFragment;
  }


  public void setWithCustomerFragment(Boolean withCustomerFragment) {
    this.withCustomerFragment = withCustomerFragment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotiForwarder notiForwarder = (NotiForwarder) o;
    return Objects.equals(this.clientPermissions, notiForwarder.clientPermissions) &&
        Objects.equals(this.comment, notiForwarder.comment) &&
        Objects.equals(this.creationDate, notiForwarder.creationDate) &&
        Objects.equals(this.endpoint, notiForwarder.endpoint) &&
        Objects.equals(this.eventTypes, notiForwarder.eventTypes) &&
        Objects.equals(this.gatewayClusterId, notiForwarder.gatewayClusterId) &&
        Objects.equals(this.isEnabled, notiForwarder.isEnabled) &&
        Objects.equals(this.lastVersion, notiForwarder.lastVersion) &&
        Objects.equals(this.modificationDate, notiForwarder.modificationDate) &&
        Objects.equals(this.notiForwarderId, notiForwarder.notiForwarderId) &&
        Objects.equals(this.notiForwarderName, notiForwarder.notiForwarderName) &&
        Objects.equals(this.notiForwarderType, notiForwarder.notiForwarderType) &&
        Objects.equals(this.notiForwarderVersions, notiForwarder.notiForwarderVersions) &&
        Objects.equals(this.paths, notiForwarder.paths) &&
        Objects.equals(this.protectionKey, notiForwarder.protectionKey) &&
        Objects.equals(this.runnerType, notiForwarder.runnerType) &&
        Objects.equals(this.timespanInSeconds, notiForwarder.timespanInSeconds) &&
        Objects.equals(this.toEmails, notiForwarder.toEmails) &&
        Objects.equals(this.username, notiForwarder.username) &&
        Objects.equals(this.withCustomerFragment, notiForwarder.withCustomerFragment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientPermissions, comment, creationDate, endpoint, eventTypes, gatewayClusterId, isEnabled, lastVersion, modificationDate, notiForwarderId, notiForwarderName, notiForwarderType, notiForwarderVersions, paths, protectionKey, runnerType, timespanInSeconds, toEmails, username, withCustomerFragment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotiForwarder {\n");
    sb.append("    clientPermissions: ").append(toIndentedString(clientPermissions)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    gatewayClusterId: ").append(toIndentedString(gatewayClusterId)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    lastVersion: ").append(toIndentedString(lastVersion)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    notiForwarderId: ").append(toIndentedString(notiForwarderId)).append("\n");
    sb.append("    notiForwarderName: ").append(toIndentedString(notiForwarderName)).append("\n");
    sb.append("    notiForwarderType: ").append(toIndentedString(notiForwarderType)).append("\n");
    sb.append("    notiForwarderVersions: ").append(toIndentedString(notiForwarderVersions)).append("\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    protectionKey: ").append(toIndentedString(protectionKey)).append("\n");
    sb.append("    runnerType: ").append(toIndentedString(runnerType)).append("\n");
    sb.append("    timespanInSeconds: ").append(toIndentedString(timespanInSeconds)).append("\n");
    sb.append("    toEmails: ").append(toIndentedString(toEmails)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    withCustomerFragment: ").append(toIndentedString(withCustomerFragment)).append("\n");
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

