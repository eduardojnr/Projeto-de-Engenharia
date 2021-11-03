import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { AutenticacaoService } from 'src/app/autenticacao/autenticacao.service';
import { AuthService } from '../../service/auth.service';
import { TokenStorageService } from '../../service/token-storage.service';
import { MatDialog } from '@angular/material/dialog';
import { DialogLoginComponent } from './dialog-login/dialog-login.component';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  hide = true;

  username = '';
  senha = '';
  tipoDePerfil = '';

  // user: any = {
  //   username: '',
  //   senha: '',
  // }

  constructor(
    private authService: AutenticacaoService,
    private router: Router,
    public dialog: MatDialog
    ) {}

  ngOnInit(): void { }

  login() {
    this.authService.autenticar(this.username, this.senha).subscribe(() => {
      console.log("login autorizado");
      if (this.tipoDePerfil == 'pesquisador') {
        this.router.navigate(['home']);
        console.log('pesquisador logou')
      }
      if (this.tipoDePerfil == 'secretaria') {
        this.router.navigate(['home']);
        console.log('secretaria logou')
      }
    },
    (error) => {
      this.dialog.open(DialogLoginComponent);
      console.log("login não autorizado");
      console.log(error);
    })
  }


  // form: any = {
  //   username: null,
  //   senha: null
  // };
  // isLoggedIn = false;
  // isLoginFailed = false;
  // errorMessage = '';
  // roles: string[] = [];

  // constructor(private authService: AuthService, private tokenStorage: TokenStorageService, private router: Router) { }

  // ngOnInit(): void {
  //   if (this.tokenStorage.getToken()) {
  //     this.isLoggedIn = true;
  //     this.roles = this.tokenStorage.getUser().roles;
  //   }
  // }

  // onSubmit(): void {
  //   const { username, senha } = this.form;

  //   this.authService.login(username, senha).subscribe(
  //     data => {
  //       this.tokenStorage.saveToken(data.accessToken);
  //       this.tokenStorage.saveUser(data);

  //       this.isLoginFailed = false;
  //       this.isLoggedIn = true;
  //       this.roles = this.tokenStorage.getUser().roles;
  //       this.reloadPage();
  //     },
  //     err => {
  //       this.errorMessage = err.error.message;
  //       this.isLoginFailed = true;
  //     }
  //   );
  // }

  // reloadPage(): void {
  //   window.location.reload();
  // }
}

export class GridListOverviewExample {}
