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
 * SshBastionSessionTermination
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SshBastionSessionTermination {
  public static final String SERIALIZED_NAME_API_PASSWORD = "api_password";
  @SerializedName(SERIALIZED_NAME_API_PASSWORD)
  private String apiPassword;

  public static final String SERIALIZED_NAME_API_TOKEN = "api_token";
  @SerializedName(SERIALIZED_NAME_API_TOKEN)
  private String apiToken;

  public static final String SERIALIZED_NAME_API_URL = "api_url";
  @SerializedName(SERIALIZED_NAME_API_URL)
  private String apiUrl;

  public static final String SERIALIZED_NAME_API_USERNAME = "api_username";
  @SerializedName(SERIALIZED_NAME_API_USERNAME)
  private String apiUsername;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public SshBastionSessionTermination() { 
  }

  public SshBastionSessionTermination apiPassword(String apiPassword) {
    
    this.apiPassword = apiPassword;
    return this;
  }

   /**
   * Get apiPassword
   * @return apiPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiPassword() {
    return apiPassword;
  }


  public void setApiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
  }


  public SshBastionSessionTermination apiToken(String apiToken) {
    
    this.apiToken = apiToken;
    return this;
  }

   /**
   * Get apiToken
   * @return apiToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiToken() {
    return apiToken;
  }


  public void setApiToken(String apiToken) {
    this.apiToken = apiToken;
  }


  public SshBastionSessionTermination apiUrl(String apiUrl) {
    
    this.apiUrl = apiUrl;
    return this;
  }

   /**
   * Get apiUrl
   * @return apiUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiUrl() {
    return apiUrl;
  }


  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }


  public SshBastionSessionTermination apiUsername(String apiUsername) {
    
    this.apiUsername = apiUsername;
    return this;
  }

   /**
   * Get apiUsername
   * @return apiUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiUsername() {
    return apiUsername;
  }


  public void setApiUsername(String apiUsername) {
    this.apiUsername = apiUsername;
  }


  public SshBastionSessionTermination enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SshBastionSessionTermination sshBastionSessionTermination = (SshBastionSessionTermination) o;
    return Objects.equals(this.apiPassword, sshBastionSessionTermination.apiPassword) &&
        Objects.equals(this.apiToken, sshBastionSessionTermination.apiToken) &&
        Objects.equals(this.apiUrl, sshBastionSessionTermination.apiUrl) &&
        Objects.equals(this.apiUsername, sshBastionSessionTermination.apiUsername) &&
        Objects.equals(this.enabled, sshBastionSessionTermination.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiPassword, apiToken, apiUrl, apiUsername, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SshBastionSessionTermination {\n");
    sb.append("    apiPassword: ").append(toIndentedString(apiPassword)).append("\n");
    sb.append("    apiToken: ").append(toIndentedString(apiToken)).append("\n");
    sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
    sb.append("    apiUsername: ").append(toIndentedString(apiUsername)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

