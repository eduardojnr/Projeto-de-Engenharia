import { TestBed } from '@angular/core/testing';

import { NovoProtocoloService } from './novo-protocolo.service';

describe('NovoProtocoloService', () => {
  let service: NovoProtocoloService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NovoProtocoloService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
