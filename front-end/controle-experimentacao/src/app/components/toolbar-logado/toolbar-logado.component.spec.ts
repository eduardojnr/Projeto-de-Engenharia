import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ToolbarLogadoComponent } from './toolbar-logado.component';

describe('ToolbarLogadoComponent', () => {
  let component: ToolbarLogadoComponent;
  let fixture: ComponentFixture<ToolbarLogadoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ToolbarLogadoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ToolbarLogadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
