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
 * GlobalSignGCCTargetDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GlobalSignGCCTargetDetails {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  @javax.annotation.Nullable
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  @javax.annotation.Nullable
  private String lastName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  @javax.annotation.Nullable
  private String password;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  @javax.annotation.Nullable
  private String phone;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profile_id";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  @javax.annotation.Nullable
  private String profileId;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  @javax.annotation.Nullable
  private Long timeout;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  @javax.annotation.Nullable
  private String username;

  public GlobalSignGCCTargetDetails() {
  }

  public GlobalSignGCCTargetDetails email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public GlobalSignGCCTargetDetails firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Contact Info - GlobalSign requires this to be sent with every certificate creation request
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }


  public GlobalSignGCCTargetDetails lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }


  public GlobalSignGCCTargetDetails password(@javax.annotation.Nullable String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = password;
  }


  public GlobalSignGCCTargetDetails phone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
  }


  public GlobalSignGCCTargetDetails profileId(@javax.annotation.Nullable String profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * Get profileId
   * @return profileId
   */
  @javax.annotation.Nullable
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(@javax.annotation.Nullable String profileId) {
    this.profileId = profileId;
  }


  public GlobalSignGCCTargetDetails timeout(@javax.annotation.Nullable Long timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years.
   * @return timeout
   */
  @javax.annotation.Nullable
  public Long getTimeout() {
    return timeout;
  }

  public void setTimeout(@javax.annotation.Nullable Long timeout) {
    this.timeout = timeout;
  }


  public GlobalSignGCCTargetDetails username(@javax.annotation.Nullable String username) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalSignGCCTargetDetails globalSignGCCTargetDetails = (GlobalSignGCCTargetDetails) o;
    return Objects.equals(this.email, globalSignGCCTargetDetails.email) &&
        Objects.equals(this.firstName, globalSignGCCTargetDetails.firstName) &&
        Objects.equals(this.lastName, globalSignGCCTargetDetails.lastName) &&
        Objects.equals(this.password, globalSignGCCTargetDetails.password) &&
        Objects.equals(this.phone, globalSignGCCTargetDetails.phone) &&
        Objects.equals(this.profileId, globalSignGCCTargetDetails.profileId) &&
        Objects.equals(this.timeout, globalSignGCCTargetDetails.timeout) &&
        Objects.equals(this.username, globalSignGCCTargetDetails.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, lastName, password, phone, profileId, timeout, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalSignGCCTargetDetails {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("password");
    openapiFields.add("phone");
    openapiFields.add("profile_id");
    openapiFields.add("timeout");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GlobalSignGCCTargetDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GlobalSignGCCTargetDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GlobalSignGCCTargetDetails is not found in the empty JSON string", GlobalSignGCCTargetDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GlobalSignGCCTargetDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GlobalSignGCCTargetDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("profile_id") != null && !jsonObj.get("profile_id").isJsonNull()) && !jsonObj.get("profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_id").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GlobalSignGCCTargetDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GlobalSignGCCTargetDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GlobalSignGCCTargetDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GlobalSignGCCTargetDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<GlobalSignGCCTargetDetails>() {
           @Override
           public void write(JsonWriter out, GlobalSignGCCTargetDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GlobalSignGCCTargetDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GlobalSignGCCTargetDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GlobalSignGCCTargetDetails
   * @throws IOException if the JSON string is invalid with respect to GlobalSignGCCTargetDetails
   */
  public static GlobalSignGCCTargetDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GlobalSignGCCTargetDetails.class);
  }

  /**
   * Convert an instance of GlobalSignGCCTargetDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

