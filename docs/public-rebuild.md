# 공개용 재구성 원칙

이 프로젝트는 특정 기업의 ERP 소스코드를 이름만 변경한 저장소가 아닙니다.

공개 버전에서는 다음을 새로 구성했습니다.

- 회사/브랜드 이름 제거
- 사내 프로그램 코드 제거
- 실제 ERP 테이블 및 Stored Procedure 제거
- 실제 계정/IP/DB 정보 제거
- 회사 전용 화면 리소스 제거
- 일반화된 Sales / Inventory / Asset Domain으로 재설계
- H2 Demo Schema와 Fake Data 신규 작성
- 포트폴리오 설명을 위해 권한 Interceptor 및 승인 Transaction을 명시적으로 구성
