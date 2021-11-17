import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UsuarioService } from 'src/app/autenticacao/usuario/usuario.service';
import { RetornaService } from 'src/app/service/retorna.service';

@Component({
  selector: 'app-toolbar-logado-funcionalidades',
  templateUrl: './toolbar-logado-funcionalidades.component.html',
  styleUrls: ['./toolbar-logado-funcionalidades.component.scss']
})
export class ToolbarLogadoFuncionalidadesComponent implements OnInit {


  user$ = this.usuarioService.retornaUsuario();

  constructor(
    private usuarioService: UsuarioService,
    private router: Router,
    private retorna: RetornaService
    ) { }

  logout() {
    this.usuarioService.logout();
    this.router.navigate(['']);
  }

  back(): void {
    this.retorna.back()
  }

  ngOnInit(): void {
  }

}
