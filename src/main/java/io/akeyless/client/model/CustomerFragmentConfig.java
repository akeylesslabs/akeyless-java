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
 * CustomerFragmentConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomerFragmentConfig {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FRAGMENT_TYPE = "fragment_type";
  @SerializedName(SERIALIZED_NAME_FRAGMENT_TYPE)
  private String fragmentType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEY_LABEL = "key_label";
  @SerializedName(SERIALIZED_NAME_KEY_LABEL)
  private String keyLabel;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public CustomerFragmentConfig() { 
  }

  public CustomerFragmentConfig description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CustomerFragmentConfig fragmentType(String fragmentType) {
    
    this.fragmentType = fragmentType;
    return this;
  }

   /**
   * Get fragmentType
   * @return fragmentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFragmentType() {
    return fragmentType;
  }


  public void setFragmentType(String fragmentType) {
    this.fragmentType = fragmentType;
  }


  public CustomerFragmentConfig id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CustomerFragmentConfig keyLabel(String keyLabel) {
    
    this.keyLabel = keyLabel;
    return this;
  }

   /**
   * Get keyLabel
   * @return keyLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyLabel() {
    return keyLabel;
  }


  public void setKeyLabel(String keyLabel) {
    this.keyLabel = keyLabel;
  }


  public CustomerFragmentConfig name(String name) {
    
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


  public CustomerFragmentConfig value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerFragmentConfig customerFragmentConfig = (CustomerFragmentConfig) o;
    return Objects.equals(this.description, customerFragmentConfig.description) &&
        Objects.equals(this.fragmentType, customerFragmentConfig.fragmentType) &&
        Objects.equals(this.id, customerFragmentConfig.id) &&
        Objects.equals(this.keyLabel, customerFragmentConfig.keyLabel) &&
        Objects.equals(this.name, customerFragmentConfig.name) &&
        Objects.equals(this.value, customerFragmentConfig.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, fragmentType, id, keyLabel, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerFragmentConfig {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fragmentType: ").append(toIndentedString(fragmentType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyLabel: ").append(toIndentedString(keyLabel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
