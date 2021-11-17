import { TestBed } from '@angular/core/testing';

import { RetornaService } from './retorna.service';

describe('RetornaService', () => {
  let service: RetornaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RetornaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
