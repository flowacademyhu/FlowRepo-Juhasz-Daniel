import { Directive, HostListener, Renderer2, ElementRef } from '@angular/core';

@Directive({
  selector: '[appColor]'
})
export class ColorDirective {

  constructor(private renderer: Renderer2, private elementRef: ElementRef) { }

  @HostListener('mouseover') onmouseenter() {
    this.renderer.setStyle(this.elementRef.nativeElement, 'background-color', 'green');
  }

  @HostListener('mouseleave') onmouseleave() {
    this.renderer.setStyle(this.elementRef.nativeElement, 'background-color', null);
  }
}
