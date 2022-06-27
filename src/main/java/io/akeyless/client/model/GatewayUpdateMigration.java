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
 * gatewayUpdateMigration is a command that update migration
 */
@ApiModel(description = "gatewayUpdateMigration is a command that update migration")

public class GatewayUpdateMigration {
  public static final String SERIALIZED_NAME_AWS_KEY = "aws-key";
  @SerializedName(SERIALIZED_NAME_AWS_KEY)
  private String awsKey;

  public static final String SERIALIZED_NAME_AWS_KEY_ID = "aws-key-id";
  @SerializedName(SERIALIZED_NAME_AWS_KEY_ID)
  private String awsKeyId;

  public static final String SERIALIZED_NAME_AWS_REGION = "aws-region";
  @SerializedName(SERIALIZED_NAME_AWS_REGION)
  private String awsRegion;

  public static final String SERIALIZED_NAME_AZURE_CLIENT_ID = "azure-client-id";
  @SerializedName(SERIALIZED_NAME_AZURE_CLIENT_ID)
  private String azureClientId;

  public static final String SERIALIZED_NAME_AZURE_KV_NAME = "azure-kv-name";
  @SerializedName(SERIALIZED_NAME_AZURE_KV_NAME)
  private String azureKvName;

  public static final String SERIALIZED_NAME_AZURE_SECRET = "azure-secret";
  @SerializedName(SERIALIZED_NAME_AZURE_SECRET)
  private String azureSecret;

  public static final String SERIALIZED_NAME_AZURE_TENANT_ID = "azure-tenant-id";
  @SerializedName(SERIALIZED_NAME_AZURE_TENANT_ID)
  private String azureTenantId;

  public static final String SERIALIZED_NAME_GCP_KEY = "gcp-key";
  @SerializedName(SERIALIZED_NAME_GCP_KEY)
  private String gcpKey;

  public static final String SERIALIZED_NAME_HASHI_JSON = "hashi-json";
  @SerializedName(SERIALIZED_NAME_HASHI_JSON)
  private String hashiJson;

  public static final String SERIALIZED_NAME_HASHI_NS = "hashi-ns";
  @SerializedName(SERIALIZED_NAME_HASHI_NS)
  private List<String> hashiNs = null;

  public static final String SERIALIZED_NAME_HASHI_TOKEN = "hashi-token";
  @SerializedName(SERIALIZED_NAME_HASHI_TOKEN)
  private String hashiToken;

  public static final String SERIALIZED_NAME_HASHI_URL = "hashi-url";
  @SerializedName(SERIALIZED_NAME_HASHI_URL)
  private String hashiUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_K8S_CA_CERTIFICATE = "k8s-ca-certificate";
  @SerializedName(SERIALIZED_NAME_K8S_CA_CERTIFICATE)
  private List<Integer> k8sCaCertificate = null;

  public static final String SERIALIZED_NAME_K8S_CLIENT_CERTIFICATE = "k8s-client-certificate";
  @SerializedName(SERIALIZED_NAME_K8S_CLIENT_CERTIFICATE)
  private List<Integer> k8sClientCertificate = null;

  public static final String SERIALIZED_NAME_K8S_CLIENT_KEY = "k8s-client-key";
  @SerializedName(SERIALIZED_NAME_K8S_CLIENT_KEY)
  private List<Integer> k8sClientKey = null;

  public static final String SERIALIZED_NAME_K8S_NAMESPACE = "k8s-namespace";
  @SerializedName(SERIALIZED_NAME_K8S_NAMESPACE)
  private String k8sNamespace;

  public static final String SERIALIZED_NAME_K8S_PASSWORD = "k8s-password";
  @SerializedName(SERIALIZED_NAME_K8S_PASSWORD)
  private String k8sPassword;

  public static final String SERIALIZED_NAME_K8S_SKIP_SYSTEM = "k8s-skip-system";
  @SerializedName(SERIALIZED_NAME_K8S_SKIP_SYSTEM)
  private Boolean k8sSkipSystem;

  public static final String SERIALIZED_NAME_K8S_TOKEN = "k8s-token";
  @SerializedName(SERIALIZED_NAME_K8S_TOKEN)
  private String k8sToken;

  public static final String SERIALIZED_NAME_K8S_URL = "k8s-url";
  @SerializedName(SERIALIZED_NAME_K8S_URL)
  private String k8sUrl;

  public static final String SERIALIZED_NAME_K8S_USERNAME = "k8s-username";
  @SerializedName(SERIALIZED_NAME_K8S_USERNAME)
  private String k8sUsername;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new_name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PROTECTION_KEY = "protection-key";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY)
  private String protectionKey;

  public static final String SERIALIZED_NAME_TARGET_LOCATION = "target-location";
  @SerializedName(SERIALIZED_NAME_TARGET_LOCATION)
  private String targetLocation;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public GatewayUpdateMigration awsKey(String awsKey) {
    
    this.awsKey = awsKey;
    return this;
  }

   /**
   * AWS Secret Access Key (relevant only for AWS migration)
   * @return awsKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS Secret Access Key (relevant only for AWS migration)")

  public String getAwsKey() {
    return awsKey;
  }


  public void setAwsKey(String awsKey) {
    this.awsKey = awsKey;
  }


  public GatewayUpdateMigration awsKeyId(String awsKeyId) {
    
    this.awsKeyId = awsKeyId;
    return this;
  }

   /**
   * AWS Access Key ID with sufficient permissions to get all secrets, e.g. &#39;arn:aws:secretsmanager:[Region]:[AccountId]:secret:[/path/to/secrets/_*]&#39; (relevant only for AWS migration)
   * @return awsKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS Access Key ID with sufficient permissions to get all secrets, e.g. 'arn:aws:secretsmanager:[Region]:[AccountId]:secret:[/path/to/secrets/_*]' (relevant only for AWS migration)")

  public String getAwsKeyId() {
    return awsKeyId;
  }


  public void setAwsKeyId(String awsKeyId) {
    this.awsKeyId = awsKeyId;
  }


  public GatewayUpdateMigration awsRegion(String awsRegion) {
    
    this.awsRegion = awsRegion;
    return this;
  }

   /**
   * AWS region of the required Secrets Manager (relevant only for AWS migration)
   * @return awsRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS region of the required Secrets Manager (relevant only for AWS migration)")

  public String getAwsRegion() {
    return awsRegion;
  }


  public void setAwsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
  }


  public GatewayUpdateMigration azureClientId(String azureClientId) {
    
    this.azureClientId = azureClientId;
    return this;
  }

   /**
   * Azure Key Vault Access client ID, should be Azure AD App with a service principal (relevant only for Azure Key Vault migration)
   * @return azureClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure Key Vault Access client ID, should be Azure AD App with a service principal (relevant only for Azure Key Vault migration)")

  public String getAzureClientId() {
    return azureClientId;
  }


  public void setAzureClientId(String azureClientId) {
    this.azureClientId = azureClientId;
  }


  public GatewayUpdateMigration azureKvName(String azureKvName) {
    
    this.azureKvName = azureKvName;
    return this;
  }

   /**
   * Azure Key Vault Name (relevant only for Azure Key Vault migration)
   * @return azureKvName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure Key Vault Name (relevant only for Azure Key Vault migration)")

  public String getAzureKvName() {
    return azureKvName;
  }


  public void setAzureKvName(String azureKvName) {
    this.azureKvName = azureKvName;
  }


  public GatewayUpdateMigration azureSecret(String azureSecret) {
    
    this.azureSecret = azureSecret;
    return this;
  }

   /**
   * Azure Key Vault secret (relevant only for Azure Key Vault migration)
   * @return azureSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure Key Vault secret (relevant only for Azure Key Vault migration)")

  public String getAzureSecret() {
    return azureSecret;
  }


  public void setAzureSecret(String azureSecret) {
    this.azureSecret = azureSecret;
  }


  public GatewayUpdateMigration azureTenantId(String azureTenantId) {
    
    this.azureTenantId = azureTenantId;
    return this;
  }

   /**
   * Azure Key Vault Access tenant ID (relevant only for Azure Key Vault migration)
   * @return azureTenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure Key Vault Access tenant ID (relevant only for Azure Key Vault migration)")

  public String getAzureTenantId() {
    return azureTenantId;
  }


  public void setAzureTenantId(String azureTenantId) {
    this.azureTenantId = azureTenantId;
  }


  public GatewayUpdateMigration gcpKey(String gcpKey) {
    
    this.gcpKey = gcpKey;
    return this;
  }

   /**
   * Base64-encoded GCP Service Account private key text with sufficient permissions to Secrets Manager, Minimum required permission is Secret Manager Secret Accessor, e.g. &#39;roles/secretmanager.secretAccessor&#39; (relevant only for GCP migration)
   * @return gcpKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64-encoded GCP Service Account private key text with sufficient permissions to Secrets Manager, Minimum required permission is Secret Manager Secret Accessor, e.g. 'roles/secretmanager.secretAccessor' (relevant only for GCP migration)")

  public String getGcpKey() {
    return gcpKey;
  }


  public void setGcpKey(String gcpKey) {
    this.gcpKey = gcpKey;
  }


  public GatewayUpdateMigration hashiJson(String hashiJson) {
    
    this.hashiJson = hashiJson;
    return this;
  }

   /**
   * Import secret key as json value or independent secrets (relevant only for HasiCorp Vault migration)
   * @return hashiJson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Import secret key as json value or independent secrets (relevant only for HasiCorp Vault migration)")

  public String getHashiJson() {
    return hashiJson;
  }


  public void setHashiJson(String hashiJson) {
    this.hashiJson = hashiJson;
  }


  public GatewayUpdateMigration hashiNs(List<String> hashiNs) {
    
    this.hashiNs = hashiNs;
    return this;
  }

  public GatewayUpdateMigration addHashiNsItem(String hashiNsItem) {
    if (this.hashiNs == null) {
      this.hashiNs = new ArrayList<String>();
    }
    this.hashiNs.add(hashiNsItem);
    return this;
  }

   /**
   * HashiCorp Vault Namespaces is a comma-separated list of namespaces which need to be imported into Akeyless Vault. For every provided namespace, all its child namespaces are imported as well, e.g. nmsp/subnmsp1/subnmsp2,nmsp/anothernmsp. By default, import all namespaces (relevant only for HasiCorp Vault migration)
   * @return hashiNs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HashiCorp Vault Namespaces is a comma-separated list of namespaces which need to be imported into Akeyless Vault. For every provided namespace, all its child namespaces are imported as well, e.g. nmsp/subnmsp1/subnmsp2,nmsp/anothernmsp. By default, import all namespaces (relevant only for HasiCorp Vault migration)")

  public List<String> getHashiNs() {
    return hashiNs;
  }


  public void setHashiNs(List<String> hashiNs) {
    this.hashiNs = hashiNs;
  }


  public GatewayUpdateMigration hashiToken(String hashiToken) {
    
    this.hashiToken = hashiToken;
    return this;
  }

   /**
   * HashiCorp Vault access token with sufficient permissions to preform list &amp; read operations on secrets objects (relevant only for HasiCorp Vault migration)
   * @return hashiToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HashiCorp Vault access token with sufficient permissions to preform list & read operations on secrets objects (relevant only for HasiCorp Vault migration)")

  public String getHashiToken() {
    return hashiToken;
  }


  public void setHashiToken(String hashiToken) {
    this.hashiToken = hashiToken;
  }


  public GatewayUpdateMigration hashiUrl(String hashiUrl) {
    
    this.hashiUrl = hashiUrl;
    return this;
  }

   /**
   * HashiCorp Vault API URL, e.g. https://vault-mgr01:8200 (relevant only for HasiCorp Vault migration)
   * @return hashiUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HashiCorp Vault API URL, e.g. https://vault-mgr01:8200 (relevant only for HasiCorp Vault migration)")

  public String getHashiUrl() {
    return hashiUrl;
  }


  public void setHashiUrl(String hashiUrl) {
    this.hashiUrl = hashiUrl;
  }


  public GatewayUpdateMigration id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Migration ID (Can be retrieved with gateway-list-migration command)
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Migration ID (Can be retrieved with gateway-list-migration command)")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GatewayUpdateMigration k8sCaCertificate(List<Integer> k8sCaCertificate) {
    
    this.k8sCaCertificate = k8sCaCertificate;
    return this;
  }

  public GatewayUpdateMigration addK8sCaCertificateItem(Integer k8sCaCertificateItem) {
    if (this.k8sCaCertificate == null) {
      this.k8sCaCertificate = new ArrayList<Integer>();
    }
    this.k8sCaCertificate.add(k8sCaCertificateItem);
    return this;
  }

   /**
   * For Certificate Authentication method K8s Cluster CA certificate (relevant only for K8s migration with Certificate Authentication method)
   * @return k8sCaCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For Certificate Authentication method K8s Cluster CA certificate (relevant only for K8s migration with Certificate Authentication method)")

  public List<Integer> getK8sCaCertificate() {
    return k8sCaCertificate;
  }


  public void setK8sCaCertificate(List<Integer> k8sCaCertificate) {
    this.k8sCaCertificate = k8sCaCertificate;
  }


  public GatewayUpdateMigration k8sClientCertificate(List<Integer> k8sClientCertificate) {
    
    this.k8sClientCertificate = k8sClientCertificate;
    return this;
  }

  public GatewayUpdateMigration addK8sClientCertificateItem(Integer k8sClientCertificateItem) {
    if (this.k8sClientCertificate == null) {
      this.k8sClientCertificate = new ArrayList<Integer>();
    }
    this.k8sClientCertificate.add(k8sClientCertificateItem);
    return this;
  }

   /**
   * K8s Client certificate with sufficient permission to list and get secrets in the namespace(s) you selected (relevant only for K8s migration with Certificate Authentication method)
   * @return k8sClientCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8s Client certificate with sufficient permission to list and get secrets in the namespace(s) you selected (relevant only for K8s migration with Certificate Authentication method)")

  public List<Integer> getK8sClientCertificate() {
    return k8sClientCertificate;
  }


  public void setK8sClientCertificate(List<Integer> k8sClientCertificate) {
    this.k8sClientCertificate = k8sClientCertificate;
  }


  public GatewayUpdateMigration k8sClientKey(List<Integer> k8sClientKey) {
    
    this.k8sClientKey = k8sClientKey;
    return this;
  }

  public GatewayUpdateMigration addK8sClientKeyItem(Integer k8sClientKeyItem) {
    if (this.k8sClientKey == null) {
      this.k8sClientKey = new ArrayList<Integer>();
    }
    this.k8sClientKey.add(k8sClientKeyItem);
    return this;
  }

   /**
   * K8s Client key (relevant only for K8s migration with Certificate Authentication method)
   * @return k8sClientKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8s Client key (relevant only for K8s migration with Certificate Authentication method)")

  public List<Integer> getK8sClientKey() {
    return k8sClientKey;
  }


  public void setK8sClientKey(List<Integer> k8sClientKey) {
    this.k8sClientKey = k8sClientKey;
  }


  public GatewayUpdateMigration k8sNamespace(String k8sNamespace) {
    
    this.k8sNamespace = k8sNamespace;
    return this;
  }

   /**
   * K8s Namespace, Use this field to import secrets from a particular namespace only. By default, the secrets are imported from all namespaces (relevant only for K8s migration)
   * @return k8sNamespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8s Namespace, Use this field to import secrets from a particular namespace only. By default, the secrets are imported from all namespaces (relevant only for K8s migration)")

  public String getK8sNamespace() {
    return k8sNamespace;
  }


  public void setK8sNamespace(String k8sNamespace) {
    this.k8sNamespace = k8sNamespace;
  }


  public GatewayUpdateMigration k8sPassword(String k8sPassword) {
    
    this.k8sPassword = k8sPassword;
    return this;
  }

   /**
   * K8s Client password (relevant only for K8s migration with Password Authentication method)
   * @return k8sPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8s Client password (relevant only for K8s migration with Password Authentication method)")

  public String getK8sPassword() {
    return k8sPassword;
  }


  public void setK8sPassword(String k8sPassword) {
    this.k8sPassword = k8sPassword;
  }


  public GatewayUpdateMigration k8sSkipSystem(Boolean k8sSkipSystem) {
    
    this.k8sSkipSystem = k8sSkipSystem;
    return this;
  }

   /**
   * K8s Skip Control Plane Secrets, This option allows to avoid importing secrets from system namespaces (relevant only for K8s migration)
   * @return k8sSkipSystem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8s Skip Control Plane Secrets, This option allows to avoid importing secrets from system namespaces (relevant only for K8s migration)")

  public Boolean getK8sSkipSystem() {
    return k8sSkipSystem;
  }


  public void setK8sSkipSystem(Boolean k8sSkipSystem) {
    this.k8sSkipSystem = k8sSkipSystem;
  }


  public GatewayUpdateMigration k8sToken(String k8sToken) {
    
    this.k8sToken = k8sToken;
    return this;
  }

   /**
   * For Token Authentication method K8s Bearer Token with sufficient permission to list and get secrets in the namespace(s) you selected (relevant only for K8s migration with Token Authentication method)
   * @return k8sToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For Token Authentication method K8s Bearer Token with sufficient permission to list and get secrets in the namespace(s) you selected (relevant only for K8s migration with Token Authentication method)")

  public String getK8sToken() {
    return k8sToken;
  }


  public void setK8sToken(String k8sToken) {
    this.k8sToken = k8sToken;
  }


  public GatewayUpdateMigration k8sUrl(String k8sUrl) {
    
    this.k8sUrl = k8sUrl;
    return this;
  }

   /**
   * K8s API Server URL, e.g. https://k8s-api.mycompany.com:6443 (relevant only for K8s migration)
   * @return k8sUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "K8s API Server URL, e.g. https://k8s-api.mycompany.com:6443 (relevant only for K8s migration)")

  public String getK8sUrl() {
    return k8sUrl;
  }


  public void setK8sUrl(String k8sUrl) {
    this.k8sUrl = k8sUrl;
  }


  public GatewayUpdateMigration k8sUsername(String k8sUsername) {
    
    this.k8sUsername = k8sUsername;
    return this;
  }

   /**
   * For Password Authentication method K8s Client username with sufficient permission to list and get secrets in the namespace(s) you selected (relevant only for K8s migration with Password Authentication method)
   * @return k8sUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For Password Authentication method K8s Client username with sufficient permission to list and get secrets in the namespace(s) you selected (relevant only for K8s migration with Password Authentication method)")

  public String getK8sUsername() {
    return k8sUsername;
  }


  public void setK8sUsername(String k8sUsername) {
    this.k8sUsername = k8sUsername;
  }


  public GatewayUpdateMigration name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Migration name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Migration name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GatewayUpdateMigration newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * New migration name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New migration name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public GatewayUpdateMigration protectionKey(String protectionKey) {
    
    this.protectionKey = protectionKey;
    return this;
  }

   /**
   * The name of the key that protects the classic key value (if empty, the account default key will be used)
   * @return protectionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the key that protects the classic key value (if empty, the account default key will be used)")

  public String getProtectionKey() {
    return protectionKey;
  }


  public void setProtectionKey(String protectionKey) {
    this.protectionKey = protectionKey;
  }


  public GatewayUpdateMigration targetLocation(String targetLocation) {
    
    this.targetLocation = targetLocation;
    return this;
  }

   /**
   * Target location in Akeyless for imported secrets
   * @return targetLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target location in Akeyless for imported secrets")

  public String getTargetLocation() {
    return targetLocation;
  }


  public void setTargetLocation(String targetLocation) {
    this.targetLocation = targetLocation;
  }


  public GatewayUpdateMigration token(String token) {
    
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


  public GatewayUpdateMigration uidToken(String uidToken) {
    
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayUpdateMigration gatewayUpdateMigration = (GatewayUpdateMigration) o;
    return Objects.equals(this.awsKey, gatewayUpdateMigration.awsKey) &&
        Objects.equals(this.awsKeyId, gatewayUpdateMigration.awsKeyId) &&
        Objects.equals(this.awsRegion, gatewayUpdateMigration.awsRegion) &&
        Objects.equals(this.azureClientId, gatewayUpdateMigration.azureClientId) &&
        Objects.equals(this.azureKvName, gatewayUpdateMigration.azureKvName) &&
        Objects.equals(this.azureSecret, gatewayUpdateMigration.azureSecret) &&
        Objects.equals(this.azureTenantId, gatewayUpdateMigration.azureTenantId) &&
        Objects.equals(this.gcpKey, gatewayUpdateMigration.gcpKey) &&
        Objects.equals(this.hashiJson, gatewayUpdateMigration.hashiJson) &&
        Objects.equals(this.hashiNs, gatewayUpdateMigration.hashiNs) &&
        Objects.equals(this.hashiToken, gatewayUpdateMigration.hashiToken) &&
        Objects.equals(this.hashiUrl, gatewayUpdateMigration.hashiUrl) &&
        Objects.equals(this.id, gatewayUpdateMigration.id) &&
        Objects.equals(this.k8sCaCertificate, gatewayUpdateMigration.k8sCaCertificate) &&
        Objects.equals(this.k8sClientCertificate, gatewayUpdateMigration.k8sClientCertificate) &&
        Objects.equals(this.k8sClientKey, gatewayUpdateMigration.k8sClientKey) &&
        Objects.equals(this.k8sNamespace, gatewayUpdateMigration.k8sNamespace) &&
        Objects.equals(this.k8sPassword, gatewayUpdateMigration.k8sPassword) &&
        Objects.equals(this.k8sSkipSystem, gatewayUpdateMigration.k8sSkipSystem) &&
        Objects.equals(this.k8sToken, gatewayUpdateMigration.k8sToken) &&
        Objects.equals(this.k8sUrl, gatewayUpdateMigration.k8sUrl) &&
        Objects.equals(this.k8sUsername, gatewayUpdateMigration.k8sUsername) &&
        Objects.equals(this.name, gatewayUpdateMigration.name) &&
        Objects.equals(this.newName, gatewayUpdateMigration.newName) &&
        Objects.equals(this.protectionKey, gatewayUpdateMigration.protectionKey) &&
        Objects.equals(this.targetLocation, gatewayUpdateMigration.targetLocation) &&
        Objects.equals(this.token, gatewayUpdateMigration.token) &&
        Objects.equals(this.uidToken, gatewayUpdateMigration.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsKey, awsKeyId, awsRegion, azureClientId, azureKvName, azureSecret, azureTenantId, gcpKey, hashiJson, hashiNs, hashiToken, hashiUrl, id, k8sCaCertificate, k8sClientCertificate, k8sClientKey, k8sNamespace, k8sPassword, k8sSkipSystem, k8sToken, k8sUrl, k8sUsername, name, newName, protectionKey, targetLocation, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateMigration {\n");
    sb.append("    awsKey: ").append(toIndentedString(awsKey)).append("\n");
    sb.append("    awsKeyId: ").append(toIndentedString(awsKeyId)).append("\n");
    sb.append("    awsRegion: ").append(toIndentedString(awsRegion)).append("\n");
    sb.append("    azureClientId: ").append(toIndentedString(azureClientId)).append("\n");
    sb.append("    azureKvName: ").append(toIndentedString(azureKvName)).append("\n");
    sb.append("    azureSecret: ").append(toIndentedString(azureSecret)).append("\n");
    sb.append("    azureTenantId: ").append(toIndentedString(azureTenantId)).append("\n");
    sb.append("    gcpKey: ").append(toIndentedString(gcpKey)).append("\n");
    sb.append("    hashiJson: ").append(toIndentedString(hashiJson)).append("\n");
    sb.append("    hashiNs: ").append(toIndentedString(hashiNs)).append("\n");
    sb.append("    hashiToken: ").append(toIndentedString(hashiToken)).append("\n");
    sb.append("    hashiUrl: ").append(toIndentedString(hashiUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    k8sCaCertificate: ").append(toIndentedString(k8sCaCertificate)).append("\n");
    sb.append("    k8sClientCertificate: ").append(toIndentedString(k8sClientCertificate)).append("\n");
    sb.append("    k8sClientKey: ").append(toIndentedString(k8sClientKey)).append("\n");
    sb.append("    k8sNamespace: ").append(toIndentedString(k8sNamespace)).append("\n");
    sb.append("    k8sPassword: ").append(toIndentedString(k8sPassword)).append("\n");
    sb.append("    k8sSkipSystem: ").append(toIndentedString(k8sSkipSystem)).append("\n");
    sb.append("    k8sToken: ").append(toIndentedString(k8sToken)).append("\n");
    sb.append("    k8sUrl: ").append(toIndentedString(k8sUrl)).append("\n");
    sb.append("    k8sUsername: ").append(toIndentedString(k8sUsername)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    protectionKey: ").append(toIndentedString(protectionKey)).append("\n");
    sb.append("    targetLocation: ").append(toIndentedString(targetLocation)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

