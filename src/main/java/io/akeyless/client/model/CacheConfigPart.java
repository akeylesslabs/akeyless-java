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
 * CacheConfigPart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CacheConfigPart {
  public static final String SERIALIZED_NAME_CACHE_ENABLE = "cache_enable";
  @SerializedName(SERIALIZED_NAME_CACHE_ENABLE)
  private Boolean cacheEnable;

  public static final String SERIALIZED_NAME_CACHE_ENCRYPTION_KEY = "cache_encryption_key";
  @SerializedName(SERIALIZED_NAME_CACHE_ENCRYPTION_KEY)
  private String cacheEncryptionKey;

  public static final String SERIALIZED_NAME_CACHE_TTL = "cache_ttl";
  @SerializedName(SERIALIZED_NAME_CACHE_TTL)
  private String cacheTtl;

  public static final String SERIALIZED_NAME_NEW_PROACTIVE_CACHE_ENABLE = "new_proactive_cache_enable";
  @SerializedName(SERIALIZED_NAME_NEW_PROACTIVE_CACHE_ENABLE)
  private Boolean newProactiveCacheEnable;

  public static final String SERIALIZED_NAME_PROACTIVE_CACHE_DUMP_INTERVAL = "proactive_cache_dump_interval";
  @SerializedName(SERIALIZED_NAME_PROACTIVE_CACHE_DUMP_INTERVAL)
  private String proactiveCacheDumpInterval;

  public static final String SERIALIZED_NAME_PROACTIVE_CACHE_ENABLE = "proactive_cache_enable";
  @SerializedName(SERIALIZED_NAME_PROACTIVE_CACHE_ENABLE)
  private Boolean proactiveCacheEnable;

  public static final String SERIALIZED_NAME_PROACTIVE_CACHE_MINIMUM_FETCHING_TIME = "proactive_cache_minimum_fetching_time";
  @SerializedName(SERIALIZED_NAME_PROACTIVE_CACHE_MINIMUM_FETCHING_TIME)
  private String proactiveCacheMinimumFetchingTime;

  public CacheConfigPart() { 
  }

  public CacheConfigPart cacheEnable(Boolean cacheEnable) {
    
    this.cacheEnable = cacheEnable;
    return this;
  }

   /**
   * Get cacheEnable
   * @return cacheEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCacheEnable() {
    return cacheEnable;
  }


  public void setCacheEnable(Boolean cacheEnable) {
    this.cacheEnable = cacheEnable;
  }


  public CacheConfigPart cacheEncryptionKey(String cacheEncryptionKey) {
    
    this.cacheEncryptionKey = cacheEncryptionKey;
    return this;
  }

   /**
   * Get cacheEncryptionKey
   * @return cacheEncryptionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCacheEncryptionKey() {
    return cacheEncryptionKey;
  }


  public void setCacheEncryptionKey(String cacheEncryptionKey) {
    this.cacheEncryptionKey = cacheEncryptionKey;
  }


  public CacheConfigPart cacheTtl(String cacheTtl) {
    
    this.cacheTtl = cacheTtl;
    return this;
  }

   /**
   * Get cacheTtl
   * @return cacheTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCacheTtl() {
    return cacheTtl;
  }


  public void setCacheTtl(String cacheTtl) {
    this.cacheTtl = cacheTtl;
  }


  public CacheConfigPart newProactiveCacheEnable(Boolean newProactiveCacheEnable) {
    
    this.newProactiveCacheEnable = newProactiveCacheEnable;
    return this;
  }

   /**
   * Get newProactiveCacheEnable
   * @return newProactiveCacheEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNewProactiveCacheEnable() {
    return newProactiveCacheEnable;
  }


  public void setNewProactiveCacheEnable(Boolean newProactiveCacheEnable) {
    this.newProactiveCacheEnable = newProactiveCacheEnable;
  }


  public CacheConfigPart proactiveCacheDumpInterval(String proactiveCacheDumpInterval) {
    
    this.proactiveCacheDumpInterval = proactiveCacheDumpInterval;
    return this;
  }

   /**
   * Get proactiveCacheDumpInterval
   * @return proactiveCacheDumpInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProactiveCacheDumpInterval() {
    return proactiveCacheDumpInterval;
  }


  public void setProactiveCacheDumpInterval(String proactiveCacheDumpInterval) {
    this.proactiveCacheDumpInterval = proactiveCacheDumpInterval;
  }


  public CacheConfigPart proactiveCacheEnable(Boolean proactiveCacheEnable) {
    
    this.proactiveCacheEnable = proactiveCacheEnable;
    return this;
  }

   /**
   * Get proactiveCacheEnable
   * @return proactiveCacheEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getProactiveCacheEnable() {
    return proactiveCacheEnable;
  }


  public void setProactiveCacheEnable(Boolean proactiveCacheEnable) {
    this.proactiveCacheEnable = proactiveCacheEnable;
  }


  public CacheConfigPart proactiveCacheMinimumFetchingTime(String proactiveCacheMinimumFetchingTime) {
    
    this.proactiveCacheMinimumFetchingTime = proactiveCacheMinimumFetchingTime;
    return this;
  }

   /**
   * Get proactiveCacheMinimumFetchingTime
   * @return proactiveCacheMinimumFetchingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProactiveCacheMinimumFetchingTime() {
    return proactiveCacheMinimumFetchingTime;
  }


  public void setProactiveCacheMinimumFetchingTime(String proactiveCacheMinimumFetchingTime) {
    this.proactiveCacheMinimumFetchingTime = proactiveCacheMinimumFetchingTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheConfigPart cacheConfigPart = (CacheConfigPart) o;
    return Objects.equals(this.cacheEnable, cacheConfigPart.cacheEnable) &&
        Objects.equals(this.cacheEncryptionKey, cacheConfigPart.cacheEncryptionKey) &&
        Objects.equals(this.cacheTtl, cacheConfigPart.cacheTtl) &&
        Objects.equals(this.newProactiveCacheEnable, cacheConfigPart.newProactiveCacheEnable) &&
        Objects.equals(this.proactiveCacheDumpInterval, cacheConfigPart.proactiveCacheDumpInterval) &&
        Objects.equals(this.proactiveCacheEnable, cacheConfigPart.proactiveCacheEnable) &&
        Objects.equals(this.proactiveCacheMinimumFetchingTime, cacheConfigPart.proactiveCacheMinimumFetchingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheEnable, cacheEncryptionKey, cacheTtl, newProactiveCacheEnable, proactiveCacheDumpInterval, proactiveCacheEnable, proactiveCacheMinimumFetchingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheConfigPart {\n");
    sb.append("    cacheEnable: ").append(toIndentedString(cacheEnable)).append("\n");
    sb.append("    cacheEncryptionKey: ").append(toIndentedString(cacheEncryptionKey)).append("\n");
    sb.append("    cacheTtl: ").append(toIndentedString(cacheTtl)).append("\n");
    sb.append("    newProactiveCacheEnable: ").append(toIndentedString(newProactiveCacheEnable)).append("\n");
    sb.append("    proactiveCacheDumpInterval: ").append(toIndentedString(proactiveCacheDumpInterval)).append("\n");
    sb.append("    proactiveCacheEnable: ").append(toIndentedString(proactiveCacheEnable)).append("\n");
    sb.append("    proactiveCacheMinimumFetchingTime: ").append(toIndentedString(proactiveCacheMinimumFetchingTime)).append("\n");
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

