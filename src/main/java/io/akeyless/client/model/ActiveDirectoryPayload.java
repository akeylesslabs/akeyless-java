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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * ActiveDirectoryPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ActiveDirectoryPayload {
  public static final String SERIALIZED_NAME_ACTIVE_DIRECTORY_TARGET_ID = "active_directory_target_id";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DIRECTORY_TARGET_ID)
  @javax.annotation.Nullable
  private Long activeDirectoryTargetId;

  public static final String SERIALIZED_NAME_AUTO_ROTATE = "auto_rotate";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE)
  @javax.annotation.Nullable
  private Boolean autoRotate;

  public static final String SERIALIZED_NAME_AUTO_ROTATE_INTERVAL_IN_DAYS = "auto_rotate_interval_in_days";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE_INTERVAL_IN_DAYS)
  @javax.annotation.Nullable
  private Integer autoRotateIntervalInDays;

  public static final String SERIALIZED_NAME_AUTO_ROTATE_ROTATION_HOUR = "auto_rotate_rotation_hour";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE_ROTATION_HOUR)
  @javax.annotation.Nullable
  private Integer autoRotateRotationHour;

  public static final String SERIALIZED_NAME_COMPUTER_BASE_DN = "computer_base_dn";
  @SerializedName(SERIALIZED_NAME_COMPUTER_BASE_DN)
  @javax.annotation.Nullable
  private String computerBaseDn;

  public static final String SERIALIZED_NAME_DISCOVER_LOCAL_USERS = "discover_local_users";
  @SerializedName(SERIALIZED_NAME_DISCOVER_LOCAL_USERS)
  @javax.annotation.Nullable
  private Boolean discoverLocalUsers;

  public static final String SERIALIZED_NAME_DISCOVER_SERVICES = "discover_services";
  @SerializedName(SERIALIZED_NAME_DISCOVER_SERVICES)
  @javax.annotation.Nullable
  private Boolean discoverServices;

  public static final String SERIALIZED_NAME_DISCOVERY_TYPES = "discovery_types";
  @SerializedName(SERIALIZED_NAME_DISCOVERY_TYPES)
  @javax.annotation.Nullable
  private List<String> discoveryTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domain_name";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  @javax.annotation.Nullable
  private String domainName;

  public static final String SERIALIZED_NAME_DOMAIN_SERVER_TARGETS_PATH_TEMPLATE = "domain_server_targets_path_template";
  @SerializedName(SERIALIZED_NAME_DOMAIN_SERVER_TARGETS_PATH_TEMPLATE)
  @javax.annotation.Nullable
  private String domainServerTargetsPathTemplate;

  public static final String SERIALIZED_NAME_DOMAIN_USERS_ROTATED_SECRETS_PATH_TEMPLATE = "domain_users_rotated_secrets_path_template";
  @SerializedName(SERIALIZED_NAME_DOMAIN_USERS_ROTATED_SECRETS_PATH_TEMPLATE)
  @javax.annotation.Nullable
  private String domainUsersRotatedSecretsPathTemplate;

  public static final String SERIALIZED_NAME_ENABLE_RDP_SRA = "enable_rdp_sra";
  @SerializedName(SERIALIZED_NAME_ENABLE_RDP_SRA)
  @javax.annotation.Nullable
  private Boolean enableRdpSra;

  public static final String SERIALIZED_NAME_LOCAL_USERS_IGNORE_LIST = "local_users_ignore_list";
  @SerializedName(SERIALIZED_NAME_LOCAL_USERS_IGNORE_LIST)
  @javax.annotation.Nullable
  private Map<String, Boolean> localUsersIgnoreList = new HashMap<>();

  public static final String SERIALIZED_NAME_LOCAL_USERS_ROTATED_SECRETS_PATH_TEMPLATE = "local_users_rotated_secrets_path_template";
  @SerializedName(SERIALIZED_NAME_LOCAL_USERS_ROTATED_SECRETS_PATH_TEMPLATE)
  @javax.annotation.Nullable
  private String localUsersRotatedSecretsPathTemplate;

  public static final String SERIALIZED_NAME_OS_FILTER = "os_filter";
  @SerializedName(SERIALIZED_NAME_OS_FILTER)
  @javax.annotation.Nullable
  private String osFilter;

  public static final String SERIALIZED_NAME_SSH_PORT = "ssh_port";
  @SerializedName(SERIALIZED_NAME_SSH_PORT)
  @javax.annotation.Nullable
  private String sshPort;

  public static final String SERIALIZED_NAME_TARGET_FORMAT = "target_format";
  @SerializedName(SERIALIZED_NAME_TARGET_FORMAT)
  @javax.annotation.Nullable
  private String targetFormat;

  public static final String SERIALIZED_NAME_TARGETS_TYPE = "targets_type";
  @SerializedName(SERIALIZED_NAME_TARGETS_TYPE)
  @javax.annotation.Nullable
  private String targetsType;

  public static final String SERIALIZED_NAME_USER_BASE_DN = "user_base_dn";
  @SerializedName(SERIALIZED_NAME_USER_BASE_DN)
  @javax.annotation.Nullable
  private String userBaseDn;

  public static final String SERIALIZED_NAME_USER_GROUPS = "user_groups";
  @SerializedName(SERIALIZED_NAME_USER_GROUPS)
  @javax.annotation.Nullable
  private List<String> userGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_WINRM_OVER_HTTP = "winrm_over_http";
  @SerializedName(SERIALIZED_NAME_WINRM_OVER_HTTP)
  @javax.annotation.Nullable
  private Boolean winrmOverHttp;

  public static final String SERIALIZED_NAME_WINRM_PORT = "winrm_port";
  @SerializedName(SERIALIZED_NAME_WINRM_PORT)
  @javax.annotation.Nullable
  private String winrmPort;

  public ActiveDirectoryPayload() {
  }

  public ActiveDirectoryPayload activeDirectoryTargetId(@javax.annotation.Nullable Long activeDirectoryTargetId) {
    this.activeDirectoryTargetId = activeDirectoryTargetId;
    return this;
  }

  /**
   * Get activeDirectoryTargetId
   * @return activeDirectoryTargetId
   */
  @javax.annotation.Nullable
  public Long getActiveDirectoryTargetId() {
    return activeDirectoryTargetId;
  }

  public void setActiveDirectoryTargetId(@javax.annotation.Nullable Long activeDirectoryTargetId) {
    this.activeDirectoryTargetId = activeDirectoryTargetId;
  }


  public ActiveDirectoryPayload autoRotate(@javax.annotation.Nullable Boolean autoRotate) {
    this.autoRotate = autoRotate;
    return this;
  }

  /**
   * Get autoRotate
   * @return autoRotate
   */
  @javax.annotation.Nullable
  public Boolean getAutoRotate() {
    return autoRotate;
  }

  public void setAutoRotate(@javax.annotation.Nullable Boolean autoRotate) {
    this.autoRotate = autoRotate;
  }


  public ActiveDirectoryPayload autoRotateIntervalInDays(@javax.annotation.Nullable Integer autoRotateIntervalInDays) {
    this.autoRotateIntervalInDays = autoRotateIntervalInDays;
    return this;
  }

  /**
   * Get autoRotateIntervalInDays
   * @return autoRotateIntervalInDays
   */
  @javax.annotation.Nullable
  public Integer getAutoRotateIntervalInDays() {
    return autoRotateIntervalInDays;
  }

  public void setAutoRotateIntervalInDays(@javax.annotation.Nullable Integer autoRotateIntervalInDays) {
    this.autoRotateIntervalInDays = autoRotateIntervalInDays;
  }


  public ActiveDirectoryPayload autoRotateRotationHour(@javax.annotation.Nullable Integer autoRotateRotationHour) {
    this.autoRotateRotationHour = autoRotateRotationHour;
    return this;
  }

  /**
   * Get autoRotateRotationHour
   * @return autoRotateRotationHour
   */
  @javax.annotation.Nullable
  public Integer getAutoRotateRotationHour() {
    return autoRotateRotationHour;
  }

  public void setAutoRotateRotationHour(@javax.annotation.Nullable Integer autoRotateRotationHour) {
    this.autoRotateRotationHour = autoRotateRotationHour;
  }


  public ActiveDirectoryPayload computerBaseDn(@javax.annotation.Nullable String computerBaseDn) {
    this.computerBaseDn = computerBaseDn;
    return this;
  }

  /**
   * Get computerBaseDn
   * @return computerBaseDn
   */
  @javax.annotation.Nullable
  public String getComputerBaseDn() {
    return computerBaseDn;
  }

  public void setComputerBaseDn(@javax.annotation.Nullable String computerBaseDn) {
    this.computerBaseDn = computerBaseDn;
  }


  public ActiveDirectoryPayload discoverLocalUsers(@javax.annotation.Nullable Boolean discoverLocalUsers) {
    this.discoverLocalUsers = discoverLocalUsers;
    return this;
  }

  /**
   * Deprecated
   * @return discoverLocalUsers
   */
  @javax.annotation.Nullable
  public Boolean getDiscoverLocalUsers() {
    return discoverLocalUsers;
  }

  public void setDiscoverLocalUsers(@javax.annotation.Nullable Boolean discoverLocalUsers) {
    this.discoverLocalUsers = discoverLocalUsers;
  }


  public ActiveDirectoryPayload discoverServices(@javax.annotation.Nullable Boolean discoverServices) {
    this.discoverServices = discoverServices;
    return this;
  }

  /**
   * Get discoverServices
   * @return discoverServices
   */
  @javax.annotation.Nullable
  public Boolean getDiscoverServices() {
    return discoverServices;
  }

  public void setDiscoverServices(@javax.annotation.Nullable Boolean discoverServices) {
    this.discoverServices = discoverServices;
  }


  public ActiveDirectoryPayload discoveryTypes(@javax.annotation.Nullable List<String> discoveryTypes) {
    this.discoveryTypes = discoveryTypes;
    return this;
  }

  public ActiveDirectoryPayload addDiscoveryTypesItem(String discoveryTypesItem) {
    if (this.discoveryTypes == null) {
      this.discoveryTypes = new ArrayList<>();
    }
    this.discoveryTypes.add(discoveryTypesItem);
    return this;
  }

  /**
   * Get discoveryTypes
   * @return discoveryTypes
   */
  @javax.annotation.Nullable
  public List<String> getDiscoveryTypes() {
    return discoveryTypes;
  }

  public void setDiscoveryTypes(@javax.annotation.Nullable List<String> discoveryTypes) {
    this.discoveryTypes = discoveryTypes;
  }


  public ActiveDirectoryPayload domainName(@javax.annotation.Nullable String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Get domainName
   * @return domainName
   */
  @javax.annotation.Nullable
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(@javax.annotation.Nullable String domainName) {
    this.domainName = domainName;
  }


  public ActiveDirectoryPayload domainServerTargetsPathTemplate(@javax.annotation.Nullable String domainServerTargetsPathTemplate) {
    this.domainServerTargetsPathTemplate = domainServerTargetsPathTemplate;
    return this;
  }

  /**
   * Get domainServerTargetsPathTemplate
   * @return domainServerTargetsPathTemplate
   */
  @javax.annotation.Nullable
  public String getDomainServerTargetsPathTemplate() {
    return domainServerTargetsPathTemplate;
  }

  public void setDomainServerTargetsPathTemplate(@javax.annotation.Nullable String domainServerTargetsPathTemplate) {
    this.domainServerTargetsPathTemplate = domainServerTargetsPathTemplate;
  }


  public ActiveDirectoryPayload domainUsersRotatedSecretsPathTemplate(@javax.annotation.Nullable String domainUsersRotatedSecretsPathTemplate) {
    this.domainUsersRotatedSecretsPathTemplate = domainUsersRotatedSecretsPathTemplate;
    return this;
  }

  /**
   * Get domainUsersRotatedSecretsPathTemplate
   * @return domainUsersRotatedSecretsPathTemplate
   */
  @javax.annotation.Nullable
  public String getDomainUsersRotatedSecretsPathTemplate() {
    return domainUsersRotatedSecretsPathTemplate;
  }

  public void setDomainUsersRotatedSecretsPathTemplate(@javax.annotation.Nullable String domainUsersRotatedSecretsPathTemplate) {
    this.domainUsersRotatedSecretsPathTemplate = domainUsersRotatedSecretsPathTemplate;
  }


  public ActiveDirectoryPayload enableRdpSra(@javax.annotation.Nullable Boolean enableRdpSra) {
    this.enableRdpSra = enableRdpSra;
    return this;
  }

  /**
   * Get enableRdpSra
   * @return enableRdpSra
   */
  @javax.annotation.Nullable
  public Boolean getEnableRdpSra() {
    return enableRdpSra;
  }

  public void setEnableRdpSra(@javax.annotation.Nullable Boolean enableRdpSra) {
    this.enableRdpSra = enableRdpSra;
  }


  public ActiveDirectoryPayload localUsersIgnoreList(@javax.annotation.Nullable Map<String, Boolean> localUsersIgnoreList) {
    this.localUsersIgnoreList = localUsersIgnoreList;
    return this;
  }

  public ActiveDirectoryPayload putLocalUsersIgnoreListItem(String key, Boolean localUsersIgnoreListItem) {
    if (this.localUsersIgnoreList == null) {
      this.localUsersIgnoreList = new HashMap<>();
    }
    this.localUsersIgnoreList.put(key, localUsersIgnoreListItem);
    return this;
  }

  /**
   * Get localUsersIgnoreList
   * @return localUsersIgnoreList
   */
  @javax.annotation.Nullable
  public Map<String, Boolean> getLocalUsersIgnoreList() {
    return localUsersIgnoreList;
  }

  public void setLocalUsersIgnoreList(@javax.annotation.Nullable Map<String, Boolean> localUsersIgnoreList) {
    this.localUsersIgnoreList = localUsersIgnoreList;
  }


  public ActiveDirectoryPayload localUsersRotatedSecretsPathTemplate(@javax.annotation.Nullable String localUsersRotatedSecretsPathTemplate) {
    this.localUsersRotatedSecretsPathTemplate = localUsersRotatedSecretsPathTemplate;
    return this;
  }

  /**
   * Get localUsersRotatedSecretsPathTemplate
   * @return localUsersRotatedSecretsPathTemplate
   */
  @javax.annotation.Nullable
  public String getLocalUsersRotatedSecretsPathTemplate() {
    return localUsersRotatedSecretsPathTemplate;
  }

  public void setLocalUsersRotatedSecretsPathTemplate(@javax.annotation.Nullable String localUsersRotatedSecretsPathTemplate) {
    this.localUsersRotatedSecretsPathTemplate = localUsersRotatedSecretsPathTemplate;
  }


  public ActiveDirectoryPayload osFilter(@javax.annotation.Nullable String osFilter) {
    this.osFilter = osFilter;
    return this;
  }

  /**
   * Get osFilter
   * @return osFilter
   */
  @javax.annotation.Nullable
  public String getOsFilter() {
    return osFilter;
  }

  public void setOsFilter(@javax.annotation.Nullable String osFilter) {
    this.osFilter = osFilter;
  }


  public ActiveDirectoryPayload sshPort(@javax.annotation.Nullable String sshPort) {
    this.sshPort = sshPort;
    return this;
  }

  /**
   * Get sshPort
   * @return sshPort
   */
  @javax.annotation.Nullable
  public String getSshPort() {
    return sshPort;
  }

  public void setSshPort(@javax.annotation.Nullable String sshPort) {
    this.sshPort = sshPort;
  }


  public ActiveDirectoryPayload targetFormat(@javax.annotation.Nullable String targetFormat) {
    this.targetFormat = targetFormat;
    return this;
  }

  /**
   * Get targetFormat
   * @return targetFormat
   */
  @javax.annotation.Nullable
  public String getTargetFormat() {
    return targetFormat;
  }

  public void setTargetFormat(@javax.annotation.Nullable String targetFormat) {
    this.targetFormat = targetFormat;
  }


  public ActiveDirectoryPayload targetsType(@javax.annotation.Nullable String targetsType) {
    this.targetsType = targetsType;
    return this;
  }

  /**
   * Get targetsType
   * @return targetsType
   */
  @javax.annotation.Nullable
  public String getTargetsType() {
    return targetsType;
  }

  public void setTargetsType(@javax.annotation.Nullable String targetsType) {
    this.targetsType = targetsType;
  }


  public ActiveDirectoryPayload userBaseDn(@javax.annotation.Nullable String userBaseDn) {
    this.userBaseDn = userBaseDn;
    return this;
  }

  /**
   * Get userBaseDn
   * @return userBaseDn
   */
  @javax.annotation.Nullable
  public String getUserBaseDn() {
    return userBaseDn;
  }

  public void setUserBaseDn(@javax.annotation.Nullable String userBaseDn) {
    this.userBaseDn = userBaseDn;
  }


  public ActiveDirectoryPayload userGroups(@javax.annotation.Nullable List<String> userGroups) {
    this.userGroups = userGroups;
    return this;
  }

  public ActiveDirectoryPayload addUserGroupsItem(String userGroupsItem) {
    if (this.userGroups == null) {
      this.userGroups = new ArrayList<>();
    }
    this.userGroups.add(userGroupsItem);
    return this;
  }

  /**
   * Get userGroups
   * @return userGroups
   */
  @javax.annotation.Nullable
  public List<String> getUserGroups() {
    return userGroups;
  }

  public void setUserGroups(@javax.annotation.Nullable List<String> userGroups) {
    this.userGroups = userGroups;
  }


  public ActiveDirectoryPayload winrmOverHttp(@javax.annotation.Nullable Boolean winrmOverHttp) {
    this.winrmOverHttp = winrmOverHttp;
    return this;
  }

  /**
   * Get winrmOverHttp
   * @return winrmOverHttp
   */
  @javax.annotation.Nullable
  public Boolean getWinrmOverHttp() {
    return winrmOverHttp;
  }

  public void setWinrmOverHttp(@javax.annotation.Nullable Boolean winrmOverHttp) {
    this.winrmOverHttp = winrmOverHttp;
  }


  public ActiveDirectoryPayload winrmPort(@javax.annotation.Nullable String winrmPort) {
    this.winrmPort = winrmPort;
    return this;
  }

  /**
   * Get winrmPort
   * @return winrmPort
   */
  @javax.annotation.Nullable
  public String getWinrmPort() {
    return winrmPort;
  }

  public void setWinrmPort(@javax.annotation.Nullable String winrmPort) {
    this.winrmPort = winrmPort;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveDirectoryPayload activeDirectoryPayload = (ActiveDirectoryPayload) o;
    return Objects.equals(this.activeDirectoryTargetId, activeDirectoryPayload.activeDirectoryTargetId) &&
        Objects.equals(this.autoRotate, activeDirectoryPayload.autoRotate) &&
        Objects.equals(this.autoRotateIntervalInDays, activeDirectoryPayload.autoRotateIntervalInDays) &&
        Objects.equals(this.autoRotateRotationHour, activeDirectoryPayload.autoRotateRotationHour) &&
        Objects.equals(this.computerBaseDn, activeDirectoryPayload.computerBaseDn) &&
        Objects.equals(this.discoverLocalUsers, activeDirectoryPayload.discoverLocalUsers) &&
        Objects.equals(this.discoverServices, activeDirectoryPayload.discoverServices) &&
        Objects.equals(this.discoveryTypes, activeDirectoryPayload.discoveryTypes) &&
        Objects.equals(this.domainName, activeDirectoryPayload.domainName) &&
        Objects.equals(this.domainServerTargetsPathTemplate, activeDirectoryPayload.domainServerTargetsPathTemplate) &&
        Objects.equals(this.domainUsersRotatedSecretsPathTemplate, activeDirectoryPayload.domainUsersRotatedSecretsPathTemplate) &&
        Objects.equals(this.enableRdpSra, activeDirectoryPayload.enableRdpSra) &&
        Objects.equals(this.localUsersIgnoreList, activeDirectoryPayload.localUsersIgnoreList) &&
        Objects.equals(this.localUsersRotatedSecretsPathTemplate, activeDirectoryPayload.localUsersRotatedSecretsPathTemplate) &&
        Objects.equals(this.osFilter, activeDirectoryPayload.osFilter) &&
        Objects.equals(this.sshPort, activeDirectoryPayload.sshPort) &&
        Objects.equals(this.targetFormat, activeDirectoryPayload.targetFormat) &&
        Objects.equals(this.targetsType, activeDirectoryPayload.targetsType) &&
        Objects.equals(this.userBaseDn, activeDirectoryPayload.userBaseDn) &&
        Objects.equals(this.userGroups, activeDirectoryPayload.userGroups) &&
        Objects.equals(this.winrmOverHttp, activeDirectoryPayload.winrmOverHttp) &&
        Objects.equals(this.winrmPort, activeDirectoryPayload.winrmPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDirectoryTargetId, autoRotate, autoRotateIntervalInDays, autoRotateRotationHour, computerBaseDn, discoverLocalUsers, discoverServices, discoveryTypes, domainName, domainServerTargetsPathTemplate, domainUsersRotatedSecretsPathTemplate, enableRdpSra, localUsersIgnoreList, localUsersRotatedSecretsPathTemplate, osFilter, sshPort, targetFormat, targetsType, userBaseDn, userGroups, winrmOverHttp, winrmPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveDirectoryPayload {\n");
    sb.append("    activeDirectoryTargetId: ").append(toIndentedString(activeDirectoryTargetId)).append("\n");
    sb.append("    autoRotate: ").append(toIndentedString(autoRotate)).append("\n");
    sb.append("    autoRotateIntervalInDays: ").append(toIndentedString(autoRotateIntervalInDays)).append("\n");
    sb.append("    autoRotateRotationHour: ").append(toIndentedString(autoRotateRotationHour)).append("\n");
    sb.append("    computerBaseDn: ").append(toIndentedString(computerBaseDn)).append("\n");
    sb.append("    discoverLocalUsers: ").append(toIndentedString(discoverLocalUsers)).append("\n");
    sb.append("    discoverServices: ").append(toIndentedString(discoverServices)).append("\n");
    sb.append("    discoveryTypes: ").append(toIndentedString(discoveryTypes)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    domainServerTargetsPathTemplate: ").append(toIndentedString(domainServerTargetsPathTemplate)).append("\n");
    sb.append("    domainUsersRotatedSecretsPathTemplate: ").append(toIndentedString(domainUsersRotatedSecretsPathTemplate)).append("\n");
    sb.append("    enableRdpSra: ").append(toIndentedString(enableRdpSra)).append("\n");
    sb.append("    localUsersIgnoreList: ").append(toIndentedString(localUsersIgnoreList)).append("\n");
    sb.append("    localUsersRotatedSecretsPathTemplate: ").append(toIndentedString(localUsersRotatedSecretsPathTemplate)).append("\n");
    sb.append("    osFilter: ").append(toIndentedString(osFilter)).append("\n");
    sb.append("    sshPort: ").append(toIndentedString(sshPort)).append("\n");
    sb.append("    targetFormat: ").append(toIndentedString(targetFormat)).append("\n");
    sb.append("    targetsType: ").append(toIndentedString(targetsType)).append("\n");
    sb.append("    userBaseDn: ").append(toIndentedString(userBaseDn)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
    sb.append("    winrmOverHttp: ").append(toIndentedString(winrmOverHttp)).append("\n");
    sb.append("    winrmPort: ").append(toIndentedString(winrmPort)).append("\n");
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
    openapiFields.add("active_directory_target_id");
    openapiFields.add("auto_rotate");
    openapiFields.add("auto_rotate_interval_in_days");
    openapiFields.add("auto_rotate_rotation_hour");
    openapiFields.add("computer_base_dn");
    openapiFields.add("discover_local_users");
    openapiFields.add("discover_services");
    openapiFields.add("discovery_types");
    openapiFields.add("domain_name");
    openapiFields.add("domain_server_targets_path_template");
    openapiFields.add("domain_users_rotated_secrets_path_template");
    openapiFields.add("enable_rdp_sra");
    openapiFields.add("local_users_ignore_list");
    openapiFields.add("local_users_rotated_secrets_path_template");
    openapiFields.add("os_filter");
    openapiFields.add("ssh_port");
    openapiFields.add("target_format");
    openapiFields.add("targets_type");
    openapiFields.add("user_base_dn");
    openapiFields.add("user_groups");
    openapiFields.add("winrm_over_http");
    openapiFields.add("winrm_port");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ActiveDirectoryPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ActiveDirectoryPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActiveDirectoryPayload is not found in the empty JSON string", ActiveDirectoryPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ActiveDirectoryPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActiveDirectoryPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("computer_base_dn") != null && !jsonObj.get("computer_base_dn").isJsonNull()) && !jsonObj.get("computer_base_dn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `computer_base_dn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("computer_base_dn").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("discovery_types") != null && !jsonObj.get("discovery_types").isJsonNull() && !jsonObj.get("discovery_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `discovery_types` to be an array in the JSON string but got `%s`", jsonObj.get("discovery_types").toString()));
      }
      if ((jsonObj.get("domain_name") != null && !jsonObj.get("domain_name").isJsonNull()) && !jsonObj.get("domain_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain_name").toString()));
      }
      if ((jsonObj.get("domain_server_targets_path_template") != null && !jsonObj.get("domain_server_targets_path_template").isJsonNull()) && !jsonObj.get("domain_server_targets_path_template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain_server_targets_path_template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain_server_targets_path_template").toString()));
      }
      if ((jsonObj.get("domain_users_rotated_secrets_path_template") != null && !jsonObj.get("domain_users_rotated_secrets_path_template").isJsonNull()) && !jsonObj.get("domain_users_rotated_secrets_path_template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain_users_rotated_secrets_path_template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain_users_rotated_secrets_path_template").toString()));
      }
      if ((jsonObj.get("local_users_rotated_secrets_path_template") != null && !jsonObj.get("local_users_rotated_secrets_path_template").isJsonNull()) && !jsonObj.get("local_users_rotated_secrets_path_template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `local_users_rotated_secrets_path_template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("local_users_rotated_secrets_path_template").toString()));
      }
      if ((jsonObj.get("os_filter") != null && !jsonObj.get("os_filter").isJsonNull()) && !jsonObj.get("os_filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os_filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os_filter").toString()));
      }
      if ((jsonObj.get("ssh_port") != null && !jsonObj.get("ssh_port").isJsonNull()) && !jsonObj.get("ssh_port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssh_port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssh_port").toString()));
      }
      if ((jsonObj.get("target_format") != null && !jsonObj.get("target_format").isJsonNull()) && !jsonObj.get("target_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_format").toString()));
      }
      if ((jsonObj.get("targets_type") != null && !jsonObj.get("targets_type").isJsonNull()) && !jsonObj.get("targets_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targets_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targets_type").toString()));
      }
      if ((jsonObj.get("user_base_dn") != null && !jsonObj.get("user_base_dn").isJsonNull()) && !jsonObj.get("user_base_dn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_base_dn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_base_dn").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("user_groups") != null && !jsonObj.get("user_groups").isJsonNull() && !jsonObj.get("user_groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_groups` to be an array in the JSON string but got `%s`", jsonObj.get("user_groups").toString()));
      }
      if ((jsonObj.get("winrm_port") != null && !jsonObj.get("winrm_port").isJsonNull()) && !jsonObj.get("winrm_port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `winrm_port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("winrm_port").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActiveDirectoryPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActiveDirectoryPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActiveDirectoryPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActiveDirectoryPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<ActiveDirectoryPayload>() {
           @Override
           public void write(JsonWriter out, ActiveDirectoryPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActiveDirectoryPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ActiveDirectoryPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ActiveDirectoryPayload
   * @throws IOException if the JSON string is invalid with respect to ActiveDirectoryPayload
   */
  public static ActiveDirectoryPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActiveDirectoryPayload.class);
  }

  /**
   * Convert an instance of ActiveDirectoryPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

