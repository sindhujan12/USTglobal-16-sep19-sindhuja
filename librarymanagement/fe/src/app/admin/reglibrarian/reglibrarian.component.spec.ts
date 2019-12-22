import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReglibrarianComponent } from './reglibrarian.component';

describe('ReglibrarianComponent', () => {
  let component: ReglibrarianComponent;
  let fixture: ComponentFixture<ReglibrarianComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReglibrarianComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReglibrarianComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
