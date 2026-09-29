# 포트폴리오 설명

## Enterprise ERP Portal

**기업 ERP의 영업·자재·회계 업무를 웹 환경에서 조회·처리하기 위한 Spring MVC 기반 업무 포털**

### 배경

기존 ERP 데이터베이스를 기반으로 현업 사용자가 브라우저에서 주요 업무를 조회하고 처리할 수 있는 웹 시스템을 개발한 경험을 바탕으로 공개용 프로젝트를 새로 구현했습니다.

### 공개 버전에서 구현한 핵심

1. **영업 목표/실적 조회**: 월/부서별 목표와 실적, 달성률 집계
2. **재고 조회**: 품목·창고별 현재고/예약/가용재고 확인
3. **고정자산 Workflow**: 변경 신청 → 관리자 승인/반려 → Asset Master 반영
4. **고정자산 실사**: 실사 결과 이력 저장 및 최근 실사일 갱신
5. **프로그램 권한**: 사용자에게 부여된 Permission을 Interceptor가 공통 검증

### 기술적 포인트

- Spring Boot 없이 `DispatcherServlet`, Root Context, Servlet Context를 XML로 명시적으로 구성
- Controller → Service → MyBatis Mapper 계층 분리
- 승인 Workflow에서 Request 승인과 Asset Master 변경을 `@Transactional`로 묶어 데이터 정합성 유지
- UI Route마다 권한 체크 코드를 반복하지 않고 `@RequirePermission` + `HandlerInterceptor`로 공통화
- 리뷰어가 MSSQL 없이 실행할 수 있도록 H2 Demo DB와 Seed Data 제공

### 포트폴리오에서 강조할 역량

> 신규 Spring Boot 프로젝트뿐 아니라 기존 Spring MVC/JSP/MyBatis 기반 기업 시스템의 구조를 이해하고, 업무 로직·SQL·권한·Transaction을 유지보수하고 확장할 수 있는 경험
