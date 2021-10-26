import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'aplication/json', 'Access-Control-Allow-Origin': '*' })
};

@Injectable({
  providedIn: 'root'
})
export class AutenticacaoService {

  constructor(private httpClient: HttpClient) { }
  autenticar(username: string, senha: string): Observable<any> {
    let obj = {
      username: username,
      senha: senha
    }
    return this.httpClient.post('https://safe-beach-16522.herokuapp.com/https://sceapp01.herokuapp.com/usuarios/', JSON.stringify(obj),httpOptions)
  }
}
