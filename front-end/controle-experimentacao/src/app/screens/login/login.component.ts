import { Component, OnInit } from '@angular/core';
import { PesquisadorService } from 'src/app/service/pesquisador.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  hide = true;

  constructor(
    public pesquisadorService: PesquisadorService
    ) { }

  ngOnInit(): void {
  }

}

export class GridListOverviewExample {}
