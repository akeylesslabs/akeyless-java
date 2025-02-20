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
 * UploadPKCS12
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class UploadPKCS12 {
  public static final String SERIALIZED_NAME_CUSTOMER_FRG_ID = "customer-frg-id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_FRG_ID)
  @javax.annotation.Nullable
  private String customerFrgId;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_IN = "in";
  @SerializedName(SERIALIZED_NAME_IN)
  @javax.annotation.Nonnull
  private String in;

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

  public static final String SERIALIZED_NAME_PASSPHRASE = "passphrase";
  @SerializedName(SERIALIZED_NAME_PASSPHRASE)
  @javax.annotation.Nonnull
  private String passphrase;

  public static final String SERIALIZED_NAME_SPLIT_LEVEL = "split-level";
  @SerializedName(SERIALIZED_NAME_SPLIT_LEVEL)
  @javax.annotation.Nullable
  private Long splitLevel = 3l;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  @javax.annotation.Nullable
  private List<String> tag = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public UploadPKCS12() {
  }

  public UploadPKCS12 customerFrgId(@javax.annotation.Nullable String customerFrgId) {
    this.customerFrgId = customerFrgId;
    return this;
  }

  /**
   * The customer fragment ID that will be used to split the key (if empty, the key will be created independently of a customer fragment)
   * @return customerFrgId
   */
  @javax.annotation.Nullable
  public String getCustomerFrgId() {
    return customerFrgId;
  }

  public void setCustomerFrgId(@javax.annotation.Nullable String customerFrgId) {
    this.customerFrgId = customerFrgId;
  }


  public UploadPKCS12 deleteProtection(@javax.annotation.Nullable String deleteProtection) {
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


  public UploadPKCS12 description(@javax.annotation.Nullable String description) {
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


  public UploadPKCS12 in(@javax.annotation.Nonnull String in) {
    this.in = in;
    return this;
  }

  /**
   * PKCS#12 input file (private key and certificate only)
   * @return in
   */
  @javax.annotation.Nonnull
  public String getIn() {
    return in;
  }

  public void setIn(@javax.annotation.Nonnull String in) {
    this.in = in;
  }


  public UploadPKCS12 json(@javax.annotation.Nullable Boolean json) {
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


  public UploadPKCS12 metadata(@javax.annotation.Nullable String metadata) {
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


  public UploadPKCS12 name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of key to be created
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public UploadPKCS12 passphrase(@javax.annotation.Nonnull String passphrase) {
    this.passphrase = passphrase;
    return this;
  }

  /**
   * Passphrase to unlock the pkcs#12 bundle
   * @return passphrase
   */
  @javax.annotation.Nonnull
  public String getPassphrase() {
    return passphrase;
  }

  public void setPassphrase(@javax.annotation.Nonnull String passphrase) {
    this.passphrase = passphrase;
  }


  public UploadPKCS12 splitLevel(@javax.annotation.Nullable Long splitLevel) {
    this.splitLevel = splitLevel;
    return this;
  }

  /**
   * The number of fragments that the item will be split into
   * @return splitLevel
   */
  @javax.annotation.Nullable
  public Long getSplitLevel() {
    return splitLevel;
  }

  public void setSplitLevel(@javax.annotation.Nullable Long splitLevel) {
    this.splitLevel = splitLevel;
  }


  public UploadPKCS12 tag(@javax.annotation.Nullable List<String> tag) {
    this.tag = tag;
    return this;
  }

  public UploadPKCS12 addTagItem(String tagItem) {
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


  public UploadPKCS12 token(@javax.annotation.Nullable String token) {
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


  public UploadPKCS12 uidToken(@javax.annotation.Nullable String uidToken) {
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
    openapiFields.add("customer-frg-id");
    openapiFields.add("delete_protection");
    openapiFields.add("description");
    openapiFields.add("in");
    openapiFields.add("json");
    openapiFields.add("metadata");
    openapiFields.add("name");
    openapiFields.add("passphrase");
    openapiFields.add("split-level");
    openapiFields.add("tag");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("in");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("passphrase");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UploadPKCS12
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UploadPKCS12.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadPKCS12 is not found in the empty JSON string", UploadPKCS12.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UploadPKCS12.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UploadPKCS12` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UploadPKCS12.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customer-frg-id") != null && !jsonObj.get("customer-frg-id").isJsonNull()) && !jsonObj.get("customer-frg-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer-frg-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer-frg-id").toString()));
      }
      if ((jsonObj.get("delete_protection") != null && !jsonObj.get("delete_protection").isJsonNull()) && !jsonObj.get("delete_protection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_protection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete_protection").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("in").toString()));
      }
      if ((jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) && !jsonObj.get("metadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("passphrase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passphrase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passphrase").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull() && !jsonObj.get("tag").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be an array in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadPKCS12.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadPKCS12' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadPKCS12> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadPKCS12.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadPKCS12>() {
           @Override
           public void write(JsonWriter out, UploadPKCS12 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UploadPKCS12 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UploadPKCS12 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UploadPKCS12
   * @throws IOException if the JSON string is invalid with respect to UploadPKCS12
   */
  public static UploadPKCS12 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadPKCS12.class);
  }

  /**
   * Convert an instance of UploadPKCS12 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

