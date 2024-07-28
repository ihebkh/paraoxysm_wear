import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShoppifySectionBannerComponent } from './shoppify-section-banner.component';

describe('ShoppifySectionBannerComponent', () => {
  let component: ShoppifySectionBannerComponent;
  let fixture: ComponentFixture<ShoppifySectionBannerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShoppifySectionBannerComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShoppifySectionBannerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
