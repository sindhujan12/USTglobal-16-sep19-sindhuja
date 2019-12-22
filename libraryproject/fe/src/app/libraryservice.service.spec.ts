import { TestBed } from '@angular/core/testing';

import { LibraryserviceService } from './libraryservice.service';

describe('LibraryserviceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LibraryserviceService = TestBed.get(LibraryserviceService);
    expect(service).toBeTruthy();
  });
});
