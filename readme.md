
#################

google rpc (protoc buffer) demo

#################


1. 下载 protoc-gen-grpc-java-0.13.2-windows-x86_64.exe 插件

   http://mavensearch.io/repo/io.grpc/protoc-gen-grpc-java/

2. 编译生成 protoc buffer 文件
  protoc.exe --plugin=protoc-gen-grpc=${path}/protoc-gen-grpc-java-0.13.2-windows-x86_64.exe --grpc_out {topath}\grpc-start\src\main\gen-grpc
   -I. --java_out {topath}\grpc-start\src\main\gen-grpc Test.proto
 
 例如
 
  >protoc.exe --plugin=protoc-gen-grpc=./protoc-gen-grpc-java-0.13.2-windows-x86_64.exe --grpc_out F:\github\grpc-start\src\main\gen-grpc  -I. --java_out F:\github\grpc-start\src\main\gen-grpc Test.proto
  
3. Google Protocol Buffer 的 Encoding (Varint 技术)
   Protobuf 序列化后所生成的二进制消息非常紧凑，这得益于 Protobuf 采用的非常巧妙的 Encoding 方法。