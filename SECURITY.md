# Security

이 저장소는 공개 포트폴리오를 위해 새로 구현된 Demo 프로젝트입니다.

- 실제 회사명, 로고, 내부 IP, DB 계정, 비밀번호를 포함하지 않습니다.
- 원본 ERP 테이블명, Stored Procedure명, 프로그램 코드를 사용하지 않습니다.
- Demo 계정의 비밀번호는 PBKDF2-HMAC-SHA256 Hash로 저장합니다.
- 실제 MSSQL 연결 정보는 JVM System Property 또는 외부 설정으로 전달하세요.

실제 조직에서 사용된 Credential이 실수로 Git에 Commit되었다면 파일 삭제만으로 충분하지 않습니다. Credential 자체를 폐기/재발급해야 합니다.
