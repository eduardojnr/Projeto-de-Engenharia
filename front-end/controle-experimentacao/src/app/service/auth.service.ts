import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const AUTH_API = 'https://sceapp01.herokuapp.com/'

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'aplication/json' })
};

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  login(username: string, senha: string): Observable<any> {
    return this.http.post(AUTH_API + 'pesquisadores/', {
      username,
      senha
    }, httpOptions);
  }

  cadastro(
    usertipo: string,
    username: string,
    cpf: string,
    email: string,
    datanasc: string,
    sexo: string,
    senha: string,
    campoDeAtuacao: string,
    ): Observable<any> {
    return this.http.post(AUTH_API + '', {
      usertipo,
      username,
      cpf,
      email,
      datanasc,
      sexo,
      senha,
      campoDeAtuacao
    }, httpOptions);
  }
}
