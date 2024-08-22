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
import io.akeyless.client.model.AWSTargetDetails;
import io.akeyless.client.model.ArtifactoryTargetDetails;
import io.akeyless.client.model.AzureTargetDetails;
import io.akeyless.client.model.ChefTargetDetails;
import io.akeyless.client.model.CustomTargetDetails;
import io.akeyless.client.model.DbTargetDetails;
import io.akeyless.client.model.DockerhubTargetDetails;
import io.akeyless.client.model.EKSTargetDetails;
import io.akeyless.client.model.GKETargetDetails;
import io.akeyless.client.model.GcpTargetDetails;
import io.akeyless.client.model.GithubTargetDetails;
import io.akeyless.client.model.GitlabTargetDetails;
import io.akeyless.client.model.GlobalSignAtlasTargetDetails;
import io.akeyless.client.model.GlobalSignGCCTargetDetails;
import io.akeyless.client.model.GodaddyTargetDetails;
import io.akeyless.client.model.HashiVaultTargetDetails;
import io.akeyless.client.model.LdapTargetDetails;
import io.akeyless.client.model.LinkedTargetDetails;
import io.akeyless.client.model.MongoDBTargetDetails;
import io.akeyless.client.model.NativeK8sTargetDetails;
import io.akeyless.client.model.PingTargetDetails;
import io.akeyless.client.model.RabbitMQTargetDetails;
import io.akeyless.client.model.SSHTargetDetails;
import io.akeyless.client.model.SalesforceTargetDetails;
import io.akeyless.client.model.SectigoTargetDetails;
import io.akeyless.client.model.VenafiTargetDetails;
import io.akeyless.client.model.WebTargetDetails;
import io.akeyless.client.model.WindowsTargetDetails;
import io.akeyless.client.model.ZeroSSLTargetDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TargetTypeDetailsInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TargetTypeDetailsInput {
  public static final String SERIALIZED_NAME_ARTIFACTORY_TARGET_DETAILS = "artifactory_target_details";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY_TARGET_DETAILS)
  private ArtifactoryTargetDetails artifactoryTargetDetails;

  public static final String SERIALIZED_NAME_AWS_TARGET_DETAILS = "aws_target_details";
  @SerializedName(SERIALIZED_NAME_AWS_TARGET_DETAILS)
  private AWSTargetDetails awsTargetDetails;

  public static final String SERIALIZED_NAME_AZURE_TARGET_DETAILS = "azure_target_details";
  @SerializedName(SERIALIZED_NAME_AZURE_TARGET_DETAILS)
  private AzureTargetDetails azureTargetDetails;

  public static final String SERIALIZED_NAME_CHEF_TARGET_DETAILS = "chef_target_details";
  @SerializedName(SERIALIZED_NAME_CHEF_TARGET_DETAILS)
  private ChefTargetDetails chefTargetDetails;

  public static final String SERIALIZED_NAME_CUSTOM_TARGET_DETAILS = "custom_target_details";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TARGET_DETAILS)
  private CustomTargetDetails customTargetDetails;

  public static final String SERIALIZED_NAME_DB_TARGET_DETAILS = "db_target_details";
  @SerializedName(SERIALIZED_NAME_DB_TARGET_DETAILS)
  private DbTargetDetails dbTargetDetails;

  public static final String SERIALIZED_NAME_DOCKERHUB_TARGET_DETAILS = "dockerhub_target_details";
  @SerializedName(SERIALIZED_NAME_DOCKERHUB_TARGET_DETAILS)
  private DockerhubTargetDetails dockerhubTargetDetails;

  public static final String SERIALIZED_NAME_EKS_TARGET_DETAILS = "eks_target_details";
  @SerializedName(SERIALIZED_NAME_EKS_TARGET_DETAILS)
  private EKSTargetDetails eksTargetDetails;

  public static final String SERIALIZED_NAME_GCP_TARGET_DETAILS = "gcp_target_details";
  @SerializedName(SERIALIZED_NAME_GCP_TARGET_DETAILS)
  private GcpTargetDetails gcpTargetDetails;

  public static final String SERIALIZED_NAME_GITHUB_TARGET_DETAILS = "github_target_details";
  @SerializedName(SERIALIZED_NAME_GITHUB_TARGET_DETAILS)
  private GithubTargetDetails githubTargetDetails;

  public static final String SERIALIZED_NAME_GITLAB_TARGET_DETAILS = "gitlab_target_details";
  @SerializedName(SERIALIZED_NAME_GITLAB_TARGET_DETAILS)
  private GitlabTargetDetails gitlabTargetDetails;

  public static final String SERIALIZED_NAME_GKE_TARGET_DETAILS = "gke_target_details";
  @SerializedName(SERIALIZED_NAME_GKE_TARGET_DETAILS)
  private GKETargetDetails gkeTargetDetails;

  public static final String SERIALIZED_NAME_GLOBALSIGN_ATLAS_TARGET_DETAILS = "globalsign_atlas_target_details";
  @SerializedName(SERIALIZED_NAME_GLOBALSIGN_ATLAS_TARGET_DETAILS)
  private GlobalSignAtlasTargetDetails globalsignAtlasTargetDetails;

  public static final String SERIALIZED_NAME_GLOBALSIGN_TARGET_DETAILS = "globalsign_target_details";
  @SerializedName(SERIALIZED_NAME_GLOBALSIGN_TARGET_DETAILS)
  private GlobalSignGCCTargetDetails globalsignTargetDetails;

  public static final String SERIALIZED_NAME_GODADDY_TARGET_DETAILS = "godaddy_target_details";
  @SerializedName(SERIALIZED_NAME_GODADDY_TARGET_DETAILS)
  private GodaddyTargetDetails godaddyTargetDetails;

  public static final String SERIALIZED_NAME_HASHI_VAULT_TARGET_DETAILS = "hashi_vault_target_details";
  @SerializedName(SERIALIZED_NAME_HASHI_VAULT_TARGET_DETAILS)
  private HashiVaultTargetDetails hashiVaultTargetDetails;

  public static final String SERIALIZED_NAME_LDAP_TARGET_DETAILS = "ldap_target_details";
  @SerializedName(SERIALIZED_NAME_LDAP_TARGET_DETAILS)
  private LdapTargetDetails ldapTargetDetails;

  public static final String SERIALIZED_NAME_LINKED_TARGET_DETAILS = "linked_target_details";
  @SerializedName(SERIALIZED_NAME_LINKED_TARGET_DETAILS)
  private LinkedTargetDetails linkedTargetDetails;

  public static final String SERIALIZED_NAME_MONGO_DB_TARGET_DETAILS = "mongo_db_target_details";
  @SerializedName(SERIALIZED_NAME_MONGO_DB_TARGET_DETAILS)
  private MongoDBTargetDetails mongoDbTargetDetails;

  public static final String SERIALIZED_NAME_NATIVE_K8S_TARGET_DETAILS = "native_k8s_target_details";
  @SerializedName(SERIALIZED_NAME_NATIVE_K8S_TARGET_DETAILS)
  private NativeK8sTargetDetails nativeK8sTargetDetails;

  public static final String SERIALIZED_NAME_PING_TARGET_DETAILS = "ping_target_details";
  @SerializedName(SERIALIZED_NAME_PING_TARGET_DETAILS)
  private PingTargetDetails pingTargetDetails;

  public static final String SERIALIZED_NAME_RABBIT_MQ_TARGET_DETAILS = "rabbit_mq_target_details";
  @SerializedName(SERIALIZED_NAME_RABBIT_MQ_TARGET_DETAILS)
  private RabbitMQTargetDetails rabbitMqTargetDetails;

  public static final String SERIALIZED_NAME_SALESFORCE_TARGET_DETAILS = "salesforce_target_details";
  @SerializedName(SERIALIZED_NAME_SALESFORCE_TARGET_DETAILS)
  private SalesforceTargetDetails salesforceTargetDetails;

  public static final String SERIALIZED_NAME_SECTIGO_TARGET_DETAILS = "sectigo_target_details";
  @SerializedName(SERIALIZED_NAME_SECTIGO_TARGET_DETAILS)
  private SectigoTargetDetails sectigoTargetDetails;

  public static final String SERIALIZED_NAME_SSH_TARGET_DETAILS = "ssh_target_details";
  @SerializedName(SERIALIZED_NAME_SSH_TARGET_DETAILS)
  private SSHTargetDetails sshTargetDetails;

  public static final String SERIALIZED_NAME_VENAFI_TARGET_DETAILS = "venafi_target_details";
  @SerializedName(SERIALIZED_NAME_VENAFI_TARGET_DETAILS)
  private VenafiTargetDetails venafiTargetDetails;

  public static final String SERIALIZED_NAME_WEB_TARGET_DETAILS = "web_target_details";
  @SerializedName(SERIALIZED_NAME_WEB_TARGET_DETAILS)
  private WebTargetDetails webTargetDetails;

  public static final String SERIALIZED_NAME_WINDOWS_TARGET_DETAILS = "windows_target_details";
  @SerializedName(SERIALIZED_NAME_WINDOWS_TARGET_DETAILS)
  private WindowsTargetDetails windowsTargetDetails;

  public static final String SERIALIZED_NAME_ZEROSSL_TARGET_DETAILS = "zerossl_target_details";
  @SerializedName(SERIALIZED_NAME_ZEROSSL_TARGET_DETAILS)
  private ZeroSSLTargetDetails zerosslTargetDetails;

  public TargetTypeDetailsInput() { 
  }

  public TargetTypeDetailsInput artifactoryTargetDetails(ArtifactoryTargetDetails artifactoryTargetDetails) {
    
    this.artifactoryTargetDetails = artifactoryTargetDetails;
    return this;
  }

   /**
   * Get artifactoryTargetDetails
   * @return artifactoryTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArtifactoryTargetDetails getArtifactoryTargetDetails() {
    return artifactoryTargetDetails;
  }


  public void setArtifactoryTargetDetails(ArtifactoryTargetDetails artifactoryTargetDetails) {
    this.artifactoryTargetDetails = artifactoryTargetDetails;
  }


  public TargetTypeDetailsInput awsTargetDetails(AWSTargetDetails awsTargetDetails) {
    
    this.awsTargetDetails = awsTargetDetails;
    return this;
  }

   /**
   * Get awsTargetDetails
   * @return awsTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AWSTargetDetails getAwsTargetDetails() {
    return awsTargetDetails;
  }


  public void setAwsTargetDetails(AWSTargetDetails awsTargetDetails) {
    this.awsTargetDetails = awsTargetDetails;
  }


  public TargetTypeDetailsInput azureTargetDetails(AzureTargetDetails azureTargetDetails) {
    
    this.azureTargetDetails = azureTargetDetails;
    return this;
  }

   /**
   * Get azureTargetDetails
   * @return azureTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AzureTargetDetails getAzureTargetDetails() {
    return azureTargetDetails;
  }


  public void setAzureTargetDetails(AzureTargetDetails azureTargetDetails) {
    this.azureTargetDetails = azureTargetDetails;
  }


  public TargetTypeDetailsInput chefTargetDetails(ChefTargetDetails chefTargetDetails) {
    
    this.chefTargetDetails = chefTargetDetails;
    return this;
  }

   /**
   * Get chefTargetDetails
   * @return chefTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChefTargetDetails getChefTargetDetails() {
    return chefTargetDetails;
  }


  public void setChefTargetDetails(ChefTargetDetails chefTargetDetails) {
    this.chefTargetDetails = chefTargetDetails;
  }


  public TargetTypeDetailsInput customTargetDetails(CustomTargetDetails customTargetDetails) {
    
    this.customTargetDetails = customTargetDetails;
    return this;
  }

   /**
   * Get customTargetDetails
   * @return customTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomTargetDetails getCustomTargetDetails() {
    return customTargetDetails;
  }


  public void setCustomTargetDetails(CustomTargetDetails customTargetDetails) {
    this.customTargetDetails = customTargetDetails;
  }


  public TargetTypeDetailsInput dbTargetDetails(DbTargetDetails dbTargetDetails) {
    
    this.dbTargetDetails = dbTargetDetails;
    return this;
  }

   /**
   * Get dbTargetDetails
   * @return dbTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DbTargetDetails getDbTargetDetails() {
    return dbTargetDetails;
  }


  public void setDbTargetDetails(DbTargetDetails dbTargetDetails) {
    this.dbTargetDetails = dbTargetDetails;
  }


  public TargetTypeDetailsInput dockerhubTargetDetails(DockerhubTargetDetails dockerhubTargetDetails) {
    
    this.dockerhubTargetDetails = dockerhubTargetDetails;
    return this;
  }

   /**
   * Get dockerhubTargetDetails
   * @return dockerhubTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DockerhubTargetDetails getDockerhubTargetDetails() {
    return dockerhubTargetDetails;
  }


  public void setDockerhubTargetDetails(DockerhubTargetDetails dockerhubTargetDetails) {
    this.dockerhubTargetDetails = dockerhubTargetDetails;
  }


  public TargetTypeDetailsInput eksTargetDetails(EKSTargetDetails eksTargetDetails) {
    
    this.eksTargetDetails = eksTargetDetails;
    return this;
  }

   /**
   * Get eksTargetDetails
   * @return eksTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EKSTargetDetails getEksTargetDetails() {
    return eksTargetDetails;
  }


  public void setEksTargetDetails(EKSTargetDetails eksTargetDetails) {
    this.eksTargetDetails = eksTargetDetails;
  }


  public TargetTypeDetailsInput gcpTargetDetails(GcpTargetDetails gcpTargetDetails) {
    
    this.gcpTargetDetails = gcpTargetDetails;
    return this;
  }

   /**
   * Get gcpTargetDetails
   * @return gcpTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GcpTargetDetails getGcpTargetDetails() {
    return gcpTargetDetails;
  }


  public void setGcpTargetDetails(GcpTargetDetails gcpTargetDetails) {
    this.gcpTargetDetails = gcpTargetDetails;
  }


  public TargetTypeDetailsInput githubTargetDetails(GithubTargetDetails githubTargetDetails) {
    
    this.githubTargetDetails = githubTargetDetails;
    return this;
  }

   /**
   * Get githubTargetDetails
   * @return githubTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GithubTargetDetails getGithubTargetDetails() {
    return githubTargetDetails;
  }


  public void setGithubTargetDetails(GithubTargetDetails githubTargetDetails) {
    this.githubTargetDetails = githubTargetDetails;
  }


  public TargetTypeDetailsInput gitlabTargetDetails(GitlabTargetDetails gitlabTargetDetails) {
    
    this.gitlabTargetDetails = gitlabTargetDetails;
    return this;
  }

   /**
   * Get gitlabTargetDetails
   * @return gitlabTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GitlabTargetDetails getGitlabTargetDetails() {
    return gitlabTargetDetails;
  }


  public void setGitlabTargetDetails(GitlabTargetDetails gitlabTargetDetails) {
    this.gitlabTargetDetails = gitlabTargetDetails;
  }


  public TargetTypeDetailsInput gkeTargetDetails(GKETargetDetails gkeTargetDetails) {
    
    this.gkeTargetDetails = gkeTargetDetails;
    return this;
  }

   /**
   * Get gkeTargetDetails
   * @return gkeTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GKETargetDetails getGkeTargetDetails() {
    return gkeTargetDetails;
  }


  public void setGkeTargetDetails(GKETargetDetails gkeTargetDetails) {
    this.gkeTargetDetails = gkeTargetDetails;
  }


  public TargetTypeDetailsInput globalsignAtlasTargetDetails(GlobalSignAtlasTargetDetails globalsignAtlasTargetDetails) {
    
    this.globalsignAtlasTargetDetails = globalsignAtlasTargetDetails;
    return this;
  }

   /**
   * Get globalsignAtlasTargetDetails
   * @return globalsignAtlasTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GlobalSignAtlasTargetDetails getGlobalsignAtlasTargetDetails() {
    return globalsignAtlasTargetDetails;
  }


  public void setGlobalsignAtlasTargetDetails(GlobalSignAtlasTargetDetails globalsignAtlasTargetDetails) {
    this.globalsignAtlasTargetDetails = globalsignAtlasTargetDetails;
  }


  public TargetTypeDetailsInput globalsignTargetDetails(GlobalSignGCCTargetDetails globalsignTargetDetails) {
    
    this.globalsignTargetDetails = globalsignTargetDetails;
    return this;
  }

   /**
   * Get globalsignTargetDetails
   * @return globalsignTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GlobalSignGCCTargetDetails getGlobalsignTargetDetails() {
    return globalsignTargetDetails;
  }


  public void setGlobalsignTargetDetails(GlobalSignGCCTargetDetails globalsignTargetDetails) {
    this.globalsignTargetDetails = globalsignTargetDetails;
  }


  public TargetTypeDetailsInput godaddyTargetDetails(GodaddyTargetDetails godaddyTargetDetails) {
    
    this.godaddyTargetDetails = godaddyTargetDetails;
    return this;
  }

   /**
   * Get godaddyTargetDetails
   * @return godaddyTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GodaddyTargetDetails getGodaddyTargetDetails() {
    return godaddyTargetDetails;
  }


  public void setGodaddyTargetDetails(GodaddyTargetDetails godaddyTargetDetails) {
    this.godaddyTargetDetails = godaddyTargetDetails;
  }


  public TargetTypeDetailsInput hashiVaultTargetDetails(HashiVaultTargetDetails hashiVaultTargetDetails) {
    
    this.hashiVaultTargetDetails = hashiVaultTargetDetails;
    return this;
  }

   /**
   * Get hashiVaultTargetDetails
   * @return hashiVaultTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HashiVaultTargetDetails getHashiVaultTargetDetails() {
    return hashiVaultTargetDetails;
  }


  public void setHashiVaultTargetDetails(HashiVaultTargetDetails hashiVaultTargetDetails) {
    this.hashiVaultTargetDetails = hashiVaultTargetDetails;
  }


  public TargetTypeDetailsInput ldapTargetDetails(LdapTargetDetails ldapTargetDetails) {
    
    this.ldapTargetDetails = ldapTargetDetails;
    return this;
  }

   /**
   * Get ldapTargetDetails
   * @return ldapTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LdapTargetDetails getLdapTargetDetails() {
    return ldapTargetDetails;
  }


  public void setLdapTargetDetails(LdapTargetDetails ldapTargetDetails) {
    this.ldapTargetDetails = ldapTargetDetails;
  }


  public TargetTypeDetailsInput linkedTargetDetails(LinkedTargetDetails linkedTargetDetails) {
    
    this.linkedTargetDetails = linkedTargetDetails;
    return this;
  }

   /**
   * Get linkedTargetDetails
   * @return linkedTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkedTargetDetails getLinkedTargetDetails() {
    return linkedTargetDetails;
  }


  public void setLinkedTargetDetails(LinkedTargetDetails linkedTargetDetails) {
    this.linkedTargetDetails = linkedTargetDetails;
  }


  public TargetTypeDetailsInput mongoDbTargetDetails(MongoDBTargetDetails mongoDbTargetDetails) {
    
    this.mongoDbTargetDetails = mongoDbTargetDetails;
    return this;
  }

   /**
   * Get mongoDbTargetDetails
   * @return mongoDbTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MongoDBTargetDetails getMongoDbTargetDetails() {
    return mongoDbTargetDetails;
  }


  public void setMongoDbTargetDetails(MongoDBTargetDetails mongoDbTargetDetails) {
    this.mongoDbTargetDetails = mongoDbTargetDetails;
  }


  public TargetTypeDetailsInput nativeK8sTargetDetails(NativeK8sTargetDetails nativeK8sTargetDetails) {
    
    this.nativeK8sTargetDetails = nativeK8sTargetDetails;
    return this;
  }

   /**
   * Get nativeK8sTargetDetails
   * @return nativeK8sTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NativeK8sTargetDetails getNativeK8sTargetDetails() {
    return nativeK8sTargetDetails;
  }


  public void setNativeK8sTargetDetails(NativeK8sTargetDetails nativeK8sTargetDetails) {
    this.nativeK8sTargetDetails = nativeK8sTargetDetails;
  }


  public TargetTypeDetailsInput pingTargetDetails(PingTargetDetails pingTargetDetails) {
    
    this.pingTargetDetails = pingTargetDetails;
    return this;
  }

   /**
   * Get pingTargetDetails
   * @return pingTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PingTargetDetails getPingTargetDetails() {
    return pingTargetDetails;
  }


  public void setPingTargetDetails(PingTargetDetails pingTargetDetails) {
    this.pingTargetDetails = pingTargetDetails;
  }


  public TargetTypeDetailsInput rabbitMqTargetDetails(RabbitMQTargetDetails rabbitMqTargetDetails) {
    
    this.rabbitMqTargetDetails = rabbitMqTargetDetails;
    return this;
  }

   /**
   * Get rabbitMqTargetDetails
   * @return rabbitMqTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RabbitMQTargetDetails getRabbitMqTargetDetails() {
    return rabbitMqTargetDetails;
  }


  public void setRabbitMqTargetDetails(RabbitMQTargetDetails rabbitMqTargetDetails) {
    this.rabbitMqTargetDetails = rabbitMqTargetDetails;
  }


  public TargetTypeDetailsInput salesforceTargetDetails(SalesforceTargetDetails salesforceTargetDetails) {
    
    this.salesforceTargetDetails = salesforceTargetDetails;
    return this;
  }

   /**
   * Get salesforceTargetDetails
   * @return salesforceTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SalesforceTargetDetails getSalesforceTargetDetails() {
    return salesforceTargetDetails;
  }


  public void setSalesforceTargetDetails(SalesforceTargetDetails salesforceTargetDetails) {
    this.salesforceTargetDetails = salesforceTargetDetails;
  }


  public TargetTypeDetailsInput sectigoTargetDetails(SectigoTargetDetails sectigoTargetDetails) {
    
    this.sectigoTargetDetails = sectigoTargetDetails;
    return this;
  }

   /**
   * Get sectigoTargetDetails
   * @return sectigoTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SectigoTargetDetails getSectigoTargetDetails() {
    return sectigoTargetDetails;
  }


  public void setSectigoTargetDetails(SectigoTargetDetails sectigoTargetDetails) {
    this.sectigoTargetDetails = sectigoTargetDetails;
  }


  public TargetTypeDetailsInput sshTargetDetails(SSHTargetDetails sshTargetDetails) {
    
    this.sshTargetDetails = sshTargetDetails;
    return this;
  }

   /**
   * Get sshTargetDetails
   * @return sshTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SSHTargetDetails getSshTargetDetails() {
    return sshTargetDetails;
  }


  public void setSshTargetDetails(SSHTargetDetails sshTargetDetails) {
    this.sshTargetDetails = sshTargetDetails;
  }


  public TargetTypeDetailsInput venafiTargetDetails(VenafiTargetDetails venafiTargetDetails) {
    
    this.venafiTargetDetails = venafiTargetDetails;
    return this;
  }

   /**
   * Get venafiTargetDetails
   * @return venafiTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VenafiTargetDetails getVenafiTargetDetails() {
    return venafiTargetDetails;
  }


  public void setVenafiTargetDetails(VenafiTargetDetails venafiTargetDetails) {
    this.venafiTargetDetails = venafiTargetDetails;
  }


  public TargetTypeDetailsInput webTargetDetails(WebTargetDetails webTargetDetails) {
    
    this.webTargetDetails = webTargetDetails;
    return this;
  }

   /**
   * Get webTargetDetails
   * @return webTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebTargetDetails getWebTargetDetails() {
    return webTargetDetails;
  }


  public void setWebTargetDetails(WebTargetDetails webTargetDetails) {
    this.webTargetDetails = webTargetDetails;
  }


  public TargetTypeDetailsInput windowsTargetDetails(WindowsTargetDetails windowsTargetDetails) {
    
    this.windowsTargetDetails = windowsTargetDetails;
    return this;
  }

   /**
   * Get windowsTargetDetails
   * @return windowsTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WindowsTargetDetails getWindowsTargetDetails() {
    return windowsTargetDetails;
  }


  public void setWindowsTargetDetails(WindowsTargetDetails windowsTargetDetails) {
    this.windowsTargetDetails = windowsTargetDetails;
  }


  public TargetTypeDetailsInput zerosslTargetDetails(ZeroSSLTargetDetails zerosslTargetDetails) {
    
    this.zerosslTargetDetails = zerosslTargetDetails;
    return this;
  }

   /**
   * Get zerosslTargetDetails
   * @return zerosslTargetDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZeroSSLTargetDetails getZerosslTargetDetails() {
    return zerosslTargetDetails;
  }


  public void setZerosslTargetDetails(ZeroSSLTargetDetails zerosslTargetDetails) {
    this.zerosslTargetDetails = zerosslTargetDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetTypeDetailsInput targetTypeDetailsInput = (TargetTypeDetailsInput) o;
    return Objects.equals(this.artifactoryTargetDetails, targetTypeDetailsInput.artifactoryTargetDetails) &&
        Objects.equals(this.awsTargetDetails, targetTypeDetailsInput.awsTargetDetails) &&
        Objects.equals(this.azureTargetDetails, targetTypeDetailsInput.azureTargetDetails) &&
        Objects.equals(this.chefTargetDetails, targetTypeDetailsInput.chefTargetDetails) &&
        Objects.equals(this.customTargetDetails, targetTypeDetailsInput.customTargetDetails) &&
        Objects.equals(this.dbTargetDetails, targetTypeDetailsInput.dbTargetDetails) &&
        Objects.equals(this.dockerhubTargetDetails, targetTypeDetailsInput.dockerhubTargetDetails) &&
        Objects.equals(this.eksTargetDetails, targetTypeDetailsInput.eksTargetDetails) &&
        Objects.equals(this.gcpTargetDetails, targetTypeDetailsInput.gcpTargetDetails) &&
        Objects.equals(this.githubTargetDetails, targetTypeDetailsInput.githubTargetDetails) &&
        Objects.equals(this.gitlabTargetDetails, targetTypeDetailsInput.gitlabTargetDetails) &&
        Objects.equals(this.gkeTargetDetails, targetTypeDetailsInput.gkeTargetDetails) &&
        Objects.equals(this.globalsignAtlasTargetDetails, targetTypeDetailsInput.globalsignAtlasTargetDetails) &&
        Objects.equals(this.globalsignTargetDetails, targetTypeDetailsInput.globalsignTargetDetails) &&
        Objects.equals(this.godaddyTargetDetails, targetTypeDetailsInput.godaddyTargetDetails) &&
        Objects.equals(this.hashiVaultTargetDetails, targetTypeDetailsInput.hashiVaultTargetDetails) &&
        Objects.equals(this.ldapTargetDetails, targetTypeDetailsInput.ldapTargetDetails) &&
        Objects.equals(this.linkedTargetDetails, targetTypeDetailsInput.linkedTargetDetails) &&
        Objects.equals(this.mongoDbTargetDetails, targetTypeDetailsInput.mongoDbTargetDetails) &&
        Objects.equals(this.nativeK8sTargetDetails, targetTypeDetailsInput.nativeK8sTargetDetails) &&
        Objects.equals(this.pingTargetDetails, targetTypeDetailsInput.pingTargetDetails) &&
        Objects.equals(this.rabbitMqTargetDetails, targetTypeDetailsInput.rabbitMqTargetDetails) &&
        Objects.equals(this.salesforceTargetDetails, targetTypeDetailsInput.salesforceTargetDetails) &&
        Objects.equals(this.sectigoTargetDetails, targetTypeDetailsInput.sectigoTargetDetails) &&
        Objects.equals(this.sshTargetDetails, targetTypeDetailsInput.sshTargetDetails) &&
        Objects.equals(this.venafiTargetDetails, targetTypeDetailsInput.venafiTargetDetails) &&
        Objects.equals(this.webTargetDetails, targetTypeDetailsInput.webTargetDetails) &&
        Objects.equals(this.windowsTargetDetails, targetTypeDetailsInput.windowsTargetDetails) &&
        Objects.equals(this.zerosslTargetDetails, targetTypeDetailsInput.zerosslTargetDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactoryTargetDetails, awsTargetDetails, azureTargetDetails, chefTargetDetails, customTargetDetails, dbTargetDetails, dockerhubTargetDetails, eksTargetDetails, gcpTargetDetails, githubTargetDetails, gitlabTargetDetails, gkeTargetDetails, globalsignAtlasTargetDetails, globalsignTargetDetails, godaddyTargetDetails, hashiVaultTargetDetails, ldapTargetDetails, linkedTargetDetails, mongoDbTargetDetails, nativeK8sTargetDetails, pingTargetDetails, rabbitMqTargetDetails, salesforceTargetDetails, sectigoTargetDetails, sshTargetDetails, venafiTargetDetails, webTargetDetails, windowsTargetDetails, zerosslTargetDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetTypeDetailsInput {\n");
    sb.append("    artifactoryTargetDetails: ").append(toIndentedString(artifactoryTargetDetails)).append("\n");
    sb.append("    awsTargetDetails: ").append(toIndentedString(awsTargetDetails)).append("\n");
    sb.append("    azureTargetDetails: ").append(toIndentedString(azureTargetDetails)).append("\n");
    sb.append("    chefTargetDetails: ").append(toIndentedString(chefTargetDetails)).append("\n");
    sb.append("    customTargetDetails: ").append(toIndentedString(customTargetDetails)).append("\n");
    sb.append("    dbTargetDetails: ").append(toIndentedString(dbTargetDetails)).append("\n");
    sb.append("    dockerhubTargetDetails: ").append(toIndentedString(dockerhubTargetDetails)).append("\n");
    sb.append("    eksTargetDetails: ").append(toIndentedString(eksTargetDetails)).append("\n");
    sb.append("    gcpTargetDetails: ").append(toIndentedString(gcpTargetDetails)).append("\n");
    sb.append("    githubTargetDetails: ").append(toIndentedString(githubTargetDetails)).append("\n");
    sb.append("    gitlabTargetDetails: ").append(toIndentedString(gitlabTargetDetails)).append("\n");
    sb.append("    gkeTargetDetails: ").append(toIndentedString(gkeTargetDetails)).append("\n");
    sb.append("    globalsignAtlasTargetDetails: ").append(toIndentedString(globalsignAtlasTargetDetails)).append("\n");
    sb.append("    globalsignTargetDetails: ").append(toIndentedString(globalsignTargetDetails)).append("\n");
    sb.append("    godaddyTargetDetails: ").append(toIndentedString(godaddyTargetDetails)).append("\n");
    sb.append("    hashiVaultTargetDetails: ").append(toIndentedString(hashiVaultTargetDetails)).append("\n");
    sb.append("    ldapTargetDetails: ").append(toIndentedString(ldapTargetDetails)).append("\n");
    sb.append("    linkedTargetDetails: ").append(toIndentedString(linkedTargetDetails)).append("\n");
    sb.append("    mongoDbTargetDetails: ").append(toIndentedString(mongoDbTargetDetails)).append("\n");
    sb.append("    nativeK8sTargetDetails: ").append(toIndentedString(nativeK8sTargetDetails)).append("\n");
    sb.append("    pingTargetDetails: ").append(toIndentedString(pingTargetDetails)).append("\n");
    sb.append("    rabbitMqTargetDetails: ").append(toIndentedString(rabbitMqTargetDetails)).append("\n");
    sb.append("    salesforceTargetDetails: ").append(toIndentedString(salesforceTargetDetails)).append("\n");
    sb.append("    sectigoTargetDetails: ").append(toIndentedString(sectigoTargetDetails)).append("\n");
    sb.append("    sshTargetDetails: ").append(toIndentedString(sshTargetDetails)).append("\n");
    sb.append("    venafiTargetDetails: ").append(toIndentedString(venafiTargetDetails)).append("\n");
    sb.append("    webTargetDetails: ").append(toIndentedString(webTargetDetails)).append("\n");
    sb.append("    windowsTargetDetails: ").append(toIndentedString(windowsTargetDetails)).append("\n");
    sb.append("    zerosslTargetDetails: ").append(toIndentedString(zerosslTargetDetails)).append("\n");
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

