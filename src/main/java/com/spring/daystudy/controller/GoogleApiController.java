package com.spring.daystudy.controller;

import com.spring.daystudy.service.GoogleApiServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;

/**
 * packageName    : com.spring.daystudy.controller
 * fileName       : GoogleApiController
 * author         : Sora
 * date           : 2024-07-21
 * description    : 구글 api 연동
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-21        Sora       최초 생성
 */
@RequiredArgsConstructor
@RestController
public class GoogleApiController {

    private final GoogleApiServiceImpl googleApiService;

    @GetMapping("/googleapi")
    public void getGoogleSheet() throws IOException,GeneralSecurityException {
        googleApiService.getGoogleSheet();
    }
}
