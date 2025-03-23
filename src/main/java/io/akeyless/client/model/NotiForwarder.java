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
import io.akeyless.client.model.EmailEntry;
import io.akeyless.client.model.ItemVersion;
import io.akeyless.client.model.WebHookNotiForwarderPublicDetails;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * NotiForwarder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class NotiForwarder {
  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  @javax.annotation.Nullable
  private String authType;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  @javax.annotation.Nullable
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_PERMISSIONS = "client_permissions";
  @SerializedName(SERIALIZED_NAME_CLIENT_PERMISSIONS)
  @javax.annotation.Nullable
  private List<String> clientPermissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  @javax.annotation.Nullable
  private String comment;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  @javax.annotation.Nullable
  private String endpoint;

  public static final String SERIALIZED_NAME_EVENT_TYPES = "event_types";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  @javax.annotation.Nullable
  private List<String> eventTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_GATEWAY_CLUSTER_ID = "gateway_cluster_id";
  @SerializedName(SERIALIZED_NAME_GATEWAY_CLUSTER_ID)
  @javax.annotation.Nullable
  private Long gatewayClusterId;

  public static final String SERIALIZED_NAME_INCLUDE_ERROR = "include_error";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ERROR)
  @javax.annotation.Nullable
  private Boolean includeError;

  public static final String SERIALIZED_NAME_IS_ENABLED = "is_enabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  @javax.annotation.Nullable
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_LAST_VERSION = "last_version";
  @SerializedName(SERIALIZED_NAME_LAST_VERSION)
  @javax.annotation.Nullable
  private Integer lastVersion;

  public static final String SERIALIZED_NAME_MODIFICATION_DATE = "modification_date";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime modificationDate;

  public static final String SERIALIZED_NAME_NOTI_FORWARDER_ID = "noti_forwarder_id";
  @SerializedName(SERIALIZED_NAME_NOTI_FORWARDER_ID)
  @javax.annotation.Nullable
  private Long notiForwarderId;

  public static final String SERIALIZED_NAME_NOTI_FORWARDER_NAME = "noti_forwarder_name";
  @SerializedName(SERIALIZED_NAME_NOTI_FORWARDER_NAME)
  @javax.annotation.Nullable
  private String notiForwarderName;

  public static final String SERIALIZED_NAME_NOTI_FORWARDER_TYPE = "noti_forwarder_type";
  @SerializedName(SERIALIZED_NAME_NOTI_FORWARDER_TYPE)
  @javax.annotation.Nullable
  private String notiForwarderType;

  public static final String SERIALIZED_NAME_NOTI_FORWARDER_VERSIONS = "noti_forwarder_versions";
  @SerializedName(SERIALIZED_NAME_NOTI_FORWARDER_VERSIONS)
  @javax.annotation.Nullable
  private List<ItemVersion> notiForwarderVersions = new ArrayList<>();

  public static final String SERIALIZED_NAME_OVERRIDE_URL = "override_url";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_URL)
  @javax.annotation.Nullable
  private String overrideUrl;

  public static final String SERIALIZED_NAME_PATHS = "paths";
  @SerializedName(SERIALIZED_NAME_PATHS)
  @javax.annotation.Nullable
  private List<String> paths = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROTECTION_KEY = "protection_key";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY)
  @javax.annotation.Nullable
  private String protectionKey;

  public static final String SERIALIZED_NAME_RUNNER_TYPE = "runner_type";
  @SerializedName(SERIALIZED_NAME_RUNNER_TYPE)
  @javax.annotation.Nullable
  private String runnerType;

  public static final String SERIALIZED_NAME_SLACK_NOTI_FORWARDER_PUBLIC_DETAILS = "slack_noti_forwarder_public_details";
  @SerializedName(SERIALIZED_NAME_SLACK_NOTI_FORWARDER_PUBLIC_DETAILS)
  @javax.annotation.Nullable
  private Object slackNotiForwarderPublicDetails;

  public static final String SERIALIZED_NAME_TIMESPAN_IN_SECONDS = "timespan_in_seconds";
  @SerializedName(SERIALIZED_NAME_TIMESPAN_IN_SECONDS)
  @javax.annotation.Nullable
  private Long timespanInSeconds;

  public static final String SERIALIZED_NAME_TO_EMAILS = "to_emails";
  @SerializedName(SERIALIZED_NAME_TO_EMAILS)
  @javax.annotation.Nullable
  private List<EmailEntry> toEmails = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_EMAIL = "user_email";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL)
  @javax.annotation.Nullable
  private String userEmail;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  @javax.annotation.Nullable
  private String username;

  public static final String SERIALIZED_NAME_WEBHOOK_NOTI_FORWARDER_PUBLIC_DETAILS = "webhook_noti_forwarder_public_details";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_NOTI_FORWARDER_PUBLIC_DETAILS)
  @javax.annotation.Nullable
  private WebHookNotiForwarderPublicDetails webhookNotiForwarderPublicDetails;

  public static final String SERIALIZED_NAME_WITH_CUSTOMER_FRAGMENT = "with_customer_fragment";
  @SerializedName(SERIALIZED_NAME_WITH_CUSTOMER_FRAGMENT)
  @javax.annotation.Nullable
  private Boolean withCustomerFragment;

  public NotiForwarder() {
  }

  public NotiForwarder authType(@javax.annotation.Nullable String authType) {
    this.authType = authType;
    return this;
  }

  /**
   * Get authType
   * @return authType
   */
  @javax.annotation.Nullable
  public String getAuthType() {
    return authType;
  }

  public void setAuthType(@javax.annotation.Nullable String authType) {
    this.authType = authType;
  }


  public NotiForwarder clientId(@javax.annotation.Nullable String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Auth - JWT
   * @return clientId
   */
  @javax.annotation.Nullable
  public String getClientId() {
    return clientId;
  }

  public void setClientId(@javax.annotation.Nullable String clientId) {
    this.clientId = clientId;
  }


  public NotiForwarder clientPermissions(@javax.annotation.Nullable List<String> clientPermissions) {
    this.clientPermissions = clientPermissions;
    return this;
  }

  public NotiForwarder addClientPermissionsItem(String clientPermissionsItem) {
    if (this.clientPermissions == null) {
      this.clientPermissions = new ArrayList<>();
    }
    this.clientPermissions.add(clientPermissionsItem);
    return this;
  }

  /**
   * Get clientPermissions
   * @return clientPermissions
   */
  @javax.annotation.Nullable
  public List<String> getClientPermissions() {
    return clientPermissions;
  }

  public void setClientPermissions(@javax.annotation.Nullable List<String> clientPermissions) {
    this.clientPermissions = clientPermissions;
  }


  public NotiForwarder comment(@javax.annotation.Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(@javax.annotation.Nullable String comment) {
    this.comment = comment;
  }


  public NotiForwarder creationDate(@javax.annotation.Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(@javax.annotation.Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public NotiForwarder endpoint(@javax.annotation.Nullable String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Get endpoint
   * @return endpoint
   */
  @javax.annotation.Nullable
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(@javax.annotation.Nullable String endpoint) {
    this.endpoint = endpoint;
  }


  public NotiForwarder eventTypes(@javax.annotation.Nullable List<String> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public NotiForwarder addEventTypesItem(String eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

  /**
   * Get eventTypes
   * @return eventTypes
   */
  @javax.annotation.Nullable
  public List<String> getEventTypes() {
    return eventTypes;
  }

  public void setEventTypes(@javax.annotation.Nullable List<String> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public NotiForwarder gatewayClusterId(@javax.annotation.Nullable Long gatewayClusterId) {
    this.gatewayClusterId = gatewayClusterId;
    return this;
  }

  /**
   * Get gatewayClusterId
   * @return gatewayClusterId
   */
  @javax.annotation.Nullable
  public Long getGatewayClusterId() {
    return gatewayClusterId;
  }

  public void setGatewayClusterId(@javax.annotation.Nullable Long gatewayClusterId) {
    this.gatewayClusterId = gatewayClusterId;
  }


  public NotiForwarder includeError(@javax.annotation.Nullable Boolean includeError) {
    this.includeError = includeError;
    return this;
  }

  /**
   * Get includeError
   * @return includeError
   */
  @javax.annotation.Nullable
  public Boolean getIncludeError() {
    return includeError;
  }

  public void setIncludeError(@javax.annotation.Nullable Boolean includeError) {
    this.includeError = includeError;
  }


  public NotiForwarder isEnabled(@javax.annotation.Nullable Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Get isEnabled
   * @return isEnabled
   */
  @javax.annotation.Nullable
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(@javax.annotation.Nullable Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public NotiForwarder lastVersion(@javax.annotation.Nullable Integer lastVersion) {
    this.lastVersion = lastVersion;
    return this;
  }

  /**
   * Get lastVersion
   * @return lastVersion
   */
  @javax.annotation.Nullable
  public Integer getLastVersion() {
    return lastVersion;
  }

  public void setLastVersion(@javax.annotation.Nullable Integer lastVersion) {
    this.lastVersion = lastVersion;
  }


  public NotiForwarder modificationDate(@javax.annotation.Nullable OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

  /**
   * Get modificationDate
   * @return modificationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(@javax.annotation.Nullable OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
  }


  public NotiForwarder notiForwarderId(@javax.annotation.Nullable Long notiForwarderId) {
    this.notiForwarderId = notiForwarderId;
    return this;
  }

  /**
   * Get notiForwarderId
   * @return notiForwarderId
   */
  @javax.annotation.Nullable
  public Long getNotiForwarderId() {
    return notiForwarderId;
  }

  public void setNotiForwarderId(@javax.annotation.Nullable Long notiForwarderId) {
    this.notiForwarderId = notiForwarderId;
  }


  public NotiForwarder notiForwarderName(@javax.annotation.Nullable String notiForwarderName) {
    this.notiForwarderName = notiForwarderName;
    return this;
  }

  /**
   * Get notiForwarderName
   * @return notiForwarderName
   */
  @javax.annotation.Nullable
  public String getNotiForwarderName() {
    return notiForwarderName;
  }

  public void setNotiForwarderName(@javax.annotation.Nullable String notiForwarderName) {
    this.notiForwarderName = notiForwarderName;
  }


  public NotiForwarder notiForwarderType(@javax.annotation.Nullable String notiForwarderType) {
    this.notiForwarderType = notiForwarderType;
    return this;
  }

  /**
   * Get notiForwarderType
   * @return notiForwarderType
   */
  @javax.annotation.Nullable
  public String getNotiForwarderType() {
    return notiForwarderType;
  }

  public void setNotiForwarderType(@javax.annotation.Nullable String notiForwarderType) {
    this.notiForwarderType = notiForwarderType;
  }


  public NotiForwarder notiForwarderVersions(@javax.annotation.Nullable List<ItemVersion> notiForwarderVersions) {
    this.notiForwarderVersions = notiForwarderVersions;
    return this;
  }

  public NotiForwarder addNotiForwarderVersionsItem(ItemVersion notiForwarderVersionsItem) {
    if (this.notiForwarderVersions == null) {
      this.notiForwarderVersions = new ArrayList<>();
    }
    this.notiForwarderVersions.add(notiForwarderVersionsItem);
    return this;
  }

  /**
   * Get notiForwarderVersions
   * @return notiForwarderVersions
   */
  @javax.annotation.Nullable
  public List<ItemVersion> getNotiForwarderVersions() {
    return notiForwarderVersions;
  }

  public void setNotiForwarderVersions(@javax.annotation.Nullable List<ItemVersion> notiForwarderVersions) {
    this.notiForwarderVersions = notiForwarderVersions;
  }


  public NotiForwarder overrideUrl(@javax.annotation.Nullable String overrideUrl) {
    this.overrideUrl = overrideUrl;
    return this;
  }

  /**
   * Get overrideUrl
   * @return overrideUrl
   */
  @javax.annotation.Nullable
  public String getOverrideUrl() {
    return overrideUrl;
  }

  public void setOverrideUrl(@javax.annotation.Nullable String overrideUrl) {
    this.overrideUrl = overrideUrl;
  }


  public NotiForwarder paths(@javax.annotation.Nullable List<String> paths) {
    this.paths = paths;
    return this;
  }

  public NotiForwarder addPathsItem(String pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<>();
    }
    this.paths.add(pathsItem);
    return this;
  }

  /**
   * Get paths
   * @return paths
   */
  @javax.annotation.Nullable
  public List<String> getPaths() {
    return paths;
  }

  public void setPaths(@javax.annotation.Nullable List<String> paths) {
    this.paths = paths;
  }


  public NotiForwarder protectionKey(@javax.annotation.Nullable String protectionKey) {
    this.protectionKey = protectionKey;
    return this;
  }

  /**
   * Get protectionKey
   * @return protectionKey
   */
  @javax.annotation.Nullable
  public String getProtectionKey() {
    return protectionKey;
  }

  public void setProtectionKey(@javax.annotation.Nullable String protectionKey) {
    this.protectionKey = protectionKey;
  }


  public NotiForwarder runnerType(@javax.annotation.Nullable String runnerType) {
    this.runnerType = runnerType;
    return this;
  }

  /**
   * Get runnerType
   * @return runnerType
   */
  @javax.annotation.Nullable
  public String getRunnerType() {
    return runnerType;
  }

  public void setRunnerType(@javax.annotation.Nullable String runnerType) {
    this.runnerType = runnerType;
  }


  public NotiForwarder slackNotiForwarderPublicDetails(@javax.annotation.Nullable Object slackNotiForwarderPublicDetails) {
    this.slackNotiForwarderPublicDetails = slackNotiForwarderPublicDetails;
    return this;
  }

  /**
   * Get slackNotiForwarderPublicDetails
   * @return slackNotiForwarderPublicDetails
   */
  @javax.annotation.Nullable
  public Object getSlackNotiForwarderPublicDetails() {
    return slackNotiForwarderPublicDetails;
  }

  public void setSlackNotiForwarderPublicDetails(@javax.annotation.Nullable Object slackNotiForwarderPublicDetails) {
    this.slackNotiForwarderPublicDetails = slackNotiForwarderPublicDetails;
  }


  public NotiForwarder timespanInSeconds(@javax.annotation.Nullable Long timespanInSeconds) {
    this.timespanInSeconds = timespanInSeconds;
    return this;
  }

  /**
   * Get timespanInSeconds
   * @return timespanInSeconds
   */
  @javax.annotation.Nullable
  public Long getTimespanInSeconds() {
    return timespanInSeconds;
  }

  public void setTimespanInSeconds(@javax.annotation.Nullable Long timespanInSeconds) {
    this.timespanInSeconds = timespanInSeconds;
  }


  public NotiForwarder toEmails(@javax.annotation.Nullable List<EmailEntry> toEmails) {
    this.toEmails = toEmails;
    return this;
  }

  public NotiForwarder addToEmailsItem(EmailEntry toEmailsItem) {
    if (this.toEmails == null) {
      this.toEmails = new ArrayList<>();
    }
    this.toEmails.add(toEmailsItem);
    return this;
  }

  /**
   * Get toEmails
   * @return toEmails
   */
  @javax.annotation.Nullable
  public List<EmailEntry> getToEmails() {
    return toEmails;
  }

  public void setToEmails(@javax.annotation.Nullable List<EmailEntry> toEmails) {
    this.toEmails = toEmails;
  }


  public NotiForwarder userEmail(@javax.annotation.Nullable String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * Get userEmail
   * @return userEmail
   */
  @javax.annotation.Nullable
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(@javax.annotation.Nullable String userEmail) {
    this.userEmail = userEmail;
  }


  public NotiForwarder username(@javax.annotation.Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Auth - User Password
   * @return username
   */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(@javax.annotation.Nullable String username) {
    this.username = username;
  }


  public NotiForwarder webhookNotiForwarderPublicDetails(@javax.annotation.Nullable WebHookNotiForwarderPublicDetails webhookNotiForwarderPublicDetails) {
    this.webhookNotiForwarderPublicDetails = webhookNotiForwarderPublicDetails;
    return this;
  }

  /**
   * Get webhookNotiForwarderPublicDetails
   * @return webhookNotiForwarderPublicDetails
   */
  @javax.annotation.Nullable
  public WebHookNotiForwarderPublicDetails getWebhookNotiForwarderPublicDetails() {
    return webhookNotiForwarderPublicDetails;
  }

  public void setWebhookNotiForwarderPublicDetails(@javax.annotation.Nullable WebHookNotiForwarderPublicDetails webhookNotiForwarderPublicDetails) {
    this.webhookNotiForwarderPublicDetails = webhookNotiForwarderPublicDetails;
  }


  public NotiForwarder withCustomerFragment(@javax.annotation.Nullable Boolean withCustomerFragment) {
    this.withCustomerFragment = withCustomerFragment;
    return this;
  }

  /**
   * Get withCustomerFragment
   * @return withCustomerFragment
   */
  @javax.annotation.Nullable
  public Boolean getWithCustomerFragment() {
    return withCustomerFragment;
  }

  public void setWithCustomerFragment(@javax.annotation.Nullable Boolean withCustomerFragment) {
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
    return Objects.equals(this.authType, notiForwarder.authType) &&
        Objects.equals(this.clientId, notiForwarder.clientId) &&
        Objects.equals(this.clientPermissions, notiForwarder.clientPermissions) &&
        Objects.equals(this.comment, notiForwarder.comment) &&
        Objects.equals(this.creationDate, notiForwarder.creationDate) &&
        Objects.equals(this.endpoint, notiForwarder.endpoint) &&
        Objects.equals(this.eventTypes, notiForwarder.eventTypes) &&
        Objects.equals(this.gatewayClusterId, notiForwarder.gatewayClusterId) &&
        Objects.equals(this.includeError, notiForwarder.includeError) &&
        Objects.equals(this.isEnabled, notiForwarder.isEnabled) &&
        Objects.equals(this.lastVersion, notiForwarder.lastVersion) &&
        Objects.equals(this.modificationDate, notiForwarder.modificationDate) &&
        Objects.equals(this.notiForwarderId, notiForwarder.notiForwarderId) &&
        Objects.equals(this.notiForwarderName, notiForwarder.notiForwarderName) &&
        Objects.equals(this.notiForwarderType, notiForwarder.notiForwarderType) &&
        Objects.equals(this.notiForwarderVersions, notiForwarder.notiForwarderVersions) &&
        Objects.equals(this.overrideUrl, notiForwarder.overrideUrl) &&
        Objects.equals(this.paths, notiForwarder.paths) &&
        Objects.equals(this.protectionKey, notiForwarder.protectionKey) &&
        Objects.equals(this.runnerType, notiForwarder.runnerType) &&
        Objects.equals(this.slackNotiForwarderPublicDetails, notiForwarder.slackNotiForwarderPublicDetails) &&
        Objects.equals(this.timespanInSeconds, notiForwarder.timespanInSeconds) &&
        Objects.equals(this.toEmails, notiForwarder.toEmails) &&
        Objects.equals(this.userEmail, notiForwarder.userEmail) &&
        Objects.equals(this.username, notiForwarder.username) &&
        Objects.equals(this.webhookNotiForwarderPublicDetails, notiForwarder.webhookNotiForwarderPublicDetails) &&
        Objects.equals(this.withCustomerFragment, notiForwarder.withCustomerFragment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, clientId, clientPermissions, comment, creationDate, endpoint, eventTypes, gatewayClusterId, includeError, isEnabled, lastVersion, modificationDate, notiForwarderId, notiForwarderName, notiForwarderType, notiForwarderVersions, overrideUrl, paths, protectionKey, runnerType, slackNotiForwarderPublicDetails, timespanInSeconds, toEmails, userEmail, username, webhookNotiForwarderPublicDetails, withCustomerFragment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotiForwarder {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientPermissions: ").append(toIndentedString(clientPermissions)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    gatewayClusterId: ").append(toIndentedString(gatewayClusterId)).append("\n");
    sb.append("    includeError: ").append(toIndentedString(includeError)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    lastVersion: ").append(toIndentedString(lastVersion)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    notiForwarderId: ").append(toIndentedString(notiForwarderId)).append("\n");
    sb.append("    notiForwarderName: ").append(toIndentedString(notiForwarderName)).append("\n");
    sb.append("    notiForwarderType: ").append(toIndentedString(notiForwarderType)).append("\n");
    sb.append("    notiForwarderVersions: ").append(toIndentedString(notiForwarderVersions)).append("\n");
    sb.append("    overrideUrl: ").append(toIndentedString(overrideUrl)).append("\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    protectionKey: ").append(toIndentedString(protectionKey)).append("\n");
    sb.append("    runnerType: ").append(toIndentedString(runnerType)).append("\n");
    sb.append("    slackNotiForwarderPublicDetails: ").append(toIndentedString(slackNotiForwarderPublicDetails)).append("\n");
    sb.append("    timespanInSeconds: ").append(toIndentedString(timespanInSeconds)).append("\n");
    sb.append("    toEmails: ").append(toIndentedString(toEmails)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    webhookNotiForwarderPublicDetails: ").append(toIndentedString(webhookNotiForwarderPublicDetails)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("auth_type");
    openapiFields.add("client_id");
    openapiFields.add("client_permissions");
    openapiFields.add("comment");
    openapiFields.add("creation_date");
    openapiFields.add("endpoint");
    openapiFields.add("event_types");
    openapiFields.add("gateway_cluster_id");
    openapiFields.add("include_error");
    openapiFields.add("is_enabled");
    openapiFields.add("last_version");
    openapiFields.add("modification_date");
    openapiFields.add("noti_forwarder_id");
    openapiFields.add("noti_forwarder_name");
    openapiFields.add("noti_forwarder_type");
    openapiFields.add("noti_forwarder_versions");
    openapiFields.add("override_url");
    openapiFields.add("paths");
    openapiFields.add("protection_key");
    openapiFields.add("runner_type");
    openapiFields.add("slack_noti_forwarder_public_details");
    openapiFields.add("timespan_in_seconds");
    openapiFields.add("to_emails");
    openapiFields.add("user_email");
    openapiFields.add("username");
    openapiFields.add("webhook_noti_forwarder_public_details");
    openapiFields.add("with_customer_fragment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NotiForwarder
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NotiForwarder.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotiForwarder is not found in the empty JSON string", NotiForwarder.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NotiForwarder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotiForwarder` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("auth_type") != null && !jsonObj.get("auth_type").isJsonNull()) && !jsonObj.get("auth_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_type").toString()));
      }
      if ((jsonObj.get("client_id") != null && !jsonObj.get("client_id").isJsonNull()) && !jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("client_permissions") != null && !jsonObj.get("client_permissions").isJsonNull() && !jsonObj.get("client_permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_permissions` to be an array in the JSON string but got `%s`", jsonObj.get("client_permissions").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("endpoint") != null && !jsonObj.get("endpoint").isJsonNull()) && !jsonObj.get("endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("event_types") != null && !jsonObj.get("event_types").isJsonNull() && !jsonObj.get("event_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_types` to be an array in the JSON string but got `%s`", jsonObj.get("event_types").toString()));
      }
      if ((jsonObj.get("noti_forwarder_name") != null && !jsonObj.get("noti_forwarder_name").isJsonNull()) && !jsonObj.get("noti_forwarder_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `noti_forwarder_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("noti_forwarder_name").toString()));
      }
      if ((jsonObj.get("noti_forwarder_type") != null && !jsonObj.get("noti_forwarder_type").isJsonNull()) && !jsonObj.get("noti_forwarder_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `noti_forwarder_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("noti_forwarder_type").toString()));
      }
      if (jsonObj.get("noti_forwarder_versions") != null && !jsonObj.get("noti_forwarder_versions").isJsonNull()) {
        JsonArray jsonArraynotiForwarderVersions = jsonObj.getAsJsonArray("noti_forwarder_versions");
        if (jsonArraynotiForwarderVersions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("noti_forwarder_versions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `noti_forwarder_versions` to be an array in the JSON string but got `%s`", jsonObj.get("noti_forwarder_versions").toString()));
          }

          // validate the optional field `noti_forwarder_versions` (array)
          for (int i = 0; i < jsonArraynotiForwarderVersions.size(); i++) {
            ItemVersion.validateJsonElement(jsonArraynotiForwarderVersions.get(i));
          };
        }
      }
      if ((jsonObj.get("override_url") != null && !jsonObj.get("override_url").isJsonNull()) && !jsonObj.get("override_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `override_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("override_url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("paths") != null && !jsonObj.get("paths").isJsonNull() && !jsonObj.get("paths").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `paths` to be an array in the JSON string but got `%s`", jsonObj.get("paths").toString()));
      }
      if ((jsonObj.get("protection_key") != null && !jsonObj.get("protection_key").isJsonNull()) && !jsonObj.get("protection_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protection_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protection_key").toString()));
      }
      if ((jsonObj.get("runner_type") != null && !jsonObj.get("runner_type").isJsonNull()) && !jsonObj.get("runner_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runner_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runner_type").toString()));
      }
      if (jsonObj.get("to_emails") != null && !jsonObj.get("to_emails").isJsonNull()) {
        JsonArray jsonArraytoEmails = jsonObj.getAsJsonArray("to_emails");
        if (jsonArraytoEmails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("to_emails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `to_emails` to be an array in the JSON string but got `%s`", jsonObj.get("to_emails").toString()));
          }

          // validate the optional field `to_emails` (array)
          for (int i = 0; i < jsonArraytoEmails.size(); i++) {
            EmailEntry.validateJsonElement(jsonArraytoEmails.get(i));
          };
        }
      }
      if ((jsonObj.get("user_email") != null && !jsonObj.get("user_email").isJsonNull()) && !jsonObj.get("user_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_email").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      // validate the optional field `webhook_noti_forwarder_public_details`
      if (jsonObj.get("webhook_noti_forwarder_public_details") != null && !jsonObj.get("webhook_noti_forwarder_public_details").isJsonNull()) {
        WebHookNotiForwarderPublicDetails.validateJsonElement(jsonObj.get("webhook_noti_forwarder_public_details"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotiForwarder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotiForwarder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotiForwarder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotiForwarder.class));

       return (TypeAdapter<T>) new TypeAdapter<NotiForwarder>() {
           @Override
           public void write(JsonWriter out, NotiForwarder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotiForwarder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NotiForwarder given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NotiForwarder
   * @throws IOException if the JSON string is invalid with respect to NotiForwarder
   */
  public static NotiForwarder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotiForwarder.class);
  }

  /**
   * Convert an instance of NotiForwarder to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

