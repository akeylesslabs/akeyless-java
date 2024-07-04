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
 * TargetCreateAws
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TargetCreateAws {
  public static final String SERIALIZED_NAME_ACCESS_KEY = "access-key";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
  private String accessKey;

  public static final String SERIALIZED_NAME_ACCESS_KEY_ID = "access-key-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_ID)
  private String accessKeyId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_MAX_VERSIONS = "max-versions";
  @SerializedName(SERIALIZED_NAME_MAX_VERSIONS)
  private String maxVersions;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region = "us-east-2";

  public static final String SERIALIZED_NAME_SESSION_TOKEN = "session-token";
  @SerializedName(SERIALIZED_NAME_SESSION_TOKEN)
  private String sessionToken;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY = "use-gw-cloud-identity";
  @SerializedName(SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY)
  private Boolean useGwCloudIdentity;

  public TargetCreateAws() { 
  }

  public TargetCreateAws accessKey(String accessKey) {
    
    this.accessKey = accessKey;
    return this;
  }

   /**
   * AWS secret access key
   * @return accessKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "AWS secret access key")

  public String getAccessKey() {
    return accessKey;
  }


  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  public TargetCreateAws accessKeyId(String accessKeyId) {
    
    this.accessKeyId = accessKeyId;
    return this;
  }

   /**
   * AWS access key ID
   * @return accessKeyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "AWS access key ID")

  public String getAccessKeyId() {
    return accessKeyId;
  }


  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  public TargetCreateAws description(String description) {
    
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


  public TargetCreateAws json(Boolean json) {
    
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


  public TargetCreateAws key(String key) {
    
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


  public TargetCreateAws maxVersions(String maxVersions) {
    
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


  public TargetCreateAws name(String name) {
    
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


  public TargetCreateAws region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * AWS region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS region")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public TargetCreateAws sessionToken(String sessionToken) {
    
    this.sessionToken = sessionToken;
    return this;
  }

   /**
   * Required only for temporary security credentials retrieved using STS
   * @return sessionToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only for temporary security credentials retrieved using STS")

  public String getSessionToken() {
    return sessionToken;
  }


  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }


  public TargetCreateAws token(String token) {
    
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


  public TargetCreateAws uidToken(String uidToken) {
    
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


  public TargetCreateAws useGwCloudIdentity(Boolean useGwCloudIdentity) {
    
    this.useGwCloudIdentity = useGwCloudIdentity;
    return this;
  }

   /**
   * Use the GW&#39;s Cloud IAM
   * @return useGwCloudIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use the GW's Cloud IAM")

  public Boolean getUseGwCloudIdentity() {
    return useGwCloudIdentity;
  }


  public void setUseGwCloudIdentity(Boolean useGwCloudIdentity) {
    this.useGwCloudIdentity = useGwCloudIdentity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetCreateAws targetCreateAws = (TargetCreateAws) o;
    return Objects.equals(this.accessKey, targetCreateAws.accessKey) &&
        Objects.equals(this.accessKeyId, targetCreateAws.accessKeyId) &&
        Objects.equals(this.description, targetCreateAws.description) &&
        Objects.equals(this.json, targetCreateAws.json) &&
        Objects.equals(this.key, targetCreateAws.key) &&
        Objects.equals(this.maxVersions, targetCreateAws.maxVersions) &&
        Objects.equals(this.name, targetCreateAws.name) &&
        Objects.equals(this.region, targetCreateAws.region) &&
        Objects.equals(this.sessionToken, targetCreateAws.sessionToken) &&
        Objects.equals(this.token, targetCreateAws.token) &&
        Objects.equals(this.uidToken, targetCreateAws.uidToken) &&
        Objects.equals(this.useGwCloudIdentity, targetCreateAws.useGwCloudIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, accessKeyId, description, json, key, maxVersions, name, region, sessionToken, token, uidToken, useGwCloudIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetCreateAws {\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxVersions: ").append(toIndentedString(maxVersions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    useGwCloudIdentity: ").append(toIndentedString(useGwCloudIdentity)).append("\n");
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

