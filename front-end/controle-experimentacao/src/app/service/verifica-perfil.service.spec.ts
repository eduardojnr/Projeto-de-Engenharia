import { TestBed } from '@angular/core/testing';

import { VerificaPerfilService } from './verifica-perfil.service';

describe('VerificaPerfilService', () => {
  let service: VerificaPerfilService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(VerificaPerfilService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
