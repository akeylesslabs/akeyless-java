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
 * UscUpdateSecretOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UscUpdateSecretOutput {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SECRET_ID = "secret_id";
  @SerializedName(SERIALIZED_NAME_SECRET_ID)
  private String secretId;

  public static final String SERIALIZED_NAME_VERSION_ID = "version_id";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private String versionId;

  public UscUpdateSecretOutput() { 
  }

  public UscUpdateSecretOutput name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UscUpdateSecretOutput secretId(String secretId) {
    
    this.secretId = secretId;
    return this;
  }

   /**
   * Get secretId
   * @return secretId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecretId() {
    return secretId;
  }


  public void setSecretId(String secretId) {
    this.secretId = secretId;
  }


  public UscUpdateSecretOutput versionId(String versionId) {
    
    this.versionId = versionId;
    return this;
  }

   /**
   * Get versionId
   * @return versionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionId() {
    return versionId;
  }


  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UscUpdateSecretOutput uscUpdateSecretOutput = (UscUpdateSecretOutput) o;
    return Objects.equals(this.name, uscUpdateSecretOutput.name) &&
        Objects.equals(this.secretId, uscUpdateSecretOutput.secretId) &&
        Objects.equals(this.versionId, uscUpdateSecretOutput.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, secretId, versionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UscUpdateSecretOutput {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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

