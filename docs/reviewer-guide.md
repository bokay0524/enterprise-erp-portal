# Reviewer Guide

## 5분 확인 경로

1. `admin / admin1234` 로그인
2. Dashboard에서 ERP 업무 지표 확인
3. **영업 실적**에서 2026-09 목표/실적 확인
4. **재고 현황**에서 가용재고 5개 이하 품목 확인
5. **변경 신청**에서 임의의 자산 변경 요청 등록
6. **승인** 화면에서 해당 요청 승인
7. **고정자산** 화면에서 Master 정보가 변경되었는지 확인
8. `employee / user1234` 로그인 후 승인 메뉴가 숨겨지고 URL 직접 접근도 차단되는지 확인

## 코드에서 볼 부분

- `security/PermissionInterceptor.java`
- `security/RequirePermission.java`
- `service/AssetService.java`
- `mapper/AssetMapper.xml`
- `spring/root-context.xml`
- `spring/servlet-context.xml`
