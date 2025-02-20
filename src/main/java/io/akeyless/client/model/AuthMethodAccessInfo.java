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
import io.akeyless.client.model.APIKeyAccessRules;
import io.akeyless.client.model.AWSIAMAccessRules;
import io.akeyless.client.model.AzureADAccessRules;
import io.akeyless.client.model.CertAccessRules;
import io.akeyless.client.model.EmailPassAccessRules;
import io.akeyless.client.model.GCPAccessRules;
import io.akeyless.client.model.HuaweiAccessRules;
import io.akeyless.client.model.KerberosAccessRules;
import io.akeyless.client.model.KubernetesAccessRules;
import io.akeyless.client.model.LDAPAccessRules;
import io.akeyless.client.model.OAuth2AccessRules;
import io.akeyless.client.model.OCIAccessRules;
import io.akeyless.client.model.OIDCAccessRules;
import io.akeyless.client.model.SAMLAccessRules;
import io.akeyless.client.model.UniversalIdentityAccessRules;
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
 * AuthMethodAccessInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class AuthMethodAccessInfo {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access_expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  @javax.annotation.Nullable
  private Long accessExpires;

  public static final String SERIALIZED_NAME_ACCESS_ID_ALIAS = "access_id_alias";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID_ALIAS)
  @javax.annotation.Nullable
  private String accessIdAlias;

  public static final String SERIALIZED_NAME_API_KEY_ACCESS_RULES = "api_key_access_rules";
  @SerializedName(SERIALIZED_NAME_API_KEY_ACCESS_RULES)
  @javax.annotation.Nullable
  private APIKeyAccessRules apiKeyAccessRules;

  public static final String SERIALIZED_NAME_AUDIT_LOGS_CLAIMS = "audit_logs_claims";
  @SerializedName(SERIALIZED_NAME_AUDIT_LOGS_CLAIMS)
  @javax.annotation.Nullable
  private List<String> auditLogsClaims = new ArrayList<>();

  public static final String SERIALIZED_NAME_AWS_IAM_ACCESS_RULES = "aws_iam_access_rules";
  @SerializedName(SERIALIZED_NAME_AWS_IAM_ACCESS_RULES)
  @javax.annotation.Nullable
  private AWSIAMAccessRules awsIamAccessRules;

  public static final String SERIALIZED_NAME_AZURE_AD_ACCESS_RULES = "azure_ad_access_rules";
  @SerializedName(SERIALIZED_NAME_AZURE_AD_ACCESS_RULES)
  @javax.annotation.Nullable
  private AzureADAccessRules azureAdAccessRules;

  public static final String SERIALIZED_NAME_CERT_ACCESS_RULES = "cert_access_rules";
  @SerializedName(SERIALIZED_NAME_CERT_ACCESS_RULES)
  @javax.annotation.Nullable
  private CertAccessRules certAccessRules;

  public static final String SERIALIZED_NAME_CIDR_WHITELIST = "cidr_whitelist";
  @SerializedName(SERIALIZED_NAME_CIDR_WHITELIST)
  @javax.annotation.Nullable
  private String cidrWhitelist;

  public static final String SERIALIZED_NAME_EMAIL_PASS_ACCESS_RULES = "email_pass_access_rules";
  @SerializedName(SERIALIZED_NAME_EMAIL_PASS_ACCESS_RULES)
  @javax.annotation.Nullable
  private EmailPassAccessRules emailPassAccessRules;

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force_sub_claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  @javax.annotation.Nullable
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_GCP_ACCESS_RULES = "gcp_access_rules";
  @SerializedName(SERIALIZED_NAME_GCP_ACCESS_RULES)
  @javax.annotation.Nullable
  private GCPAccessRules gcpAccessRules;

  public static final String SERIALIZED_NAME_GW_CIDR_WHITELIST = "gw_cidr_whitelist";
  @SerializedName(SERIALIZED_NAME_GW_CIDR_WHITELIST)
  @javax.annotation.Nullable
  private String gwCidrWhitelist;

  public static final String SERIALIZED_NAME_HUAWEI_ACCESS_RULES = "huawei_access_rules";
  @SerializedName(SERIALIZED_NAME_HUAWEI_ACCESS_RULES)
  @javax.annotation.Nullable
  private HuaweiAccessRules huaweiAccessRules;

  public static final String SERIALIZED_NAME_JWT_TTL = "jwt_ttl";
  @SerializedName(SERIALIZED_NAME_JWT_TTL)
  @javax.annotation.Nullable
  private Long jwtTtl;

  public static final String SERIALIZED_NAME_K8S_ACCESS_RULES = "k8s_access_rules";
  @SerializedName(SERIALIZED_NAME_K8S_ACCESS_RULES)
  @javax.annotation.Nullable
  private KubernetesAccessRules k8sAccessRules;

  public static final String SERIALIZED_NAME_KERBEROS_ACCESS_RULES = "kerberos_access_rules";
  @SerializedName(SERIALIZED_NAME_KERBEROS_ACCESS_RULES)
  @javax.annotation.Nullable
  private KerberosAccessRules kerberosAccessRules;

  public static final String SERIALIZED_NAME_LDAP_ACCESS_RULES = "ldap_access_rules";
  @SerializedName(SERIALIZED_NAME_LDAP_ACCESS_RULES)
  @javax.annotation.Nullable
  private LDAPAccessRules ldapAccessRules;

  public static final String SERIALIZED_NAME_OAUTH2_ACCESS_RULES = "oauth2_access_rules";
  @SerializedName(SERIALIZED_NAME_OAUTH2_ACCESS_RULES)
  @javax.annotation.Nullable
  private OAuth2AccessRules oauth2AccessRules;

  public static final String SERIALIZED_NAME_OCI_ACCESS_RULES = "oci_access_rules";
  @SerializedName(SERIALIZED_NAME_OCI_ACCESS_RULES)
  @javax.annotation.Nullable
  private OCIAccessRules ociAccessRules;

  public static final String SERIALIZED_NAME_OIDC_ACCESS_RULES = "oidc_access_rules";
  @SerializedName(SERIALIZED_NAME_OIDC_ACCESS_RULES)
  @javax.annotation.Nullable
  private OIDCAccessRules oidcAccessRules;

  public static final String SERIALIZED_NAME_PRODUCT_TYPES = "product_types";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPES)
  @javax.annotation.Nullable
  private List<String> productTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_RULES_TYPE = "rules_type";
  @SerializedName(SERIALIZED_NAME_RULES_TYPE)
  @javax.annotation.Nullable
  private String rulesType;

  public static final String SERIALIZED_NAME_SAML_ACCESS_RULES = "saml_access_rules";
  @SerializedName(SERIALIZED_NAME_SAML_ACCESS_RULES)
  @javax.annotation.Nullable
  private SAMLAccessRules samlAccessRules;

  public static final String SERIALIZED_NAME_SUB_CLAIMS_DELIMITERS = "sub_claims_delimiters";
  @SerializedName(SERIALIZED_NAME_SUB_CLAIMS_DELIMITERS)
  @javax.annotation.Nullable
  private List<String> subClaimsDelimiters = new ArrayList<>();

  public static final String SERIALIZED_NAME_UNIVERSAL_IDENTITY_ACCESS_RULES = "universal_identity_access_rules";
  @SerializedName(SERIALIZED_NAME_UNIVERSAL_IDENTITY_ACCESS_RULES)
  @javax.annotation.Nullable
  private UniversalIdentityAccessRules universalIdentityAccessRules;

  public AuthMethodAccessInfo() {
  }

  public AuthMethodAccessInfo accessExpires(@javax.annotation.Nullable Long accessExpires) {
    this.accessExpires = accessExpires;
    return this;
  }

  /**
   * Get accessExpires
   * @return accessExpires
   */
  @javax.annotation.Nullable
  public Long getAccessExpires() {
    return accessExpires;
  }

  public void setAccessExpires(@javax.annotation.Nullable Long accessExpires) {
    this.accessExpires = accessExpires;
  }


  public AuthMethodAccessInfo accessIdAlias(@javax.annotation.Nullable String accessIdAlias) {
    this.accessIdAlias = accessIdAlias;
    return this;
  }

  /**
   * for accounts where AccessId holds encrypted email this field will hold generated AccessId, for accounts based on regular AccessId it will be equal to accessId itself
   * @return accessIdAlias
   */
  @javax.annotation.Nullable
  public String getAccessIdAlias() {
    return accessIdAlias;
  }

  public void setAccessIdAlias(@javax.annotation.Nullable String accessIdAlias) {
    this.accessIdAlias = accessIdAlias;
  }


  public AuthMethodAccessInfo apiKeyAccessRules(@javax.annotation.Nullable APIKeyAccessRules apiKeyAccessRules) {
    this.apiKeyAccessRules = apiKeyAccessRules;
    return this;
  }

  /**
   * Get apiKeyAccessRules
   * @return apiKeyAccessRules
   */
  @javax.annotation.Nullable
  public APIKeyAccessRules getApiKeyAccessRules() {
    return apiKeyAccessRules;
  }

  public void setApiKeyAccessRules(@javax.annotation.Nullable APIKeyAccessRules apiKeyAccessRules) {
    this.apiKeyAccessRules = apiKeyAccessRules;
  }


  public AuthMethodAccessInfo auditLogsClaims(@javax.annotation.Nullable List<String> auditLogsClaims) {
    this.auditLogsClaims = auditLogsClaims;
    return this;
  }

  public AuthMethodAccessInfo addAuditLogsClaimsItem(String auditLogsClaimsItem) {
    if (this.auditLogsClaims == null) {
      this.auditLogsClaims = new ArrayList<>();
    }
    this.auditLogsClaims.add(auditLogsClaimsItem);
    return this;
  }

  /**
   * Get auditLogsClaims
   * @return auditLogsClaims
   */
  @javax.annotation.Nullable
  public List<String> getAuditLogsClaims() {
    return auditLogsClaims;
  }

  public void setAuditLogsClaims(@javax.annotation.Nullable List<String> auditLogsClaims) {
    this.auditLogsClaims = auditLogsClaims;
  }


  public AuthMethodAccessInfo awsIamAccessRules(@javax.annotation.Nullable AWSIAMAccessRules awsIamAccessRules) {
    this.awsIamAccessRules = awsIamAccessRules;
    return this;
  }

  /**
   * Get awsIamAccessRules
   * @return awsIamAccessRules
   */
  @javax.annotation.Nullable
  public AWSIAMAccessRules getAwsIamAccessRules() {
    return awsIamAccessRules;
  }

  public void setAwsIamAccessRules(@javax.annotation.Nullable AWSIAMAccessRules awsIamAccessRules) {
    this.awsIamAccessRules = awsIamAccessRules;
  }


  public AuthMethodAccessInfo azureAdAccessRules(@javax.annotation.Nullable AzureADAccessRules azureAdAccessRules) {
    this.azureAdAccessRules = azureAdAccessRules;
    return this;
  }

  /**
   * Get azureAdAccessRules
   * @return azureAdAccessRules
   */
  @javax.annotation.Nullable
  public AzureADAccessRules getAzureAdAccessRules() {
    return azureAdAccessRules;
  }

  public void setAzureAdAccessRules(@javax.annotation.Nullable AzureADAccessRules azureAdAccessRules) {
    this.azureAdAccessRules = azureAdAccessRules;
  }


  public AuthMethodAccessInfo certAccessRules(@javax.annotation.Nullable CertAccessRules certAccessRules) {
    this.certAccessRules = certAccessRules;
    return this;
  }

  /**
   * Get certAccessRules
   * @return certAccessRules
   */
  @javax.annotation.Nullable
  public CertAccessRules getCertAccessRules() {
    return certAccessRules;
  }

  public void setCertAccessRules(@javax.annotation.Nullable CertAccessRules certAccessRules) {
    this.certAccessRules = certAccessRules;
  }


  public AuthMethodAccessInfo cidrWhitelist(@javax.annotation.Nullable String cidrWhitelist) {
    this.cidrWhitelist = cidrWhitelist;
    return this;
  }

  /**
   * Get cidrWhitelist
   * @return cidrWhitelist
   */
  @javax.annotation.Nullable
  public String getCidrWhitelist() {
    return cidrWhitelist;
  }

  public void setCidrWhitelist(@javax.annotation.Nullable String cidrWhitelist) {
    this.cidrWhitelist = cidrWhitelist;
  }


  public AuthMethodAccessInfo emailPassAccessRules(@javax.annotation.Nullable EmailPassAccessRules emailPassAccessRules) {
    this.emailPassAccessRules = emailPassAccessRules;
    return this;
  }

  /**
   * Get emailPassAccessRules
   * @return emailPassAccessRules
   */
  @javax.annotation.Nullable
  public EmailPassAccessRules getEmailPassAccessRules() {
    return emailPassAccessRules;
  }

  public void setEmailPassAccessRules(@javax.annotation.Nullable EmailPassAccessRules emailPassAccessRules) {
    this.emailPassAccessRules = emailPassAccessRules;
  }


  public AuthMethodAccessInfo forceSubClaims(@javax.annotation.Nullable Boolean forceSubClaims) {
    this.forceSubClaims = forceSubClaims;
    return this;
  }

  /**
   * if true the role associated with this auth method must include sub claims
   * @return forceSubClaims
   */
  @javax.annotation.Nullable
  public Boolean getForceSubClaims() {
    return forceSubClaims;
  }

  public void setForceSubClaims(@javax.annotation.Nullable Boolean forceSubClaims) {
    this.forceSubClaims = forceSubClaims;
  }


  public AuthMethodAccessInfo gcpAccessRules(@javax.annotation.Nullable GCPAccessRules gcpAccessRules) {
    this.gcpAccessRules = gcpAccessRules;
    return this;
  }

  /**
   * Get gcpAccessRules
   * @return gcpAccessRules
   */
  @javax.annotation.Nullable
  public GCPAccessRules getGcpAccessRules() {
    return gcpAccessRules;
  }

  public void setGcpAccessRules(@javax.annotation.Nullable GCPAccessRules gcpAccessRules) {
    this.gcpAccessRules = gcpAccessRules;
  }


  public AuthMethodAccessInfo gwCidrWhitelist(@javax.annotation.Nullable String gwCidrWhitelist) {
    this.gwCidrWhitelist = gwCidrWhitelist;
    return this;
  }

  /**
   * Get gwCidrWhitelist
   * @return gwCidrWhitelist
   */
  @javax.annotation.Nullable
  public String getGwCidrWhitelist() {
    return gwCidrWhitelist;
  }

  public void setGwCidrWhitelist(@javax.annotation.Nullable String gwCidrWhitelist) {
    this.gwCidrWhitelist = gwCidrWhitelist;
  }


  public AuthMethodAccessInfo huaweiAccessRules(@javax.annotation.Nullable HuaweiAccessRules huaweiAccessRules) {
    this.huaweiAccessRules = huaweiAccessRules;
    return this;
  }

  /**
   * Get huaweiAccessRules
   * @return huaweiAccessRules
   */
  @javax.annotation.Nullable
  public HuaweiAccessRules getHuaweiAccessRules() {
    return huaweiAccessRules;
  }

  public void setHuaweiAccessRules(@javax.annotation.Nullable HuaweiAccessRules huaweiAccessRules) {
    this.huaweiAccessRules = huaweiAccessRules;
  }


  public AuthMethodAccessInfo jwtTtl(@javax.annotation.Nullable Long jwtTtl) {
    this.jwtTtl = jwtTtl;
    return this;
  }

  /**
   * Get jwtTtl
   * @return jwtTtl
   */
  @javax.annotation.Nullable
  public Long getJwtTtl() {
    return jwtTtl;
  }

  public void setJwtTtl(@javax.annotation.Nullable Long jwtTtl) {
    this.jwtTtl = jwtTtl;
  }


  public AuthMethodAccessInfo k8sAccessRules(@javax.annotation.Nullable KubernetesAccessRules k8sAccessRules) {
    this.k8sAccessRules = k8sAccessRules;
    return this;
  }

  /**
   * Get k8sAccessRules
   * @return k8sAccessRules
   */
  @javax.annotation.Nullable
  public KubernetesAccessRules getK8sAccessRules() {
    return k8sAccessRules;
  }

  public void setK8sAccessRules(@javax.annotation.Nullable KubernetesAccessRules k8sAccessRules) {
    this.k8sAccessRules = k8sAccessRules;
  }


  public AuthMethodAccessInfo kerberosAccessRules(@javax.annotation.Nullable KerberosAccessRules kerberosAccessRules) {
    this.kerberosAccessRules = kerberosAccessRules;
    return this;
  }

  /**
   * Get kerberosAccessRules
   * @return kerberosAccessRules
   */
  @javax.annotation.Nullable
  public KerberosAccessRules getKerberosAccessRules() {
    return kerberosAccessRules;
  }

  public void setKerberosAccessRules(@javax.annotation.Nullable KerberosAccessRules kerberosAccessRules) {
    this.kerberosAccessRules = kerberosAccessRules;
  }


  public AuthMethodAccessInfo ldapAccessRules(@javax.annotation.Nullable LDAPAccessRules ldapAccessRules) {
    this.ldapAccessRules = ldapAccessRules;
    return this;
  }

  /**
   * Get ldapAccessRules
   * @return ldapAccessRules
   */
  @javax.annotation.Nullable
  public LDAPAccessRules getLdapAccessRules() {
    return ldapAccessRules;
  }

  public void setLdapAccessRules(@javax.annotation.Nullable LDAPAccessRules ldapAccessRules) {
    this.ldapAccessRules = ldapAccessRules;
  }


  public AuthMethodAccessInfo oauth2AccessRules(@javax.annotation.Nullable OAuth2AccessRules oauth2AccessRules) {
    this.oauth2AccessRules = oauth2AccessRules;
    return this;
  }

  /**
   * Get oauth2AccessRules
   * @return oauth2AccessRules
   */
  @javax.annotation.Nullable
  public OAuth2AccessRules getOauth2AccessRules() {
    return oauth2AccessRules;
  }

  public void setOauth2AccessRules(@javax.annotation.Nullable OAuth2AccessRules oauth2AccessRules) {
    this.oauth2AccessRules = oauth2AccessRules;
  }


  public AuthMethodAccessInfo ociAccessRules(@javax.annotation.Nullable OCIAccessRules ociAccessRules) {
    this.ociAccessRules = ociAccessRules;
    return this;
  }

  /**
   * Get ociAccessRules
   * @return ociAccessRules
   */
  @javax.annotation.Nullable
  public OCIAccessRules getOciAccessRules() {
    return ociAccessRules;
  }

  public void setOciAccessRules(@javax.annotation.Nullable OCIAccessRules ociAccessRules) {
    this.ociAccessRules = ociAccessRules;
  }


  public AuthMethodAccessInfo oidcAccessRules(@javax.annotation.Nullable OIDCAccessRules oidcAccessRules) {
    this.oidcAccessRules = oidcAccessRules;
    return this;
  }

  /**
   * Get oidcAccessRules
   * @return oidcAccessRules
   */
  @javax.annotation.Nullable
  public OIDCAccessRules getOidcAccessRules() {
    return oidcAccessRules;
  }

  public void setOidcAccessRules(@javax.annotation.Nullable OIDCAccessRules oidcAccessRules) {
    this.oidcAccessRules = oidcAccessRules;
  }


  public AuthMethodAccessInfo productTypes(@javax.annotation.Nullable List<String> productTypes) {
    this.productTypes = productTypes;
    return this;
  }

  public AuthMethodAccessInfo addProductTypesItem(String productTypesItem) {
    if (this.productTypes == null) {
      this.productTypes = new ArrayList<>();
    }
    this.productTypes.add(productTypesItem);
    return this;
  }

  /**
   * List of product types this auth method will be in use of
   * @return productTypes
   */
  @javax.annotation.Nullable
  public List<String> getProductTypes() {
    return productTypes;
  }

  public void setProductTypes(@javax.annotation.Nullable List<String> productTypes) {
    this.productTypes = productTypes;
  }


  public AuthMethodAccessInfo rulesType(@javax.annotation.Nullable String rulesType) {
    this.rulesType = rulesType;
    return this;
  }

  /**
   * Get rulesType
   * @return rulesType
   */
  @javax.annotation.Nullable
  public String getRulesType() {
    return rulesType;
  }

  public void setRulesType(@javax.annotation.Nullable String rulesType) {
    this.rulesType = rulesType;
  }


  public AuthMethodAccessInfo samlAccessRules(@javax.annotation.Nullable SAMLAccessRules samlAccessRules) {
    this.samlAccessRules = samlAccessRules;
    return this;
  }

  /**
   * Get samlAccessRules
   * @return samlAccessRules
   */
  @javax.annotation.Nullable
  public SAMLAccessRules getSamlAccessRules() {
    return samlAccessRules;
  }

  public void setSamlAccessRules(@javax.annotation.Nullable SAMLAccessRules samlAccessRules) {
    this.samlAccessRules = samlAccessRules;
  }


  public AuthMethodAccessInfo subClaimsDelimiters(@javax.annotation.Nullable List<String> subClaimsDelimiters) {
    this.subClaimsDelimiters = subClaimsDelimiters;
    return this;
  }

  public AuthMethodAccessInfo addSubClaimsDelimitersItem(String subClaimsDelimitersItem) {
    if (this.subClaimsDelimiters == null) {
      this.subClaimsDelimiters = new ArrayList<>();
    }
    this.subClaimsDelimiters.add(subClaimsDelimitersItem);
    return this;
  }

  /**
   * Get subClaimsDelimiters
   * @return subClaimsDelimiters
   */
  @javax.annotation.Nullable
  public List<String> getSubClaimsDelimiters() {
    return subClaimsDelimiters;
  }

  public void setSubClaimsDelimiters(@javax.annotation.Nullable List<String> subClaimsDelimiters) {
    this.subClaimsDelimiters = subClaimsDelimiters;
  }


  public AuthMethodAccessInfo universalIdentityAccessRules(@javax.annotation.Nullable UniversalIdentityAccessRules universalIdentityAccessRules) {
    this.universalIdentityAccessRules = universalIdentityAccessRules;
    return this;
  }

  /**
   * Get universalIdentityAccessRules
   * @return universalIdentityAccessRules
   */
  @javax.annotation.Nullable
  public UniversalIdentityAccessRules getUniversalIdentityAccessRules() {
    return universalIdentityAccessRules;
  }

  public void setUniversalIdentityAccessRules(@javax.annotation.Nullable UniversalIdentityAccessRules universalIdentityAccessRules) {
    this.universalIdentityAccessRules = universalIdentityAccessRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthMethodAccessInfo authMethodAccessInfo = (AuthMethodAccessInfo) o;
    return Objects.equals(this.accessExpires, authMethodAccessInfo.accessExpires) &&
        Objects.equals(this.accessIdAlias, authMethodAccessInfo.accessIdAlias) &&
        Objects.equals(this.apiKeyAccessRules, authMethodAccessInfo.apiKeyAccessRules) &&
        Objects.equals(this.auditLogsClaims, authMethodAccessInfo.auditLogsClaims) &&
        Objects.equals(this.awsIamAccessRules, authMethodAccessInfo.awsIamAccessRules) &&
        Objects.equals(this.azureAdAccessRules, authMethodAccessInfo.azureAdAccessRules) &&
        Objects.equals(this.certAccessRules, authMethodAccessInfo.certAccessRules) &&
        Objects.equals(this.cidrWhitelist, authMethodAccessInfo.cidrWhitelist) &&
        Objects.equals(this.emailPassAccessRules, authMethodAccessInfo.emailPassAccessRules) &&
        Objects.equals(this.forceSubClaims, authMethodAccessInfo.forceSubClaims) &&
        Objects.equals(this.gcpAccessRules, authMethodAccessInfo.gcpAccessRules) &&
        Objects.equals(this.gwCidrWhitelist, authMethodAccessInfo.gwCidrWhitelist) &&
        Objects.equals(this.huaweiAccessRules, authMethodAccessInfo.huaweiAccessRules) &&
        Objects.equals(this.jwtTtl, authMethodAccessInfo.jwtTtl) &&
        Objects.equals(this.k8sAccessRules, authMethodAccessInfo.k8sAccessRules) &&
        Objects.equals(this.kerberosAccessRules, authMethodAccessInfo.kerberosAccessRules) &&
        Objects.equals(this.ldapAccessRules, authMethodAccessInfo.ldapAccessRules) &&
        Objects.equals(this.oauth2AccessRules, authMethodAccessInfo.oauth2AccessRules) &&
        Objects.equals(this.ociAccessRules, authMethodAccessInfo.ociAccessRules) &&
        Objects.equals(this.oidcAccessRules, authMethodAccessInfo.oidcAccessRules) &&
        Objects.equals(this.productTypes, authMethodAccessInfo.productTypes) &&
        Objects.equals(this.rulesType, authMethodAccessInfo.rulesType) &&
        Objects.equals(this.samlAccessRules, authMethodAccessInfo.samlAccessRules) &&
        Objects.equals(this.subClaimsDelimiters, authMethodAccessInfo.subClaimsDelimiters) &&
        Objects.equals(this.universalIdentityAccessRules, authMethodAccessInfo.universalIdentityAccessRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, accessIdAlias, apiKeyAccessRules, auditLogsClaims, awsIamAccessRules, azureAdAccessRules, certAccessRules, cidrWhitelist, emailPassAccessRules, forceSubClaims, gcpAccessRules, gwCidrWhitelist, huaweiAccessRules, jwtTtl, k8sAccessRules, kerberosAccessRules, ldapAccessRules, oauth2AccessRules, ociAccessRules, oidcAccessRules, productTypes, rulesType, samlAccessRules, subClaimsDelimiters, universalIdentityAccessRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthMethodAccessInfo {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    accessIdAlias: ").append(toIndentedString(accessIdAlias)).append("\n");
    sb.append("    apiKeyAccessRules: ").append(toIndentedString(apiKeyAccessRules)).append("\n");
    sb.append("    auditLogsClaims: ").append(toIndentedString(auditLogsClaims)).append("\n");
    sb.append("    awsIamAccessRules: ").append(toIndentedString(awsIamAccessRules)).append("\n");
    sb.append("    azureAdAccessRules: ").append(toIndentedString(azureAdAccessRules)).append("\n");
    sb.append("    certAccessRules: ").append(toIndentedString(certAccessRules)).append("\n");
    sb.append("    cidrWhitelist: ").append(toIndentedString(cidrWhitelist)).append("\n");
    sb.append("    emailPassAccessRules: ").append(toIndentedString(emailPassAccessRules)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    gcpAccessRules: ").append(toIndentedString(gcpAccessRules)).append("\n");
    sb.append("    gwCidrWhitelist: ").append(toIndentedString(gwCidrWhitelist)).append("\n");
    sb.append("    huaweiAccessRules: ").append(toIndentedString(huaweiAccessRules)).append("\n");
    sb.append("    jwtTtl: ").append(toIndentedString(jwtTtl)).append("\n");
    sb.append("    k8sAccessRules: ").append(toIndentedString(k8sAccessRules)).append("\n");
    sb.append("    kerberosAccessRules: ").append(toIndentedString(kerberosAccessRules)).append("\n");
    sb.append("    ldapAccessRules: ").append(toIndentedString(ldapAccessRules)).append("\n");
    sb.append("    oauth2AccessRules: ").append(toIndentedString(oauth2AccessRules)).append("\n");
    sb.append("    ociAccessRules: ").append(toIndentedString(ociAccessRules)).append("\n");
    sb.append("    oidcAccessRules: ").append(toIndentedString(oidcAccessRules)).append("\n");
    sb.append("    productTypes: ").append(toIndentedString(productTypes)).append("\n");
    sb.append("    rulesType: ").append(toIndentedString(rulesType)).append("\n");
    sb.append("    samlAccessRules: ").append(toIndentedString(samlAccessRules)).append("\n");
    sb.append("    subClaimsDelimiters: ").append(toIndentedString(subClaimsDelimiters)).append("\n");
    sb.append("    universalIdentityAccessRules: ").append(toIndentedString(universalIdentityAccessRules)).append("\n");
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
    openapiFields.add("access_expires");
    openapiFields.add("access_id_alias");
    openapiFields.add("api_key_access_rules");
    openapiFields.add("audit_logs_claims");
    openapiFields.add("aws_iam_access_rules");
    openapiFields.add("azure_ad_access_rules");
    openapiFields.add("cert_access_rules");
    openapiFields.add("cidr_whitelist");
    openapiFields.add("email_pass_access_rules");
    openapiFields.add("force_sub_claims");
    openapiFields.add("gcp_access_rules");
    openapiFields.add("gw_cidr_whitelist");
    openapiFields.add("huawei_access_rules");
    openapiFields.add("jwt_ttl");
    openapiFields.add("k8s_access_rules");
    openapiFields.add("kerberos_access_rules");
    openapiFields.add("ldap_access_rules");
    openapiFields.add("oauth2_access_rules");
    openapiFields.add("oci_access_rules");
    openapiFields.add("oidc_access_rules");
    openapiFields.add("product_types");
    openapiFields.add("rules_type");
    openapiFields.add("saml_access_rules");
    openapiFields.add("sub_claims_delimiters");
    openapiFields.add("universal_identity_access_rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthMethodAccessInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthMethodAccessInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthMethodAccessInfo is not found in the empty JSON string", AuthMethodAccessInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthMethodAccessInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthMethodAccessInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access_id_alias") != null && !jsonObj.get("access_id_alias").isJsonNull()) && !jsonObj.get("access_id_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_id_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_id_alias").toString()));
      }
      // validate the optional field `api_key_access_rules`
      if (jsonObj.get("api_key_access_rules") != null && !jsonObj.get("api_key_access_rules").isJsonNull()) {
        APIKeyAccessRules.validateJsonElement(jsonObj.get("api_key_access_rules"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("audit_logs_claims") != null && !jsonObj.get("audit_logs_claims").isJsonNull() && !jsonObj.get("audit_logs_claims").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_logs_claims` to be an array in the JSON string but got `%s`", jsonObj.get("audit_logs_claims").toString()));
      }
      // validate the optional field `aws_iam_access_rules`
      if (jsonObj.get("aws_iam_access_rules") != null && !jsonObj.get("aws_iam_access_rules").isJsonNull()) {
        AWSIAMAccessRules.validateJsonElement(jsonObj.get("aws_iam_access_rules"));
      }
      // validate the optional field `azure_ad_access_rules`
      if (jsonObj.get("azure_ad_access_rules") != null && !jsonObj.get("azure_ad_access_rules").isJsonNull()) {
        AzureADAccessRules.validateJsonElement(jsonObj.get("azure_ad_access_rules"));
      }
      // validate the optional field `cert_access_rules`
      if (jsonObj.get("cert_access_rules") != null && !jsonObj.get("cert_access_rules").isJsonNull()) {
        CertAccessRules.validateJsonElement(jsonObj.get("cert_access_rules"));
      }
      if ((jsonObj.get("cidr_whitelist") != null && !jsonObj.get("cidr_whitelist").isJsonNull()) && !jsonObj.get("cidr_whitelist").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cidr_whitelist` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cidr_whitelist").toString()));
      }
      // validate the optional field `email_pass_access_rules`
      if (jsonObj.get("email_pass_access_rules") != null && !jsonObj.get("email_pass_access_rules").isJsonNull()) {
        EmailPassAccessRules.validateJsonElement(jsonObj.get("email_pass_access_rules"));
      }
      // validate the optional field `gcp_access_rules`
      if (jsonObj.get("gcp_access_rules") != null && !jsonObj.get("gcp_access_rules").isJsonNull()) {
        GCPAccessRules.validateJsonElement(jsonObj.get("gcp_access_rules"));
      }
      if ((jsonObj.get("gw_cidr_whitelist") != null && !jsonObj.get("gw_cidr_whitelist").isJsonNull()) && !jsonObj.get("gw_cidr_whitelist").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gw_cidr_whitelist` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gw_cidr_whitelist").toString()));
      }
      // validate the optional field `huawei_access_rules`
      if (jsonObj.get("huawei_access_rules") != null && !jsonObj.get("huawei_access_rules").isJsonNull()) {
        HuaweiAccessRules.validateJsonElement(jsonObj.get("huawei_access_rules"));
      }
      // validate the optional field `k8s_access_rules`
      if (jsonObj.get("k8s_access_rules") != null && !jsonObj.get("k8s_access_rules").isJsonNull()) {
        KubernetesAccessRules.validateJsonElement(jsonObj.get("k8s_access_rules"));
      }
      // validate the optional field `kerberos_access_rules`
      if (jsonObj.get("kerberos_access_rules") != null && !jsonObj.get("kerberos_access_rules").isJsonNull()) {
        KerberosAccessRules.validateJsonElement(jsonObj.get("kerberos_access_rules"));
      }
      // validate the optional field `ldap_access_rules`
      if (jsonObj.get("ldap_access_rules") != null && !jsonObj.get("ldap_access_rules").isJsonNull()) {
        LDAPAccessRules.validateJsonElement(jsonObj.get("ldap_access_rules"));
      }
      // validate the optional field `oauth2_access_rules`
      if (jsonObj.get("oauth2_access_rules") != null && !jsonObj.get("oauth2_access_rules").isJsonNull()) {
        OAuth2AccessRules.validateJsonElement(jsonObj.get("oauth2_access_rules"));
      }
      // validate the optional field `oci_access_rules`
      if (jsonObj.get("oci_access_rules") != null && !jsonObj.get("oci_access_rules").isJsonNull()) {
        OCIAccessRules.validateJsonElement(jsonObj.get("oci_access_rules"));
      }
      // validate the optional field `oidc_access_rules`
      if (jsonObj.get("oidc_access_rules") != null && !jsonObj.get("oidc_access_rules").isJsonNull()) {
        OIDCAccessRules.validateJsonElement(jsonObj.get("oidc_access_rules"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("product_types") != null && !jsonObj.get("product_types").isJsonNull() && !jsonObj.get("product_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_types` to be an array in the JSON string but got `%s`", jsonObj.get("product_types").toString()));
      }
      if ((jsonObj.get("rules_type") != null && !jsonObj.get("rules_type").isJsonNull()) && !jsonObj.get("rules_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rules_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rules_type").toString()));
      }
      // validate the optional field `saml_access_rules`
      if (jsonObj.get("saml_access_rules") != null && !jsonObj.get("saml_access_rules").isJsonNull()) {
        SAMLAccessRules.validateJsonElement(jsonObj.get("saml_access_rules"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sub_claims_delimiters") != null && !jsonObj.get("sub_claims_delimiters").isJsonNull() && !jsonObj.get("sub_claims_delimiters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_claims_delimiters` to be an array in the JSON string but got `%s`", jsonObj.get("sub_claims_delimiters").toString()));
      }
      // validate the optional field `universal_identity_access_rules`
      if (jsonObj.get("universal_identity_access_rules") != null && !jsonObj.get("universal_identity_access_rules").isJsonNull()) {
        UniversalIdentityAccessRules.validateJsonElement(jsonObj.get("universal_identity_access_rules"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthMethodAccessInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthMethodAccessInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthMethodAccessInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthMethodAccessInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthMethodAccessInfo>() {
           @Override
           public void write(JsonWriter out, AuthMethodAccessInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthMethodAccessInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthMethodAccessInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthMethodAccessInfo
   * @throws IOException if the JSON string is invalid with respect to AuthMethodAccessInfo
   */
  public static AuthMethodAccessInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthMethodAccessInfo.class);
  }

  /**
   * Convert an instance of AuthMethodAccessInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

