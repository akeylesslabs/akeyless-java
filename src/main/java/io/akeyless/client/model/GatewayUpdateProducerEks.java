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
 * gatewayUpdateProducerEks is a command that updates eks producer
 */
@ApiModel(description = "gatewayUpdateProducerEks is a command that updates eks producer")

public class GatewayUpdateProducerEks {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_EKS_ACCESS_KEY_ID = "eks-access-key-id";
  @SerializedName(SERIALIZED_NAME_EKS_ACCESS_KEY_ID)
  private String eksAccessKeyId;

  public static final String SERIALIZED_NAME_EKS_ASSUME_ROLE = "eks-assume-role";
  @SerializedName(SERIALIZED_NAME_EKS_ASSUME_ROLE)
  private String eksAssumeRole;

  public static final String SERIALIZED_NAME_EKS_CLUSTER_CA_CERT = "eks-cluster-ca-cert";
  @SerializedName(SERIALIZED_NAME_EKS_CLUSTER_CA_CERT)
  private String eksClusterCaCert;

  public static final String SERIALIZED_NAME_EKS_CLUSTER_ENDPOINT = "eks-cluster-endpoint";
  @SerializedName(SERIALIZED_NAME_EKS_CLUSTER_ENDPOINT)
  private String eksClusterEndpoint;

  public static final String SERIALIZED_NAME_EKS_CLUSTER_NAME = "eks-cluster-name";
  @SerializedName(SERIALIZED_NAME_EKS_CLUSTER_NAME)
  private String eksClusterName;

  public static final String SERIALIZED_NAME_EKS_REGION = "eks-region";
  @SerializedName(SERIALIZED_NAME_EKS_REGION)
  private String eksRegion = "us-east-2";

  public static final String SERIALIZED_NAME_EKS_SECRET_ACCESS_KEY = "eks-secret-access-key";
  @SerializedName(SERIALIZED_NAME_EKS_SECRET_ACCESS_KEY)
  private String eksSecretAccessKey;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ALLOW_PORT_FORWADING = "secure-access-allow-port-forwading";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ALLOW_PORT_FORWADING)
  private Boolean secureAccessAllowPortForwading;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  private String secureAccessBastionIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_CLUSTER_ENDPOINT = "secure-access-cluster-endpoint";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_CLUSTER_ENDPOINT)
  private String secureAccessClusterEndpoint;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB = "secure-access-web";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB)
  private Boolean secureAccessWeb;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  private String userTtl = "15m";


  public GatewayUpdateProducerEks deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this item
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this item")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public GatewayUpdateProducerEks eksAccessKeyId(String eksAccessKeyId) {
    
    this.eksAccessKeyId = eksAccessKeyId;
    return this;
  }

   /**
   * Access Key ID
   * @return eksAccessKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access Key ID")

  public String getEksAccessKeyId() {
    return eksAccessKeyId;
  }


  public void setEksAccessKeyId(String eksAccessKeyId) {
    this.eksAccessKeyId = eksAccessKeyId;
  }


  public GatewayUpdateProducerEks eksAssumeRole(String eksAssumeRole) {
    
    this.eksAssumeRole = eksAssumeRole;
    return this;
  }

   /**
   * IAM assume role
   * @return eksAssumeRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IAM assume role")

  public String getEksAssumeRole() {
    return eksAssumeRole;
  }


  public void setEksAssumeRole(String eksAssumeRole) {
    this.eksAssumeRole = eksAssumeRole;
  }


  public GatewayUpdateProducerEks eksClusterCaCert(String eksClusterCaCert) {
    
    this.eksClusterCaCert = eksClusterCaCert;
    return this;
  }

   /**
   * EKS cluster CA certificate
   * @return eksClusterCaCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EKS cluster CA certificate")

  public String getEksClusterCaCert() {
    return eksClusterCaCert;
  }


  public void setEksClusterCaCert(String eksClusterCaCert) {
    this.eksClusterCaCert = eksClusterCaCert;
  }


  public GatewayUpdateProducerEks eksClusterEndpoint(String eksClusterEndpoint) {
    
    this.eksClusterEndpoint = eksClusterEndpoint;
    return this;
  }

   /**
   * EKS cluster URL endpoint
   * @return eksClusterEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EKS cluster URL endpoint")

  public String getEksClusterEndpoint() {
    return eksClusterEndpoint;
  }


  public void setEksClusterEndpoint(String eksClusterEndpoint) {
    this.eksClusterEndpoint = eksClusterEndpoint;
  }


  public GatewayUpdateProducerEks eksClusterName(String eksClusterName) {
    
    this.eksClusterName = eksClusterName;
    return this;
  }

   /**
   * EKS cluster name
   * @return eksClusterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EKS cluster name")

  public String getEksClusterName() {
    return eksClusterName;
  }


  public void setEksClusterName(String eksClusterName) {
    this.eksClusterName = eksClusterName;
  }


  public GatewayUpdateProducerEks eksRegion(String eksRegion) {
    
    this.eksRegion = eksRegion;
    return this;
  }

   /**
   * Region
   * @return eksRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Region")

  public String getEksRegion() {
    return eksRegion;
  }


  public void setEksRegion(String eksRegion) {
    this.eksRegion = eksRegion;
  }


  public GatewayUpdateProducerEks eksSecretAccessKey(String eksSecretAccessKey) {
    
    this.eksSecretAccessKey = eksSecretAccessKey;
    return this;
  }

   /**
   * Secret Access Key
   * @return eksSecretAccessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secret Access Key")

  public String getEksSecretAccessKey() {
    return eksSecretAccessKey;
  }


  public void setEksSecretAccessKey(String eksSecretAccessKey) {
    this.eksSecretAccessKey = eksSecretAccessKey;
  }


  public GatewayUpdateProducerEks json(Boolean json) {
    
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


  public GatewayUpdateProducerEks name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Producer name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Producer name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GatewayUpdateProducerEks newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Producer name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Producer name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public GatewayUpdateProducerEks producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayUpdateProducerEks secureAccessAllowPortForwading(Boolean secureAccessAllowPortForwading) {
    
    this.secureAccessAllowPortForwading = secureAccessAllowPortForwading;
    return this;
  }

   /**
   * Get secureAccessAllowPortForwading
   * @return secureAccessAllowPortForwading
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSecureAccessAllowPortForwading() {
    return secureAccessAllowPortForwading;
  }


  public void setSecureAccessAllowPortForwading(Boolean secureAccessAllowPortForwading) {
    this.secureAccessAllowPortForwading = secureAccessAllowPortForwading;
  }


  public GatewayUpdateProducerEks secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
    return this;
  }

   /**
   * Get secureAccessBastionIssuer
   * @return secureAccessBastionIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessBastionIssuer() {
    return secureAccessBastionIssuer;
  }


  public void setSecureAccessBastionIssuer(String secureAccessBastionIssuer) {
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
  }


  public GatewayUpdateProducerEks secureAccessClusterEndpoint(String secureAccessClusterEndpoint) {
    
    this.secureAccessClusterEndpoint = secureAccessClusterEndpoint;
    return this;
  }

   /**
   * Get secureAccessClusterEndpoint
   * @return secureAccessClusterEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessClusterEndpoint() {
    return secureAccessClusterEndpoint;
  }


  public void setSecureAccessClusterEndpoint(String secureAccessClusterEndpoint) {
    this.secureAccessClusterEndpoint = secureAccessClusterEndpoint;
  }


  public GatewayUpdateProducerEks secureAccessEnable(String secureAccessEnable) {
    
    this.secureAccessEnable = secureAccessEnable;
    return this;
  }

   /**
   * Get secureAccessEnable
   * @return secureAccessEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessEnable() {
    return secureAccessEnable;
  }


  public void setSecureAccessEnable(String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
  }


  public GatewayUpdateProducerEks secureAccessWeb(Boolean secureAccessWeb) {
    
    this.secureAccessWeb = secureAccessWeb;
    return this;
  }

   /**
   * Get secureAccessWeb
   * @return secureAccessWeb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSecureAccessWeb() {
    return secureAccessWeb;
  }


  public void setSecureAccessWeb(Boolean secureAccessWeb) {
    this.secureAccessWeb = secureAccessWeb;
  }


  public GatewayUpdateProducerEks tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerEks addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of the tags attached to this secret
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the tags attached to this secret")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public GatewayUpdateProducerEks targetName(String targetName) {
    
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


  public GatewayUpdateProducerEks token(String token) {
    
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


  public GatewayUpdateProducerEks uidToken(String uidToken) {
    
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


  public GatewayUpdateProducerEks userTtl(String userTtl) {
    
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayUpdateProducerEks gatewayUpdateProducerEks = (GatewayUpdateProducerEks) o;
    return Objects.equals(this.deleteProtection, gatewayUpdateProducerEks.deleteProtection) &&
        Objects.equals(this.eksAccessKeyId, gatewayUpdateProducerEks.eksAccessKeyId) &&
        Objects.equals(this.eksAssumeRole, gatewayUpdateProducerEks.eksAssumeRole) &&
        Objects.equals(this.eksClusterCaCert, gatewayUpdateProducerEks.eksClusterCaCert) &&
        Objects.equals(this.eksClusterEndpoint, gatewayUpdateProducerEks.eksClusterEndpoint) &&
        Objects.equals(this.eksClusterName, gatewayUpdateProducerEks.eksClusterName) &&
        Objects.equals(this.eksRegion, gatewayUpdateProducerEks.eksRegion) &&
        Objects.equals(this.eksSecretAccessKey, gatewayUpdateProducerEks.eksSecretAccessKey) &&
        Objects.equals(this.json, gatewayUpdateProducerEks.json) &&
        Objects.equals(this.name, gatewayUpdateProducerEks.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerEks.newName) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayUpdateProducerEks.producerEncryptionKeyName) &&
        Objects.equals(this.secureAccessAllowPortForwading, gatewayUpdateProducerEks.secureAccessAllowPortForwading) &&
        Objects.equals(this.secureAccessBastionIssuer, gatewayUpdateProducerEks.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessClusterEndpoint, gatewayUpdateProducerEks.secureAccessClusterEndpoint) &&
        Objects.equals(this.secureAccessEnable, gatewayUpdateProducerEks.secureAccessEnable) &&
        Objects.equals(this.secureAccessWeb, gatewayUpdateProducerEks.secureAccessWeb) &&
        Objects.equals(this.tags, gatewayUpdateProducerEks.tags) &&
        Objects.equals(this.targetName, gatewayUpdateProducerEks.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerEks.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerEks.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerEks.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProtection, eksAccessKeyId, eksAssumeRole, eksClusterCaCert, eksClusterEndpoint, eksClusterName, eksRegion, eksSecretAccessKey, json, name, newName, producerEncryptionKeyName, secureAccessAllowPortForwading, secureAccessBastionIssuer, secureAccessClusterEndpoint, secureAccessEnable, secureAccessWeb, tags, targetName, token, uidToken, userTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerEks {\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    eksAccessKeyId: ").append(toIndentedString(eksAccessKeyId)).append("\n");
    sb.append("    eksAssumeRole: ").append(toIndentedString(eksAssumeRole)).append("\n");
    sb.append("    eksClusterCaCert: ").append(toIndentedString(eksClusterCaCert)).append("\n");
    sb.append("    eksClusterEndpoint: ").append(toIndentedString(eksClusterEndpoint)).append("\n");
    sb.append("    eksClusterName: ").append(toIndentedString(eksClusterName)).append("\n");
    sb.append("    eksRegion: ").append(toIndentedString(eksRegion)).append("\n");
    sb.append("    eksSecretAccessKey: ").append(toIndentedString(eksSecretAccessKey)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    secureAccessAllowPortForwading: ").append(toIndentedString(secureAccessAllowPortForwading)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessClusterEndpoint: ").append(toIndentedString(secureAccessClusterEndpoint)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessWeb: ").append(toIndentedString(secureAccessWeb)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

