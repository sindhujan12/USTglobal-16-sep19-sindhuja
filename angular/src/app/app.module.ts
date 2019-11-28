import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './navbar/navbar.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { TwoWayComponent } from './data-binding/two-way/two-way.component';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { DirectivesComponent } from './directives/directives.component';
import { StructComponent } from './directives/struct/struct.component';
import { NgifComponent } from './directives/struct/ngif/ngif.component';
import { NgforComponent } from './directives/struct/ngfor/ngfor.component';
import { NgswitchComponent } from './directives/struct/ngswitch/ngswitch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { Form1Component } from './form1/form1.component';
import { AssignmentComponent } from './assignment/assignment.component';
import { Form2Component } from './form2/form2.component';
import { Form3Component } from './form3/form3.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { DollarPipe } from './dollar.pipe';
// import { ParentComponent } from './parent/parent.component';
// import { ChildComponent } from './child/child.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    LoginComponent,
    NavbarComponent,
    FooterComponent,
    EventBindingComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    TwoWayComponent,
    DirectivesComponent,
    StructComponent,
    NgifComponent,
    NgforComponent,
    NgswitchComponent,
    CustomDirective,
    RegisterComponent,
    Form1Component,
    AssignmentComponent,
    Form2Component,
    Form3Component,
    ReactiveFormComponent,
    DollarPipe,
    // ParentComponent,
    // ChildComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'home', component: HomeComponent},
      {path : 'about', component: AboutComponent},
      {path : 'help', component: HelpComponent},
      {path : 'login', component: LoginComponent},
       {path : 'property-binding',component: PropertyBindingComponent},
       {path : 'event-binding', component: EventBindingComponent},
       {path : 'two-way',component : TwoWayComponent},
       {path : 'ngif',component : NgifComponent},
       {path : 'ngfor', component : NgforComponent},
       {path : 'ngswitch', component : NgswitchComponent},
       {path : 'register', component : RegisterComponent},
       {path : 'reactive-form', component : ReactiveFormComponent},
      //  {path : 'parent', component : ParentComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
