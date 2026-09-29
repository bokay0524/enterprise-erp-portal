# Changelog

## v1.0.1
- H2 초기화 SQL(`schema.sql`, `data.sql`)을 UTF-8로 명시하여 Windows 환경에서 한글 데이터가 깨지는 문제 수정
- JSP 페이지에 `pageEncoding=UTF-8` 명시

## 1.0.0
- Spring MVC + JSP + MyBatis 기반 공개용 ERP Portal 구현
- Sales Performance, Inventory, Fixed Asset 모듈 추가
- Program Permission Interceptor 추가
- Asset Change Approval Transaction 구현
- H2 Demo Dataset 및 GitHub Actions CI 추가
