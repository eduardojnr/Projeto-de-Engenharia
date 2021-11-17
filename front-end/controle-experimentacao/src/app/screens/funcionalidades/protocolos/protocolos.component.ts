import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { NovoProtocolo } from 'src/app/objects/novo-protocolo';
import { NovoProtocoloService } from 'src/app/service/novo-protocolo.service';
import { ProtocoloService } from 'src/app/service/protocolo.service';

@Component({
  selector: 'app-protocolos',
  templateUrl: './protocolos.component.html',
  styleUrls: ['./protocolos.component.scss']
})
export class ProtocolosComponent implements OnInit {

  protocoloForm!: FormGroup;

  constructor(
    private protocoloService: ProtocoloService,
    private formBuilder: FormBuilder,
    private router: Router,
    private novoProtocoloService: NovoProtocoloService
    ) { }

  ngOnInit(): void {
    this.protocoloForm = this.formBuilder.group ({
      dataInicio: [''],
      dataFim: [''],
      justificativa: [''],
      nomeDocente: ['debora'],
      resumoEn: [''],
      resumoPt: [''],
      status: ['ativo']
    })
  }

  cadastrarProtocolo() {
    if (this.protocoloForm.valid) {
      const novoProtocolo = this.protocoloForm.getRawValue() as NovoProtocolo;
      this.novoProtocoloService.cadastraNovoProtocolo(novoProtocolo).subscribe(() => {
        this.router.navigate(['/protocolos'])
      })
      console.log("protocolo cadastrado com sucesso");
      console.log(novoProtocolo);
    }
  }

  // recuperarProtocolos(): void {
  //   this.protocoloService.getAll()
  // }

}
