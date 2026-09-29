INSERT INTO app_user VALUES
('admin','g7CLT/O16zgzC8O7PhO9HA==','OtdA5AlMQiI3MeZuP0m1Ujb1qoueYyauxJhNfJdE21I=','관리자','ADMIN','경영지원',TRUE),
('employee','l0TzJTxjMytzBNtbYmpp3g==','PQqAbeGBUhmop/RoxVChuhusUvqlr6fjYEmo1FuO6cg=','영업담당자','USER','영업1팀',TRUE);

INSERT INTO program_permission VALUES
('admin','DASHBOARD'),('admin','SALES_VIEW'),('admin','INVENTORY_VIEW'),('admin','ASSET_VIEW'),('admin','ASSET_CHANGE'),('admin','ASSET_APPROVE'),('admin','ASSET_INSPECT'),
('employee','DASHBOARD'),('employee','SALES_VIEW'),('employee','INVENTORY_VIEW'),('employee','ASSET_VIEW'),('employee','ASSET_CHANGE'),('employee','ASSET_INSPECT');

INSERT INTO sales_performance(period,division_name,department_name,target_amount,actual_amount) VALUES
('2026-09','국내영업','영업1팀',120000000,111500000),
('2026-09','국내영업','영업2팀',90000000,94500000),
('2026-09','기술영업','솔루션팀',150000000,137000000),
('2026-09','서비스','서비스팀',70000000,72800000),
('2026-08','국내영업','영업1팀',115000000,119000000),
('2026-08','국내영업','영업2팀',85000000,81000000);

INSERT INTO inventory_stock VALUES
('ITEM-1001','디지털 측정기 A','측정기기','서울창고',84,12,450000,'2026-09-29 09:10:00'),
('ITEM-1002','정밀 게이지 B','측정기기','서울창고',36,8,780000,'2026-09-29 09:10:00'),
('ITEM-2001','검사 스탠드 C','액세서리','부산창고',18,2,320000,'2026-09-29 09:10:00'),
('ITEM-2002','측정 프로브 D','액세서리','서울창고',7,6,180000,'2026-09-29 09:10:00'),
('ITEM-3001','교정 블록 E','교정용품','대전창고',25,5,950000,'2026-09-29 09:10:00'),
('ITEM-3002','기준 게이지 F','교정용품','대전창고',4,3,1350000,'2026-09-29 09:10:00');

INSERT INTO fixed_asset VALUES
('AST-2024-001','개발용 노트북','IT','김개발','본사 5층','2024-02-15',2200000,'IN_USE','2026-02-12'),
('AST-2023-014','정밀 측정 장비','품질','이품질','품질실','2023-06-10',18500000,'IN_USE','2026-01-20'),
('AST-2022-032','회의실 프로젝터','총무','박총무','회의실 A','2022-09-01',3200000,'IN_USE','2025-10-10'),
('AST-2025-007','업무용 태블릿','영업1팀','영업담당자','본사 3층','2025-03-22',980000,'IN_USE',NULL),
('AST-2021-088','서버 장비','IT','최인프라','전산실','2021-11-30',12500000,'IN_USE','2026-03-08');

INSERT INTO asset_change_request(asset_no,requester_id,requested_department,requested_owner,requested_location,reason,request_status,requested_at) VALUES
('AST-2025-007','employee','영업2팀','영업담당자','본사 4층','조직 이동에 따른 자산 소속 및 위치 변경','PENDING','2026-09-28 14:30:00');
