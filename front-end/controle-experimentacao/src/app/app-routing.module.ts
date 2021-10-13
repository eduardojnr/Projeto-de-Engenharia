import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

//Screens
import { LoginComponent } from './screens/login/login.component';
import { CadastroComponent } from './screens/cadastro/cadastro.component'
import { RecuperacaoSenhaComponent } from './screens/recuperacao-senha/recuperacao-senha.component';
import { TelaInicialComponent } from './screens/tela-inicial/tela-inicial.component';

//Componentes
import { MenuSimplesComponent } from './components/menu-simples/menu-simples.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'cadastro', component: CadastroComponent },
  { path: '', component: LoginComponent },
  { path: 'recovery', component: RecuperacaoSenhaComponent },
  { path: 'home', component: TelaInicialComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
