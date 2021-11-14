import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TestScreensComponent } from './test-screens.component';

describe('TestScreensComponent', () => {
  let component: TestScreensComponent;
  let fixture: ComponentFixture<TestScreensComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TestScreensComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TestScreensComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
