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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * TmpUserData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class TmpUserData {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access_id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  @javax.annotation.Nullable
  private String accessId;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_CUSTOM_TTL = "custom_ttl";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TTL)
  @javax.annotation.Nullable
  private Long customTtl;

  public static final String SERIALIZED_NAME_DYNAMIC_SECRET_TYPE = "dynamic_secret_type";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_SECRET_TYPE)
  @javax.annotation.Nullable
  private String dynamicSecretType;

  public static final String SERIALIZED_NAME_ENCRYPTED_SECRET = "encrypted_secret";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_SECRET)
  @javax.annotation.Nullable
  private String encryptedSecret;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  @javax.annotation.Nullable
  private String host;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_SUB_CLAIMS = "sub_claims";
  @SerializedName(SERIALIZED_NAME_SUB_CLAIMS)
  @javax.annotation.Nullable
  private Map<String, List<String>> subClaims = new HashMap<>();

  public TmpUserData() {
  }

  public TmpUserData accessId(@javax.annotation.Nullable String accessId) {
    this.accessId = accessId;
    return this;
  }

  /**
   * Get accessId
   * @return accessId
   */
  @javax.annotation.Nullable
  public String getAccessId() {
    return accessId;
  }

  public void setAccessId(@javax.annotation.Nullable String accessId) {
    this.accessId = accessId;
  }


  public TmpUserData creationDate(@javax.annotation.Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(@javax.annotation.Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public TmpUserData customTtl(@javax.annotation.Nullable Long customTtl) {
    this.customTtl = customTtl;
    return this;
  }

  /**
   * Get customTtl
   * @return customTtl
   */
  @javax.annotation.Nullable
  public Long getCustomTtl() {
    return customTtl;
  }

  public void setCustomTtl(@javax.annotation.Nullable Long customTtl) {
    this.customTtl = customTtl;
  }


  public TmpUserData dynamicSecretType(@javax.annotation.Nullable String dynamicSecretType) {
    this.dynamicSecretType = dynamicSecretType;
    return this;
  }

  /**
   * Get dynamicSecretType
   * @return dynamicSecretType
   */
  @javax.annotation.Nullable
  public String getDynamicSecretType() {
    return dynamicSecretType;
  }

  public void setDynamicSecretType(@javax.annotation.Nullable String dynamicSecretType) {
    this.dynamicSecretType = dynamicSecretType;
  }


  public TmpUserData encryptedSecret(@javax.annotation.Nullable String encryptedSecret) {
    this.encryptedSecret = encryptedSecret;
    return this;
  }

  /**
   * Get encryptedSecret
   * @return encryptedSecret
   */
  @javax.annotation.Nullable
  public String getEncryptedSecret() {
    return encryptedSecret;
  }

  public void setEncryptedSecret(@javax.annotation.Nullable String encryptedSecret) {
    this.encryptedSecret = encryptedSecret;
  }


  public TmpUserData host(@javax.annotation.Nullable String host) {
    this.host = host;
    return this;
  }

  /**
   * Get host
   * @return host
   */
  @javax.annotation.Nullable
  public String getHost() {
    return host;
  }

  public void setHost(@javax.annotation.Nullable String host) {
    this.host = host;
  }


  public TmpUserData id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public TmpUserData subClaims(@javax.annotation.Nullable Map<String, List<String>> subClaims) {
    this.subClaims = subClaims;
    return this;
  }

  public TmpUserData putSubClaimsItem(String key, List<String> subClaimsItem) {
    if (this.subClaims == null) {
      this.subClaims = new HashMap<>();
    }
    this.subClaims.put(key, subClaimsItem);
    return this;
  }

  /**
   * Get subClaims
   * @return subClaims
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getSubClaims() {
    return subClaims;
  }

  public void setSubClaims(@javax.annotation.Nullable Map<String, List<String>> subClaims) {
    this.subClaims = subClaims;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmpUserData tmpUserData = (TmpUserData) o;
    return Objects.equals(this.accessId, tmpUserData.accessId) &&
        Objects.equals(this.creationDate, tmpUserData.creationDate) &&
        Objects.equals(this.customTtl, tmpUserData.customTtl) &&
        Objects.equals(this.dynamicSecretType, tmpUserData.dynamicSecretType) &&
        Objects.equals(this.encryptedSecret, tmpUserData.encryptedSecret) &&
        Objects.equals(this.host, tmpUserData.host) &&
        Objects.equals(this.id, tmpUserData.id) &&
        Objects.equals(this.subClaims, tmpUserData.subClaims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, creationDate, customTtl, dynamicSecretType, encryptedSecret, host, id, subClaims);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmpUserData {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    customTtl: ").append(toIndentedString(customTtl)).append("\n");
    sb.append("    dynamicSecretType: ").append(toIndentedString(dynamicSecretType)).append("\n");
    sb.append("    encryptedSecret: ").append(toIndentedString(encryptedSecret)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subClaims: ").append(toIndentedString(subClaims)).append("\n");
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
    openapiFields.add("access_id");
    openapiFields.add("creation_date");
    openapiFields.add("custom_ttl");
    openapiFields.add("dynamic_secret_type");
    openapiFields.add("encrypted_secret");
    openapiFields.add("host");
    openapiFields.add("id");
    openapiFields.add("sub_claims");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TmpUserData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TmpUserData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TmpUserData is not found in the empty JSON string", TmpUserData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TmpUserData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TmpUserData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access_id") != null && !jsonObj.get("access_id").isJsonNull()) && !jsonObj.get("access_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_id").toString()));
      }
      if ((jsonObj.get("dynamic_secret_type") != null && !jsonObj.get("dynamic_secret_type").isJsonNull()) && !jsonObj.get("dynamic_secret_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dynamic_secret_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dynamic_secret_type").toString()));
      }
      if ((jsonObj.get("encrypted_secret") != null && !jsonObj.get("encrypted_secret").isJsonNull()) && !jsonObj.get("encrypted_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encrypted_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encrypted_secret").toString()));
      }
      if ((jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TmpUserData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TmpUserData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TmpUserData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TmpUserData.class));

       return (TypeAdapter<T>) new TypeAdapter<TmpUserData>() {
           @Override
           public void write(JsonWriter out, TmpUserData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TmpUserData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TmpUserData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TmpUserData
   * @throws IOException if the JSON string is invalid with respect to TmpUserData
   */
  public static TmpUserData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TmpUserData.class);
  }

  /**
   * Convert an instance of TmpUserData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

