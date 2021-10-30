import { Injectable } from '@angular/core';
import {
  Router, Resolve,
  RouterStateSnapshot,
  ActivatedRouteSnapshot,
  ActivatedRoute
} from '@angular/router';
import { Observable, of } from 'rxjs';
import { SplashScreenStateService } from '../service/splash-screen-state.service';

@Injectable({
  providedIn: 'root'
})
export class ResolverResolver implements Resolve<any> {

  constructor (
    private splashScreenStateService: SplashScreenStateService
  ) {}

  public resolve (route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Promise<Observable<any>> {
    return new Promise ((resolve, reject) => {
      setTimeout (() => {
        this.splashScreenStateService.stop();
        resolve(of(['item1', 'item2']));
      }, 5000);
    });
  }
}
