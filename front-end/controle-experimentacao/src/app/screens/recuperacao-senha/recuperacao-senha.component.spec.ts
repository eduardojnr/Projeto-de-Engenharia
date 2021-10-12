import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RecuperacaoSenhaComponent } from './recuperacao-senha.component';

describe('RecuperacaoSenhaComponent', () => {
  let component: RecuperacaoSenhaComponent;
  let fixture: ComponentFixture<RecuperacaoSenhaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RecuperacaoSenhaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RecuperacaoSenhaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
