package com.sceapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sceapp.domain.Pedido;
import com.sceapp.services.PedidoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/pedidos")
@Api(value="PEDIDOS")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	//Retorna uma lista de pedidos
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ApiOperation(value="Retorna uma lista de pedidos")
	public ResponseEntity<?> listaPedidos(){
		List<Pedido> obj = pedidoService.listaPedidos();
		return ResponseEntity.ok().body(obj);
	}
	
	//Salva um pedido
	@RequestMapping(value="/pedido", method=RequestMethod.POST)
	@ApiOperation(value="Salva um pedido")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> salvaPedido(@RequestBody Pedido pedido) {
		Pedido obj = pedidoService.salvaPedido(pedido);
		return ResponseEntity.ok().body(obj);
	}
	
	//Deleta um pedido
	@RequestMapping(value="/pedido", method=RequestMethod.DELETE)
	@ApiOperation(value="Deleta um pedido")
	public void deletaUsuario(@RequestBody Pedido pedido) {
		pedidoService.deletaPedido(pedido);
	}
}
