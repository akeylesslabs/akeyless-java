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
 * gatewayUpdateProducerRedshift is a command that updates redshift producer [Deprecated: Use dynamic-secret-update-redshift command]
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GatewayUpdateProducerRedshift {
  public static final String SERIALIZED_NAME_CREATION_STATEMENTS = "creation-statements";
  @SerializedName(SERIALIZED_NAME_CREATION_STATEMENTS)
  @javax.annotation.Nullable
  private String creationStatements;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private String deleteProtection;

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

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY = "producer-encryption-key";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY)
  @javax.annotation.Nullable
  private String producerEncryptionKey;

  public static final String SERIALIZED_NAME_REDSHIFT_DB_NAME = "redshift-db-name";
  @SerializedName(SERIALIZED_NAME_REDSHIFT_DB_NAME)
  @javax.annotation.Nullable
  private String redshiftDbName;

  public static final String SERIALIZED_NAME_REDSHIFT_HOST = "redshift-host";
  @SerializedName(SERIALIZED_NAME_REDSHIFT_HOST)
  @javax.annotation.Nullable
  private String redshiftHost = "127.0.0.1";

  public static final String SERIALIZED_NAME_REDSHIFT_PASSWORD = "redshift-password";
  @SerializedName(SERIALIZED_NAME_REDSHIFT_PASSWORD)
  @javax.annotation.Nullable
  private String redshiftPassword;

  public static final String SERIALIZED_NAME_REDSHIFT_PORT = "redshift-port";
  @SerializedName(SERIALIZED_NAME_REDSHIFT_PORT)
  @javax.annotation.Nullable
  private String redshiftPort = "5439";

  public static final String SERIALIZED_NAME_REDSHIFT_USERNAME = "redshift-username";
  @SerializedName(SERIALIZED_NAME_REDSHIFT_USERNAME)
  @javax.annotation.Nullable
  private String redshiftUsername;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  @javax.annotation.Nullable
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_HOST = "secure-access-host";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_HOST)
  @javax.annotation.Nullable
  private List<String> secureAccessHost = new ArrayList<>();

  public static final String SERIALIZED_NAME_SSL = "ssl";
  @SerializedName(SERIALIZED_NAME_SSL)
  @javax.annotation.Nullable
  private Boolean ssl = false;

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

  public GatewayUpdateProducerRedshift() {
  }

  public GatewayUpdateProducerRedshift creationStatements(@javax.annotation.Nullable String creationStatements) {
    this.creationStatements = creationStatements;
    return this;
  }

  /**
   * Redshift Creation statements
   * @return creationStatements
   */
  @javax.annotation.Nullable
  public String getCreationStatements() {
    return creationStatements;
  }

  public void setCreationStatements(@javax.annotation.Nullable String creationStatements) {
    this.creationStatements = creationStatements;
  }


  public GatewayUpdateProducerRedshift deleteProtection(@javax.annotation.Nullable String deleteProtection) {
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


  public GatewayUpdateProducerRedshift json(@javax.annotation.Nullable Boolean json) {
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


  public GatewayUpdateProducerRedshift name(@javax.annotation.Nonnull String name) {
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


  public GatewayUpdateProducerRedshift newName(@javax.annotation.Nullable String newName) {
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


  public GatewayUpdateProducerRedshift passwordLength(@javax.annotation.Nullable String passwordLength) {
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


  public GatewayUpdateProducerRedshift producerEncryptionKey(@javax.annotation.Nullable String producerEncryptionKey) {
    this.producerEncryptionKey = producerEncryptionKey;
    return this;
  }

  /**
   * Dynamic producer encryption key
   * @return producerEncryptionKey
   */
  @javax.annotation.Nullable
  public String getProducerEncryptionKey() {
    return producerEncryptionKey;
  }

  public void setProducerEncryptionKey(@javax.annotation.Nullable String producerEncryptionKey) {
    this.producerEncryptionKey = producerEncryptionKey;
  }


  public GatewayUpdateProducerRedshift redshiftDbName(@javax.annotation.Nullable String redshiftDbName) {
    this.redshiftDbName = redshiftDbName;
    return this;
  }

  /**
   * Redshift DB Name
   * @return redshiftDbName
   */
  @javax.annotation.Nullable
  public String getRedshiftDbName() {
    return redshiftDbName;
  }

  public void setRedshiftDbName(@javax.annotation.Nullable String redshiftDbName) {
    this.redshiftDbName = redshiftDbName;
  }


  public GatewayUpdateProducerRedshift redshiftHost(@javax.annotation.Nullable String redshiftHost) {
    this.redshiftHost = redshiftHost;
    return this;
  }

  /**
   * Redshift Host
   * @return redshiftHost
   */
  @javax.annotation.Nullable
  public String getRedshiftHost() {
    return redshiftHost;
  }

  public void setRedshiftHost(@javax.annotation.Nullable String redshiftHost) {
    this.redshiftHost = redshiftHost;
  }


  public GatewayUpdateProducerRedshift redshiftPassword(@javax.annotation.Nullable String redshiftPassword) {
    this.redshiftPassword = redshiftPassword;
    return this;
  }

  /**
   * Redshift Password
   * @return redshiftPassword
   */
  @javax.annotation.Nullable
  public String getRedshiftPassword() {
    return redshiftPassword;
  }

  public void setRedshiftPassword(@javax.annotation.Nullable String redshiftPassword) {
    this.redshiftPassword = redshiftPassword;
  }


  public GatewayUpdateProducerRedshift redshiftPort(@javax.annotation.Nullable String redshiftPort) {
    this.redshiftPort = redshiftPort;
    return this;
  }

  /**
   * Redshift Port
   * @return redshiftPort
   */
  @javax.annotation.Nullable
  public String getRedshiftPort() {
    return redshiftPort;
  }

  public void setRedshiftPort(@javax.annotation.Nullable String redshiftPort) {
    this.redshiftPort = redshiftPort;
  }


  public GatewayUpdateProducerRedshift redshiftUsername(@javax.annotation.Nullable String redshiftUsername) {
    this.redshiftUsername = redshiftUsername;
    return this;
  }

  /**
   * Redshift Username
   * @return redshiftUsername
   */
  @javax.annotation.Nullable
  public String getRedshiftUsername() {
    return redshiftUsername;
  }

  public void setRedshiftUsername(@javax.annotation.Nullable String redshiftUsername) {
    this.redshiftUsername = redshiftUsername;
  }


  public GatewayUpdateProducerRedshift secureAccessEnable(@javax.annotation.Nullable String secureAccessEnable) {
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


  public GatewayUpdateProducerRedshift secureAccessHost(@javax.annotation.Nullable List<String> secureAccessHost) {
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public GatewayUpdateProducerRedshift addSecureAccessHostItem(String secureAccessHostItem) {
    if (this.secureAccessHost == null) {
      this.secureAccessHost = new ArrayList<>();
    }
    this.secureAccessHost.add(secureAccessHostItem);
    return this;
  }

  /**
   * Target DB servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts)
   * @return secureAccessHost
   */
  @javax.annotation.Nullable
  public List<String> getSecureAccessHost() {
    return secureAccessHost;
  }

  public void setSecureAccessHost(@javax.annotation.Nullable List<String> secureAccessHost) {
    this.secureAccessHost = secureAccessHost;
  }


  public GatewayUpdateProducerRedshift ssl(@javax.annotation.Nullable Boolean ssl) {
    this.ssl = ssl;
    return this;
  }

  /**
   * Enable/Disable SSL [true/false]
   * @return ssl
   */
  @javax.annotation.Nullable
  public Boolean getSsl() {
    return ssl;
  }

  public void setSsl(@javax.annotation.Nullable Boolean ssl) {
    this.ssl = ssl;
  }


  public GatewayUpdateProducerRedshift tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerRedshift addTagsItem(String tagsItem) {
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


  public GatewayUpdateProducerRedshift targetName(@javax.annotation.Nullable String targetName) {
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


  public GatewayUpdateProducerRedshift token(@javax.annotation.Nullable String token) {
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


  public GatewayUpdateProducerRedshift uidToken(@javax.annotation.Nullable String uidToken) {
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


  public GatewayUpdateProducerRedshift userTtl(@javax.annotation.Nullable String userTtl) {
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
    GatewayUpdateProducerRedshift gatewayUpdateProducerRedshift = (GatewayUpdateProducerRedshift) o;
    return Objects.equals(this.creationStatements, gatewayUpdateProducerRedshift.creationStatements) &&
        Objects.equals(this.deleteProtection, gatewayUpdateProducerRedshift.deleteProtection) &&
        Objects.equals(this.json, gatewayUpdateProducerRedshift.json) &&
        Objects.equals(this.name, gatewayUpdateProducerRedshift.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerRedshift.newName) &&
        Objects.equals(this.passwordLength, gatewayUpdateProducerRedshift.passwordLength) &&
        Objects.equals(this.producerEncryptionKey, gatewayUpdateProducerRedshift.producerEncryptionKey) &&
        Objects.equals(this.redshiftDbName, gatewayUpdateProducerRedshift.redshiftDbName) &&
        Objects.equals(this.redshiftHost, gatewayUpdateProducerRedshift.redshiftHost) &&
        Objects.equals(this.redshiftPassword, gatewayUpdateProducerRedshift.redshiftPassword) &&
        Objects.equals(this.redshiftPort, gatewayUpdateProducerRedshift.redshiftPort) &&
        Objects.equals(this.redshiftUsername, gatewayUpdateProducerRedshift.redshiftUsername) &&
        Objects.equals(this.secureAccessEnable, gatewayUpdateProducerRedshift.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, gatewayUpdateProducerRedshift.secureAccessHost) &&
        Objects.equals(this.ssl, gatewayUpdateProducerRedshift.ssl) &&
        Objects.equals(this.tags, gatewayUpdateProducerRedshift.tags) &&
        Objects.equals(this.targetName, gatewayUpdateProducerRedshift.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerRedshift.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerRedshift.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerRedshift.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationStatements, deleteProtection, json, name, newName, passwordLength, producerEncryptionKey, redshiftDbName, redshiftHost, redshiftPassword, redshiftPort, redshiftUsername, secureAccessEnable, secureAccessHost, ssl, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerRedshift {\n");
    sb.append("    creationStatements: ").append(toIndentedString(creationStatements)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    producerEncryptionKey: ").append(toIndentedString(producerEncryptionKey)).append("\n");
    sb.append("    redshiftDbName: ").append(toIndentedString(redshiftDbName)).append("\n");
    sb.append("    redshiftHost: ").append(toIndentedString(redshiftHost)).append("\n");
    sb.append("    redshiftPassword: ").append(toIndentedString(redshiftPassword)).append("\n");
    sb.append("    redshiftPort: ").append(toIndentedString(redshiftPort)).append("\n");
    sb.append("    redshiftUsername: ").append(toIndentedString(redshiftUsername)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
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
    openapiFields.add("creation-statements");
    openapiFields.add("delete_protection");
    openapiFields.add("json");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("password-length");
    openapiFields.add("producer-encryption-key");
    openapiFields.add("redshift-db-name");
    openapiFields.add("redshift-host");
    openapiFields.add("redshift-password");
    openapiFields.add("redshift-port");
    openapiFields.add("redshift-username");
    openapiFields.add("secure-access-enable");
    openapiFields.add("secure-access-host");
    openapiFields.add("ssl");
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
   * @throws IOException if the JSON Element is invalid with respect to GatewayUpdateProducerRedshift
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GatewayUpdateProducerRedshift.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayUpdateProducerRedshift is not found in the empty JSON string", GatewayUpdateProducerRedshift.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GatewayUpdateProducerRedshift.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayUpdateProducerRedshift` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GatewayUpdateProducerRedshift.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("creation-statements") != null && !jsonObj.get("creation-statements").isJsonNull()) && !jsonObj.get("creation-statements").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creation-statements` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creation-statements").toString()));
      }
      if ((jsonObj.get("delete_protection") != null && !jsonObj.get("delete_protection").isJsonNull()) && !jsonObj.get("delete_protection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_protection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete_protection").toString()));
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
      if ((jsonObj.get("producer-encryption-key") != null && !jsonObj.get("producer-encryption-key").isJsonNull()) && !jsonObj.get("producer-encryption-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `producer-encryption-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("producer-encryption-key").toString()));
      }
      if ((jsonObj.get("redshift-db-name") != null && !jsonObj.get("redshift-db-name").isJsonNull()) && !jsonObj.get("redshift-db-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redshift-db-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redshift-db-name").toString()));
      }
      if ((jsonObj.get("redshift-host") != null && !jsonObj.get("redshift-host").isJsonNull()) && !jsonObj.get("redshift-host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redshift-host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redshift-host").toString()));
      }
      if ((jsonObj.get("redshift-password") != null && !jsonObj.get("redshift-password").isJsonNull()) && !jsonObj.get("redshift-password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redshift-password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redshift-password").toString()));
      }
      if ((jsonObj.get("redshift-port") != null && !jsonObj.get("redshift-port").isJsonNull()) && !jsonObj.get("redshift-port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redshift-port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redshift-port").toString()));
      }
      if ((jsonObj.get("redshift-username") != null && !jsonObj.get("redshift-username").isJsonNull()) && !jsonObj.get("redshift-username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redshift-username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redshift-username").toString()));
      }
      if ((jsonObj.get("secure-access-enable") != null && !jsonObj.get("secure-access-enable").isJsonNull()) && !jsonObj.get("secure-access-enable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure-access-enable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure-access-enable").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("secure-access-host") != null && !jsonObj.get("secure-access-host").isJsonNull() && !jsonObj.get("secure-access-host").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure-access-host` to be an array in the JSON string but got `%s`", jsonObj.get("secure-access-host").toString()));
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
       if (!GatewayUpdateProducerRedshift.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayUpdateProducerRedshift' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayUpdateProducerRedshift> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayUpdateProducerRedshift.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayUpdateProducerRedshift>() {
           @Override
           public void write(JsonWriter out, GatewayUpdateProducerRedshift value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayUpdateProducerRedshift read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GatewayUpdateProducerRedshift given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GatewayUpdateProducerRedshift
   * @throws IOException if the JSON string is invalid with respect to GatewayUpdateProducerRedshift
   */
  public static GatewayUpdateProducerRedshift fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayUpdateProducerRedshift.class);
  }

  /**
   * Convert an instance of GatewayUpdateProducerRedshift to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

