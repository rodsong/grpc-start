
#################

google rpc (protoc buffer) demo

#################


1. ���� protoc-gen-grpc-java-0.13.2-windows-x86_64.exe ���

   http://mavensearch.io/repo/io.grpc/protoc-gen-grpc-java/

2. �������� protoc buffer �ļ�
  protoc.exe --plugin=protoc-gen-grpc=${path}/protoc-gen-grpc-java-0.13.2-windows-x86_64.exe --grpc_out {topath}\grpc-start\src\main\gen-grpc
   -I. --java_out {topath}\grpc-start\src\main\gen-grpc Test.proto
 
 ����
 
  >protoc.exe --plugin=protoc-gen-grpc=./protoc-gen-grpc-java-0.13.2-windows-x86_64.exe --grpc_out F:\github\grpc-start\src\main\gen-grpc  -I. --java_out F:\github\grpc-start\src\main\gen-grpc Test.proto
  
3. Google Protocol Buffer �� Encoding (Varint ����)
   Protobuf ���л��������ɵĶ�������Ϣ�ǳ����գ�������� Protobuf ���õķǳ������ Encoding ������