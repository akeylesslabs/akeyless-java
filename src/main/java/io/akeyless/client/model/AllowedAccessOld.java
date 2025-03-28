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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * Deprecated: AllowedAccessOld please use Gator allowed_access API structs such as AllowedAccessInput/AllowedAccess
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class AllowedAccessOld {
  public static final String SERIALIZED_NAME_ACC_ID = "acc_id";
  @SerializedName(SERIALIZED_NAME_ACC_ID)
  @javax.annotation.Nullable
  private String accId;

  public static final String SERIALIZED_NAME_ACCESS_PERMISSIONS = "access_permissions";
  @SerializedName(SERIALIZED_NAME_ACCESS_PERMISSIONS)
  @javax.annotation.Nullable
  private List<String> accessPermissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCESS_RULES_TYPE = "access_rules_type";
  @SerializedName(SERIALIZED_NAME_ACCESS_RULES_TYPE)
  @javax.annotation.Nullable
  private String accessRulesType;

  public static final String SERIALIZED_NAME_ALLOWED_API = "allowed_api";
  @SerializedName(SERIALIZED_NAME_ALLOWED_API)
  @javax.annotation.Nullable
  private Boolean allowedApi;

  public static final String SERIALIZED_NAME_ALLOWEDS_LOGIN = "alloweds_login";
  @SerializedName(SERIALIZED_NAME_ALLOWEDS_LOGIN)
  @javax.annotation.Nullable
  private Boolean allowedsLogin;

  public static final String SERIALIZED_NAME_EDITABLE = "editable";
  @SerializedName(SERIALIZED_NAME_EDITABLE)
  @javax.annotation.Nullable
  private Boolean editable;

  public static final String SERIALIZED_NAME_ERR_MSG = "err_msg";
  @SerializedName(SERIALIZED_NAME_ERR_MSG)
  @javax.annotation.Nullable
  private String errMsg;

  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  @javax.annotation.Nullable
  private String hash;

  public static final String SERIALIZED_NAME_IS_VALID = "is_valid";
  @SerializedName(SERIALIZED_NAME_IS_VALID)
  @javax.annotation.Nullable
  private Boolean isValid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_SUB_CLAIMS = "sub_claims";
  @SerializedName(SERIALIZED_NAME_SUB_CLAIMS)
  @javax.annotation.Nullable
  private Map<String, List<String>> subClaims = new HashMap<>();

  public AllowedAccessOld() {
  }

  public AllowedAccessOld accId(@javax.annotation.Nullable String accId) {
    this.accId = accId;
    return this;
  }

  /**
   * Get accId
   * @return accId
   */
  @javax.annotation.Nullable
  public String getAccId() {
    return accId;
  }

  public void setAccId(@javax.annotation.Nullable String accId) {
    this.accId = accId;
  }


  public AllowedAccessOld accessPermissions(@javax.annotation.Nullable List<String> accessPermissions) {
    this.accessPermissions = accessPermissions;
    return this;
  }

  public AllowedAccessOld addAccessPermissionsItem(String accessPermissionsItem) {
    if (this.accessPermissions == null) {
      this.accessPermissions = new ArrayList<>();
    }
    this.accessPermissions.add(accessPermissionsItem);
    return this;
  }

  /**
   * Get accessPermissions
   * @return accessPermissions
   */
  @javax.annotation.Nullable
  public List<String> getAccessPermissions() {
    return accessPermissions;
  }

  public void setAccessPermissions(@javax.annotation.Nullable List<String> accessPermissions) {
    this.accessPermissions = accessPermissions;
  }


  public AllowedAccessOld accessRulesType(@javax.annotation.Nullable String accessRulesType) {
    this.accessRulesType = accessRulesType;
    return this;
  }

  /**
   * Get accessRulesType
   * @return accessRulesType
   */
  @javax.annotation.Nullable
  public String getAccessRulesType() {
    return accessRulesType;
  }

  public void setAccessRulesType(@javax.annotation.Nullable String accessRulesType) {
    this.accessRulesType = accessRulesType;
  }


  public AllowedAccessOld allowedApi(@javax.annotation.Nullable Boolean allowedApi) {
    this.allowedApi = allowedApi;
    return this;
  }

  /**
   * Get allowedApi
   * @return allowedApi
   */
  @javax.annotation.Nullable
  public Boolean getAllowedApi() {
    return allowedApi;
  }

  public void setAllowedApi(@javax.annotation.Nullable Boolean allowedApi) {
    this.allowedApi = allowedApi;
  }


  public AllowedAccessOld allowedsLogin(@javax.annotation.Nullable Boolean allowedsLogin) {
    this.allowedsLogin = allowedsLogin;
    return this;
  }

  /**
   * Get allowedsLogin
   * @return allowedsLogin
   */
  @javax.annotation.Nullable
  public Boolean getAllowedsLogin() {
    return allowedsLogin;
  }

  public void setAllowedsLogin(@javax.annotation.Nullable Boolean allowedsLogin) {
    this.allowedsLogin = allowedsLogin;
  }


  public AllowedAccessOld editable(@javax.annotation.Nullable Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * Get editable
   * @return editable
   */
  @javax.annotation.Nullable
  public Boolean getEditable() {
    return editable;
  }

  public void setEditable(@javax.annotation.Nullable Boolean editable) {
    this.editable = editable;
  }


  public AllowedAccessOld errMsg(@javax.annotation.Nullable String errMsg) {
    this.errMsg = errMsg;
    return this;
  }

  /**
   * Get errMsg
   * @return errMsg
   */
  @javax.annotation.Nullable
  public String getErrMsg() {
    return errMsg;
  }

  public void setErrMsg(@javax.annotation.Nullable String errMsg) {
    this.errMsg = errMsg;
  }


  public AllowedAccessOld hash(@javax.annotation.Nullable String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Get hash
   * @return hash
   */
  @javax.annotation.Nullable
  public String getHash() {
    return hash;
  }

  public void setHash(@javax.annotation.Nullable String hash) {
    this.hash = hash;
  }


  public AllowedAccessOld isValid(@javax.annotation.Nullable Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

  /**
   * Get isValid
   * @return isValid
   */
  @javax.annotation.Nullable
  public Boolean getIsValid() {
    return isValid;
  }

  public void setIsValid(@javax.annotation.Nullable Boolean isValid) {
    this.isValid = isValid;
  }


  public AllowedAccessOld name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public AllowedAccessOld subClaims(@javax.annotation.Nullable Map<String, List<String>> subClaims) {
    this.subClaims = subClaims;
    return this;
  }

  public AllowedAccessOld putSubClaimsItem(String key, List<String> subClaimsItem) {
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
    AllowedAccessOld allowedAccessOld = (AllowedAccessOld) o;
    return Objects.equals(this.accId, allowedAccessOld.accId) &&
        Objects.equals(this.accessPermissions, allowedAccessOld.accessPermissions) &&
        Objects.equals(this.accessRulesType, allowedAccessOld.accessRulesType) &&
        Objects.equals(this.allowedApi, allowedAccessOld.allowedApi) &&
        Objects.equals(this.allowedsLogin, allowedAccessOld.allowedsLogin) &&
        Objects.equals(this.editable, allowedAccessOld.editable) &&
        Objects.equals(this.errMsg, allowedAccessOld.errMsg) &&
        Objects.equals(this.hash, allowedAccessOld.hash) &&
        Objects.equals(this.isValid, allowedAccessOld.isValid) &&
        Objects.equals(this.name, allowedAccessOld.name) &&
        Objects.equals(this.subClaims, allowedAccessOld.subClaims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accId, accessPermissions, accessRulesType, allowedApi, allowedsLogin, editable, errMsg, hash, isValid, name, subClaims);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowedAccessOld {\n");
    sb.append("    accId: ").append(toIndentedString(accId)).append("\n");
    sb.append("    accessPermissions: ").append(toIndentedString(accessPermissions)).append("\n");
    sb.append("    accessRulesType: ").append(toIndentedString(accessRulesType)).append("\n");
    sb.append("    allowedApi: ").append(toIndentedString(allowedApi)).append("\n");
    sb.append("    allowedsLogin: ").append(toIndentedString(allowedsLogin)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    errMsg: ").append(toIndentedString(errMsg)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("acc_id");
    openapiFields.add("access_permissions");
    openapiFields.add("access_rules_type");
    openapiFields.add("allowed_api");
    openapiFields.add("alloweds_login");
    openapiFields.add("editable");
    openapiFields.add("err_msg");
    openapiFields.add("hash");
    openapiFields.add("is_valid");
    openapiFields.add("name");
    openapiFields.add("sub_claims");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AllowedAccessOld
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AllowedAccessOld.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AllowedAccessOld is not found in the empty JSON string", AllowedAccessOld.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AllowedAccessOld.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AllowedAccessOld` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("acc_id") != null && !jsonObj.get("acc_id").isJsonNull()) && !jsonObj.get("acc_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acc_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acc_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("access_permissions") != null && !jsonObj.get("access_permissions").isJsonNull() && !jsonObj.get("access_permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_permissions` to be an array in the JSON string but got `%s`", jsonObj.get("access_permissions").toString()));
      }
      if ((jsonObj.get("access_rules_type") != null && !jsonObj.get("access_rules_type").isJsonNull()) && !jsonObj.get("access_rules_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_rules_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_rules_type").toString()));
      }
      if ((jsonObj.get("err_msg") != null && !jsonObj.get("err_msg").isJsonNull()) && !jsonObj.get("err_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `err_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("err_msg").toString()));
      }
      if ((jsonObj.get("hash") != null && !jsonObj.get("hash").isJsonNull()) && !jsonObj.get("hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hash").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AllowedAccessOld.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AllowedAccessOld' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AllowedAccessOld> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AllowedAccessOld.class));

       return (TypeAdapter<T>) new TypeAdapter<AllowedAccessOld>() {
           @Override
           public void write(JsonWriter out, AllowedAccessOld value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AllowedAccessOld read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AllowedAccessOld given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AllowedAccessOld
   * @throws IOException if the JSON string is invalid with respect to AllowedAccessOld
   */
  public static AllowedAccessOld fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AllowedAccessOld.class);
  }

  /**
   * Convert an instance of AllowedAccessOld to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

