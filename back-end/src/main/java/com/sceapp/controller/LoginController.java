package com.sceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sceapp.domain.DadosLogin;
import com.sceapp.domain.Usuario;
import com.sceapp.services.LoginService;
import io.swagger.annotations.ApiOperation;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	//Login de um usuário
	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ApiOperation(value="Login de um usuário")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> loginUsuario(@RequestBody DadosLogin dados) {
		Usuario obj = null;
		try {
			obj = loginService.authenticate(dados);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok().body(obj);
	}
}
