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
 * gatewayUpdateRemoteAccessRdpRecordings is a command that update remote access rdp recording config
 */
@ApiModel(description = "gatewayUpdateRemoteAccessRdpRecordings is a command that update remote access rdp recording config")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GatewayUpdateRemoteAccessRdpRecordings {
  public static final String SERIALIZED_NAME_AWS_STORAGE_ACCESS_KEY_ID = "aws-storage-access-key-id";
  @SerializedName(SERIALIZED_NAME_AWS_STORAGE_ACCESS_KEY_ID)
  private String awsStorageAccessKeyId;

  public static final String SERIALIZED_NAME_AWS_STORAGE_BUCKET_NAME = "aws-storage-bucket-name";
  @SerializedName(SERIALIZED_NAME_AWS_STORAGE_BUCKET_NAME)
  private String awsStorageBucketName;

  public static final String SERIALIZED_NAME_AWS_STORAGE_BUCKET_PREFIX = "aws-storage-bucket-prefix";
  @SerializedName(SERIALIZED_NAME_AWS_STORAGE_BUCKET_PREFIX)
  private String awsStorageBucketPrefix;

  public static final String SERIALIZED_NAME_AWS_STORAGE_REGION = "aws-storage-region";
  @SerializedName(SERIALIZED_NAME_AWS_STORAGE_REGION)
  private String awsStorageRegion;

  public static final String SERIALIZED_NAME_AWS_STORAGE_SECRET_ACCESS_KEY = "aws-storage-secret-access-key";
  @SerializedName(SERIALIZED_NAME_AWS_STORAGE_SECRET_ACCESS_KEY)
  private String awsStorageSecretAccessKey;

  public static final String SERIALIZED_NAME_AZURE_STORAGE_ACCOUNT_NAME = "azure-storage-account-name";
  @SerializedName(SERIALIZED_NAME_AZURE_STORAGE_ACCOUNT_NAME)
  private String azureStorageAccountName;

  public static final String SERIALIZED_NAME_AZURE_STORAGE_CLIENT_ID = "azure-storage-client-id";
  @SerializedName(SERIALIZED_NAME_AZURE_STORAGE_CLIENT_ID)
  private String azureStorageClientId;

  public static final String SERIALIZED_NAME_AZURE_STORAGE_CLIENT_SECRET = "azure-storage-client-secret";
  @SerializedName(SERIALIZED_NAME_AZURE_STORAGE_CLIENT_SECRET)
  private String azureStorageClientSecret;

  public static final String SERIALIZED_NAME_AZURE_STORAGE_CONTAINER_NAME = "azure-storage-container-name";
  @SerializedName(SERIALIZED_NAME_AZURE_STORAGE_CONTAINER_NAME)
  private String azureStorageContainerName;

  public static final String SERIALIZED_NAME_AZURE_STORAGE_TENANT_ID = "azure-storage-tenant-id";
  @SerializedName(SERIALIZED_NAME_AZURE_STORAGE_TENANT_ID)
  private String azureStorageTenantId;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_RDP_SESSION_RECORDING = "rdp-session-recording";
  @SerializedName(SERIALIZED_NAME_RDP_SESSION_RECORDING)
  private String rdpSessionRecording;

  public static final String SERIALIZED_NAME_RDP_SESSION_STORAGE = "rdp-session-storage";
  @SerializedName(SERIALIZED_NAME_RDP_SESSION_STORAGE)
  private String rdpSessionStorage;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public GatewayUpdateRemoteAccessRdpRecordings() { 
  }

  public GatewayUpdateRemoteAccessRdpRecordings awsStorageAccessKeyId(String awsStorageAccessKeyId) {
    
    this.awsStorageAccessKeyId = awsStorageAccessKeyId;
    return this;
  }

   /**
   * AWS access key id. For more information refer to https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_access-keys.html
   * @return awsStorageAccessKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS access key id. For more information refer to https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_access-keys.html")

  public String getAwsStorageAccessKeyId() {
    return awsStorageAccessKeyId;
  }


  public void setAwsStorageAccessKeyId(String awsStorageAccessKeyId) {
    this.awsStorageAccessKeyId = awsStorageAccessKeyId;
  }


  public GatewayUpdateRemoteAccessRdpRecordings awsStorageBucketName(String awsStorageBucketName) {
    
    this.awsStorageBucketName = awsStorageBucketName;
    return this;
  }

   /**
   * The AWS bucket name. For more information refer to https://docs.aws.amazon.com/s3/
   * @return awsStorageBucketName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The AWS bucket name. For more information refer to https://docs.aws.amazon.com/s3/")

  public String getAwsStorageBucketName() {
    return awsStorageBucketName;
  }


  public void setAwsStorageBucketName(String awsStorageBucketName) {
    this.awsStorageBucketName = awsStorageBucketName;
  }


  public GatewayUpdateRemoteAccessRdpRecordings awsStorageBucketPrefix(String awsStorageBucketPrefix) {
    
    this.awsStorageBucketPrefix = awsStorageBucketPrefix;
    return this;
  }

   /**
   * The folder name in S3 bucket. For more information refer to https://docs.aws.amazon.com/s3/
   * @return awsStorageBucketPrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The folder name in S3 bucket. For more information refer to https://docs.aws.amazon.com/s3/")

  public String getAwsStorageBucketPrefix() {
    return awsStorageBucketPrefix;
  }


  public void setAwsStorageBucketPrefix(String awsStorageBucketPrefix) {
    this.awsStorageBucketPrefix = awsStorageBucketPrefix;
  }


  public GatewayUpdateRemoteAccessRdpRecordings awsStorageRegion(String awsStorageRegion) {
    
    this.awsStorageRegion = awsStorageRegion;
    return this;
  }

   /**
   * The region where the storage is located
   * @return awsStorageRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The region where the storage is located")

  public String getAwsStorageRegion() {
    return awsStorageRegion;
  }


  public void setAwsStorageRegion(String awsStorageRegion) {
    this.awsStorageRegion = awsStorageRegion;
  }


  public GatewayUpdateRemoteAccessRdpRecordings awsStorageSecretAccessKey(String awsStorageSecretAccessKey) {
    
    this.awsStorageSecretAccessKey = awsStorageSecretAccessKey;
    return this;
  }

   /**
   * AWS secret access key. For more information refer to https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_access-keys.html
   * @return awsStorageSecretAccessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS secret access key. For more information refer to https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_access-keys.html")

  public String getAwsStorageSecretAccessKey() {
    return awsStorageSecretAccessKey;
  }


  public void setAwsStorageSecretAccessKey(String awsStorageSecretAccessKey) {
    this.awsStorageSecretAccessKey = awsStorageSecretAccessKey;
  }


  public GatewayUpdateRemoteAccessRdpRecordings azureStorageAccountName(String azureStorageAccountName) {
    
    this.azureStorageAccountName = azureStorageAccountName;
    return this;
  }

   /**
   * Azure account name. For more information refer to https://learn.microsoft.com/en-us/azure/storage/common/storage-account-overview
   * @return azureStorageAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure account name. For more information refer to https://learn.microsoft.com/en-us/azure/storage/common/storage-account-overview")

  public String getAzureStorageAccountName() {
    return azureStorageAccountName;
  }


  public void setAzureStorageAccountName(String azureStorageAccountName) {
    this.azureStorageAccountName = azureStorageAccountName;
  }


  public GatewayUpdateRemoteAccessRdpRecordings azureStorageClientId(String azureStorageClientId) {
    
    this.azureStorageClientId = azureStorageClientId;
    return this;
  }

   /**
   * Azure client id. For more information refer to https://learn.microsoft.com/en-us/azure/storage/common/storage-account-get-info?tabs&#x3D;portal
   * @return azureStorageClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure client id. For more information refer to https://learn.microsoft.com/en-us/azure/storage/common/storage-account-get-info?tabs=portal")

  public String getAzureStorageClientId() {
    return azureStorageClientId;
  }


  public void setAzureStorageClientId(String azureStorageClientId) {
    this.azureStorageClientId = azureStorageClientId;
  }


  public GatewayUpdateRemoteAccessRdpRecordings azureStorageClientSecret(String azureStorageClientSecret) {
    
    this.azureStorageClientSecret = azureStorageClientSecret;
    return this;
  }

   /**
   * Azure client secret. For more information refer to https://learn.microsoft.com/en-us/azure/storage/common/storage-account-get-info?tabs&#x3D;portal
   * @return azureStorageClientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure client secret. For more information refer to https://learn.microsoft.com/en-us/azure/storage/common/storage-account-get-info?tabs=portal")

  public String getAzureStorageClientSecret() {
    return azureStorageClientSecret;
  }


  public void setAzureStorageClientSecret(String azureStorageClientSecret) {
    this.azureStorageClientSecret = azureStorageClientSecret;
  }


  public GatewayUpdateRemoteAccessRdpRecordings azureStorageContainerName(String azureStorageContainerName) {
    
    this.azureStorageContainerName = azureStorageContainerName;
    return this;
  }

   /**
   * Azure container name. For more information refer to https://learn.microsoft.com/en-us/rest/api/storageservices/naming-and-referencing-containers--blobs--and-metadata
   * @return azureStorageContainerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure container name. For more information refer to https://learn.microsoft.com/en-us/rest/api/storageservices/naming-and-referencing-containers--blobs--and-metadata")

  public String getAzureStorageContainerName() {
    return azureStorageContainerName;
  }


  public void setAzureStorageContainerName(String azureStorageContainerName) {
    this.azureStorageContainerName = azureStorageContainerName;
  }


  public GatewayUpdateRemoteAccessRdpRecordings azureStorageTenantId(String azureStorageTenantId) {
    
    this.azureStorageTenantId = azureStorageTenantId;
    return this;
  }

   /**
   * Azure tenant id. For more information refer to https://learn.microsoft.com/en-us/entra/fundamentals/how-to-find-tenant
   * @return azureStorageTenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure tenant id. For more information refer to https://learn.microsoft.com/en-us/entra/fundamentals/how-to-find-tenant")

  public String getAzureStorageTenantId() {
    return azureStorageTenantId;
  }


  public void setAzureStorageTenantId(String azureStorageTenantId) {
    this.azureStorageTenantId = azureStorageTenantId;
  }


  public GatewayUpdateRemoteAccessRdpRecordings json(Boolean json) {
    
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


  public GatewayUpdateRemoteAccessRdpRecordings rdpSessionRecording(String rdpSessionRecording) {
    
    this.rdpSessionRecording = rdpSessionRecording;
    return this;
  }

   /**
   * Enable recording of rdp session [true/false]
   * @return rdpSessionRecording
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable recording of rdp session [true/false]")

  public String getRdpSessionRecording() {
    return rdpSessionRecording;
  }


  public void setRdpSessionRecording(String rdpSessionRecording) {
    this.rdpSessionRecording = rdpSessionRecording;
  }


  public GatewayUpdateRemoteAccessRdpRecordings rdpSessionStorage(String rdpSessionStorage) {
    
    this.rdpSessionStorage = rdpSessionStorage;
    return this;
  }

   /**
   * Rdp session recording storage destination [local/aws/azure]
   * @return rdpSessionStorage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rdp session recording storage destination [local/aws/azure]")

  public String getRdpSessionStorage() {
    return rdpSessionStorage;
  }


  public void setRdpSessionStorage(String rdpSessionStorage) {
    this.rdpSessionStorage = rdpSessionStorage;
  }


  public GatewayUpdateRemoteAccessRdpRecordings token(String token) {
    
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


  public GatewayUpdateRemoteAccessRdpRecordings uidToken(String uidToken) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayUpdateRemoteAccessRdpRecordings gatewayUpdateRemoteAccessRdpRecordings = (GatewayUpdateRemoteAccessRdpRecordings) o;
    return Objects.equals(this.awsStorageAccessKeyId, gatewayUpdateRemoteAccessRdpRecordings.awsStorageAccessKeyId) &&
        Objects.equals(this.awsStorageBucketName, gatewayUpdateRemoteAccessRdpRecordings.awsStorageBucketName) &&
        Objects.equals(this.awsStorageBucketPrefix, gatewayUpdateRemoteAccessRdpRecordings.awsStorageBucketPrefix) &&
        Objects.equals(this.awsStorageRegion, gatewayUpdateRemoteAccessRdpRecordings.awsStorageRegion) &&
        Objects.equals(this.awsStorageSecretAccessKey, gatewayUpdateRemoteAccessRdpRecordings.awsStorageSecretAccessKey) &&
        Objects.equals(this.azureStorageAccountName, gatewayUpdateRemoteAccessRdpRecordings.azureStorageAccountName) &&
        Objects.equals(this.azureStorageClientId, gatewayUpdateRemoteAccessRdpRecordings.azureStorageClientId) &&
        Objects.equals(this.azureStorageClientSecret, gatewayUpdateRemoteAccessRdpRecordings.azureStorageClientSecret) &&
        Objects.equals(this.azureStorageContainerName, gatewayUpdateRemoteAccessRdpRecordings.azureStorageContainerName) &&
        Objects.equals(this.azureStorageTenantId, gatewayUpdateRemoteAccessRdpRecordings.azureStorageTenantId) &&
        Objects.equals(this.json, gatewayUpdateRemoteAccessRdpRecordings.json) &&
        Objects.equals(this.rdpSessionRecording, gatewayUpdateRemoteAccessRdpRecordings.rdpSessionRecording) &&
        Objects.equals(this.rdpSessionStorage, gatewayUpdateRemoteAccessRdpRecordings.rdpSessionStorage) &&
        Objects.equals(this.token, gatewayUpdateRemoteAccessRdpRecordings.token) &&
        Objects.equals(this.uidToken, gatewayUpdateRemoteAccessRdpRecordings.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsStorageAccessKeyId, awsStorageBucketName, awsStorageBucketPrefix, awsStorageRegion, awsStorageSecretAccessKey, azureStorageAccountName, azureStorageClientId, azureStorageClientSecret, azureStorageContainerName, azureStorageTenantId, json, rdpSessionRecording, rdpSessionStorage, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateRemoteAccessRdpRecordings {\n");
    sb.append("    awsStorageAccessKeyId: ").append(toIndentedString(awsStorageAccessKeyId)).append("\n");
    sb.append("    awsStorageBucketName: ").append(toIndentedString(awsStorageBucketName)).append("\n");
    sb.append("    awsStorageBucketPrefix: ").append(toIndentedString(awsStorageBucketPrefix)).append("\n");
    sb.append("    awsStorageRegion: ").append(toIndentedString(awsStorageRegion)).append("\n");
    sb.append("    awsStorageSecretAccessKey: ").append(toIndentedString(awsStorageSecretAccessKey)).append("\n");
    sb.append("    azureStorageAccountName: ").append(toIndentedString(azureStorageAccountName)).append("\n");
    sb.append("    azureStorageClientId: ").append(toIndentedString(azureStorageClientId)).append("\n");
    sb.append("    azureStorageClientSecret: ").append(toIndentedString(azureStorageClientSecret)).append("\n");
    sb.append("    azureStorageContainerName: ").append(toIndentedString(azureStorageContainerName)).append("\n");
    sb.append("    azureStorageTenantId: ").append(toIndentedString(azureStorageTenantId)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    rdpSessionRecording: ").append(toIndentedString(rdpSessionRecording)).append("\n");
    sb.append("    rdpSessionStorage: ").append(toIndentedString(rdpSessionStorage)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

