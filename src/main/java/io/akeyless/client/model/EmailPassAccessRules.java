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
 * EmailPassAccessRules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EmailPassAccessRules {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  @javax.annotation.Nullable
  private String alg;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_ENC_EMAIL_WITH_SHARED_KEY = "enc_email_with_shared_key";
  @SerializedName(SERIALIZED_NAME_ENC_EMAIL_WITH_SHARED_KEY)
  @javax.annotation.Nullable
  private String encEmailWithSharedKey;

  public static final String SERIALIZED_NAME_HASH_PASS = "hash_pass";
  @SerializedName(SERIALIZED_NAME_HASH_PASS)
  @javax.annotation.Nullable
  private String hashPass;

  public static final String SERIALIZED_NAME_LAST_RESET_PASSWORD = "last_reset_password";
  @SerializedName(SERIALIZED_NAME_LAST_RESET_PASSWORD)
  @javax.annotation.Nullable
  private OffsetDateTime lastResetPassword;

  public static final String SERIALIZED_NAME_MFA_TYPE = "mfa_type";
  @SerializedName(SERIALIZED_NAME_MFA_TYPE)
  @javax.annotation.Nullable
  private String mfaType;

  public EmailPassAccessRules() {
  }

  public EmailPassAccessRules alg(@javax.annotation.Nullable String alg) {
    this.alg = alg;
    return this;
  }

  /**
   * Get alg
   * @return alg
   */
  @javax.annotation.Nullable
  public String getAlg() {
    return alg;
  }

  public void setAlg(@javax.annotation.Nullable String alg) {
    this.alg = alg;
  }


  public EmailPassAccessRules email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * The Email value
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public EmailPassAccessRules encEmailWithSharedKey(@javax.annotation.Nullable String encEmailWithSharedKey) {
    this.encEmailWithSharedKey = encEmailWithSharedKey;
    return this;
  }

  /**
   * EncEmailWithSharedKey is the email of this auth method, encrypted with the shared auth/uam key (for use in uam)
   * @return encEmailWithSharedKey
   */
  @javax.annotation.Nullable
  public String getEncEmailWithSharedKey() {
    return encEmailWithSharedKey;
  }

  public void setEncEmailWithSharedKey(@javax.annotation.Nullable String encEmailWithSharedKey) {
    this.encEmailWithSharedKey = encEmailWithSharedKey;
  }


  public EmailPassAccessRules hashPass(@javax.annotation.Nullable String hashPass) {
    this.hashPass = hashPass;
    return this;
  }

  /**
   * The password value
   * @return hashPass
   */
  @javax.annotation.Nullable
  public String getHashPass() {
    return hashPass;
  }

  public void setHashPass(@javax.annotation.Nullable String hashPass) {
    this.hashPass = hashPass;
  }


  public EmailPassAccessRules lastResetPassword(@javax.annotation.Nullable OffsetDateTime lastResetPassword) {
    this.lastResetPassword = lastResetPassword;
    return this;
  }

  /**
   * The last password change date
   * @return lastResetPassword
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastResetPassword() {
    return lastResetPassword;
  }

  public void setLastResetPassword(@javax.annotation.Nullable OffsetDateTime lastResetPassword) {
    this.lastResetPassword = lastResetPassword;
  }


  public EmailPassAccessRules mfaType(@javax.annotation.Nullable String mfaType) {
    this.mfaType = mfaType;
    return this;
  }

  /**
   * Get mfaType
   * @return mfaType
   */
  @javax.annotation.Nullable
  public String getMfaType() {
    return mfaType;
  }

  public void setMfaType(@javax.annotation.Nullable String mfaType) {
    this.mfaType = mfaType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailPassAccessRules emailPassAccessRules = (EmailPassAccessRules) o;
    return Objects.equals(this.alg, emailPassAccessRules.alg) &&
        Objects.equals(this.email, emailPassAccessRules.email) &&
        Objects.equals(this.encEmailWithSharedKey, emailPassAccessRules.encEmailWithSharedKey) &&
        Objects.equals(this.hashPass, emailPassAccessRules.hashPass) &&
        Objects.equals(this.lastResetPassword, emailPassAccessRules.lastResetPassword) &&
        Objects.equals(this.mfaType, emailPassAccessRules.mfaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, email, encEmailWithSharedKey, hashPass, lastResetPassword, mfaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailPassAccessRules {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    encEmailWithSharedKey: ").append(toIndentedString(encEmailWithSharedKey)).append("\n");
    sb.append("    hashPass: ").append(toIndentedString(hashPass)).append("\n");
    sb.append("    lastResetPassword: ").append(toIndentedString(lastResetPassword)).append("\n");
    sb.append("    mfaType: ").append(toIndentedString(mfaType)).append("\n");
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
    openapiFields.add("alg");
    openapiFields.add("email");
    openapiFields.add("enc_email_with_shared_key");
    openapiFields.add("hash_pass");
    openapiFields.add("last_reset_password");
    openapiFields.add("mfa_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmailPassAccessRules
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmailPassAccessRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailPassAccessRules is not found in the empty JSON string", EmailPassAccessRules.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmailPassAccessRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailPassAccessRules` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("alg") != null && !jsonObj.get("alg").isJsonNull()) && !jsonObj.get("alg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alg").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("enc_email_with_shared_key") != null && !jsonObj.get("enc_email_with_shared_key").isJsonNull()) && !jsonObj.get("enc_email_with_shared_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enc_email_with_shared_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enc_email_with_shared_key").toString()));
      }
      if ((jsonObj.get("hash_pass") != null && !jsonObj.get("hash_pass").isJsonNull()) && !jsonObj.get("hash_pass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hash_pass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hash_pass").toString()));
      }
      if ((jsonObj.get("mfa_type") != null && !jsonObj.get("mfa_type").isJsonNull()) && !jsonObj.get("mfa_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mfa_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mfa_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailPassAccessRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailPassAccessRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailPassAccessRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailPassAccessRules.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailPassAccessRules>() {
           @Override
           public void write(JsonWriter out, EmailPassAccessRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailPassAccessRules read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmailPassAccessRules given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmailPassAccessRules
   * @throws IOException if the JSON string is invalid with respect to EmailPassAccessRules
   */
  public static EmailPassAccessRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailPassAccessRules.class);
  }

  /**
   * Convert an instance of EmailPassAccessRules to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

