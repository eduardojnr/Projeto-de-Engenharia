import { Injectable } from '@angular/core';
import { Subject, Subscription } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SplashScreenStateService {

  subject = new Subject();

  subscribe (onNext: any): Subscription {
    return this.subject.subscribe (onNext);
  }

  stop () {
    this.subject.next(false);
  }

  constructor() { }
}
