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
 * createKey is a command that creates a new key. [Deprecated: Use command create-dfc-key]
 */
@ApiModel(description = "createKey is a command that creates a new key. [Deprecated: Use command create-dfc-key]")

public class CreateKey {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  private String alg;

  public static final String SERIALIZED_NAME_CUSTOMER_FRG_ID = "customer-frg-id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_FRG_ID)
  private String customerFrgId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_SPLIT_LEVEL = "split-level";
  @SerializedName(SERIALIZED_NAME_SPLIT_LEVEL)
  private Long splitLevel = 2l;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private List<String> tag = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public CreateKey alg(String alg) {
    
    this.alg = alg;
    return this;
  }

   /**
   * Key type; options: [AES128GCM, AES256GCM, AES128SIV, AES256SIV, RSA1024, RSA2048, RSA3072, RSA4096]
   * @return alg
  **/
  @ApiModelProperty(required = true, value = "Key type; options: [AES128GCM, AES256GCM, AES128SIV, AES256SIV, RSA1024, RSA2048, RSA3072, RSA4096]")

  public String getAlg() {
    return alg;
  }


  public void setAlg(String alg) {
    this.alg = alg;
  }


  public CreateKey customerFrgId(String customerFrgId) {
    
    this.customerFrgId = customerFrgId;
    return this;
  }

   /**
   * The customer fragment ID that will be used to create the key (if empty, the key will be created independently of a customer fragment)
   * @return customerFrgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer fragment ID that will be used to create the key (if empty, the key will be created independently of a customer fragment)")

  public String getCustomerFrgId() {
    return customerFrgId;
  }


  public void setCustomerFrgId(String customerFrgId) {
    this.customerFrgId = customerFrgId;
  }


  public CreateKey metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Metadata about the key
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata about the key")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public CreateKey name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Key name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Key name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateKey password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public CreateKey splitLevel(Long splitLevel) {
    
    this.splitLevel = splitLevel;
    return this;
  }

   /**
   * The number of fragments that the item will be split into (not includes customer fragment)
   * @return splitLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of fragments that the item will be split into (not includes customer fragment)")

  public Long getSplitLevel() {
    return splitLevel;
  }


  public void setSplitLevel(Long splitLevel) {
    this.splitLevel = splitLevel;
  }


  public CreateKey tag(List<String> tag) {
    
    this.tag = tag;
    return this;
  }

  public CreateKey addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<String>();
    }
    this.tag.add(tagItem);
    return this;
  }

   /**
   * List of the tags attached to this key
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the tags attached to this key")

  public List<String> getTag() {
    return tag;
  }


  public void setTag(List<String> tag) {
    this.tag = tag;
  }


  public CreateKey token(String token) {
    
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


  public CreateKey uidToken(String uidToken) {
    
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


  public CreateKey username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateKey createKey = (CreateKey) o;
    return Objects.equals(this.alg, createKey.alg) &&
        Objects.equals(this.customerFrgId, createKey.customerFrgId) &&
        Objects.equals(this.metadata, createKey.metadata) &&
        Objects.equals(this.name, createKey.name) &&
        Objects.equals(this.password, createKey.password) &&
        Objects.equals(this.splitLevel, createKey.splitLevel) &&
        Objects.equals(this.tag, createKey.tag) &&
        Objects.equals(this.token, createKey.token) &&
        Objects.equals(this.uidToken, createKey.uidToken) &&
        Objects.equals(this.username, createKey.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, customerFrgId, metadata, name, password, splitLevel, tag, token, uidToken, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateKey {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    customerFrgId: ").append(toIndentedString(customerFrgId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    splitLevel: ").append(toIndentedString(splitLevel)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

