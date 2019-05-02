import { Directive, Renderer2, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appNavigate]'
})
export class NavigateDirective {

  constructor(private renderer: Renderer2, private elementRef: ElementRef) { }

  @HostListener('mouseclick') onclick() {
    //this.renderer.removeClass(this.elementRef.nativeElement, 'fas fa-plus');
    //this.renderer.addClass(this.elementRef.nativeElement, 'fas fa-times');
    this.renderer.setStyle(this.elementRef.nativeElement, 'background-color', 'green');
  }
}
