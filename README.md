
# 🏋️ **FIT NEXUS (REACT + REST API 전환 프로젝트)**

<h3>기존 MVC 패턴의 스프링부트 프로젝트에 REACT + REST API 설계 전환 작업한 프로젝트입니다.</h3>

## [FIT NEXUS (Spring Boot MVC패턴 프로젝트) 바로가기](https://github.com/LimeYun/MSA9_GYM)

--- 

![image](https://github.com/user-attachments/assets/96702d24-8757-4c48-81d3-583a5e83b7cc)


---

# 📚 **프로젝트 목차**

### 1. 프로젝트 요약
### 2. API 문서
### 3. 요구사항 및 기능 정의서
### 4. 프로젝트 ERD 및 화면 설계
### 5. 학습포인트와 보완점
### 6. 유지보수 (진행중)



---


# :gear: 1. **프로젝트 요약**

### :bulb: 프로젝트 인원                 
- 5명                             

### :bulb: 프로젝트 기간
- 2025-01-13 ~ 2024-01-22

### :bulb: 담당 개발기능 및 구현
- **예약 기능** : **예약 CRUD**
  <p>
    권한이 트레이너인 user의 예약 데이터로 필터링하여 예약 신청 / 트레이너별 예약건 조회.
    필터링/검색/페이징을 통한 효율적인 관리.
  </p>

- **FullCalendar API 연동**
  <p>
    컨트롤러 - 자바스크립트 - 페이지로 캘린더 API 연결 / 로직 처리.
  </p>

- **관리자페이지 UI/레이아웃**
  <p>
    관리자 화면 디자인 구성
  </p>

### :bulb: 사용 기술
<p>프론트엔드</p>
<p>
  <img src="https://img.shields.io/badge/React-61DAFB?style=flat-square&logo=react&logoColor=black">
  <img src="https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=html5&logoColor=white">
  <img src="https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=css3&logoColor=white">
  <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=flat-square&logo=javascript&logoColor=black">
</p>
<p>백엔드</p>
<p>
  <img src="https://img.shields.io/badge/REST%20API-0052CC?style=flat-square&logo=apachesolr&logoColor=white">  
  <img src="https://img.shields.io/badge/Swagger-85EA2D?style=flat-square&logo=swagger&logoColor=black">  
  <img src="https://img.shields.io/badge/JWT-000000?style=flat-square&logo=jsonwebtokens&logoColor=white"> 
  <img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=java&logoColor=white">
  <img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white">
  <img src="https://img.shields.io/badge/Spring%20Security-6DB33F?style=flat-square&logo=springsecurity&logoColor=white">
</p>
<p>데이터베이스</p>
<p>
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=mysql&logoColor=white">
  <img src="https://img.shields.io/badge/MyBatis-000000?style=flat-square&logo=databricks&logoColor=white">
</p>
<p>기타</p>
<p>
  <img src="https://img.shields.io/badge/Figma-F24E1E?style=flat-square&logo=figma&logoColor=white">
</p>

### :bulb: 예약 기능 화면

- 예약 신청

![image](https://github.com/user-attachments/assets/cc8ac9a2-0d75-4bb6-b9e1-161839823efe)


- 사용자 예약 확인

![image](https://github.com/user-attachments/assets/60266b86-be57-4f7d-98aa-abf2db0dadc5)


- 예약 관리

![image](https://github.com/user-attachments/assets/ecd83685-cbbc-445d-abd5-8c3f9602cfdb)


- 예약 관리 - 캘린더

![image](https://github.com/user-attachments/assets/951364d3-af84-4267-b9a5-c42761c1f629)

---

# :gear: 2. **API 문서**


<details>
<summary>User 컨트롤러</summary>

### PUT
- **엔드포인트:** `/user`
- **설명:** 사용자 정보를 업데이트합니다.

### POST
- **엔드포인트:** `/user`
- **설명:** 새로운 사용자를 생성합니다.

### PUT
- **엔드포인트:** `/admin/update`
- **설명:** 관리자 정보를 업데이트합니다.

### POST
- **엔드포인트:** `/newPw`
- **설명:** 새로운 비밀번호를 요청합니다.

### POST
- **엔드포인트:** `/findPw`
- **설명:** 사용자의 비밀번호를 찾습니다.

### POST
- **엔드포인트:** `/findId`
- **설명:** 사용자의 ID를 찾습니다.

### POST
- **엔드포인트:** `/changePw`
- **설명:** 사용자의 비밀번호를 변경합니다.

### POST
- **엔드포인트:** `/admin/user/delete`
- **설명:** 사용자를 삭제합니다 (관리자 권한).

### GET
- **엔드포인트:** `/user/myBoardList/{no}`
- **설명:** 특정 ID로 사용자의 게시판 목록을 조회합니다.

### GET
- **엔드포인트:** `/user/list`
- **설명:** 모든 사용자 목록을 조회합니다.

### GET
- **엔드포인트:** `/user/info`
- **설명:** 로그인된 사용자 정보를 조회합니다.

### GET
- **엔드포인트:** `/admin/update/{no}`
- **설명:** 특정 ID로 관리자 업데이트 정보를 조회합니다.

### DELETE
- **엔드포인트:** `/user/{no}`
- **설명:** 특정 ID의 사용자를 삭제합니다.

</details>

<details>
<summary>Plan 컨트롤러</summary>

### GET
- **엔드포인트:** `/user/schedule`
- **설명:** 사용자의 일정을 조회합니다.

### PUT
- **엔드포인트:** `/user/schedule`
- **설명:** 사용자의 일정을 업데이트합니다.

### POST
- **엔드포인트:** `/user/schedule`
- **설명:** 사용자의 새로운 일정을 생성합니다.

### DELETE
- **엔드포인트:** `/user/schedule`
- **설명:** 사용자의 일정을 삭제합니다.

### PUT
- **엔드포인트:** `/user/schedule/comment`
- **설명:** 사용자의 일정에 댓글을 업데이트합니다.

### POST
- **엔드포인트:** `/user/schedule/comment`
- **설명:** 사용자의 일정에 댓글을 추가합니다.

### GET
- **엔드포인트:** `/user/schedule/{year}/{month}/{day}`
- **설명:** 특정 날짜의 사용자의 일정을 조회합니다.

</details>

<details>
<summary>Reservation 컨트롤러</summary>

### GET
- **엔드포인트:** `/user/myPage/ptList/{no}`
- **설명:** 특정 ID로 사용자의 PT 목록을 조회합니다.

### PUT
- **엔드포인트:** `/user/myPage/ptList/{no}`
- **설명:** 특정 ID로 사용자의 PT 목록을 업데이트합니다.

### GET
- **엔드포인트:** `/admin/reservation/list`
- **설명:** 모든 예약 목록을 조회합니다 (관리자 권한).

### PUT
- **엔드포인트:** `/admin/reservation/list`
- **설명:** 예약 목록을 업데이트합니다 (관리자 권한).

### POST
- **엔드포인트:** `/user/reservation/reservationInsert`
- **설명:** 사용자의 새로운 예약을 추가합니다.

### GET
- **엔드포인트:** `/user/reservation/reservationInsert/{no}`
- **설명:** 특정 ID로 예약 세부 정보를 조회합니다.

### GET
- **엔드포인트:** `/admin/reservation/calendar`
- **설명:** 예약 캘린더를 조회합니다 (관리자 권한).

</details>

<details>
<summary>BuyList 컨트롤러</summary>

### PUT
- **엔드포인트:** `/buyList/admin/{no}/cancel`
- **설명:** 특정 ID의 구매를 취소합니다 (관리자 권한).

### GET
- **엔드포인트:** `/buyList/admin`
- **설명:** 모든 구매 목록을 조회합니다 (관리자 권한).

### POST
- **엔드포인트:** `/buyList/admin`
- **설명:** 새로운 구매를 추가합니다 (관리자 권한).

### GET
- **엔드포인트:** `/buyList/users/{userNo}`
- **설명:** 특정 사용자 ID로 구매 목록을 조회합니다.

### GET
- **엔드포인트:** `/buyList/admin/sales`
- **설명:** 판매 데이터를 조회합니다 (관리자 권한).

</details>

<details>
<summary>Board 컨트롤러</summary>

### GET
- **엔드포인트:** `/board`
- **설명:** 모든 게시판을 조회합니다.

### PUT
- **엔드포인트:** `/board`
- **설명:** 게시판 정보를 업데이트합니다.

### POST
- **엔드포인트:** `/board`
- **설명:** 새로운 게시판을 생성합니다.

### GET
- **엔드포인트:** `/board/answerUpdate`
- **설명:** 게시판 답변 업데이트 정보를 조회합니다.

### PUT
- **엔드포인트:** `/board/answerUpdate`
- **설명:** 게시판 답변을 업데이트합니다.

### GET
- **엔드포인트:** `/board/{no}`
- **설명:** 특정 ID로 게시판 세부 정보를 조회합니다.

### DELETE
- **엔드포인트:** `/board/{no}`
- **설명:** 특정 ID의 게시판을 삭제합니다.

</details>

<details>
<summary>Answer 컨트롤러</summary>

### GET
- **엔드포인트:** `/answer`
- **설명:** 모든 답변을 조회합니다.

### PUT
- **엔드포인트:** `/answer`
- **설명:** 답변을 업데이트합니다.

### POST
- **엔드포인트:** `/answer`
- **설명:** 새로운 답변을 추가합니다.

### GET
- **엔드포인트:** `/answer/{no}`
- **설명:** 특정 ID로 답변 세부 정보를 조회합니다.

### DELETE
- **엔드포인트:** `/answer/{no}`
- **설명:** 특정 ID의 답변을 삭제합니다.

</details>

<details>
<summary>TrainerProfile 컨트롤러</summary>

### PUT
- **엔드포인트:** `/admin/trainer/update`
- **설명:** 트레이너 프로필 정보를 업데이트합니다 (관리자 권한).

### POST
- **엔드포인트:** `/admin/trainer/insert`
- **설명:** 새로운 트레이너 프로필을 추가합니다 (관리자 권한).

### GET
- **엔드포인트:** `/admin/trainer/trainerUsers`
- **설명:** 트레이너의 사용자 목록을 조회합니다.

### GET
- **엔드포인트:** `/admin/trainer/select`
- **설명:** 특정 트레이너 프로필 정보를 조회합니다.

### GET
- **엔드포인트:** `/admin/trainer/list`
- **설명:** 모든 트레이너 목록을 조회합니다.

### GET
- **엔드포인트:** `/admin/trainer/getTrainerNo`
- **설명:** 트레이너 ID를 조회합니다.

### DELETE
- **엔드포인트:** `/admin/trainer/delete`
- **설명:** 트레이너 프로필을 삭제합니다.

</details>

<details>
  <summary>Ticket 컨트롤러</summary>

### PUT
- **엔드포인트:** `/admin/ticket/update`
- **설명:** 티켓 정보를 업데이트합니다 (관리자 권한).

### POST
- **엔드포인트:** `/admin/ticket/insert`
- **설명:** 새로운 티켓을 추가합니다 (관리자 권한).

### GET
- **엔드포인트:** `/admin/ticket/select`
- **설명:** 티켓 정보를 조회합니다.

### GET
- **엔드포인트:** `/admin/ticket/list`
- **설명:** 모든 티켓 목록을 조회합니다.

### DELETE
- **엔드포인트:** `/admin/ticket/delete`
- **설명:** 티켓을 삭제합니다.

</details>

<details>
<summary>Home 컨트롤러</summary>

### POST
- **엔드포인트:** `/login`
- **설명:** 시스템에 로그인합니다.

### GET
- **엔드포인트:** `/join`
- **설명:** 회원가입 페이지로 이동합니다.

### POST
- **엔드포인트:** `/join`
- **설명:** 새로운 사용자를 등록합니다.

### GET
- **엔드포인트:** `/check/{id}`
- **설명:** ID의 사용 가능 여부를 확인합니다.

### GET
- **엔드포인트:** `/`
- **설명:** 홈페이지로 이동합니다.

</details>

<details>
<summary>QR 컨트롤러</summary>

### POST
- **엔드포인트:** `/generate-qr-code`
- **설명:** QR 코드를 생성합니다.

### POST
- **엔드포인트:** `/generate-qr-code/delete`
- **설명:** 생성된 QR 코드를 삭제합니다.

</details>

<details>
<summary>Attendance 컨트롤러</summary>

### GET
- **엔드포인트:** `/user/attendance/check/{uuid}`
- **설명:** UUID를 기반으로 사용자의 출석을 확인합니다.

### GET
- **엔드포인트:** `/admin/attendance/userCount`
- **설명:** 출석 중인 사용자 수를 조회합니다 (관리자 권한).

### GET
- **엔드포인트:** `/admin/attendance/list`
- **설명:** 출석 목록을 조회합니다 (관리자 권한).

</details>

<details>
<summary>Ranking 컨트롤러</summary>

### GET
- **엔드포인트:** `/ranking`
- **설명:** 랭킹 정보를 조회합니다.

</details>

<details>
<summary>File 컨트롤러</summary>

### GET
- **엔드포인트:** `/files/{profileNo}`
- **설명:** 프로필 번호를 기준으로 파일을 조회합니다.

### GET
- **엔드포인트:** `/files/{no}/thumbnail`
- **설명:** 파일 ID를 기준으로 썸네일을 조회합니다.

### GET
- **엔드포인트:** `/files/{no}/download`
- **설명:** 파일 ID를 기준으로 파일을 다운로드합니다.

### DELETE
- **엔드포인트:** `/files/{no}`
- **설명:** 파일 ID를 기준으로 파일을 삭제합니다.

</details>

---

# :gear: 3. **요구사항 및 기능 정의서**

<details>
<summary><h2>📑 <strong>요구사항 정의서</strong></h2></summary>
  
   ![image](https://github.com/user-attachments/assets/6628cdef-0e84-469a-9f1a-c7409b145b70)
</details>


---

<details>
<summary><h2>🗒️ <strong>기능 정의서</strong></h2></summary>
  
  - 사용자(유저) 기능 정의서
 
    ![image](https://github.com/user-attachments/assets/36f473e1-be4c-412c-aa74-a4ae4850f6ea)  
  - 관리자 기능 정의서

    ![image](https://github.com/user-attachments/assets/6e0eef6f-38a4-46fc-9309-9233e7c01a9a)
</details>

---


# :gear: 4. **프로젝트 ERD 및 화면 설계**


### :bulb: ERD
  
  ![ERD 이미지](https://chestnut-blinker-ca6.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F8cd794c0-c633-4008-b289-af6deeea8c4d%2F2317d53d-12bb-40e1-bf7e-43a3f29dda8a%2Fimage.png?table=block&id=16b902bd-b12f-8032-8568-e03391399423&spaceId=8cd794c0-c633-4008-b289-af6deeea8c4d&width=1920&userId=&cache=v2)



&nbsp;
### :bulb: 화면 설계
                                                                                                         
<details>
  <summary><h3>🖥️ <strong>메인</strong></h3></summary>
    
  ![메인 화면 1](https://drive.google.com/uc?id=1Uc68G_fKXEXpbpQwmw_ehMtj28TQcP8E)
  ![메인 화면 2](https://drive.google.com/uc?id=1Uo2AOU0S0dM2wE4NOvHmBgi7-4WmaeVt)
  ![메인 화면 3](https://drive.google.com/uc?id=1hSRDulnuxRf6r9kk7ylSZxzFKHRB786z)
  ![메인 화면 4](https://drive.google.com/uc?id=1Up9a7utmk008C51bCwTNk0_pb48Jv1id)
  
</details>

---

<details>
  <summary><h3>👨‍💻 <strong>사용자</strong></h3></summary>
    
  ![사용자 화면 1](https://drive.google.com/uc?id=1Vns8UHr9Czb7mCp0oRkMvdlziCZicLsb)
  ![사용자 화면 2](https://drive.google.com/uc?id=1gKsHrmqugAXwskpHHzOj2QhOeXQhdDNS)
  ![사용자 화면 3](https://drive.google.com/uc?id=1hTpezJdzQLhH3LDQCH-kPDpb6x81u74a)
  ![사용자 화면 4](https://drive.google.com/uc?id=1-AcOC5ooqzOqnshUxfqrcAs0YUFyUmvD)
  ![사용자 화면 5](https://drive.google.com/uc?id=1ja-sOvZ2j7p15DMnEtXviqiN_18NJiFO)
  ![사용자 화면 6](https://drive.google.com/uc?id=1rLu826EyHDDes2J4IM-6gAtZn4Cc6fnO)
  ![사용자 화면 7](https://drive.google.com/uc?id=121WbRNX12d6LvIDWxccaLHhtfDm-Uls_)
  ![사용자 화면 8](https://drive.google.com/uc?id=15MMalJR4fd_4Sw1fhrwTd9Slbw16W2Nb)
  ![사용자 화면 9](https://drive.google.com/uc?id=1uQtkwajZWYumxgvRC3jHBNLXscEqlHeo)
  ![사용자 화면 10](https://drive.google.com/uc?id=1ZvEBl78uv1MwJyduIHh-0K1Vk6SXxbLd)
  ![사용자 화면 11](https://drive.google.com/uc?id=1mtO7EgM51fYJFiVh_QgKi_wR7rVK3xrM)
  ![사용자 화면 12](https://drive.google.com/uc?id=1gI3UU8nHksHzgKc-NwUHKV531sbQYdz4)

</details>

---

<details>
  <summary><h3>🛒 <strong>구매</strong></h3></summary>
    
  ![구매 화면 1](https://drive.google.com/uc?export=view&id=1mfs0TBP-93EDxgPWtjHDm4CnJVeJubfB)
  ![구매 화면 2](https://drive.google.com/uc?export=view&id=18RUIJA9hgrSM4asnp4GHeVSeJUM5nU2U)
  ![구매 화면 3](https://drive.google.com/uc?export=view&id=1O1zKaSeBCMyvTAML6RTrIiW_SLpC9a0Z) 
  ![구매 화면 4](https://drive.google.com/uc?export=view&id=1Vg5ufkETUEam0LcLRuNLrD_yTwCPGmRk)
  ![구매 화면 5](https://drive.google.com/uc?export=view&id=1e2nNdmhYeJwS6UnuKpsi71-YPCO8GnGT)
</details>


---

<details>
 <summary><h3>📝 <strong>게시판</strong></h3></summary>
    
  ![게시판 화면 1](https://drive.google.com/uc?id=1lhLfroTuvEUKkrS40B0SRMAAIXFGQDxh)
  ![게시판 화면 2](https://drive.google.com/uc?id=1w7vIgGkxcYcaTNVFk99gEY_SWYGc5Cb_)
</details>

---

<details>
  <summary><h3>🗓️ <strong>운동계획표</strong></h3></summary>
    
  ![운동계획표 화면](https://drive.google.com/uc?id=1sO1FP1Lua8ykdPyNZTe1AYWVymS02IGD)
</details>

---

<details>
  - <summary><h3>🛠️ <strong>관리자</strong></h3></summary>
    
  ![관리자 화면 1](https://drive.google.com/uc?id=1B8LTUYdehlfvMRUd_AXhCsrNtRSCAxP0)
  ![관리자 화면 2](https://drive.google.com/uc?id=11yqmvEDOs5DemuaqLkJ0RhJ-JkmdvOAx)
  ![관리자 화면 3](https://drive.google.com/uc?id=1gcoGjZpWV_wkz-ICyLhzw0Y9tHmcPOeP)
  ![관리자 화면 4](https://drive.google.com/uc?id=1wtZrhqDV9H6h6NplAFcTzQ8YPuzwYTKl)
  ![관리자 화면 5](https://drive.google.com/uc?id=1773uAE71llv-bJMFk-D1brLXNzU6U_ez)
  ![관리자 화면 6](https://drive.google.com/uc?id=1pjCkvkHeufRn-x5q0Bw39DPuT_83-0yX)
  ![관리자 화면 7](https://drive.google.com/uc?id=1gRzloprNVjySX3Ec0ZQm-fFzWgoKt9N8)
  ![관리자 화면 8](https://drive.google.com/uc?id=14XyRjNqg1T7f7kY1ZfO8JKdwCuqIGOdj)
  ![관리자 화면 9](https://drive.google.com/uc?id=1Dfd6QNfg9ZojGtGAkNB9r0D4V3bkWBTN)
  ![관리자 화면 10](https://drive.google.com/uc?id=1JhYmLXcIyMLIJhVfyU7UqtgbpuYWDFan)
  ![관리자 화면 11](https://drive.google.com/uc?id=1IKwCA9CU7cHNaaULMDOWbQ2KHbLP3AiX)
</details>


---


# :gear: 5. **학습포인트와 보완점**


1. MVC ➡ REST + React
   
  ✅ 이전 방식 (MVC)
  - 컨트롤러에서 Model 을 이용하여 데이터 주입
  - 백엔드와 프론트엔드가 강하게 결합됨

  ✅ 변경 후 (REST API)
  - 컨트롤러가 JSON 형식의 데이터만 반환
  - React 와 백엔드를 완전히 분리하여 독립적인 개발 가능
  - API 문서(Swagger) 활용 가능 ➡ 협업 용이
   
2. 재사용성 및 상태 관리
   
![image](https://github.com/user-attachments/assets/17a3cd02-571f-4991-9b17-d261b44f3eac)

- ReservationListModal과 같은 모달, 헤더 등 각각의 섹션들을 컴포넌트로 구성해 독립적으로 관리 가능해짐
  여러 곳에서 일관된 UI/UX 로 재사용하여 사용 가능

- state 선언을 통해 상태 값 변경여부에 따른 자동 UI 갱신으로, 코드의 가독성 업그레이드 및 DOM 조작 최소화를 이룸


--- 


# :gear: 6. **유지보수**

- 컨트롤러 로직 → 서비스 계층으로 이전으로 MVC 패턴 고도화
  ![updated_code_refactoring_large](https://github.com/user-attachments/assets/2ccd6d97-5652-4205-ab68-11a26a342366)


---


- 중복 로직 메서드화
  ![2 9_코드리팩토링_2](https://github.com/user-attachments/assets/bb59c222-cdc9-4e28-90b2-23c9e48ee506)




 
