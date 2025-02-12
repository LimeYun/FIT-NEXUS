package com.gym.gym.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gym.gym.domain.CustomUser;
import com.gym.gym.domain.Option;
import com.gym.gym.domain.Page;
import com.gym.gym.domain.Reservation;
import com.gym.gym.service.ReservationService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin("*")
@RestController
public class ReservationController {

    // TODO : 예외처리 개선

    @Autowired
    private ReservationService reservationService;

    // 관리자 예약 목록
    @GetMapping("/admin/reservation/list")
    public ResponseEntity<?> getAllReservation(Option option, Page page) {
        try {
            Map<String, Object> result = reservationService.list(option, page);

            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            log.error("예약 목록 전체 조회 오류");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 관리자 캘린더 예약 목록
    @GetMapping("/admin/reservation/calendar")
    public ResponseEntity<?> getCalendarReservation(
            @RequestParam(value = "keyword", required = false) String keyword,
            @RequestParam(value = "code", required = false) int code) {
        try {

            Map<String, Object> result = reservationService.getCalendarData(keyword, code);

            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            log.error("캘린더 조회 오류");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 회원 내 예약 목록
    @GetMapping("/user/myPage/ptList/{no}")
    public ResponseEntity<?> getMyReservation(
            @PathVariable("no") Long no,
            Page page) {
        try {
            Map<String, Object> result = reservationService.getMyReservation(no, page);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            log.error("회원 예약 조회 오류");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 예약 등록 페이지
    @GetMapping("/user/reservation/reservationInsert/{no}")
    public ResponseEntity<?> getMyTrainer(
            @PathVariable("no") int no,
            @AuthenticationPrincipal CustomUser userDetails,
            Page page) {
        try {
            Map<String, Object> result = reservationService.getMyTrainer(no, userDetails.getNo(), page);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 예약 등록
    @PostMapping("/user/reservation/reservationInsert")
    public ResponseEntity<?> createReservation(@RequestBody Reservation reservation,
            @AuthenticationPrincipal CustomUser userDetails) {
        try {
            int result = reservationService.insert(reservation, userDetails.getNo());
            if (result > 0) {
                return new ResponseEntity<>("예약 성공", HttpStatus.CREATED);
            }
            return new ResponseEntity<>("예약 실패", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 회원 예약 취소
    @PutMapping("/user/myPage/ptList/{no}")
    public ResponseEntity<?> updateReservation(
        @RequestParam("reservationNo") int reservationNo) {
        try {
            int result = reservationService.cancel(reservationNo);
            if (result > 0) {
                return new ResponseEntity<>("예약 취소 성공", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("예약 취소 실패", HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 관리자 예약 취소/완료
    @PutMapping("/admin/reservation/list")
    public ResponseEntity<?> updateReservationByAdmin(
            @RequestParam("reservationNo") int reservationNo,
            @RequestParam("action") String action) {
        try {
            int result = reservationService.complete(reservationNo, action);

            if (result > 0) {
                return new ResponseEntity<>("예약 처리 성공", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("예약 처리 실패", HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
