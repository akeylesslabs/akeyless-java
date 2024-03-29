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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * TmpUserData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TmpUserData {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access_id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  private String accessId;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_CUSTOM_TTL = "custom_ttl";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TTL)
  private Long customTtl;

  public static final String SERIALIZED_NAME_DYNAMIC_SECRET_TYPE = "dynamic_secret_type";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_SECRET_TYPE)
  private String dynamicSecretType;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SUB_CLAIMS = "sub_claims";
  @SerializedName(SERIALIZED_NAME_SUB_CLAIMS)
  private Map<String, List<String>> subClaims = null;

  public TmpUserData() { 
  }

  public TmpUserData accessId(String accessId) {
    
    this.accessId = accessId;
    return this;
  }

   /**
   * Get accessId
   * @return accessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessId() {
    return accessId;
  }


  public void setAccessId(String accessId) {
    this.accessId = accessId;
  }


  public TmpUserData creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public TmpUserData customTtl(Long customTtl) {
    
    this.customTtl = customTtl;
    return this;
  }

   /**
   * Get customTtl
   * @return customTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCustomTtl() {
    return customTtl;
  }


  public void setCustomTtl(Long customTtl) {
    this.customTtl = customTtl;
  }


  public TmpUserData dynamicSecretType(String dynamicSecretType) {
    
    this.dynamicSecretType = dynamicSecretType;
    return this;
  }

   /**
   * Get dynamicSecretType
   * @return dynamicSecretType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDynamicSecretType() {
    return dynamicSecretType;
  }


  public void setDynamicSecretType(String dynamicSecretType) {
    this.dynamicSecretType = dynamicSecretType;
  }


  public TmpUserData host(String host) {
    
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


  public TmpUserData id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TmpUserData subClaims(Map<String, List<String>> subClaims) {
    
    this.subClaims = subClaims;
    return this;
  }

  public TmpUserData putSubClaimsItem(String key, List<String> subClaimsItem) {
    if (this.subClaims == null) {
      this.subClaims = new HashMap<String, List<String>>();
    }
    this.subClaims.put(key, subClaimsItem);
    return this;
  }

   /**
   * Get subClaims
   * @return subClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getSubClaims() {
    return subClaims;
  }


  public void setSubClaims(Map<String, List<String>> subClaims) {
    this.subClaims = subClaims;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmpUserData tmpUserData = (TmpUserData) o;
    return Objects.equals(this.accessId, tmpUserData.accessId) &&
        Objects.equals(this.creationDate, tmpUserData.creationDate) &&
        Objects.equals(this.customTtl, tmpUserData.customTtl) &&
        Objects.equals(this.dynamicSecretType, tmpUserData.dynamicSecretType) &&
        Objects.equals(this.host, tmpUserData.host) &&
        Objects.equals(this.id, tmpUserData.id) &&
        Objects.equals(this.subClaims, tmpUserData.subClaims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, creationDate, customTtl, dynamicSecretType, host, id, subClaims);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmpUserData {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    customTtl: ").append(toIndentedString(customTtl)).append("\n");
    sb.append("    dynamicSecretType: ").append(toIndentedString(dynamicSecretType)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subClaims: ").append(toIndentedString(subClaims)).append("\n");
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

