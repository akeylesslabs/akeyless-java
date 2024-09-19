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
 * AzureStorage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AzureStorage {
  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private String authType;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_STORAGE_ACCOUNT = "storage_account";
  @SerializedName(SERIALIZED_NAME_STORAGE_ACCOUNT)
  private String storageAccount;

  public static final String SERIALIZED_NAME_STORAGE_CONTAINER_NAME = "storage_container_name";
  @SerializedName(SERIALIZED_NAME_STORAGE_CONTAINER_NAME)
  private String storageContainerName;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public AzureStorage() { 
  }

  public AzureStorage authType(String authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthType() {
    return authType;
  }


  public void setAuthType(String authType) {
    this.authType = authType;
  }


  public AzureStorage clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public AzureStorage clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public AzureStorage storageAccount(String storageAccount) {
    
    this.storageAccount = storageAccount;
    return this;
  }

   /**
   * Get storageAccount
   * @return storageAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStorageAccount() {
    return storageAccount;
  }


  public void setStorageAccount(String storageAccount) {
    this.storageAccount = storageAccount;
  }


  public AzureStorage storageContainerName(String storageContainerName) {
    
    this.storageContainerName = storageContainerName;
    return this;
  }

   /**
   * Get storageContainerName
   * @return storageContainerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStorageContainerName() {
    return storageContainerName;
  }


  public void setStorageContainerName(String storageContainerName) {
    this.storageContainerName = storageContainerName;
  }


  public AzureStorage tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * creds
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "creds")

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureStorage azureStorage = (AzureStorage) o;
    return Objects.equals(this.authType, azureStorage.authType) &&
        Objects.equals(this.clientId, azureStorage.clientId) &&
        Objects.equals(this.clientSecret, azureStorage.clientSecret) &&
        Objects.equals(this.storageAccount, azureStorage.storageAccount) &&
        Objects.equals(this.storageContainerName, azureStorage.storageContainerName) &&
        Objects.equals(this.tenantId, azureStorage.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, clientId, clientSecret, storageAccount, storageContainerName, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureStorage {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    storageAccount: ").append(toIndentedString(storageAccount)).append("\n");
    sb.append("    storageContainerName: ").append(toIndentedString(storageContainerName)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
