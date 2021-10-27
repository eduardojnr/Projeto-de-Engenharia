import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { NovoUsuario } from '../objects/novo-usuario';

@Injectable({
  providedIn: 'root'
})
export class NovoUsuarioService {

  constructor(private http: HttpClient) { }

  cadastraNovoUsuario(novoUsuario: NovoUsuario) {
    return this.http.post('https://safe-beach-16522.herokuapp.com/https://sceapp01.herokuapp.com/usuarios/usuario/', novoUsuario);
  }
}
