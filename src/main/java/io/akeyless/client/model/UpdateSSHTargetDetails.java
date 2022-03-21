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

/**
 * UpdateSSHTargetDetails
 */

public class UpdateSSHTargetDetails {
  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_KEEP_PREV_VERSION = "keep-prev-version";
  @SerializedName(SERIALIZED_NAME_KEEP_PREV_VERSION)
  private String keepPrevVersion;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_VERSION = "new-version";
  @SerializedName(SERIALIZED_NAME_NEW_VERSION)
  private Boolean newVersion;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_PRIVATE_KEY = "private-key";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  private String privateKey;

  public static final String SERIALIZED_NAME_PRIVATE_KEY_PASSWORD = "private-key-password";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY_PASSWORD)
  private String privateKeyPassword;

  public static final String SERIALIZED_NAME_PROTECTION_KEY = "protection_key";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY)
  private String protectionKey;

  public static final String SERIALIZED_NAME_SSH_PASSWORD = "ssh-password";
  @SerializedName(SERIALIZED_NAME_SSH_PASSWORD)
  private String sshPassword;

  public static final String SERIALIZED_NAME_SSH_USERNAME = "ssh-username";
  @SerializedName(SERIALIZED_NAME_SSH_USERNAME)
  private String sshUsername;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public UpdateSSHTargetDetails host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public UpdateSSHTargetDetails keepPrevVersion(String keepPrevVersion) {
    
    this.keepPrevVersion = keepPrevVersion;
    return this;
  }

   /**
   * Get keepPrevVersion
   * @return keepPrevVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeepPrevVersion() {
    return keepPrevVersion;
  }


  public void setKeepPrevVersion(String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
  }


  public UpdateSSHTargetDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Target name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Target name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateSSHTargetDetails newVersion(Boolean newVersion) {
    
    this.newVersion = newVersion;
    return this;
  }

   /**
   * Deprecated
   * @return newVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated")

  public Boolean getNewVersion() {
    return newVersion;
  }


  public void setNewVersion(Boolean newVersion) {
    this.newVersion = newVersion;
  }


  public UpdateSSHTargetDetails port(String port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPort() {
    return port;
  }


  public void setPort(String port) {
    this.port = port;
  }


  public UpdateSSHTargetDetails privateKey(String privateKey) {
    
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Get privateKey
   * @return privateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrivateKey() {
    return privateKey;
  }


  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  public UpdateSSHTargetDetails privateKeyPassword(String privateKeyPassword) {
    
    this.privateKeyPassword = privateKeyPassword;
    return this;
  }

   /**
   * Get privateKeyPassword
   * @return privateKeyPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrivateKeyPassword() {
    return privateKeyPassword;
  }


  public void setPrivateKeyPassword(String privateKeyPassword) {
    this.privateKeyPassword = privateKeyPassword;
  }


  public UpdateSSHTargetDetails protectionKey(String protectionKey) {
    
    this.protectionKey = protectionKey;
    return this;
  }

   /**
   * The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)
   * @return protectionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)")

  public String getProtectionKey() {
    return protectionKey;
  }


  public void setProtectionKey(String protectionKey) {
    this.protectionKey = protectionKey;
  }


  public UpdateSSHTargetDetails sshPassword(String sshPassword) {
    
    this.sshPassword = sshPassword;
    return this;
  }

   /**
   * Get sshPassword
   * @return sshPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSshPassword() {
    return sshPassword;
  }


  public void setSshPassword(String sshPassword) {
    this.sshPassword = sshPassword;
  }


  public UpdateSSHTargetDetails sshUsername(String sshUsername) {
    
    this.sshUsername = sshUsername;
    return this;
  }

   /**
   * Get sshUsername
   * @return sshUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSshUsername() {
    return sshUsername;
  }


  public void setSshUsername(String sshUsername) {
    this.sshUsername = sshUsername;
  }


  public UpdateSSHTargetDetails token(String token) {
    
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


  public UpdateSSHTargetDetails uidToken(String uidToken) {
    
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
    UpdateSSHTargetDetails updateSSHTargetDetails = (UpdateSSHTargetDetails) o;
    return Objects.equals(this.host, updateSSHTargetDetails.host) &&
        Objects.equals(this.keepPrevVersion, updateSSHTargetDetails.keepPrevVersion) &&
        Objects.equals(this.name, updateSSHTargetDetails.name) &&
        Objects.equals(this.newVersion, updateSSHTargetDetails.newVersion) &&
        Objects.equals(this.port, updateSSHTargetDetails.port) &&
        Objects.equals(this.privateKey, updateSSHTargetDetails.privateKey) &&
        Objects.equals(this.privateKeyPassword, updateSSHTargetDetails.privateKeyPassword) &&
        Objects.equals(this.protectionKey, updateSSHTargetDetails.protectionKey) &&
        Objects.equals(this.sshPassword, updateSSHTargetDetails.sshPassword) &&
        Objects.equals(this.sshUsername, updateSSHTargetDetails.sshUsername) &&
        Objects.equals(this.token, updateSSHTargetDetails.token) &&
        Objects.equals(this.uidToken, updateSSHTargetDetails.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, keepPrevVersion, name, newVersion, port, privateKey, privateKeyPassword, protectionKey, sshPassword, sshUsername, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSSHTargetDetails {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newVersion: ").append(toIndentedString(newVersion)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    privateKeyPassword: ").append(toIndentedString(privateKeyPassword)).append("\n");
    sb.append("    protectionKey: ").append(toIndentedString(protectionKey)).append("\n");
    sb.append("    sshPassword: ").append(toIndentedString(sshPassword)).append("\n");
    sb.append("    sshUsername: ").append(toIndentedString(sshUsername)).append("\n");
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

