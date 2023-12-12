

# GeneralConfigPart


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**akeylessUrl** | **String** | AkeylessUrl is here for BC only. Gator will still return it if it exists in the configuration, but new clients (&gt;&#x3D;2.34.0) will ignore it and override it with what exists in their local file. It will no longer be sent to Gator for update, so new clusters will only have the default value saved in the DB. |  [optional]
**apiTokenTtl** | **String** |  |  [optional]
**displayName** | **String** |  |  [optional]
**enableSniProxy** | **Boolean** |  |  [optional]
**enableTls** | **Boolean** |  |  [optional]
**enableTlsConfigure** | **Boolean** |  |  [optional]
**enableTlsCurl** | **Boolean** |  |  [optional]
**enableTlsHvp** | **Boolean** |  |  [optional]
**gwClusterUrl** | **String** |  |  [optional]
**notifyOnStatusChange** | **Boolean** |  |  [optional]
**tcpPort** | **String** |  |  [optional]
**tlsCert** | **String** |  |  [optional]
**tlsKey** | **String** |  |  [optional]



