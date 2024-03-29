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
 * AzureLogAnalyticsForwardingConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AzureLogAnalyticsForwardingConfig {
  public static final String SERIALIZED_NAME_AZURE_WORKSPACE_ID = "azure_workspace_id";
  @SerializedName(SERIALIZED_NAME_AZURE_WORKSPACE_ID)
  private String azureWorkspaceId;

  public static final String SERIALIZED_NAME_AZURE_WORKSPACE_KEY = "azure_workspace_key";
  @SerializedName(SERIALIZED_NAME_AZURE_WORKSPACE_KEY)
  private String azureWorkspaceKey;

  public AzureLogAnalyticsForwardingConfig() { 
  }

  public AzureLogAnalyticsForwardingConfig azureWorkspaceId(String azureWorkspaceId) {
    
    this.azureWorkspaceId = azureWorkspaceId;
    return this;
  }

   /**
   * Get azureWorkspaceId
   * @return azureWorkspaceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAzureWorkspaceId() {
    return azureWorkspaceId;
  }


  public void setAzureWorkspaceId(String azureWorkspaceId) {
    this.azureWorkspaceId = azureWorkspaceId;
  }


  public AzureLogAnalyticsForwardingConfig azureWorkspaceKey(String azureWorkspaceKey) {
    
    this.azureWorkspaceKey = azureWorkspaceKey;
    return this;
  }

   /**
   * Get azureWorkspaceKey
   * @return azureWorkspaceKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAzureWorkspaceKey() {
    return azureWorkspaceKey;
  }


  public void setAzureWorkspaceKey(String azureWorkspaceKey) {
    this.azureWorkspaceKey = azureWorkspaceKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureLogAnalyticsForwardingConfig azureLogAnalyticsForwardingConfig = (AzureLogAnalyticsForwardingConfig) o;
    return Objects.equals(this.azureWorkspaceId, azureLogAnalyticsForwardingConfig.azureWorkspaceId) &&
        Objects.equals(this.azureWorkspaceKey, azureLogAnalyticsForwardingConfig.azureWorkspaceKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureWorkspaceId, azureWorkspaceKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureLogAnalyticsForwardingConfig {\n");
    sb.append("    azureWorkspaceId: ").append(toIndentedString(azureWorkspaceId)).append("\n");
    sb.append("    azureWorkspaceKey: ").append(toIndentedString(azureWorkspaceKey)).append("\n");
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

