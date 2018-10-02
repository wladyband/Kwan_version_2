import { NgModule } from '@angular/core';
import { CommonModule, DecimalPipe } from '@angular/common';
import { DashboardComponent } from './dashboard/dashboard.component';
import { SharedModule } from './../shared/shared.module';
import { DashboardRoutingModule } from './dashboard-routing.module';
import { PanelModule } from 'primeng/panel';
import { ChartModule } from 'primeng/chart';


@NgModule({
  imports: [
  CommonModule,
    SharedModule,
    DashboardRoutingModule,
    PanelModule,
    ChartModule
  ],
  declarations: [DashboardComponent],
  providers: [ DecimalPipe ]
})
export class DashboardModule { }
