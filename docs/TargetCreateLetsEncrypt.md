

# TargetCreateLetsEncrypt

targetCreateLetsEncrypt is a command that creates a new Let's Encrypt target

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acmeChallenge** | **String** |  |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**dnsPropagationWait** | **String** | Fixed wait after TXT publish (e.g. 30s, 2m). If omitted with pre-check on, no extra sleep (polling only). If omitted with --dns-skip-precheck, gateway uses 30s. DNS challenge only |  [optional] |
|**dnsResolvers** | **List&lt;String&gt;** | Custom DNS resolvers (ip:port) for DNS-01. Repeat for multiple. If omitted, Lego uses /etc/resolv.conf or Google Public DNS. DNS challenge only |  [optional] |
|**dnsSkipPrecheck** | **Boolean** | Skip DNS TXT pre-check before CA validation. If --dns-propagation-wait is omitted and this flag is set, gateway waits 30s before CA validation. DNS challenge only |  [optional] |
|**dnsTargetCreds** | **String** | Name of existing cloud target for DNS credentials. Required when acme-challenge&#x3D;dns. Supported: AWS, Azure, GCP, Cloudflare targets |  [optional] |
|**dnsTimeout** | **String** | Per-query DNS lookup timeout during pre-check (e.g. 10s), not total poll time. If omitted with pre-check on, Lego library default applies (10s per query on Linux). Ignored when --dns-skip-precheck is set. DNS challenge only |  [optional] |
|**dnsZone** | **String** | Cloudflare DNS zone identifier. Required when dns-target-creds points to Cloudflare target |  [optional] |
|**email** | **String** | Email address for ACME account registration |  |
|**gcpProject** | **String** | GCP Cloud DNS: Project ID. Optional - can be derived from service account |  [optional] |
|**hostedZone** | **String** | AWS Route53 hosted zone ID. Required when dns-target-creds points to AWS target |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**letsEncryptUrl** | **String** |  |  [optional] |
|**lockOnRead** | **String** | Lock this secret after each successful value read |  [optional] |
|**lockTtl** | **String** | Lock TTL in minutes |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**resourceGroup** | **String** | Azure resource group name. Required when dns-target-creds points to Azure target |  [optional] |
|**rotateOnUnlock** | **String** | Rotate this secret after it is unlocked |  [optional] |
|**timeout** | **String** |  |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



