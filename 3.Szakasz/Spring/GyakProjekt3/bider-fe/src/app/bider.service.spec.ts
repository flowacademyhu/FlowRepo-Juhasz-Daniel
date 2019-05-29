import { TestBed } from '@angular/core/testing';

import { BiderService } from './bider.service';

describe('BiderService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BiderService = TestBed.get(BiderService);
    expect(service).toBeTruthy();
  });
});
