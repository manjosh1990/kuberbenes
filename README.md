# springboot with kubernetes

Sample springboot and kubernetes code.

#Prerequisites
* docker
* kubectl
* kind cluster
* gitbash or any shell if running on windows.

## How to run?
```agsl
$ git clone https://github.com/manjosh1990/kubernetenes.git
$ cd kubernetes
$ ./run.sh start
$ ./run.sh stop

* to start dependant services eg: database
$ ./run.sh start_infra
$ ./run.sh stop_infra
```
## Running on Kubernetes

```shell
$ cd kubernetes
$ cd kind
$ ./create-cluster.sh
$ cd ../
$ kubectl apply -f k8s/
```

* Access API using NodePort http://localhost:18080/api/bookmarks
* Access UI using NodePort http://localhost:10443/
* Access API using Ingress http://localhost/bookmarker-api/api/bookmarks
* Access UI using Ingress http://localhost/

## Batch script coming soon!