package com.board.demo.controller;

import com.board.demo.entity.Board;
import com.board.demo.repository.BoardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1")
public class BoardController {
    @Autowired
    BoardRepository boardRepository;

    @PostMapping("/board")
    public ResponseEntity<?> saveAnswerSave(@RequestBody Board board) {
        boardRepository.save(board);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/boards")
    public ResponseEntity<?> saveAnswerSave() {
        return new ResponseEntity<>(boardRepository.findAll(), HttpStatus.OK);
    }

}
