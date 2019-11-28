import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
  inputData: any;
  printAlertMsg() {
    alert('Hai Hello From Angular');
}

dataInput(event: any) {

  console.log(event.target.value);
  this.inputData = event.target.value;
}
  constructor() { }

  ngOnInit() {}
  }



