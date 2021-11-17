import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NovoProtocolo } from '../objects/novo-protocolo';



@Injectable({
  providedIn: 'root'
})
export class NovoProtocoloService {

  constructor(private http: HttpClient) { }

  cadastraNovoProtocolo (novoProtocolo: NovoProtocolo) {
    return this.http.post('https://safe-beach-16522.herokuapp.com/https://sceapp01.herokuapp.com/protocolos/protocolo', novoProtocolo);
  }
}
