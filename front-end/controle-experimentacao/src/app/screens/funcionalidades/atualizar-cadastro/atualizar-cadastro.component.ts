import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-atualizar-cadastro',
  templateUrl: './atualizar-cadastro.component.html',
  styleUrls: ['./atualizar-cadastro.component.scss']
})
export class AtualizarCadastroComponent implements OnInit {

  // public showSplash: boolean = false;


  // validar email
  email = new FormControl('', [Validators.required, Validators.email]);


  getErrorMessage() {
    if (this.email.hasError('rquired')) {
      return 'Email invalido, favor digitar novamente';
    }
    return this.email.hasError('email') ? 'Email invalido, favor digitar novamente' : '';
  }

  hide = true;

  constructor() { }

  ngOnInit(): void {
  }

}
