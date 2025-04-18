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
import io.akeyless.client.model.ClassicKeyTargetInfo;
import java.io.IOException;
import java.util.ArrayList;
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
 * ClassicKeyDetailsInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ClassicKeyDetailsInfo {
  public static final String SERIALIZED_NAME_CLASSIC_KEY_ATTRIBUTES = "classic_key_attributes";
  @SerializedName(SERIALIZED_NAME_CLASSIC_KEY_ATTRIBUTES)
  @javax.annotation.Nullable
  private Map<String, List<String>> classicKeyAttributes = new HashMap<>();

  public static final String SERIALIZED_NAME_CLASSIC_KEY_ID = "classic_key_id";
  @SerializedName(SERIALIZED_NAME_CLASSIC_KEY_ID)
  @javax.annotation.Nullable
  private String classicKeyId;

  public static final String SERIALIZED_NAME_CREDENTIAL_ID = "credential_id";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_ID)
  @javax.annotation.Nullable
  private String credentialId;

  public static final String SERIALIZED_NAME_GW_CLUSTER_ID = "gw_cluster_id";
  @SerializedName(SERIALIZED_NAME_GW_CLUSTER_ID)
  @javax.annotation.Nullable
  private Long gwClusterId;

  public static final String SERIALIZED_NAME_HAS_CERTIFICATE = "has_certificate";
  @SerializedName(SERIALIZED_NAME_HAS_CERTIFICATE)
  @javax.annotation.Nullable
  private Boolean hasCertificate;

  public static final String SERIALIZED_NAME_IS_PROVIDED_BY_USER = "is_provided_by_user";
  @SerializedName(SERIALIZED_NAME_IS_PROVIDED_BY_USER)
  @javax.annotation.Nullable
  private Boolean isProvidedByUser;

  public static final String SERIALIZED_NAME_IS_UNEXPORTABLE = "is_unexportable";
  @SerializedName(SERIALIZED_NAME_IS_UNEXPORTABLE)
  @javax.annotation.Nullable
  private Boolean isUnexportable;

  public static final String SERIALIZED_NAME_KEY_STATE = "key_state";
  @SerializedName(SERIALIZED_NAME_KEY_STATE)
  @javax.annotation.Nullable
  private String keyState;

  public static final String SERIALIZED_NAME_KEY_TYPE = "key_type";
  @SerializedName(SERIALIZED_NAME_KEY_TYPE)
  @javax.annotation.Nullable
  private String keyType;

  public static final String SERIALIZED_NAME_LAST_ERROR = "last_error";
  @SerializedName(SERIALIZED_NAME_LAST_ERROR)
  @javax.annotation.Nullable
  private String lastError;

  public static final String SERIALIZED_NAME_PUBLIC_KEY = "public_key";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY)
  @javax.annotation.Nullable
  private String publicKey;

  public static final String SERIALIZED_NAME_TARGET_ALIAS_HELPER = "target_alias_helper";
  @SerializedName(SERIALIZED_NAME_TARGET_ALIAS_HELPER)
  @javax.annotation.Nullable
  private String targetAliasHelper;

  public static final String SERIALIZED_NAME_TARGET_TYPES = "target_types";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPES)
  @javax.annotation.Nullable
  private List<String> targetTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_TARGETS = "targets";
  @SerializedName(SERIALIZED_NAME_TARGETS)
  @javax.annotation.Nullable
  private List<ClassicKeyTargetInfo> targets = new ArrayList<>();

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  @javax.annotation.Nullable
  private String username;

  public static final String SERIALIZED_NAME_WEBSITES = "websites";
  @SerializedName(SERIALIZED_NAME_WEBSITES)
  @javax.annotation.Nullable
  private List<String> websites = new ArrayList<>();

  public ClassicKeyDetailsInfo() {
  }

  public ClassicKeyDetailsInfo classicKeyAttributes(@javax.annotation.Nullable Map<String, List<String>> classicKeyAttributes) {
    this.classicKeyAttributes = classicKeyAttributes;
    return this;
  }

  public ClassicKeyDetailsInfo putClassicKeyAttributesItem(String key, List<String> classicKeyAttributesItem) {
    if (this.classicKeyAttributes == null) {
      this.classicKeyAttributes = new HashMap<>();
    }
    this.classicKeyAttributes.put(key, classicKeyAttributesItem);
    return this;
  }

  /**
   * Get classicKeyAttributes
   * @return classicKeyAttributes
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getClassicKeyAttributes() {
    return classicKeyAttributes;
  }

  public void setClassicKeyAttributes(@javax.annotation.Nullable Map<String, List<String>> classicKeyAttributes) {
    this.classicKeyAttributes = classicKeyAttributes;
  }


  public ClassicKeyDetailsInfo classicKeyId(@javax.annotation.Nullable String classicKeyId) {
    this.classicKeyId = classicKeyId;
    return this;
  }

  /**
   * Get classicKeyId
   * @return classicKeyId
   */
  @javax.annotation.Nullable
  public String getClassicKeyId() {
    return classicKeyId;
  }

  public void setClassicKeyId(@javax.annotation.Nullable String classicKeyId) {
    this.classicKeyId = classicKeyId;
  }


  public ClassicKeyDetailsInfo credentialId(@javax.annotation.Nullable String credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  /**
   * Get credentialId
   * @return credentialId
   */
  @javax.annotation.Nullable
  public String getCredentialId() {
    return credentialId;
  }

  public void setCredentialId(@javax.annotation.Nullable String credentialId) {
    this.credentialId = credentialId;
  }


  public ClassicKeyDetailsInfo gwClusterId(@javax.annotation.Nullable Long gwClusterId) {
    this.gwClusterId = gwClusterId;
    return this;
  }

  /**
   * Get gwClusterId
   * @return gwClusterId
   */
  @javax.annotation.Nullable
  public Long getGwClusterId() {
    return gwClusterId;
  }

  public void setGwClusterId(@javax.annotation.Nullable Long gwClusterId) {
    this.gwClusterId = gwClusterId;
  }


  public ClassicKeyDetailsInfo hasCertificate(@javax.annotation.Nullable Boolean hasCertificate) {
    this.hasCertificate = hasCertificate;
    return this;
  }

  /**
   * Get hasCertificate
   * @return hasCertificate
   */
  @javax.annotation.Nullable
  public Boolean getHasCertificate() {
    return hasCertificate;
  }

  public void setHasCertificate(@javax.annotation.Nullable Boolean hasCertificate) {
    this.hasCertificate = hasCertificate;
  }


  public ClassicKeyDetailsInfo isProvidedByUser(@javax.annotation.Nullable Boolean isProvidedByUser) {
    this.isProvidedByUser = isProvidedByUser;
    return this;
  }

  /**
   * Get isProvidedByUser
   * @return isProvidedByUser
   */
  @javax.annotation.Nullable
  public Boolean getIsProvidedByUser() {
    return isProvidedByUser;
  }

  public void setIsProvidedByUser(@javax.annotation.Nullable Boolean isProvidedByUser) {
    this.isProvidedByUser = isProvidedByUser;
  }


  public ClassicKeyDetailsInfo isUnexportable(@javax.annotation.Nullable Boolean isUnexportable) {
    this.isUnexportable = isUnexportable;
    return this;
  }

  /**
   * Get isUnexportable
   * @return isUnexportable
   */
  @javax.annotation.Nullable
  public Boolean getIsUnexportable() {
    return isUnexportable;
  }

  public void setIsUnexportable(@javax.annotation.Nullable Boolean isUnexportable) {
    this.isUnexportable = isUnexportable;
  }


  public ClassicKeyDetailsInfo keyState(@javax.annotation.Nullable String keyState) {
    this.keyState = keyState;
    return this;
  }

  /**
   * ItemState defines the different states an Item can be in
   * @return keyState
   */
  @javax.annotation.Nullable
  public String getKeyState() {
    return keyState;
  }

  public void setKeyState(@javax.annotation.Nullable String keyState) {
    this.keyState = keyState;
  }


  public ClassicKeyDetailsInfo keyType(@javax.annotation.Nullable String keyType) {
    this.keyType = keyType;
    return this;
  }

  /**
   * Get keyType
   * @return keyType
   */
  @javax.annotation.Nullable
  public String getKeyType() {
    return keyType;
  }

  public void setKeyType(@javax.annotation.Nullable String keyType) {
    this.keyType = keyType;
  }


  public ClassicKeyDetailsInfo lastError(@javax.annotation.Nullable String lastError) {
    this.lastError = lastError;
    return this;
  }

  /**
   * Get lastError
   * @return lastError
   */
  @javax.annotation.Nullable
  public String getLastError() {
    return lastError;
  }

  public void setLastError(@javax.annotation.Nullable String lastError) {
    this.lastError = lastError;
  }


  public ClassicKeyDetailsInfo publicKey(@javax.annotation.Nullable String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  /**
   * Get publicKey
   * @return publicKey
   */
  @javax.annotation.Nullable
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(@javax.annotation.Nullable String publicKey) {
    this.publicKey = publicKey;
  }


  public ClassicKeyDetailsInfo targetAliasHelper(@javax.annotation.Nullable String targetAliasHelper) {
    this.targetAliasHelper = targetAliasHelper;
    return this;
  }

  /**
   * Get targetAliasHelper
   * @return targetAliasHelper
   */
  @javax.annotation.Nullable
  public String getTargetAliasHelper() {
    return targetAliasHelper;
  }

  public void setTargetAliasHelper(@javax.annotation.Nullable String targetAliasHelper) {
    this.targetAliasHelper = targetAliasHelper;
  }


  public ClassicKeyDetailsInfo targetTypes(@javax.annotation.Nullable List<String> targetTypes) {
    this.targetTypes = targetTypes;
    return this;
  }

  public ClassicKeyDetailsInfo addTargetTypesItem(String targetTypesItem) {
    if (this.targetTypes == null) {
      this.targetTypes = new ArrayList<>();
    }
    this.targetTypes.add(targetTypesItem);
    return this;
  }

  /**
   * Get targetTypes
   * @return targetTypes
   */
  @javax.annotation.Nullable
  public List<String> getTargetTypes() {
    return targetTypes;
  }

  public void setTargetTypes(@javax.annotation.Nullable List<String> targetTypes) {
    this.targetTypes = targetTypes;
  }


  public ClassicKeyDetailsInfo targets(@javax.annotation.Nullable List<ClassicKeyTargetInfo> targets) {
    this.targets = targets;
    return this;
  }

  public ClassicKeyDetailsInfo addTargetsItem(ClassicKeyTargetInfo targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * Get targets
   * @return targets
   */
  @javax.annotation.Nullable
  public List<ClassicKeyTargetInfo> getTargets() {
    return targets;
  }

  public void setTargets(@javax.annotation.Nullable List<ClassicKeyTargetInfo> targets) {
    this.targets = targets;
  }


  public ClassicKeyDetailsInfo username(@javax.annotation.Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(@javax.annotation.Nullable String username) {
    this.username = username;
  }


  public ClassicKeyDetailsInfo websites(@javax.annotation.Nullable List<String> websites) {
    this.websites = websites;
    return this;
  }

  public ClassicKeyDetailsInfo addWebsitesItem(String websitesItem) {
    if (this.websites == null) {
      this.websites = new ArrayList<>();
    }
    this.websites.add(websitesItem);
    return this;
  }

  /**
   * Get websites
   * @return websites
   */
  @javax.annotation.Nullable
  public List<String> getWebsites() {
    return websites;
  }

  public void setWebsites(@javax.annotation.Nullable List<String> websites) {
    this.websites = websites;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassicKeyDetailsInfo classicKeyDetailsInfo = (ClassicKeyDetailsInfo) o;
    return Objects.equals(this.classicKeyAttributes, classicKeyDetailsInfo.classicKeyAttributes) &&
        Objects.equals(this.classicKeyId, classicKeyDetailsInfo.classicKeyId) &&
        Objects.equals(this.credentialId, classicKeyDetailsInfo.credentialId) &&
        Objects.equals(this.gwClusterId, classicKeyDetailsInfo.gwClusterId) &&
        Objects.equals(this.hasCertificate, classicKeyDetailsInfo.hasCertificate) &&
        Objects.equals(this.isProvidedByUser, classicKeyDetailsInfo.isProvidedByUser) &&
        Objects.equals(this.isUnexportable, classicKeyDetailsInfo.isUnexportable) &&
        Objects.equals(this.keyState, classicKeyDetailsInfo.keyState) &&
        Objects.equals(this.keyType, classicKeyDetailsInfo.keyType) &&
        Objects.equals(this.lastError, classicKeyDetailsInfo.lastError) &&
        Objects.equals(this.publicKey, classicKeyDetailsInfo.publicKey) &&
        Objects.equals(this.targetAliasHelper, classicKeyDetailsInfo.targetAliasHelper) &&
        Objects.equals(this.targetTypes, classicKeyDetailsInfo.targetTypes) &&
        Objects.equals(this.targets, classicKeyDetailsInfo.targets) &&
        Objects.equals(this.username, classicKeyDetailsInfo.username) &&
        Objects.equals(this.websites, classicKeyDetailsInfo.websites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classicKeyAttributes, classicKeyId, credentialId, gwClusterId, hasCertificate, isProvidedByUser, isUnexportable, keyState, keyType, lastError, publicKey, targetAliasHelper, targetTypes, targets, username, websites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassicKeyDetailsInfo {\n");
    sb.append("    classicKeyAttributes: ").append(toIndentedString(classicKeyAttributes)).append("\n");
    sb.append("    classicKeyId: ").append(toIndentedString(classicKeyId)).append("\n");
    sb.append("    credentialId: ").append(toIndentedString(credentialId)).append("\n");
    sb.append("    gwClusterId: ").append(toIndentedString(gwClusterId)).append("\n");
    sb.append("    hasCertificate: ").append(toIndentedString(hasCertificate)).append("\n");
    sb.append("    isProvidedByUser: ").append(toIndentedString(isProvidedByUser)).append("\n");
    sb.append("    isUnexportable: ").append(toIndentedString(isUnexportable)).append("\n");
    sb.append("    keyState: ").append(toIndentedString(keyState)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    targetAliasHelper: ").append(toIndentedString(targetAliasHelper)).append("\n");
    sb.append("    targetTypes: ").append(toIndentedString(targetTypes)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    websites: ").append(toIndentedString(websites)).append("\n");
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
    openapiFields.add("classic_key_attributes");
    openapiFields.add("classic_key_id");
    openapiFields.add("credential_id");
    openapiFields.add("gw_cluster_id");
    openapiFields.add("has_certificate");
    openapiFields.add("is_provided_by_user");
    openapiFields.add("is_unexportable");
    openapiFields.add("key_state");
    openapiFields.add("key_type");
    openapiFields.add("last_error");
    openapiFields.add("public_key");
    openapiFields.add("target_alias_helper");
    openapiFields.add("target_types");
    openapiFields.add("targets");
    openapiFields.add("username");
    openapiFields.add("websites");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ClassicKeyDetailsInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClassicKeyDetailsInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClassicKeyDetailsInfo is not found in the empty JSON string", ClassicKeyDetailsInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClassicKeyDetailsInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClassicKeyDetailsInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("classic_key_id") != null && !jsonObj.get("classic_key_id").isJsonNull()) && !jsonObj.get("classic_key_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classic_key_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classic_key_id").toString()));
      }
      if ((jsonObj.get("credential_id") != null && !jsonObj.get("credential_id").isJsonNull()) && !jsonObj.get("credential_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credential_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credential_id").toString()));
      }
      if ((jsonObj.get("key_state") != null && !jsonObj.get("key_state").isJsonNull()) && !jsonObj.get("key_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_state").toString()));
      }
      if ((jsonObj.get("key_type") != null && !jsonObj.get("key_type").isJsonNull()) && !jsonObj.get("key_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_type").toString()));
      }
      if ((jsonObj.get("last_error") != null && !jsonObj.get("last_error").isJsonNull()) && !jsonObj.get("last_error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_error").toString()));
      }
      if ((jsonObj.get("public_key") != null && !jsonObj.get("public_key").isJsonNull()) && !jsonObj.get("public_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public_key").toString()));
      }
      if ((jsonObj.get("target_alias_helper") != null && !jsonObj.get("target_alias_helper").isJsonNull()) && !jsonObj.get("target_alias_helper").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_alias_helper` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_alias_helper").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("target_types") != null && !jsonObj.get("target_types").isJsonNull() && !jsonObj.get("target_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_types` to be an array in the JSON string but got `%s`", jsonObj.get("target_types").toString()));
      }
      if (jsonObj.get("targets") != null && !jsonObj.get("targets").isJsonNull()) {
        JsonArray jsonArraytargets = jsonObj.getAsJsonArray("targets");
        if (jsonArraytargets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("targets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `targets` to be an array in the JSON string but got `%s`", jsonObj.get("targets").toString()));
          }

          // validate the optional field `targets` (array)
          for (int i = 0; i < jsonArraytargets.size(); i++) {
            ClassicKeyTargetInfo.validateJsonElement(jsonArraytargets.get(i));
          };
        }
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("websites") != null && !jsonObj.get("websites").isJsonNull() && !jsonObj.get("websites").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `websites` to be an array in the JSON string but got `%s`", jsonObj.get("websites").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClassicKeyDetailsInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClassicKeyDetailsInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClassicKeyDetailsInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClassicKeyDetailsInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ClassicKeyDetailsInfo>() {
           @Override
           public void write(JsonWriter out, ClassicKeyDetailsInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClassicKeyDetailsInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ClassicKeyDetailsInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ClassicKeyDetailsInfo
   * @throws IOException if the JSON string is invalid with respect to ClassicKeyDetailsInfo
   */
  public static ClassicKeyDetailsInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClassicKeyDetailsInfo.class);
  }

  /**
   * Convert an instance of ClassicKeyDetailsInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

