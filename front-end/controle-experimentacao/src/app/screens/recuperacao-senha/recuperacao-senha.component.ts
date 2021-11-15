import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-recuperacao-senha',
  templateUrl: './recuperacao-senha.component.html',
  styleUrls: ['./recuperacao-senha.component.scss']
})
export class RecuperacaoSenhaComponent implements OnInit {

  email = new FormControl('', [Validators.required, Validators.email]);
  recoveryForm!: FormGroup;
  public showSplash: boolean = false;

  constructor() { }

  ngOnInit(): void {
  }

  recuperar () {
    console.log("hello")
  }

  getErrorMessage() {
    if (this.email.hasError('rquired')) {
      return 'Email invalido, favor digitar novamente';
    }
    return this.email.hasError('email') ? 'Email invalido, favor digitar novamente' : '';
  }

}
