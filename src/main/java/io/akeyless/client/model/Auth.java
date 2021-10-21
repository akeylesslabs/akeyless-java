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
 * Auth
 */

public class Auth {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  private String accessId;

  public static final String SERIALIZED_NAME_ACCESS_KEY = "access-key";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
  private String accessKey;

  public static final String SERIALIZED_NAME_ACCESS_TYPE = "access-type";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private String accessType = "access_key";

  public static final String SERIALIZED_NAME_ADMIN_EMAIL = "admin-email";
  @SerializedName(SERIALIZED_NAME_ADMIN_EMAIL)
  private String adminEmail;

  public static final String SERIALIZED_NAME_ADMIN_PASSWORD = "admin-password";
  @SerializedName(SERIALIZED_NAME_ADMIN_PASSWORD)
  private String adminPassword;

  public static final String SERIALIZED_NAME_CLOUD_ID = "cloud-id";
  @SerializedName(SERIALIZED_NAME_CLOUD_ID)
  private String cloudId;

  public static final String SERIALIZED_NAME_GCP_AUDIENCE = "gcp-audience";
  @SerializedName(SERIALIZED_NAME_GCP_AUDIENCE)
  private String gcpAudience;

  public static final String SERIALIZED_NAME_JWT = "jwt";
  @SerializedName(SERIALIZED_NAME_JWT)
  private String jwt;

  public static final String SERIALIZED_NAME_K8S_AUTH_CONFIG_NAME = "k8s-auth-config-name";
  @SerializedName(SERIALIZED_NAME_K8S_AUTH_CONFIG_NAME)
  private String k8sAuthConfigName;

  public static final String SERIALIZED_NAME_K8S_SERVICE_ACCOUNT_TOKEN = "k8s-service-account-token";
  @SerializedName(SERIALIZED_NAME_K8S_SERVICE_ACCOUNT_TOKEN)
  private String k8sServiceAccountToken;

  public static final String SERIALIZED_NAME_LDAP_PASSWORD = "ldap_password";
  @SerializedName(SERIALIZED_NAME_LDAP_PASSWORD)
  private String ldapPassword;

  public static final String SERIALIZED_NAME_LDAP_USERNAME = "ldap_username";
  @SerializedName(SERIALIZED_NAME_LDAP_USERNAME)
  private String ldapUsername;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid_token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public Auth accessId(String accessId) {
    
    this.accessId = accessId;
    return this;
  }

   /**
   * Access ID
   * @return accessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access ID")

  public String getAccessId() {
    return accessId;
  }


  public void setAccessId(String accessId) {
    this.accessId = accessId;
  }


  public Auth accessKey(String accessKey) {
    
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Access key (relevant only for access-type&#x3D;access_key)
   * @return accessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access key (relevant only for access-type=access_key)")

  public String getAccessKey() {
    return accessKey;
  }


  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  public Auth accessType(String accessType) {
    
    this.accessType = accessType;
    return this;
  }

   /**
   * Access Type (access_key/password/saml/ldap/k8s/azure_ad/aws_iam/universal_identity/jwt/gcp)
   * @return accessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access Type (access_key/password/saml/ldap/k8s/azure_ad/aws_iam/universal_identity/jwt/gcp)")

  public String getAccessType() {
    return accessType;
  }


  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }


  public Auth adminEmail(String adminEmail) {
    
    this.adminEmail = adminEmail;
    return this;
  }

   /**
   * Email (relevant only for access-type&#x3D;password)
   * @return adminEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email (relevant only for access-type=password)")

  public String getAdminEmail() {
    return adminEmail;
  }


  public void setAdminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
  }


  public Auth adminPassword(String adminPassword) {
    
    this.adminPassword = adminPassword;
    return this;
  }

   /**
   * Password (relevant only for access-type&#x3D;password)
   * @return adminPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password (relevant only for access-type=password)")

  public String getAdminPassword() {
    return adminPassword;
  }


  public void setAdminPassword(String adminPassword) {
    this.adminPassword = adminPassword;
  }


  public Auth cloudId(String cloudId) {
    
    this.cloudId = cloudId;
    return this;
  }

   /**
   * The cloud identity (relevant only for access-type&#x3D;azure_ad,aws_iam,gcp)
   * @return cloudId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cloud identity (relevant only for access-type=azure_ad,aws_iam,gcp)")

  public String getCloudId() {
    return cloudId;
  }


  public void setCloudId(String cloudId) {
    this.cloudId = cloudId;
  }


  public Auth gcpAudience(String gcpAudience) {
    
    this.gcpAudience = gcpAudience;
    return this;
  }

   /**
   * GCP JWT audience
   * @return gcpAudience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GCP JWT audience")

  public String getGcpAudience() {
    return gcpAudience;
  }


  public void setGcpAudience(String gcpAudience) {
    this.gcpAudience = gcpAudience;
  }


  public Auth jwt(String jwt) {
    
    this.jwt = jwt;
    return this;
  }

   /**
   * The Json Web Token (relevant only for access-type&#x3D;jwt/oidc)
   * @return jwt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Json Web Token (relevant only for access-type=jwt/oidc)")

  public String getJwt() {
    return jwt;
  }


  public void setJwt(String jwt) {
    this.jwt = jwt;
  }


  public Auth k8sAuthConfigName(String k8sAuthConfigName) {
    
    this.k8sAuthConfigName = k8sAuthConfigName;
    return this;
  }

   /**
   * The K8S Auth config name (relevant only for access-type&#x3D;k8s)
   * @return k8sAuthConfigName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The K8S Auth config name (relevant only for access-type=k8s)")

  public String getK8sAuthConfigName() {
    return k8sAuthConfigName;
  }


  public void setK8sAuthConfigName(String k8sAuthConfigName) {
    this.k8sAuthConfigName = k8sAuthConfigName;
  }


  public Auth k8sServiceAccountToken(String k8sServiceAccountToken) {
    
    this.k8sServiceAccountToken = k8sServiceAccountToken;
    return this;
  }

   /**
   * The K8S service account token. (relevant only for access-type&#x3D;k8s)
   * @return k8sServiceAccountToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The K8S service account token. (relevant only for access-type=k8s)")

  public String getK8sServiceAccountToken() {
    return k8sServiceAccountToken;
  }


  public void setK8sServiceAccountToken(String k8sServiceAccountToken) {
    this.k8sServiceAccountToken = k8sServiceAccountToken;
  }


  public Auth ldapPassword(String ldapPassword) {
    
    this.ldapPassword = ldapPassword;
    return this;
  }

   /**
   * LDAP password (relevant only for access-type&#x3D;ldap)
   * @return ldapPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LDAP password (relevant only for access-type=ldap)")

  public String getLdapPassword() {
    return ldapPassword;
  }


  public void setLdapPassword(String ldapPassword) {
    this.ldapPassword = ldapPassword;
  }


  public Auth ldapUsername(String ldapUsername) {
    
    this.ldapUsername = ldapUsername;
    return this;
  }

   /**
   * LDAP username (relevant only for access-type&#x3D;ldap)
   * @return ldapUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LDAP username (relevant only for access-type=ldap)")

  public String getLdapUsername() {
    return ldapUsername;
  }


  public void setLdapUsername(String ldapUsername) {
    this.ldapUsername = ldapUsername;
  }


  public Auth uidToken(String uidToken) {
    
    this.uidToken = uidToken;
    return this;
  }

   /**
   * The universal_identity token (relevant only for access-type&#x3D;universal_identity)
   * @return uidToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The universal_identity token (relevant only for access-type=universal_identity)")

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
    Auth auth = (Auth) o;
    return Objects.equals(this.accessId, auth.accessId) &&
        Objects.equals(this.accessKey, auth.accessKey) &&
        Objects.equals(this.accessType, auth.accessType) &&
        Objects.equals(this.adminEmail, auth.adminEmail) &&
        Objects.equals(this.adminPassword, auth.adminPassword) &&
        Objects.equals(this.cloudId, auth.cloudId) &&
        Objects.equals(this.gcpAudience, auth.gcpAudience) &&
        Objects.equals(this.jwt, auth.jwt) &&
        Objects.equals(this.k8sAuthConfigName, auth.k8sAuthConfigName) &&
        Objects.equals(this.k8sServiceAccountToken, auth.k8sServiceAccountToken) &&
        Objects.equals(this.ldapPassword, auth.ldapPassword) &&
        Objects.equals(this.ldapUsername, auth.ldapUsername) &&
        Objects.equals(this.uidToken, auth.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, accessKey, accessType, adminEmail, adminPassword, cloudId, gcpAudience, jwt, k8sAuthConfigName, k8sServiceAccountToken, ldapPassword, ldapUsername, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    adminEmail: ").append(toIndentedString(adminEmail)).append("\n");
    sb.append("    adminPassword: ").append(toIndentedString(adminPassword)).append("\n");
    sb.append("    cloudId: ").append(toIndentedString(cloudId)).append("\n");
    sb.append("    gcpAudience: ").append(toIndentedString(gcpAudience)).append("\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
    sb.append("    k8sAuthConfigName: ").append(toIndentedString(k8sAuthConfigName)).append("\n");
    sb.append("    k8sServiceAccountToken: ").append(toIndentedString(k8sServiceAccountToken)).append("\n");
    sb.append("    ldapPassword: ").append(toIndentedString(ldapPassword)).append("\n");
    sb.append("    ldapUsername: ").append(toIndentedString(ldapUsername)).append("\n");
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

