import { HttpClientModule, HttpHeaders, HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { environment } from 'src/environments/environment';
import { Pesquisador } from '../model/Pesquisador.model';

@Injectable({
  providedIn: 'root'
})
export class PesquisadorService {
  private URL = environment.url;
  private httpOptions = {
    headers: new HttpHeaders({
        'Content-Type': 'application/json',
    })
  };

  constructor(private httpClient: HttpClient) { }

  create(pesquisador: Pesquisador): Observable<Pesquisador> {
    return this.httpClient.post<any>(this.URL + '/pesquisadores/pesquisador', JSON.stringify(pesquisador), this.httpOptions)
        .pipe(
            catchError(this.handleError)
        );
  }
  private handleError(error: HttpErrorResponse) {
    return throwError(error.error);
}

}
