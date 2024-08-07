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
 * updateGlobalSignTarget is a command that updates an existing target. [Deprecated: Use target-update-globalsign command]
 */
@ApiModel(description = "updateGlobalSignTarget is a command that updates an existing target. [Deprecated: Use target-update-globalsign command]")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateGlobalSignTarget {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CONTACT_EMAIL = "contact-email";
  @SerializedName(SERIALIZED_NAME_CONTACT_EMAIL)
  private String contactEmail;

  public static final String SERIALIZED_NAME_CONTACT_FIRST_NAME = "contact-first-name";
  @SerializedName(SERIALIZED_NAME_CONTACT_FIRST_NAME)
  private String contactFirstName;

  public static final String SERIALIZED_NAME_CONTACT_LAST_NAME = "contact-last-name";
  @SerializedName(SERIALIZED_NAME_CONTACT_LAST_NAME)
  private String contactLastName;

  public static final String SERIALIZED_NAME_CONTACT_PHONE = "contact-phone";
  @SerializedName(SERIALIZED_NAME_CONTACT_PHONE)
  private String contactPhone;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEEP_PREV_VERSION = "keep-prev-version";
  @SerializedName(SERIALIZED_NAME_KEEP_PREV_VERSION)
  private String keepPrevVersion;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_MAX_VERSIONS = "max-versions";
  @SerializedName(SERIALIZED_NAME_MAX_VERSIONS)
  private String maxVersions;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profile-id";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private String profileId;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private String timeout = "5m";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_UPDATE_VERSION = "update-version";
  @SerializedName(SERIALIZED_NAME_UPDATE_VERSION)
  private Boolean updateVersion;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public UpdateGlobalSignTarget() { 
  }

  public UpdateGlobalSignTarget comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Deprecated - use description
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - use description")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public UpdateGlobalSignTarget contactEmail(String contactEmail) {
    
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Email of the GlobalSign GCC account contact
   * @return contactEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Email of the GlobalSign GCC account contact")

  public String getContactEmail() {
    return contactEmail;
  }


  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }


  public UpdateGlobalSignTarget contactFirstName(String contactFirstName) {
    
    this.contactFirstName = contactFirstName;
    return this;
  }

   /**
   * First name of the GlobalSign GCC account contact
   * @return contactFirstName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "First name of the GlobalSign GCC account contact")

  public String getContactFirstName() {
    return contactFirstName;
  }


  public void setContactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
  }


  public UpdateGlobalSignTarget contactLastName(String contactLastName) {
    
    this.contactLastName = contactLastName;
    return this;
  }

   /**
   * Last name of the GlobalSign GCC account contact
   * @return contactLastName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Last name of the GlobalSign GCC account contact")

  public String getContactLastName() {
    return contactLastName;
  }


  public void setContactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
  }


  public UpdateGlobalSignTarget contactPhone(String contactPhone) {
    
    this.contactPhone = contactPhone;
    return this;
  }

   /**
   * Telephone of the GlobalSign GCC account contact
   * @return contactPhone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Telephone of the GlobalSign GCC account contact")

  public String getContactPhone() {
    return contactPhone;
  }


  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }


  public UpdateGlobalSignTarget description(String description) {
    
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


  public UpdateGlobalSignTarget json(Boolean json) {
    
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


  public UpdateGlobalSignTarget keepPrevVersion(String keepPrevVersion) {
    
    this.keepPrevVersion = keepPrevVersion;
    return this;
  }

   /**
   * Whether to keep previous version [true/false]. If not set, use default according to account settings
   * @return keepPrevVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to keep previous version [true/false]. If not set, use default according to account settings")

  public String getKeepPrevVersion() {
    return keepPrevVersion;
  }


  public void setKeepPrevVersion(String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
  }


  public UpdateGlobalSignTarget key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public UpdateGlobalSignTarget maxVersions(String maxVersions) {
    
    this.maxVersions = maxVersions;
    return this;
  }

   /**
   * Set the maximum number of versions, limited by the account settings defaults.
   * @return maxVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set the maximum number of versions, limited by the account settings defaults.")

  public String getMaxVersions() {
    return maxVersions;
  }


  public void setMaxVersions(String maxVersions) {
    this.maxVersions = maxVersions;
  }


  public UpdateGlobalSignTarget name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Target name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Target name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateGlobalSignTarget newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * New target name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New target name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public UpdateGlobalSignTarget password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password of the GlobalSign GCC account
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Password of the GlobalSign GCC account")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public UpdateGlobalSignTarget profileId(String profileId) {
    
    this.profileId = profileId;
    return this;
  }

   /**
   * Profile ID of the GlobalSign GCC account
   * @return profileId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Profile ID of the GlobalSign GCC account")

  public String getProfileId() {
    return profileId;
  }


  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  public UpdateGlobalSignTarget timeout(String timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Timeout waiting for certificate validation in Duration format (1h - 1 Hour, 20m - 20 Minutes, 33m3s - 33 Minutes and 3 Seconds), maximum 1h.
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timeout waiting for certificate validation in Duration format (1h - 1 Hour, 20m - 20 Minutes, 33m3s - 33 Minutes and 3 Seconds), maximum 1h.")

  public String getTimeout() {
    return timeout;
  }


  public void setTimeout(String timeout) {
    this.timeout = timeout;
  }


  public UpdateGlobalSignTarget token(String token) {
    
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


  public UpdateGlobalSignTarget uidToken(String uidToken) {
    
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


  public UpdateGlobalSignTarget updateVersion(Boolean updateVersion) {
    
    this.updateVersion = updateVersion;
    return this;
  }

   /**
   * Deprecated
   * @return updateVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated")

  public Boolean getUpdateVersion() {
    return updateVersion;
  }


  public void setUpdateVersion(Boolean updateVersion) {
    this.updateVersion = updateVersion;
  }


  public UpdateGlobalSignTarget username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username of the GlobalSign GCC account
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Username of the GlobalSign GCC account")

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
    UpdateGlobalSignTarget updateGlobalSignTarget = (UpdateGlobalSignTarget) o;
    return Objects.equals(this.comment, updateGlobalSignTarget.comment) &&
        Objects.equals(this.contactEmail, updateGlobalSignTarget.contactEmail) &&
        Objects.equals(this.contactFirstName, updateGlobalSignTarget.contactFirstName) &&
        Objects.equals(this.contactLastName, updateGlobalSignTarget.contactLastName) &&
        Objects.equals(this.contactPhone, updateGlobalSignTarget.contactPhone) &&
        Objects.equals(this.description, updateGlobalSignTarget.description) &&
        Objects.equals(this.json, updateGlobalSignTarget.json) &&
        Objects.equals(this.keepPrevVersion, updateGlobalSignTarget.keepPrevVersion) &&
        Objects.equals(this.key, updateGlobalSignTarget.key) &&
        Objects.equals(this.maxVersions, updateGlobalSignTarget.maxVersions) &&
        Objects.equals(this.name, updateGlobalSignTarget.name) &&
        Objects.equals(this.newName, updateGlobalSignTarget.newName) &&
        Objects.equals(this.password, updateGlobalSignTarget.password) &&
        Objects.equals(this.profileId, updateGlobalSignTarget.profileId) &&
        Objects.equals(this.timeout, updateGlobalSignTarget.timeout) &&
        Objects.equals(this.token, updateGlobalSignTarget.token) &&
        Objects.equals(this.uidToken, updateGlobalSignTarget.uidToken) &&
        Objects.equals(this.updateVersion, updateGlobalSignTarget.updateVersion) &&
        Objects.equals(this.username, updateGlobalSignTarget.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, contactEmail, contactFirstName, contactLastName, contactPhone, description, json, keepPrevVersion, key, maxVersions, name, newName, password, profileId, timeout, token, uidToken, updateVersion, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGlobalSignTarget {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contactFirstName: ").append(toIndentedString(contactFirstName)).append("\n");
    sb.append("    contactLastName: ").append(toIndentedString(contactLastName)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    updateVersion: ").append(toIndentedString(updateVersion)).append("\n");
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

