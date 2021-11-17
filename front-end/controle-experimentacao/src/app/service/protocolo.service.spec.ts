import { TestBed } from '@angular/core/testing';

import { ProtocoloService } from './protocolo.service';

describe('ProtocoloService', () => {
  let service: ProtocoloService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProtocoloService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
