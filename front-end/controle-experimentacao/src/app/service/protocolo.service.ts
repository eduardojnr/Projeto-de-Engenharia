import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const baseUrl = 'https://safe-beach-16522.herokuapp.com/https://sceapp01.herokuapp.com/';

@Injectable({
  providedIn: 'root'
})
export class ProtocoloService {

  constructor(private http: HttpClient) { }

  getAll(protocolos: string): Observable<any> {
    return this.http.get(`${baseUrl}/${protocolos}/`)
  }

}
