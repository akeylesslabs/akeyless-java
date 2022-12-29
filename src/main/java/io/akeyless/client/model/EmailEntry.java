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
 * EmailEntry
 */

public class EmailEntry {
  public static final String SERIALIZED_NAME_TO_EMAIL = "to_email";
  @SerializedName(SERIALIZED_NAME_TO_EMAIL)
  private String toEmail;

  public static final String SERIALIZED_NAME_TO_NAME = "to_name";
  @SerializedName(SERIALIZED_NAME_TO_NAME)
  private String toName;


  public EmailEntry toEmail(String toEmail) {
    
    this.toEmail = toEmail;
    return this;
  }

   /**
   * Get toEmail
   * @return toEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getToEmail() {
    return toEmail;
  }


  public void setToEmail(String toEmail) {
    this.toEmail = toEmail;
  }


  public EmailEntry toName(String toName) {
    
    this.toName = toName;
    return this;
  }

   /**
   * Get toName
   * @return toName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getToName() {
    return toName;
  }


  public void setToName(String toName) {
    this.toName = toName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailEntry emailEntry = (EmailEntry) o;
    return Objects.equals(this.toEmail, emailEntry.toEmail) &&
        Objects.equals(this.toName, emailEntry.toName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toEmail, toName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailEntry {\n");
    sb.append("    toEmail: ").append(toIndentedString(toEmail)).append("\n");
    sb.append("    toName: ").append(toIndentedString(toName)).append("\n");
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

