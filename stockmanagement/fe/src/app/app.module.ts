import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { FormsModule,ReactiveFormsModule} from '@angular/forms';
import { HeaderComponent } from './header/header.component';
import { HttpClientModule } from '@angular/common/http';
import { AddProductDetailsComponent } from './add-product-details/add-product-details.component';
import { UpdateProductComponent } from './update-product/update-product.component';
import { SearchNameComponent } from './search-name/search-name.component';
import { SearchCategoryComponent } from './search-category/search-category.component';
import { SearchCompanyComponent } from './search-company/search-company.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddProductDetailsComponent,
    UpdateProductComponent,
    SearchNameComponent,
    SearchCategoryComponent,
    SearchCompanyComponent,
      ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path:'add',component:AddProductDetailsComponent},
      {path:'update',component:UpdateProductComponent},
      {path:'name',component:SearchNameComponent},
      {path:'category',component:SearchCategoryComponent},
      {path:'company',component:SearchCompanyComponent},
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
