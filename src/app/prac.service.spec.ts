import { TestBed } from '@angular/core/testing';

import { PracService } from './prac.service';

describe('PracService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PracService = TestBed.get(PracService);
    expect(service).toBeTruthy();
  });
});
