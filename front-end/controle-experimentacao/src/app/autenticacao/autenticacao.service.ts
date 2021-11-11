import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { tap } from 'rxjs/operators';
import { UsuarioService } from './usuario/usuario.service';

@Injectable({
  providedIn: 'root'
})
export class AutenticacaoService {

  constructor (
    private httpClient: HttpClient,
    private usuarioService: UsuarioService
    ) { }
  autenticar (username: string, senha: string): Observable<HttpResponse<any>> {
    return this.httpClient.post('https://safe-beach-16522.herokuapp.com/https://sceapp01.herokuapp.com/login/', {
      username: username,
      senha: senha,
    },
    { observe: 'response' }
    ).pipe (
      tap ((res) => {
        const authToken = res.headers.get('x-acess-token') ?? '';
        this.usuarioService.salvaToken(authToken);
      })
    )
  }
}
