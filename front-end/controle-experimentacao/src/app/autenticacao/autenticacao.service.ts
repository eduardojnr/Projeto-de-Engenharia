import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AutenticacaoService {

  constructor(private httpClient: HttpClient) { }
  autenticar(username: string, senha: string): Observable<HttpResponse<any>> {
    return this.httpClient.post('https://safe-beach-16522.herokuapp.com/https://sceapp01.herokuapp.com/login/', {
      username: username,
      senha: senha
    },
    { observe: 'response' }
    );
  }
}
