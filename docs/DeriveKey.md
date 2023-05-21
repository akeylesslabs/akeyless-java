

# DeriveKey


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessibility** | **String** | for personal password manager |  [optional]
**alg** | **String** | Kdf algorithm | 
**hashFunction** | **String** | HashFunction the hash function to use (relevant for pbkdf2) |  [optional]
**iter** | **Long** | IterationCount the number of iterations | 
**json** | **Boolean** | Set output format to JSON |  [optional]
**keyLen** | **Long** | KeyLength the byte length of the generated key | 
**mem** | **Long** | MemorySizeInKb the memory paramter in kb (relevant for argon2id) |  [optional]
**name** | **String** | Static Secret full name | 
**parallelism** | **Long** | Parallelism the number of threads to use (relevant for argon2id) |  [optional]
**salt** | **String** | Salt Base64 encoded salt value. If not provided, the salt will be generated as part of the operation. The salt should be securely-generated random bytes, minimum 64 bits, 128 bits is recommended |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



