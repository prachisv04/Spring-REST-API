package com.rest.VideoPlayer.controller;

import com.rest.VideoPlayer.service.VideoPlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
@RestController
@RequestMapping("/video")
public class VideoPlayerController {
    private final VideoPlayerService videoPlayerService;

    public VideoPlayerController(VideoPlayerService videoPlayerService) {
        this.videoPlayerService = videoPlayerService;
    }

    @GetMapping("/stream/{fileType}/{fileName}")
    public Mono<ResponseEntity<byte[]>> streamVideo(ServerHttpResponse serverHttpResponse, @RequestHeader(value = "Range", required = false) String httpRangeList,
                                                    @PathVariable("fileType") String fileType,
                                                    @PathVariable("fileName") String fileName) {
        return Mono.just(videoPlayerService.prepareContent(fileName, fileType, httpRangeList));
    }
}
