/*
 * Akeyless API
 * The purpose of this application is to provide access to Akeyless API.
 *
 * The version of the OpenAPI document: 3.0
 * Contact: support@akeyless.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.akeyless.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.akeyless.client.JSON;

/**
 * createTokenizer is a command that creates a tokenizer item
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreateTokenizer {
  public static final String SERIALIZED_NAME_ALPHABET = "alphabet";
  @SerializedName(SERIALIZED_NAME_ALPHABET)
  @javax.annotation.Nullable
  private String alphabet;

  public static final String SERIALIZED_NAME_DECODING_TEMPLATE = "decoding-template";
  @SerializedName(SERIALIZED_NAME_DECODING_TEMPLATE)
  @javax.annotation.Nullable
  private String decodingTemplate;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_ENCODING_TEMPLATE = "encoding-template";
  @SerializedName(SERIALIZED_NAME_ENCODING_TEMPLATE)
  @javax.annotation.Nullable
  private String encodingTemplate;

  public static final String SERIALIZED_NAME_ENCRYPTION_KEY_NAME = "encryption-key-name";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_KEY_NAME)
  @javax.annotation.Nullable
  private String encryptionKeyName;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nullable
  private String metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  @javax.annotation.Nullable
  private String pattern;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  @javax.annotation.Nullable
  private List<String> tag = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEMPLATE_TYPE = "template-type";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TYPE)
  @javax.annotation.Nonnull
  private String templateType;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_TOKENIZER_TYPE = "tokenizer-type";
  @SerializedName(SERIALIZED_NAME_TOKENIZER_TYPE)
  @javax.annotation.Nonnull
  private String tokenizerType = "vaultless";

  public static final String SERIALIZED_NAME_TWEAK_TYPE = "tweak-type";
  @SerializedName(SERIALIZED_NAME_TWEAK_TYPE)
  @javax.annotation.Nullable
  private String tweakType;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public CreateTokenizer() {
  }

  public CreateTokenizer alphabet(@javax.annotation.Nullable String alphabet) {
    this.alphabet = alphabet;
    return this;
  }

  /**
   * Alphabet to use in regexp vaultless tokenization
   * @return alphabet
   */
  @javax.annotation.Nullable
  public String getAlphabet() {
    return alphabet;
  }

  public void setAlphabet(@javax.annotation.Nullable String alphabet) {
    this.alphabet = alphabet;
  }


  public CreateTokenizer decodingTemplate(@javax.annotation.Nullable String decodingTemplate) {
    this.decodingTemplate = decodingTemplate;
    return this;
  }

  /**
   * The Decoding output template to use in regexp vaultless tokenization
   * @return decodingTemplate
   */
  @javax.annotation.Nullable
  public String getDecodingTemplate() {
    return decodingTemplate;
  }

  public void setDecodingTemplate(@javax.annotation.Nullable String decodingTemplate) {
    this.decodingTemplate = decodingTemplate;
  }


  public CreateTokenizer deleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
    return this;
  }

  /**
   * Protection from accidental deletion of this object [true/false]
   * @return deleteProtection
   */
  @javax.annotation.Nullable
  public String getDeleteProtection() {
    return deleteProtection;
  }

  public void setDeleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public CreateTokenizer description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the object
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public CreateTokenizer encodingTemplate(@javax.annotation.Nullable String encodingTemplate) {
    this.encodingTemplate = encodingTemplate;
    return this;
  }

  /**
   * The Encoding output template to use in regexp vaultless tokenization
   * @return encodingTemplate
   */
  @javax.annotation.Nullable
  public String getEncodingTemplate() {
    return encodingTemplate;
  }

  public void setEncodingTemplate(@javax.annotation.Nullable String encodingTemplate) {
    this.encodingTemplate = encodingTemplate;
  }


  public CreateTokenizer encryptionKeyName(@javax.annotation.Nullable String encryptionKeyName) {
    this.encryptionKeyName = encryptionKeyName;
    return this;
  }

  /**
   * AES key name to use in vaultless tokenization
   * @return encryptionKeyName
   */
  @javax.annotation.Nullable
  public String getEncryptionKeyName() {
    return encryptionKeyName;
  }

  public void setEncryptionKeyName(@javax.annotation.Nullable String encryptionKeyName) {
    this.encryptionKeyName = encryptionKeyName;
  }


  public CreateTokenizer json(@javax.annotation.Nullable Boolean json) {
    this.json = json;
    return this;
  }

  /**
   * Set output format to JSON
   * @return json
   */
  @javax.annotation.Nullable
  public Boolean getJson() {
    return json;
  }

  public void setJson(@javax.annotation.Nullable Boolean json) {
    this.json = json;
  }


  public CreateTokenizer metadata(@javax.annotation.Nullable String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Deprecated - use description
   * @return metadata
   */
  @javax.annotation.Nullable
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nullable String metadata) {
    this.metadata = metadata;
  }


  public CreateTokenizer name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Tokenizer name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public CreateTokenizer pattern(@javax.annotation.Nullable String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * Pattern to use in regexp vaultless tokenization
   * @return pattern
   */
  @javax.annotation.Nullable
  public String getPattern() {
    return pattern;
  }

  public void setPattern(@javax.annotation.Nullable String pattern) {
    this.pattern = pattern;
  }


  public CreateTokenizer tag(@javax.annotation.Nullable List<String> tag) {
    this.tag = tag;
    return this;
  }

  public CreateTokenizer addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<>();
    }
    this.tag.add(tagItem);
    return this;
  }

  /**
   * List of the tags attached to this key
   * @return tag
   */
  @javax.annotation.Nullable
  public List<String> getTag() {
    return tag;
  }

  public void setTag(@javax.annotation.Nullable List<String> tag) {
    this.tag = tag;
  }


  public CreateTokenizer templateType(@javax.annotation.Nonnull String templateType) {
    this.templateType = templateType;
    return this;
  }

  /**
   * Which template type this tokenizer is used for [SSN,CreditCard,USPhoneNumber,Email,Regexp]
   * @return templateType
   */
  @javax.annotation.Nonnull
  public String getTemplateType() {
    return templateType;
  }

  public void setTemplateType(@javax.annotation.Nonnull String templateType) {
    this.templateType = templateType;
  }


  public CreateTokenizer token(@javax.annotation.Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
   */
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = token;
  }


  public CreateTokenizer tokenizerType(@javax.annotation.Nonnull String tokenizerType) {
    this.tokenizerType = tokenizerType;
    return this;
  }

  /**
   * Tokenizer type
   * @return tokenizerType
   */
  @javax.annotation.Nonnull
  public String getTokenizerType() {
    return tokenizerType;
  }

  public void setTokenizerType(@javax.annotation.Nonnull String tokenizerType) {
    this.tokenizerType = tokenizerType;
  }


  public CreateTokenizer tweakType(@javax.annotation.Nullable String tweakType) {
    this.tweakType = tweakType;
    return this;
  }

  /**
   * The tweak type to use in vaultless tokenization [Supplied, Generated, Internal, Masking]
   * @return tweakType
   */
  @javax.annotation.Nullable
  public String getTweakType() {
    return tweakType;
  }

  public void setTweakType(@javax.annotation.Nullable String tweakType) {
    this.tweakType = tweakType;
  }


  public CreateTokenizer uidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
    return this;
  }

  /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
   */
  @javax.annotation.Nullable
  public String getUidToken() {
    return uidToken;
  }

  public void setUidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTokenizer createTokenizer = (CreateTokenizer) o;
    return Objects.equals(this.alphabet, createTokenizer.alphabet) &&
        Objects.equals(this.decodingTemplate, createTokenizer.decodingTemplate) &&
        Objects.equals(this.deleteProtection, createTokenizer.deleteProtection) &&
        Objects.equals(this.description, createTokenizer.description) &&
        Objects.equals(this.encodingTemplate, createTokenizer.encodingTemplate) &&
        Objects.equals(this.encryptionKeyName, createTokenizer.encryptionKeyName) &&
        Objects.equals(this.json, createTokenizer.json) &&
        Objects.equals(this.metadata, createTokenizer.metadata) &&
        Objects.equals(this.name, createTokenizer.name) &&
        Objects.equals(this.pattern, createTokenizer.pattern) &&
        Objects.equals(this.tag, createTokenizer.tag) &&
        Objects.equals(this.templateType, createTokenizer.templateType) &&
        Objects.equals(this.token, createTokenizer.token) &&
        Objects.equals(this.tokenizerType, createTokenizer.tokenizerType) &&
        Objects.equals(this.tweakType, createTokenizer.tweakType) &&
        Objects.equals(this.uidToken, createTokenizer.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alphabet, decodingTemplate, deleteProtection, description, encodingTemplate, encryptionKeyName, json, metadata, name, pattern, tag, templateType, token, tokenizerType, tweakType, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTokenizer {\n");
    sb.append("    alphabet: ").append(toIndentedString(alphabet)).append("\n");
    sb.append("    decodingTemplate: ").append(toIndentedString(decodingTemplate)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    encodingTemplate: ").append(toIndentedString(encodingTemplate)).append("\n");
    sb.append("    encryptionKeyName: ").append(toIndentedString(encryptionKeyName)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("alphabet");
    openapiFields.add("decoding-template");
    openapiFields.add("delete_protection");
    openapiFields.add("description");
    openapiFields.add("encoding-template");
    openapiFields.add("encryption-key-name");
    openapiFields.add("json");
    openapiFields.add("metadata");
    openapiFields.add("name");
    openapiFields.add("pattern");
    openapiFields.add("tag");
    openapiFields.add("template-type");
    openapiFields.add("token");
    openapiFields.add("tokenizer-type");
    openapiFields.add("tweak-type");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("template-type");
    openapiRequiredFields.add("tokenizer-type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateTokenizer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTokenizer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTokenizer is not found in the empty JSON string", CreateTokenizer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTokenizer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTokenizer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTokenizer.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("alphabet") != null && !jsonObj.get("alphabet").isJsonNull()) && !jsonObj.get("alphabet").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alphabet` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alphabet").toString()));
      }
      if ((jsonObj.get("decoding-template") != null && !jsonObj.get("decoding-template").isJsonNull()) && !jsonObj.get("decoding-template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `decoding-template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("decoding-template").toString()));
      }
      if ((jsonObj.get("delete_protection") != null && !jsonObj.get("delete_protection").isJsonNull()) && !jsonObj.get("delete_protection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_protection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete_protection").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("encoding-template") != null && !jsonObj.get("encoding-template").isJsonNull()) && !jsonObj.get("encoding-template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encoding-template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encoding-template").toString()));
      }
      if ((jsonObj.get("encryption-key-name") != null && !jsonObj.get("encryption-key-name").isJsonNull()) && !jsonObj.get("encryption-key-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encryption-key-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encryption-key-name").toString()));
      }
      if ((jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) && !jsonObj.get("metadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("pattern") != null && !jsonObj.get("pattern").isJsonNull()) && !jsonObj.get("pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pattern").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull() && !jsonObj.get("tag").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be an array in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if (!jsonObj.get("template-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template-type").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if (!jsonObj.get("tokenizer-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenizer-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenizer-type").toString()));
      }
      if ((jsonObj.get("tweak-type") != null && !jsonObj.get("tweak-type").isJsonNull()) && !jsonObj.get("tweak-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tweak-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tweak-type").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTokenizer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTokenizer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTokenizer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTokenizer.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTokenizer>() {
           @Override
           public void write(JsonWriter out, CreateTokenizer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTokenizer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateTokenizer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTokenizer
   * @throws IOException if the JSON string is invalid with respect to CreateTokenizer
   */
  public static CreateTokenizer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTokenizer.class);
  }

  /**
   * Convert an instance of CreateTokenizer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

