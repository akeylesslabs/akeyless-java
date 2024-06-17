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
 * uscGet is a command that gets the value and internal details of a secret from a Universal Secrets Connector
 */
@ApiModel(description = "uscGet is a command that gets the value and internal details of a secret from a Universal Secrets Connector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UscGet {
  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_SECRET_ID = "secret-id";
  @SerializedName(SERIALIZED_NAME_SECRET_ID)
  private String secretId;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USC_NAME = "usc-name";
  @SerializedName(SERIALIZED_NAME_USC_NAME)
  private String uscName;

  public static final String SERIALIZED_NAME_VERSION_ID = "version-id";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private String versionId;

  public UscGet() { 
  }

  public UscGet json(Boolean json) {
    
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


  public UscGet namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * The namespace (relevant for Hashi vault target)
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The namespace (relevant for Hashi vault target)")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public UscGet secretId(String secretId) {
    
    this.secretId = secretId;
    return this;
  }

   /**
   * The secret id (or name, for AWS, Azure, K8s or Hashi vault targets) to get from the Universal Secrets Connector
   * @return secretId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The secret id (or name, for AWS, Azure, K8s or Hashi vault targets) to get from the Universal Secrets Connector")

  public String getSecretId() {
    return secretId;
  }


  public void setSecretId(String secretId) {
    this.secretId = secretId;
  }


  public UscGet token(String token) {
    
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


  public UscGet uidToken(String uidToken) {
    
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


  public UscGet uscName(String uscName) {
    
    this.uscName = uscName;
    return this;
  }

   /**
   * Name of the Universal Secrets Connector item
   * @return uscName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Universal Secrets Connector item")

  public String getUscName() {
    return uscName;
  }


  public void setUscName(String uscName) {
    this.uscName = uscName;
  }


  public UscGet versionId(String versionId) {
    
    this.versionId = versionId;
    return this;
  }

   /**
   * The version id (if not specified, will retrieve the last version)
   * @return versionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version id (if not specified, will retrieve the last version)")

  public String getVersionId() {
    return versionId;
  }


  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UscGet uscGet = (UscGet) o;
    return Objects.equals(this.json, uscGet.json) &&
        Objects.equals(this.namespace, uscGet.namespace) &&
        Objects.equals(this.secretId, uscGet.secretId) &&
        Objects.equals(this.token, uscGet.token) &&
        Objects.equals(this.uidToken, uscGet.uidToken) &&
        Objects.equals(this.uscName, uscGet.uscName) &&
        Objects.equals(this.versionId, uscGet.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(json, namespace, secretId, token, uidToken, uscName, versionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UscGet {\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    uscName: ").append(toIndentedString(uscName)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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

