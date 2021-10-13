import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuSimplesComponent } from './menu-simples.component';

describe('MenuSimplesComponent', () => {
  let component: MenuSimplesComponent;
  let fixture: ComponentFixture<MenuSimplesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MenuSimplesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MenuSimplesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
