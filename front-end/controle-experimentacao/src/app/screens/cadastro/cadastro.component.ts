import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { NovoUsuarioService } from 'src/app/service/novo-usuario.service';
import { PesquisadorService } from 'src/app/service/pesquisador.service';
import { NovoUsuario } from 'src/app/objects/novo-usuario';
import { Router } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { DialogComponent } from './dialog/dialog.component';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.scss']
})
export class CadastroComponent implements OnInit {

  // startDate = new Date(1990, 0, 1);

  cadastroForm!: FormGroup;
  public showSplash: boolean = false;

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
    private formBuilder: FormBuilder,
    private novoUsuarioService: NovoUsuarioService,
    public pesquisadorService: PesquisadorService,
    private router: Router,
    public dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.cadastroForm = this.formBuilder.group({
      nome: [''],
      username: [''],
      senha: [''],
      email: [''],
      cpf: [''],
      nascimento: [''],
      sexo: [''],
      tipoDePerfil: ['pesquisador']
    })
  }

  cadastrar() {
    if (this.cadastroForm.valid) {
      this.showSplash = true;
      const novoUsuario = this.cadastroForm.getRawValue() as NovoUsuario;
      this.novoUsuarioService.cadastraNovoUsuario(novoUsuario).subscribe(() => {
        // this.reloadPage();
        this.dialog.open(DialogComponent)
        this.router.navigate(['']);
      })
      console.log("usuário cadastrado com sucesso");
      console.log(novoUsuario);

    }

  }

  reloadPage(): void {
    window.location.reload();
  }

}

export class GridListOverviewExample {}
export class DatepickerOverviewExample {}
export class CadastroDialog {}
