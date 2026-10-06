

# TargetUpdateGoogleTrust

targetUpdateGoogleTrust is a command that updates an existing Google Trust target

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acmeChallenge** | **String** | ACME challenge type. Options: [dns] |  [optional] |
|**deleteProtection** | **String** | Protection from accidental deletion of this object [true/false] |  [optional] |
|**description** | **String** | Description of the object |  [optional] |
|**dnsPropagationWait** | **String** | Fixed wait after TXT publish (e.g. 30s, 2m). If omitted with pre-check on, no extra sleep (polling only). If omitted with --dns-skip-precheck, gateway uses 30s. DNS challenge only |  [optional] |
|**dnsResolvers** | **List&lt;String&gt;** | Custom DNS resolvers (ip:port) for DNS-01. Repeat for multiple. If omitted, Lego uses /etc/resolv.conf or Google Public DNS. DNS challenge only |  [optional] |
|**dnsSkipPrecheck** | **Boolean** | Skip DNS TXT pre-check before CA validation. If --dns-propagation-wait is omitted and this flag is set, gateway waits 30s before CA validation. DNS challenge only |  [optional] |
|**dnsTargetCreds** | **String** | Name of existing cloud target for DNS credentials. Required when challenge type is dns. Supported providers: AWS, Azure, GCP, Cloudflare |  [optional] |
|**dnsTimeout** | **String** | Per-query DNS lookup timeout during pre-check (e.g. 10s), not total poll time. If omitted with pre-check on, Lego library default applies (10s per query on Linux). Ignored when --dns-skip-precheck is set. DNS challenge only |  [optional] |
|**dnsZone** | **String** | Cloudflare DNS zone identifier. Required when DNS credentials target is Cloudflare |  [optional] |
|**eabHmacKey** | **String** | External Account Binding HMAC key (required for ACME account bootstrap on create) |  [optional] |
|**eabKeyId** | **String** | External Account Binding key identifier (required for ACME account bootstrap on create) |  [optional] |
|**email** | **String** | Email address for ACME account registration |  |
|**gcpProject** | **String** | GCP Cloud DNS project ID. Optional and can be derived from service account |  [optional] |
|**googleTrustUrl** | **String** | Google Trust directory environment. Options: [production/staging] |  [optional] |
|**hostedZone** | **String** | AWS Route53 hosted zone ID. Required when DNS credentials target is AWS |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**keepPrevVersion** | **String** | Whether to keep previous version [true/false]. If not set, use default according to account settings |  [optional] |
|**key** | **String** | The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used) |  [optional] |
|**lockOnRead** | **String** | Lock this secret after each successful value read |  [optional] |
|**lockTtl** | **String** | Lock TTL in minutes |  [optional] |
|**maxVersions** | **String** | Set the maximum number of versions, limited by the account settings defaults. |  [optional] |
|**name** | **String** | Target name |  |
|**newName** | **String** | New target name |  [optional] |
|**resourceGroup** | **String** | Azure resource group name. Required when DNS credentials target is Azure |  [optional] |
|**rotateOnUnlock** | **String** | Rotate this secret after it is unlocked |  [optional] |
|**timeout** | **String** | Timeout for challenge validation |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



