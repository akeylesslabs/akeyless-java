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
 * UploadPKCS12
 */

public class UploadPKCS12 {
  public static final String SERIALIZED_NAME_CUSTOMER_FRG_ID = "customer-frg-id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_FRG_ID)
  private String customerFrgId;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IN = "in";
  @SerializedName(SERIALIZED_NAME_IN)
  private String in;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSPHRASE = "passphrase";
  @SerializedName(SERIALIZED_NAME_PASSPHRASE)
  private String passphrase;

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


  public UploadPKCS12 customerFrgId(String customerFrgId) {
    
    this.customerFrgId = customerFrgId;
    return this;
  }

   /**
   * The customer fragment ID that will be used to split the key (if empty, the key will be created independently of a customer fragment)
   * @return customerFrgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer fragment ID that will be used to split the key (if empty, the key will be created independently of a customer fragment)")

  public String getCustomerFrgId() {
    return customerFrgId;
  }


  public void setCustomerFrgId(String customerFrgId) {
    this.customerFrgId = customerFrgId;
  }


  public UploadPKCS12 deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this item [true/false]
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this item [true/false]")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public UploadPKCS12 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the object
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the object")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UploadPKCS12 in(String in) {
    
    this.in = in;
    return this;
  }

   /**
   * PKCS#12 input file (private key and certificate only)
   * @return in
  **/
  @ApiModelProperty(required = true, value = "PKCS#12 input file (private key and certificate only)")

  public String getIn() {
    return in;
  }


  public void setIn(String in) {
    this.in = in;
  }


  public UploadPKCS12 json(Boolean json) {
    
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


  public UploadPKCS12 metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Deprecated - use description
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - use description")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public UploadPKCS12 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of key to be created
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of key to be created")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UploadPKCS12 passphrase(String passphrase) {
    
    this.passphrase = passphrase;
    return this;
  }

   /**
   * Passphrase to unlock the pkcs#12 bundle
   * @return passphrase
  **/
  @ApiModelProperty(required = true, value = "Passphrase to unlock the pkcs#12 bundle")

  public String getPassphrase() {
    return passphrase;
  }


  public void setPassphrase(String passphrase) {
    this.passphrase = passphrase;
  }


  public UploadPKCS12 splitLevel(Long splitLevel) {
    
    this.splitLevel = splitLevel;
    return this;
  }

   /**
   * The number of fragments that the item will be split into
   * @return splitLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of fragments that the item will be split into")

  public Long getSplitLevel() {
    return splitLevel;
  }


  public void setSplitLevel(Long splitLevel) {
    this.splitLevel = splitLevel;
  }


  public UploadPKCS12 tag(List<String> tag) {
    
    this.tag = tag;
    return this;
  }

  public UploadPKCS12 addTagItem(String tagItem) {
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


  public UploadPKCS12 token(String token) {
    
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


  public UploadPKCS12 uidToken(String uidToken) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadPKCS12 uploadPKCS12 = (UploadPKCS12) o;
    return Objects.equals(this.customerFrgId, uploadPKCS12.customerFrgId) &&
        Objects.equals(this.deleteProtection, uploadPKCS12.deleteProtection) &&
        Objects.equals(this.description, uploadPKCS12.description) &&
        Objects.equals(this.in, uploadPKCS12.in) &&
        Objects.equals(this.json, uploadPKCS12.json) &&
        Objects.equals(this.metadata, uploadPKCS12.metadata) &&
        Objects.equals(this.name, uploadPKCS12.name) &&
        Objects.equals(this.passphrase, uploadPKCS12.passphrase) &&
        Objects.equals(this.splitLevel, uploadPKCS12.splitLevel) &&
        Objects.equals(this.tag, uploadPKCS12.tag) &&
        Objects.equals(this.token, uploadPKCS12.token) &&
        Objects.equals(this.uidToken, uploadPKCS12.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerFrgId, deleteProtection, description, in, json, metadata, name, passphrase, splitLevel, tag, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadPKCS12 {\n");
    sb.append("    customerFrgId: ").append(toIndentedString(customerFrgId)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
    sb.append("    splitLevel: ").append(toIndentedString(splitLevel)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

