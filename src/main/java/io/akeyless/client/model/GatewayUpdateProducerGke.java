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
 * gatewayUpdateProducerGke is a command that updates gke producer
 */
@ApiModel(description = "gatewayUpdateProducerGke is a command that updates gke producer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GatewayUpdateProducerGke {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_GKE_ACCOUNT_KEY = "gke-account-key";
  @SerializedName(SERIALIZED_NAME_GKE_ACCOUNT_KEY)
  private String gkeAccountKey;

  public static final String SERIALIZED_NAME_GKE_CLUSTER_CERT = "gke-cluster-cert";
  @SerializedName(SERIALIZED_NAME_GKE_CLUSTER_CERT)
  private String gkeClusterCert;

  public static final String SERIALIZED_NAME_GKE_CLUSTER_ENDPOINT = "gke-cluster-endpoint";
  @SerializedName(SERIALIZED_NAME_GKE_CLUSTER_ENDPOINT)
  private String gkeClusterEndpoint;

  public static final String SERIALIZED_NAME_GKE_CLUSTER_NAME = "gke-cluster-name";
  @SerializedName(SERIALIZED_NAME_GKE_CLUSTER_NAME)
  private String gkeClusterName;

  public static final String SERIALIZED_NAME_GKE_SERVICE_ACCOUNT_EMAIL = "gke-service-account-email";
  @SerializedName(SERIALIZED_NAME_GKE_SERVICE_ACCOUNT_EMAIL)
  private String gkeServiceAccountEmail;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

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
  private Boolean secureAccessWeb = false;

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
  private String userTtl = "60m";

  public GatewayUpdateProducerGke() { 
  }

  public GatewayUpdateProducerGke deleteProtection(String deleteProtection) {
    
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


  public GatewayUpdateProducerGke gkeAccountKey(String gkeAccountKey) {
    
    this.gkeAccountKey = gkeAccountKey;
    return this;
  }

   /**
   * GKE Service Account key file path
   * @return gkeAccountKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GKE Service Account key file path")

  public String getGkeAccountKey() {
    return gkeAccountKey;
  }


  public void setGkeAccountKey(String gkeAccountKey) {
    this.gkeAccountKey = gkeAccountKey;
  }


  public GatewayUpdateProducerGke gkeClusterCert(String gkeClusterCert) {
    
    this.gkeClusterCert = gkeClusterCert;
    return this;
  }

   /**
   * GKE cluster CA certificate
   * @return gkeClusterCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GKE cluster CA certificate")

  public String getGkeClusterCert() {
    return gkeClusterCert;
  }


  public void setGkeClusterCert(String gkeClusterCert) {
    this.gkeClusterCert = gkeClusterCert;
  }


  public GatewayUpdateProducerGke gkeClusterEndpoint(String gkeClusterEndpoint) {
    
    this.gkeClusterEndpoint = gkeClusterEndpoint;
    return this;
  }

   /**
   * GKE cluster URL endpoint
   * @return gkeClusterEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GKE cluster URL endpoint")

  public String getGkeClusterEndpoint() {
    return gkeClusterEndpoint;
  }


  public void setGkeClusterEndpoint(String gkeClusterEndpoint) {
    this.gkeClusterEndpoint = gkeClusterEndpoint;
  }


  public GatewayUpdateProducerGke gkeClusterName(String gkeClusterName) {
    
    this.gkeClusterName = gkeClusterName;
    return this;
  }

   /**
   * GKE cluster name
   * @return gkeClusterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GKE cluster name")

  public String getGkeClusterName() {
    return gkeClusterName;
  }


  public void setGkeClusterName(String gkeClusterName) {
    this.gkeClusterName = gkeClusterName;
  }


  public GatewayUpdateProducerGke gkeServiceAccountEmail(String gkeServiceAccountEmail) {
    
    this.gkeServiceAccountEmail = gkeServiceAccountEmail;
    return this;
  }

   /**
   * GKE service account email
   * @return gkeServiceAccountEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GKE service account email")

  public String getGkeServiceAccountEmail() {
    return gkeServiceAccountEmail;
  }


  public void setGkeServiceAccountEmail(String gkeServiceAccountEmail) {
    this.gkeServiceAccountEmail = gkeServiceAccountEmail;
  }


  public GatewayUpdateProducerGke json(Boolean json) {
    
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


  public GatewayUpdateProducerGke name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Producer name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Producer name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GatewayUpdateProducerGke newName(String newName) {
    
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


  public GatewayUpdateProducerGke producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayUpdateProducerGke secureAccessAllowPortForwading(Boolean secureAccessAllowPortForwading) {
    
    this.secureAccessAllowPortForwading = secureAccessAllowPortForwading;
    return this;
  }

   /**
   * Enable Port forwarding while using CLI access
   * @return secureAccessAllowPortForwading
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable Port forwarding while using CLI access")

  public Boolean getSecureAccessAllowPortForwading() {
    return secureAccessAllowPortForwading;
  }


  public void setSecureAccessAllowPortForwading(Boolean secureAccessAllowPortForwading) {
    this.secureAccessAllowPortForwading = secureAccessAllowPortForwading;
  }


  public GatewayUpdateProducerGke secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
    return this;
  }

   /**
   * Path to the SSH Certificate Issuer for your Akeyless Bastion
   * @return secureAccessBastionIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the SSH Certificate Issuer for your Akeyless Bastion")

  public String getSecureAccessBastionIssuer() {
    return secureAccessBastionIssuer;
  }


  public void setSecureAccessBastionIssuer(String secureAccessBastionIssuer) {
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
  }


  public GatewayUpdateProducerGke secureAccessClusterEndpoint(String secureAccessClusterEndpoint) {
    
    this.secureAccessClusterEndpoint = secureAccessClusterEndpoint;
    return this;
  }

   /**
   * The K8s cluster endpoint URL
   * @return secureAccessClusterEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The K8s cluster endpoint URL")

  public String getSecureAccessClusterEndpoint() {
    return secureAccessClusterEndpoint;
  }


  public void setSecureAccessClusterEndpoint(String secureAccessClusterEndpoint) {
    this.secureAccessClusterEndpoint = secureAccessClusterEndpoint;
  }


  public GatewayUpdateProducerGke secureAccessEnable(String secureAccessEnable) {
    
    this.secureAccessEnable = secureAccessEnable;
    return this;
  }

   /**
   * Enable/Disable secure remote access [true/false]
   * @return secureAccessEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable/Disable secure remote access [true/false]")

  public String getSecureAccessEnable() {
    return secureAccessEnable;
  }


  public void setSecureAccessEnable(String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
  }


  public GatewayUpdateProducerGke secureAccessWeb(Boolean secureAccessWeb) {
    
    this.secureAccessWeb = secureAccessWeb;
    return this;
  }

   /**
   * Enable Web Secure Remote Access
   * @return secureAccessWeb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable Web Secure Remote Access")

  public Boolean getSecureAccessWeb() {
    return secureAccessWeb;
  }


  public void setSecureAccessWeb(Boolean secureAccessWeb) {
    this.secureAccessWeb = secureAccessWeb;
  }


  public GatewayUpdateProducerGke tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerGke addTagsItem(String tagsItem) {
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


  public GatewayUpdateProducerGke targetName(String targetName) {
    
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


  public GatewayUpdateProducerGke token(String token) {
    
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


  public GatewayUpdateProducerGke uidToken(String uidToken) {
    
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


  public GatewayUpdateProducerGke userTtl(String userTtl) {
    
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
    GatewayUpdateProducerGke gatewayUpdateProducerGke = (GatewayUpdateProducerGke) o;
    return Objects.equals(this.deleteProtection, gatewayUpdateProducerGke.deleteProtection) &&
        Objects.equals(this.gkeAccountKey, gatewayUpdateProducerGke.gkeAccountKey) &&
        Objects.equals(this.gkeClusterCert, gatewayUpdateProducerGke.gkeClusterCert) &&
        Objects.equals(this.gkeClusterEndpoint, gatewayUpdateProducerGke.gkeClusterEndpoint) &&
        Objects.equals(this.gkeClusterName, gatewayUpdateProducerGke.gkeClusterName) &&
        Objects.equals(this.gkeServiceAccountEmail, gatewayUpdateProducerGke.gkeServiceAccountEmail) &&
        Objects.equals(this.json, gatewayUpdateProducerGke.json) &&
        Objects.equals(this.name, gatewayUpdateProducerGke.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerGke.newName) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayUpdateProducerGke.producerEncryptionKeyName) &&
        Objects.equals(this.secureAccessAllowPortForwading, gatewayUpdateProducerGke.secureAccessAllowPortForwading) &&
        Objects.equals(this.secureAccessBastionIssuer, gatewayUpdateProducerGke.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessClusterEndpoint, gatewayUpdateProducerGke.secureAccessClusterEndpoint) &&
        Objects.equals(this.secureAccessEnable, gatewayUpdateProducerGke.secureAccessEnable) &&
        Objects.equals(this.secureAccessWeb, gatewayUpdateProducerGke.secureAccessWeb) &&
        Objects.equals(this.tags, gatewayUpdateProducerGke.tags) &&
        Objects.equals(this.targetName, gatewayUpdateProducerGke.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerGke.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerGke.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerGke.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProtection, gkeAccountKey, gkeClusterCert, gkeClusterEndpoint, gkeClusterName, gkeServiceAccountEmail, json, name, newName, producerEncryptionKeyName, secureAccessAllowPortForwading, secureAccessBastionIssuer, secureAccessClusterEndpoint, secureAccessEnable, secureAccessWeb, tags, targetName, token, uidToken, userTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerGke {\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    gkeAccountKey: ").append(toIndentedString(gkeAccountKey)).append("\n");
    sb.append("    gkeClusterCert: ").append(toIndentedString(gkeClusterCert)).append("\n");
    sb.append("    gkeClusterEndpoint: ").append(toIndentedString(gkeClusterEndpoint)).append("\n");
    sb.append("    gkeClusterName: ").append(toIndentedString(gkeClusterName)).append("\n");
    sb.append("    gkeServiceAccountEmail: ").append(toIndentedString(gkeServiceAccountEmail)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

