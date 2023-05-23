
#### Object: inhello
#### Type: Deployment

### Cluster에 inhello Deployment를 생성하려면 아래의 명령어를 실행하세요.

```
$ kubectl create -f https://minio.msaez.io/labs-msaez.io/yamlStorage/3915bd3575666efbb90e4884c90e946d/junhee1883%40naver.com/Deployment/inhello.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230523%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230523T025950Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=7293665ae218bbd1e7ff1e897601b73fb2104d6b295102722dd4014d788f7cc4
```
- Yaml 파일에 명시된 스펙으로 inhello Deployment를 생성합니다.

```
$ kubectl apply -f https://minio.msaez.io/labs-msaez.io/yamlStorage/3915bd3575666efbb90e4884c90e946d/junhee1883%40naver.com/Deployment/inhello.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230523%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230523T025950Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=7293665ae218bbd1e7ff1e897601b73fb2104d6b295102722dd4014d788f7cc4
```
- Create가 된 상태라면 inhello Deployment의 수정이 이루어지고, Create가 된 상태가 아니라면 inhello Deployment를 Create 해주는 명령어입니다.  
#

### inhello Deployment가 정상적으로 생성되었는지 확인하시려면 아래의 명령어를 실행하세요.

```
$ kubectl get Deployment

NAME            READY   UP-TO-DATE   AVAILABLE   AGE
inhello           3/3     3            3           5m43s

```
- inhello Deployment와 Pod, Replicaset이 모두 확인이 된다면 정상적으로 생성된 것입니다.
#

### 생성된 inhello Deployment의 상세 실행 정보를 확인하시려면 아래의 명령어를 입력하세요.

```
$ kubectl describe Deployment inhello
```
- inhello Deployment의 상태를 확인하여 문제가 있는지 확인합니다. 
#

### Kubernetes Cluster network 외부에서 service에 access할 때, 해당 명령어로 외부 IP traffic을 허용할 수 있습니다.

```
$ kubectl port-forward Deployment/inhello 8080:8080
```
#

### inhello Deployment를 삭제하려면 아래의 명령어를 실행하세요.

```
$ kubectl delete Deployment inhello
```
#

