# Architecture

## Request Flow

```text
Browser
  ↓
DispatcherServlet
  ↓
AuthInterceptor
  ↓
PermissionInterceptor
  ↓
Controller
  ↓
Service
  ↓
MyBatis Mapper
  ↓
ERP Database
```

## Context Separation

- `root-context.xml`: DataSource, MyBatis, Transaction, Service/Security Bean
- `servlet-context.xml`: Spring MVC, Controller, ViewResolver, Interceptor, Static Resource

Spring Boot Auto Configuration을 사용하지 않고 전통적인 Spring Web Application 구조를 명시적으로 구성했습니다.

## Permission Model

`program_permission` 테이블에서 사용자별 기능 코드를 로딩하고, 로그인 Session의 `UserSession.permissions`에 저장합니다.
Controller Method에는 `@RequirePermission("ASSET_APPROVE")`처럼 필요한 권한을 선언하고 `PermissionInterceptor`가 이를 공통 검증합니다.

## Asset Approval Transaction

승인 시 다음 두 변경이 하나의 Transaction으로 수행됩니다.

1. `asset_change_request`: `PENDING → APPROVED`
2. `fixed_asset`: 부서/사용자/위치 Master 변경

중간 오류 발생 시 전체가 Rollback됩니다.
