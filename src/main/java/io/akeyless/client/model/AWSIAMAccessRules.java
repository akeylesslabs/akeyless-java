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
 * AWSIAMAccessRules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class AWSIAMAccessRules {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  @javax.annotation.Nullable
  private List<String> accountId = new ArrayList<>();

  public static final String SERIALIZED_NAME_ARN = "arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  @javax.annotation.Nullable
  private List<String> arn = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  @javax.annotation.Nullable
  private List<String> resourceId = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROLE_ID = "role_id";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  @javax.annotation.Nullable
  private List<String> roleId = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROLE_NAME = "role_name";
  @SerializedName(SERIALIZED_NAME_ROLE_NAME)
  @javax.annotation.Nullable
  private List<String> roleName = new ArrayList<>();

  public static final String SERIALIZED_NAME_STS_ENDPOINT = "sts_endpoint";
  @SerializedName(SERIALIZED_NAME_STS_ENDPOINT)
  @javax.annotation.Nullable
  private String stsEndpoint;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique_identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  @javax.annotation.Nullable
  private String uniqueIdentifier;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private List<String> userId = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  @javax.annotation.Nullable
  private List<String> userName = new ArrayList<>();

  public AWSIAMAccessRules() {
  }

  public AWSIAMAccessRules accountId(@javax.annotation.Nullable List<String> accountId) {
    this.accountId = accountId;
    return this;
  }

  public AWSIAMAccessRules addAccountIdItem(String accountIdItem) {
    if (this.accountId == null) {
      this.accountId = new ArrayList<>();
    }
    this.accountId.add(accountIdItem);
    return this;
  }

  /**
   * The list of account ids that the login is restricted to.
   * @return accountId
   */
  @javax.annotation.Nullable
  public List<String> getAccountId() {
    return accountId;
  }

  public void setAccountId(@javax.annotation.Nullable List<String> accountId) {
    this.accountId = accountId;
  }


  public AWSIAMAccessRules arn(@javax.annotation.Nullable List<String> arn) {
    this.arn = arn;
    return this;
  }

  public AWSIAMAccessRules addArnItem(String arnItem) {
    if (this.arn == null) {
      this.arn = new ArrayList<>();
    }
    this.arn.add(arnItem);
    return this;
  }

  /**
   * The list of ARNs that the login is restricted to.
   * @return arn
   */
  @javax.annotation.Nullable
  public List<String> getArn() {
    return arn;
  }

  public void setArn(@javax.annotation.Nullable List<String> arn) {
    this.arn = arn;
  }


  public AWSIAMAccessRules resourceId(@javax.annotation.Nullable List<String> resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public AWSIAMAccessRules addResourceIdItem(String resourceIdItem) {
    if (this.resourceId == null) {
      this.resourceId = new ArrayList<>();
    }
    this.resourceId.add(resourceIdItem);
    return this;
  }

  /**
   * The list of resource ids that the login is restricted to.
   * @return resourceId
   */
  @javax.annotation.Nullable
  public List<String> getResourceId() {
    return resourceId;
  }

  public void setResourceId(@javax.annotation.Nullable List<String> resourceId) {
    this.resourceId = resourceId;
  }


  public AWSIAMAccessRules roleId(@javax.annotation.Nullable List<String> roleId) {
    this.roleId = roleId;
    return this;
  }

  public AWSIAMAccessRules addRoleIdItem(String roleIdItem) {
    if (this.roleId == null) {
      this.roleId = new ArrayList<>();
    }
    this.roleId.add(roleIdItem);
    return this;
  }

  /**
   * The list of role ids that the login is restricted to.
   * @return roleId
   */
  @javax.annotation.Nullable
  public List<String> getRoleId() {
    return roleId;
  }

  public void setRoleId(@javax.annotation.Nullable List<String> roleId) {
    this.roleId = roleId;
  }


  public AWSIAMAccessRules roleName(@javax.annotation.Nullable List<String> roleName) {
    this.roleName = roleName;
    return this;
  }

  public AWSIAMAccessRules addRoleNameItem(String roleNameItem) {
    if (this.roleName == null) {
      this.roleName = new ArrayList<>();
    }
    this.roleName.add(roleNameItem);
    return this;
  }

  /**
   * The list of role names that the login is restricted to.
   * @return roleName
   */
  @javax.annotation.Nullable
  public List<String> getRoleName() {
    return roleName;
  }

  public void setRoleName(@javax.annotation.Nullable List<String> roleName) {
    this.roleName = roleName;
  }


  public AWSIAMAccessRules stsEndpoint(@javax.annotation.Nullable String stsEndpoint) {
    this.stsEndpoint = stsEndpoint;
    return this;
  }

  /**
   * The sts URL.
   * @return stsEndpoint
   */
  @javax.annotation.Nullable
  public String getStsEndpoint() {
    return stsEndpoint;
  }

  public void setStsEndpoint(@javax.annotation.Nullable String stsEndpoint) {
    this.stsEndpoint = stsEndpoint;
  }


  public AWSIAMAccessRules uniqueIdentifier(@javax.annotation.Nullable String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

  /**
   * A unique identifier to distinguish different users
   * @return uniqueIdentifier
   */
  @javax.annotation.Nullable
  public String getUniqueIdentifier() {
    return uniqueIdentifier;
  }

  public void setUniqueIdentifier(@javax.annotation.Nullable String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }


  public AWSIAMAccessRules userId(@javax.annotation.Nullable List<String> userId) {
    this.userId = userId;
    return this;
  }

  public AWSIAMAccessRules addUserIdItem(String userIdItem) {
    if (this.userId == null) {
      this.userId = new ArrayList<>();
    }
    this.userId.add(userIdItem);
    return this;
  }

  /**
   * The list of user ids that the login is restricted to.
   * @return userId
   */
  @javax.annotation.Nullable
  public List<String> getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nullable List<String> userId) {
    this.userId = userId;
  }


  public AWSIAMAccessRules userName(@javax.annotation.Nullable List<String> userName) {
    this.userName = userName;
    return this;
  }

  public AWSIAMAccessRules addUserNameItem(String userNameItem) {
    if (this.userName == null) {
      this.userName = new ArrayList<>();
    }
    this.userName.add(userNameItem);
    return this;
  }

  /**
   * The list of user names that the login is restricted to.
   * @return userName
   */
  @javax.annotation.Nullable
  public List<String> getUserName() {
    return userName;
  }

  public void setUserName(@javax.annotation.Nullable List<String> userName) {
    this.userName = userName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSIAMAccessRules awSIAMAccessRules = (AWSIAMAccessRules) o;
    return Objects.equals(this.accountId, awSIAMAccessRules.accountId) &&
        Objects.equals(this.arn, awSIAMAccessRules.arn) &&
        Objects.equals(this.resourceId, awSIAMAccessRules.resourceId) &&
        Objects.equals(this.roleId, awSIAMAccessRules.roleId) &&
        Objects.equals(this.roleName, awSIAMAccessRules.roleName) &&
        Objects.equals(this.stsEndpoint, awSIAMAccessRules.stsEndpoint) &&
        Objects.equals(this.uniqueIdentifier, awSIAMAccessRules.uniqueIdentifier) &&
        Objects.equals(this.userId, awSIAMAccessRules.userId) &&
        Objects.equals(this.userName, awSIAMAccessRules.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, arn, resourceId, roleId, roleName, stsEndpoint, uniqueIdentifier, userId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSIAMAccessRules {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    stsEndpoint: ").append(toIndentedString(stsEndpoint)).append("\n");
    sb.append("    uniqueIdentifier: ").append(toIndentedString(uniqueIdentifier)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("arn");
    openapiFields.add("resource_id");
    openapiFields.add("role_id");
    openapiFields.add("role_name");
    openapiFields.add("sts_endpoint");
    openapiFields.add("unique_identifier");
    openapiFields.add("user_id");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AWSIAMAccessRules
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AWSIAMAccessRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AWSIAMAccessRules is not found in the empty JSON string", AWSIAMAccessRules.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AWSIAMAccessRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AWSIAMAccessRules` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonNull() && !jsonObj.get("account_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be an array in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("arn") != null && !jsonObj.get("arn").isJsonNull() && !jsonObj.get("arn").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `arn` to be an array in the JSON string but got `%s`", jsonObj.get("arn").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("resource_id") != null && !jsonObj.get("resource_id").isJsonNull() && !jsonObj.get("resource_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_id` to be an array in the JSON string but got `%s`", jsonObj.get("resource_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("role_id") != null && !jsonObj.get("role_id").isJsonNull() && !jsonObj.get("role_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_id` to be an array in the JSON string but got `%s`", jsonObj.get("role_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("role_name") != null && !jsonObj.get("role_name").isJsonNull() && !jsonObj.get("role_name").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_name` to be an array in the JSON string but got `%s`", jsonObj.get("role_name").toString()));
      }
      if ((jsonObj.get("sts_endpoint") != null && !jsonObj.get("sts_endpoint").isJsonNull()) && !jsonObj.get("sts_endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sts_endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sts_endpoint").toString()));
      }
      if ((jsonObj.get("unique_identifier") != null && !jsonObj.get("unique_identifier").isJsonNull()) && !jsonObj.get("unique_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_identifier").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonNull() && !jsonObj.get("user_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be an array in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("user_name") != null && !jsonObj.get("user_name").isJsonNull() && !jsonObj.get("user_name").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be an array in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AWSIAMAccessRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AWSIAMAccessRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AWSIAMAccessRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AWSIAMAccessRules.class));

       return (TypeAdapter<T>) new TypeAdapter<AWSIAMAccessRules>() {
           @Override
           public void write(JsonWriter out, AWSIAMAccessRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AWSIAMAccessRules read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AWSIAMAccessRules given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AWSIAMAccessRules
   * @throws IOException if the JSON string is invalid with respect to AWSIAMAccessRules
   */
  public static AWSIAMAccessRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AWSIAMAccessRules.class);
  }

  /**
   * Convert an instance of AWSIAMAccessRules to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

