import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http';
import { authInterceptorProviders } from './helper/auth.interceptor';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './screens/login/login.component';
import { CadastroComponent } from './screens/cadastro/cadastro.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

//Material Modules
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatSelectModule } from '@angular/material/select';
import { MatDialogModule } from '@angular/material/dialog';
import { MatProgressBarModule } from '@angular/material/progress-bar';
import { MatChipsModule } from '@angular/material/chips'

import { RecuperacaoSenhaComponent } from './screens/recuperacao-senha/recuperacao-senha.component';

import { MenuSimplesComponent } from './components/menu-simples/menu-simples.component';
import { TelaInicialComponent } from './screens/tela-inicial/tela-inicial.component';
import { ToolbarLogadoComponent } from './components/toolbar-logado/toolbar-logado.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { DialogComponent } from './screens/cadastro/dialog/dialog.component';
import { SplashScreenComponent } from './components/splash-screen/splash-screen.component';
import { MensagemComponent } from './components/mensagem/mensagem.component';
import { DialogLoginComponent } from './screens/login/dialog-login/dialog-login.component';
import { PesquisadorComponent } from './screens/perfil/pesquisador/pesquisador.component';
import { AtualizarCadastroComponent } from './screens/funcionalidades/atualizar-cadastro/atualizar-cadastro.component';
import { ProtocolosComponent } from './screens/funcionalidades/protocolos/protocolos.component'

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CadastroComponent,
    RecuperacaoSenhaComponent,
    MenuSimplesComponent,
    TelaInicialComponent,
    ToolbarLogadoComponent,
    DialogComponent,
    SplashScreenComponent,
    MensagemComponent,
    DialogLoginComponent,
    PesquisadorComponent,
    AtualizarCadastroComponent,
    ProtocolosComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatCardModule,
    MatButtonModule,
    MatFormFieldModule,
    MatIconModule,
    ReactiveFormsModule,
    FormsModule,
    MatInputModule,
    MatGridListModule,
    MatDatepickerModule,
    MatSelectModule,
    MatToolbarModule,
    MatDialogModule,
    MatProgressBarModule,
    MatChipsModule
  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
