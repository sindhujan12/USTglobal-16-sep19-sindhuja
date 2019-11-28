import { Directive, ElementRef, HostBinding, HostListener } from "@angular/core";








@Directive({
    selector :'[custDir]'
})




export class CustomDirective {
    constructor(private el: ElementRef){
        this.el.nativeElement.style.backgroundColor = 'red';
    }
    @HostBinding('style.backgroundColor') backgroundColor ='yellow';
    @HostListener('mouseenter') m(){
        this.el.nativeElement.style.backgroundColor ='yellow';
    
    }
    @HostListener('mouseleave') n(){
        this.el.nativeElement.style.backgroundColor ='blue';
}
}