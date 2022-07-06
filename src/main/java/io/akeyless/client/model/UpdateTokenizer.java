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
 * updateTokenizer is a command that updates a tokenizer item
 */
@ApiModel(description = "updateTokenizer is a command that updates a tokenizer item")

public class UpdateTokenizer {
  public static final String SERIALIZED_NAME_ADD_TAG = "add-tag";
  @SerializedName(SERIALIZED_NAME_ADD_TAG)
  private List<String> addTag = null;

  public static final String SERIALIZED_NAME_ALPHABET = "alphabet";
  @SerializedName(SERIALIZED_NAME_ALPHABET)
  private String alphabet;

  public static final String SERIALIZED_NAME_DECODING_TEMPLATE = "decoding-template";
  @SerializedName(SERIALIZED_NAME_DECODING_TEMPLATE)
  private String decodingTemplate;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_ENCODING_TEMPLATE = "encoding-template";
  @SerializedName(SERIALIZED_NAME_ENCODING_TEMPLATE)
  private String encodingTemplate;

  public static final String SERIALIZED_NAME_ENCRYPTION_KEY_NAME = "encryption-key-name";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_KEY_NAME)
  private String encryptionKeyName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_METADATA = "new-metadata";
  @SerializedName(SERIALIZED_NAME_NEW_METADATA)
  private String newMetadata = "default_metadata";

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  private String pattern;

  public static final String SERIALIZED_NAME_RM_TAG = "rm-tag";
  @SerializedName(SERIALIZED_NAME_RM_TAG)
  private List<String> rmTag = null;

  public static final String SERIALIZED_NAME_TEMPLATE_TYPE = "template-type";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TYPE)
  private String templateType;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TOKENIZER_TYPE = "tokenizer-type";
  @SerializedName(SERIALIZED_NAME_TOKENIZER_TYPE)
  private String tokenizerType;

  public static final String SERIALIZED_NAME_TWEAK_TYPE = "tweak-type";
  @SerializedName(SERIALIZED_NAME_TWEAK_TYPE)
  private String tweakType;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public UpdateTokenizer addTag(List<String> addTag) {
    
    this.addTag = addTag;
    return this;
  }

  public UpdateTokenizer addAddTagItem(String addTagItem) {
    if (this.addTag == null) {
      this.addTag = new ArrayList<String>();
    }
    this.addTag.add(addTagItem);
    return this;
  }

   /**
   * List of the new tags that will be attached to this item
   * @return addTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the new tags that will be attached to this item")

  public List<String> getAddTag() {
    return addTag;
  }


  public void setAddTag(List<String> addTag) {
    this.addTag = addTag;
  }


  public UpdateTokenizer alphabet(String alphabet) {
    
    this.alphabet = alphabet;
    return this;
  }

   /**
   * Alphabet to use in regexp vaultless tokenization
   * @return alphabet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Alphabet to use in regexp vaultless tokenization")

  public String getAlphabet() {
    return alphabet;
  }


  public void setAlphabet(String alphabet) {
    this.alphabet = alphabet;
  }


  public UpdateTokenizer decodingTemplate(String decodingTemplate) {
    
    this.decodingTemplate = decodingTemplate;
    return this;
  }

   /**
   * The Decoding output template to use in regexp vaultless tokenization
   * @return decodingTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Decoding output template to use in regexp vaultless tokenization")

  public String getDecodingTemplate() {
    return decodingTemplate;
  }


  public void setDecodingTemplate(String decodingTemplate) {
    this.decodingTemplate = decodingTemplate;
  }


  public UpdateTokenizer deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Get deleteProtection
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public UpdateTokenizer encodingTemplate(String encodingTemplate) {
    
    this.encodingTemplate = encodingTemplate;
    return this;
  }

   /**
   * The Encoding output template to use in regexp vaultless tokenization
   * @return encodingTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Encoding output template to use in regexp vaultless tokenization")

  public String getEncodingTemplate() {
    return encodingTemplate;
  }


  public void setEncodingTemplate(String encodingTemplate) {
    this.encodingTemplate = encodingTemplate;
  }


  public UpdateTokenizer encryptionKeyName(String encryptionKeyName) {
    
    this.encryptionKeyName = encryptionKeyName;
    return this;
  }

   /**
   * AES key name to use in vaultless tokenization
   * @return encryptionKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AES key name to use in vaultless tokenization")

  public String getEncryptionKeyName() {
    return encryptionKeyName;
  }


  public void setEncryptionKeyName(String encryptionKeyName) {
    this.encryptionKeyName = encryptionKeyName;
  }


  public UpdateTokenizer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Current item name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Current item name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateTokenizer newMetadata(String newMetadata) {
    
    this.newMetadata = newMetadata;
    return this;
  }

   /**
   * New item metadata
   * @return newMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New item metadata")

  public String getNewMetadata() {
    return newMetadata;
  }


  public void setNewMetadata(String newMetadata) {
    this.newMetadata = newMetadata;
  }


  public UpdateTokenizer newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * New item name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New item name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public UpdateTokenizer pattern(String pattern) {
    
    this.pattern = pattern;
    return this;
  }

   /**
   * Pattern to use in regexp vaultless tokenization
   * @return pattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pattern to use in regexp vaultless tokenization")

  public String getPattern() {
    return pattern;
  }


  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public UpdateTokenizer rmTag(List<String> rmTag) {
    
    this.rmTag = rmTag;
    return this;
  }

  public UpdateTokenizer addRmTagItem(String rmTagItem) {
    if (this.rmTag == null) {
      this.rmTag = new ArrayList<String>();
    }
    this.rmTag.add(rmTagItem);
    return this;
  }

   /**
   * List of the existent tags that will be removed from this item
   * @return rmTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the existent tags that will be removed from this item")

  public List<String> getRmTag() {
    return rmTag;
  }


  public void setRmTag(List<String> rmTag) {
    this.rmTag = rmTag;
  }


  public UpdateTokenizer templateType(String templateType) {
    
    this.templateType = templateType;
    return this;
  }

   /**
   * Which template type this tokenizer is used for [SSN,CreditCard,USPhoneNumber,Email,Regexp]
   * @return templateType
  **/
  @ApiModelProperty(required = true, value = "Which template type this tokenizer is used for [SSN,CreditCard,USPhoneNumber,Email,Regexp]")

  public String getTemplateType() {
    return templateType;
  }


  public void setTemplateType(String templateType) {
    this.templateType = templateType;
  }


  public UpdateTokenizer token(String token) {
    
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


  public UpdateTokenizer tokenizerType(String tokenizerType) {
    
    this.tokenizerType = tokenizerType;
    return this;
  }

   /**
   * Tokenizer type
   * @return tokenizerType
  **/
  @ApiModelProperty(required = true, value = "Tokenizer type")

  public String getTokenizerType() {
    return tokenizerType;
  }


  public void setTokenizerType(String tokenizerType) {
    this.tokenizerType = tokenizerType;
  }


  public UpdateTokenizer tweakType(String tweakType) {
    
    this.tweakType = tweakType;
    return this;
  }

   /**
   * The tweak type to use in vaultless tokenization [Supplied, Generated, Internal, Masking]
   * @return tweakType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tweak type to use in vaultless tokenization [Supplied, Generated, Internal, Masking]")

  public String getTweakType() {
    return tweakType;
  }


  public void setTweakType(String tweakType) {
    this.tweakType = tweakType;
  }


  public UpdateTokenizer uidToken(String uidToken) {
    
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
    UpdateTokenizer updateTokenizer = (UpdateTokenizer) o;
    return Objects.equals(this.addTag, updateTokenizer.addTag) &&
        Objects.equals(this.alphabet, updateTokenizer.alphabet) &&
        Objects.equals(this.decodingTemplate, updateTokenizer.decodingTemplate) &&
        Objects.equals(this.deleteProtection, updateTokenizer.deleteProtection) &&
        Objects.equals(this.encodingTemplate, updateTokenizer.encodingTemplate) &&
        Objects.equals(this.encryptionKeyName, updateTokenizer.encryptionKeyName) &&
        Objects.equals(this.name, updateTokenizer.name) &&
        Objects.equals(this.newMetadata, updateTokenizer.newMetadata) &&
        Objects.equals(this.newName, updateTokenizer.newName) &&
        Objects.equals(this.pattern, updateTokenizer.pattern) &&
        Objects.equals(this.rmTag, updateTokenizer.rmTag) &&
        Objects.equals(this.templateType, updateTokenizer.templateType) &&
        Objects.equals(this.token, updateTokenizer.token) &&
        Objects.equals(this.tokenizerType, updateTokenizer.tokenizerType) &&
        Objects.equals(this.tweakType, updateTokenizer.tweakType) &&
        Objects.equals(this.uidToken, updateTokenizer.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addTag, alphabet, decodingTemplate, deleteProtection, encodingTemplate, encryptionKeyName, name, newMetadata, newName, pattern, rmTag, templateType, token, tokenizerType, tweakType, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTokenizer {\n");
    sb.append("    addTag: ").append(toIndentedString(addTag)).append("\n");
    sb.append("    alphabet: ").append(toIndentedString(alphabet)).append("\n");
    sb.append("    decodingTemplate: ").append(toIndentedString(decodingTemplate)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    encodingTemplate: ").append(toIndentedString(encodingTemplate)).append("\n");
    sb.append("    encryptionKeyName: ").append(toIndentedString(encryptionKeyName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newMetadata: ").append(toIndentedString(newMetadata)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    rmTag: ").append(toIndentedString(rmTag)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenizerType: ").append(toIndentedString(tokenizerType)).append("\n");
    sb.append("    tweakType: ").append(toIndentedString(tweakType)).append("\n");
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
