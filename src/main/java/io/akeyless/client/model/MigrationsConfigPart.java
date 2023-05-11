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
import io.akeyless.client.model.AWSSecretsMigration;
import io.akeyless.client.model.ActiveDirectoryMigration;
import io.akeyless.client.model.AzureKeyVaultMigration;
import io.akeyless.client.model.GCPSecretsMigration;
import io.akeyless.client.model.HashiMigration;
import io.akeyless.client.model.K8SMigration;
import io.akeyless.client.model.MockMigration;
import io.akeyless.client.model.OnePasswordMigration;
import io.akeyless.client.model.ServerInventoryMigration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MigrationsConfigPart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MigrationsConfigPart {
  public static final String SERIALIZED_NAME_ACTIVE_DIRECTORY_MIGRATIONS = "active_directory_migrations";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DIRECTORY_MIGRATIONS)
  private List<ActiveDirectoryMigration> activeDirectoryMigrations = null;

  public static final String SERIALIZED_NAME_AWS_SECRETS_MIGRATIONS = "aws_secrets_migrations";
  @SerializedName(SERIALIZED_NAME_AWS_SECRETS_MIGRATIONS)
  private List<AWSSecretsMigration> awsSecretsMigrations = null;

  public static final String SERIALIZED_NAME_AZURE_KV_MIGRATIONS = "azure_kv_migrations";
  @SerializedName(SERIALIZED_NAME_AZURE_KV_MIGRATIONS)
  private List<AzureKeyVaultMigration> azureKvMigrations = null;

  public static final String SERIALIZED_NAME_GCP_SECRETS_MIGRATIONS = "gcp_secrets_migrations";
  @SerializedName(SERIALIZED_NAME_GCP_SECRETS_MIGRATIONS)
  private List<GCPSecretsMigration> gcpSecretsMigrations = null;

  public static final String SERIALIZED_NAME_HASHI_MIGRATIONS = "hashi_migrations";
  @SerializedName(SERIALIZED_NAME_HASHI_MIGRATIONS)
  private List<HashiMigration> hashiMigrations = null;

  public static final String SERIALIZED_NAME_K8S_MIGRATIONS = "k8s_migrations";
  @SerializedName(SERIALIZED_NAME_K8S_MIGRATIONS)
  private List<K8SMigration> k8sMigrations = null;

  public static final String SERIALIZED_NAME_MOCK_MIGRATIONS = "mock_migrations";
  @SerializedName(SERIALIZED_NAME_MOCK_MIGRATIONS)
  private List<MockMigration> mockMigrations = null;

  public static final String SERIALIZED_NAME_ONE_PASSWORD_MIGRATIONS = "one_password_migrations";
  @SerializedName(SERIALIZED_NAME_ONE_PASSWORD_MIGRATIONS)
  private List<OnePasswordMigration> onePasswordMigrations = null;

  public static final String SERIALIZED_NAME_SERVER_INVENTORY_MIGRATIONS = "server_inventory_migrations";
  @SerializedName(SERIALIZED_NAME_SERVER_INVENTORY_MIGRATIONS)
  private List<ServerInventoryMigration> serverInventoryMigrations = null;

  public MigrationsConfigPart() { 
  }

  public MigrationsConfigPart activeDirectoryMigrations(List<ActiveDirectoryMigration> activeDirectoryMigrations) {
    
    this.activeDirectoryMigrations = activeDirectoryMigrations;
    return this;
  }

  public MigrationsConfigPart addActiveDirectoryMigrationsItem(ActiveDirectoryMigration activeDirectoryMigrationsItem) {
    if (this.activeDirectoryMigrations == null) {
      this.activeDirectoryMigrations = new ArrayList<ActiveDirectoryMigration>();
    }
    this.activeDirectoryMigrations.add(activeDirectoryMigrationsItem);
    return this;
  }

   /**
   * Get activeDirectoryMigrations
   * @return activeDirectoryMigrations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ActiveDirectoryMigration> getActiveDirectoryMigrations() {
    return activeDirectoryMigrations;
  }


  public void setActiveDirectoryMigrations(List<ActiveDirectoryMigration> activeDirectoryMigrations) {
    this.activeDirectoryMigrations = activeDirectoryMigrations;
  }


  public MigrationsConfigPart awsSecretsMigrations(List<AWSSecretsMigration> awsSecretsMigrations) {
    
    this.awsSecretsMigrations = awsSecretsMigrations;
    return this;
  }

  public MigrationsConfigPart addAwsSecretsMigrationsItem(AWSSecretsMigration awsSecretsMigrationsItem) {
    if (this.awsSecretsMigrations == null) {
      this.awsSecretsMigrations = new ArrayList<AWSSecretsMigration>();
    }
    this.awsSecretsMigrations.add(awsSecretsMigrationsItem);
    return this;
  }

   /**
   * Get awsSecretsMigrations
   * @return awsSecretsMigrations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AWSSecretsMigration> getAwsSecretsMigrations() {
    return awsSecretsMigrations;
  }


  public void setAwsSecretsMigrations(List<AWSSecretsMigration> awsSecretsMigrations) {
    this.awsSecretsMigrations = awsSecretsMigrations;
  }


  public MigrationsConfigPart azureKvMigrations(List<AzureKeyVaultMigration> azureKvMigrations) {
    
    this.azureKvMigrations = azureKvMigrations;
    return this;
  }

  public MigrationsConfigPart addAzureKvMigrationsItem(AzureKeyVaultMigration azureKvMigrationsItem) {
    if (this.azureKvMigrations == null) {
      this.azureKvMigrations = new ArrayList<AzureKeyVaultMigration>();
    }
    this.azureKvMigrations.add(azureKvMigrationsItem);
    return this;
  }

   /**
   * Get azureKvMigrations
   * @return azureKvMigrations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AzureKeyVaultMigration> getAzureKvMigrations() {
    return azureKvMigrations;
  }


  public void setAzureKvMigrations(List<AzureKeyVaultMigration> azureKvMigrations) {
    this.azureKvMigrations = azureKvMigrations;
  }


  public MigrationsConfigPart gcpSecretsMigrations(List<GCPSecretsMigration> gcpSecretsMigrations) {
    
    this.gcpSecretsMigrations = gcpSecretsMigrations;
    return this;
  }

  public MigrationsConfigPart addGcpSecretsMigrationsItem(GCPSecretsMigration gcpSecretsMigrationsItem) {
    if (this.gcpSecretsMigrations == null) {
      this.gcpSecretsMigrations = new ArrayList<GCPSecretsMigration>();
    }
    this.gcpSecretsMigrations.add(gcpSecretsMigrationsItem);
    return this;
  }

   /**
   * Get gcpSecretsMigrations
   * @return gcpSecretsMigrations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GCPSecretsMigration> getGcpSecretsMigrations() {
    return gcpSecretsMigrations;
  }


  public void setGcpSecretsMigrations(List<GCPSecretsMigration> gcpSecretsMigrations) {
    this.gcpSecretsMigrations = gcpSecretsMigrations;
  }


  public MigrationsConfigPart hashiMigrations(List<HashiMigration> hashiMigrations) {
    
    this.hashiMigrations = hashiMigrations;
    return this;
  }

  public MigrationsConfigPart addHashiMigrationsItem(HashiMigration hashiMigrationsItem) {
    if (this.hashiMigrations == null) {
      this.hashiMigrations = new ArrayList<HashiMigration>();
    }
    this.hashiMigrations.add(hashiMigrationsItem);
    return this;
  }

   /**
   * Get hashiMigrations
   * @return hashiMigrations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HashiMigration> getHashiMigrations() {
    return hashiMigrations;
  }


  public void setHashiMigrations(List<HashiMigration> hashiMigrations) {
    this.hashiMigrations = hashiMigrations;
  }


  public MigrationsConfigPart k8sMigrations(List<K8SMigration> k8sMigrations) {
    
    this.k8sMigrations = k8sMigrations;
    return this;
  }

  public MigrationsConfigPart addK8sMigrationsItem(K8SMigration k8sMigrationsItem) {
    if (this.k8sMigrations == null) {
      this.k8sMigrations = new ArrayList<K8SMigration>();
    }
    this.k8sMigrations.add(k8sMigrationsItem);
    return this;
  }

   /**
   * Get k8sMigrations
   * @return k8sMigrations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<K8SMigration> getK8sMigrations() {
    return k8sMigrations;
  }


  public void setK8sMigrations(List<K8SMigration> k8sMigrations) {
    this.k8sMigrations = k8sMigrations;
  }


  public MigrationsConfigPart mockMigrations(List<MockMigration> mockMigrations) {
    
    this.mockMigrations = mockMigrations;
    return this;
  }

  public MigrationsConfigPart addMockMigrationsItem(MockMigration mockMigrationsItem) {
    if (this.mockMigrations == null) {
      this.mockMigrations = new ArrayList<MockMigration>();
    }
    this.mockMigrations.add(mockMigrationsItem);
    return this;
  }

   /**
   * Get mockMigrations
   * @return mockMigrations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MockMigration> getMockMigrations() {
    return mockMigrations;
  }


  public void setMockMigrations(List<MockMigration> mockMigrations) {
    this.mockMigrations = mockMigrations;
  }


  public MigrationsConfigPart onePasswordMigrations(List<OnePasswordMigration> onePasswordMigrations) {
    
    this.onePasswordMigrations = onePasswordMigrations;
    return this;
  }

  public MigrationsConfigPart addOnePasswordMigrationsItem(OnePasswordMigration onePasswordMigrationsItem) {
    if (this.onePasswordMigrations == null) {
      this.onePasswordMigrations = new ArrayList<OnePasswordMigration>();
    }
    this.onePasswordMigrations.add(onePasswordMigrationsItem);
    return this;
  }

   /**
   * Get onePasswordMigrations
   * @return onePasswordMigrations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OnePasswordMigration> getOnePasswordMigrations() {
    return onePasswordMigrations;
  }


  public void setOnePasswordMigrations(List<OnePasswordMigration> onePasswordMigrations) {
    this.onePasswordMigrations = onePasswordMigrations;
  }


  public MigrationsConfigPart serverInventoryMigrations(List<ServerInventoryMigration> serverInventoryMigrations) {
    
    this.serverInventoryMigrations = serverInventoryMigrations;
    return this;
  }

  public MigrationsConfigPart addServerInventoryMigrationsItem(ServerInventoryMigration serverInventoryMigrationsItem) {
    if (this.serverInventoryMigrations == null) {
      this.serverInventoryMigrations = new ArrayList<ServerInventoryMigration>();
    }
    this.serverInventoryMigrations.add(serverInventoryMigrationsItem);
    return this;
  }

   /**
   * Get serverInventoryMigrations
   * @return serverInventoryMigrations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ServerInventoryMigration> getServerInventoryMigrations() {
    return serverInventoryMigrations;
  }


  public void setServerInventoryMigrations(List<ServerInventoryMigration> serverInventoryMigrations) {
    this.serverInventoryMigrations = serverInventoryMigrations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationsConfigPart migrationsConfigPart = (MigrationsConfigPart) o;
    return Objects.equals(this.activeDirectoryMigrations, migrationsConfigPart.activeDirectoryMigrations) &&
        Objects.equals(this.awsSecretsMigrations, migrationsConfigPart.awsSecretsMigrations) &&
        Objects.equals(this.azureKvMigrations, migrationsConfigPart.azureKvMigrations) &&
        Objects.equals(this.gcpSecretsMigrations, migrationsConfigPart.gcpSecretsMigrations) &&
        Objects.equals(this.hashiMigrations, migrationsConfigPart.hashiMigrations) &&
        Objects.equals(this.k8sMigrations, migrationsConfigPart.k8sMigrations) &&
        Objects.equals(this.mockMigrations, migrationsConfigPart.mockMigrations) &&
        Objects.equals(this.onePasswordMigrations, migrationsConfigPart.onePasswordMigrations) &&
        Objects.equals(this.serverInventoryMigrations, migrationsConfigPart.serverInventoryMigrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDirectoryMigrations, awsSecretsMigrations, azureKvMigrations, gcpSecretsMigrations, hashiMigrations, k8sMigrations, mockMigrations, onePasswordMigrations, serverInventoryMigrations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationsConfigPart {\n");
    sb.append("    activeDirectoryMigrations: ").append(toIndentedString(activeDirectoryMigrations)).append("\n");
    sb.append("    awsSecretsMigrations: ").append(toIndentedString(awsSecretsMigrations)).append("\n");
    sb.append("    azureKvMigrations: ").append(toIndentedString(azureKvMigrations)).append("\n");
    sb.append("    gcpSecretsMigrations: ").append(toIndentedString(gcpSecretsMigrations)).append("\n");
    sb.append("    hashiMigrations: ").append(toIndentedString(hashiMigrations)).append("\n");
    sb.append("    k8sMigrations: ").append(toIndentedString(k8sMigrations)).append("\n");
    sb.append("    mockMigrations: ").append(toIndentedString(mockMigrations)).append("\n");
    sb.append("    onePasswordMigrations: ").append(toIndentedString(onePasswordMigrations)).append("\n");
    sb.append("    serverInventoryMigrations: ").append(toIndentedString(serverInventoryMigrations)).append("\n");
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

