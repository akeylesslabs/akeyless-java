

# ListSRASessions

listSRASessions is a command that returns sra sessions of the given user

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**resourceType** | **List&lt;String&gt;** | session resource type. In case it is empty, all resources type will be returned. options: [mysql, k8s, ssh, mongodb, mssql, postgres, aws, eks, gke, rdp] |  [optional] |
|**statusType** | **List&lt;String&gt;** | session status type. In case it is empty, only active sessions will be returned. options: [connecting, connected, failed, completed, terminated] |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



