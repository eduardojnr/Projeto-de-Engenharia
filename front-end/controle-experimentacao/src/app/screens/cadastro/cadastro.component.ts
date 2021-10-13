import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { PesquisadorService } from 'src/app/service/pesquisador.service';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.scss']
})
export class CadastroComponent implements OnInit {

  // validar email
  email = new FormControl('', [Validators.required, Validators.email]);

  getErrorMessage() {
    if (this.email.hasError('rquired')) {
      return 'Email invalido, favor digitar novamente';
    }
    return this.email.hasError('email') ? 'Email invalido, favor digitar novamente' : '';
  }

  hide = true;

  constructor(
    public pesquisadorService: PesquisadorService
  ) { }

  ngOnInit(): void {
  }

}

export class GridListOverviewExample {}
export class DatepickerOverviewExample {}
