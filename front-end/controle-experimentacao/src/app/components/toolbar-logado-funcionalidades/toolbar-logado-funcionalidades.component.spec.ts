import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ToolbarLogadoFuncionalidadesComponent } from './toolbar-logado-funcionalidades.component';

describe('ToolbarLogadoFuncionalidadesComponent', () => {
  let component: ToolbarLogadoFuncionalidadesComponent;
  let fixture: ComponentFixture<ToolbarLogadoFuncionalidadesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ToolbarLogadoFuncionalidadesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ToolbarLogadoFuncionalidadesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
