import { TestBed } from '@angular/core/testing';

import { PesquisadorService } from './pesquisador.service';

describe('PesquisadorService', () => {
  let service: PesquisadorService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PesquisadorService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
