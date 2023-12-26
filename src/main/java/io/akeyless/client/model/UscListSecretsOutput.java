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
import io.akeyless.client.model.SecretInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UscListSecretsOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UscListSecretsOutput {
  public static final String SERIALIZED_NAME_SECRETS_LIST = "secrets_list";
  @SerializedName(SERIALIZED_NAME_SECRETS_LIST)
  private List<SecretInfo> secretsList = null;

  public UscListSecretsOutput() { 
  }

  public UscListSecretsOutput secretsList(List<SecretInfo> secretsList) {
    
    this.secretsList = secretsList;
    return this;
  }

  public UscListSecretsOutput addSecretsListItem(SecretInfo secretsListItem) {
    if (this.secretsList == null) {
      this.secretsList = new ArrayList<SecretInfo>();
    }
    this.secretsList.add(secretsListItem);
    return this;
  }

   /**
   * Get secretsList
   * @return secretsList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SecretInfo> getSecretsList() {
    return secretsList;
  }


  public void setSecretsList(List<SecretInfo> secretsList) {
    this.secretsList = secretsList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UscListSecretsOutput uscListSecretsOutput = (UscListSecretsOutput) o;
    return Objects.equals(this.secretsList, uscListSecretsOutput.secretsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UscListSecretsOutput {\n");
    sb.append("    secretsList: ").append(toIndentedString(secretsList)).append("\n");
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

