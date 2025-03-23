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
 * RoleAuthMethodAssociation includes details of an association between a role and an auth method.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class RoleAuthMethodAssociation {
  public static final String SERIALIZED_NAME_ASSOC_ID = "assoc_id";
  @SerializedName(SERIALIZED_NAME_ASSOC_ID)
  @javax.annotation.Nullable
  private String assocId;

  public static final String SERIALIZED_NAME_AUTH_METHOD_ACCESS_ID = "auth_method_access_id";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_ACCESS_ID)
  @javax.annotation.Nullable
  private String authMethodAccessId;

  public static final String SERIALIZED_NAME_AUTH_METHOD_NAME = "auth_method_name";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_NAME)
  @javax.annotation.Nullable
  private String authMethodName;

  public static final String SERIALIZED_NAME_AUTH_METHOD_SUB_CLAIMS = "auth_method_sub_claims";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_SUB_CLAIMS)
  @javax.annotation.Nullable
  private Map<String, List<String>> authMethodSubClaims = new HashMap<>();

  public static final String SERIALIZED_NAME_IS_SUBCLAIMS_WITH_OPERATOR = "is_subclaims_with_operator";
  @SerializedName(SERIALIZED_NAME_IS_SUBCLAIMS_WITH_OPERATOR)
  @javax.annotation.Nullable
  private Boolean isSubclaimsWithOperator;

  public static final String SERIALIZED_NAME_SUB_CLAIMS_CASE_SENSITIVE = "sub_claims_case_sensitive";
  @SerializedName(SERIALIZED_NAME_SUB_CLAIMS_CASE_SENSITIVE)
  @javax.annotation.Nullable
  private Boolean subClaimsCaseSensitive;

  public RoleAuthMethodAssociation() {
  }

  public RoleAuthMethodAssociation assocId(@javax.annotation.Nullable String assocId) {
    this.assocId = assocId;
    return this;
  }

  /**
   * Get assocId
   * @return assocId
   */
  @javax.annotation.Nullable
  public String getAssocId() {
    return assocId;
  }

  public void setAssocId(@javax.annotation.Nullable String assocId) {
    this.assocId = assocId;
  }


  public RoleAuthMethodAssociation authMethodAccessId(@javax.annotation.Nullable String authMethodAccessId) {
    this.authMethodAccessId = authMethodAccessId;
    return this;
  }

  /**
   * Get authMethodAccessId
   * @return authMethodAccessId
   */
  @javax.annotation.Nullable
  public String getAuthMethodAccessId() {
    return authMethodAccessId;
  }

  public void setAuthMethodAccessId(@javax.annotation.Nullable String authMethodAccessId) {
    this.authMethodAccessId = authMethodAccessId;
  }


  public RoleAuthMethodAssociation authMethodName(@javax.annotation.Nullable String authMethodName) {
    this.authMethodName = authMethodName;
    return this;
  }

  /**
   * Get authMethodName
   * @return authMethodName
   */
  @javax.annotation.Nullable
  public String getAuthMethodName() {
    return authMethodName;
  }

  public void setAuthMethodName(@javax.annotation.Nullable String authMethodName) {
    this.authMethodName = authMethodName;
  }


  public RoleAuthMethodAssociation authMethodSubClaims(@javax.annotation.Nullable Map<String, List<String>> authMethodSubClaims) {
    this.authMethodSubClaims = authMethodSubClaims;
    return this;
  }

  public RoleAuthMethodAssociation putAuthMethodSubClaimsItem(String key, List<String> authMethodSubClaimsItem) {
    if (this.authMethodSubClaims == null) {
      this.authMethodSubClaims = new HashMap<>();
    }
    this.authMethodSubClaims.put(key, authMethodSubClaimsItem);
    return this;
  }

  /**
   * Get authMethodSubClaims
   * @return authMethodSubClaims
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getAuthMethodSubClaims() {
    return authMethodSubClaims;
  }

  public void setAuthMethodSubClaims(@javax.annotation.Nullable Map<String, List<String>> authMethodSubClaims) {
    this.authMethodSubClaims = authMethodSubClaims;
  }


  public RoleAuthMethodAssociation isSubclaimsWithOperator(@javax.annotation.Nullable Boolean isSubclaimsWithOperator) {
    this.isSubclaimsWithOperator = isSubclaimsWithOperator;
    return this;
  }

  /**
   * Get isSubclaimsWithOperator
   * @return isSubclaimsWithOperator
   */
  @javax.annotation.Nullable
  public Boolean getIsSubclaimsWithOperator() {
    return isSubclaimsWithOperator;
  }

  public void setIsSubclaimsWithOperator(@javax.annotation.Nullable Boolean isSubclaimsWithOperator) {
    this.isSubclaimsWithOperator = isSubclaimsWithOperator;
  }


  public RoleAuthMethodAssociation subClaimsCaseSensitive(@javax.annotation.Nullable Boolean subClaimsCaseSensitive) {
    this.subClaimsCaseSensitive = subClaimsCaseSensitive;
    return this;
  }

  /**
   * Get subClaimsCaseSensitive
   * @return subClaimsCaseSensitive
   */
  @javax.annotation.Nullable
  public Boolean getSubClaimsCaseSensitive() {
    return subClaimsCaseSensitive;
  }

  public void setSubClaimsCaseSensitive(@javax.annotation.Nullable Boolean subClaimsCaseSensitive) {
    this.subClaimsCaseSensitive = subClaimsCaseSensitive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleAuthMethodAssociation roleAuthMethodAssociation = (RoleAuthMethodAssociation) o;
    return Objects.equals(this.assocId, roleAuthMethodAssociation.assocId) &&
        Objects.equals(this.authMethodAccessId, roleAuthMethodAssociation.authMethodAccessId) &&
        Objects.equals(this.authMethodName, roleAuthMethodAssociation.authMethodName) &&
        Objects.equals(this.authMethodSubClaims, roleAuthMethodAssociation.authMethodSubClaims) &&
        Objects.equals(this.isSubclaimsWithOperator, roleAuthMethodAssociation.isSubclaimsWithOperator) &&
        Objects.equals(this.subClaimsCaseSensitive, roleAuthMethodAssociation.subClaimsCaseSensitive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assocId, authMethodAccessId, authMethodName, authMethodSubClaims, isSubclaimsWithOperator, subClaimsCaseSensitive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleAuthMethodAssociation {\n");
    sb.append("    assocId: ").append(toIndentedString(assocId)).append("\n");
    sb.append("    authMethodAccessId: ").append(toIndentedString(authMethodAccessId)).append("\n");
    sb.append("    authMethodName: ").append(toIndentedString(authMethodName)).append("\n");
    sb.append("    authMethodSubClaims: ").append(toIndentedString(authMethodSubClaims)).append("\n");
    sb.append("    isSubclaimsWithOperator: ").append(toIndentedString(isSubclaimsWithOperator)).append("\n");
    sb.append("    subClaimsCaseSensitive: ").append(toIndentedString(subClaimsCaseSensitive)).append("\n");
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
    openapiFields.add("assoc_id");
    openapiFields.add("auth_method_access_id");
    openapiFields.add("auth_method_name");
    openapiFields.add("auth_method_sub_claims");
    openapiFields.add("is_subclaims_with_operator");
    openapiFields.add("sub_claims_case_sensitive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RoleAuthMethodAssociation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RoleAuthMethodAssociation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RoleAuthMethodAssociation is not found in the empty JSON string", RoleAuthMethodAssociation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RoleAuthMethodAssociation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RoleAuthMethodAssociation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("assoc_id") != null && !jsonObj.get("assoc_id").isJsonNull()) && !jsonObj.get("assoc_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assoc_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assoc_id").toString()));
      }
      if ((jsonObj.get("auth_method_access_id") != null && !jsonObj.get("auth_method_access_id").isJsonNull()) && !jsonObj.get("auth_method_access_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_method_access_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_method_access_id").toString()));
      }
      if ((jsonObj.get("auth_method_name") != null && !jsonObj.get("auth_method_name").isJsonNull()) && !jsonObj.get("auth_method_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_method_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_method_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RoleAuthMethodAssociation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RoleAuthMethodAssociation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RoleAuthMethodAssociation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RoleAuthMethodAssociation.class));

       return (TypeAdapter<T>) new TypeAdapter<RoleAuthMethodAssociation>() {
           @Override
           public void write(JsonWriter out, RoleAuthMethodAssociation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RoleAuthMethodAssociation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RoleAuthMethodAssociation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RoleAuthMethodAssociation
   * @throws IOException if the JSON string is invalid with respect to RoleAuthMethodAssociation
   */
  public static RoleAuthMethodAssociation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RoleAuthMethodAssociation.class);
  }

  /**
   * Convert an instance of RoleAuthMethodAssociation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

