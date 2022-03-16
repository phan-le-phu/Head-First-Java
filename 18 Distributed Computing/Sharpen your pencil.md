## What's First
###### Answer

1. The RMI registry is started
2. The remote service (remote implementation) is instantiated
3. The remote service is registered with the RMI registry
4. The client does a lookup on the RMI Registry
5. The client gets the stub from the RMI registry
6. The client invokes a method on the stub.
7. The stub sends the method call to the sever
