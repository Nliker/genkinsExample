package com.example.main;

import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
  @GetMapping("/ping")
  public ResponseEntity<Map<String,String>> ping(){
    Map<String,String> result=new HashMap<>();
    result.put("result","pong2");
    return ResponseEntity.ok().body(result);
  }

  @GetMapping("/test")
  public ResponseEntity<Map<String,String>> test(){
    Map<String,String> result=new HashMap<>();
    result.put("result","test");
    return ResponseEntity.ok().body(result);
  }
}