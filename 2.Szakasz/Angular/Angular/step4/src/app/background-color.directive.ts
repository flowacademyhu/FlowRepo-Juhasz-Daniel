import { Directive, Renderer2, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appBackgroundColor]'
})

export class BackgroundColorDirective {

  constructor(private renderer: Renderer2, private elementRef: ElementRef) {
  }

  @HostListener('mouseover') onmouseover() {
    this.renderer.setStyle(this.elementRef.nativeElement, 'background-color', 'blue');
  }

  @HostListener('mouseleave') onmouseleave() {
    this.renderer.setStyle(this.elementRef.nativeElement, 'background-color', 'white');
  }

}
