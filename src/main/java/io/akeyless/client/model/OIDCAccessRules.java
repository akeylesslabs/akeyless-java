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
import io.akeyless.client.model.OIDCCustomClaim;
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
 * OIDCAccessRules contains access rules specific to Open Id Connect authentication method.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class OIDCAccessRules {
  public static final String SERIALIZED_NAME_ALLOWED_REDIRECT_U_R_IS = "allowed_redirect_URIs";
  @SerializedName(SERIALIZED_NAME_ALLOWED_REDIRECT_U_R_IS)
  @javax.annotation.Nullable
  private List<String> allowedRedirectURIs = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  @javax.annotation.Nullable
  private String audience;

  public static final String SERIALIZED_NAME_BOUND_CLAIMS = "bound_claims";
  @SerializedName(SERIALIZED_NAME_BOUND_CLAIMS)
  @javax.annotation.Nullable
  private List<OIDCCustomClaim> boundClaims = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  @javax.annotation.Nullable
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  @javax.annotation.Nullable
  private String clientSecret;

  public static final String SERIALIZED_NAME_IS_INTERNAL = "is_internal";
  @SerializedName(SERIALIZED_NAME_IS_INTERNAL)
  @javax.annotation.Nullable
  private Boolean isInternal;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  @javax.annotation.Nullable
  private String issuer;

  public static final String SERIALIZED_NAME_REQUIRED_SCOPES = "required_scopes";
  @SerializedName(SERIALIZED_NAME_REQUIRED_SCOPES)
  @javax.annotation.Nullable
  private List<String> requiredScopes = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUIRED_SCOPES_PREFIX = "required_scopes_prefix";
  @SerializedName(SERIALIZED_NAME_REQUIRED_SCOPES_PREFIX)
  @javax.annotation.Nullable
  private String requiredScopesPrefix;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique_identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  @javax.annotation.Nullable
  private String uniqueIdentifier;

  public OIDCAccessRules() {
  }

  public OIDCAccessRules allowedRedirectURIs(@javax.annotation.Nullable List<String> allowedRedirectURIs) {
    this.allowedRedirectURIs = allowedRedirectURIs;
    return this;
  }

  public OIDCAccessRules addAllowedRedirectURIsItem(String allowedRedirectURIsItem) {
    if (this.allowedRedirectURIs == null) {
      this.allowedRedirectURIs = new ArrayList<>();
    }
    this.allowedRedirectURIs.add(allowedRedirectURIsItem);
    return this;
  }

  /**
   * Allowed redirect URIs after the authentication
   * @return allowedRedirectURIs
   */
  @javax.annotation.Nullable
  public List<String> getAllowedRedirectURIs() {
    return allowedRedirectURIs;
  }

  public void setAllowedRedirectURIs(@javax.annotation.Nullable List<String> allowedRedirectURIs) {
    this.allowedRedirectURIs = allowedRedirectURIs;
  }


  public OIDCAccessRules audience(@javax.annotation.Nullable String audience) {
    this.audience = audience;
    return this;
  }

  /**
   * Audience claim to be used as part of the authentication flow. In case set, it must match the one configured on the Identity Provider&#39;s Application
   * @return audience
   */
  @javax.annotation.Nullable
  public String getAudience() {
    return audience;
  }

  public void setAudience(@javax.annotation.Nullable String audience) {
    this.audience = audience;
  }


  public OIDCAccessRules boundClaims(@javax.annotation.Nullable List<OIDCCustomClaim> boundClaims) {
    this.boundClaims = boundClaims;
    return this;
  }

  public OIDCAccessRules addBoundClaimsItem(OIDCCustomClaim boundClaimsItem) {
    if (this.boundClaims == null) {
      this.boundClaims = new ArrayList<>();
    }
    this.boundClaims.add(boundClaimsItem);
    return this;
  }

  /**
   * The claims that login is restricted to.
   * @return boundClaims
   */
  @javax.annotation.Nullable
  public List<OIDCCustomClaim> getBoundClaims() {
    return boundClaims;
  }

  public void setBoundClaims(@javax.annotation.Nullable List<OIDCCustomClaim> boundClaims) {
    this.boundClaims = boundClaims;
  }


  public OIDCAccessRules clientId(@javax.annotation.Nullable String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Client ID
   * @return clientId
   */
  @javax.annotation.Nullable
  public String getClientId() {
    return clientId;
  }

  public void setClientId(@javax.annotation.Nullable String clientId) {
    this.clientId = clientId;
  }


  public OIDCAccessRules clientSecret(@javax.annotation.Nullable String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Client Secret
   * @return clientSecret
   */
  @javax.annotation.Nullable
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(@javax.annotation.Nullable String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public OIDCAccessRules isInternal(@javax.annotation.Nullable Boolean isInternal) {
    this.isInternal = isInternal;
    return this;
  }

  /**
   * IsInternal indicates whether this is an internal Auth Method where the client has no control over it, or it was created by the client e.g - Sign In with Google will create an OIDC Auth Method with IsInternal&#x3D;true
   * @return isInternal
   */
  @javax.annotation.Nullable
  public Boolean getIsInternal() {
    return isInternal;
  }

  public void setIsInternal(@javax.annotation.Nullable Boolean isInternal) {
    this.isInternal = isInternal;
  }


  public OIDCAccessRules issuer(@javax.annotation.Nullable String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Issuer URL
   * @return issuer
   */
  @javax.annotation.Nullable
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(@javax.annotation.Nullable String issuer) {
    this.issuer = issuer;
  }


  public OIDCAccessRules requiredScopes(@javax.annotation.Nullable List<String> requiredScopes) {
    this.requiredScopes = requiredScopes;
    return this;
  }

  public OIDCAccessRules addRequiredScopesItem(String requiredScopesItem) {
    if (this.requiredScopes == null) {
      this.requiredScopes = new ArrayList<>();
    }
    this.requiredScopes.add(requiredScopesItem);
    return this;
  }

  /**
   * A list of required scopes to request from the oidc provider, and to check on the token
   * @return requiredScopes
   */
  @javax.annotation.Nullable
  public List<String> getRequiredScopes() {
    return requiredScopes;
  }

  public void setRequiredScopes(@javax.annotation.Nullable List<String> requiredScopes) {
    this.requiredScopes = requiredScopes;
  }


  public OIDCAccessRules requiredScopesPrefix(@javax.annotation.Nullable String requiredScopesPrefix) {
    this.requiredScopesPrefix = requiredScopesPrefix;
    return this;
  }

  /**
   * A prefix to add to the required scopes (for example, azures&#39; Application ID URI)
   * @return requiredScopesPrefix
   */
  @javax.annotation.Nullable
  public String getRequiredScopesPrefix() {
    return requiredScopesPrefix;
  }

  public void setRequiredScopesPrefix(@javax.annotation.Nullable String requiredScopesPrefix) {
    this.requiredScopesPrefix = requiredScopesPrefix;
  }


  public OIDCAccessRules uniqueIdentifier(@javax.annotation.Nullable String uniqueIdentifier) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCAccessRules oiDCAccessRules = (OIDCAccessRules) o;
    return Objects.equals(this.allowedRedirectURIs, oiDCAccessRules.allowedRedirectURIs) &&
        Objects.equals(this.audience, oiDCAccessRules.audience) &&
        Objects.equals(this.boundClaims, oiDCAccessRules.boundClaims) &&
        Objects.equals(this.clientId, oiDCAccessRules.clientId) &&
        Objects.equals(this.clientSecret, oiDCAccessRules.clientSecret) &&
        Objects.equals(this.isInternal, oiDCAccessRules.isInternal) &&
        Objects.equals(this.issuer, oiDCAccessRules.issuer) &&
        Objects.equals(this.requiredScopes, oiDCAccessRules.requiredScopes) &&
        Objects.equals(this.requiredScopesPrefix, oiDCAccessRules.requiredScopesPrefix) &&
        Objects.equals(this.uniqueIdentifier, oiDCAccessRules.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedRedirectURIs, audience, boundClaims, clientId, clientSecret, isInternal, issuer, requiredScopes, requiredScopesPrefix, uniqueIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCAccessRules {\n");
    sb.append("    allowedRedirectURIs: ").append(toIndentedString(allowedRedirectURIs)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    boundClaims: ").append(toIndentedString(boundClaims)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    isInternal: ").append(toIndentedString(isInternal)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    requiredScopes: ").append(toIndentedString(requiredScopes)).append("\n");
    sb.append("    requiredScopesPrefix: ").append(toIndentedString(requiredScopesPrefix)).append("\n");
    sb.append("    uniqueIdentifier: ").append(toIndentedString(uniqueIdentifier)).append("\n");
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
    openapiFields.add("allowed_redirect_URIs");
    openapiFields.add("audience");
    openapiFields.add("bound_claims");
    openapiFields.add("client_id");
    openapiFields.add("client_secret");
    openapiFields.add("is_internal");
    openapiFields.add("issuer");
    openapiFields.add("required_scopes");
    openapiFields.add("required_scopes_prefix");
    openapiFields.add("unique_identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OIDCAccessRules
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OIDCAccessRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OIDCAccessRules is not found in the empty JSON string", OIDCAccessRules.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OIDCAccessRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OIDCAccessRules` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_redirect_URIs") != null && !jsonObj.get("allowed_redirect_URIs").isJsonNull() && !jsonObj.get("allowed_redirect_URIs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_redirect_URIs` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_redirect_URIs").toString()));
      }
      if ((jsonObj.get("audience") != null && !jsonObj.get("audience").isJsonNull()) && !jsonObj.get("audience").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audience` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audience").toString()));
      }
      if (jsonObj.get("bound_claims") != null && !jsonObj.get("bound_claims").isJsonNull()) {
        JsonArray jsonArrayboundClaims = jsonObj.getAsJsonArray("bound_claims");
        if (jsonArrayboundClaims != null) {
          // ensure the json data is an array
          if (!jsonObj.get("bound_claims").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `bound_claims` to be an array in the JSON string but got `%s`", jsonObj.get("bound_claims").toString()));
          }

          // validate the optional field `bound_claims` (array)
          for (int i = 0; i < jsonArrayboundClaims.size(); i++) {
            OIDCCustomClaim.validateJsonElement(jsonArrayboundClaims.get(i));
          };
        }
      }
      if ((jsonObj.get("client_id") != null && !jsonObj.get("client_id").isJsonNull()) && !jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      if ((jsonObj.get("client_secret") != null && !jsonObj.get("client_secret").isJsonNull()) && !jsonObj.get("client_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_secret").toString()));
      }
      if ((jsonObj.get("issuer") != null && !jsonObj.get("issuer").isJsonNull()) && !jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("required_scopes") != null && !jsonObj.get("required_scopes").isJsonNull() && !jsonObj.get("required_scopes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `required_scopes` to be an array in the JSON string but got `%s`", jsonObj.get("required_scopes").toString()));
      }
      if ((jsonObj.get("required_scopes_prefix") != null && !jsonObj.get("required_scopes_prefix").isJsonNull()) && !jsonObj.get("required_scopes_prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `required_scopes_prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("required_scopes_prefix").toString()));
      }
      if ((jsonObj.get("unique_identifier") != null && !jsonObj.get("unique_identifier").isJsonNull()) && !jsonObj.get("unique_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OIDCAccessRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OIDCAccessRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OIDCAccessRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OIDCAccessRules.class));

       return (TypeAdapter<T>) new TypeAdapter<OIDCAccessRules>() {
           @Override
           public void write(JsonWriter out, OIDCAccessRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OIDCAccessRules read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OIDCAccessRules given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OIDCAccessRules
   * @throws IOException if the JSON string is invalid with respect to OIDCAccessRules
   */
  public static OIDCAccessRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OIDCAccessRules.class);
  }

  /**
   * Convert an instance of OIDCAccessRules to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

