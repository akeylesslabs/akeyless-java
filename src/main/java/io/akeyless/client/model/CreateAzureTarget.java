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
 * CreateAzureTarget
 */

public class CreateAzureTarget {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client-id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client-secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RESOURCE_GROUP_NAME = "resource-group-name";
  @SerializedName(SERIALIZED_NAME_RESOURCE_GROUP_NAME)
  private String resourceGroupName;

  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resource-name";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  private String resourceName;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription-id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant-id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY = "use-gw-cloud-identity";
  @SerializedName(SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY)
  private Boolean useGwCloudIdentity;


  public CreateAzureTarget clientId(String clientId) {
    
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


  public CreateAzureTarget clientSecret(String clientSecret) {
    
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


  public CreateAzureTarget comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Comment about the target
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comment about the target")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public CreateAzureTarget key(String key) {
    
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


  public CreateAzureTarget name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Target name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Target name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateAzureTarget resourceGroupName(String resourceGroupName) {
    
    this.resourceGroupName = resourceGroupName;
    return this;
  }

   /**
   * The Resource Group name in your Azure subscription
   * @return resourceGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Resource Group name in your Azure subscription")

  public String getResourceGroupName() {
    return resourceGroupName;
  }


  public void setResourceGroupName(String resourceGroupName) {
    this.resourceGroupName = resourceGroupName;
  }


  public CreateAzureTarget resourceName(String resourceName) {
    
    this.resourceName = resourceName;
    return this;
  }

   /**
   * The name of the relevant Resource
   * @return resourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the relevant Resource")

  public String getResourceName() {
    return resourceName;
  }


  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  public CreateAzureTarget subscriptionId(String subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Azure Subscription Id
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Azure Subscription Id")

  public String getSubscriptionId() {
    return subscriptionId;
  }


  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public CreateAzureTarget tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public CreateAzureTarget token(String token) {
    
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


  public CreateAzureTarget uidToken(String uidToken) {
    
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


  public CreateAzureTarget useGwCloudIdentity(Boolean useGwCloudIdentity) {
    
    this.useGwCloudIdentity = useGwCloudIdentity;
    return this;
  }

   /**
   * Get useGwCloudIdentity
   * @return useGwCloudIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseGwCloudIdentity() {
    return useGwCloudIdentity;
  }


  public void setUseGwCloudIdentity(Boolean useGwCloudIdentity) {
    this.useGwCloudIdentity = useGwCloudIdentity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAzureTarget createAzureTarget = (CreateAzureTarget) o;
    return Objects.equals(this.clientId, createAzureTarget.clientId) &&
        Objects.equals(this.clientSecret, createAzureTarget.clientSecret) &&
        Objects.equals(this.comment, createAzureTarget.comment) &&
        Objects.equals(this.key, createAzureTarget.key) &&
        Objects.equals(this.name, createAzureTarget.name) &&
        Objects.equals(this.resourceGroupName, createAzureTarget.resourceGroupName) &&
        Objects.equals(this.resourceName, createAzureTarget.resourceName) &&
        Objects.equals(this.subscriptionId, createAzureTarget.subscriptionId) &&
        Objects.equals(this.tenantId, createAzureTarget.tenantId) &&
        Objects.equals(this.token, createAzureTarget.token) &&
        Objects.equals(this.uidToken, createAzureTarget.uidToken) &&
        Objects.equals(this.useGwCloudIdentity, createAzureTarget.useGwCloudIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, comment, key, name, resourceGroupName, resourceName, subscriptionId, tenantId, token, uidToken, useGwCloudIdentity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAzureTarget {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceGroupName: ").append(toIndentedString(resourceGroupName)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

