import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UsuarioService } from 'src/app/autenticacao/usuario/usuario.service';

@Component({
  selector: 'app-toolbar-logado',
  templateUrl: './toolbar-logado.component.html',
  styleUrls: ['./toolbar-logado.component.scss']
})
export class ToolbarLogadoComponent implements OnInit {

  user$ = this.usuarioService.retornaUsuario();

  constructor(
    private usuarioService: UsuarioService,
    private router: Router
    ) { }

  logout() {
    this.usuarioService.logout();
    this.router.navigate(['']);
  }

  ngOnInit(): void {
  }

}
