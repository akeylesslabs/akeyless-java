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
 * HuaweiAccessRules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class HuaweiAccessRules {
  public static final String SERIALIZED_NAME_AUTH_ENDPOINT = "auth_endpoint";
  @SerializedName(SERIALIZED_NAME_AUTH_ENDPOINT)
  @javax.annotation.Nullable
  private String authEndpoint;

  public static final String SERIALIZED_NAME_DOMAIN_ID = "domain_id";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ID)
  @javax.annotation.Nullable
  private List<String> domainId = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domain_name";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  @javax.annotation.Nullable
  private List<String> domainName = new ArrayList<>();

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  @javax.annotation.Nullable
  private List<String> tenantId = new ArrayList<>();

  public static final String SERIALIZED_NAME_TENANT_NAME = "tenant_name";
  @SerializedName(SERIALIZED_NAME_TENANT_NAME)
  @javax.annotation.Nullable
  private List<String> tenantName = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private List<String> userId = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  @javax.annotation.Nullable
  private List<String> userName = new ArrayList<>();

  public HuaweiAccessRules() {
  }

  public HuaweiAccessRules authEndpoint(@javax.annotation.Nullable String authEndpoint) {
    this.authEndpoint = authEndpoint;
    return this;
  }

  /**
   * The auth URL.
   * @return authEndpoint
   */
  @javax.annotation.Nullable
  public String getAuthEndpoint() {
    return authEndpoint;
  }

  public void setAuthEndpoint(@javax.annotation.Nullable String authEndpoint) {
    this.authEndpoint = authEndpoint;
  }


  public HuaweiAccessRules domainId(@javax.annotation.Nullable List<String> domainId) {
    this.domainId = domainId;
    return this;
  }

  public HuaweiAccessRules addDomainIdItem(String domainIdItem) {
    if (this.domainId == null) {
      this.domainId = new ArrayList<>();
    }
    this.domainId.add(domainIdItem);
    return this;
  }

  /**
   * The list of domain ids that the login is restricted to.
   * @return domainId
   */
  @javax.annotation.Nullable
  public List<String> getDomainId() {
    return domainId;
  }

  public void setDomainId(@javax.annotation.Nullable List<String> domainId) {
    this.domainId = domainId;
  }


  public HuaweiAccessRules domainName(@javax.annotation.Nullable List<String> domainName) {
    this.domainName = domainName;
    return this;
  }

  public HuaweiAccessRules addDomainNameItem(String domainNameItem) {
    if (this.domainName == null) {
      this.domainName = new ArrayList<>();
    }
    this.domainName.add(domainNameItem);
    return this;
  }

  /**
   * The list of domainNames that the login is restricted to.
   * @return domainName
   */
  @javax.annotation.Nullable
  public List<String> getDomainName() {
    return domainName;
  }

  public void setDomainName(@javax.annotation.Nullable List<String> domainName) {
    this.domainName = domainName;
  }


  public HuaweiAccessRules tenantId(@javax.annotation.Nullable List<String> tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  public HuaweiAccessRules addTenantIdItem(String tenantIdItem) {
    if (this.tenantId == null) {
      this.tenantId = new ArrayList<>();
    }
    this.tenantId.add(tenantIdItem);
    return this;
  }

  /**
   * The list of tenantIDs  that the login is restricted to.
   * @return tenantId
   */
  @javax.annotation.Nullable
  public List<String> getTenantId() {
    return tenantId;
  }

  public void setTenantId(@javax.annotation.Nullable List<String> tenantId) {
    this.tenantId = tenantId;
  }


  public HuaweiAccessRules tenantName(@javax.annotation.Nullable List<String> tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  public HuaweiAccessRules addTenantNameItem(String tenantNameItem) {
    if (this.tenantName == null) {
      this.tenantName = new ArrayList<>();
    }
    this.tenantName.add(tenantNameItem);
    return this;
  }

  /**
   * The list of tenantNames  that the login is restricted to.
   * @return tenantName
   */
  @javax.annotation.Nullable
  public List<String> getTenantName() {
    return tenantName;
  }

  public void setTenantName(@javax.annotation.Nullable List<String> tenantName) {
    this.tenantName = tenantName;
  }


  public HuaweiAccessRules userId(@javax.annotation.Nullable List<String> userId) {
    this.userId = userId;
    return this;
  }

  public HuaweiAccessRules addUserIdItem(String userIdItem) {
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


  public HuaweiAccessRules userName(@javax.annotation.Nullable List<String> userName) {
    this.userName = userName;
    return this;
  }

  public HuaweiAccessRules addUserNameItem(String userNameItem) {
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
    HuaweiAccessRules huaweiAccessRules = (HuaweiAccessRules) o;
    return Objects.equals(this.authEndpoint, huaweiAccessRules.authEndpoint) &&
        Objects.equals(this.domainId, huaweiAccessRules.domainId) &&
        Objects.equals(this.domainName, huaweiAccessRules.domainName) &&
        Objects.equals(this.tenantId, huaweiAccessRules.tenantId) &&
        Objects.equals(this.tenantName, huaweiAccessRules.tenantName) &&
        Objects.equals(this.userId, huaweiAccessRules.userId) &&
        Objects.equals(this.userName, huaweiAccessRules.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authEndpoint, domainId, domainName, tenantId, tenantName, userId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HuaweiAccessRules {\n");
    sb.append("    authEndpoint: ").append(toIndentedString(authEndpoint)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
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
    openapiFields.add("auth_endpoint");
    openapiFields.add("domain_id");
    openapiFields.add("domain_name");
    openapiFields.add("tenant_id");
    openapiFields.add("tenant_name");
    openapiFields.add("user_id");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HuaweiAccessRules
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HuaweiAccessRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HuaweiAccessRules is not found in the empty JSON string", HuaweiAccessRules.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HuaweiAccessRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HuaweiAccessRules` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("auth_endpoint") != null && !jsonObj.get("auth_endpoint").isJsonNull()) && !jsonObj.get("auth_endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_endpoint").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("domain_id") != null && !jsonObj.get("domain_id").isJsonNull() && !jsonObj.get("domain_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain_id` to be an array in the JSON string but got `%s`", jsonObj.get("domain_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("domain_name") != null && !jsonObj.get("domain_name").isJsonNull() && !jsonObj.get("domain_name").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain_name` to be an array in the JSON string but got `%s`", jsonObj.get("domain_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tenant_id") != null && !jsonObj.get("tenant_id").isJsonNull() && !jsonObj.get("tenant_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_id` to be an array in the JSON string but got `%s`", jsonObj.get("tenant_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tenant_name") != null && !jsonObj.get("tenant_name").isJsonNull() && !jsonObj.get("tenant_name").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_name` to be an array in the JSON string but got `%s`", jsonObj.get("tenant_name").toString()));
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
       if (!HuaweiAccessRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HuaweiAccessRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HuaweiAccessRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HuaweiAccessRules.class));

       return (TypeAdapter<T>) new TypeAdapter<HuaweiAccessRules>() {
           @Override
           public void write(JsonWriter out, HuaweiAccessRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HuaweiAccessRules read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HuaweiAccessRules given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HuaweiAccessRules
   * @throws IOException if the JSON string is invalid with respect to HuaweiAccessRules
   */
  public static HuaweiAccessRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HuaweiAccessRules.class);
  }

  /**
   * Convert an instance of HuaweiAccessRules to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

