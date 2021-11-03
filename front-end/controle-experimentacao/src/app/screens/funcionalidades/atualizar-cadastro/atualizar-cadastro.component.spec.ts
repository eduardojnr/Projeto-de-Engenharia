import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AtualizarCadastroComponent } from './atualizar-cadastro.component';

describe('AtualizarCadastroComponent', () => {
  let component: AtualizarCadastroComponent;
  let fixture: ComponentFixture<AtualizarCadastroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AtualizarCadastroComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AtualizarCadastroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
