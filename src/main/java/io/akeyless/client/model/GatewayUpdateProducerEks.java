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
 * gatewayUpdateProducerEks is a command that updates eks producer [Deprecated: Use dynamic-secret-update-eks command]
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GatewayUpdateProducerEks {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private String deleteProtection;

  public static final String SERIALIZED_NAME_EKS_ACCESS_KEY_ID = "eks-access-key-id";
  @SerializedName(SERIALIZED_NAME_EKS_ACCESS_KEY_ID)
  @javax.annotation.Nullable
  private String eksAccessKeyId;

  public static final String SERIALIZED_NAME_EKS_ASSUME_ROLE = "eks-assume-role";
  @SerializedName(SERIALIZED_NAME_EKS_ASSUME_ROLE)
  @javax.annotation.Nullable
  private String eksAssumeRole;

  public static final String SERIALIZED_NAME_EKS_CLUSTER_CA_CERT = "eks-cluster-ca-cert";
  @SerializedName(SERIALIZED_NAME_EKS_CLUSTER_CA_CERT)
  @javax.annotation.Nullable
  private String eksClusterCaCert;

  public static final String SERIALIZED_NAME_EKS_CLUSTER_ENDPOINT = "eks-cluster-endpoint";
  @SerializedName(SERIALIZED_NAME_EKS_CLUSTER_ENDPOINT)
  @javax.annotation.Nullable
  private String eksClusterEndpoint;

  public static final String SERIALIZED_NAME_EKS_CLUSTER_NAME = "eks-cluster-name";
  @SerializedName(SERIALIZED_NAME_EKS_CLUSTER_NAME)
  @javax.annotation.Nullable
  private String eksClusterName;

  public static final String SERIALIZED_NAME_EKS_REGION = "eks-region";
  @SerializedName(SERIALIZED_NAME_EKS_REGION)
  @javax.annotation.Nullable
  private String eksRegion = "us-east-2";

  public static final String SERIALIZED_NAME_EKS_SECRET_ACCESS_KEY = "eks-secret-access-key";
  @SerializedName(SERIALIZED_NAME_EKS_SECRET_ACCESS_KEY)
  @javax.annotation.Nullable
  private String eksSecretAccessKey;

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

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  @javax.annotation.Nullable
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ALLOW_PORT_FORWADING = "secure-access-allow-port-forwading";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ALLOW_PORT_FORWADING)
  @javax.annotation.Nullable
  private Boolean secureAccessAllowPortForwading;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  @javax.annotation.Nullable
  private String secureAccessBastionIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_CERTIFICATE_ISSUER = "secure-access-certificate-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_CERTIFICATE_ISSUER)
  @javax.annotation.Nullable
  private String secureAccessCertificateIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_CLUSTER_ENDPOINT = "secure-access-cluster-endpoint";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_CLUSTER_ENDPOINT)
  @javax.annotation.Nullable
  private String secureAccessClusterEndpoint;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_DELAY = "secure-access-delay";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_DELAY)
  @javax.annotation.Nullable
  private Long secureAccessDelay;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  @javax.annotation.Nullable
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB = "secure-access-web";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB)
  @javax.annotation.Nullable
  private Boolean secureAccessWeb = false;

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
  private String userTtl = "15m";

  public GatewayUpdateProducerEks() {
  }

  public GatewayUpdateProducerEks deleteProtection(@javax.annotation.Nullable String deleteProtection) {
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


  public GatewayUpdateProducerEks eksAccessKeyId(@javax.annotation.Nullable String eksAccessKeyId) {
    this.eksAccessKeyId = eksAccessKeyId;
    return this;
  }

  /**
   * Access Key ID
   * @return eksAccessKeyId
   */
  @javax.annotation.Nullable
  public String getEksAccessKeyId() {
    return eksAccessKeyId;
  }

  public void setEksAccessKeyId(@javax.annotation.Nullable String eksAccessKeyId) {
    this.eksAccessKeyId = eksAccessKeyId;
  }


  public GatewayUpdateProducerEks eksAssumeRole(@javax.annotation.Nullable String eksAssumeRole) {
    this.eksAssumeRole = eksAssumeRole;
    return this;
  }

  /**
   * IAM assume role
   * @return eksAssumeRole
   */
  @javax.annotation.Nullable
  public String getEksAssumeRole() {
    return eksAssumeRole;
  }

  public void setEksAssumeRole(@javax.annotation.Nullable String eksAssumeRole) {
    this.eksAssumeRole = eksAssumeRole;
  }


  public GatewayUpdateProducerEks eksClusterCaCert(@javax.annotation.Nullable String eksClusterCaCert) {
    this.eksClusterCaCert = eksClusterCaCert;
    return this;
  }

  /**
   * EKS cluster CA certificate
   * @return eksClusterCaCert
   */
  @javax.annotation.Nullable
  public String getEksClusterCaCert() {
    return eksClusterCaCert;
  }

  public void setEksClusterCaCert(@javax.annotation.Nullable String eksClusterCaCert) {
    this.eksClusterCaCert = eksClusterCaCert;
  }


  public GatewayUpdateProducerEks eksClusterEndpoint(@javax.annotation.Nullable String eksClusterEndpoint) {
    this.eksClusterEndpoint = eksClusterEndpoint;
    return this;
  }

  /**
   * EKS cluster URL endpoint
   * @return eksClusterEndpoint
   */
  @javax.annotation.Nullable
  public String getEksClusterEndpoint() {
    return eksClusterEndpoint;
  }

  public void setEksClusterEndpoint(@javax.annotation.Nullable String eksClusterEndpoint) {
    this.eksClusterEndpoint = eksClusterEndpoint;
  }


  public GatewayUpdateProducerEks eksClusterName(@javax.annotation.Nullable String eksClusterName) {
    this.eksClusterName = eksClusterName;
    return this;
  }

  /**
   * EKS cluster name
   * @return eksClusterName
   */
  @javax.annotation.Nullable
  public String getEksClusterName() {
    return eksClusterName;
  }

  public void setEksClusterName(@javax.annotation.Nullable String eksClusterName) {
    this.eksClusterName = eksClusterName;
  }


  public GatewayUpdateProducerEks eksRegion(@javax.annotation.Nullable String eksRegion) {
    this.eksRegion = eksRegion;
    return this;
  }

  /**
   * Region
   * @return eksRegion
   */
  @javax.annotation.Nullable
  public String getEksRegion() {
    return eksRegion;
  }

  public void setEksRegion(@javax.annotation.Nullable String eksRegion) {
    this.eksRegion = eksRegion;
  }


  public GatewayUpdateProducerEks eksSecretAccessKey(@javax.annotation.Nullable String eksSecretAccessKey) {
    this.eksSecretAccessKey = eksSecretAccessKey;
    return this;
  }

  /**
   * Secret Access Key
   * @return eksSecretAccessKey
   */
  @javax.annotation.Nullable
  public String getEksSecretAccessKey() {
    return eksSecretAccessKey;
  }

  public void setEksSecretAccessKey(@javax.annotation.Nullable String eksSecretAccessKey) {
    this.eksSecretAccessKey = eksSecretAccessKey;
  }


  public GatewayUpdateProducerEks json(@javax.annotation.Nullable Boolean json) {
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


  public GatewayUpdateProducerEks name(@javax.annotation.Nonnull String name) {
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


  public GatewayUpdateProducerEks newName(@javax.annotation.Nullable String newName) {
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


  public GatewayUpdateProducerEks producerEncryptionKeyName(@javax.annotation.Nullable String producerEncryptionKeyName) {
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


  public GatewayUpdateProducerEks secureAccessAllowPortForwading(@javax.annotation.Nullable Boolean secureAccessAllowPortForwading) {
    this.secureAccessAllowPortForwading = secureAccessAllowPortForwading;
    return this;
  }

  /**
   * Enable Port forwarding while using CLI access
   * @return secureAccessAllowPortForwading
   */
  @javax.annotation.Nullable
  public Boolean getSecureAccessAllowPortForwading() {
    return secureAccessAllowPortForwading;
  }

  public void setSecureAccessAllowPortForwading(@javax.annotation.Nullable Boolean secureAccessAllowPortForwading) {
    this.secureAccessAllowPortForwading = secureAccessAllowPortForwading;
  }


  public GatewayUpdateProducerEks secureAccessBastionIssuer(@javax.annotation.Nullable String secureAccessBastionIssuer) {
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
    return this;
  }

  /**
   * Deprecated. use secure-access-certificate-issuer
   * @return secureAccessBastionIssuer
   */
  @javax.annotation.Nullable
  public String getSecureAccessBastionIssuer() {
    return secureAccessBastionIssuer;
  }

  public void setSecureAccessBastionIssuer(@javax.annotation.Nullable String secureAccessBastionIssuer) {
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
  }


  public GatewayUpdateProducerEks secureAccessCertificateIssuer(@javax.annotation.Nullable String secureAccessCertificateIssuer) {
    this.secureAccessCertificateIssuer = secureAccessCertificateIssuer;
    return this;
  }

  /**
   * Path to the SSH Certificate Issuer for your Akeyless Secure Access
   * @return secureAccessCertificateIssuer
   */
  @javax.annotation.Nullable
  public String getSecureAccessCertificateIssuer() {
    return secureAccessCertificateIssuer;
  }

  public void setSecureAccessCertificateIssuer(@javax.annotation.Nullable String secureAccessCertificateIssuer) {
    this.secureAccessCertificateIssuer = secureAccessCertificateIssuer;
  }


  public GatewayUpdateProducerEks secureAccessClusterEndpoint(@javax.annotation.Nullable String secureAccessClusterEndpoint) {
    this.secureAccessClusterEndpoint = secureAccessClusterEndpoint;
    return this;
  }

  /**
   * The K8s cluster endpoint URL
   * @return secureAccessClusterEndpoint
   */
  @javax.annotation.Nullable
  public String getSecureAccessClusterEndpoint() {
    return secureAccessClusterEndpoint;
  }

  public void setSecureAccessClusterEndpoint(@javax.annotation.Nullable String secureAccessClusterEndpoint) {
    this.secureAccessClusterEndpoint = secureAccessClusterEndpoint;
  }


  public GatewayUpdateProducerEks secureAccessDelay(@javax.annotation.Nullable Long secureAccessDelay) {
    this.secureAccessDelay = secureAccessDelay;
    return this;
  }

  /**
   * The delay duration, in seconds, to wait after generating just-in-time credentials. Accepted range: 0-120 seconds
   * @return secureAccessDelay
   */
  @javax.annotation.Nullable
  public Long getSecureAccessDelay() {
    return secureAccessDelay;
  }

  public void setSecureAccessDelay(@javax.annotation.Nullable Long secureAccessDelay) {
    this.secureAccessDelay = secureAccessDelay;
  }


  public GatewayUpdateProducerEks secureAccessEnable(@javax.annotation.Nullable String secureAccessEnable) {
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


  public GatewayUpdateProducerEks secureAccessWeb(@javax.annotation.Nullable Boolean secureAccessWeb) {
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


  public GatewayUpdateProducerEks tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerEks addTagsItem(String tagsItem) {
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


  public GatewayUpdateProducerEks targetName(@javax.annotation.Nullable String targetName) {
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


  public GatewayUpdateProducerEks token(@javax.annotation.Nullable String token) {
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


  public GatewayUpdateProducerEks uidToken(@javax.annotation.Nullable String uidToken) {
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


  public GatewayUpdateProducerEks userTtl(@javax.annotation.Nullable String userTtl) {
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
        Objects.equals(this.secureAccessCertificateIssuer, gatewayUpdateProducerEks.secureAccessCertificateIssuer) &&
        Objects.equals(this.secureAccessClusterEndpoint, gatewayUpdateProducerEks.secureAccessClusterEndpoint) &&
        Objects.equals(this.secureAccessDelay, gatewayUpdateProducerEks.secureAccessDelay) &&
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
    return Objects.hash(deleteProtection, eksAccessKeyId, eksAssumeRole, eksClusterCaCert, eksClusterEndpoint, eksClusterName, eksRegion, eksSecretAccessKey, json, name, newName, producerEncryptionKeyName, secureAccessAllowPortForwading, secureAccessBastionIssuer, secureAccessCertificateIssuer, secureAccessClusterEndpoint, secureAccessDelay, secureAccessEnable, secureAccessWeb, tags, targetName, token, uidToken, userTtl);
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
    sb.append("    secureAccessCertificateIssuer: ").append(toIndentedString(secureAccessCertificateIssuer)).append("\n");
    sb.append("    secureAccessClusterEndpoint: ").append(toIndentedString(secureAccessClusterEndpoint)).append("\n");
    sb.append("    secureAccessDelay: ").append(toIndentedString(secureAccessDelay)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("delete_protection");
    openapiFields.add("eks-access-key-id");
    openapiFields.add("eks-assume-role");
    openapiFields.add("eks-cluster-ca-cert");
    openapiFields.add("eks-cluster-endpoint");
    openapiFields.add("eks-cluster-name");
    openapiFields.add("eks-region");
    openapiFields.add("eks-secret-access-key");
    openapiFields.add("json");
    openapiFields.add("name");
    openapiFields.add("new-name");
    openapiFields.add("producer-encryption-key-name");
    openapiFields.add("secure-access-allow-port-forwading");
    openapiFields.add("secure-access-bastion-issuer");
    openapiFields.add("secure-access-certificate-issuer");
    openapiFields.add("secure-access-cluster-endpoint");
    openapiFields.add("secure-access-delay");
    openapiFields.add("secure-access-enable");
    openapiFields.add("secure-access-web");
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
   * @throws IOException if the JSON Element is invalid with respect to GatewayUpdateProducerEks
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GatewayUpdateProducerEks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayUpdateProducerEks is not found in the empty JSON string", GatewayUpdateProducerEks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GatewayUpdateProducerEks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayUpdateProducerEks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GatewayUpdateProducerEks.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("delete_protection") != null && !jsonObj.get("delete_protection").isJsonNull()) && !jsonObj.get("delete_protection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_protection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete_protection").toString()));
      }
      if ((jsonObj.get("eks-access-key-id") != null && !jsonObj.get("eks-access-key-id").isJsonNull()) && !jsonObj.get("eks-access-key-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eks-access-key-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eks-access-key-id").toString()));
      }
      if ((jsonObj.get("eks-assume-role") != null && !jsonObj.get("eks-assume-role").isJsonNull()) && !jsonObj.get("eks-assume-role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eks-assume-role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eks-assume-role").toString()));
      }
      if ((jsonObj.get("eks-cluster-ca-cert") != null && !jsonObj.get("eks-cluster-ca-cert").isJsonNull()) && !jsonObj.get("eks-cluster-ca-cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eks-cluster-ca-cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eks-cluster-ca-cert").toString()));
      }
      if ((jsonObj.get("eks-cluster-endpoint") != null && !jsonObj.get("eks-cluster-endpoint").isJsonNull()) && !jsonObj.get("eks-cluster-endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eks-cluster-endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eks-cluster-endpoint").toString()));
      }
      if ((jsonObj.get("eks-cluster-name") != null && !jsonObj.get("eks-cluster-name").isJsonNull()) && !jsonObj.get("eks-cluster-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eks-cluster-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eks-cluster-name").toString()));
      }
      if ((jsonObj.get("eks-region") != null && !jsonObj.get("eks-region").isJsonNull()) && !jsonObj.get("eks-region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eks-region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eks-region").toString()));
      }
      if ((jsonObj.get("eks-secret-access-key") != null && !jsonObj.get("eks-secret-access-key").isJsonNull()) && !jsonObj.get("eks-secret-access-key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eks-secret-access-key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eks-secret-access-key").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("new-name") != null && !jsonObj.get("new-name").isJsonNull()) && !jsonObj.get("new-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new-name").toString()));
      }
      if ((jsonObj.get("producer-encryption-key-name") != null && !jsonObj.get("producer-encryption-key-name").isJsonNull()) && !jsonObj.get("producer-encryption-key-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `producer-encryption-key-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("producer-encryption-key-name").toString()));
      }
      if ((jsonObj.get("secure-access-bastion-issuer") != null && !jsonObj.get("secure-access-bastion-issuer").isJsonNull()) && !jsonObj.get("secure-access-bastion-issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure-access-bastion-issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure-access-bastion-issuer").toString()));
      }
      if ((jsonObj.get("secure-access-certificate-issuer") != null && !jsonObj.get("secure-access-certificate-issuer").isJsonNull()) && !jsonObj.get("secure-access-certificate-issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure-access-certificate-issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure-access-certificate-issuer").toString()));
      }
      if ((jsonObj.get("secure-access-cluster-endpoint") != null && !jsonObj.get("secure-access-cluster-endpoint").isJsonNull()) && !jsonObj.get("secure-access-cluster-endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure-access-cluster-endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure-access-cluster-endpoint").toString()));
      }
      if ((jsonObj.get("secure-access-enable") != null && !jsonObj.get("secure-access-enable").isJsonNull()) && !jsonObj.get("secure-access-enable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secure-access-enable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secure-access-enable").toString()));
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
       if (!GatewayUpdateProducerEks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayUpdateProducerEks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayUpdateProducerEks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayUpdateProducerEks.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayUpdateProducerEks>() {
           @Override
           public void write(JsonWriter out, GatewayUpdateProducerEks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayUpdateProducerEks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GatewayUpdateProducerEks given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GatewayUpdateProducerEks
   * @throws IOException if the JSON string is invalid with respect to GatewayUpdateProducerEks
   */
  public static GatewayUpdateProducerEks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayUpdateProducerEks.class);
  }

  /**
   * Convert an instance of GatewayUpdateProducerEks to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

