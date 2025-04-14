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
 * GetSSHCertificate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GetSSHCertificate {
  public static final String SERIALIZED_NAME_CERT_ISSUER_NAME = "cert-issuer-name";
  @SerializedName(SERIALIZED_NAME_CERT_ISSUER_NAME)
  @javax.annotation.Nonnull
  private String certIssuerName;

  public static final String SERIALIZED_NAME_CERT_USERNAME = "cert-username";
  @SerializedName(SERIALIZED_NAME_CERT_USERNAME)
  @javax.annotation.Nonnull
  private String certUsername = "-";

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_LEGACY_SIGNING_ALG_NAME = "legacy-signing-alg-name";
  @SerializedName(SERIALIZED_NAME_LEGACY_SIGNING_ALG_NAME)
  @javax.annotation.Nullable
  private Boolean legacySigningAlgName = false;

  public static final String SERIALIZED_NAME_PUBLIC_KEY_DATA = "public-key-data";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_DATA)
  @javax.annotation.Nullable
  private String publicKeyData;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  @javax.annotation.Nullable
  private Long ttl;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public GetSSHCertificate() {
  }

  public GetSSHCertificate certIssuerName(@javax.annotation.Nonnull String certIssuerName) {
    this.certIssuerName = certIssuerName;
    return this;
  }

  /**
   * The name of the SSH certificate issuer
   * @return certIssuerName
   */
  @javax.annotation.Nonnull
  public String getCertIssuerName() {
    return certIssuerName;
  }

  public void setCertIssuerName(@javax.annotation.Nonnull String certIssuerName) {
    this.certIssuerName = certIssuerName;
  }


  public GetSSHCertificate certUsername(@javax.annotation.Nonnull String certUsername) {
    this.certUsername = certUsername;
    return this;
  }

  /**
   * The username to sign in the SSH certificate
   * @return certUsername
   */
  @javax.annotation.Nonnull
  public String getCertUsername() {
    return certUsername;
  }

  public void setCertUsername(@javax.annotation.Nonnull String certUsername) {
    this.certUsername = certUsername;
  }


  public GetSSHCertificate json(@javax.annotation.Nullable Boolean json) {
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


  public GetSSHCertificate legacySigningAlgName(@javax.annotation.Nullable Boolean legacySigningAlgName) {
    this.legacySigningAlgName = legacySigningAlgName;
    return this;
  }

  /**
   * Set this option to output legacy (&#39;ssh-rsa-cert-v01@openssh.com&#39;) signing algorithm name in the certificate.
   * @return legacySigningAlgName
   */
  @javax.annotation.Nullable
  public Boolean getLegacySigningAlgName() {
    return legacySigningAlgName;
  }

  public void setLegacySigningAlgName(@javax.annotation.Nullable Boolean legacySigningAlgName) {
    this.legacySigningAlgName = legacySigningAlgName;
  }


  public GetSSHCertificate publicKeyData(@javax.annotation.Nullable String publicKeyData) {
    this.publicKeyData = publicKeyData;
    return this;
  }

  /**
   * SSH public key file contents. If this option is used, the certificate will be printed to stdout
   * @return publicKeyData
   */
  @javax.annotation.Nullable
  public String getPublicKeyData() {
    return publicKeyData;
  }

  public void setPublicKeyData(@javax.annotation.Nullable String publicKeyData) {
    this.publicKeyData = publicKeyData;
  }


  public GetSSHCertificate token(@javax.annotation.Nullable String token) {
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


  public GetSSHCertificate ttl(@javax.annotation.Nullable Long ttl) {
    this.ttl = ttl;
    return this;
  }

  /**
   * Updated certificate lifetime in seconds (must be less than the Certificate Issuer default TTL)
   * @return ttl
   */
  @javax.annotation.Nullable
  public Long getTtl() {
    return ttl;
  }

  public void setTtl(@javax.annotation.Nullable Long ttl) {
    this.ttl = ttl;
  }


  public GetSSHCertificate uidToken(@javax.annotation.Nullable String uidToken) {
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
    GetSSHCertificate getSSHCertificate = (GetSSHCertificate) o;
    return Objects.equals(this.certIssuerName, getSSHCertificate.certIssuerName) &&
        Objects.equals(this.certUsername, getSSHCertificate.certUsername) &&
        Objects.equals(this.json, getSSHCertificate.json) &&
        Objects.equals(this.legacySigningAlgName, getSSHCertificate.legacySigningAlgName) &&
        Objects.equals(this.publicKeyData, getSSHCertificate.publicKeyData) &&
        Objects.equals(this.token, getSSHCertificate.token) &&
        Objects.equals(this.ttl, getSSHCertificate.ttl) &&
        Objects.equals(this.uidToken, getSSHCertificate.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certIssuerName, certUsername, json, legacySigningAlgName, publicKeyData, token, ttl, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSSHCertificate {\n");
    sb.append("    certIssuerName: ").append(toIndentedString(certIssuerName)).append("\n");
    sb.append("    certUsername: ").append(toIndentedString(certUsername)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    legacySigningAlgName: ").append(toIndentedString(legacySigningAlgName)).append("\n");
    sb.append("    publicKeyData: ").append(toIndentedString(publicKeyData)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
    openapiFields.add("cert-issuer-name");
    openapiFields.add("cert-username");
    openapiFields.add("json");
    openapiFields.add("legacy-signing-alg-name");
    openapiFields.add("public-key-data");
    openapiFields.add("token");
    openapiFields.add("ttl");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cert-issuer-name");
    openapiRequiredFields.add("cert-username");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetSSHCertificate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetSSHCertificate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetSSHCertificate is not found in the empty JSON string", GetSSHCertificate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetSSHCertificate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetSSHCertificate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetSSHCertificate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("cert-issuer-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert-issuer-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert-issuer-name").toString()));
      }
      if (!jsonObj.get("cert-username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert-username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert-username").toString()));
      }
      if ((jsonObj.get("public-key-data") != null && !jsonObj.get("public-key-data").isJsonNull()) && !jsonObj.get("public-key-data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public-key-data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public-key-data").toString()));
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
       if (!GetSSHCertificate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetSSHCertificate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetSSHCertificate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetSSHCertificate.class));

       return (TypeAdapter<T>) new TypeAdapter<GetSSHCertificate>() {
           @Override
           public void write(JsonWriter out, GetSSHCertificate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetSSHCertificate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetSSHCertificate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetSSHCertificate
   * @throws IOException if the JSON string is invalid with respect to GetSSHCertificate
   */
  public static GetSSHCertificate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetSSHCertificate.class);
  }

  /**
   * Convert an instance of GetSSHCertificate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

