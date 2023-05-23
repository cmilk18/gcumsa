
#### Object: inhello
#### Type: Service

### Cluster에 inhello Service를 생성하려면 아래의 명령어를 실행하세요.

```
$ kubectl create -f https://minio.msaez.io/labs-msaez.io/yamlStorage/3915bd3575666efbb90e4884c90e946d/junhee1883%40naver.com/Service/inhello.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230523%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230523T025950Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=f9926ba9085dceeb8165b07ea2a26e9142aee8bae3bf1319f83b805a58969fef
```
- Yaml 파일에 명시된 스펙으로 inhello Service를 생성합니다.  

```
$ kubectl apply -f https://minio.msaez.io/labs-msaez.io/yamlStorage/3915bd3575666efbb90e4884c90e946d/junhee1883%40naver.com/Service/inhello.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230523%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230523T025950Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=f9926ba9085dceeb8165b07ea2a26e9142aee8bae3bf1319f83b805a58969fef
```
- Create가 된 상태라면 inhello Service의 수정이 이루어지고, Create가 된 상태가 아니라면 inhello Service를 Create 해주는 명령어입니다.
#

### inhello Service가 정상적으로 생성되었는지 확인하시려면 아래의 명령어를 실행하세요.

```
$ kubectl get Service

NAME                            TYPE        CLUSTER-IP       EXTERNAL-IP   PORT(S)    AGE
kubernetes                      ClusterIP   10.100.0.1       <none>        443/TCP    4m58s
inhello        ClusterIP   10.100.244.220   <none>        8080/TCP   2m24s

```
- inhello Service가 확인이 되신다면 정상 생성이 된 것 입니다.
#

### 생성된 inhello Service의 상세 실행 정보를 확인하시려면 아래의 명령어를 입력하세요.

```
$ Kubectl describe Service inhello
```
- inhello Service의 실행 정보 상태를 확인하여 문제가 있는지 확인합니다.
#

### 생성된 inhello Service에 접속하여 서비스가 정상 동작하는지 테스트 해보세요.

```
kubectl create deploy inhello --image=ghcr.io/docker_id/docker_image:latest
```
- 대상 컨테이너를 생성합니다.  

```
kubectl expose deploy order --type=ClusterIP --port=8080 --target-port=8080
# 생성된 ClusterIP 정보확인
kubectl get service 
# Selector 확인
kubectl get service inhello -o yaml
```
- ClusterIP Type Service를 생성합니다.

```
$ kubectl apply -f - <<EOF
apiVersion: v1
kind: Pod
metadata:
  name: siege
spec:
  containers:
  - name: siege
    image: apexacme/siege-nginx
EOF
```
- 새로운 터미널에서 클라이언트용 컨테이너를 생성하고 접속합니다.
- 위의 스크립트를 terminal 에 복사하여 siege 라는 Pod 를 생성합니다.  

```
$ kubectl exec -it siege -- /bin/bash
http http://10.x.x.x:8080
exit
```
- 생성된 siege Pod 안쪽에서 inhello Service의 ClusterIP로 접근해봅니다.
#

### Kubernetes Cluster network 외부에서 service에 access할 때, 해당 명령어로 외부 IP traffic을 허용할 수 있습니다.

```
$ kubectl port-forward Service/inhello 8080:8080

# 접속 테스트
http :8080
```
#

### inhello Service를 삭제하려면 아래의 명령어를 실행하세요.

```
$ kubectl delete Service inhello
```
#

