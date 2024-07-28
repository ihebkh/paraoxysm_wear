import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { BillboardComponent } from './billboard/billboard.component';
import { FeaturedProductsComponent } from './featured-products/featured-products.component';
import { LatestCollectionComponent } from './latest-collection/latest-collection.component';
import { SubscribeComponent } from './subscribe/subscribe.component';
import { SellingProductsComponent } from './selling-products/selling-products.component';
import { TestimonialsComponent } from './testimonials/testimonials.component';
import { FlashSalesComponent } from './flash-sales/flash-sales.component';
import { ShoppifySectionBannerComponent } from './shoppify-section-banner/shoppify-section-banner.component';
import { QuotationComponent } from './quotation/quotation.component';
import { LatestBlogComponent } from './latest-blog/latest-blog.component';
import { BrandCollectionComponent } from './brand-collection/brand-collection.component';
import { InstagramComponent } from './instagram/instagram.component';
import { ShippingInformationComponent } from './shipping-information/shipping-information.component';
import { FooterBottomComponent } from './footer-bottom/footer-bottom.component';
import { AcceuilComponent } from './acceuil/acceuil.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    BillboardComponent,
    FeaturedProductsComponent,
    LatestCollectionComponent,
    SubscribeComponent,
    SellingProductsComponent,
    TestimonialsComponent,
    FlashSalesComponent,
    ShoppifySectionBannerComponent,
    QuotationComponent,
    LatestBlogComponent,
    BrandCollectionComponent,
    InstagramComponent,
    ShippingInformationComponent,
    FooterBottomComponent,
    AcceuilComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
