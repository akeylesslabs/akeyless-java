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
import io.akeyless.client.model.Rules;
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
 * AuthMethodRoleAssociation includes details of an association between an auth method and a role.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class AuthMethodRoleAssociation {
  public static final String SERIALIZED_NAME_ALLOWED_OPS = "allowed_ops";
  @SerializedName(SERIALIZED_NAME_ALLOWED_OPS)
  @javax.annotation.Nullable
  private List<String> allowedOps = new ArrayList<>();

  public static final String SERIALIZED_NAME_ASSOC_ID = "assoc_id";
  @SerializedName(SERIALIZED_NAME_ASSOC_ID)
  @javax.annotation.Nullable
  private String assocId;

  public static final String SERIALIZED_NAME_AUTH_METHOD_SUB_CLAIMS = "auth_method_sub_claims";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_SUB_CLAIMS)
  @javax.annotation.Nullable
  private Map<String, List<String>> authMethodSubClaims = new HashMap<>();

  public static final String SERIALIZED_NAME_IS_SUB_CLAIMS_CASE_SENSITIVE = "is_sub_claims_case_sensitive";
  @SerializedName(SERIALIZED_NAME_IS_SUB_CLAIMS_CASE_SENSITIVE)
  @javax.annotation.Nullable
  private Boolean isSubClaimsCaseSensitive;

  public static final String SERIALIZED_NAME_IS_SUBCLAIMS_WITH_OPERATOR = "is_subclaims_with_operator";
  @SerializedName(SERIALIZED_NAME_IS_SUBCLAIMS_WITH_OPERATOR)
  @javax.annotation.Nullable
  private Boolean isSubclaimsWithOperator;

  public static final String SERIALIZED_NAME_ROLE_ID = "role_id";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  @javax.annotation.Nullable
  private Long roleId;

  public static final String SERIALIZED_NAME_ROLE_NAME = "role_name";
  @SerializedName(SERIALIZED_NAME_ROLE_NAME)
  @javax.annotation.Nullable
  private String roleName;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  @javax.annotation.Nullable
  private Rules rules;

  public AuthMethodRoleAssociation() {
  }

  public AuthMethodRoleAssociation allowedOps(@javax.annotation.Nullable List<String> allowedOps) {
    this.allowedOps = allowedOps;
    return this;
  }

  public AuthMethodRoleAssociation addAllowedOpsItem(String allowedOpsItem) {
    if (this.allowedOps == null) {
      this.allowedOps = new ArrayList<>();
    }
    this.allowedOps.add(allowedOpsItem);
    return this;
  }

  /**
   * Get allowedOps
   * @return allowedOps
   */
  @javax.annotation.Nullable
  public List<String> getAllowedOps() {
    return allowedOps;
  }

  public void setAllowedOps(@javax.annotation.Nullable List<String> allowedOps) {
    this.allowedOps = allowedOps;
  }


  public AuthMethodRoleAssociation assocId(@javax.annotation.Nullable String assocId) {
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


  public AuthMethodRoleAssociation authMethodSubClaims(@javax.annotation.Nullable Map<String, List<String>> authMethodSubClaims) {
    this.authMethodSubClaims = authMethodSubClaims;
    return this;
  }

  public AuthMethodRoleAssociation putAuthMethodSubClaimsItem(String key, List<String> authMethodSubClaimsItem) {
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


  public AuthMethodRoleAssociation isSubClaimsCaseSensitive(@javax.annotation.Nullable Boolean isSubClaimsCaseSensitive) {
    this.isSubClaimsCaseSensitive = isSubClaimsCaseSensitive;
    return this;
  }

  /**
   * Get isSubClaimsCaseSensitive
   * @return isSubClaimsCaseSensitive
   */
  @javax.annotation.Nullable
  public Boolean getIsSubClaimsCaseSensitive() {
    return isSubClaimsCaseSensitive;
  }

  public void setIsSubClaimsCaseSensitive(@javax.annotation.Nullable Boolean isSubClaimsCaseSensitive) {
    this.isSubClaimsCaseSensitive = isSubClaimsCaseSensitive;
  }


  public AuthMethodRoleAssociation isSubclaimsWithOperator(@javax.annotation.Nullable Boolean isSubclaimsWithOperator) {
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


  public AuthMethodRoleAssociation roleId(@javax.annotation.Nullable Long roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId
   * @return roleId
   */
  @javax.annotation.Nullable
  public Long getRoleId() {
    return roleId;
  }

  public void setRoleId(@javax.annotation.Nullable Long roleId) {
    this.roleId = roleId;
  }


  public AuthMethodRoleAssociation roleName(@javax.annotation.Nullable String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Get roleName
   * @return roleName
   */
  @javax.annotation.Nullable
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(@javax.annotation.Nullable String roleName) {
    this.roleName = roleName;
  }


  public AuthMethodRoleAssociation rules(@javax.annotation.Nullable Rules rules) {
    this.rules = rules;
    return this;
  }

  /**
   * Get rules
   * @return rules
   */
  @javax.annotation.Nullable
  public Rules getRules() {
    return rules;
  }

  public void setRules(@javax.annotation.Nullable Rules rules) {
    this.rules = rules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthMethodRoleAssociation authMethodRoleAssociation = (AuthMethodRoleAssociation) o;
    return Objects.equals(this.allowedOps, authMethodRoleAssociation.allowedOps) &&
        Objects.equals(this.assocId, authMethodRoleAssociation.assocId) &&
        Objects.equals(this.authMethodSubClaims, authMethodRoleAssociation.authMethodSubClaims) &&
        Objects.equals(this.isSubClaimsCaseSensitive, authMethodRoleAssociation.isSubClaimsCaseSensitive) &&
        Objects.equals(this.isSubclaimsWithOperator, authMethodRoleAssociation.isSubclaimsWithOperator) &&
        Objects.equals(this.roleId, authMethodRoleAssociation.roleId) &&
        Objects.equals(this.roleName, authMethodRoleAssociation.roleName) &&
        Objects.equals(this.rules, authMethodRoleAssociation.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedOps, assocId, authMethodSubClaims, isSubClaimsCaseSensitive, isSubclaimsWithOperator, roleId, roleName, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthMethodRoleAssociation {\n");
    sb.append("    allowedOps: ").append(toIndentedString(allowedOps)).append("\n");
    sb.append("    assocId: ").append(toIndentedString(assocId)).append("\n");
    sb.append("    authMethodSubClaims: ").append(toIndentedString(authMethodSubClaims)).append("\n");
    sb.append("    isSubClaimsCaseSensitive: ").append(toIndentedString(isSubClaimsCaseSensitive)).append("\n");
    sb.append("    isSubclaimsWithOperator: ").append(toIndentedString(isSubclaimsWithOperator)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
    openapiFields.add("allowed_ops");
    openapiFields.add("assoc_id");
    openapiFields.add("auth_method_sub_claims");
    openapiFields.add("is_sub_claims_case_sensitive");
    openapiFields.add("is_subclaims_with_operator");
    openapiFields.add("role_id");
    openapiFields.add("role_name");
    openapiFields.add("rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthMethodRoleAssociation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthMethodRoleAssociation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthMethodRoleAssociation is not found in the empty JSON string", AuthMethodRoleAssociation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthMethodRoleAssociation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthMethodRoleAssociation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_ops") != null && !jsonObj.get("allowed_ops").isJsonNull() && !jsonObj.get("allowed_ops").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_ops` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_ops").toString()));
      }
      if ((jsonObj.get("assoc_id") != null && !jsonObj.get("assoc_id").isJsonNull()) && !jsonObj.get("assoc_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assoc_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assoc_id").toString()));
      }
      if ((jsonObj.get("role_name") != null && !jsonObj.get("role_name").isJsonNull()) && !jsonObj.get("role_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role_name").toString()));
      }
      // validate the optional field `rules`
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        Rules.validateJsonElement(jsonObj.get("rules"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthMethodRoleAssociation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthMethodRoleAssociation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthMethodRoleAssociation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthMethodRoleAssociation.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthMethodRoleAssociation>() {
           @Override
           public void write(JsonWriter out, AuthMethodRoleAssociation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthMethodRoleAssociation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthMethodRoleAssociation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthMethodRoleAssociation
   * @throws IOException if the JSON string is invalid with respect to AuthMethodRoleAssociation
   */
  public static AuthMethodRoleAssociation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthMethodRoleAssociation.class);
  }

  /**
   * Convert an instance of AuthMethodRoleAssociation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

