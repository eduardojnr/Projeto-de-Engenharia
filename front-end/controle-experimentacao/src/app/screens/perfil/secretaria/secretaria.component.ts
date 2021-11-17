import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-secretaria',
  templateUrl: './secretaria.component.html',
  styleUrls: ['./secretaria.component.scss']
})
export class SecretariaComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  reloadPageAtualizacao(): void {
    this.router.navigate(['/atualizarCadastro'])
      .then(() => {
        window.location.reload();
      });
  }

}
