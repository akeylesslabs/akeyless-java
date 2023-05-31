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
 * SignDataWithClassicKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SignDataWithClassicKey {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  private String displayId;

  public static final String SERIALIZED_NAME_HASHED = "hashed";
  @SerializedName(SERIALIZED_NAME_HASHED)
  private Boolean hashed = false;

  public static final String SERIALIZED_NAME_HASHING_METHOD = "hashing-method";
  @SerializedName(SERIALIZED_NAME_HASHING_METHOD)
  private String hashingMethod = "SHA256";

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public SignDataWithClassicKey() { 
  }

  public SignDataWithClassicKey data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Data")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public SignDataWithClassicKey displayId(String displayId) {
    
    this.displayId = displayId;
    return this;
  }

   /**
   * The name of the key to use in the sign data process
   * @return displayId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the key to use in the sign data process")

  public String getDisplayId() {
    return displayId;
  }


  public void setDisplayId(String displayId) {
    this.displayId = displayId;
  }


  public SignDataWithClassicKey hashed(Boolean hashed) {
    
    this.hashed = hashed;
    return this;
  }

   /**
   * Defines whether the data should be hashed as part of the signing. If true, the data will not be hashed
   * @return hashed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines whether the data should be hashed as part of the signing. If true, the data will not be hashed")

  public Boolean getHashed() {
    return hashed;
  }


  public void setHashed(Boolean hashed) {
    this.hashed = hashed;
  }


  public SignDataWithClassicKey hashingMethod(String hashingMethod) {
    
    this.hashingMethod = hashingMethod;
    return this;
  }

   /**
   * HashingMethod
   * @return hashingMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HashingMethod")

  public String getHashingMethod() {
    return hashingMethod;
  }


  public void setHashingMethod(String hashingMethod) {
    this.hashingMethod = hashingMethod;
  }


  public SignDataWithClassicKey json(Boolean json) {
    
    this.json = json;
    return this;
  }

   /**
   * Set output format to JSON
   * @return json
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set output format to JSON")

  public Boolean getJson() {
    return json;
  }


  public void setJson(Boolean json) {
    this.json = json;
  }


  public SignDataWithClassicKey name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * ClassicKey name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ClassicKey name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SignDataWithClassicKey token(String token) {
    
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


  public SignDataWithClassicKey uidToken(String uidToken) {
    
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


  public SignDataWithClassicKey version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * classic key version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "classic key version")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignDataWithClassicKey signDataWithClassicKey = (SignDataWithClassicKey) o;
    return Objects.equals(this.data, signDataWithClassicKey.data) &&
        Objects.equals(this.displayId, signDataWithClassicKey.displayId) &&
        Objects.equals(this.hashed, signDataWithClassicKey.hashed) &&
        Objects.equals(this.hashingMethod, signDataWithClassicKey.hashingMethod) &&
        Objects.equals(this.json, signDataWithClassicKey.json) &&
        Objects.equals(this.name, signDataWithClassicKey.name) &&
        Objects.equals(this.token, signDataWithClassicKey.token) &&
        Objects.equals(this.uidToken, signDataWithClassicKey.uidToken) &&
        Objects.equals(this.version, signDataWithClassicKey.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, displayId, hashed, hashingMethod, json, name, token, uidToken, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignDataWithClassicKey {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    hashed: ").append(toIndentedString(hashed)).append("\n");
    sb.append("    hashingMethod: ").append(toIndentedString(hashingMethod)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

