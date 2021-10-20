import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AutenticacaoService {

  constructor(private httpClient: HttpClient) { }
  autenticar(user: string, senha: string): Observable<any> {
    return this.httpClient.post('https://sceapp01.herokuapp.com/pesquisadores/', {
      username: user,
      senha: senha
    })
  }
}
