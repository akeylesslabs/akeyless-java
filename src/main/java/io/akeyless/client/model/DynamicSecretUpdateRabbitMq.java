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
 * dynamicSecretUpdateRabbitMq is a command that updates rabbitmq dynamic secret
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class DynamicSecretUpdateRabbitMq {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  @javax.annotation.Nullable
  private String newName;

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  @javax.annotation.Nullable
  private String passwordLength;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  @javax.annotation.Nullable
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_RABBITMQ_ADMIN_PWD = "rabbitmq-admin-pwd";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_ADMIN_PWD)
  @javax.annotation.Nullable
  private String rabbitmqAdminPwd;

  public static final String SERIALIZED_NAME_RABBITMQ_ADMIN_USER = "rabbitmq-admin-user";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_ADMIN_USER)
  @javax.annotation.Nullable
  private String rabbitmqAdminUser;

  public static final String SERIALIZED_NAME_RABBITMQ_SERVER_URI = "rabbitmq-server-uri";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_SERVER_URI)
  @javax.annotation.Nullable
  private String rabbitmqServerUri;

  public static final String SERIALIZED_NAME_RABBITMQ_USER_CONF_PERMISSION = "rabbitmq-user-conf-permission";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_USER_CONF_PERMISSION)
  @javax.annotation.Nullable
  private String rabbitmqUserConfPermission;

  public static final String SERIALIZED_NAME_RABBITMQ_USER_READ_PERMISSION = "rabbitmq-user-read-permission";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_USER_READ_PERMISSION)
  @javax.annotation.Nullable
  private String rabbitmqUserReadPermission;

  public static final String SERIALIZED_NAME_RABBITMQ_USER_TAGS = "rabbitmq-user-tags";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_USER_TAGS)
  @javax.annotation.Nullable
  private String rabbitmqUserTags;

  public static final String SERIALIZED_NAME_RABBITMQ_USER_VHOST = "rabbitmq-user-vhost";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_USER_VHOST)
  @javax.annotation.Nullable
  private String rabbitmqUserVhost;

  public static final String SERIALIZED_NAME_RABBITMQ_USER_WRITE_PERMISSION = "rabbitmq-user-write-permission";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_USER_WRITE_PERMISSION)
  @javax.annotation.Nullable
  private String rabbitmqUserWritePermission;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  @javax.annotation.Nullable
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_URL = "secure-access-url";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_URL)
  @javax.annotation.Nullable
  private String secureAccessUrl;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB = "secure-access-web";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB)
  @javax.annotation.Nullable
  private Boolean secureAccessWeb = true;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING = "secure-access-web-browsing";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING)
  @javax.annotation.Nullable
  private Boolean secureAccessWebBrowsing = false;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY = "secure-access-web-proxy";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY)
  @javax.annotation.Nullable
  private Boolean secureAccessWebProxy = false;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  @javax.annotation.Nullable
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  @javax.annotation.Nullable
  private String userTtl = "60m";

  public DynamicSecretUpdateRabbitMq() {
  }

  public DynamicSecretUpdateRabbitMq deleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
    return this;
  }

  /**
   * Protection from accidental deletion of this object [true/false]
   * @return deleteProtection
   */
  @javax.annotation.Nullable
  public String getDeleteProtection() {
    return deleteProtection;
  }

  public void setDeleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public DynamicSecretUpdateRabbitMq description(@javax.annotation.Nullable String description) {
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


  public DynamicSecretUpdateRabbitMq json(@javax.annotation.Nullable Boolean json) {
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


  public DynamicSecretUpdateRabbitMq name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Dynamic secret name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public DynamicSecretUpdateRabbitMq newName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
    return this;
  }

  /**
   * Dynamic secret name
   * @return newName
   */
  @javax.annotation.Nullable
  public String getNewName() {
    return newName;
  }

  public void setNewName(@javax.annotation.Nullable String newName) {
    this.newName = newName;
  }


  public DynamicSecretUpdateRabbitMq passwordLength(@javax.annotation.Nullable String passwordLength) {
    this.passwordLength = passwordLength;
    return this;
  }

  /**
   * The length of the password to be generated
   * @return passwordLength
   */
  @javax.annotation.Nullable
  public String getPasswordLength() {
    return passwordLength;
  }

  public void setPasswordLength(@javax.annotation.Nullable String passwordLength) {
    this.passwordLength = passwordLength;
  }


  public DynamicSecretUpdateRabbitMq producerEncryptionKeyName(@javax.annotation.Nullable String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
    return this;
  }

  /**
   * Dynamic producer encryption key
   * @return producerEncryptionKeyName
   */
  @javax.annotation.Nullable
  public String getProducerEncryptionKeyName() {
    return producerEncryptionKeyName;
  }

  public void setProducerEncryptionKeyName(@javax.annotation.Nullable String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
  }


  public DynamicSecretUpdateRabbitMq rabbitmqAdminPwd(@javax.annotation.Nullable String rabbitmqAdminPwd) {
    this.rabbitmqAdminPwd = rabbitmqAdminPwd;
    return this;
  }

  /**
   * RabbitMQ Admin password
   * @return rabbitmqAdminPwd
   */
  @javax.annotation.Nullable
  public String getRabbitmqAdminPwd() {
    return rabbitmqAdminPwd;
  }

  public void setRabbitmqAdminPwd(@javax.annotation.Nullable String rabbitmqAdminPwd) {
    this.rabbitmqAdminPwd = rabbitmqAdminPwd;
  }


  public DynamicSecretUpdateRabbitMq rabbitmqAdminUser(@javax.annotation.Nullable String rabbitmqAdminUser) {
    this.rabbitmqAdminUser = rabbitmqAdminUser;
    return this;
  }

  /**
   * RabbitMQ Admin User
   * @return rabbitmqAdminUser
   */
  @javax.annotation.Nullable
  public String getRabbitmqAdminUser() {
    return rabbitmqAdminUser;
  }

  public void setRabbitmqAdminUser(@javax.annotation.Nullable String rabbitmqAdminUser) {
    this.rabbitmqAdminUser = rabbitmqAdminUser;
  }


  public DynamicSecretUpdateRabbitMq rabbitmqServerUri(@javax.annotation.Nullable String rabbitmqServerUri) {
    this.rabbitmqServerUri = rabbitmqServerUri;
    return this;
  }

  /**
   * Server URI
   * @return rabbitmqServerUri
   */
  @javax.annotation.Nullable
  public String getRabbitmqServerUri() {
    return rabbitmqServerUri;
  }

  public void setRabbitmqServerUri(@javax.annotation.Nullable String rabbitmqServerUri) {
    this.rabbitmqServerUri = rabbitmqServerUri;
  }


  public DynamicSecretUpdateRabbitMq rabbitmqUserConfPermission(@javax.annotation.Nullable String rabbitmqUserConfPermission) {
    this.rabbitmqUserConfPermission = rabbitmqUserConfPermission;
    return this;
  }

  /**
   * User configuration permission
   * @return rabbitmqUserConfPermission
   */
  @javax.annotation.Nullable
  public String getRabbitmqUserConfPermission() {
    return rabbitmqUserConfPermission;
  }

  public void setRabbitmqUserConfPermission(@javax.annotation.Nullable String rabbitmqUserConfPermission) {
    this.rabbitmqUserConfPermission = rabbitmqUserConfPermission;
  }


  public DynamicSecretUpdateRabbitMq rabbitmqUserReadPermission(@javax.annotation.Nullable String rabbitmqUserReadPermission) {
    this.rabbitmqUserReadPermission = rabbitmqUserReadPermission;
    return this;
  }

  /**
   * User read permission
   * @return rabbitmqUserReadPermission
   */
  @javax.annotation.Nullable
  public String getRabbitmqUserReadPermission() {
    return rabbitmqUserReadPermission;
  }

  public void setRabbitmqUserReadPermission(@javax.annotation.Nullable String rabbitmqUserReadPermission) {
    this.rabbitmqUserReadPermission = rabbitmqUserReadPermission;
  }


  public DynamicSecretUpdateRabbitMq rabbitmqUserTags(@javax.annotation.Nullable String rabbitmqUserTags) {
    this.rabbitmqUserTags = rabbitmqUserTags;
    return this;
  }

  /**
   * User Tags
   * @return rabbitmqUserTags
   */
  @javax.annotation.Nullable
  public String getRabbitmqUserTags() {
    return rabbitmqUserTags;
  }

  public void setRabbitmqUserTags(@javax.annotation.Nullable String rabbitmqUserTags) {
    this.rabbitmqUserTags = rabbitmqUserTags;
  }


  public DynamicSecretUpdateRabbitMq rabbitmqUserVhost(@javax.annotation.Nullable String rabbitmqUserVhost) {
    this.rabbitmqUserVhost = rabbitmqUserVhost;
    return this;
  }

  /**
   * User Virtual Host
   * @return rabbitmqUserVhost
   */
  @javax.annotation.Nullable
  public String getRabbitmqUserVhost() {
    return rabbitmqUserVhost;
  }

  public void setRabbitmqUserVhost(@javax.annotation.Nullable String rabbitmqUserVhost) {
    this.rabbitmqUserVhost = rabbitmqUserVhost;
  }


  public DynamicSecretUpdateRabbitMq rabbitmqUserWritePermission(@javax.annotation.Nullable String rabbitmqUserWritePermission) {
    this.rabbitmqUserWritePermission = rabbitmqUserWritePermission;
    return this;
  }

  /**
   * User write permission
   * @return rabbitmqUserWritePermission
   */
  @javax.annotation.Nullable
  public String getRabbitmqUserWritePermission() {
    return rabbitmqUserWritePermission;
  }

  public void setRabbitmqUserWritePermission(@javax.annotation.Nullable String rabbitmqUserWritePermission) {
    this.rabbitmqUserWritePermission = rabbitmqUserWritePermission;
  }


  public DynamicSecretUpdateRabbitMq secureAccessEnable(@javax.annotation.Nullable String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
    return this;
  }

  /**
   * Enable/Disable secure remote access [true/false]
   * @return secureAccessEnable
   */
  @javax.annotation.Nullable
  public String getSecureAccessEnable() {
    return secureAccessEnable;
  }

  public void setSecureAccessEnable(@javax.annotation.Nullable String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
  }


  public DynamicSecretUpdateRabbitMq secureAccessUrl(@javax.annotation.Nullable String secureAccessUrl) {
    this.secureAccessUrl = secureAccessUrl;
    return this;
  }

  /**
   * Destination URL to inject secrets
   * @return secureAccessUrl
   */
  @javax.annotation.Nullable
  public String getSecureAccessUrl() {
    return secureAccessUrl;
  }

  public void setSecureAccessUrl(@javax.annotation.Nullable String secureAccessUrl) {
    this.secureAccessUrl = secureAccessUrl;
  }


  public DynamicSecretUpdateRabbitMq secureAccessWeb(@javax.annotation.Nullable Boolean secureAccessWeb) {
    this.secureAccessWeb = secureAccessWeb;
    return this;
  }

  /**
   * Enable Web Secure Remote Access
   * @return secureAccessWeb
   */
  @javax.annotation.Nullable
  public Boolean getSecureAccessWeb() {
    return secureAccessWeb;
  }

  public void setSecureAccessWeb(@javax.annotation.Nullable Boolean secureAccessWeb) {
    this.secureAccessWeb = secureAccessWeb;
  }


  public DynamicSecretUpdateRabbitMq secureAccessWebBrowsing(@javax.annotation.Nullable Boolean secureAccessWebBrowsing) {
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
    return this;
  }

  /**
   * Secure browser via Akeyless&#39;s Secure Remote Access (SRA)
   * @return secureAccessWebBrowsing
   */
  @javax.annotation.Nullable
  public Boolean getSecureAccessWebBrowsing() {
    return secureAccessWebBrowsing;
  }

  public void setSecureAccessWebBrowsing(@javax.annotation.Nullable Boolean secureAccessWebBrowsing) {
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
  }


  public DynamicSecretUpdateRabbitMq secureAccessWebProxy(@javax.annotation.Nullable Boolean secureAccessWebProxy) {
    this.secureAccessWebProxy = secureAccessWebProxy;
    return this;
  }

  /**
   * Web-Proxy via Akeyless&#39;s Secure Remote Access (SRA)
   * @return secureAccessWebProxy
   */
  @javax.annotation.Nullable
  public Boolean getSecureAccessWebProxy() {
    return secureAccessWebProxy;
  }

  public void setSecureAccessWebProxy(@javax.annotation.Nullable Boolean secureAccessWebProxy) {
    this.secureAccessWebProxy = secureAccessWebProxy;
  }


  public DynamicSecretUpdateRabbitMq tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DynamicSecretUpdateRabbitMq addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Add tags attached to this object
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }


  public DynamicSecretUpdateRabbitMq targetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
    return this;
  }

  /**
   * Target name
   * @return targetName
   */
  @javax.annotation.Nullable
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(@javax.annotation.Nullable String targetName) {
    this.targetName = targetName;
  }


  public DynamicSecretUpdateRabbitMq token(@javax.annotation.Nullable String token) {
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


  public DynamicSecretUpdateRabbitMq uidToken(@javax.annotation.Nullable String uidToken) {
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


  public DynamicSecretUpdateRabbitMq userTtl(@javax.annotation.Nullable String userTtl) {
    this.userTtl = userTtl;
    return this;
  }

  /**
   * User TTL
   * @return userTtl
   */
  @javax.annotation.Nullable
  public String getUserTtl() {
    return userTtl;
  }

  public void setUserTtl(@javax.annotation.Nullable String userTtl) {
    this.userTtl = userTtl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicSecretUpdateRabbitMq dynamicSecretUpdateRabbitMq = (DynamicSecretUpdateRabbitMq) o;
    return Objects.equals(this.deleteProtection, dynamicSecretUpdateRabbitMq.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretUpdateRabbitMq.description) &&
        Objects.equals(this.json, dynamicSecretUpdateRabbitMq.json) &&
        Objects.equals(this.name, dynamicSecretUpdateRabbitMq.name) &&
        Objects.equals(this.newName, dynamicSecretUpdateRabbitMq.newName) &&
        Objects.equals(this.passwordLength, dynamicSecretUpdateRabbitMq.passwordLength) &&
        Objects.equals(this.producerEncryptionKeyName, dynamicSecretUpdateRabbitMq.producerEncryptionKeyName) &&
        Objects.equals(this.rabbitmqAdminPwd, dynamicSecretUpdateRabbitMq.rabbitmqAdminPwd) &&
        Objects.equals(this.rabbitmqAdminUser, dynamicSecretUpdateRabbitMq.rabbitmqAdminUser) &&
        Objects.equals(this.rabbitmqServerUri, dynamicSecretUpdateRabbitMq.rabbitmqServerUri) &&
        Objects.equals(this.rabbitmqUserConfPermission, dynamicSecretUpdateRabbitMq.rabbitmqUserConfPermission) &&
        Objects.equals(this.rabbitmqUserReadPermission, dynamicSecretUpdateRabbitMq.rabbitmqUserReadPermission) &&
        Objects.equals(this.rabbitmqUserTags, dynamicSecretUpdateRabbitMq.rabbitmqUserTags) &&
        Objects.equals(this.rabbitmqUserVhost, dynamicSecretUpdateRabbitMq.rabbitmqUserVhost) &&
        Objects.equals(this.rabbitmqUserWritePermission, dynamicSecretUpdateRabbitMq.rabbitmqUserWritePermission) &&
        Objects.equals(this.secureAccessEnable, dynamicSecretUpdateRabbitMq.secureAccessEnable) &&
        Objects.equals(this.secureAccessUrl, dynamicSecretUpdateRabbitMq.secureAccessUrl) &&
        Objects.equals(this.secureAccessWeb, dynamicSecretUpdateRabbitMq.secureAccessWeb) &&
        Objects.equals(this.secureAccessWebBrowsing, dynamicSecretUpdateRabbitMq.secureAccessWebBrowsing) &&
        Objects.equals(this.secureAccessWebProxy, dynamicSecretUpdateRabbitMq.secureAccessWebProxy) &&
        Objects.equals(this.tags, dynamicSecretUpdateRabbitMq.tags) &&
        Objects.equals(this.targetName, dynamicSecretUpdateRabbitMq.targetName) &&
        Objects.equals(this.token, dynamicSecretUpdateRabbitMq.token) &&
        Objects.equals(this.uidToken, dynamicSecretUpdateRabbitMq.uidToken) &&
        Objects.equals(this.userTtl, dynamicSecretUpdateRabbitMq.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProtection, description, json, name, newName, passwordLength, producerEncryptionKeyName, rabbitmqAdminPwd, rabbitmqAdminUser, rabbitmqServerUri, rabbitmqUserConfPermission, rabbitmqUserReadPermission, rabbitmqUserTags, rabbitmqUserVhost, rabbitmqUserWritePermission, secureAccessEnable, secureAccessUrl, secureAccessWeb, secureAccessWebBrowsing, secureAccessWebProxy, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretUpdateRabbitMq {\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    rabbitmqAdminPwd: ").append(toIndentedString(rabbitmqAdminPwd)).append("\n");
    sb.append("    rabbitmqAdminUser: ").append(toIndentedString(rabbitmqAdminUser)).append("\n");
    sb.append("    rabbitmqServerUri: ").append(toIndentedString(rabbitmqServerUri)).append("\n");
    sb.append("    rabbitmqUserConfPermission: ").append(toIndentedString(rabbitmqUserConfPermission)).append("\n");
    sb.append("    rabbitmqUserReadPermission: ").append(toIndentedString(rabbitmqUserReadPermission)).append("\n");
    sb.append("    rabbitmqUserTags: ").append(toIndentedString(rabbitmqUserTags)).append("\n");
    sb.append("    rabbitmqUserVhost: ").append(toIndentedString(rabbitmqUserVhost)).append("\n");
    sb.append("    rabbitmqUserWritePermission: ").append(toIndentedString(rabbitmqUserWritePermission)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessUrl: ").append(toIndentedString(secureAccessUrl)).append("\n");
    sb.append("    secureAccessWeb: ").append(toIndentedString(secureAccessWeb)).append("\n");
    sb.append("    secureAccessWebBrowsing: ").append(toIndentedString(secureAccessWebBrowsing)).append("\n");
    sb.append("    secureAccessWebProxy: ").append(toIndentedString(secureAccessWebProxy)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userTtl: ").append(toIndentedString(userTtl)).append("\n");
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
    openapiFields.add("delete_protection");
    openapiFields.add("description");
    openapiFields.add("json");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("password-length");
    openapiFields.add("producer-encryption-key-name");
    openapiFields.add("rabbitmq-admin-pwd");
    openapiFields.add("rabbitmq-admin-user");
    openapiFields.add("rabbitmq-server-uri");
    openapiFields.add("rabbitmq-user-conf-permission");
    openapiFields.add("rabbitmq-user-read-permission");
    openapiFields.add("rabbitmq-user-tags");
    openapiFields.add("rabbitmq-user-vhost");
    openapiFields.add("rabbitmq-user-write-permission");
    openapiFields.add("secure-access-enable");
    openapiFields.add("secure-access-url");
    openapiFields.add("secure-access-web");
    openapiFields.add("secure-access-web-browsing");
    openapiFields.add("secure-access-web-proxy");
    openapiFields.add("tags");
    openapiFields.add("target-name");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("user-ttl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DynamicSecretUpdateRabbitMq
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DynamicSecretUpdateRabbitMq.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DynamicSecretUpdateRabbitMq is not found in the empty JSON string", DynamicSecretUpdateRabbitMq.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DynamicSecretUpdateRabbitMq.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DynamicSecretUpdateRabbitMq` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DynamicSecretUpdateRabbitMq.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("delete_protection") != null && !jsonObj.get("delete_protection").isJsonNull()) && !jsonObj.get("delete_protection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_protection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete_protection").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("new-name") != null && !jsonObj.get("new-name").isJsonNull()) && !jsonObj.get("new-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new-name").toString()));
      }
      if ((jsonObj.get("password-length") != null && !jsonObj.get("password-length").isJsonNull()) && !jsonObj.get("password-length").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password-length` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password-length").toString()));
      }
      if ((jsonObj.get("producer-encryption-key-name") != null && !jsonObj.get("producer-encryption-key-name").isJsonNull()) && !jsonObj.get("producer-encryption-key-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `producer-encryption-key-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("producer-encryption-key-name").toString()));
      }
      if ((jsonObj.get("rabbitmq-admin-pwd") != null && !jsonObj.get("rabbitmq-admin-pwd").isJsonNull()) && !jsonObj.get("rabbitmq-admin-pwd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rabbitmq-admin-pwd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rabbitmq-admin-pwd").toString()));
      }
      if ((jsonObj.get("rabbitmq-admin-user") != null && !jsonObj.get("rabbitmq-admin-user").isJsonNull()) && !jsonObj.get("rabbitmq-admin-user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rabbitmq-admin-user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rabbitmq-admin-user").toString()));
      }
      if ((jsonObj.get("rabbitmq-server-uri") != null && !jsonObj.get("rabbitmq-server-uri").isJsonNull()) && !jsonObj.get("rabbitmq-server-uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rabbitmq-server-uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rabbitmq-server-uri").toString()));
      }
      if ((jsonObj.get("rabbitmq-user-conf-permission") != null && !jsonObj.get("rabbitmq-user-conf-permission").isJsonNull()) && !jsonObj.get("rabbitmq-user-conf-permission").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rabbitmq-user-conf-permission` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rabbitmq-user-conf-permission").toString()));
      }
      if ((jsonObj.get("rabbitmq-user-read-permission") != null && !jsonObj.get("rabbitmq-user-read-permission").isJsonNull()) && !jsonObj.get("rabbitmq-user-read-permission").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rabbitmq-user-read-permission` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rabbitmq-user-read-permission").toString()));
      }
      if ((jsonObj.get("rabbitmq-user-tags") != null && !jsonObj.get("rabbitmq-user-tags").isJsonNull()) && !jsonObj.get("rabbitmq-user-tags").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rabbitmq-user-tags` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rabbitmq-user-tags").toString()));
      }
      if ((jsonObj.get("rabbitmq-user-vhost") != null && !jsonObj.get("rabbitmq-user-vhost").isJsonNull()) && !jsonObj.get("rabbitmq-user-vhost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rabbitmq-user-vhost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rabbitmq-user-vhost").toString()));
      }
      if ((jsonObj.get("rabbitmq-user-write-permission") != null && !jsonObj.get("rabbitmq-user-write-permission").isJsonNull()) && !jsonObj.get("rabbitmq-user-write-permission").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rabbitmq-user-write-permission` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rabbitmq-user-write-permission").toString()));
      }
      if ((jsonObj.get("secure-access-enable") != null && !jsonObj.get("secure-access-enable").isJsonNull()) && !jsonObj.get("secure-access-enable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure-access-enable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure-access-enable").toString()));
      }
      if ((jsonObj.get("secure-access-url") != null && !jsonObj.get("secure-access-url").isJsonNull()) && !jsonObj.get("secure-access-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure-access-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure-access-url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("target-name") != null && !jsonObj.get("target-name").isJsonNull()) && !jsonObj.get("target-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target-name").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if ((jsonObj.get("user-ttl") != null && !jsonObj.get("user-ttl").isJsonNull()) && !jsonObj.get("user-ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user-ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user-ttl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DynamicSecretUpdateRabbitMq.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DynamicSecretUpdateRabbitMq' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DynamicSecretUpdateRabbitMq> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DynamicSecretUpdateRabbitMq.class));

       return (TypeAdapter<T>) new TypeAdapter<DynamicSecretUpdateRabbitMq>() {
           @Override
           public void write(JsonWriter out, DynamicSecretUpdateRabbitMq value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DynamicSecretUpdateRabbitMq read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DynamicSecretUpdateRabbitMq given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DynamicSecretUpdateRabbitMq
   * @throws IOException if the JSON string is invalid with respect to DynamicSecretUpdateRabbitMq
   */
  public static DynamicSecretUpdateRabbitMq fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DynamicSecretUpdateRabbitMq.class);
  }

  /**
   * Convert an instance of DynamicSecretUpdateRabbitMq to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

