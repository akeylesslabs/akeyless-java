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
 * CreateClassicKey is a command that creates classic key
 */
@ApiModel(description = "CreateClassicKey is a command that creates classic key")

public class CreateClassicKey {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  private String alg;

  public static final String SERIALIZED_NAME_CERT_FILE_DATA = "cert-file-data";
  @SerializedName(SERIALIZED_NAME_CERT_FILE_DATA)
  private String certFileData;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GPG_ALG = "gpg-alg";
  @SerializedName(SERIALIZED_NAME_GPG_ALG)
  private String gpgAlg;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_KEY_DATA = "key-data";
  @SerializedName(SERIALIZED_NAME_KEY_DATA)
  private String keyData;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROTECTION_KEY_NAME = "protection-key-name";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY_NAME)
  private String protectionKeyName;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public CreateClassicKey alg(String alg) {
    
    this.alg = alg;
    return this;
  }

   /**
   * Classic Key type; options: [AES128GCM, AES256GCM, AES128SIV, AES256SIV, RSA1024, RSA2048, RSA3072, RSA4096, EC256, EC384, GPG]
   * @return alg
  **/
  @ApiModelProperty(required = true, value = "Classic Key type; options: [AES128GCM, AES256GCM, AES128SIV, AES256SIV, RSA1024, RSA2048, RSA3072, RSA4096, EC256, EC384, GPG]")

  public String getAlg() {
    return alg;
  }


  public void setAlg(String alg) {
    this.alg = alg;
  }


  public CreateClassicKey certFileData(String certFileData) {
    
    this.certFileData = certFileData;
    return this;
  }

   /**
   * Certificate in a PEM format.
   * @return certFileData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Certificate in a PEM format.")

  public String getCertFileData() {
    return certFileData;
  }


  public void setCertFileData(String certFileData) {
    this.certFileData = certFileData;
  }


  public CreateClassicKey deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this item
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this item")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public CreateClassicKey description(String description) {
    
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


  public CreateClassicKey gpgAlg(String gpgAlg) {
    
    this.gpgAlg = gpgAlg;
    return this;
  }

   /**
   * gpg alg: Relevant only if GPG key type selected; options: [RSA1024, RSA2048, RSA3072, RSA4096, Ed25519]
   * @return gpgAlg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "gpg alg: Relevant only if GPG key type selected; options: [RSA1024, RSA2048, RSA3072, RSA4096, Ed25519]")

  public String getGpgAlg() {
    return gpgAlg;
  }


  public void setGpgAlg(String gpgAlg) {
    this.gpgAlg = gpgAlg;
  }


  public CreateClassicKey json(Boolean json) {
    
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


  public CreateClassicKey keyData(String keyData) {
    
    this.keyData = keyData;
    return this;
  }

   /**
   * Base64-encoded classic key value
   * @return keyData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64-encoded classic key value")

  public String getKeyData() {
    return keyData;
  }


  public void setKeyData(String keyData) {
    this.keyData = keyData;
  }


  public CreateClassicKey metadata(String metadata) {
    
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


  public CreateClassicKey name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * ClassicKey name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "ClassicKey name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateClassicKey protectionKeyName(String protectionKeyName) {
    
    this.protectionKeyName = protectionKeyName;
    return this;
  }

   /**
   * The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used)
   * @return protectionKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a key that used to encrypt the secret value (if empty, the account default protectionKey key will be used)")

  public String getProtectionKeyName() {
    return protectionKeyName;
  }


  public void setProtectionKeyName(String protectionKeyName) {
    this.protectionKeyName = protectionKeyName;
  }


  public CreateClassicKey tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateClassicKey addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of the tags attached to this classic key
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the tags attached to this classic key")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public CreateClassicKey token(String token) {
    
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


  public CreateClassicKey uidToken(String uidToken) {
    
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
    CreateClassicKey createClassicKey = (CreateClassicKey) o;
    return Objects.equals(this.alg, createClassicKey.alg) &&
        Objects.equals(this.certFileData, createClassicKey.certFileData) &&
        Objects.equals(this.deleteProtection, createClassicKey.deleteProtection) &&
        Objects.equals(this.description, createClassicKey.description) &&
        Objects.equals(this.gpgAlg, createClassicKey.gpgAlg) &&
        Objects.equals(this.json, createClassicKey.json) &&
        Objects.equals(this.keyData, createClassicKey.keyData) &&
        Objects.equals(this.metadata, createClassicKey.metadata) &&
        Objects.equals(this.name, createClassicKey.name) &&
        Objects.equals(this.protectionKeyName, createClassicKey.protectionKeyName) &&
        Objects.equals(this.tags, createClassicKey.tags) &&
        Objects.equals(this.token, createClassicKey.token) &&
        Objects.equals(this.uidToken, createClassicKey.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, certFileData, deleteProtection, description, gpgAlg, json, keyData, metadata, name, protectionKeyName, tags, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClassicKey {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    certFileData: ").append(toIndentedString(certFileData)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gpgAlg: ").append(toIndentedString(gpgAlg)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keyData: ").append(toIndentedString(keyData)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protectionKeyName: ").append(toIndentedString(protectionKeyName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

