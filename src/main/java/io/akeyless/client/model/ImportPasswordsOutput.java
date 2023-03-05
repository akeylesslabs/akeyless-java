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
 * ImportPasswordsOutput
 */

public class ImportPasswordsOutput {
  public static final String SERIALIZED_NAME_IMPORTED = "imported";
  @SerializedName(SERIALIZED_NAME_IMPORTED)
  private Integer imported;

  public static final String SERIALIZED_NAME_PASSWORDS_IN_FILE = "passwords_in_file";
  @SerializedName(SERIALIZED_NAME_PASSWORDS_IN_FILE)
  private Long passwordsInFile;

  public static final String SERIALIZED_NAME_SUCCESSFULLY_PARSED = "successfully_parsed";
  @SerializedName(SERIALIZED_NAME_SUCCESSFULLY_PARSED)
  private Long successfullyParsed;


  public ImportPasswordsOutput imported(Integer imported) {
    
    this.imported = imported;
    return this;
  }

   /**
   * Get imported
   * @return imported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getImported() {
    return imported;
  }


  public void setImported(Integer imported) {
    this.imported = imported;
  }


  public ImportPasswordsOutput passwordsInFile(Long passwordsInFile) {
    
    this.passwordsInFile = passwordsInFile;
    return this;
  }

   /**
   * Get passwordsInFile
   * @return passwordsInFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPasswordsInFile() {
    return passwordsInFile;
  }


  public void setPasswordsInFile(Long passwordsInFile) {
    this.passwordsInFile = passwordsInFile;
  }


  public ImportPasswordsOutput successfullyParsed(Long successfullyParsed) {
    
    this.successfullyParsed = successfullyParsed;
    return this;
  }

   /**
   * Get successfullyParsed
   * @return successfullyParsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSuccessfullyParsed() {
    return successfullyParsed;
  }


  public void setSuccessfullyParsed(Long successfullyParsed) {
    this.successfullyParsed = successfullyParsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportPasswordsOutput importPasswordsOutput = (ImportPasswordsOutput) o;
    return Objects.equals(this.imported, importPasswordsOutput.imported) &&
        Objects.equals(this.passwordsInFile, importPasswordsOutput.passwordsInFile) &&
        Objects.equals(this.successfullyParsed, importPasswordsOutput.successfullyParsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imported, passwordsInFile, successfullyParsed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportPasswordsOutput {\n");
    sb.append("    imported: ").append(toIndentedString(imported)).append("\n");
    sb.append("    passwordsInFile: ").append(toIndentedString(passwordsInFile)).append("\n");
    sb.append("    successfullyParsed: ").append(toIndentedString(successfullyParsed)).append("\n");
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
