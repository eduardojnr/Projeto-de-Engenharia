import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

//Screens
import { LoginComponent } from './screens/login/login.component';
import { CadastroComponent } from './screens/cadastro/cadastro.component'
import { RecuperacaoSenhaComponent } from './screens/recuperacao-senha/recuperacao-senha.component';
import { TelaInicialComponent } from './screens/tela-inicial/tela-inicial.component';
import { SecretariaComponent } from './screens/perfil/secretaria/secretaria.component';

//Componentes
import { MenuSimplesComponent } from './components/menu-simples/menu-simples.component';
import { SplashScreenComponent } from './components/splash-screen/splash-screen.component';
import { PesquisadorComponent } from './screens/perfil/pesquisador/pesquisador.component';
import { ProtocolosComponent } from './screens/funcionalidades/protocolos/protocolos.component';
import { AtualizarCadastroComponent } from './screens/funcionalidades/atualizar-cadastro/atualizar-cadastro.component';
import { TestScreensComponent } from './screens/test-screens/test-screens.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'cadastro', component: CadastroComponent },
  { path: '', component: LoginComponent },
  { path: 'recovery', component: RecuperacaoSenhaComponent },
  { path: 'home', component: TelaInicialComponent },
  { path: 'splash', component: SplashScreenComponent },
  { path: 'pesquisador', component: PesquisadorComponent },
  { path: 'protocolos', component: ProtocolosComponent },
  { path: 'atualizarCadastro', component: AtualizarCadastroComponent },
  { path: 'test', component: TestScreensComponent },
  { path: 'secretaria', component: SecretariaComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
