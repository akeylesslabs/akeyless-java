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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UpdateSSHCertIssuer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateSSHCertIssuer {
  public static final String SERIALIZED_NAME_PROVIDER_TYPE = "ProviderType";
  @SerializedName(SERIALIZED_NAME_PROVIDER_TYPE)
  private String providerType;

  public static final String SERIALIZED_NAME_ADD_TAG = "add-tag";
  @SerializedName(SERIALIZED_NAME_ADD_TAG)
  private List<String> addTag = null;

  public static final String SERIALIZED_NAME_ALLOWED_USERS = "allowed-users";
  @SerializedName(SERIALIZED_NAME_ALLOWED_USERS)
  private String allowedUsers;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXTENSIONS = "extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  private Map<String, String> extensions = null;

  public static final String SERIALIZED_NAME_HOST_PROVIDER = "host-provider";
  @SerializedName(SERIALIZED_NAME_HOST_PROVIDER)
  private String hostProvider = "explicit";

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PRINCIPALS = "principals";
  @SerializedName(SERIALIZED_NAME_PRINCIPALS)
  private String principals;

  public static final String SERIALIZED_NAME_RM_TAG = "rm-tag";
  @SerializedName(SERIALIZED_NAME_RM_TAG)
  private List<String> rmTag = null;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_API = "secure-access-bastion-api";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_API)
  private String secureAccessBastionApi;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_SSH = "secure-access-bastion-ssh";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_SSH)
  private String secureAccessBastionSsh;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_HOST = "secure-access-host";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_HOST)
  private List<String> secureAccessHost = null;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_SSH_CREDS_USER = "secure-access-ssh-creds-user";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_SSH_CREDS_USER)
  private String secureAccessSshCredsUser;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_USE_INTERNAL_BASTION = "secure-access-use-internal-bastion";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_USE_INTERNAL_BASTION)
  private Boolean secureAccessUseInternalBastion;

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

  public UpdateSSHCertIssuer() { 
  }

  public UpdateSSHCertIssuer providerType(String providerType) {
    
    this.providerType = providerType;
    return this;
  }

   /**
   * Get providerType
   * @return providerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProviderType() {
    return providerType;
  }


  public void setProviderType(String providerType) {
    this.providerType = providerType;
  }


  public UpdateSSHCertIssuer addTag(List<String> addTag) {
    
    this.addTag = addTag;
    return this;
  }

  public UpdateSSHCertIssuer addAddTagItem(String addTagItem) {
    if (this.addTag == null) {
      this.addTag = new ArrayList<String>();
    }
    this.addTag.add(addTagItem);
    return this;
  }

   /**
   * List of the new tags that will be attached to this item
   * @return addTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the new tags that will be attached to this item")

  public List<String> getAddTag() {
    return addTag;
  }


  public void setAddTag(List<String> addTag) {
    this.addTag = addTag;
  }


  public UpdateSSHCertIssuer allowedUsers(String allowedUsers) {
    
    this.allowedUsers = allowedUsers;
    return this;
  }

   /**
   * Users allowed to fetch the certificate, e.g root,ubuntu
   * @return allowedUsers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Users allowed to fetch the certificate, e.g root,ubuntu")

  public String getAllowedUsers() {
    return allowedUsers;
  }


  public void setAllowedUsers(String allowedUsers) {
    this.allowedUsers = allowedUsers;
  }


  public UpdateSSHCertIssuer deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this item [true/false]
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this item [true/false]")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public UpdateSSHCertIssuer description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the object
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the object")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateSSHCertIssuer extensions(Map<String, String> extensions) {
    
    this.extensions = extensions;
    return this;
  }

  public UpdateSSHCertIssuer putExtensionsItem(String key, String extensionsItem) {
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


  public UpdateSSHCertIssuer hostProvider(String hostProvider) {
    
    this.hostProvider = hostProvider;
    return this;
  }

   /**
   * Host provider type [explicit/target], Relevant only for Secure Remote Access of ssh cert issuer and ldap rotated secret
   * @return hostProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Host provider type [explicit/target], Relevant only for Secure Remote Access of ssh cert issuer and ldap rotated secret")

  public String getHostProvider() {
    return hostProvider;
  }


  public void setHostProvider(String hostProvider) {
    this.hostProvider = hostProvider;
  }


  public UpdateSSHCertIssuer json(Boolean json) {
    
    this.json = json;
    return this;
  }

   /**
   * Set output format to JSON
   * @return json
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set output format to JSON")

  public Boolean getJson() {
    return json;
  }


  public void setJson(Boolean json) {
    this.json = json;
  }


  public UpdateSSHCertIssuer metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Deprecated - use description
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - use description")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public UpdateSSHCertIssuer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * SSH certificate issuer name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "SSH certificate issuer name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateSSHCertIssuer newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * New item name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New item name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public UpdateSSHCertIssuer principals(String principals) {
    
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


  public UpdateSSHCertIssuer rmTag(List<String> rmTag) {
    
    this.rmTag = rmTag;
    return this;
  }

  public UpdateSSHCertIssuer addRmTagItem(String rmTagItem) {
    if (this.rmTag == null) {
      this.rmTag = new ArrayList<String>();
    }
    this.rmTag.add(rmTagItem);
    return this;
  }

   /**
   * List of the existent tags that will be removed from this item
   * @return rmTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the existent tags that will be removed from this item")

  public List<String> getRmTag() {
    return rmTag;
  }


  public void setRmTag(List<String> rmTag) {
    this.rmTag = rmTag;
  }


  public UpdateSSHCertIssuer secureAccessBastionApi(String secureAccessBastionApi) {
    
    this.secureAccessBastionApi = secureAccessBastionApi;
    return this;
  }

   /**
   * Bastion&#39;s SSH control API endpoint. E.g. https://my.bastion:9900
   * @return secureAccessBastionApi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bastion's SSH control API endpoint. E.g. https://my.bastion:9900")

  public String getSecureAccessBastionApi() {
    return secureAccessBastionApi;
  }


  public void setSecureAccessBastionApi(String secureAccessBastionApi) {
    this.secureAccessBastionApi = secureAccessBastionApi;
  }


  public UpdateSSHCertIssuer secureAccessBastionSsh(String secureAccessBastionSsh) {
    
    this.secureAccessBastionSsh = secureAccessBastionSsh;
    return this;
  }

   /**
   * Bastion&#39;s SSH server. E.g. my.bastion:22
   * @return secureAccessBastionSsh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bastion's SSH server. E.g. my.bastion:22")

  public String getSecureAccessBastionSsh() {
    return secureAccessBastionSsh;
  }


  public void setSecureAccessBastionSsh(String secureAccessBastionSsh) {
    this.secureAccessBastionSsh = secureAccessBastionSsh;
  }


  public UpdateSSHCertIssuer secureAccessEnable(String secureAccessEnable) {
    
    this.secureAccessEnable = secureAccessEnable;
    return this;
  }

   /**
   * Enable/Disable secure remote access [true/false]
   * @return secureAccessEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable/Disable secure remote access [true/false]")

  public String getSecureAccessEnable() {
    return secureAccessEnable;
  }


  public void setSecureAccessEnable(String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
  }


  public UpdateSSHCertIssuer secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public UpdateSSHCertIssuer addSecureAccessHostItem(String secureAccessHostItem) {
    if (this.secureAccessHost == null) {
      this.secureAccessHost = new ArrayList<String>();
    }
    this.secureAccessHost.add(secureAccessHostItem);
    return this;
  }

   /**
   * Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers)
   * @return secureAccessHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target servers for connections (In case of Linked Target association, host(s) will inherit Linked Target hosts - Relevant only for Dynamic Secrets/producers)")

  public List<String> getSecureAccessHost() {
    return secureAccessHost;
  }


  public void setSecureAccessHost(List<String> secureAccessHost) {
    this.secureAccessHost = secureAccessHost;
  }


  public UpdateSSHCertIssuer secureAccessSshCredsUser(String secureAccessSshCredsUser) {
    
    this.secureAccessSshCredsUser = secureAccessSshCredsUser;
    return this;
  }

   /**
   * SSH username to connect to target server, must be in &#39;Allowed Users&#39; list
   * @return secureAccessSshCredsUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SSH username to connect to target server, must be in 'Allowed Users' list")

  public String getSecureAccessSshCredsUser() {
    return secureAccessSshCredsUser;
  }


  public void setSecureAccessSshCredsUser(String secureAccessSshCredsUser) {
    this.secureAccessSshCredsUser = secureAccessSshCredsUser;
  }


  public UpdateSSHCertIssuer secureAccessUseInternalBastion(Boolean secureAccessUseInternalBastion) {
    
    this.secureAccessUseInternalBastion = secureAccessUseInternalBastion;
    return this;
  }

   /**
   * Use internal SSH Bastion
   * @return secureAccessUseInternalBastion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use internal SSH Bastion")

  public Boolean getSecureAccessUseInternalBastion() {
    return secureAccessUseInternalBastion;
  }


  public void setSecureAccessUseInternalBastion(Boolean secureAccessUseInternalBastion) {
    this.secureAccessUseInternalBastion = secureAccessUseInternalBastion;
  }


  public UpdateSSHCertIssuer signerKeyName(String signerKeyName) {
    
    this.signerKeyName = signerKeyName;
    return this;
  }

   /**
   * A key to sign the certificate with
   * @return signerKeyName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A key to sign the certificate with")

  public String getSignerKeyName() {
    return signerKeyName;
  }


  public void setSignerKeyName(String signerKeyName) {
    this.signerKeyName = signerKeyName;
  }


  public UpdateSSHCertIssuer token(String token) {
    
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


  public UpdateSSHCertIssuer ttl(Long ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * The requested Time To Live for the certificate, in seconds
   * @return ttl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The requested Time To Live for the certificate, in seconds")

  public Long getTtl() {
    return ttl;
  }


  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }


  public UpdateSSHCertIssuer uidToken(String uidToken) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSSHCertIssuer updateSSHCertIssuer = (UpdateSSHCertIssuer) o;
    return Objects.equals(this.providerType, updateSSHCertIssuer.providerType) &&
        Objects.equals(this.addTag, updateSSHCertIssuer.addTag) &&
        Objects.equals(this.allowedUsers, updateSSHCertIssuer.allowedUsers) &&
        Objects.equals(this.deleteProtection, updateSSHCertIssuer.deleteProtection) &&
        Objects.equals(this.description, updateSSHCertIssuer.description) &&
        Objects.equals(this.extensions, updateSSHCertIssuer.extensions) &&
        Objects.equals(this.hostProvider, updateSSHCertIssuer.hostProvider) &&
        Objects.equals(this.json, updateSSHCertIssuer.json) &&
        Objects.equals(this.metadata, updateSSHCertIssuer.metadata) &&
        Objects.equals(this.name, updateSSHCertIssuer.name) &&
        Objects.equals(this.newName, updateSSHCertIssuer.newName) &&
        Objects.equals(this.principals, updateSSHCertIssuer.principals) &&
        Objects.equals(this.rmTag, updateSSHCertIssuer.rmTag) &&
        Objects.equals(this.secureAccessBastionApi, updateSSHCertIssuer.secureAccessBastionApi) &&
        Objects.equals(this.secureAccessBastionSsh, updateSSHCertIssuer.secureAccessBastionSsh) &&
        Objects.equals(this.secureAccessEnable, updateSSHCertIssuer.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, updateSSHCertIssuer.secureAccessHost) &&
        Objects.equals(this.secureAccessSshCredsUser, updateSSHCertIssuer.secureAccessSshCredsUser) &&
        Objects.equals(this.secureAccessUseInternalBastion, updateSSHCertIssuer.secureAccessUseInternalBastion) &&
        Objects.equals(this.signerKeyName, updateSSHCertIssuer.signerKeyName) &&
        Objects.equals(this.token, updateSSHCertIssuer.token) &&
        Objects.equals(this.ttl, updateSSHCertIssuer.ttl) &&
        Objects.equals(this.uidToken, updateSSHCertIssuer.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerType, addTag, allowedUsers, deleteProtection, description, extensions, hostProvider, json, metadata, name, newName, principals, rmTag, secureAccessBastionApi, secureAccessBastionSsh, secureAccessEnable, secureAccessHost, secureAccessSshCredsUser, secureAccessUseInternalBastion, signerKeyName, token, ttl, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSSHCertIssuer {\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    addTag: ").append(toIndentedString(addTag)).append("\n");
    sb.append("    allowedUsers: ").append(toIndentedString(allowedUsers)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    hostProvider: ").append(toIndentedString(hostProvider)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
    sb.append("    rmTag: ").append(toIndentedString(rmTag)).append("\n");
    sb.append("    secureAccessBastionApi: ").append(toIndentedString(secureAccessBastionApi)).append("\n");
    sb.append("    secureAccessBastionSsh: ").append(toIndentedString(secureAccessBastionSsh)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
    sb.append("    secureAccessSshCredsUser: ").append(toIndentedString(secureAccessSshCredsUser)).append("\n");
    sb.append("    secureAccessUseInternalBastion: ").append(toIndentedString(secureAccessUseInternalBastion)).append("\n");
    sb.append("    signerKeyName: ").append(toIndentedString(signerKeyName)).append("\n");
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

}

