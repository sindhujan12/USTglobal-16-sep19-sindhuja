import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';

import { LoginComponent } from './student/login/login.component';
import { LibloginComponent } from './librarian/liblogin/liblogin.component';
import { AdmloginComponent } from './admin/admlogin/admlogin.component';
import { from } from 'rxjs';
import { HttpClientModule } from '@angular/common/http';
import { RegstudentComponent } from './admin/regstudent/regstudent.component';

import { AdminhomeComponent } from './admin/adminhome/adminhome.component';
import { ReglibrarianComponent } from './admin/reglibrarian/reglibrarian.component';
import { DeletelibrarianComponent } from './admin/deletelibrarian/deletelibrarian.component';
import { DeletestudentComponent } from './admin/deletestudent/deletestudent.component';
import { LibhomeComponent } from './librarian/libhome/libhome.component';
import { StudhomeComponent } from './student/studhome/studhome.component';
import { AddbookComponent } from './librarian/addbook/addbook.component';
import { MybooksComponent } from './student/mybooks/mybooks.component';
import { BooksComponent } from './student/books/books.component';
import { GetallbookComponent } from './librarian/getallbook/getallbook.component';
import { IssuebookComponent } from './librarian/issuebook/issuebook.component';
import { ReturnbookComponent } from './librarian/returnbook/returnbook.component';
import { HomeComponent } from './home/home.component';
import { AuthGuard } from './auth.guard';
import { SearchComponent } from './student/search/search.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    LoginComponent,
    LibloginComponent,
    AdmloginComponent,
    RegstudentComponent,
    AdminhomeComponent,
    ReglibrarianComponent,
    DeletelibrarianComponent,
    DeletestudentComponent,
    LibhomeComponent,
    StudhomeComponent,
    AddbookComponent,
    MybooksComponent,
    BooksComponent,
    GetallbookComponent,
    IssuebookComponent,
    ReturnbookComponent,
    HomeComponent,
    SearchComponent
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path : 'search', component : SearchComponent},
      {path : 'studentlogin', component : LoginComponent},
      {path : 'librarylogin', component : LibloginComponent},
      {path : 'adminlogin', component : AdmloginComponent},
      {path : 'registerStudent', component : RegstudentComponent},
      {path : 'adminHome', component : AdminhomeComponent},
      {path : 'registerlibrarian', component : ReglibrarianComponent},
      {path : 'deletelibrarian', component : DeletelibrarianComponent},
      {path : 'deletestudent', component : DeletestudentComponent},
      {path : 'studenthome', component : StudhomeComponent},
      {path : 'libhome', component : LibhomeComponent},
      {path : 'mybooks', component : MybooksComponent},
      {path : 'books', component : BooksComponent},
      {path : 'addbook', component : AddbookComponent},
      {path : 'getallbook', component : GetallbookComponent},
      {path : 'issuebook', component : IssuebookComponent},
      {path : 'returnbook', component : ReturnbookComponent},
      {path : '', component : HomeComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
