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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CreateSSHCertIssuer
 */

public class CreateSSHCertIssuer {
  public static final String SERIALIZED_NAME_ALLOWED_USERS = "allowed-users";
  @SerializedName(SERIALIZED_NAME_ALLOWED_USERS)
  private String allowedUsers;

  public static final String SERIALIZED_NAME_EXTENSIONS = "extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  private Map<String, String> extensions = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PRINCIPALS = "principals";
  @SerializedName(SERIALIZED_NAME_PRINCIPALS)
  private String principals;

  public static final String SERIALIZED_NAME_SIGNER_KEY_NAME = "signer-key-name";
  @SerializedName(SERIALIZED_NAME_SIGNER_KEY_NAME)
  private String signerKeyName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private Long ttl;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public CreateSSHCertIssuer allowedUsers(String allowedUsers) {
    
    this.allowedUsers = allowedUsers;
    return this;
  }

   /**
   * Users allowed to fetch the certificate, e.g root,ubuntu
   * @return allowedUsers
  **/
  @ApiModelProperty(required = true, value = "Users allowed to fetch the certificate, e.g root,ubuntu")

  public String getAllowedUsers() {
    return allowedUsers;
  }


  public void setAllowedUsers(String allowedUsers) {
    this.allowedUsers = allowedUsers;
  }


  public CreateSSHCertIssuer extensions(Map<String, String> extensions) {
    
    this.extensions = extensions;
    return this;
  }

  public CreateSSHCertIssuer putExtensionsItem(String key, String extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new HashMap<String, String>();
    }
    this.extensions.put(key, extensionsItem);
    return this;
  }

   /**
   * Signed certificates with extensions, e.g permit-port-forwarding&#x3D;\\\&quot;\\\&quot;
   * @return extensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Signed certificates with extensions, e.g permit-port-forwarding=\\\"\\\"")

  public Map<String, String> getExtensions() {
    return extensions;
  }


  public void setExtensions(Map<String, String> extensions) {
    this.extensions = extensions;
  }


  public CreateSSHCertIssuer metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A metadata about the issuer
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A metadata about the issuer")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public CreateSSHCertIssuer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * SSH certificate issuer name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "SSH certificate issuer name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateSSHCertIssuer password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public CreateSSHCertIssuer principals(String principals) {
    
    this.principals = principals;
    return this;
  }

   /**
   * Signed certificates with principal, e.g example_role1,example_role2
   * @return principals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Signed certificates with principal, e.g example_role1,example_role2")

  public String getPrincipals() {
    return principals;
  }


  public void setPrincipals(String principals) {
    this.principals = principals;
  }


  public CreateSSHCertIssuer signerKeyName(String signerKeyName) {
    
    this.signerKeyName = signerKeyName;
    return this;
  }

   /**
   * A key to sign the certificate with
   * @return signerKeyName
  **/
  @ApiModelProperty(required = true, value = "A key to sign the certificate with")

  public String getSignerKeyName() {
    return signerKeyName;
  }


  public void setSignerKeyName(String signerKeyName) {
    this.signerKeyName = signerKeyName;
  }


  public CreateSSHCertIssuer token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authentication token (see `/auth` and `/configure`)")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public CreateSSHCertIssuer ttl(Long ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * The requested Time To Live for the certificate, use second units
   * @return ttl
  **/
  @ApiModelProperty(required = true, value = "The requested Time To Live for the certificate, use second units")

  public Long getTtl() {
    return ttl;
  }


  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }


  public CreateSSHCertIssuer uidToken(String uidToken) {
    
    this.uidToken = uidToken;
    return this;
  }

   /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The universal identity token, Required only for universal_identity authentication")

  public String getUidToken() {
    return uidToken;
  }


  public void setUidToken(String uidToken) {
    this.uidToken = uidToken;
  }


  public CreateSSHCertIssuer username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSSHCertIssuer createSSHCertIssuer = (CreateSSHCertIssuer) o;
    return Objects.equals(this.allowedUsers, createSSHCertIssuer.allowedUsers) &&
        Objects.equals(this.extensions, createSSHCertIssuer.extensions) &&
        Objects.equals(this.metadata, createSSHCertIssuer.metadata) &&
        Objects.equals(this.name, createSSHCertIssuer.name) &&
        Objects.equals(this.password, createSSHCertIssuer.password) &&
        Objects.equals(this.principals, createSSHCertIssuer.principals) &&
        Objects.equals(this.signerKeyName, createSSHCertIssuer.signerKeyName) &&
        Objects.equals(this.token, createSSHCertIssuer.token) &&
        Objects.equals(this.ttl, createSSHCertIssuer.ttl) &&
        Objects.equals(this.uidToken, createSSHCertIssuer.uidToken) &&
        Objects.equals(this.username, createSSHCertIssuer.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedUsers, extensions, metadata, name, password, principals, signerKeyName, token, ttl, uidToken, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSSHCertIssuer {\n");
    sb.append("    allowedUsers: ").append(toIndentedString(allowedUsers)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
    sb.append("    signerKeyName: ").append(toIndentedString(signerKeyName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

