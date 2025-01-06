# 🌟 프로젝트: 기능 보완 및 개선

## 📌 개요
이 프로젝트는 **Spring 4기**의 과제에서 나온 다양한 기능을 보완하고 개선한 내용을 포함하고 있습니다. Level 4까지의 필수 과제를 완료했으며, 다음과 같은 주요 기능과 개선 사항을 다뤘습니다.

---

## 🚀 필수 구현 기능

### Lv 1: 숙련 필수사항 보완하기
- ✅ 과제 중 자가평가 및 튜터평가가 다른 항목을 모두 보완하였습니다.
- ✅ 부족했던 부분을 보완하거나 성공적으로 구현하지 못한 내용을 완성하였습니다.

### Lv 2: 기능 개선

#### 🛡️ 유효성 검사 추가
- 입력값에 대한 유효성 검사를 추가하여 정책에 맞는 데이터만 취합.
    - 이메일, 비밀번호 등 필드에 대해 정책을 적용.
    - **3-Layered Architecture**에서 유효성 검사의 책임을 분리.

#### ❗ 예외 처리 강화
- **GlobalExceptionHandler**를 이용한 API 예외 처리 구현.
- 클라이언트가 명확한 에러 메시지를 받을 수 있도록 에러 코드를 포함하여 JSON 응답 형식으로 처리.

```json
{
    "errorCode": "ERR001",
    "errorMessage": "요청값의 형식이 맞지 않습니다."
}
```

#### 🏗️ 서비스 도메인 로직을 엔티티에 위임
- 서비스 클래스의 복잡한 로직을 엔티티로 위임하여 응집도를 높이고, 코드 가독성을 향상시켰습니다.

---

## 🧗 도전 기능

### Lv 3: 코드 개선
#### 1️⃣ Early Return 패턴 적용
- 조건에 맞지 않는 경우 즉시 리턴하여 불필요한 로직 실행 방지.
- **AuthService** 클래스의 `signup()` 메서드에서 중복 실행되던 로직을 제거.

#### 2️⃣ 불필요한 `if-else` 제거
- 복잡한 `if-else` 구조를 간결하게 리팩토링하여 가독성을 향상.

#### 3️⃣ 코드 클린업
- 🔍 불필요한 주석 제거.
- 🔧 코드 포맷팅 규칙을 통일 (Google Java Formatter 사용).
- 🏷️ 네이밍 컨벤션을 일관되게 적용 (PascalCase, camelCase, UPPER_CASE 등).

#### 4️⃣ 중복 코드 제거
- 반복적으로 사용되는 코드를 메서드로 추출하여 재사용성을 향상.
- 더 적합한 객체로 로직을 위임하거나 클래스 분리를 통해 구조적인 개선을 진행.

---

## ⚡ N+1 문제 개선 (Lv 4)

### 문제 시나리오
- `TodoController`와 `TodoService`를 통해 `Todo` 데이터를 처리할 때, N+1 문제가 발생할 가능성을 확인.

### 해결 방법
1. **Fetch Join**을 사용하여 N+1 문제 해결.
    - `TodoRepository`에서 JPQL로 `fetch join`을 적용.

2. **@EntityGraph**를 사용하여 선언적으로 N+1 문제를 해결.
    - Spring Data JPA에서 간단한 연관 관계 처리에 유리.

---

## 🌈 프로젝트 주요 개선 사항

### 🧪 테스트 코드 작성
- 예상 성공 및 예외 상황을 다룬 테스트 코드를 작성하여 로직 검증.
- 기존에 실패하던 테스트 코드를 수정하여 모든 테스트가 성공하도록 개선.

### 📋 Interceptor와 AOP를 활용한 API 로깅
- **Interceptor**를 이용해 요청 정보를 사전 처리.
- **AOP**를 사용해 요청/응답 데이터를 로깅.
- 요청 본문과 응답 본문을 JSON 형식으로 기록.

---

## 🛠️ 기술 스택
- **Spring Boot**
- **JPA (Hibernate)**
- **MySQL**
- **JUnit**
- **Mockito**
- **Lombok**

---

## 📖 실행 방법
1. 프로젝트 클론:
   ```bash
   git clone [repository-url]
   cd [project-directory]
   ```

2. 의존성 설치:
   ```bash
   ./mvnw clean install
   ```

3. 애플리케이션 실행:
   ```bash
   ./mvnw spring-boot:run
   ```

4. 테스트 실행:
   ```bash
   ./mvnw test
   ```

---

## 🏆 프로젝트 결과
- Level 4까지의 기능 구현 완료.
- 코드 품질 및 유지보수성을 대폭 개선.
- 테스트 커버리지 및 API 안정성 향상.

---

## 🧐 회고
- 프로젝트를 진행하며 **서비스와 엔티티 간의 역할 분리**의 중요성을 체감.
- 테스트 코드 작성 및 유지보수를 통해 **코드 안정성 확보**의 필요성을 배움.
- 추후 프로젝트에서는 성능 최적화 및 추가 기능 구현에 더 초점을 맞출 예정.
