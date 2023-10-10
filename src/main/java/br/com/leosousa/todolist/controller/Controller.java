package br.com.leosousa.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class Controller {

  @GetMapping("/success")
  public String message() {
    return "Funcionou :)";
  }
}
