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

/**
 * Connect is a command that performs secure remote access
 */
@ApiModel(description = "Connect is a command that performs secure remote access")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Connect {
  public static final String SERIALIZED_NAME_HELPER = "Helper";
  @SerializedName(SERIALIZED_NAME_HELPER)
  private Object helper;

  public static final String SERIALIZED_NAME_RC_FILE_OVERRIDE = "RcFileOverride";
  @SerializedName(SERIALIZED_NAME_RC_FILE_OVERRIDE)
  private String rcFileOverride;

  public static final String SERIALIZED_NAME_BASTION_CTRL_PATH = "bastion-ctrl-path";
  @SerializedName(SERIALIZED_NAME_BASTION_CTRL_PATH)
  private String bastionCtrlPath;

  public static final String SERIALIZED_NAME_BASTION_CTRL_PORT = "bastion-ctrl-port";
  @SerializedName(SERIALIZED_NAME_BASTION_CTRL_PORT)
  private String bastionCtrlPort = "9900";

  public static final String SERIALIZED_NAME_BASTION_CTRL_PROTO = "bastion-ctrl-proto";
  @SerializedName(SERIALIZED_NAME_BASTION_CTRL_PROTO)
  private String bastionCtrlProto = "http";

  public static final String SERIALIZED_NAME_BASTION_CTRL_SUBDOMAIN = "bastion-ctrl-subdomain";
  @SerializedName(SERIALIZED_NAME_BASTION_CTRL_SUBDOMAIN)
  private String bastionCtrlSubdomain;

  public static final String SERIALIZED_NAME_CERT_ISSUER_NAME = "cert-issuer-name";
  @SerializedName(SERIALIZED_NAME_CERT_ISSUER_NAME)
  private String certIssuerName;

  public static final String SERIALIZED_NAME_IDENTITY_FILE = "identity-file";
  @SerializedName(SERIALIZED_NAME_IDENTITY_FILE)
  private String identityFile;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_JUSTIFICATION = "justification";
  @SerializedName(SERIALIZED_NAME_JUSTIFICATION)
  private String justification;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SSH_COMMAND = "ssh-command";
  @SerializedName(SERIALIZED_NAME_SSH_COMMAND)
  private String sshCommand;

  public static final String SERIALIZED_NAME_SSH_EXTRA_ARGS = "ssh-extra-args";
  @SerializedName(SERIALIZED_NAME_SSH_EXTRA_ARGS)
  private String sshExtraArgs;

  public static final String SERIALIZED_NAME_SSH_LEGACY_SIGNING_ALG = "ssh-legacy-signing-alg";
  @SerializedName(SERIALIZED_NAME_SSH_LEGACY_SIGNING_ALG)
  private Boolean sshLegacySigningAlg = false;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USE_SSH_AGENT = "use-ssh-agent";
  @SerializedName(SERIALIZED_NAME_USE_SSH_AGENT)
  private Boolean useSshAgent;

  public static final String SERIALIZED_NAME_VIA_BASTION = "via-bastion";
  @SerializedName(SERIALIZED_NAME_VIA_BASTION)
  private String viaBastion;

  public Connect() { 
  }

  public Connect helper(Object helper) {
    
    this.helper = helper;
    return this;
  }

   /**
   * Get helper
   * @return helper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getHelper() {
    return helper;
  }


  public void setHelper(Object helper) {
    this.helper = helper;
  }


  public Connect rcFileOverride(String rcFileOverride) {
    
    this.rcFileOverride = rcFileOverride;
    return this;
  }

   /**
   * used to override .akeyless-connect.rc in tests
   * @return rcFileOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "used to override .akeyless-connect.rc in tests")

  public String getRcFileOverride() {
    return rcFileOverride;
  }


  public void setRcFileOverride(String rcFileOverride) {
    this.rcFileOverride = rcFileOverride;
  }


  public Connect bastionCtrlPath(String bastionCtrlPath) {
    
    this.bastionCtrlPath = bastionCtrlPath;
    return this;
  }

   /**
   * The Bastion API path
   * @return bastionCtrlPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Bastion API path")

  public String getBastionCtrlPath() {
    return bastionCtrlPath;
  }


  public void setBastionCtrlPath(String bastionCtrlPath) {
    this.bastionCtrlPath = bastionCtrlPath;
  }


  public Connect bastionCtrlPort(String bastionCtrlPort) {
    
    this.bastionCtrlPort = bastionCtrlPort;
    return this;
  }

   /**
   * The Bastion API Port
   * @return bastionCtrlPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Bastion API Port")

  public String getBastionCtrlPort() {
    return bastionCtrlPort;
  }


  public void setBastionCtrlPort(String bastionCtrlPort) {
    this.bastionCtrlPort = bastionCtrlPort;
  }


  public Connect bastionCtrlProto(String bastionCtrlProto) {
    
    this.bastionCtrlProto = bastionCtrlProto;
    return this;
  }

   /**
   * The Bastion API protocol
   * @return bastionCtrlProto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Bastion API protocol")

  public String getBastionCtrlProto() {
    return bastionCtrlProto;
  }


  public void setBastionCtrlProto(String bastionCtrlProto) {
    this.bastionCtrlProto = bastionCtrlProto;
  }


  public Connect bastionCtrlSubdomain(String bastionCtrlSubdomain) {
    
    this.bastionCtrlSubdomain = bastionCtrlSubdomain;
    return this;
  }

   /**
   * The Bastion API prefix
   * @return bastionCtrlSubdomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Bastion API prefix")

  public String getBastionCtrlSubdomain() {
    return bastionCtrlSubdomain;
  }


  public void setBastionCtrlSubdomain(String bastionCtrlSubdomain) {
    this.bastionCtrlSubdomain = bastionCtrlSubdomain;
  }


  public Connect certIssuerName(String certIssuerName) {
    
    this.certIssuerName = certIssuerName;
    return this;
  }

   /**
   * The Akeyless certificate issuer name
   * @return certIssuerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Akeyless certificate issuer name")

  public String getCertIssuerName() {
    return certIssuerName;
  }


  public void setCertIssuerName(String certIssuerName) {
    this.certIssuerName = certIssuerName;
  }


  public Connect identityFile(String identityFile) {
    
    this.identityFile = identityFile;
    return this;
  }

   /**
   * The file from which the identity (private key) for public key authentication is read
   * @return identityFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The file from which the identity (private key) for public key authentication is read")

  public String getIdentityFile() {
    return identityFile;
  }


  public void setIdentityFile(String identityFile) {
    this.identityFile = identityFile;
  }


  public Connect json(Boolean json) {
    
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


  public Connect justification(String justification) {
    
    this.justification = justification;
    return this;
  }

   /**
   * Get justification
   * @return justification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJustification() {
    return justification;
  }


  public void setJustification(String justification) {
    this.justification = justification;
  }


  public Connect name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The Secret name (for database and AWS producers - producer name)
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Secret name (for database and AWS producers - producer name)")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Connect sshCommand(String sshCommand) {
    
    this.sshCommand = sshCommand;
    return this;
  }

   /**
   * Path to SSH executable. e.g. /usr/bin/ssh
   * @return sshCommand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to SSH executable. e.g. /usr/bin/ssh")

  public String getSshCommand() {
    return sshCommand;
  }


  public void setSshCommand(String sshCommand) {
    this.sshCommand = sshCommand;
  }


  public Connect sshExtraArgs(String sshExtraArgs) {
    
    this.sshExtraArgs = sshExtraArgs;
    return this;
  }

   /**
   * The Use to add offical SSH arguments (except -i)
   * @return sshExtraArgs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Use to add offical SSH arguments (except -i)")

  public String getSshExtraArgs() {
    return sshExtraArgs;
  }


  public void setSshExtraArgs(String sshExtraArgs) {
    this.sshExtraArgs = sshExtraArgs;
  }


  public Connect sshLegacySigningAlg(Boolean sshLegacySigningAlg) {
    
    this.sshLegacySigningAlg = sshLegacySigningAlg;
    return this;
  }

   /**
   * Set this option to output legacy (&#39;ssh-rsa-cert-v01@openssh.com&#39;) signing algorithm name in the ssh certificate.
   * @return sshLegacySigningAlg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set this option to output legacy ('ssh-rsa-cert-v01@openssh.com') signing algorithm name in the ssh certificate.")

  public Boolean getSshLegacySigningAlg() {
    return sshLegacySigningAlg;
  }


  public void setSshLegacySigningAlg(Boolean sshLegacySigningAlg) {
    this.sshLegacySigningAlg = sshLegacySigningAlg;
  }


  public Connect target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * The target
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The target")

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public Connect token(String token) {
    
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


  public Connect uidToken(String uidToken) {
    
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


  public Connect useSshAgent(Boolean useSshAgent) {
    
    this.useSshAgent = useSshAgent;
    return this;
  }

   /**
   * Enable ssh-agent
   * @return useSshAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable ssh-agent")

  public Boolean getUseSshAgent() {
    return useSshAgent;
  }


  public void setUseSshAgent(Boolean useSshAgent) {
    this.useSshAgent = useSshAgent;
  }


  public Connect viaBastion(String viaBastion) {
    
    this.viaBastion = viaBastion;
    return this;
  }

   /**
   * The jump box server
   * @return viaBastion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The jump box server")

  public String getViaBastion() {
    return viaBastion;
  }


  public void setViaBastion(String viaBastion) {
    this.viaBastion = viaBastion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connect connect = (Connect) o;
    return Objects.equals(this.helper, connect.helper) &&
        Objects.equals(this.rcFileOverride, connect.rcFileOverride) &&
        Objects.equals(this.bastionCtrlPath, connect.bastionCtrlPath) &&
        Objects.equals(this.bastionCtrlPort, connect.bastionCtrlPort) &&
        Objects.equals(this.bastionCtrlProto, connect.bastionCtrlProto) &&
        Objects.equals(this.bastionCtrlSubdomain, connect.bastionCtrlSubdomain) &&
        Objects.equals(this.certIssuerName, connect.certIssuerName) &&
        Objects.equals(this.identityFile, connect.identityFile) &&
        Objects.equals(this.json, connect.json) &&
        Objects.equals(this.justification, connect.justification) &&
        Objects.equals(this.name, connect.name) &&
        Objects.equals(this.sshCommand, connect.sshCommand) &&
        Objects.equals(this.sshExtraArgs, connect.sshExtraArgs) &&
        Objects.equals(this.sshLegacySigningAlg, connect.sshLegacySigningAlg) &&
        Objects.equals(this.target, connect.target) &&
        Objects.equals(this.token, connect.token) &&
        Objects.equals(this.uidToken, connect.uidToken) &&
        Objects.equals(this.useSshAgent, connect.useSshAgent) &&
        Objects.equals(this.viaBastion, connect.viaBastion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(helper, rcFileOverride, bastionCtrlPath, bastionCtrlPort, bastionCtrlProto, bastionCtrlSubdomain, certIssuerName, identityFile, json, justification, name, sshCommand, sshExtraArgs, sshLegacySigningAlg, target, token, uidToken, useSshAgent, viaBastion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connect {\n");
    sb.append("    helper: ").append(toIndentedString(helper)).append("\n");
    sb.append("    rcFileOverride: ").append(toIndentedString(rcFileOverride)).append("\n");
    sb.append("    bastionCtrlPath: ").append(toIndentedString(bastionCtrlPath)).append("\n");
    sb.append("    bastionCtrlPort: ").append(toIndentedString(bastionCtrlPort)).append("\n");
    sb.append("    bastionCtrlProto: ").append(toIndentedString(bastionCtrlProto)).append("\n");
    sb.append("    bastionCtrlSubdomain: ").append(toIndentedString(bastionCtrlSubdomain)).append("\n");
    sb.append("    certIssuerName: ").append(toIndentedString(certIssuerName)).append("\n");
    sb.append("    identityFile: ").append(toIndentedString(identityFile)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    justification: ").append(toIndentedString(justification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sshCommand: ").append(toIndentedString(sshCommand)).append("\n");
    sb.append("    sshExtraArgs: ").append(toIndentedString(sshExtraArgs)).append("\n");
    sb.append("    sshLegacySigningAlg: ").append(toIndentedString(sshLegacySigningAlg)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    useSshAgent: ").append(toIndentedString(useSshAgent)).append("\n");
    sb.append("    viaBastion: ").append(toIndentedString(viaBastion)).append("\n");
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

