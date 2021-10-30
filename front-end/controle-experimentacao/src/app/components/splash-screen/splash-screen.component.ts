import { Component, OnInit, ViewEncapsulation } from '@angular/core';
// import { SplashScreenStateService } from 'src/app/service/splash-screen-state.service';{}

@Component({
  selector: 'app-splash-screen',
  templateUrl: './splash-screen.component.html',
  styleUrls: ['./splash-screen.component.scss'],
  encapsulation: ViewEncapsulation.None
})

export class SplashScreenComponent implements OnInit {

  // public opacityChange = 1;
  // public splashTransition: any;
  // readonly ANIMATION_DURATION = 1;

  // private hideSplashAnimation () {
  //   this.splashTransition = `opacity ${this.ANIMATION_DURATION}s`;
  //   this.opacityChange = 0;

  //   setTimeout (() => {
  //     this.showSplash = !this.showSplash;
  //   }, 1000);
  // }



  windowWidth!: string;
  showSplash: boolean = true;

  constructor(
    // private splashScreenStateService: SplashScreenStateService
  ) { }

  ngOnInit(): void {

    // this.splashScreenStateService.subscribe(() => {
    //   this.hideSplashAnimation();
    // });

    setTimeout (() => {
      this.windowWidth = '-' + window.innerWidth + 'px';
      setTimeout (() => {
        this.showSplash = !this.showSplash;
      }, 500);
    }, 3000);
  }

}
