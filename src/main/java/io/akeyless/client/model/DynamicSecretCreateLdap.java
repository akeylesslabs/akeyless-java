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
 * dynamicSecretCreateLdap is a command that creates ldap dynamic secret
 */
@ApiModel(description = "dynamicSecretCreateLdap is a command that creates ldap dynamic secret")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicSecretCreateLdap {
  public static final String SERIALIZED_NAME_BIND_DN = "bind-dn";
  @SerializedName(SERIALIZED_NAME_BIND_DN)
  private String bindDn;

  public static final String SERIALIZED_NAME_BIND_DN_PASSWORD = "bind-dn-password";
  @SerializedName(SERIALIZED_NAME_BIND_DN_PASSWORD)
  private String bindDnPassword;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXTERNAL_USERNAME = "external-username";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USERNAME)
  private String externalUsername = "false";

  public static final String SERIALIZED_NAME_GROUP_DN = "group-dn";
  @SerializedName(SERIALIZED_NAME_GROUP_DN)
  private String groupDn;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_LDAP_CA_CERT = "ldap-ca-cert";
  @SerializedName(SERIALIZED_NAME_LDAP_CA_CERT)
  private String ldapCaCert;

  public static final String SERIALIZED_NAME_LDAP_URL = "ldap-url";
  @SerializedName(SERIALIZED_NAME_LDAP_URL)
  private String ldapUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD_LENGTH = "password-length";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LENGTH)
  private String passwordLength;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TOKEN_EXPIRATION = "token-expiration";
  @SerializedName(SERIALIZED_NAME_TOKEN_EXPIRATION)
  private String tokenExpiration;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_ATTRIBUTE = "user-attribute";
  @SerializedName(SERIALIZED_NAME_USER_ATTRIBUTE)
  private String userAttribute;

  public static final String SERIALIZED_NAME_USER_DN = "user-dn";
  @SerializedName(SERIALIZED_NAME_USER_DN)
  private String userDn;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  private String userTtl = "60m";

  public DynamicSecretCreateLdap() { 
  }

  public DynamicSecretCreateLdap bindDn(String bindDn) {
    
    this.bindDn = bindDn;
    return this;
  }

   /**
   * Bind DN
   * @return bindDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bind DN")

  public String getBindDn() {
    return bindDn;
  }


  public void setBindDn(String bindDn) {
    this.bindDn = bindDn;
  }


  public DynamicSecretCreateLdap bindDnPassword(String bindDnPassword) {
    
    this.bindDnPassword = bindDnPassword;
    return this;
  }

   /**
   * Bind DN Password
   * @return bindDnPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bind DN Password")

  public String getBindDnPassword() {
    return bindDnPassword;
  }


  public void setBindDnPassword(String bindDnPassword) {
    this.bindDnPassword = bindDnPassword;
  }


  public DynamicSecretCreateLdap deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this item [true/false]
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this item [true/false]")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public DynamicSecretCreateLdap description(String description) {
    
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


  public DynamicSecretCreateLdap externalUsername(String externalUsername) {
    
    this.externalUsername = externalUsername;
    return this;
  }

   /**
   * Externally provided username [true/false]
   * @return externalUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Externally provided username [true/false]")

  public String getExternalUsername() {
    return externalUsername;
  }


  public void setExternalUsername(String externalUsername) {
    this.externalUsername = externalUsername;
  }


  public DynamicSecretCreateLdap groupDn(String groupDn) {
    
    this.groupDn = groupDn;
    return this;
  }

   /**
   * Group DN which the temporary user should be added
   * @return groupDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group DN which the temporary user should be added")

  public String getGroupDn() {
    return groupDn;
  }


  public void setGroupDn(String groupDn) {
    this.groupDn = groupDn;
  }


  public DynamicSecretCreateLdap json(Boolean json) {
    
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


  public DynamicSecretCreateLdap ldapCaCert(String ldapCaCert) {
    
    this.ldapCaCert = ldapCaCert;
    return this;
  }

   /**
   * CA Certificate File Content
   * @return ldapCaCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CA Certificate File Content")

  public String getLdapCaCert() {
    return ldapCaCert;
  }


  public void setLdapCaCert(String ldapCaCert) {
    this.ldapCaCert = ldapCaCert;
  }


  public DynamicSecretCreateLdap ldapUrl(String ldapUrl) {
    
    this.ldapUrl = ldapUrl;
    return this;
  }

   /**
   * LDAP Server URL
   * @return ldapUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LDAP Server URL")

  public String getLdapUrl() {
    return ldapUrl;
  }


  public void setLdapUrl(String ldapUrl) {
    this.ldapUrl = ldapUrl;
  }


  public DynamicSecretCreateLdap name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Dynamic secret name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Dynamic secret name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DynamicSecretCreateLdap passwordLength(String passwordLength) {
    
    this.passwordLength = passwordLength;
    return this;
  }

   /**
   * The length of the password to be generated
   * @return passwordLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The length of the password to be generated")

  public String getPasswordLength() {
    return passwordLength;
  }


  public void setPasswordLength(String passwordLength) {
    this.passwordLength = passwordLength;
  }


  public DynamicSecretCreateLdap producerEncryptionKeyName(String producerEncryptionKeyName) {
    
    this.producerEncryptionKeyName = producerEncryptionKeyName;
    return this;
  }

   /**
   * Dynamic producer encryption key
   * @return producerEncryptionKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic producer encryption key")

  public String getProducerEncryptionKeyName() {
    return producerEncryptionKeyName;
  }


  public void setProducerEncryptionKeyName(String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
  }


  public DynamicSecretCreateLdap tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DynamicSecretCreateLdap addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Add tags attached to this object
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Add tags attached to this object")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public DynamicSecretCreateLdap targetName(String targetName) {
    
    this.targetName = targetName;
    return this;
  }

   /**
   * Target name
   * @return targetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target name")

  public String getTargetName() {
    return targetName;
  }


  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  public DynamicSecretCreateLdap token(String token) {
    
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


  public DynamicSecretCreateLdap tokenExpiration(String tokenExpiration) {
    
    this.tokenExpiration = tokenExpiration;
    return this;
  }

   /**
   * Token expiration
   * @return tokenExpiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token expiration")

  public String getTokenExpiration() {
    return tokenExpiration;
  }


  public void setTokenExpiration(String tokenExpiration) {
    this.tokenExpiration = tokenExpiration;
  }


  public DynamicSecretCreateLdap uidToken(String uidToken) {
    
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


  public DynamicSecretCreateLdap userAttribute(String userAttribute) {
    
    this.userAttribute = userAttribute;
    return this;
  }

   /**
   * User Attribute
   * @return userAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User Attribute")

  public String getUserAttribute() {
    return userAttribute;
  }


  public void setUserAttribute(String userAttribute) {
    this.userAttribute = userAttribute;
  }


  public DynamicSecretCreateLdap userDn(String userDn) {
    
    this.userDn = userDn;
    return this;
  }

   /**
   * User DN
   * @return userDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User DN")

  public String getUserDn() {
    return userDn;
  }


  public void setUserDn(String userDn) {
    this.userDn = userDn;
  }


  public DynamicSecretCreateLdap userTtl(String userTtl) {
    
    this.userTtl = userTtl;
    return this;
  }

   /**
   * User TTL
   * @return userTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User TTL")

  public String getUserTtl() {
    return userTtl;
  }


  public void setUserTtl(String userTtl) {
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
    DynamicSecretCreateLdap dynamicSecretCreateLdap = (DynamicSecretCreateLdap) o;
    return Objects.equals(this.bindDn, dynamicSecretCreateLdap.bindDn) &&
        Objects.equals(this.bindDnPassword, dynamicSecretCreateLdap.bindDnPassword) &&
        Objects.equals(this.deleteProtection, dynamicSecretCreateLdap.deleteProtection) &&
        Objects.equals(this.description, dynamicSecretCreateLdap.description) &&
        Objects.equals(this.externalUsername, dynamicSecretCreateLdap.externalUsername) &&
        Objects.equals(this.groupDn, dynamicSecretCreateLdap.groupDn) &&
        Objects.equals(this.json, dynamicSecretCreateLdap.json) &&
        Objects.equals(this.ldapCaCert, dynamicSecretCreateLdap.ldapCaCert) &&
        Objects.equals(this.ldapUrl, dynamicSecretCreateLdap.ldapUrl) &&
        Objects.equals(this.name, dynamicSecretCreateLdap.name) &&
        Objects.equals(this.passwordLength, dynamicSecretCreateLdap.passwordLength) &&
        Objects.equals(this.producerEncryptionKeyName, dynamicSecretCreateLdap.producerEncryptionKeyName) &&
        Objects.equals(this.tags, dynamicSecretCreateLdap.tags) &&
        Objects.equals(this.targetName, dynamicSecretCreateLdap.targetName) &&
        Objects.equals(this.token, dynamicSecretCreateLdap.token) &&
        Objects.equals(this.tokenExpiration, dynamicSecretCreateLdap.tokenExpiration) &&
        Objects.equals(this.uidToken, dynamicSecretCreateLdap.uidToken) &&
        Objects.equals(this.userAttribute, dynamicSecretCreateLdap.userAttribute) &&
        Objects.equals(this.userDn, dynamicSecretCreateLdap.userDn) &&
        Objects.equals(this.userTtl, dynamicSecretCreateLdap.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindDn, bindDnPassword, deleteProtection, description, externalUsername, groupDn, json, ldapCaCert, ldapUrl, name, passwordLength, producerEncryptionKeyName, tags, targetName, token, tokenExpiration, uidToken, userAttribute, userDn, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicSecretCreateLdap {\n");
    sb.append("    bindDn: ").append(toIndentedString(bindDn)).append("\n");
    sb.append("    bindDnPassword: ").append(toIndentedString(bindDnPassword)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalUsername: ").append(toIndentedString(externalUsername)).append("\n");
    sb.append("    groupDn: ").append(toIndentedString(groupDn)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    ldapCaCert: ").append(toIndentedString(ldapCaCert)).append("\n");
    sb.append("    ldapUrl: ").append(toIndentedString(ldapUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    passwordLength: ").append(toIndentedString(passwordLength)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenExpiration: ").append(toIndentedString(tokenExpiration)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userAttribute: ").append(toIndentedString(userAttribute)).append("\n");
    sb.append("    userDn: ").append(toIndentedString(userDn)).append("\n");
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

}

