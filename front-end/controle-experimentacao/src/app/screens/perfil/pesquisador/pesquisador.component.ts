import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pesquisador',
  templateUrl: './pesquisador.component.html',
  styleUrls: ['./pesquisador.component.scss']
})
export class PesquisadorComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  reloadPageAtualizacao(): void {
    this.router.navigate(['/atualizarCadastro'])
      .then(() => {
        window.location.reload();
      });
  }

  reloadPageProtocolo(): void {
    this.router.navigate(['/protocolos'])
      .then(() => {
        window.location.reload();
      });
  }
}
